B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public Scene As PhaserScene
	Public po1 As PhaserObject
End Sub

'the game title
Sub Initialize(game As BANanoPhaser)
	Scene = game.CreateScene("PhaserGame")
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
End Sub

Sub onPreload
	Scene.load.image("sky", "./assets/space3.png")
	Scene.load.image("logo", "./assets/phaser3-logo.png")
	Scene.load.image("red", "./assets/red.png")
End Sub

Sub onCreate
	Scene.add.image(400, 300, "sky")
	Dim particles As PhaserObject = Scene.add.particles("red")
	Dim emitter As PhaserObject = Scene.ToPhaserObject(particles.createEmitter(100, 1, 0, "NORMAL"))
	Dim logo As PhaserObject = Scene.physics.add.image(400, 100, "logo")
	logo.setVelocity(100, 200)
	logo.setBounceXY(1, 1)
	logo.setCollideWorldBounds(True)
	emitter.startFollow(logo)
End Sub

Sub onUpdate
End Sub