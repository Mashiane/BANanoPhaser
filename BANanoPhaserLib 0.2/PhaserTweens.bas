B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private Scene As BANanoObject
	Private Tweens As BANanoObject
	Private BANano As BANano
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, twn As BANanoObject) As PhaserTweens
	Scene = scne
	Tweens = twn
	Return Me
End Sub

'convert bananoobject to phaserobject
Sub ToPhaserObject(bo As BANanoObject) As PhaserObject
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub add(targets As PhaserObject, duration As Int, scaleX As Double, scaleY As Double, yoyo As Boolean)
	Dim opt As Map = CreateMap()
	opt.Put("targets", targets.Thing)
	opt.Put("duration", duration)
	opt.Put("scaleX", scaleX)
	opt.Put("scaleY", scaleY)
	opt.Put("yoyo",yoyo)
	Tweens.RunMethod("add", opt)
End Sub