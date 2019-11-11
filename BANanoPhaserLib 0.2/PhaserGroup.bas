B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public key As String
	Type setXYType(x As Int, y As Int, stepX As Int, stepY As Int)
	Public setXY As setXYType
	Public bounceX As Int
	Public bounceY As Int
	Type setScaleType(x As Double, y As Double)
	Public setScale As setScaleType
	Public collideWorldBounds As Boolean
	Public irepeat As Int
	Public immovable As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	key = ""
	setXY.Initialize 
	setXY.x = Null
	setXY.y = Null
	setXY.stepX = Null
	setXY.stepY = Null
	bounceX = Null
	bounceY = Null
	setScale.Initialize 
	setScale.x = Null
	setScale.y = Null
	collideWorldBounds = False
	irepeat = Null
	immovable = Null
End Sub

Sub ToMap As Map
	Dim opt As Map = CreateMap()
	If key <> Null Then opt.Put("key", key)
	Dim sxy As Map = CreateMap()
	If setXY.x <> Null Then sxy.Put("x", setXY.x)
	If setXY.y <> Null Then sxy.Put("y", setXY.y)
	If setXY.stepX <> Null Then sxy.Put("stepX", setXY.stepX)
	If setXY.stepY <> Null Then sxy.Put("stepY", setXY.stepY)
	opt.Put("setXY", sxy)
	If bounceX <> Null Then opt.Put("bounceX", bounceX)
	If bounceY <> Null Then opt.Put("bounceY", bounceY)
	Dim scle As Map = CreateMap()
	If setScale.x <> Null Then scle.Put("x", setScale.x)
	If setScale.y <> Null Then scle.Put("y", setScale.y)
	opt.Put("setScale", scle)
	If collideWorldBounds Then opt.Put("collideWorldBounds", collideWorldBounds)
	If irepeat <> Null Then opt.Put("repeat", irepeat)
	If immovable <> Null Then opt.Put("immovable", immovable)
	Return opt
End Sub