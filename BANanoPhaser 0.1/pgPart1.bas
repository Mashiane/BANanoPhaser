B4J=true
Group=Default Group
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
	Private graphics As PhaserObject
End Sub


Sub Init
	'set the body of the page
	body = BANano.GetElement("#body")
	body.SetStyle(BANano.ToJson(CreateMap("margin": "0px", "background":"#000", "width": "800px", "height": "600px")))
	body.Empty
	
	game.Initialize
	game.SetTypeAuto(True)
	game.SetParent("body")
	game.SetWidth(800)
	game.SetHeight(600)
	game.SetTitle("Part 1 of Phaser")
	
	Scene = game.CreateScene("part1")
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
	game.SetScene(Scene.Scene)
	'
	game.Start
End Sub

Sub onPreload
	
End Sub

Sub onCreate
	Scene.Camera.CenterOn(0, 0)
	graphics = Scene.AddGaphics
	graphics.SetFillStyle("0xff0000").SetFillCircle(0, 0, 50)
End Sub

Sub onUpdate
End Sub