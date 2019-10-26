B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public Physics As BANanoObject
End Sub

'Initializes the physics
Public Sub Initialize(bo As BANanoObject)
	Physics = bo
End Sub

Sub AddOverlap(obj1 As BANanoObject, obj2 As BANanoObject, obj3 As BANanoObject, obj4 As BANanoObject, obj5 As BANanoObject)
	'this.physics.add.overlap()
	Physics.GetField("add").RunMethod("overlap", Array(obj1, obj2, obj3, obj4, obj5))
End Sub

Sub AddCollider(obj1 As BANanoObject, obj2 As BANanoObject)
	'this.physics.add.collider(player, platforms);
	Physics.GetField("add").RunMethod("collider", Array(obj1, obj2))
End Sub

Sub AddSprite(x As Int, y As Int, key As String) As BANanoObject
	'player = this.physics.add.sprite(100, 450, 'dude');
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("sprite", Array(x, y, key))
	Return bo
End Sub

Sub AddImage(x As Int, y As Int, key As String) As BANanoObject
	'var logo = this.physics.add.image(400, 100, 'logo');
	Dim img As BANanoObject = Physics.GetField("add").RunMethod("image", Array(x, y, key))
	Return img
End Sub

Sub AddStaticGroup As BANanoObject
	'platforms = this.physics.add.staticGroup();
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("staticGroup", Null)
	Return bo
End Sub

Sub AddGroup(key As String, irepeat As String, x As Int, y As Int, stepX As Int) As BANanoObject
	'platforms = this.physics.add.group();
	Dim setxy As Map = CreateMap()
	setxy.Put("x", x)
	setxy.Put("y", y)
	setxy.Put("stepX", stepX)
	'
	Dim options As Map = CreateMap()
	options.Put("key", key)
	options.Put("repeat", irepeat)
	options.Put("setXY", setxy)
	
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("group", options)
	Return bo
End Sub

Sub Pause() As BANanoObject
	Physics.RunMethod("pause", Null)
End Sub

Sub AddGroup1() As BANanoObject
	'platforms = this.physics.add.group();
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("group", Null)
	Return bo
End Sub
