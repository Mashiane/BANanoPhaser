B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public key As String
	Type setXYType(x As Int, y As Int, stepX As Int, stepY As Int)
	Public SetXY As setXYType
	Public bounceX As Double
	Public bounceY As Double
	Type SetScaleType(x As Double, y As Double)
	Public SetScale As SetScaleType
	Public collideWorldBounds As Boolean
	Public irepeat As Int
	Public immovable As Boolean
End Sub

Sub SetImmovable(b As Boolean) As PhaserGroup
	immovable = b
	Return Me
End Sub

Sub SetXY_StepXY(x As Int, y As Int) As PhaserGroup
	If x <> Null Then SetXY.stepX = x
	If y <> Null Then SetXY.stepY = y
	Return Me
End Sub

Sub SetXY_XY(x As Int, y As Int) As PhaserGroup
	If x <> Null Then SetXY.x = x
	If y <> Null Then SetXY.y = y
	Return Me
End Sub

Sub SetRepeat(rpt As Int) As PhaserGroup
	irepeat = rpt
	Return Me
End Sub

Sub SetCollideWorldBounds(b As Boolean) As PhaserGroup
	collideWorldBounds = b
	Return Me
End Sub

Sub SetScaleType(x As Double, y As Double) As PhaserGroup
	If x <> Null Then SetScale.x = x
	If y <> Null Then SetScale.y = y
	Return Me
End Sub

Sub SetBounceY(y As Double) As PhaserGroup
	bounceY = y
	Return Me
End Sub

Sub SetBounceX(x As Double) As PhaserGroup
	bounceX = x
	Return Me
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	key = ""
	SetXY.Initialize 
	SetXY.x = Null
	SetXY.y = Null
	SetXY.stepX = Null
	SetXY.stepY = Null
	bounceX = Null
	bounceY = Null
	SetScale.Initialize 
	SetScale.x = Null
	SetScale.y = Null
	collideWorldBounds = False
	irepeat = Null
	immovable = Null
End Sub

Sub ToObject As Map
	Dim opt As Map = CreateMap()
	If key <> Null Then opt.Put("key", key)
	Dim sxy As Map = CreateMap()
	If SetXY.x <> Null Then sxy.Put("x", SetXY.x)
	If SetXY.y <> Null Then sxy.Put("y", SetXY.y)
	If SetXY.stepX <> Null Then sxy.Put("stepX", SetXY.stepX)
	If SetXY.stepY <> Null Then sxy.Put("stepY", SetXY.stepY)
	opt.Put("setXY", sxy)
	If bounceX <> Null Then opt.Put("bounceX", bounceX)
	If bounceY <> Null Then opt.Put("bounceY", bounceY)
	Dim scle As Map = CreateMap()
	If SetScale.x <> Null Then scle.Put("x", SetScale.x)
	If SetScale.y <> Null Then scle.Put("y", SetScale.y)
	opt.Put("setScale", scle)
	If collideWorldBounds Then opt.Put("collideWorldBounds", collideWorldBounds)
	If irepeat <> Null Then opt.Put("repeat", irepeat)
	If immovable <> Null Then opt.Put("immovable", immovable)
	Return opt
End Sub