B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private BANano As BANano  'ignore
	Public game As BANanoObject
	'
	Private mconfig As Map
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
	Public const ScaleAutoCenterCENTER_BOTH As Int = 1
	Public const ScaleAutoCenterCENTER_HORIZONTALLY As Int = 2
	Public const ScaleAutoCenterCENTER_VERTICALLY As Int = 3
	
	Private scenes As List
	Private Phaser As BANanoObject
	Public config As PhaserConfig
	Public TypeOf_WEBGL As Object
	Public TypeOf_AUTO As Object
	Public TypeOf_CANVAS As Object
	'
	public TimerSecond
	
End Sub

'Initializes the phaser object
Public Sub Initialize As BANanoPhaser
	Phaser.Initialize("Phaser")
	TypeOf_WEBGL = Phaser.GetField("WEBGL")
	TypeOf_AUTO = Phaser.GetField("AUTO")
	TypeOf_CANVAS = Phaser.GetField("CANVAS")
	config.Initialize
	mconfig = CreateMap()
	mscene = CreateMap()
	mconfig.Put("scene", mscene)
	scenes.Initialize
	Return Me
End Sub

'get the window inner width
Sub getWindowInnerWidth As Double
	Dim iw As Double = BANano.Window.InnerWidth
	Return iw
End Sub

'get the window inner height
Sub getWindowInnerHeight As Double
	Dim ih As Double = BANano.Window.InnerHeight
	Return ih
End Sub

'set a scene to the game
Sub addScene(gs As PhaserScene) As BANanoPhaser
	scenes.Add(gs.Scene)
	mconfig.Put("scene", scenes)
	Return Me
End Sub

'create the game using config
Sub Start
	config.Refresh(mconfig)
	game.Initialize2("Phaser.Game", mconfig)
End Sub

'create a new scene
Sub CreateScene(sceneName As String) As PhaserScene
	Dim ps As PhaserScene
	ps.Initialize(sceneName)
	Return ps 
End Sub
