B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private bodY As BANanoObject
	Private Scene As BANanoObject
End Sub

Public Sub Initialize(scne As BANanoObject, bdy As BANanoObject) As PhaserBody
	Scene = scne
	bodY = bdy
	Return Me
End Sub

Sub touchingdown As Boolean
	Dim td As Boolean = bodY.GetField("touching").GetField("down").Result
	Return td
End Sub

Sub getY As Int
	Dim y As Int = bodY.GetField("y").Result
	Return y
End Sub

Sub getX As Int
	Dim x As Int = bodY.GetField("x").Result
	Return x
End Sub

Sub setImmovable(b As Boolean) As PhaserBody
	bodY.SetField("immovable", b)
	Return Me
End Sub

Sub setMoves(b As Boolean) As PhaserBody
	bodY.SetField("moves", b)
	Return Me
End Sub

Sub setVelocityX(x As Double) As PhaserBody
	bodY.RunMethod("setVelocityX", Array(x))
	Return Me
End Sub

Sub setVelocityY(y As Double) As PhaserBody
	bodY.RunMethod("setVelocityY", Array(y))
	Return Me
End Sub


Sub getVelocityX As Int
	Dim x As Int = bodY.GetField("velocity").GetField("x").Result
	Return x
End Sub

Sub getVelocityY As Int
	Dim y As Int = bodY.GetField("velocity").GetField("y").Result
	Return y
End Sub
