B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Sound As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, snd As BANanoObject) As PhaserSound
	Scene = scne
	Sound = snd
	Return Me
End Sub

Sub add(key As String) As PhaserObject
	Dim obj As BANanoObject = Sound.RunMethod("add", Array(key))
	Dim po As PhaserObject
	po.Initialize(Scene, obj)
	Return po 
End Sub
