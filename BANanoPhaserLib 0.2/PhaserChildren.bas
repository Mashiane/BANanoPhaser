B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Children As BANanoObject
	Private Scene As BANanoObject
	Private BANano As BANano
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, child As BANanoObject) As PhaserChildren
	Scene = scne
	Children = child
	Return Me
End Sub


Sub iterate(module As Object, methodName As String, child As BANanoObject) As PhaserChildren
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(child))
	Children.RunMethod("iterate", cb)
	Return Me
End Sub