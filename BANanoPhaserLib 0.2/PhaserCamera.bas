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

'center on
Sub centerOn(x As Double, y As Double)
	Camera.RunMethod("centerOn", Array(x,y))
End Sub

Sub startFollow(source As PhaserObject, b As Boolean, offsetX As Double, offsetY As Double)
	Camera.RunMethod("startFollow", Array(source.thing,b, offsetX, offsetY))
End Sub


Sub setBounds(x As Int, y As Int, width As Double, height As Double)
	Camera.RunMethod("setBounds", Array(x,y, width, height))
End Sub
