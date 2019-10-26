B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public Physics As BANanoObject
	Private Anims As BANanoObject
	Private Input As BANanoObject
	Private Cursors As BANanoObject
	Public Scene As BANanoObject
	Private BANano As BANano
	Private Scale As BANanoObject
	Private World As BANanoObject
	Private Math As BANanoObject
End Sub

'Initializes the scene
Public Sub Initialize(sceneName As String)
	Math.Initialize("Math") 
	Scene.Initialize2("Phaser.Scene", Array(sceneName))
	'
	SetOnInit(Me, "getScene")
End Sub

Sub random() As Double
	Dim r As Double = Math.RunMethod("random", Null)
	Return r
End Sub

Sub absolute(v As Int)
	Dim a As Int = Math.RunMethod("abs", Array(v))
	Return a
End Sub

private Sub GetScene
	Physics = Scene.GetField("physics")
	Anims = Scene.GetField("anims")
	Input = Scene.GetField("input")
	Scale = Scene.GetField("scale")
	World = Physics.GetField("world")
	Log(Scene)
End Sub

Sub GetBodyY(obj As BANanoObject) As Int
	Dim y As Int = obj.GetField("body").GetField("y").Result
	Return y
End Sub

Sub GetBodyX(obj As BANanoObject) As Int
	Dim x As Int = obj.GetField("body").GetField("x").Result
	Return x
End Sub


Sub getPhysicsWorldBoundsWidth As Int
	Dim dbl As Int = World.GetField("bounds").GetField("width").result
	Return dbl
End Sub

Sub getPhysicsWorldBoundsHeight As Int
	Dim dbl As Int = World.GetField("bounds").GetField("height").result
	Return dbl
End Sub

Sub SetVisible(obj As BANanoObject, b As Boolean)
	obj.RunMethod("setVisible", Array(b))
End Sub

Sub SetOrigin(obj As BANanoObject, dbl As Double)
	obj.RunMethod("setOrigin", Array(dbl))
End Sub

Sub SetImmovable(obj As BANanoObject, b As Boolean)
	obj.RunMethod("setImmovable", Array(b))
End Sub

Sub GetWorldHeight As Double
	Dim h As Double = World.GetField("height").Result
	Return h
End Sub

Sub GetWorldWidth As Double
	Dim w As Double = World.GetField("width").Result
	Return w
End Sub

Sub SetScaleMode(scaleMode As Int)
	Scale.SetField("scaleMode", scaleMode)
End Sub

Sub SetScalePageAlignHorizontally(b As Boolean)
	Scale.SetField("pageAlignHorizontally", b)
End Sub

Sub SetScalepageAlignVertically(b As Boolean)
	Scale.SetField("pageAlignVertically", b)
End Sub

Sub ChildrenIterate(parent As BANanoObject, CallThisBack As BANanoObject)
	parent.GetField("children").RunMethod("iterate", CallThisBack)
End Sub

Sub SetVelocityXY(obj As BANanoObject, x As Object, y As Object)
	obj.RunMethod("setVelocity", Array(x, y))
End Sub

Sub BodySetVelocityX(obj As BANanoObject, x As Object)
	obj.GetField("body").RunMethod("setVelocityX", Array(x))
End Sub

Sub BodySetVelocityY(obj As BANanoObject, y As Object)
	obj.GetField("body").RunMethod("setVelocityY", Array(y))
End Sub

Sub SetBounceXY(obj As BANanoObject, x As Object, y As Object)
	obj.RunMethod("setBounce", Array(x, y))
End Sub

Sub SetCollideWorldBounds(obj As BANanoObject, b As Boolean)
	obj.RunMethod("setCollideWorldBounds", Array(b))
End Sub

Sub StartFollow(source As BANanoObject, target As BANanoObject)
	source.RunMethod("startFollow", Array(target))
End Sub

Sub Cstr(obj As Object) As String
	Return "" & obj
End Sub

Sub GetBodyVelocityX(obj As BANanoObject) As Int
	Dim x As Int = obj.GetField("body").GetField("velocity").GetField("x").Result
	Return x
End Sub

Sub GetBodyVelocityY(obj As BANanoObject) As Int
	Dim y As Int = obj.GetField("body").GetField("velocity").GetField("y").Result
	Return y
End Sub

Sub SetBodyVelocityX(obj As BANanoObject, x As Int)
	obj.GetField("body").RunMethod("setVelocityX", Array(x))
End Sub

Sub SetBodyVelocityY(obj As BANanoObject, y As Int)
	obj.GetField("body").RunMethod("setVelocityY", Array(y))
End Sub

Sub DisableBody(obj As BANanoObject, disableGameObject As Boolean, hideGameObject As Boolean)
	obj.RunMethod("disableBody", Array(disableGameObject, hideGameObject))
End Sub

Sub CountActive(bo As BANanoObject, b As Boolean) As Int
	Dim active As Int = bo.RunMethod("countActive", Array(b)).Result
	Return active
End Sub

Sub GetX(bo As BANanoObject) As Int
	Dim x As Int = bo.GetField("x").Result
	Return x
End Sub

Sub IncrementX(bo As BANanoObject, x As Int)
	Dim oldx As Int = GetX(bo)
	oldx = oldx + x
	SetX(bo, oldx)
End Sub

Sub IncrementY(bo As BANanoObject, y As Int)
	Dim oldy As Int = GetY(bo)
	oldy = oldy + y
	SetY(bo, oldy)
End Sub

Sub DecrementX(bo As BANanoObject, x As Int)
	Dim oldx As Int = GetX(bo)
	oldx = oldx - x
	SetX(bo, oldx)
End Sub

Sub DecrementY(bo As BANanoObject, y As Int)
	Dim oldy As Int = GetY(bo)
	oldy = oldy - y
	SetY(bo, oldy)	
End Sub

Sub SetX(bo As BANanoObject, x As Int)
	bo.SetField("x", x)
End Sub

Sub SetY(bo As BANanoObject, y As Int)
	bo.SetField("y", y)
End Sub

Sub GetY(bo As BANanoObject) As Int
	Dim y As Int = bo.GetField("y").Result
	Return y
End Sub

Sub EnableBody(bo As BANanoObject, b1 As Boolean, x As Int, y As Int, b2 As Boolean, b3 As Boolean)
	'child.enableBody(true, child.x, 0, true, true);
	bo.RunMethod("enableBody", Array(b1, x, y, b2, b3))
End Sub

Sub SetTint(bo As BANanoObject, tintColor As Object)
	bo.RunMethod("setTint", Array(tintColor))
End Sub

Sub ClearTint(bo As BANanoObject)
	bo.RunMethod("clearTint", Null)
End Sub

Sub CreateInstance(parent As BANanoObject, x As Int, y As Int, key As String) As BANanoObject
	Dim bo As BANanoObject = parent.RunMethod("create", Array(x, y, key))
	Return bo
End Sub

Sub AllowGravity(bo As BANanoObject, b As Boolean)
	bo.SetField("allowGravity", Array(b))
End Sub

Sub SetScale(bo As BANanoObject, vScale As Object)
	bo.RunMethod("setScale", Array(vScale))
End Sub

Sub SetScaleX(bo As BANanoObject, x As Double)
	Dim Scale As BANanoObject = bo.GetField("scale")
	Scale.SetField("x", x)
End Sub

Sub SetScaleY(bo As BANanoObject, y As Double)
	Dim Scale As BANanoObject = bo.GetField("scale")
	Scale.SetField("y", y)
End Sub

Sub RefreshBody(bo As BANanoObject)
	bo.RunMethod("refreshBody", Null)
End Sub

Sub SetBounce(bo As BANanoObject, bounce As Double)
	bo.RunMethod("setBounce", Array(bounce))
End Sub

Sub SetBounceY(bo As BANanoObject, bounce As Double)
	bo.RunMethod("setBounceY", Array(bounce))
End Sub

Sub SetBounceX(bo As BANanoObject, bounce As Double)
	bo.RunMethod("setBounceX", Array(bounce))
End Sub

Sub SetText(bo As BANanoObject, text As String)
	bo.RunMethod("setText", Array(text))
End Sub

Sub PlaySound(bo As BANanoObject)
	bo.RunMethod("play", Null)
End Sub

Sub PlaySoundLoop(bo As BANanoObject)
	bo.RunMethod("play", Array("",0 , 1, True))
End Sub

Sub CreateEmitter(particles As BANanoObject, speed As Int, scaleStart As Int, scaleEnd As Int, blendMode As String) As BANanoObject
	Dim vscale As Map = CreateMap("start":scaleStart, "end":scaleEnd)
	'
	Dim options As Map = CreateMap()
	options.Put("speed", speed)
	options.Put("scale", vscale)
	options.Put("blendMode", blendMode)
	'
	Dim emitter As BANanoObject = particles.RunMethod("createEmitter", options)
	Return emitter
End Sub


'get player body
Sub GetBody(player As BANanoObject) As BANanoObject
	Dim Body As BANanoObject = player.GetField("body")
	Return Body
End Sub

Sub IsBodyTouchingDown(player As BANanoObject) As Boolean
	Dim Body As BANanoObject = GetBody(player)
	Dim td As Boolean = Body.GetField("touching").GetField("down").Result
	Return td
End Sub


'setVelocityX
Sub SetVelocityX(bo As BANanoObject, x As Int)
	bo.RunMethod("setVelocityX", Array(x))
End Sub

'setVelocityY
Sub SetVelocityY(bo As BANanoObject, y As Int)
	bo.RunMethod("setVelocityY", Array(y))
End Sub


' player.anims.play('left', true);
Sub PlayAnime(bo As BANanoObject, anime As String, b As Object)
	Dim animsx As BANanoObject = bo.GetField("anims")
	If b = Null Then
		animsx.RunMethod("play", Array(anime))
	Else
		animsx.RunMethod("play", Array(anime, b))
	End If
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

'create an animation
Sub CreateAnime(key As String, spriteName As String, frameRate As Int, startFrame As Int, endFrame As Int, irepeat As Object)
	Dim anime As Map = CreateMap()
	anime.Put("key", key)
	anime.Put("frameRate", frameRate)
	If irepeat <> Null Then
		anime.Put("repeat", irepeat)
	End If
	If startFrame = endFrame Then
		Dim options As Map = CreateMap()
		options.Put("key", spriteName)
		options.Put("frame", startFrame)
		Dim lframes As List
		lframes.Initialize2(Array(options))
		anime.Put("frames", lframes)
	Else
		Dim bframes As BANanoObject = GenerateFrameNumbers(spriteName, startFrame, endFrame)
		anime.Put("frames", bframes)
	End If
	'
	Anims.RunMethod("create", anime)
End Sub


private Sub GenerateFrameNumbers(spriteName As String, startFrame As Int, endFrame As Int) As BANanoObject
	Dim options As Map = CreateMap()
	options.Put("start", startFrame)
	options.Put("end", endFrame)
	Dim bo As BANanoObject = Anims.RunMethod("generateFrameNumbers", Array(spriteName, options))
	Return bo
End Sub

Sub SceneLoadImage(key As String, URL As String)
	'this.load.image('sky', 'assets/skies/space3.png');
	Scene.GetField("load").RunMethod("image", Array(key, URL))
End Sub

Sub SceneLoadSound(key As String, URL As String)
	Scene.GetField("load").RunMethod("sound", Array(key, URL))
End Sub

Sub SceneLoadSpriteSheet(key As String, URL As String, frameWidth As Int, frameHeight As Int)
	'this.load.spritesheet('dude', 'assets/dude.png', { frameWidth: 32, frameHeight: 48 });
	Dim options As Map = CreateMap()
	options.Put("frameWidth", frameWidth)
	options.Put("frameHeight", frameHeight)
	Scene.GetField("load").RunMethod("spritesheet", Array(key, URL, options))
End Sub

'restart the game
Sub SceneReStart
	Scene.RunMethod("restart", Null)
End Sub

Sub SceneAddSprite(x As Int, y As Int, key As String) As BANanoObject
	'game.add.sprite(0,0,“bg”);
	Dim bo As BANanoObject = Scene.GetField("add").RunMethod("sprite", Array(x, y, key))
	Return bo
End Sub

Sub AnchorSet(bo As BANanoObject, x As Double, y As Double)
	'paddle.anchor.set(0.5,1);
	bo.GetField("anchor").RunMethod("set", Array(x, y))
End Sub

Sub SceneAddParticles(key As String) As BANanoObject
	'var particles = this.add.particles('red');
	Dim bo As BANanoObject = Scene.GetField("add").RunMethod("particles", Array(key))
	Return bo
End Sub

Sub SceneAddImage(x As Int, y As Int, key As String) As BANanoObject
	'this.add.image(400, 300, 'sky');
	Dim bo As BANanoObject = Scene.GetField("add").RunMethod("image", Array(x, y, key))
	Return bo
End Sub

Sub SceneAddSound(key As String) As BANanoObject
	Dim bo As BANanoObject = Scene.GetField("add").RunMethod("sound", Array(key))
	Return bo
End Sub

Sub SceneAddText(x As Int, y As Int, text As String, options As Map) As BANanoObject
	'scoreText = this.add.text(16, 16, 'score: 0', { fontSize: '32px', fill: '#000' });
	Dim bo As BANanoObject = Scene.GetField("add").RunMethod("text", Array(x, y, text, options))
	Return bo
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

Sub PhysicsAddOverlap(obj1 As BANanoObject, obj2 As BANanoObject, obj3 As BANanoObject, obj4 As BANanoObject, obj5 As BANanoObject)
	'this.physics.add.overlap()
	Physics.GetField("add").RunMethod("overlap", Array(obj1, obj2, obj3, obj4, obj5))
End Sub

Sub PhysicsAddCollider(obj1 As BANanoObject, obj2 As BANanoObject)
	'this.physics.add.collider(player, platforms);
	Physics.GetField("add").RunMethod("collider", Array(obj1, obj2))
End Sub

Sub PhysicsAddCollider5(obj1 As BANanoObject, obj2 As BANanoObject, obj3 As BANanoObject, obj4 As BANanoObject, obj5 As BANanoObject)
	'this.physics.add.collider(player, platforms);
	Physics.GetField("add").RunMethod("collider", Array(obj1, obj2, obj3, obj4, obj5))
End Sub



Sub PhysicsAddSprite(x As Int, y As Int, key As String) As BANanoObject
	'player = this.physics.add.sprite(100, 450, 'dude');
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("sprite", Array(x, y, key))
	Return bo
End Sub

Sub PhysicsAddImage(x As Int, y As Int, key As String) As BANanoObject
	'var logo = this.physics.add.image(400, 100, 'logo');
	Dim img As BANanoObject = Physics.GetField("add").RunMethod("image", Array(x, y, key))
	Return img
End Sub

Sub PhysicsAddStaticGroup As BANanoObject
	'platforms = this.physics.add.staticGroup();
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("staticGroup", Null)
	Return bo
End Sub

Sub PhysicsAddGroup(key As String, irepeat As String, x As Int, y As Int, stepX As Int, immovable As Boolean) As BANanoObject
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
	Return bo
End Sub

Sub PhysicsPause() As BANanoObject
	Physics.RunMethod("pause", Null)
End Sub

Sub PhysicsResume() As BANanoObject
	Physics.RunMethod("resume", Null)
End Sub


Sub PhysicsAddGroup1() As BANanoObject
	'platforms = this.physics.add.group();
	Dim bo As BANanoObject = Physics.GetField("add").RunMethod("group", Null)
	Return bo
End Sub
