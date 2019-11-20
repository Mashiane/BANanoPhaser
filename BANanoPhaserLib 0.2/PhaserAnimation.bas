B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Animation As BANanoObject
	Private Scene As BANanoObject
	Private BANano As BANano
	Public key As String
	Public frameRate As Int
	Public irepeat As Int
	Public frames As Object
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, anime As BANanoObject) As PhaserAnimation
	Scene = scne
	Animation = anime
	key = Null
	frameRate = Null
	irepeat = Null
	frames = Null
	Return Me
End Sub

Sub SetRepeat(rpt As Int) As PhaserAnimation
	irepeat = rpt
	Return Me
End Sub

Sub SetFrames(framesBO As Object) As PhaserAnimation
	frames = framesBO
	Return Me
End Sub

Sub SetFrame(frame As PhaserFrame) As PhaserAnimation
	Dim lst As List
	lst.Initialize
	lst.Add(frame.ToObject)
	SetFrames(lst) 
End Sub

Sub SetFrameRate(fr As Int) As PhaserAnimation
	frameRate = fr
	Return Me
End Sub

Sub ToObject As Map
	Dim opt As Map = CreateMap()
	If key <> Null Then opt.Put("key", key)
	If frameRate <> Null Then opt.Put("frameRate", frameRate)
	If irepeat <> Null Then opt.Put("repeat", irepeat)
	If frames <> Null Then opt.Put("frames", frames)
	Return opt
End Sub