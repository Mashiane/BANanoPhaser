B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Game As BANanoObject
	Private Scene As BANanoObject
End Sub

Public Sub Initialize(scne As BANanoObject, gam As BANanoObject)
	Scene = scne
	Game = gam
End Sub

Sub canvas As PhaserCanvas
	Dim bo As BANanoObject = Game.GetField("canvas")
	Dim po As PhaserCanvas
	po.Initialize(Scene, bo)
	Return po 
End Sub