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
	body.Append($"Game 4: Exploring Tweening</h1>"$)
	body.Append($"<div id="app"></div>"$)
	body.Append($"<p>Use the arrow keys to move around and collect the coins.</p>"$)
	
	'
	game.Initialize
	game.config.backgroundColor = "#3498db"
	game.config.Parent = "app"
	game.config.Width = 700
	game.config.Height = 300
	game.config.physics.defaultt = "arcade"
	
	'initialize scenes and add them to the game
	preloadScene.Initialize(game)
	gameScene.Initialize(game)
	'add the scenes, the game starts with the top most scene
	game.addScene(preloadScene.Scene)
	game.addScene(gameScene.Scene)
	'start the game
	game.start
End Sub
