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
	'set the style for the body of the page via code
	Dim bstyle As Map = CreateMap()
	bstyle.Put("margin", "0")
	bstyle.Put("padding", "0")
	bstyle.Put("width", "100%")
	bstyle.Put("height", "100%")
	bstyle.Put("display", "flex")
	bstyle.Put("justify-content", "center")
	bstyle.Put("align-content", "center")
	body.SetStyle(BANano.ToJson(bstyle))
	'empty the element
	body.Empty
	'add the game div
	Dim app As BANanoElement = body.Append($"<div id="app"></div>"$).Get("#app")
	app.SetStyle(BANano.ToJson(CreateMap("margin": "0 auto", "padding": "0", "align-self": "center")))
	'
	CreateGame
	'start the game
	game.start
End Sub

'create the game configuration
Sub CreateGame
	game.Initialize
	game.config.title = "Approximately"
	game.config.typeOf = game.TypeOf_AUTO
	game.config.Parent = "app"
	game.config.Width = 800
	game.config.Height = 600
	game.config.scale.mode = game.ScaleModeFIT
	game.config.scale.autoCenter = game.ScaleAutoCenterCENTER_BOTH
	game.config.physics.defaultt = "arcade"
	game.config.physics.arcade.gravity.Put("y",300)
	game.config.autoFocus = True
	game.config.render.antialias = True
	game.config.render.transparent = False
	'initialize scenes and add them to the game
	preloadScene.Initialize(game)
	gameScene.Initialize(game) 
	'add the scenes, the game starts with the top most scene
	game.addScene(preloadScene.Scene)
	game.addScene(gameScene.Scene)
End Sub
