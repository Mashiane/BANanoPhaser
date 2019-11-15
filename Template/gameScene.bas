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
End Sub

Sub onUpdate
End Sub