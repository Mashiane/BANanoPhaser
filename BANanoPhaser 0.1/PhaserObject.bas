B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public Thing As BANanoObject
	Private Scene As BANanoObject
	Private BANano As BANano
End Sub

'Initializes the object.
Public Sub Initialize(scne As BANanoObject, obj As BANanoObject) As PhaserObject
	Scene = scne
	Thing = obj
	Return Me
End Sub

' player.anims.play('left', true);
Sub animsPlay(anime As String, b As Boolean) As PhaserObject
	Dim animsx As BANanoObject = Thing.GetField("anims")
	If b = Null Then
		animsx.RunMethod("play", Array(anime))
	Else
		animsx.RunMethod("play", Array(anime, b))
	End If
	Return Me
End Sub

Sub bodyGetY As Int
	Dim y As Int = Thing.GetField("body").GetField("y").Result
	Return y
End Sub

Sub bodyGetX As Int
	Dim x As Int = Thing.GetField("body").GetField("x").Result
	Return x
End Sub

Sub setFillStyle(fillStyle As Object) As PhaserObject
	Thing.RunMethod("fillStyle", Array(fillStyle))
	Return Me
End Sub

Sub setFillCircle(x As Double, y As Double, radius As Int) As PhaserObject
	Thing.RunMethod("fillCircle", Array(x, y, radius))
	Return Me
End Sub

Sub setVisible(b As Boolean) As PhaserObject
	Thing.RunMethod("setVisible", Array(b))
	Return Me
End Sub

'anchor an object
Sub setOriginXY(originX As Double, originY As Double) As PhaserObject
	Thing.RunMethod("setOrigin", Array(originX, originY))
	Return Me
End Sub

'anchor an object
Sub setOriginX(originX As Double) As PhaserObject
	Thing.RunMethod("setOrigin", Array(originX))
	Return Me
End Sub

Sub setImmovable(b As Boolean) As PhaserObject
	Thing.RunMethod("setImmovable", Array(b))
	Return Me
End Sub

Sub setTilePositionX(x As Int) As PhaserObject
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
	setTilePositionX(ex)
	Return Me
End Sub

Sub DecrTilePositionX(x As Int) As PhaserObject
	Dim ex As Int = getTilePositionX
	ex = ex - x
	setTilePositionX(ex)
	Return Me
End Sub

Sub ChildrenIterate(module As Object, methodName As String, child As BANanoObject) As PhaserObject
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(child))
	Thing.GetField("children").RunMethod("iterate", cb)
	Return Me
End Sub

Sub setVelocityXY(x As Double, y As Double) As PhaserObject
	Thing.RunMethod("setVelocity", Array(x, y))
	Return Me
End Sub

Sub bodySetVelocityX(x As Double) As PhaserObject
	Thing.GetField("body").RunMethod("setVelocityX", Array(x))
	Return Me
End Sub

Sub bodySetVelocityY(y As Double) As PhaserObject
	Thing.GetField("body").RunMethod("setVelocityY", Array(y))
	Return Me
End Sub

Sub setBounceXY(x As Double, y As Double) As PhaserObject
	Thing.RunMethod("setBounce", Array(x, y))
	Return Me
End Sub

Sub setCollideWorldBounds(b As Boolean) As PhaserObject
	Thing.RunMethod("setCollideWorldBounds", Array(b))
	Return Me
End Sub

Sub bodyVelocityGetX As Int
	Dim x As Int = Thing.GetField("body").GetField("velocity").GetField("x").Result
	Return x
End Sub

Sub bodyVelocityGetY As Int
	Dim y As Int = Thing.GetField("body").GetField("velocity").GetField("y").Result
	Return y
End Sub

Sub disableBody(disable As Boolean, hide As Boolean) As PhaserObject
	Thing.RunMethod("disableBody", Array(disable, hide))
	Return Me
End Sub

Sub countActive(b As Boolean) As Int
	Dim active As Int = Thing.RunMethod("countActive", Array(b)).Result
	Return active
End Sub

Sub getX As Int
	Dim x As Int = Thing.GetField("x").Result
	Return x
End Sub

Sub incrX(x As Int) As PhaserObject
	Dim oldx As Int = getX
	oldx = oldx + x
	setX(oldx)
	Return Me
End Sub

Sub incrY(y As Int) As PhaserObject
	Dim oldy As Int = getY
	oldy = oldy + y
	setY(oldy)
	Return Me
End Sub

Sub decrX(x As Int) As PhaserObject
	Dim oldx As Int = getX
	oldx = oldx - x
	setX(oldx)
	Return Me
End Sub

Sub decrY(y As Int) As PhaserObject
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

Sub getY As Int
	Dim y As Int = Thing.GetField("y").Result
	Return y
End Sub

Sub enableBody(b1 As Boolean, x As Int, y As Int, b2 As Boolean, b3 As Boolean) As PhaserObject
	'child.enableBody(true, child.x, 0, true, true);
	Thing.RunMethod("enableBody", Array(b1, x, y, b2, b3))
	Return Me
End Sub

Sub setTint(tintColor As Object) As PhaserObject
	Thing.RunMethod("setTint", Array(tintColor))
	Return Me
End Sub

Sub clearTint As PhaserObject
	Thing.RunMethod("clearTint", Null)
	Return Me
End Sub

Sub create(x As Int, y As Int, key As String) As BANanoObject
	Dim bo As BANanoObject = Thing.RunMethod("create", Array(x, y, key))
	Return bo
End Sub

Sub allowGravity(b As Boolean) As PhaserObject
	Thing.SetField("allowGravity", Array(b))
	Return Me
End Sub

Sub setScale(vScale As Object) As PhaserObject
	Thing.RunMethod("setScale", Array(vScale))
	Return Me
End Sub

Sub setScaleX(x As Double) As PhaserObject
	Dim sScale As BANanoObject = Thing.GetField("scale")
	sScale.SetField("x", x)
	Return Me
End Sub

Sub setScaleY(y As Double) As PhaserObject
	Dim sScale As BANanoObject = Thing.GetField("scale")
	sScale.SetField("y", y)
	Return Me
End Sub

Sub refreshBody As PhaserObject
	Thing.RunMethod("refreshBody", Null)
	Return Me
End Sub

Sub setBounce(bounce As Double) As PhaserObject
	Thing.RunMethod("setBounce", Array(bounce))
	Return Me
End Sub

Sub setBounceY(bounce As Double) As PhaserObject
	Thing.RunMethod("setBounceY", Array(bounce))
	Return Me
End Sub

Sub setBounceX(bounce As Double) As PhaserObject
	Thing.RunMethod("setBounceX", Array(bounce))
	Return Me
End Sub

Sub setText(text As String) As PhaserObject
	Thing.RunMethod("setText", Array(text))
	Return Me
End Sub

'get player body
Sub getBody As BANanoObject
	Dim xBody As BANanoObject = Thing.GetField("body")
	Return xBody
End Sub

Sub IsBodyTouchingDown As Boolean
	Dim xBody As BANanoObject = getBody
	Dim td As Boolean = xBody.GetField("touching").GetField("down").Result
	Return td
End Sub

'setVelocityX
Sub setVelocityX(x As Int) As PhaserObject
	Thing.RunMethod("setVelocityX", Array(x))
	Return Me
End Sub

'setVelocityY
Sub setVelocityY(y As Int) As PhaserObject
	Thing.RunMethod("setVelocityY", Array(y))
	Return Me
End Sub
