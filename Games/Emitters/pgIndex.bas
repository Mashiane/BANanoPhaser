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
	CreateGame
	'start the game
	game.start
End Sub

'create the game configuration
Sub CreateGame
	game.Initialize
	game.config.typeOf = game.TypeOf_AUTO
	game.config.Width = 800
	game.config.Height = 600
	game.config.Parent = "body"
	game.config.PixelArt = True
	game.config.physics.defaultt = "arcade"
	game.config.physics.arcade.gravity.Put("y",200)
	game.config.physics.arcade.debug = False
	'initialize scenes and add them to the game
	scene1.Initialize(game)
	'add the scenes, the game starts with the top most scene
	game.addScene(scene1.Scene)
End Sub
