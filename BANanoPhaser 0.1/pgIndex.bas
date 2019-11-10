B4J=true
Group=Default Group\Games
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private body As BANanoElement
	Private game As BANanoPhaser
	Private platforms As BANanoObject
	Private player As BANanoObject
	Private stars As BANanoObject
	Private score As Int
	Private level As Int
	Private lives As Int
	Private scoreText As BANanoObject
	Private bombs As BANanoObject
	Private gameOver As Boolean
	Private gameScene As PhaserScene
	Private livesText As BANanoObject
End Sub

Sub Init
	'clear the body of the page
	body = BANano.GetElement("#body")
	body.Empty
	body.SetStyle(BANano.ToJson(CreateMap("margin":"0","padding":"0")))
	
	score = 0
	level = 1
	lives = 3
	gameOver = False
	'initialze the game, use body element and size
	game.Initialize
	game.SetParent("body")
	game.SetWidth(800)
	game.SetHeight(600)
	
	'use webGL and fallback to the canvas
	game.SetTypeAuto(True)
	game.SetPhysicsDefault("arcade")
	game.SetPhysicsArcadeGravity(CreateMap("y":300))
	game.SetPhysicsArcadeDebug(False)
	
	'create a scene
	gameScene = game.CreateScene("starcatcher")
	
	'steps in the game for a scene
	gameScene.SetOnPreload(Me, "onPreLoad")
	gameScene.SetOnCreate(Me, "onCreate")
	gameScene.SetOnUpdate(Me, "onUpdate")
	gameScene.SetOnShutDown(Me, "onShutDown")
	game.SetScene(gameScene.Scene)
	game.Start
	'
End Sub


Sub onShutDown
End Sub

Sub onCreate
	'A simple background for our game
	gameScene.SceneAddImage(400, 300, "sky")
	'The platforms group contains the ground and the 2 ledges we can jump on
	platforms = gameScene.PhysicsAddStaticGroup
	'Here we create the ground.
	'Scale it To fit the width of the game (the original sprite Is 400x32 in size)
	Dim p1 As BANanoObject = gameScene.CreateInstance(platforms, 400, 568, "ground")
	gameScene.SetScale(p1, 2)
	gameScene.RefreshBody(p1)
	'Now let's create some ledges
	gameScene.CreateInstance(platforms, 600, 400, "ground")
	gameScene.CreateInstance(platforms, 50, 250, "ground")
	gameScene.CreateInstance(platforms, 750, 220, "ground")
	'The player and its settings
	player = gameScene.PhysicsAddSprite(100, 450, "dude")
	'Player physics properties. Give the little guy a slight bounce.
	gameScene.SetBounce(player, 0.2)
	'treat boundaries as walls
	gameScene.SetCollideWorldBounds(player, True)
	'Our player animations, turning, walking left and walking right.
	gameScene.CreateAnime("left", "dude", 10, 0, 3, -1)
	gameScene.CreateAnime("turn", "dude", 20, 4, 4, Null)
	gameScene.CreateAnime("right", "dude", 10, 5, 8, -1)
	'input events
	gameScene.CreateCursorKeys
	'Some stars to collect, 12 in total, evenly spaced 70 pixels apart along the x axis
	stars = gameScene.PhysicsAddGroup("star", 11, 12, 0, 70, False)
	'
	Dim child As BANanoObject
	Dim cbIterate As BANanoObject = BANano.CallBack(Me, "iterateChildren", Array(child))
	gameScene.ChildrenIterate(stars, cbIterate)
	'add bombs
	bombs = gameScene.PhysicsAddGroup1
	'The score
	scoreText = gameScene.SceneAddText(16,16, "Level: 1 - Lives: 3 - Score: 0", CreateMap("fontSize":"32px", "fill": "#000"))
	'Checks to see if the player overlaps with any of the stars, if he does call the collectStar function
	gameScene.PhysicsAddCollider(player, platforms)
	gameScene.PhysicsAddCollider(stars, platforms)
	'same with bomb collision
	gameScene.PhysicsAddCollider(bombs, platforms)
	
	'when a player collides with a star, collect it
	Dim star As BANanoObject
	Dim plyr As BANanoObject
	Dim cbCollectStar As BANanoObject = BANano.CallBack(Me, "collectStar", Array(plyr, star))
	gameScene.PhysicsAddOverlap(player, stars, cbCollectStar, Null)
	'
	Dim cbHitBomb As BANanoObject = BANano.CallBack(Me, "hitBomb", Array(plyr, star))
	gameScene.PhysicsAddOverlap(player, bombs, cbHitBomb, Null)
	
End Sub

Sub collectStar(playerObj As BANanoObject, starObj As BANanoObject)
	gameScene.DisableBody(starObj, True, True)
	'update the score
	score = score + 10
	Dim newText As String = $"Level: ${level} - Lives: ${lives} - Score: ${score}"$
	gameScene.SetText(scoreText, newText)
	
	'create a new batch of stars
	If gameScene.CountActive(stars, True) = 0 Then
		level = level + 1
		lives = lives + 1
		'
		newText = $"Level: ${level} - Lives: ${lives} - Score: ${score}"$
		gameScene.SetText(scoreText, newText)
		
		Dim child As BANanoObject
		Dim cbIterate As BANanoObject = BANano.CallBack(Me, "newStars", Array(child))
		gameScene.ChildrenIterate(stars, cbIterate)
		'
		Dim x As Int
		Dim playerX As Int = gameScene.GetX(playerObj)
		If playerX < 400 Then 
			x = game.Between(400, 800)
		Else
			x = game.Between(0, 400)		
		End If
		'
		Dim bomb As BANanoObject = gameScene.CreateInstance(bombs, x, 16, "bomb")
		Dim vx As Int = game.Between(-200, 200)
		gameScene.SetBounce(bomb, 1)
		gameScene.SetCollideWorldBounds(bomb, True)
		gameScene.SetVelocityXY(bomb, vx, 20)
		gameScene.AllowGravity(bomb, False)
	End If
	
End Sub

	
'child.enableBody(true, child.x, 0, true, true);
Sub newStars(child As BANanoObject)
	Dim x As Int = gameScene.GetX(child)
	gameScene.EnableBody(child, True, x, 0, True, True)
End Sub


Sub hitBomb(playerObj As BANanoObject, starObj As BANanoObject)
	'decrease lives
	lives = lives - 1
	'pause the game and move the alien away from the bomb
	gameScene.PhysicsPause
	Dim newText As String = $"Level: ${level} - Lives: ${lives} - Score: ${score}"$
	gameScene.SetText(scoreText, newText)
	'
	Dim x As Int
	Dim playerX As Int = gameScene.GetX(starObj)
	If playerX < 400 Then
		x = game.Between(400, 800)
	Else
		x = game.Between(0, 400)
	End If
	gameScene.SetX(playerObj, x)
	gameScene.PhysicsResume
	'
	If lives <= 0 Then
		gameOver = True
		gameScene.PhysicsPause
		gameScene.SetTint(playerObj, "0xff0000")
		gameScene.PlayAnime(playerObj, "turn", Null)
		'reload the page
		BANano.Location.Reload(True)
	End If
End Sub


Sub iterateChildren(child As BANanoObject)
	'Give each star a slightly different bounce
	Dim by As Double = game.FloatBetween(0.4, 0.8)
	gameScene.SetBounceY(child, by)
End Sub

Sub onPreLoad
	'scale the game
	gameScene.SetScaleMode(game.ScaleManagerShowAll)  'scale and keep aspect ratio
	gameScene.SetScalePageAlignHorizontally(True)
	gameScene.SetScalepageAlignVertically(True)
	'
	'gameScene.SetStageBackgroundColor("#eee")
	' 
	'load needed assets
	gameScene.SceneLoadImage("bomb", "./assets/bomb.png")
	gameScene.SceneLoadImage("ground", "./assets/platform.png")
	gameScene.SceneLoadImage("sky", "./assets/sky.png")
	gameScene.SceneLoadImage("star", "./assets/star.png")
	gameScene.SceneLoadSpriteSheet("dude", "./assets/dude.png", 32, 48)
End Sub


Sub onUpdate
	If gameOver Then
		Return
	End If
	
	'run the game loop code
	If gameScene.LeftIsDown Then
		gameScene.SetVelocityX(player, -160)
		gameScene.PlayAnime(player, "left", True)
	else if gameScene.RightIsDown Then
		gameScene.SetVelocityX(player, 160)
		gameScene.PlayAnime(player, "right", True)
	Else
		gameScene.SetVelocityX(player, 0)
		gameScene.PlayAnime(player, "turn", Null)
	End If
	'jump
	If gameScene.UpIsDown And gameScene.IsBodyTouchingDown(player) Then
		gameScene.SetVelocityY(player, -330)
	End If
End Sub