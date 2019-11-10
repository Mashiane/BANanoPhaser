B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Physics As BANanoObject
	Public Scene As BANanoObject
	Public Add As PhaserAdd
End Sub

'Initializes the physics
Public Sub Initialize(Scne As BANanoObject, obj As BANanoObject) As PhaserPhysics
	Physics = obj
	Scene = Scne
	Dim addObj As BANanoObject = Physics.GetField("add")
	Add.Initialize(Scne, addObj)
	Return Me
End Sub

'add an overlap
Sub AddOverlap(obj1 As BANanoObject, obj2 As BANanoObject, callBackMethod As BANanoObject, obj4 As BANanoObject)
	'this.physics.add.overlap()
	Physics.GetField("add").RunMethod("overlap", Array(obj1, obj2, callBackMethod, obj4, Physics))
End Sub

'add a collider between 1 objects
Sub AddCollider(obj1 As BANanoObject, obj2 As BANanoObject)
	'this.physics.add.collider(player, platforms);
	Physics.GetField("add").RunMethod("collider", Array(obj1, obj2))
End Sub

'add a collider
Sub AddCollider5(obj1 As BANanoObject, obj2 As BANanoObject, obj3 As BANanoObject, obj4 As BANanoObject)
	'this.physics.add.collider(player, platforms);
	Physics.GetField("add").RunMethod("collider", Array(obj1, obj2, obj3, obj4, Scene))
End Sub

'add a sprite
Sub AddSprite(x As Int, y As Int, key As String) As PhaserObject
	'player = this.physics.add.sprite(100, 450, 'dude');
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("sprite", Array(x, y, key))
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

'add an image
Sub AddImage(x As Int, y As Int, key As String) As PhaserObject
	'var logo = this.physics.add.image(400, 100, 'logo');
	Dim img As BANanoObject = Physics.GetField("add").RunMethod("image", Array(x, y, key))
	Dim po As PhaserObject
	po.Initialize(Scene, img)
	Return po
End Sub

'add a static group
Sub AddStaticGroup As PhaserObject
	'platforms = this.physics.add.staticGroup();
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("staticGroup", Null)
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

'add a group with options
Sub AddGroup(key As String, irepeat As String, x As Int, y As Int, stepX As Int, immovable As Boolean) As PhaserObject
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
	
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("group", options)
	Dim po As PhaserObject
	po.Initialize(Scene, bo)
	Return po
End Sub

'pause the game
Sub Pause
	Physics.RunMethod("pause", Null)
End Sub

'resume game
Sub Resume
	Physics.RunMethod("resume", Null)
End Sub

'add a group without options
Sub AddGroup1 As PhaserObject
	'platforms = this.physics.add.group();
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("group", Null)
	Dim po As PhaserObject
	po.Initialize(Scene, bo) 
	Return po
End Sub
