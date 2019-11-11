B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Time As BANanoObject
	Private Scene As BANanoObject
	Private BANano As BANano
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, tmr As BANanoObject)
	Scene = scne
	Time = tmr
End Sub

Sub addEvent(delay As Double, module As Object, methodName As String, callbackScope As BANanoObject, continuosly As Boolean) As PhaserEvent
	Dim callback As BANanoObject = BANano.callback(module, methodName, Null)
	Dim opt As Map = CreateMap()
	opt.Put("delay", delay)
	opt.Put("callback", callback)
	opt.Put("callbackScope", callbackScope)
	opt.Put("loop", continuosly)
	'
	Dim bo As BANanoObject = Time.RunMethod("addEvent", opt)
	Dim pe As PhaserEvent
	pe.Initialize(Scene, bo)
	Return pe
End Sub

Sub events As PhaserEvents
	Dim eve As BANanoObject = Time.GetField("events")
	Dim po As PhaserEvents
	po.Initialize(Scene, eve)
	Return po 
End Sub