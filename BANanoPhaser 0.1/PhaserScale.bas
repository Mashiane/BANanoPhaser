B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Scene As BANanoObject
	Private Scale As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, scle As BANanoObject) As PhaserScale
	Scene = scne
	Scale = scle
	Return Me
End Sub

Sub setScaleMode(scaleMode As Int)
	Scale.SetField("scaleMode", scaleMode)
End Sub

Sub setPageAlignVertically(b As Boolean)
	Scale.SetField("pageAlignVertically", b)
End Sub

Sub setPageAlignHorizontally(b As Boolean)
	Scale.SetField("pageAlignHorizontally", b)
End Sub

Sub setMinWidth(v As Int)
	Scale.SetField("minWidth", v)
End Sub

Sub setMinHeight(v As Int)
	Scale.SetField("minHeight", v)
End Sub

Sub setMaxHeight(v As Int)
	Scale.SetField("maxHeight", v)
End Sub

Sub setMaxWidth(v As Int)
	Scale.SetField("maxWidth", v)
End Sub
