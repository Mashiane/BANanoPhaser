B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private World As BANanoObject
	Private Scene As BANanoObject
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(scne As BANanoObject, wld As BANanoObject)
	Scene = scne
	World = wld
End Sub

Sub bounds As PhaserObject
	Dim bo As BANanoObject = World.GetField("bounds")
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub SetBounds(x As Int, y As Int, width As Int, height As Int)
	World.RunMethod("setBounds", Array(x, y, width, height))
End Sub

Sub checkCollisionDown(b As Boolean)
	World.GetField("checkCollision").SetField("down", b)
End Sub
