B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private WebFont As BANanoObject
	Private BANano As BANano
	Private families As List
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As PhaserWebFont
	families.Initialize
	WebFont.Initialize("WebFont")
	Return Me
End Sub

Sub SetOnLoad(module As Object, methodName As String)
	Dim fam As Map = CreateMap()
	fam.Put("families", families)
	Dim opt As Map = CreateMap()
	opt.Put("google", fam)
	Dim gs As BANanoObject = BANano.CallBack(module, methodName, Null)
	opt.Put("active", gs)	
	WebFont.RunMethod("load", opt)
End Sub

Sub AddGoogleFont(fontName As String) As PhaserWebFont
	families.Add(fontName)
	Return Me
End Sub