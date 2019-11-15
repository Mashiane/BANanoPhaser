B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private game As BANanoPhaser
	Private body As BANanoElement
End Sub

Sub Init
	'get the body of the page
	body = BANano.GetElement("#body")
	'empty the element
	body.Empty
	'
	game.Initialize
	game.config.title = "GameTitle"
	game.config.typeOf = game.TypeOf_AUTO
	game.config.Parent = "app"
	game.config.Width = 800
	game.config.Height = 600
	game.config.scale.mode = game.ScaleModeFIT
	game.config.scale.autoCenter = game.ScaleAutoCenterCENTER_BOTH
	game.config.physics.defaultt = "arcade"
	game.config.physics.arcade.gravity.Put("y",300)
	'initialize scenes and add them to the game
	preloadScene.Initialize(game)
	gameScene.Initialize(game)
	'add the scenes, the game starts with the top most scene
	game.addScene(preloadScene.Scene)
	game.addScene(gameScene.Scene)
	'start the game
	game.start
End Sub