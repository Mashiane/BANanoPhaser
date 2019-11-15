B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Cursors As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(scne As BANanoObject, cursorK As BANanoObject)
	Scene = scne
	Cursors = cursorK
End Sub

Sub right As PhaserKey
	Dim bo As BANanoObject = Cursors.GetField("right")
	Dim po As PhaserKey
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub left As PhaserKey
	Dim bo As BANanoObject = Cursors.GetField("left")
	Dim po As PhaserKey
	po.Initialize(Scene, bo)
	Return po 
End Sub

Sub space As PhaserKey
	Dim bo As BANanoObject = Cursors.GetField("space")
	Dim po As PhaserKey
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub down As PhaserKey
	Dim bo As BANanoObject = Cursors.GetField("down")
	Dim po As PhaserKey
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub up As PhaserKey
	Dim bo As BANanoObject = Cursors.GetField("up")
	Dim po As PhaserKey
	po.Initialize(Scene, bo)
	Return po
End Sub