B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private Scene As BANanoObject
	Private Add As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, ad As BANanoObject) As PhaserAdd
	Scene = scne
	Add = ad
	Return Me
End Sub

'convert bananoobject to phaserobject
Sub ToPhaserObject(bo As BANanoObject) As PhaserObject
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

'add a collider between 1 objects
Sub collider(obj1 As PhaserObject, obj2 As PhaserObject)
	'this.physics.add.collider(player, platforms);
	Add.RunMethod("collider", Array(obj1.Thing, obj2.Thing))
End Sub

Sub sprite(x As Int, y As Int, key As String) As PhaserObject
	'game.add.sprite(0,0,“bg”);
	Dim bo As BANanoObject = Add.RunMethod("sprite", Array(x, y, key))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub

'add a group without options
Sub group As PhaserObject
	'platforms = this.physics.add.group();
	Dim bo As BANanoObject = Add.RunMethod("group", Null)
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

'add a group with options
Sub group1(key As String, irepeat As String, x As Int, y As Int, stepX As Int, immovable As Boolean) As PhaserObject
	'platforms = this.physics.add.group();
	Dim setxy As Map = CreateMap()
	setxy.Put("x", x)
	setxy.Put("y", y)
	setxy.Put("stepX", stepX)
	'
	Dim options As Map = CreateMap()
	options.Put("key", key)
	options.Put("repeat", irepeat)
	options.Put("immovable", immovable)
	options.Put("setXY", setxy)
	
	Dim bo As BANanoObject = Add.RunMethod("group", options)
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

'add a collider to scene
Sub collider1(obj1 As PhaserObject, obj2 As PhaserObject, obj3 As BANanoObject, obj4 As BANanoObject)
	'this.physics.add.collider(player, platforms);
	Add.RunMethod("collider", Array(obj1.thing, obj2.thing, obj3, obj4, Scene))
End Sub

Sub tileSprite(x As Int, y As Int, width As Int, height As Int, key As String) As PhaserObject
	Dim bo As BANanoObject = Add.RunMethod("tileSprite", Array(x, y, width, height, key))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub

'add an overlap
Sub overlap(obj1 As PhaserObject, obj2 As PhaserObject, callBackMethod As BANanoObject, obj4 As BANanoObject, context As BANanoObject)
	'this.physics.add.overlap()
	Add.RunMethod("overlap", Array(obj1.thing, obj2.thing, callBackMethod, obj4, context))
End Sub

'add a static group
Sub staticGroup As PhaserObject
	'platforms = this.physics.add.staticGroup();
	Dim bo As BANanoObject = Add.RunMethod("staticGroup", Null)
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub particles(key As String) As PhaserObject
	'var particles = this.add.particles('red');
	Dim bo As BANanoObject = Add.RunMethod("particles", Array(key))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub

Sub image(x As Int, y As Int, key As String) As PhaserObject
	'this.add.image(400, 300, 'sky');
	Dim bo As BANanoObject = Add.RunMethod("image", Array(x, y, key))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub

Sub graphics As PhaserObject
	'this.add.graphics()
	Dim bo As BANanoObject = Add.RunMethod("graphics", Null)
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub sound(key As String) As PhaserObject
	Dim bo As BANanoObject = Add.RunMethod("sound", Array(key))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub

Sub text(x As Int, y As Int, stext As String, options As Map) As PhaserObject
	'scoreText = this.add.text(16, 16, 'score: 0', { fontSize: '32px', fill: '#000' });
	Dim bo As BANanoObject = Add.RunMethod("text", Array(x, y, stext, options))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub

Sub text1(x As Int, y As Int, stext As String, fontName As String, fill As String, align As String) As PhaserObject
	Dim options As Map = CreateMap()
	options.Put("font", fontName)
	If fill <> Null Then options.Put("fill", fill)
	If align <> Null Then options.Put("align", align)
	Dim bo As BANanoObject = Add.RunMethod("text", Array(x, y, stext, options))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub
