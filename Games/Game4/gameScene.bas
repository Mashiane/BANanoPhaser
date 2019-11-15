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
	Private player As PhaserObject
	Private coin As PhaserObject
	Private score As Int
	Private scoreText As PhaserObject
	Private arrow As PhaserCursorKeys
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
	'we loaded stuff on preloadScene
End Sub

'on our previous scne we loaded all our resouces
Sub onCreate
	'get random x and y values
	player = Scene.physics.add.sprite(100, 100, "player")
	coin = Scene.physics.add.sprite(300, 200, "coin")
	
	'ensure these dont fall outside the scene
	player.SetCollideWorldBounds(True)
	coin.SetCollideWorldBounds(True)
	
	'initialie the scoreboard
	score = 0
	Dim style As Map = CreateMap("font": "20px Arial", "fill": "#fff")
	scoreText = Scene.add.text(20, 20, "Score: " & score, style)
	'trap keypress
	arrow = Scene.input.keyboard.createCursorKeys
  
End Sub

Sub onUpdate
	If Scene.physics.overlap(player, coin) Then 
		BANano.CallSub(Me, "hit", Null)
	End If

	If arrow.right.isDown Then
		'increment x of plater
		player.IncrX(3)
	else if arrow.left.isDown Then
		'decrement x of player
		player.DecrX(3)
    End If 

	If arrow.down.isDown Then
		'increment y of player
		player.IncrY(3)
	else if arrow.up.isDown Then
		'decrement y of player
		player.DecrY(3)
    End If 
End Sub	

Sub hit
	'set x and y values with random numbers
	coin.X = Scene.MathBetween(100, 600)
	coin.y = Scene.MathBetween(100, 200)
	'increment the score board
	score = score + 10
	scoreText.SetText("Score: " & score)
	'add a tween: i.e A Tween allows you to alter one or more properties of a target object over a defined period of time.
	Scene.tweens.add(player, 200, 1.2, 1.2, True)
	
End Sub