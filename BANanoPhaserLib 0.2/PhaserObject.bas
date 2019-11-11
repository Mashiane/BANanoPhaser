B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Thing As BANanoObject
	Private Scene As BANanoObject
	Private BANano As BANano   'ignore
	Public IsInitialized As Boolean = False
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, obj As BANanoObject) As PhaserObject
	Scene = scne
	Thing = obj
	IsInitialized = True
	Return Me
End Sub

Sub SetLoop(b As Boolean) As PhaserObject
	Thing.RunMethod("setLoop", Array(b))
	Return Me
End Sub

Sub SetCircle(r As Float) As PhaserObject
	Thing.RunMethod("setCircle", Array(r))
	Return Me
End Sub

Sub Play As PhaserObject
	Thing.RunMethod("play", Null)
	Return Me
End Sub

Sub Stop As PhaserObject
	Thing.RunMethod("stop", Null)
	Return Me
End Sub

Sub CreateEmitter(speed As Int, scaleStart As Int, scaleEnd As Int, blendMode As String) As BANanoObject
	Dim vscale As Map = CreateMap("start":scaleStart, "end":scaleEnd)
	'
	Dim options As Map = CreateMap()
	options.Put("speed", speed)
	options.Put("scale", vscale)
	options.Put("blendMode", blendMode)
	'
	Dim emitter As BANanoObject = Thing.RunMethod("createEmitter", options)
	Return emitter
End Sub

Sub startFollow(target As PhaserObject) As PhaserObject
	Thing.RunMethod("startFollow", Array(target.thing))
	Return Me
End Sub

Sub GetChildren As List
	Dim lst As List = Thing.RunMethod("getChildren",Null).Result
	Return lst
End Sub

Sub SetInteractive As PhaserObject
	Thing.RunMethod("setInteractive", Null)
	Return Me
End Sub

Sub body As PhaserBody
	Dim bdy As BANanoObject = Thing.GetField("body")
	Dim pb As PhaserBody
	pb.Initialize(Scene, bdy)
	Return pb 
End Sub

Sub anims As PhaserAnims
	Dim bdy As BANanoObject = Thing.GetField("anims")
	Dim pb As PhaserAnims
	pb.Initialize(Scene, bdy)
	Return pb
End Sub

Sub FillStyle(fStyle As Object, alpha As Double) As PhaserObject
	Thing.RunMethod("fillStyle", Array(fStyle, alpha))
	Return Me
End Sub

Sub FillCircle(x As Double, y As Double, radius As Int) As PhaserObject
	Thing.RunMethod("fillCircle", Array(x, y, radius))
	Return Me
End Sub

Sub FillRect(x As Double, y As Double, width As Int, height As Int) As PhaserObject
	Thing.RunMethod("fillRect", Array(x, y, width, height))
	Return Me
End Sub


Sub SetVisible(b As Boolean) As PhaserObject
	Thing.RunMethod("setVisible", Array(b))
	Return Me
End Sub

'anchor an object
Sub SetOrigin(originX As Double, originY As Double) As PhaserObject
	Thing.RunMethod("setOrigin", Array(originX, originY))
	Return Me
End Sub

'anchor an object
Sub SetOriginX(originX As Double) As PhaserObject
	Thing.RunMethod("setOrigin", Array(originX))
	Return Me
End Sub


Sub SetImmovable(b As Boolean) As PhaserObject
	Thing.RunMethod("setImmovable", Array(b))
	Return Me
End Sub

Sub SetTilePositionX(x As Int) As PhaserObject
	Thing.SetField("tilePositionX", x)
	Return Me
End Sub

Sub getTilePositionX As Int
	Dim x As Int = Thing.getField("tilePositionX").Result
	Return x
End Sub

Sub IncrTilePositionX(x As Int) As PhaserObject
	Dim ex As Int = getTilePositionX
	ex = ex + x
	SetTilePositionX(ex)
	Return Me
End Sub

Sub DecrTilePositionX(x As Int) As PhaserObject
	Dim ex As Int = getTilePositionX
	ex = ex - x
	SetTilePositionX(ex)
	Return Me
End Sub

Sub getWidth As Int
	Dim res As Int = Thing.GetField("width").result
	Return res
End Sub


Sub getHeight As Int
	Dim res As Int = Thing.GetField("height").result
	Return res
End Sub

Sub getCenterX As Double
	Dim h As Double = Thing.GetField("centerX").Result
	Return h
End Sub

Sub getCenterY As Double
	Dim h As Double = Thing.GetField("centerY").Result
	Return h
End Sub


Sub ChildrenIterate(module As Object, methodName As String, child As BANanoObject) As PhaserObject
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(child))
	Thing.GetField("children").RunMethod("iterate", cb)
	Return Me
End Sub

Sub SetVelocity(x As Double, y As Double) As PhaserObject
	Thing.RunMethod("setVelocity", Array(x, y))
	Return Me
End Sub

Sub SetCollideWorldBounds(b As Boolean) As PhaserObject
	Thing.setfield("collideWorldBounds", b)
	Return Me
End Sub

Sub DisableBody(disable As Boolean, hide As Boolean) As PhaserObject
	Thing.RunMethod("disableBody", Array(disable, hide))
	Return Me
End Sub

Sub GetBounds As PhaserObject
	Thing.RunMethod("getBounds", Null)
	Return Me
End Sub

Sub SetSize(width As Int, height As Int, offsetX As Int, offsetY As Int) As PhaserObject
	Thing.RunMethod("setSize", Array(width, height, offsetX, offsetY))
	Return Me
End Sub

Sub on(event As String, module As Object, methodName As String, params As List)
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, params)
	Thing.RunMethod("on", Array(event, cb))
End Sub

Sub CountActive(b As Boolean) As Int
	Dim active As Int = Thing.RunMethod("countActive", Array(b)).Result
	Return active
End Sub

Sub getX As Int
	Dim x As Int = Thing.GetField("x").Result
	Return x
End Sub

Sub IncrX(x As Int) As PhaserObject
	Dim oldx As Int = getX
	oldx = oldx + x
	setX(oldx)
	Return Me
End Sub

Sub IncrY(y As Int) As PhaserObject
	Dim oldy As Int = getY
	oldy = oldy + y
	setY(oldy)
	Return Me
End Sub

Sub DecrX(x As Int) As PhaserObject
	Dim oldx As Int = getX
	oldx = oldx - x
	setX(oldx)
	Return Me
End Sub

Sub DecrY(y As Int) As PhaserObject
	Dim oldy As Int = getY
	oldy = oldy - y
	setY(oldy)
	Return Me
End Sub

Sub setX(x As Int) As PhaserObject
	Thing.SetField("x", x)
	Return Me
End Sub

Sub setY(y As Int) As PhaserObject
	Thing.SetField("y", y)
	Return Me
End Sub

Sub SetXY(x As Int, y As Int) As PhaserObject
	setX(x)
	setY(y)
	Return Me
End Sub

Sub getY As Int
	Dim y As Int = Thing.GetField("y").Result
	Return y
End Sub

Sub EnableBody(b1 As Boolean, x As Int, y As Int, b2 As Boolean, b3 As Boolean) As PhaserObject
	'child.enableBody(true, child.x, 0, true, true);
	Thing.RunMethod("enableBody", Array(b1, x, y, b2, b3))
	Return Me
End Sub

Sub SetTint(tintColor As Object) As PhaserObject
	Thing.RunMethod("setTint", Array(tintColor))
	Return Me
End Sub

Sub ClearTint As PhaserObject
	Thing.RunMethod("clearTint", Null)
	Return Me
End Sub

Sub SetTexture(txture As String) As PhaserObject
	Thing.RunMethod("setTexture", Array(txture))
	Return Me
End Sub

Sub DisableInteractive As PhaserObject
	Thing.RunMethod("disableInteractive", Null)
	Return Me
End Sub

'return a bananoobject must be converted to PhaserObject
Sub create(x As Int, y As Int, key As String) As BANanoObject
	Dim bo As BANanoObject = Thing.RunMethod("create", Array(x, y, key))
	Return bo
End Sub

Sub AllowGravity(b As Boolean) As PhaserObject
	Thing.SetField("allowGravity", Array(b))
	Return Me
End Sub

Sub SetRepeat(rpt As Int) As PhaserObject
	Thing.SetField("repeat", rpt)
	Return Me
End Sub

Sub SetScale(vScale As Double) As PhaserObject
	Thing.RunMethod("setScale", Array(vScale))
	Return Me
End Sub

Sub SetScaleXY(x As Double, y As Double) As PhaserObject
	Thing.SetField("scaleX", x)
	Thing.SetField("scaleY", y)
	Return Me
End Sub

Sub SetScaleX(x As Double) As PhaserObject
	Thing.SetField("scaleX", x)
	Return Me
End Sub

Sub SetScaleY(y As Double) As PhaserObject
	Thing.SetField("scaleY", y)
	Return Me
End Sub

Sub getDisplayWidth As Int
	Dim res As Int = Thing.GetField("displayWidth").Result
	Return res
End Sub

Sub GetScaleX As Double
	Dim res As Double = Thing.GetField("scaleX").Result
	Return res
End Sub

Sub GetScaleY As Double
	Dim res As Double = Thing.GetField("scaleY").Result
	Return res
End Sub

Sub RefreshBody As PhaserObject
	Thing.RunMethod("refreshBody", Null)
	Return Me
End Sub

Sub SetBounceXY(X As Double, Y As Double) As PhaserObject
	Thing.RunMethod("setBounce", Array(x, y))
	Return Me
End Sub


Sub SetBounce(bounce As Double) As PhaserObject
	Thing.RunMethod("setBounce", bounce)
	Return Me
End Sub


Sub SetBounceY(bounce As Double) As PhaserObject
	Thing.RunMethod("setBounceY", bounce)
	Return Me
End Sub


Sub SetBounceX(bounce As Double) As PhaserObject
	Thing.RunMethod("setBounceX", bounce)
	Return Me
End Sub


Sub SetText(text As String) As PhaserObject
	Thing.RunMethod("setText", Array(text))
	Return Me
End Sub

Sub setKey(k As String) As PhaserObject
	Thing.SetField("key", k)
	Return Me
End Sub

Sub Clear As PhaserObject
	Thing.RunMethod("clear", Null)
	Return Me
End Sub

Sub Destroy As PhaserObject
	Thing.RunMethod("destroy", Null)
	Return Me
End Sub

Sub Destroy1(b As Boolean) As PhaserObject
	Thing.RunMethod("destroy", Array(b))
	Return Me
End Sub

Sub setFlipX(b As Boolean) As PhaserObject
	Thing.SetField("flipX", b)
	Return Me
End Sub

'setVelocityX
Sub SetVelocityX(x As Int) As PhaserObject
	Thing.RunMethod("setVelocityX", Array(x))
	Return Me
End Sub

'setVelocityY
Sub SetVelocityY(y As Int) As PhaserObject
	Thing.RunMethod("setVelocityY", Array(y))
	Return Me
End Sub

Sub setAutoScroll(x As Int, y As Int) As PhaserObject
	Thing.RunMethod("autoScroll", Array(x,y))
	Return Me
End Sub
