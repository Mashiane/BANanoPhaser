B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private BANano As BANano
	Private Phaser As BANanoObject
	Public game As BANanoObject
	'
	Private mconfig As Map
	Private mphysics As Map
	Private marcade As Map
	Private mscale As Map
	Private mscene As Map
	'
	Public const ScaleManagerShowAll As Int = 2
	Public const ScaleManagerNoScale As Int = 1
	Public const ScaleManagerExactFit As Int = 0
	Public const ScaleManagerResize As Int = 3
	Public const ScaleManagerUserScale As Int = 4
	'
	Public const ScaleModeRESIZE As Int = 5
	Public const ScaleModeENVELOP As Int = 4
	Public const ScaleModeFIT As Int = 3
	Public const ScaleModeHEIGHT_CONTROLS_WIDTH As Int = 2
	Public const ScaleModeWIDTH_CONTROLS_HEIGHT As Int = 1
	Public const ScaleModeNONE As Int = 0
	'
	Public const ScaleCenterCENTER_BOTH As Int = 1
	Public const ScaleCenterCENTER_HORIZONTALLY As Int = 2
	Public const ScaleCenterCENTER_VERTICALLY As Int = 3

End Sub

'Initializes the phaser object
Public Sub Initialize()
	Phaser.Initialize("Phaser")
	
	'
	mconfig = CreateMap()
	mphysics = CreateMap()
	marcade = CreateMap()
	mscale = CreateMap()
	mscene = CreateMap()
	mphysics.Put("arcade", marcade)
	mconfig.Put("physics", mphysics)
	mconfig.Put("scale", mscale)
	mconfig.Put("scene", mscene)
End Sub

Sub GetWindowInnerWidth As Double
	Dim iw As Double = BANano.Window.InnerWidth
	Return iw
End Sub

Sub GetWindowInnerHeight As Double
	Dim ih As Double = BANano.Window.InnerHeight
	Return ih
End Sub

Sub SetScaleMode(scaleMode As Int)
	mscale.Put("mode", scaleMode)
End Sub

Sub SetScaleAutoCenter(autoCenter As Int)
	mscale.Put("autoCenter", autoCenter)
End Sub



Sub SetBackgroundColor(colour As String)
	mconfig.Put("backgroundColor", colour)
End Sub

'set a scene
Sub SetScene(gs As BANanoObject)
	mconfig.Put("scene", gs)
End Sub

Sub FloatBetween(dFrom As Double, dTo As Double) As Double
	'Phaser.Math.FloatBetween(0.4, 0.8)
	Dim dRes As Double = Phaser.GetField("Math").RunMethod("FloatBetween", Array(dFrom, dTo)).result
	Return dRes
End Sub

Sub Between(dFrom As Int, dTo As Int) As Int
	Dim dRes As Int = Phaser.GetField("Math").RunMethod("Between", Array(dFrom, dTo)).result
	Return dRes
End Sub

Sub SetParent(parentID As String)
	mconfig.Put("parent", parentID)
End Sub

'create the game
Sub Start
	game.Initialize2("Phaser.Game", mconfig)
End Sub

'create a new scene
Sub CreateScene(sceneName As String) As PhaserScene
	Dim ps As PhaserScene
	ps.Initialize(sceneName)
	Return ps 
End Sub

Sub SetWidth(width As Int)
	mconfig.Put("width", width)
End Sub

Sub SetHeight(height As Int)
	mconfig.Put("height", height)
End Sub

Sub SetTypeWebGL(b As Boolean)
	If b = False Then Return
	Dim auto As Object = Phaser.GetField("WEBGL")
	mconfig.Put("type", auto)
End Sub

Sub SetTypeAuto(b As Boolean)
	If b = False Then Return
	Dim auto As Object = Phaser.GetField("AUTO")
	mconfig.Put("type", auto)
End Sub

Sub Cstr(obj As Object) As String
	Return "" & obj
End Sub

Sub SetTypeCanvas(b As Boolean)
	If b = False Then Return
	Dim auto As Object = Phaser.GetField("CANVAS")
	mconfig.Put("type", auto)
End Sub

Sub SetPhysicsDefault(def As String)
	mphysics.Put("default", def)
End Sub

Sub SetPhysicsArcadeGravity(options As Object)
	marcade.Put("gravity", options)
End Sub

Sub SetPhysicsArcadeDebug(b As Boolean)
	marcade.Put("debug", b)
End Sub