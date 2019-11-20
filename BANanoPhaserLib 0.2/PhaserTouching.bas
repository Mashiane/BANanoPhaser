B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Touching As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, touch As BANanoObject) As PhaserTouching
	Scene = scne
	Touching = touch
	Return Me
End Sub

Sub down As Boolean
	Dim td As Boolean = Touching.GetField("down").Result
	Return td
End Sub