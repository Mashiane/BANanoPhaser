B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Make As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object. 
Public Sub Initialize(scne As BANanoObject, mak As BANanoObject) As PhaserMake
	Scene = scne
	Make = mak
	Return Me
End Sub

Sub text(x As Double, y As Double, txt As String, fontName As String, fillColor As String) As PhaserObject
	Dim mstyle As Map = CreateMap()
	mstyle.Put("font", fontName)
	mstyle.Put("fill", fillColor)
	Dim po As PhaserObject
	Dim bo As BANanoObject = Make.RunMethod("text", Array(x,y,txt,mstyle))
	po.Initialize(Scene, bo)
	Return po 	
End Sub