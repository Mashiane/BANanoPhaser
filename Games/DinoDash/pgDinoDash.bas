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
	Private userform As BANanoElement
	Private scoreinput As BANanoElement
	Private userName As String
End Sub


Sub Init
	'set the body of the page
	body = BANano.GetElement("#body")
	body.Empty
	body.Append($"<section id="header" class="section">
    <div class="inner">
        <div id='canvas'></div>
        <div>
            <div id='form'>
                <span class="icon major fa-cloud"></span>
                <h1 id='enter'>Enter your name to play:</h1>
                <br>
                <form id="user_form">
                    <input id="user_input" type="text" name="user" required />
                    <br>
                    <input type="submit" value="Submit" />
                </form>
            </div>
        </div>
    </div>
</section>"$)
	'try and set the focus to the name
	BANano.Window.GetField("document").RunMethod("getElementById", Array("user_input")).RunMethod("focus", Null)
	userform = BANano.GetElement("#user_form")
	'add an event listener to the form that calls createUser
	Dim e As BANanoEvent
	userform.addEventListener("submit", BANano.CallBack(Me, "createUser", Array(e)), True)
	'prepare the game for launch
	CreateGame
End Sub

Sub createUser(e As BANanoEvent)
	e.PreventDefault
	'get the user name
	userName = BANano.GetElement("#user_input").GetValue
	'hide the form
	BANano.GetElement("#form").SetStyle(BANano.ToJson(CreateMap("display":"none")))
	'add the user
	addUser(0)
	'start the game
	game.start
End Sub

Sub addUser(score As Long)
	BANano.SetLocalStorage(userName, score)
End Sub

'set the game configuration
Sub CreateGame
	game.Initialize
	game.config.typeOf = game.TypeOf_WEBGL
	game.config.Width = 800
	game.config.Height = 600
	game.config.Parent = "canvas"
	game.config.PixelArt = True
	game.config.physics.defaultt = "arcade"
	game.config.physics.arcade.gravity.Put("y",1000)
	game.config.physics.arcade.debug = False
	'initialize scenes and add them to the game
	titleOf.Initialize(game)
	gameOf.Initialize(game) 
	'add the scenes, the game starts with the top most scene
	game.addScene(titleOf.TitleScene)
	game.addScene(gameOf.GameScene)
End Sub
