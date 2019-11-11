B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Input As BANanoObject
	Private Scene As BANanoObject
	Private kb As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, inpt As BANanoObject)
	Scene = scne
	Input = inpt
End Sub

Sub keyboard As PhaserKeyboard
	Dim kb As BANanoObject = Input.GetField("keyboard")
	Dim po As PhaserKeyboard
	po.Initialize(Scene, kb)
	Return po
End Sub