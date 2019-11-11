B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Key As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(scne As BANanoObject, ky As BANanoObject)
	Scene = scne
	Key = ky
End Sub

Sub isDown As Boolean
	Dim res As Boolean = Key.GetField("isDown").Result
	Return res
End Sub