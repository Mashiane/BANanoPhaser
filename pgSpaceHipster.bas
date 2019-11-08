B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private body As BANanoElement
	Private game As BANanoPhaser
	Private gameDiv As BANanoElement
	
	'global variables
	Private Scene As PhaserScene
	Private splash As BANanoObject
	Private preloadBar As BANanoObject
	Private background As BANanoObject
	Private PlayerScore As Int
	Private highestScore As Int
	Private player As BANanoObject
	Private playerSpeed As Int
End Sub


Sub Init
	'set the body of the page
	body = BANano.GetElement("#body")
	body.SetStyle(BANano.ToJson(CreateMap("margin":"0 auto","padding":"0","width":"100%", "height":"100%")))
	body.Empty
	'add the div to set the game in
	gameDiv = body.Append($"<div id="game"></div>"$).Get("#game")
	gameDiv.SetStyle(BANano.ToJson(CreateMap("margin": "10px auto", "padding": "0", "width": "800px", "height": "640px")))
		
	'initialze the game, use game element and set size
	game.Initialize
	'The Type can be Phaser.CANVAS, Phaser.WEBGL Or Phaser.AUTO. AUTO means that
	'Phaser will Try To render with WebGL, And fall back To Canvas If it fails
	'element to inject the game in
	game.SetWidth(800)
	game.SetHeight(640)
	game.SetTypeAuto(True)
	'render the game to this id
	game.SetParent("game")
	'The physics engine determines how objects interact with the world. Phaser
	'supports three physics engines out of the box: arcade, impact and matter.
	' Arcade is understood to be the simplest one to implement
	game.SetPhysicsDefault("arcade")
	
	'create a scene
	Scene = game.CreateScene("spacehipster")
	'steps in the game scene to execute
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
	game.SetScene(Scene.Scene)
	'
	game.Start
End Sub

Sub onPreload
	'load assets
	Scene.LoadImage("logo", "./assets/logo.png")
	Scene.LoadImage("preloadbar", "./assets/preloader-bar.png")
	
	Scene.SetScaleMode(game.ScaleManagerShowAll)  'scale and keep aspect ratio
	Scene.SetScalePageAlignHorizontally(True)
	Scene.SetScalepageAlignVertically(True)
	'
	'Scene.ScaleSetMinWidth(240)
	'Scene.ScaleSetMinHeight(170)
	'Scene.ScaleSetMaxWidth(2880)
	'Scene.ScaleSetMaxHeight(1920)
	'this.scale.setScreenSize(true);
	'Scene.Scale.RunMethod("setScreenSize", Array(True))
	
	'load game assets 
	Scene.LoadImage("space", "./assets/space.png")
	Scene.LoadImage("rock", "./assets/rock.png")
	Scene.LoadSpriteSheet("playership", "./assets/player.png", 12, 12)
	Scene.LoadSpriteSheet("power", "./assets/power.png", 12, 12)
	Scene.LoadImage("playerParticle", "./assets/player-particle.png")
	Scene.LoadAudio("collect", "./assets/collect.ogg")
	Scene.LoadAudio("explosion", "./assets/explosion.ogg")
End Sub

Sub onCreate
	'set bounds
	'Scene.PhysicsWorldSetBounds(0, 0, 1920, 1920)
	
	'show logo in loading screen
	Dim cx As Double = Scene.PhysicsWorldBoundsCenterX
	Dim cy As Double = Scene.PhysicsWorldBoundsCenterY
	
	Dim w As Int = Scene.PhysicsWorldBoundsWidth
	Dim h As Int = Scene.PhysicsWorldBoundsHeight
	
	'splash = Scene.AddSprite(x, y, "logo")
	'Scene.AnchorSet(splash, 0.5, 1)
	'
	'preloadBar = Scene.AddSprite(x, y + 128, "preloadbar")
	'Scene.AnchorSet(preloadBar, 0.5, 1)
	'show the space tile, repeated 
	background = Scene.AddTileSprite(0, 0, w, h, "space")
	'give it speed in x
	'Scene.AutoScroll(background, -20, x)
	
'	start game text
	'Dim t As BANanoObject = Scene.AddText1(w/2, h/2, "Tap to begin", "30px Arial", "#fff", "center")
	'Log("onCreate")
	'Log(t)
	'Scene.AnchorSet(t, 0.5, 1)	
	
	'hightest score text
	'Dim txt As String = $"Highest score: ${highestScore}"$
	'Dim htxt As BANanoObject = Scene.AddText1((w / 2), (h / 2) + 50, txt, "15px Arial", "#fff", "center")
	'Scene.AnchorSet(htxt, 0.5, 1)
	
	'create player
	player = Scene.PhysicsAddSprite(cx, cy, "playership")
	Scene.SetScale(player, 2)
	Scene.CreateAnime("fly", "playership", 5, 0, 3, -1)
	Scene.PlayAnime(player, "fly", True)
	'player initial score of zero
	PlayerScore = 0
	highestScore = 0
	playerSpeed = 120
	Scene.SetCollideWorldBounds(player, True)
	
End Sub

Sub onUpdate
	'Scene.IncrementTilePositionX(background, 100)
End Sub