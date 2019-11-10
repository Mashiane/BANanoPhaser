B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private camerasMain As BANanoObject
	Private Scene As BANanoObject
End Sub

'initialize the camera
Public Sub Initialize(scne As BANanoObject, obj As BANanoObject)
	camerasMain = obj.GetField("main")
	Scene = scne
End Sub

'center on
Sub CenterOn(x As Double, y As Double)
	camerasMain.RunMethod("centerOn", Array(x,y))
End Sub