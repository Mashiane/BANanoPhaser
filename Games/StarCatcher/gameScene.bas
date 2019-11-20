B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public Scene As PhaserScene
	Private BANano As BANano
	Private platforms As PhaserObject
	Private player As PhaserObject
	Private cursors As PhaserCursorKeys
	Private stars As PhaserObject
	Private score As Int = 0
	Private scoreText As PhaserObject
	Private gameOver As Boolean = False
	Private bombs As PhaserObject
End Sub

'the game title
Sub Initialize(game As BANanoPhaser)
	'create a scene and give it a unique key
	Scene = game.CreateScene("GameScene")
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
End Sub

Sub onPreload
End Sub

Sub onCreate
	'add a simple background for your game
	Scene.add.image(400, 300, "sky")
	'a group of ledgers we can jump on
	platforms = Scene.physics.add.staticGroup
	'create the ground, scale it to fir the width of the game
	'the original sprice is 400x32 in size
	Scene.ToPhaserObject(platforms.create(400, 568, "ground")).SetScale(2).RefreshBody
	'create some ledges
	platforms.create(600, 400, "ground")
	platforms.create(50, 250, "ground")
	platforms.create(750, 220, "ground")
	'add a player and its settings
	player = Scene.physics.add.sprite(100, 450, "dude")
	'player properties, give the guy some bounce
	player.setBounce(0.2)
	player.setCollideWorldBounds(True)
	'player animations
	'walk left, right, turn
	Dim left As PhaserAnimation = Scene.CreateAnimation("left")
	left.iRepeat = -1
	left.frameRate = 10
	left.frames = Scene.Anims.generateFrameNumbers("dude", 0, 3)
	Scene.Anims.create1(left)
	
	Dim turn As PhaserAnimation = Scene.CreateAnimation("turn")
	turn.frameRate = 20
	turn.frames = Array(Scene.CreateFrame("dude").SetFrame(4).ToObject)
	Scene.Anims.create1(turn)
	'
	Dim right As PhaserAnimation = Scene.CreateAnimation("right")
	right.irepeat = -1
	right.frameRate = 10
	right.frames = Scene.Anims.generateFrameNumbers("dude", 5, 8)
	Scene.Anims.create1(right)
	
	'detect key presses
	cursors = Scene.input.keyboard.createCursorKeys
	'add a group of stars
	Dim pg As PhaserGroup = Scene.creategroup("star")
	pg.irepeat = 11
	pg.setXY.x = 12
	pg.setXY.y = 0
	pg.setXY.stepX = 70
	  
	stars = Scene.physics.add.group1(pg)
	'each time a new star is added
	Dim thisChild As BANanoObject
	stars.children.iterate(Me, "addStars", thisChild)
	' add a group of bombs
	bombs = Scene.physics.add.group
	'add the score card
	scoreText = Scene.add.text(16, 16, "score: 0", CreateMap("fontSize": "32px", "fill": "#000"))

	'player can collide with the playforms i.e. ground, etc
	Scene.physics.add.collider(player, platforms)
	Scene.physics.add.collider(stars, platforms)
	Scene.physics.add.collider(bombs, platforms)

	'when a player overlaps with a star, collect the stars
	Dim thisPlayer As BANanoObject
	Dim thisStar As BANanoObject
	Dim collctStar As BANanoObject = BANano.CallBack(Me, "collectStar", Array(thisPlayer, thisStar))
	Scene.physics.add.overlap(player, stars, collctStar, Null, Scene.Scene)
	'when a player collides with a bomb, fire hitBomb
	Dim htBomb As BANanoObject = BANano.CallBack(Me, "hitBomb", Array(thisPlayer, thisStar))
	Scene.physics.add.collider1(player, bombs, htBomb, Null, Scene.scene)
End Sub

'give each star a different bounce
Sub addStars(child As BANanoObject)
	Dim btwn As Double = Scene.MathFloatBetween(0.4, 0.8)
	Dim poChild As PhaserObject = Scene.ToPhaserObject(child)
	poChild.SetBounceY(btwn)
End Sub

'a new batch of stars
Sub addStars1(child As BANanoObject)
	Dim poChild As PhaserObject = Scene.ToPhaserObject(child)
	poChild.EnableBody(True, poChild.X, 0, True, True)
End Sub


Sub collectStar(thisPlayer As BANanoObject, thisStar As BANanoObject)
	Scene.ToPhaserObject(thisStar).disableBody(True, True)
	score = score + 10
	scoreText.setText("Score: " & score)
	
	'we dont have any starts left
	If (stars.countActive(True) = 0) Then
		'add a new batch of stars
		Dim thisChild As BANanoObject
		stars.children.iterate(Me, "addStars1", thisChild)
		'add a bomb away from the player
		Dim x As Int = BANano.IIf(player.X < 400, Scene.MathBetween(400, 800), Scene.MathBetween(0, 400))
		Dim bomb As PhaserObject = Scene.ToPhaserObject(bombs.create(x, 16, "bomb"))
		bomb.setBounce(1)
		bomb.setCollideWorldBounds(True)
		bomb.setVelocity(Scene.MathBetween(-200, 200), 20)
		bomb.allowGravity = False
    End If
End Sub

'the player collided with the bomb, end the game
Sub hitBomb (thisPlayer As BANanoObject, thisBomb As BANanoObject)
    Scene.physics.pause
    player.setTint("0xff0000")
	player.anims.play("turn",Null)
    gameOver = True
End Sub

Sub onUpdate
	'detect if the game is over
	If (gameOver) Then
    	Return
    End If
	
	'detect pressed keys and move the player accordingly
	If (cursors.left.isDown) Then
		player.setVelocityX(-160)
		player.anims.play("left", True)
	else if (cursors.right.isDown) Then
		player.setVelocityX(160)
		player.anims.play("right", True)
	Else
		player.setVelocityX(0)
		player.anims.play("turn",Null)
    End If

	'jump
	If (cursors.up.isDown And player.body.touching.down) Then
		player.setVelocityY(-330)
	End If
End Sub