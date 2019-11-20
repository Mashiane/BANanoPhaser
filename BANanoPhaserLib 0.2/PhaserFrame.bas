B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public key As String = Null
	Public frame As Int = Null
	Private Scene As BANanoObject
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(scne As BANanoObject, skey As String) As PhaserFrame
	key = skey
	Scene = scne
	Return Me
End Sub

Sub SetFrame(fr As Int) As PhaserFrame
	frame = fr
	Return Me
End Sub

Sub ToObject As Map
	Dim opt As Map = CreateMap()
	If key <> Null Then opt.Put("key", key)
	If frame <> Null Then opt.Put("frame", frame)
	Return opt
End Sub