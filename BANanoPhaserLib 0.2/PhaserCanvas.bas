B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Canvas As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, canva As BANanoObject)
	Scene = scne
	Canvas = canva	
End Sub

Sub getwidth As Int
	Dim res As Int = Canvas.GetField("width").Result
	Return res
End Sub

Sub getheight As Int
	Dim res As Int = Canvas.GetField("height").Result
	Return res
End Sub