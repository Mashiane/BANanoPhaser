B4J=true
Group=Default Group\Games
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private game As BANanoPhaser
	Private body As BANanoElement
	Private Scene As PhaserScene
	Private platforms As BANanoObject
	Private player As BANanoObject
	Private stars As BANanoObject
	Private score As Int
	Private scoreText As BANanoObject
	Private bombs As BANanoObject
	Private gameOver As Boolean
End Sub


Sub Init
	gameOver = False
	score = 0
	'set the body of the page
	body = BANano.GetElement("#body")
	body.SetStyle(BANano.ToJson(CreateMap("margin": "10px", "padding": "0", "width": "800px", "height": "600px")))
	body.Empty
	'add the div to set the game in
	'lets set up the game
	'initialze the game, use game element and set size
	game.Initialize
	'The Type can be Phaser.CANVAS, Phaser.WEBGL Or Phaser.AUTO. AUTO means that
	'Phaser will Try To render with WebGL, And fall back To Canvas If it fails
	game.SetTypeAuto(True)
	'element to inject the game in
	game.SetParent("body")
	game.SetWidth(800)
	game.SetHeight(600)
	'Ensure the canvas is resized to fit the parent div's dimensions
	'game.SetScaleMode(game.ScaleModeRESIZE)
	'Center the game canvas both horizontally and vertically within the parent
	'game.SetScaleAutoCenter(game.ScaleCenterCENTER_BOTH)
	'The physics engine determines how objects interact with the world. Phaser
	'supports three physics engines out of the box: arcade, impact and matter.
	' Arcade is understood to be the simplest one to implement
	game.SetPhysicsDefault("arcade")
	game.SetPhysicsArcadeDebug(False)
	game.SetPhysicsArcadeGravity(CreateMap("y":300))
		
	'create a scene there can be multiple scenes in the same game
	Scene = game.CreateScene("starCatcher")
	'steps in the game scene to execute
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
	game.SetScene(Scene.Scene)
	'
	game.Start
End Sub

Sub onPreload
	Scene.SceneLoadImage("sky", "./assets/sky.png")
	Scene.SceneLoadImage("ground", "./assets/platform.png")
	Scene.SceneLoadImage("star", "./assets/star.png")
	Scene.SceneLoadImage("bomb", "./assets/bomb.png")
	Scene.SceneLoadSpriteSheet("dude", "./assets/dude.png", 32, 48)
End Sub

Sub onCreate
	Scene.SceneAddImage(400, 300, "sky")
	'
	'add some platforms
	platforms = Scene.PhysicsAddStaticGroup
	Dim g1 As BANanoObject = Scene.Create(platforms, 400, 568, "ground")
	Scene.SetScale(g1, 2)
	Scene.RefreshBody(g1)
	'
	Scene.Create(platforms, 600, 400, "ground")
	Scene.Create(platforms, 50, 250, "ground")
	Scene.Create(platforms, 750, 220, "ground")
	
	'add a player
	'This creates a new sprite called player, positioned at 100 x 450 pixels from the bottom of the game. 
	'The sprite was created via the Physics Game Object Factory (this.physics.add) which means it has a Dynamic Physics body by default
	player = Scene.PhysicsAddSprite(100, 450, "dude")
	
	'After creating the sprite it is given a slight bounce value of 0.2. 
	'This means when it lands after jumping it will bounce ever so slightly.
	Scene.setBounce(player, 0.2)
	'The sprite is then set to collide with the world bounds. 
	'The bounds, by default, are on the outside of the game dimensions. 
	'As we set the game To be 800 x 600 then the player won't be able to run outside of this area. 
	'It will stop the player from being able to run off the edges of the screen or jump through the top.
	Scene.setCollideWorldBounds(player, True)
	
	'Our player animations, turning, walking left and walking right.
	'The 'left' animation uses frames 0, 1, 2 and 3 and runs at 10 frames per second. The 'repeat -1' value tells the animation to loop.
	Scene.CreateAnime("left", "dude", 10, 0, 3, -1)
	Scene.CreateAnime("turn", "dude", 20, 4, 4, Null)
	Scene.CreateAnime("right", "dude", 10, 5, 8, -1)
	'
	'trap keyboard events
	'input events
	Scene.CreateCursorKeys
	'add the stars
	'Some stars to collect, 12 in total, evenly spaced 70 pixels apart along the x axis
	stars = Scene.PhysicsAddGroup("star", 11, 12, 0, 70, False)
	'bounce the stars
	Dim child As BANanoObject
	Dim cbIterate As BANanoObject = BANano.CallBack(Me, "iterateChildren", Array(child))
	Scene.ChildrenIterate(stars, cbIterate)
	'add the score board
	scoreText = Scene.AddText(16, 16, "Score: 0", CreateMap("fontSize": "32px", "fill": "#000"))
	'add a group for bombs
	bombs = Scene.PhysicsAddGroup1
	
	
	'player collides with the platform
	Scene.PhysicsAddCollider(player, platforms)
	'stars to collide with the platforms
	Scene.PhysicsAddCollider(stars, platforms)
	'bombs collide with platforms
	Scene.PhysicsAddCollider(bombs, platforms)
	
	'when a player overlaps with a star, collect it
	Dim star As BANanoObject
	Dim plyr As BANanoObject
	Dim cbCollectStar As BANanoObject = BANano.CallBack(Me, "collectStar", Array(plyr, star))
	Scene.PhysicsAddOverlap(player, stars, cbCollectStar, Null)
	'
	'when a player overlaps with a bomb, game over
	Dim cbHitBomb As BANanoObject = BANano.CallBack(Me, "hitBomb", Array(plyr, star))
	Scene.PhysicsAddOverlap(player, bombs, cbHitBomb, Null)
End Sub

Sub AddBomb
	Dim x As Int
	'get the player position, ensure that the bombs displays away from the user
	Dim playerX As Int = Scene.GetX(player)
	'get a range we can add to
	If playerX < 400 Then
		x = game.Between(400, 800)
	Else
		x = game.Between(0, 400)
	End If
	'create the bomb
	Dim bomb As BANanoObject = Scene.Create(bombs, x, 16, "bomb")
	'velocity
	Dim vx As Int = game.Between(-200, 200)
	Scene.SetBounce(bomb, 1)
	Scene.SetCollideWorldBounds(bomb, True)
	Scene.SetVelocityXY(bomb, vx, 20)
	Scene.AllowGravity(bomb, False)
End Sub

'create a bounce
Sub iterateChildren(child As BANanoObject)
	'Give each star a slightly different bounce
	Dim by As Double = game.FloatBetween(0.4, 0.8)
	Scene.SetBounceY(child, by)
End Sub

Sub onUpdate
	If gameOver Then
		Return
	End If
	'run the game loop code
	If Scene.LeftIsDown Then
		Scene.SetVelocityX(player, -160)
		Scene.PlayAnime(player, "left", True)
	else if Scene.RightIsDown Then
		Scene.SetVelocityX(player, 160)
		Scene.PlayAnime(player, "right", True)
	Else
		Scene.SetVelocityX(player, 0)
		Scene.PlayAnime(player, "turn", Null)
	End If
	'jump
	If Scene.UpIsDown And Scene.IsBodyTouchingDown(player) Then
		Scene.SetVelocityY(player, -330)
	End If
End Sub

'quite simply the star has its physics body disabled and its parent game Object is made inactive and invisible
', which removes it from display. 
Sub collectStar(playerObj As BANanoObject, starObj As BANanoObject)
	Scene.DisableBody(starObj, True, True)
	'
	score = score + 10
	Scene.SetText(scoreText, $"Score: ${score}"$)
	'detect how many stars we have, if all are collected, create new stars and
	'add a new bomb
	'create a new batch of stars
	If Scene.CountActive(stars, True) = 0 Then
		Dim child As BANanoObject
		Dim cbIterate As BANanoObject = BANano.CallBack(Me, "newStars", Array(child))
		Scene.ChildrenIterate(stars, cbIterate)
		'
		AddBomb
	End If
End Sub
	
'child.enableBody(true, child.x, 0, true, true);
Sub newStars(child As BANanoObject)
	Dim x As Int = Scene.GetX(child)
	Scene.EnableBody(child, True, x, 0, True, True)
End Sub

Sub hitBomb(playerObj As BANanoObject, starObj As BANanoObject)
	'pause the game
	Scene.PhysicsPause
	Scene.SetTint(playerObj, "0xff0000")
	Scene.PlayAnime(playerObj, "turn", Null)
	gameOver = True
End Sub