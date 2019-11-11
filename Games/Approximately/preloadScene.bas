B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public Scene As PhaserScene
	Private progressBar As PhaserObject
	Private progressBox As PhaserObject
	Private BANano As BANano
	Private percentText As PhaserObject
	Private loadingText As PhaserObject
End Sub

'the game title
Sub Initialize(game As BANanoPhaser)
	'create a scene and give it a unique key 
	Scene = game.CreateScene("PreloadScene")
	Scene.SetOnPreload(Me, "onPreLoad")
	Scene.SetOnCreate(Me, "onCreate")
	Scene.SetOnUpdate(Me, "onUpdate")
End Sub

Sub onPreload
	progressBar = Scene.add.graphics
	progressBox = Scene.add.graphics
	progressBox.fillStyle("0x222222", 0.8)
	progressBox.fillRect(240, 270, 320, 50)
	'
	Dim width As Int = Scene.cameras.mainc.width
	Dim height As Int = Scene.cameras.mainc.height
	'
	Dim x As Int = width / 2
	Dim y As Int = (height / 2) - 50
	loadingText = Scene.make.text(x, y, "Loading...", "20px monospace", "#ffffff")
	'loadingText.setOrigin(0.5, 0.5)
	'
	Dim x1 As Int = width / 2
	Dim y1 As Int = (height / 2) - 5
	percentText = Scene.make.text(x1, y1, "0%", "18px monospace", "#ffffff")
	'percentText.setOrigin(0.5, 0.5)
	'
	Dim value As Double
	Dim onloadCB As BANanoObject = BANano.CallBack(Me, "onLoad", Array(value))
	Scene.load.on("progress", onloadCB)
	'
	Dim onCompleteCB As BANanoObject = BANano.CallBack(Me, "onComplete", Null)
	Scene.load.on("complete", onCompleteCB)
	
	'load resources
	Scene.load.image("separator", "./assets/separator.png")
	Scene.load.image("playerBall", "./assets/playerBall.png")
	Scene.load.image("guessBall", "./assets/guessBall.png")
	Scene.load.image("growButton", "./assets/growButton.png")
	Scene.load.image("checkButton", "./assets/checkButton.png")
	Scene.load.image("nextButton", "./assets/nextButton.png")
	Scene.load.image("retryButton", "./assets/retryButton.png")
	Scene.load.image("addButton", "./assets/addButton.png")
	Scene.load.image("disabledGrowButton", "./assets/disabledGrowButton.png")
	Scene.load.image("disabledAddButton", "./assets/disabledAddButton.png")
	'load google font script
	Scene.load.script("webfont", "https://ajax.googleapis.com/ajax/libs/webfont/1.6.26/webfont.js")
End Sub

Sub onLoad(value As Double)
	Dim perc As String = Scene.Percentage(value)
	Dim strVal As String = Scene.Cstr(perc) & "%"
	percentText.setText(strVal)
	progressBar.clear
	progressBar.fillStyle("0xffffff", 1)
	progressBar.fillRect(250, 280, 300 * value, 30)
End Sub

Sub onComplete
	progressBar.destroy
	progressBox.destroy
	loadingText.destroy
	percentText.destroy
	Scene.Start(gameScene.Scene.name)
End Sub

Sub onCreate
End Sub

Sub onUpdate
End Sub