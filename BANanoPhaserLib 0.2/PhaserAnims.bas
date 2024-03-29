﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private Scene As BANanoObject
	Private Anims As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, anim As BANanoObject) As PhaserAnims
	Scene = scne
	Anims = anim
	Return Me
End Sub

Sub add(key As String, animations As List, v1 As Int, v2 As Boolean)
	Anims.RunMethod("add", Array(key, animations, v1, v2))
End Sub

'create an animation
Sub Create(key As String, spriteName As String, frameRate As Int, startFrame As Int, endFrame As Int, irepeat As Object)
	Dim anime As Map = CreateMap()
	anime.Put("key", key)
	anime.Put("frameRate", frameRate)
	If irepeat <> Null Then
		anime.Put("repeat", irepeat)
	End If
	If startFrame = endFrame Then
		Dim options As Map = CreateMap()
		options.Put("key", spriteName)
		options.Put("frame", startFrame)
		Dim lframes As List
		lframes.Initialize2(Array(options))
		anime.Put("frames", lframes)
	Else
		Dim bframes As BANanoObject = generateFrameNumbers(spriteName, startFrame, endFrame)
		anime.Put("frames", bframes)
	End If
	'
	Anims.RunMethod("create", anime)
End Sub

'create an animation using phaseranimation
Sub create1(anime As PhaserAnimation)
	Dim opt As Map = anime.ToObject
	Anims.RunMethod("create", opt)
End Sub

'generate frame numbers
Sub generateFrameNumbers(spriteName As String, startFrame As Int, endFrame As Int) As BANanoObject
	Dim options As Map = CreateMap()
	options.Put("start", startFrame)
	options.Put("end", endFrame)
	Dim bo As BANanoObject = Anims.RunMethod("generateFrameNumbers", Array(spriteName, options))
	Return bo
End Sub

' player.anims.play('left', true);
Sub play(anime As String, b As Boolean)
	If b = Null Then
		Anims.RunMethod("play", Array(anime))
	Else
		Anims.RunMethod("play", Array(anime, b))
	End If
End Sub
