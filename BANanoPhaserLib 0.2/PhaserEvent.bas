B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Event As BANanoObject
	Private Scene As BANanoObject
	Private BANano As BANano
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, evnt As BANanoObject) As PhaserEvent
	Scene = scne
	Event = evnt
	Return Me
End Sub

Sub reset(delay As Double, module As Object, methodName As String, callbackScope As BANanoObject, continuosly As Boolean)
	Dim callback As BANanoObject = BANano.callback(module, methodName, Null)
	Dim opt As Map = CreateMap()
	opt.Put("delay", delay)
	opt.Put("callback", callback)
	opt.Put("callbackScope", callbackScope)
	opt.Put("loop", continuosly)
	'
	Event.RunMethod("reset", opt)
End Sub

Sub setPaused(b As Boolean)
	Event.SetField("paused", b)
End Sub