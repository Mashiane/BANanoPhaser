B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public TitleScene As PhaserScene
	Public background1 As PhaserObject
	Public background2 As PhaserObject
	Public background3 As PhaserObject
	Public background4 As PhaserObject
	Public background5 As PhaserObject
	Public ground As PhaserObject
	Public logo As PhaserObject
	Public play As PhaserObject
End Sub

'the game title
Sub Initialize(game As BANanoPhaser)
	TitleScene = game.CreateScene("TitleScene")
	TitleScene.SetOnPreload(Me, "onPreLoad")
	TitleScene.SetOnCreate(Me, "onCreate")
	TitleScene.SetOnUpdate(Me, "onUpdate")
End Sub

'create the welcome screen to also start the game
Sub onPreload
	TitleScene.load.image("logo", "./assets/logo.png")
	TitleScene.load.image("play", "./assets/play.png")
	TitleScene.load.image("background1", "./assets/plx-1.png")
	TitleScene.load.image("background2", "./assets/plx-2.png")
	TitleScene.load.image("background3", "./assets/plx-3.png")
	TitleScene.load.image("background4", "./assets/plx-4.png")
	TitleScene.load.image("background5", "./assets/plx-5.png")
	TitleScene.load.image("platform", "./assets/platform.png")
End Sub

Sub onCreate
	'add the trees one behind another
	background1 = TitleScene.add.tileSprite(400, 300, 800, 600, "background1")
	background2 = TitleScene.add.tileSprite(400, 300, 800, 600, "background2")
	background3 = TitleScene.add.tileSprite(400, 300, 800, 600, "background3")
	background4 = TitleScene.add.tileSprite(400, 300, 800, 600, "background4")
	background5 = TitleScene.add.tileSprite(400, 300, 800, 600, "background5")
	
	'add a platform
	ground = TitleScene.add.tileSprite(400, 568, 800, 100, "platform")
	TitleScene.physics.add.existing(ground)
	ground.body.Immovable = True
	ground.body.Moves = False
	'add the game logo
	logo = TitleScene.add.image(400, 180, "logo")
	logo.setScale(1.5)
	'add a play button
	play = TitleScene.add.image(400, 400, "play")
	play.setScale(4)
	play.setInteractive()
	'detect events on the play button
	play.on("pointerdown", Me, "StartTheGame", Null)
	play.on("pointerover", Me, "SetTintOver", Null)
	play.on("pointerout", Me, "SetTintOut", Null)
	
End Sub

'scroll the trees as we move along
Sub onUpdate
	background1.IncrtilePositionX(10)
	background2.IncrtilePositionX(10)
	background3.IncrtilePositionX(10)
	background4.IncrtilePositionX(10)
	background5.IncrtilePositionX(10)
	ground.IncrtilePositionX(10)
End Sub

'start the game on a particular scene
Sub StartTheGame
	TitleScene.Start("GameScene")
End Sub

Sub SetTintOver
	play.settint("0xcccccc")
End Sub

Sub SetTintOut
	play.setTint("0xffffff")
End Sub