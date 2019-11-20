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
	Private BANano As BANano
End Sub

'the game title
Sub Initialize(game As BANanoPhaser)
	Scene = game.CreateScene("PreloadScene")
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
End Sub

Sub onPreload
	Dim value As Double
	Dim onloadCB As BANanoObject = BANano.CallBack(Me, "onProgress", Array(value))
	Scene.load.on("progress", onloadCB)
	'
	Dim onCompleteCB As BANanoObject = BANano.CallBack(Me, "onComplete", Null)
	Scene.load.on("complete", onCompleteCB)
	
	'load needed resources
	Scene.load.image("sky", "./assets/sky.png")
	Scene.load.image("ground", "./assets/platform.png")
	Scene.load.image("star", "./assets/star.png")
	Scene.load.image("bomb", "./assets/bomb.png")
	Scene.load.spritesheet("dude", "./assets/dude.png", 32, 48)
End Sub

Sub onCreate
End Sub

Sub onUpdate
End Sub

Sub onProgress(value As Double)
	'show percent load here and do other things
	Dim perc As String = Scene.Percentage(value)
	Dim strVal As String = Scene.Cstr(perc) & "%"
End Sub

Sub onComplete
	'clean up and scene start
	Scene.Start(gameScene.Scene.name)
End Sub
