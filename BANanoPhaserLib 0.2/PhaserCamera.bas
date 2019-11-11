B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Camera As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, cmr As BANanoObject) As PhaserCamera
	Scene = scne
	Camera = cmr
	Return Me
End Sub

Sub setBackgroundColor(color As String) As PhaserCamera
	Camera.RunMethod("setBackgroundColor", Array(color))
	Return Me
End Sub

'center on
Sub centerOn(x As Double, y As Double) As PhaserCamera
	Camera.RunMethod("centerOn", Array(x,y))
	Return Me
End Sub

Sub startFollow(source As PhaserObject, b As Boolean, offsetX As Double, offsetY As Double) As PhaserCamera
	Camera.RunMethod("startFollow", Array(source.thing,b, offsetX, offsetY))
	Return Me
End Sub


Sub setBounds(x As Int, y As Int, dwidth As Double, dheight As Double) As PhaserCamera
	Camera.RunMethod("setBounds", Array(x,y, dwidth, dheight))
	Return Me
End Sub

Sub getwidth As Int
	Return Camera.GetField("width").result
End Sub

Sub getheight As Int
	Return Camera.GetField("height").result
End Sub