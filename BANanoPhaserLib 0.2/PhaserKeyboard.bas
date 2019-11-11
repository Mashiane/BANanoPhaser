B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private KeyBoard As BANanoObject
	Private Scene As BANanoObject
End Sub

Public Sub Initialize(scne As BANanoObject, kb As BANanoObject)
	Scene = scne
	KeyBoard = kb
End Sub

Sub createCursorKeys As PhaserCursorKeys
	Dim bo As BANanoObject = KeyBoard.RunMethod("createCursorKeys", Null)
	Dim ck As PhaserCursorKeys
	ck.Initialize(Scene, bo)
	Return ck 
End Sub