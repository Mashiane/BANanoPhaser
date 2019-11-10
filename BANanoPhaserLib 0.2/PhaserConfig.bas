B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public title As String
	Public backgroundColor As String
	Public pixelArt As Boolean
	Public parent As String
	Public width As Int
	Public height As Int
	Public typeOf As Object
	Public scale As ConfigScale
	Public physics As ConfigPhysics
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	title = ""
	backgroundColor = ""
	pixelArt = False
	parent = ""
	width = -1
	height = -1
	typeOf = Null
	scale.Initialize 	
	physics.Initialize
	physics.arcade.Initialize 
	physics.arcade.gravity.Initialize   
End Sub

'refresh the configuration
Sub Refresh(m As Map)
	If title <> "" Then m.Put("title", title)
	If backgroundColor <> "" Then m.Put("backgroundColor", backgroundColor)
	If pixelArt Then m.Put("pixelArt", pixelArt)
	If parent <> "" Then m.Put("parent", parent)
	If width <> -1 Then m.Put("width", width)
	If height <> -1 Then m.Put("height", height)
	If typeOf <> Null Then m.Put("type", typeOf)
	'
	Dim scalem As Map = CreateMap()
	If scale.mode <> -1 Then scalem.Put("mode", scale.mode)
	If scale.autoCenter <> -1 Then scalem.Put("autoCenter", scale.autoCenter)
	m.Put("scale", scalem)
	'
	Dim marcade As Map = CreateMap()
	Dim gravity As Map = physics.arcade.gravity
	If gravity.Size > 0 Then marcade.Put("gravity", gravity)
	If physics.arcade.debug = False Then marcade.Put("debug", physics.arcade.debug)
	'
	Dim mphysics As Map = CreateMap()
	mphysics.Put("arcade", marcade)
	If physics.defaultt <> "" Then mphysics.Put("default", physics.defaultt)
	m.Put("physics", mphysics)
End Sub