B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Events As BANanoObject
	Private Scene As BANanoObject
	Private BANano As BANano
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(scne As BANanoObject, eves As BANanoEvent)
	Scene = scne
	Events = eves
End Sub

Sub add(timeOf As Object, module As Object, methodName As String)
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Null)
	Events.RunMethod("add", Array(timeOf, cb, Scene))
End Sub