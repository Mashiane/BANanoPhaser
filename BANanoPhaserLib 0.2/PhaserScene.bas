B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private TimeInt As BANanoObject
	Private SoundInt As BANanoObject
	Private PhysicsInt As BANanoObject
	Private AnimsInt As BANanoObject
	Public Input As BANanoObject
	Public Cursors As BANanoObject
	Public Scene As BANanoObject
	Private BANano As BANano  'ignore
	Public ScaleInt As BANanoObject
	Public World As BANanoObject
	Private LoadInt As BANanoObject
	Private AddInt As BANanoObject
	Public Game As BANanoObject
	Private Math As BANanoObject
	Private CamerasInt As BANanoObject
	Public Cameras As PhaserCameras
	Public Physics As PhaserPhysics
	Public Scale As PhaserScale
	Public Anims As PhaserAnims
	Public Load As PhaserLoad
	Public Add As PhaserAdd
	Public Sound As PhaserSound
	Public Time As PhaserTime
	Private Phaser As BANanoObject
End Sub

'Initializes the scene
Public Sub Initialize(sceneName As String)
	Phaser.Initialize("Phaser")
	Math.Initialize("Math")
	Scene.Initialize2("Phaser.Scene", Array(sceneName))
	'
	SetOnInit(Me, "getScene")
End Sub

'start this scene
Sub Start(NameOf As String)
	Scene.GetField("scene").RunMethod("start", Array(NameOf))
End Sub

'convert bananoobject to phaserobject
Sub ToPhaserObject(bo As BANanoObject) As PhaserObject
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub MathRandom() As Double
	Dim r As Double = Math.RunMethod("random", Null)
	Return r
End Sub

Sub MathAbs(v As Int) As Int
	Dim a As Int = Math.RunMethod("abs", Array(v))
	Return a
End Sub

Sub MathMax(v1 As Int, v2 As Int) As Int
	Dim r As Int = Math.RunMethod("max", Array(v1, v2))
	Return r
End Sub


Sub MathFloatBetween(dFrom As Double, dTo As Double) As Double
	'Phaser.Math.FloatBetween(0.4, 0.8)
	Dim dRes As Double = Phaser.GetField("Math").RunMethod("FloatBetween", Array(dFrom, dTo)).result
	Return dRes
End Sub

Sub MathBetween(dFrom As Int, dTo As Int) As Int
	Dim dRes As Int = Phaser.GetField("Math").RunMethod("Between", Array(dFrom, dTo)).result
	Return dRes
End Sub

private Sub GetScene
	LoadInt = Scene.GetField("load")
	AddInt = Scene.GetField("add")
	PhysicsInt = Scene.GetField("physics")
	AnimsInt = Scene.GetField("anims")
	Input = Scene.GetField("input")
	ScaleInt = Scene.GetField("scale")
	World = PhysicsInt.GetField("world")
	Game = Scene.GetField("game")
	CamerasInt = Scene.GetField("cameras")
	SoundInt = Scene.GetField("sound")
	TimeInt = Scene.GetField("time")
	Log(Scene)
	'initialize cameras.Main
	Cameras.Initialize(Scene,CamerasInt)
	'initialize the physics class
	Physics.Initialize(Scene, PhysicsInt)
	Scale.Initialize(Scene, ScaleInt)
	Anims.Initialize(Scene, AnimsInt)
	Load.Initialize(Scene, LoadInt)
	Add.Initialize(Scene, AddInt)
	Sound.Initialize(Scene, SoundInt)
	Time.Initialize(Scene, TimeInt)
End Sub

Sub configGetHeight As Int
	Dim rs As Int = Game.GetField("config").GetField("height").Result
	Return rs
End Sub

Sub configGetWidth As Int
	Dim rs As Int = Game.GetField("config").GetField("width").Result
	Return rs
End Sub

Sub getPhysicsWorldBoundsWidth As Int
	Dim dbl As Int = World.GetField("bounds").GetField("width").result
	Return dbl
End Sub

Sub getPhysicsWorldBoundsHeight As Int
	Dim dbl As Int = World.GetField("bounds").GetField("height").result
	Return dbl
End Sub

Sub PhysicsWorldSetBounds(x As Int, y As Int, width As Int, height As Int)
	World.RunMethod("setBounds", Array(x, y, width, height))
End Sub

Sub getPhysicsWorldBoundsCenterX As Double
	Dim h As Double = World.GetField("bounds").GetField("centerX").Result
	Return h
End Sub

Sub getPhysicsWorldBoundsCenterY As Double
	Dim h As Double = World.GetField("bounds").GetField("centerY").Result
	Return h
End Sub

Sub Cstr(obj As Object) As String
	Return "" & obj
End Sub

Sub SetPhysicsWorldCheckCollisionDown(b As Boolean)
	World.GetField("checkCollision").SetField("down", b)
End Sub

'createCursorKeys
Sub CreateCursorKeys
	Cursors = Input.GetField("keyboard").RunMethod("createCursorKeys", Null)
End Sub

'cursors.left.isDown
Sub LeftIsDown As Boolean
	Dim bres As Boolean = Cursors.GetField("left").GetField("isDown")
	Return bres
End Sub

Sub SpaceIsDown As Boolean
	Dim bres As Boolean = Cursors.GetField("space").GetField("isDown")
	Return bres
End Sub


'cursors.down.isDown
Sub DownIsDown As Boolean
	Dim bres As Boolean = Cursors.GetField("down").GetField("isDown")
	Return bres
End Sub

'cursors.up.isDown
Sub UpIsDown As Boolean
	Dim bres As Boolean = Cursors.GetField("up").GetField("isDown")
	Return bres
End Sub

'restart the scene
Sub restart
	Scene.RunMethod("restart", Null)
End Sub

Sub SetOnInit(module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Null)
	Scene.SetField("init", cb)
End Sub

Sub SetOnShutDown(module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Null)
	Scene.SetField("shutdown", cb)
End Sub

Sub SetOnPreload(module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Null)
	Scene.SetField("preload", cb)
End Sub

Sub SetOnCreate(module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Null)
	Scene.SetField("create", cb)
End Sub

Sub SetOnUpdate(module As Object, methodName As String)
	methodName = methodName.ToLowerCase
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Null)
	Scene.SetField("update", cb)
End Sub

'cursors.right.isDown
Sub RightIsDown As Boolean
	Dim bres As Boolean = Cursors.GetField("right").GetField("isDown")
	Return bres
End Sub
