B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private Scene As BANanoObject
	Private Add As BANanoObject
	Private BANano As BANano
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
Sub collider(obj1 As PhaserObject, obj2 As PhaserObject) As PhaserObject
	'this.physics.add.collider(player, platforms);
	Dim bo As BANanoObject = Add.RunMethod("collider", Array(obj1.Thing, obj2.Thing))
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po 
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

'add group using PhaserGroup
Sub group1(pg As PhaserGroup) As PhaserObject
	Dim options As Map = pg.ToObject
	Dim bo As BANanoObject = Add.RunMethod("group", options)
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

Sub existing(obj As PhaserObject)
	Add.RunMethod("existing", Array(obj.Thing))
End Sub

'add a collider to scene
Sub collider1(obj1 As PhaserObject, obj2 As PhaserObject, collideCallback As BANanoObject, processCallback As BANanoObject, callbackContext As BANanoObject)
	'this.physics.add.collider(player, platforms);
	Add.RunMethod("collider", Array(obj1.thing, obj2.thing, collideCallback, processCallback, callbackContext))
End Sub

Sub tileSprite(x As Int, y As Int, width As Int, height As Int, key As String) As PhaserObject
	Dim bo As BANanoObject = Add.RunMethod("tileSprite", Array(x, y, width, height, key))
	Dim po As PhaserObject = ToPhaserObject(bo)
	Return po
End Sub

'add an overlap
Sub overlap(obj1 As PhaserObject, obj2 As PhaserObject, overlapCallback As BANanoObject, processCallback As BANanoObject, callbackContext As BANanoObject)
	'this.physics.add.overlap()
	Add.RunMethod("overlap", Array(obj1.thing, obj2.thing, overlapCallback, processCallback, callbackContext))
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
