B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public GameScene As PhaserScene
	Public background1 As PhaserObject
	Public background2 As PhaserObject
	Public background3 As PhaserObject
	Public background4 As PhaserObject
	Public background5 As PhaserObject
	Public ground As PhaserObject
	
	Public player As PhaserObject
	Public isGameOver As Boolean = False
	Public meats As PhaserObject
	Public bombs As PhaserObject
	Public characterScale As Int = 5
	Public meatScale As Int = 4
	Public bombScale As Int = 4
	Public score As Int = 0
	Public scoreText As PhaserObject
	Public gameOverText As PhaserObject
	Public timedEvent As PhaserEvent
	Public timedEvent1 As PhaserEvent
	Public music As PhaserObject
	Private BANano As BANano
	Private phaser As BANanoPhaser
	Private restart As PhaserObject
	Private gameover As PhaserObject
End Sub

Sub Initialize(game As BANanoPhaser)
	phaser = game
	GameScene = game.CreateScene("GameScene")
	GameScene.SetOnPreload(Me, "onPreLoad")
	GameScene.SetOnCreate(Me, "onCreate")
	GameScene.SetOnUpdate(Me, "onUpdate")
End Sub

Sub onPreload
	GameScene.load.image("background1", "./assets/plx-1.png")
	GameScene.load.image("background2", "./assets/plx-2.png")
	GameScene.load.image("background3", "./assets/plx-3.png")
	GameScene.load.image("background4", "./assets/plx-4.png")
	GameScene.load.image("background5", "./assets/plx-5.png")
	GameScene.load.image("platform", "./assets/platform.png")
	GameScene.load.image("restart", "./assets/restart.png")
	GameScene.load.image("gameover", "./assets/gameover.png")
	GameScene.load.image("meat", "./assets/meat.png")
	GameScene.load.spritesheet("doux", "./assets/doux.png", 23.8, 17)
	GameScene.load.spritesheet("bomb", "./assets/bombs.png", 14.5, 12)
	GameScene.load.audio("music", "./assets/music.mp3")
	GameScene.load.audio("death", "./assets/death.mp3")
	GameScene.load.audio("pickup", "./assets/pickup.wav")
End Sub

Sub onCreate
	background1 = GameScene.add.tileSprite(400, 300, 800, 600, "background1")
	background2 = GameScene.add.tileSprite(400, 300, 800, 600, "background2")
	background3 = GameScene.add.tileSprite(400, 300, 800, 600, "background3")
	background4 = GameScene.add.tileSprite(400, 300, 800, 600, "background4")
	background5 = GameScene.add.tileSprite(400, 300, 800, 600, "background5")
	'
	ground = GameScene.add.tileSprite(400, 568, 800, 100, "platform")
	GameScene.physics.add.existing(ground)
	ground.body.Immovable = True
	ground.body.Moves = False
	
	'add the dino
	player = GameScene.physics.add.sprite(100, 450, "doux")
	player.getBounds
	player.setBounce(0.2)
	player.setCollideWorldBounds(True)
	player.setScale(characterScale)
	player.setSize(13, 17, 0, 0)
	'we get to eat meats and dodge some bombs
	meats = GameScene.physics.add.group
	bombs = GameScene.physics.add.group
	'
	'add events for every 1 second and every 3 seconds
	timedEvent = GameScene.time.addEvent(1000, Me, "onEvent", GameScene.Scene, True)
    timedEvent1 = GameScene.time.addEvent(3000, Me, "onEvent1", GameScene.Scene, True)
	'play the music
	music = GameScene.sound.add("music")
	music.setLoop(True)
	music.play
	'define animation
	GameScene.Anims.Create("run", "doux", 10, 3, 9, -1)
	GameScene.Anims.Create("hurt", "doux", 10, 14, 16, -1)
	GameScene.Anims.Create("boom", "bomb", 10, 0, 3, -1)
	'create a score card
	scoreText = GameScene.add.text(16, 16, "SCORE: 0", CreateMap("fontSize": "32px", "fill": "#FFFFFF"))
	'detect collision
	GameScene.physics.add.collider(player, ground)
	GameScene.physics.add.collider(meats, ground)
	GameScene.physics.add.collider(bombs, ground)
	'on player and meat overlap, collectMeat
	Dim thisPlayer As Object
	Dim thisMeat As Object
	Dim thisBomb As Object
	Dim overlapCB As BANanoObject = BANano.callback(Me, "collectMeat", Array(thisPlayer, thisMeat))
	GameScene.physics.add.overlap(player, meats, overlapCB, Null, GameScene.Scene)
	'on player and bomb collision, fire hitBomb which ends the game
	Dim collideCB As BANanoObject = BANano.CallBack(Me, "hitBomb", Array(thisPlayer, thisBomb))
	GameScene.physics.add.collider1(player, bombs, collideCB, Null, GameScene.Scene)
	'the main camera should follow the player
	GameScene.cameras.mainC.startFollow(player, True, 0.05, 0.05)
	GameScene.cameras.mainC.setBounds(0, 0, 800, 600)
End Sub

Sub onEvent
	'every 1 second, create a piece of meat and place it randomly
	Dim dly As Int = GameScene.MathBetween(1000, 5000)
	timedEvent.reset(dly, Me, "onEvent", GameScene.scene, True)
	Dim btw As Int = GameScene.MathBetween(200, 485)
	Dim meatBO As BANanoObject = meats.create(800, btw, "meat")
	Dim meat As PhaserObject = GameScene.ToPhaserObject(meatBO)
	meat.setScale(meatScale)
	meat.setCircle(6.5)
	Dim fb As Float = GameScene.MathFloatBetween(0.6, 1.2)
	meat.setBounceY(fb)
	Dim mb As Int = GameScene.MathBetween(-1000, -300)
	meats.setVelocityX(mb)
End Sub

Sub onEvent1
	'every 3 seconds create a bomb
	Dim dly As Int = GameScene.MathBetween(3000, 5000)
	timedEvent1.reset(dly, Me, "onEvent1", GameScene.scene, True)
	Dim btw As Int = GameScene.MathBetween(300, 485)
	Dim bombBO As BANanoObject = bombs.create(800, btw, "bomb")
	Dim bomb As PhaserObject = GameScene.ToPhaserObject(bombBO)
	bomb.setScale(bombScale)
	bomb.setCircle(5)
	bomb.anims.play("boom", True)
	bomb.setBounceY(1.2)
	Dim mb As Int = GameScene.MathBetween(-1000, -300)
	bombs.setVelocityX(mb)
End Sub

'when meat is overlapping, collect it
'play the pickup sound
Sub collectMeat(cplayer As BANanoObject, cmeat As BANanoObject)
	GameScene.ToPhaserObject(cmeat).destroy
	Dim pickup As PhaserObject = GameScene.sound.add("pickup")
	pickup.play
	score = score + 100
	scoreText.setText("SCORE: " & score)
End Sub

'when a bomb is hit, end the game
'enable the user to restart
Sub hitBomb(hplayer As BANanoObject, hbomb As BANanoObject)
	GameScene.ToPhaserObject(hbomb).destroy
	music.stop
	Dim death As PhaserObject = GameScene.sound.add("death")
	death.play
	GameScene.physics.pause
	isGameOver = True
	timedEvent.paused = True
	timedEvent1.paused = True
	player.setTint("0xff0000")
	player.anims.play("hurt",Null)
	'
	restart = GameScene.add.image(400, 350, "restart")
	restart.setScale(4)
	restart.setInteractive
	'
	restart.on("pointerdown", Me, "StartTheGame", Null)
	restart.on("pointerover", Me, "SetTintOver", Null)
	restart.on("pointerout", Me, "SetTintOut", Null)
	'
	gameover = GameScene.add.image(400, 180, "gameover")
	gameover.setScale(1.2)
End Sub


Sub StartTheGame
	GameScene.Start("GameScene")
	isGameOver = False
	score = 0
End Sub

Sub SetTintOver
	restart.settint("0xcccccc")
End Sub

Sub SetTintOut
	restart.setTint("0xffffff")
End Sub

Sub onUpdate
	If isGameOver = False Then
		score = score + 1
		scoreText.setText("SCORE: " & score)
		GameScene.createcursorkeys
		player.anims.play("run", True)
		'
		If GameScene.RightIsDown Then
			player.SetVelocityx(200)
			player.flipX = False
		else if GameScene.LeftIsDown Then
			player.SetvelocityX(-260)
		Else
			player.setVelocityX(0)		
		End If
		
		If GameScene.UpIsDown And player.Body.TouchingDown Then
			player.setVelocityY(-600)
		End If
	End If
	
	background1.IncrtilePositionX(10)
	background2.IncrtilePositionX(10)
	background3.IncrtilePositionX(10)
	background4.IncrtilePositionX(10)
	background5.IncrtilePositionX(10)
	ground.IncrtilePositionX(10)
End Sub

