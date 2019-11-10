B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private Scene As BANanoObject
	Private cameras As BANanoObject
End Sub

'initialize the camera
Public Sub Initialize(scne As BANanoObject, obj As BANanoObject)
	cameras = obj
	Scene = scne
End Sub

public Sub mainC As PhaserCamera
	Dim mainCX As BANanoObject = cameras.GetField("main")
	Dim po As PhaserCamera
	po.Initialize(Scene, mainCX)
	Return po
End Sub
