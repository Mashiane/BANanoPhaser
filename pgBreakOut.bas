B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private body As BANanoElement
	Private game As BANanoPhaser
	Private gameDiv As BANanoElement
	
	'global variables
	Private player As BANanoObject
	Private ball As BANanoObject
	Private violetBricks As BANanoObject
	Private yellowBricks As BANanoObject
	Private redBricks As BANanoObject
	'
	Private gameStarted As Boolean = False
	Private openingText As BANanoObject
	Private gameOverText As BANanoObject
	Private playerWonText As BANanoObject
	'
	Private Scene As PhaserScene
	
End Sub


Sub Init
	'set the body of the page
	body = BANano.GetElement("#body")
	body.SetStyle(BANano.ToJson(CreateMap("margin":"0 auto","padding":"0","width":"100%", "height":"100%")))
	body.Empty
	'add the div to set the game in
	'we will use inline style
	gameDiv = body.Append($"<div id="game"></div>"$).Get("#game")
	gameDiv.SetStyle(BANano.ToJson(CreateMap("margin": "10px auto", "padding": "0", "width": "800px", "height": "640px")))
	'lets set up the game
	'initialze the game, use game element and set size
	game.Initialize
	'The Type can be Phaser.CANVAS, Phaser.WEBGL Or Phaser.AUTO. AUTO means that
	'Phaser will Try To render with WebGL, And fall back To Canvas If it fails
	game.SetTypeAuto(True)
	'element to inject the game in
	game.SetParent("game")
	game.SetWidth(800)
	game.SetHeight(640)
	'Ensure the canvas is resized to fit the parent div's dimensions
	game.SetScaleMode(game.ScaleModeRESIZE)
	'Center the game canvas both horizontally and vertically within the parent
	game.SetScaleAutoCenter(game.ScaleCenterCENTER_BOTH)
	'The physics engine determines how objects interact with the world. Phaser
	'supports three physics engines out of the box: arcade, impact and matter.
	' Arcade is understood to be the simplest one to implement
	game.SetPhysicsDefault("arcade")
	game.SetPhysicsArcadeGravity(False)
	
	'create a scene there can be multiple scenes in the same game
	Scene = game.CreateScene("breakout")
	'steps in the game scene to execute
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
	game.SetScene(Scene.Scene)
	'
	game.Start
End Sub
'
' The function loads assets as Phaser begins to run the Scene. The images are
' loaded as key value pairs, we reference the assets by their keys of course
 Sub onPreload
	Log("preloading...")
	Scene.SceneLoadImage("ball", "./assets/ball_32_32.png")
	Scene.SceneLoadImage("paddle", "./assets/paddle_128_32.png")
	Scene.SceneLoadImage("brick1", "./assets/brick1_64_32.png")
	Scene.SceneLoadImage("brick2", "./assets/brick2_64_32.png")
	Scene.SceneLoadImage("brick3", "./assets/brick3_64_32.png")
End Sub

'happens during the game loop phase
Sub onUpdate
	'Log("updating...")
	'check if the game is over
	Dim isOver As Boolean = isGameOver
	Dim IsWon As Boolean = isGameWon
	'
	If isOver Then
		Scene.SetVisible(gameOverText, True)
		Scene.DisableBody(ball, True, True)
	else if IsWon Then
		Scene.SetVisible(playerWonText, True)
		Scene.DisableBody(ball, True, True)
	Else
		'Put this in so that the player doesn't move if no key is being pressed
		Scene.BodySetVelocityX(player, 0)
		'check the cursor and move the velocity accordingly, with arcade we adjust velocity for movement
		'to maniputing xy values directly
		If Scene.LeftIsDown Then
			Scene.BodySetVelocityX(player, -350)
		Else if Scene.RightIsDown Then
			Scene.BodySetVelocityX(player, 350)	
		End If
		'the game starts only when the user presses the spacebar
		If gameStarted = False Then
			'the ball should follow the paddle while the user selects to start
			Dim px As Int = Scene.GetX(player)
			Scene.SetX(ball, px)
			'
			If Scene.SpaceIsDown Then
				gameStarted = True
				Scene.SetVelocityY(ball, -200)
				Scene.SetVisible(openingText, False)
			End If
		End If
	End If
End Sub

' We create our game world in this function. The initial state of our game is
' defined here. We also set up our physics rules here
' Coordinates start at 0,0 from the top left
' As we move rightward, the x value increases
' As we move downward, the y value increases.
   
Sub onCreate
	Log("creating...")
	'add a sprite
	player = Scene.PhysicsAddSprite(400, 600, "paddle")
	ball = Scene.PhysicsAddSprite(400, 565, "ball")
	'add sprite grounds
	violetBricks = Scene.PhysicsAddGroup("brick1", 9, 80, 140, 70, True)
	yellowBricks = Scene.PhysicsAddGroup("brick2", 9, 80, 90, 70, True)
	redBricks = Scene.PhysicsAddGroup("brick3", 9, 80, 40, 70, True)
	'Manage key presses
  	Scene.CreateCursorKeys
	'Ensure that the player and ball can't leave the screen
	Scene.SetCollideWorldBounds(player, True)
	Scene.SetCollideWorldBounds(ball, True)
	'The bounce ensures that the ball retains its velocity after colliding with an object.
	Scene.SetBounceXY(ball, 1, 1)
	' Disable collision with the bottom of the game world. This needs to be added so the ball falls to the bottom, which means that the game is over
	Scene.SetPhysicsWorldCheckCollisionDown(False)
	'Add collision for the bricks
	Dim currentBall As BANanoObject
	Dim currentPlayer As BANanoObject
	Dim cbHitBrick As BANanoObject = BANano.CallBack(Me, "hitBrick", Array(currentBall, currentPlayer))
	Scene.PhysicsAddCollider5(ball, violetBricks, cbHitBrick, Null, Scene.Scene)
	Scene.PhysicsAddCollider5(ball, yellowBricks, cbHitBrick, Null, Scene.scene)
	Scene.PhysicsAddCollider5(ball, redBricks, cbHitBrick, Null, Scene.scene)
	'Make the player immovable
	Scene.SetImmovable(player, True)
	'Add collision for the player
	Dim cbhitPlayer As BANanoObject = BANano.CallBack(Me, "hitPlayer", Array(currentBall, currentPlayer))
	Scene.PhysicsAddCollider5(ball, player, cbhitPlayer, Null, Scene.scene)
	'Create opening text
	Dim txtX As Int = Scene.PhysicsWorldBoundsWidth / 2
	Dim txtY As Int = Scene.PhysicsWorldBoundsHeight / 2
	'
	openingText = Scene.SceneAddText(txtX, txtY, "Press SPACE to Start", _
	CreateMap("fontFamily": "Monaco, Courier, monospace", "fontSize": "50px", "fill": "#fff"))
	'The origin of the text object is at the top left, change the origin to the center so it can be properly aligned
	Scene.SetOrigin(openingText, 0.5)
	' Create game over text
	gameOverText = Scene.SceneAddText(txtX, txtY, "Game Over", _
    CreateMap("fontFamily": "Monaco, Courier, monospace", "fontSize": "50px", "fill": "#fff"))
	Scene.SetOrigin(gameOverText, 0.5)
	'Make it invisible Until the player loses
	Scene.SetVisible(gameOverText, False)
	'Create the game won text
	playerWonText = Scene.SceneAddText(txtX, txtY, "You won!", _
    CreateMap("fontFamily": "Monaco, Courier, monospace", "fontSize": "50px", "fill": "#fff"))
	Scene.SetOrigin(playerWonText, 0.5)
	'make invisible until the player wins
	Scene.SetVisible(playerWonText, False)
End Sub

'the ball should be outside the world for the game over
Sub isGameOver As Boolean
	Dim wbh As Int = Scene.PhysicsWorldBoundsHeight
	Dim y As Int = Scene.GetBodyY(ball)
	'
	If y > wbh Then
		Return True
	Else
		Return False
	End If
End Sub

'are all the bricks hit
Sub isGameWon As Boolean
	Dim vb As Int = Scene.CountActive(violetBricks, True)
	Dim yb As Int = Scene.CountActive(yellowBricks, True)
	Dim rb As Int = Scene.CountActive(redBricks, True)
	'
	Dim allActive As Int = vb + yb + rb
	If allActive = 0 Then
		Return True
	Else
		Return False	
	End If
End Sub

'This handles the collision between a ball and a brick sprite
'In the create sub, a ball is a sprite And violetBricks, yellowBricks and redBricks are sprite groups. 
Sub hitBrick(bll As BANanoObject, bick As BANanoObject)
	Scene.DisableBody(bick, True, True)
	Dim vx As Int = Scene.getBodyVelocityX(bll)
	If vx = 0 Then
		Dim randNum As Double = Scene.random
		If randNum >= 0.5 Then
			Scene.SetBodyVelocityX(bll, 150)
		Else
			Scene.SetBodyVelocityX(bll, -150)
		End If
	End If
End Sub

'The function handles the collision between the ball and the player. We want
'To ensure that the ball's direction after bouncing off the player is based
'on which side of the player was hit. Also, To make things more difficult, we
'want To increase the ball's velocity when it's hit.

Sub hitPlayer(objBall As BANanoObject, objPlayer As BANanoObject)
	'Increase the velocity of the ball after it bounces
  	Dim vy As Int = Scene.GetBodyVelocityY(objBall)
	vy = vy - 5
	Scene.SetVelocityY(objBall, vy)
	'
	Dim newXVelocity As Int = Scene.GetBodyVelocityX(objBall)
	newXVelocity = Scene.absolute(newXVelocity)
	newXVelocity = newXVelocity + 5
	'If the ball is to the left of the player, ensure the x velocity is negative
  	Dim bx As Int = Scene.GetX(objBall)
	Dim px As Int = Scene.GetX(objPlayer)
	'
	If bx < px Then
		newXVelocity = newXVelocity * (0 - 1)
		Scene.SetVelocityX(objBall, newXVelocity)
	Else
		Scene.SetVelocityX(objBall, newXVelocity)	
	End If
End Sub	
