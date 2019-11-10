B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private Scene As BANanoObject
	Private Load As BANanoObject
End Sub

Public Sub Initialize(scne As BANanoObject, ld As BANanoObject) As PhaserLoad
	Scene = scne
	Load = ld
	Return Me
End Sub

Sub image(key As String, URL As String)
	'this.load.image('sky', 'assets/skies/space3.png');
	Load.RunMethod("image", Array(key, URL))
End Sub

Sub audio(key As String, URL As String)
	Load.RunMethod("audio", Array(key, URL))
End Sub

Sub spritesheet(key As String, URL As String, frameWidth As Double, frameHeight As Double)
	'this.load.spritesheet('dude', 'assets/dude.png', { frameWidth: 32, frameHeight: 48 });
	Dim options As Map = CreateMap()
	options.Put("frameWidth", frameWidth)
	options.Put("frameHeight", frameHeight)
	Load.RunMethod("spritesheet", Array(key, URL, options))
End Sub