B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public Scene As PhaserScene
	Private BANano As BANano
	
	Private playerBalls As PhaserObject
	Private playerIndex As Int
	Private separatorLine As PhaserObject
	Private guessBalls As PhaserObject
	Private growButton As PhaserObject
	Private checkButton As PhaserObject
	Private addButton As PhaserObject
	Private nextButton As PhaserObject
	Private retryButton As PhaserObject
	Private growCount As Int
	Private level As Int
	Private levelText As PhaserObject
	Private levelCompleteText As PhaserObject
	Private lostLevelText As PhaserObject
	Private nextText As PhaserObject
	Private retryText As PhaserObject
	Private separatorCollider As PhaserObject
	Private lastStage As Boolean
End Sub

'the game title
Sub Initialize(game As BANanoPhaser)
	'create a scene and give it a unique key
	Scene = game.CreateScene("GameScene")
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
End Sub

Sub onPreload
End Sub

Sub onCreate
	'Scene.add.image(400, 300, "bg")
	Dim width As Int = Scene.game.canvas.width
	Dim height As Int = Scene.game.canvas.height
	Scene.cameras.mainc.setBackgroundColor("#38B6FF")
	'
	Dim iwidth As Int = width / 2
	Dim iheight As Int = (height / 2) - 5
	separatorLine = Scene.physics.add.sprite(iwidth, iheight, "separator")
	separatorLine.setImmovable(True)
	separatorLine.body.setAllowGravity(False)
	'
	'Set up level
	level = 1
	growCount = 0
	lastStage = False
	'
	'Create growth button To increase ball size
	growButton = Scene.add.sprite(700, 400, "growButton")
	growButton.setInteractive
	growButton.on("pointerdown", Me, "scalePlayerBall", Null)
	'
	'Create add button to add a new ball
	addButton = Scene.add.sprite(700, 475, "addButton")
	addButton.setInteractive
	addButton.on("pointerdown", Me, "addBall", Null)
	'
	'Create check button To compare ball sizes
	checkButton = Scene.add.sprite(700, 550, "checkButton")
	checkButton.setInteractive
	checkButton.on("pointerdown", Me, "compareBalls", Null)
	
	Dim wf As PhaserWebFont
	wf.Initialize
	wf.AddGoogleFont("Luckiest Guy")
	wf.SetOnLoad(Me, "reset")

End Sub

Sub scalePlayerBall
	growCount = Scene.Incr(growCount)
	Dim balls As List = playerBalls.getChildren
	Dim currentBall As PhaserObject = Scene.ToPhaserObject(balls.get(playerIndex))
	currentBall.setScale(currentBall.GetScaleX + 0.2)
	If growCount = 10 Then
		growButton.setTexture("disabledGrowButton")
		growButton.disableInteractive
    End If
End Sub

Sub getTotalSize(grp As PhaserObject) As Int
    Dim totalSize As Int = 0
	Dim balls As List = grp.GetChildren
    For Each child As BANanoObject In balls
		totalSize = totalSize + Scene.ToPhaserObject(child).DisplayWidth
	Next
	Dim tt As Double = totalSize / 10
	tt = tt * 10
    Return Scene.MathRound(tt)
End Sub


Sub addBall
	Dim balls As List = playerBalls.getChildren
	Dim currentBall As PhaserObject = Scene.ToPhaserObject(balls.get(playerIndex))
	'
	Dim newBall As PhaserObject = Scene.ToPhaserObject(playerBalls.create(currentBall.X + 60, 450, "playerBall"))
	newBall.setScale(0.2)
	newBall.setBounceX(0.4)
	'
	playerIndex = playerIndex + 1 'move the player index To the new ball
    'Renable grow button in Case it's disabled
	growButton.setTexture("growButton")
	growButton.setInteractive
	growCount = 0    'Reset growth count For new ball
    
	If playerIndex = 2 Then
		'Change image of sprite
		addButton.setTexture("disabledAddButton")
   		addButton.disableInteractive
	End If
End Sub


Sub nextLevel
    level = level + 1
	If level = 10 Then lastStage = True
	reset
End Sub

Sub compareBalls
	' Disable game buttons
    growButton.disableInteractive
    addButton.disableInteractive
    checkButton.disableInteractive

    Dim totalPlayerSize As Int = getTotalSize(playerBalls)
    Dim totalGuessSize As Int = getTotalSize(guessBalls)
	'
	Dim cx As Int = Scene.Physics.world.bounds.CenterX
	Dim cy As Int = Scene.Physics.world.bounds.CenterY
	Dim cw As Int = Scene.game.canvas.width
	
    ' You beat the level
    If totalPlayerSize = totalGuessSize Then
      If Not(lastStage) Then
	    levelCompleteText = Scene.add.text(cx, cy + 40, "Good Job!", CreateMap("fontFamily": "Luckiest Guy", "fontSize": 40, "color": "#ffffff"))
		levelCompleteText.setOriginX(0.5)

		'Show the next stage button
		nextButton = Scene.add.sprite(cw / 2, 400, "nextButton")
		nextButton.setInteractive
		nextButton.on("pointerdown", Me, "nextLevel", Null)
		'And some helper text
		nextText = Scene.add.text(cx, 450, "Next", CreateMap("fontFamily": "Luckiest Guy", "fontSize": 32, "color": "#ffffff"))
		nextText.setOriginX(0.5)
      Else 
		'No more stages To go
		levelCompleteText = Scene.add.text(cx, cy + 40, "Congrats! You\'ve reached the end!", CreateMap("fontFamily": "Luckiest Guy", "fontSize": 40, "color": "#ffffff"))
		levelCompleteText.setOriginX(0.5)
      End If
    Else
	' You lost
		lostLevelText = Scene.add.text(cx, cy + 40, "Not exactly right...", CreateMap("fontFamily": "Luckiest Guy", "fontSize": 40, "color": "#ffffff"))
		lostLevelText.setOriginX(0.5)
		'
		'Show the retry stage button
		retryButton = Scene.add.sprite(cw / 2, 400, "retryButton")
		retryButton.setInteractive
		retryButton.on("pointerdown", Me, "reset", Null)
		
		'And some helper text
		retryText = Scene.add.text(cx, 450, "Try again?", CreateMap("fontFamily": "Luckiest Guy", "fontSize": 32, "color": "#ffffff"))
		retryText.setOriginX(0.5)
	End If
End Sub

Sub onUpdate
End Sub


Sub reset
    'Enable game buttons
    growButton.setInteractive
    growButton.setTexture("growButton")
    addButton.setInteractive
    addButton.setTexture("addButton")
    checkButton.setInteractive

    'Hide the winning/losing text + buttons
    If levelCompleteText.IsInitialized Then
      levelCompleteText.destroy
      nextButton.destroy
      nextText.destroy
    End If

    If lostLevelText.IsInitialized Then
      lostLevelText.destroy
      retryButton.destroy
      retryText.destroy
    End If

    'Remove the player ball If it exists
    If playerBalls.IsInitialized Then
      playerBalls.destroy1(True)
    End If
	
    'Set the player up
    Dim pg As PhaserGroup
	pg.Initialize
	pg.key = "playerBall"
	pg.setXY.x = 200
	pg.setXY.y = 450
	pg.bounceX = 0.4
	pg.bounceY = 0.4
	pg.setScale.x = 0.2
	pg.setScale.y = 0.2
	pg.collideWorldBounds = True
	playerBalls = Scene.physics.add.group1(pg)
		
	playerIndex = 0   'Player index Is back at 0
	
	'Remove the guess balls If they exist
	If guessBalls.IsInitialized Then
		guessBalls.destroy1(True)
	End If
	'Set up the level i.e. get the guess balls
    getLevel

	'Add guess ball collision
	If separatorCollider.IsInitialized Then
		separatorCollider.destroy
	End If
	separatorCollider = Scene.physics.add.collider(separatorLine, guessBalls)

	'reset the level text
	If levelText.IsInitialized Then
      levelText.destroy
    End If
	levelText = Scene.add.text(20, 40, "Level: " & level, CreateMap("fontFamily": "Luckiest Guy", "fontSize": 30, "color": "#ffffff"))
	'reset grow count
	growCount = 0
End Sub

Sub getLevel
	Dim firstBall As PhaserObject
	Dim secondBall As PhaserObject
	Dim thirdBall As PhaserObject
	Dim fourthBall As PhaserObject
	Dim fifthBall As PhaserObject
	Select Case level
	Case 1
		Dim pg1 As PhaserGroup
		pg1.Initialize
		pg1.key = "guessBall"
		pg1.setXY.x = 200
		pg1.setXY.y = 50
		pg1.bounceX = 0.4
		pg1.bounceY = 0.4
		pg1.setScale.x = 0.6
		pg1.setScale.y = 0.6
		guessBalls = Scene.physics.add.group1(pg1)
		Exit
	Case 2
		Dim pg1 As PhaserGroup
		pg1.Initialize
		pg1.key = "guessBall"
		pg1.setXY.x = 200
		pg1.setXY.y = 50
		pg1.bounceX = 0.4
		pg1.bounceY = 0.4
		pg1.setScale.x = 1.4
		pg1.setScale.y = 1.4
		guessBalls = Scene.physics.add.group1(pg1)
		Exit
	Case 3
		Dim pg1 As PhaserGroup
		pg1.Initialize
		pg1.key = "guessBall"
		pg1.setXY.x = 200
		pg1.setXY.y = 50
		pg1.bounceX = 0.4
		pg1.bounceY = 0.4
		pg1.setScale.x = 1
		pg1.setScale.y = 1
		guessBalls = Scene.physics.add.group1(pg1)
		Exit
	Case 4
		Dim pg1 As PhaserGroup
		pg1.Initialize
		pg1.key = "guessBall"
		pg1.irepeat = 2
		pg1.setXY.x = 200
		pg1.setXY.y = 50
		pg1.setXY.stepX = 60
		pg1.setXY.stepY = -10
		pg1.bounceX = 0.4
		pg1.bounceY = 0.4
		pg1.setScale.x = 0.2
		pg1.setScale.y = 0.2
		guessBalls = Scene.physics.add.group1(pg1)
		Exit
	Case 5
		guessBalls = Scene.physics.add.group
		firstBall = Scene.ToPhaserObject(guessBalls.create(200, 50, "guessBall"))
		firstBall.setScale(0.2).setBounceX(0.4)
		secondBall = Scene.ToPhaserObject(guessBalls.create(260, 30, "guessBall"))
		secondBall.setScale(0.8).setBounceX(0.6)
		Exit
	Case 6
		guessBalls = Scene.physics.add.group
		firstBall = Scene.ToPhaserObject(guessBalls.create(200, 50, "guessBall"))
		firstBall.setScale(0.2).setBounceX(0.4)
		secondBall = Scene.ToPhaserObject(guessBalls.create(260, 30, "guessBall"))
		secondBall.setScale(0.4).setBounceX(0.6)
		thirdBall = Scene.ToPhaserObject(guessBalls.create(320, 30, "guessBall"))
		thirdBall.setScale(0.8).setBounceX(0.6)
		Exit
	Case 7
		guessBalls = Scene.physics.add.group
		firstBall = Scene.ToPhaserObject(guessBalls.create(200, 50, "guessBall"))
		firstBall.setScale(0.6).setBounceX(0.6)
		secondBall = Scene.ToPhaserObject(guessBalls.create(260, 30, "guessBall"))
		secondBall.setScale(0.4).setBounceX(0.6)
		thirdBall = Scene.ToPhaserObject(guessBalls.create(320, 30, "guessBall"))
		thirdBall.setScale(0.6).setBounceX(0.6)
		Exit
	Case 8
		guessBalls = Scene.physics.add.group
		firstBall = Scene.ToPhaserObject(guessBalls.create(200, 50, "guessBall"))
		firstBall.setScale(0.6).setBounceX(0.6)
		secondBall = Scene.ToPhaserObject(guessBalls.create(260, 30, "guessBall"))
		secondBall.setScale(0.6).setBounceX(0.6)
		thirdBall = Scene.ToPhaserObject(guessBalls.create(320, 30, "guessBall"))
		thirdBall.setScale(0.6).setBounceX(0.6)
		fourthBall = Scene.ToPhaserObject(guessBalls.create(380, 30, "guessBall"))
		fourthBall.setScale(0.6).setBounceX(0.6)
		Exit
	Case 9
		guessBalls = Scene.physics.add.group
		firstBall = Scene.ToPhaserObject(guessBalls.create(200, 50, "guessBall"))
		firstBall.setScale(1).setBounceX(0.6)
		secondBall = Scene.ToPhaserObject(guessBalls.create(260, 30, "guessBall"))
		secondBall.setScale(0.4).setBounceX(0.6)
		thirdBall = Scene.ToPhaserObject(guessBalls.create(320, 30, "guessBall"))
		thirdBall.setScale(0.6).setBounceX(0.6)
		fourthBall = Scene.ToPhaserObject(guessBalls.create(380, 30, "guessBall"))
		fourthBall.setScale(0.6).setBounceX(0.6)
		Exit
	Case 10
		guessBalls = Scene.physics.add.group
		firstBall = Scene.ToPhaserObject(guessBalls.create(200, 50, "guessBall"))
		firstBall.setScale(0.4).setBounceX(0.6)
		secondBall = Scene.ToPhaserObject(guessBalls.create(260, 30, "guessBall"))
		secondBall.setScale(0.4).setBounceX(0.6)
		thirdBall = Scene.ToPhaserObject(guessBalls.create(320, 30, "guessBall"))
		thirdBall.setScale(0.8).setBounceX(0.6)
		fourthBall = Scene.ToPhaserObject(guessBalls.create(380, 30, "guessBall"))
		fourthBall.setScale(0.2).setBounceX(0.4)
		fifthBall = Scene.ToPhaserObject(guessBalls.create(420, 30, "guessBall"))
		fifthBall.setScale(0.4).setBounceX(0.6)
		Exit
	End Select
End Sub