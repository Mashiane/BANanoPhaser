package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pgindex_subs_0 {


public static RemoteObject  _collectstar(RemoteObject _playerobj,RemoteObject _starobj) throws Exception{
try {
		Debug.PushSubsStack("collectStar (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,110);
if (RapidSub.canDelegate("collectstar")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","collectstar", _playerobj, _starobj);}
RemoteObject _newtext = RemoteObject.createImmutable("");
RemoteObject _child = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _cbiterate = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _playerx = RemoteObject.createImmutable(0);
RemoteObject _bomb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _vx = RemoteObject.createImmutable(0);
Debug.locals.put("playerObj", _playerobj);
Debug.locals.put("starObj", _starobj);
 BA.debugLineNum = 110;BA.debugLine="Sub collectStar(playerObj As BANanoObject, starObj";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="gameScene.DisableBody(starObj, True, True)";
Debug.ShouldStop(16384);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_disablebody" /*RemoteObject*/ ,(Object)(_starobj),(Object)(pgindex.__c.getField(true,"True")),(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 113;BA.debugLine="score = score + 10";
Debug.ShouldStop(65536);
pgindex._score = RemoteObject.solve(new RemoteObject[] {pgindex._score,RemoteObject.createImmutable(10)}, "+",1, 1);
 BA.debugLineNum = 114;BA.debugLine="Dim newText As String = $\"Level: ${level} - Lives";
Debug.ShouldStop(131072);
_newtext = (RemoteObject.concat(RemoteObject.createImmutable("Level: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._level))),RemoteObject.createImmutable(" - Lives: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._lives))),RemoteObject.createImmutable(" - Score: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._score))),RemoteObject.createImmutable("")));Debug.locals.put("newText", _newtext);Debug.locals.put("newText", _newtext);
 BA.debugLineNum = 115;BA.debugLine="gameScene.SetText(scoreText, newText)";
Debug.ShouldStop(262144);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_settext" /*RemoteObject*/ ,(Object)(pgindex._scoretext),(Object)(_newtext));
 BA.debugLineNum = 118;BA.debugLine="If gameScene.CountActive(stars, True) = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_countactive" /*RemoteObject*/ ,(Object)(pgindex._stars),(Object)(pgindex.__c.getField(true,"True"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 119;BA.debugLine="level = level + 1";
Debug.ShouldStop(4194304);
pgindex._level = RemoteObject.solve(new RemoteObject[] {pgindex._level,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 120;BA.debugLine="lives = lives + 1";
Debug.ShouldStop(8388608);
pgindex._lives = RemoteObject.solve(new RemoteObject[] {pgindex._lives,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 122;BA.debugLine="newText = $\"Level: ${level} - Lives: ${lives} -";
Debug.ShouldStop(33554432);
_newtext = (RemoteObject.concat(RemoteObject.createImmutable("Level: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._level))),RemoteObject.createImmutable(" - Lives: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._lives))),RemoteObject.createImmutable(" - Score: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._score))),RemoteObject.createImmutable("")));Debug.locals.put("newText", _newtext);
 BA.debugLineNum = 123;BA.debugLine="gameScene.SetText(scoreText, newText)";
Debug.ShouldStop(67108864);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_settext" /*RemoteObject*/ ,(Object)(pgindex._scoretext),(Object)(_newtext));
 BA.debugLineNum = 125;BA.debugLine="Dim child As BANanoObject";
Debug.ShouldStop(268435456);
_child = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("child", _child);
 BA.debugLineNum = 126;BA.debugLine="Dim cbIterate As BANanoObject = BANano.CallBack(";
Debug.ShouldStop(536870912);
_cbiterate = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cbiterate.setObject(pgindex._banano.runMethod(false,"CallBack",(Object)(pgindex.getObject()),(Object)(BA.ObjectToString("newStars")),(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_child.getObject())}))))));Debug.locals.put("cbIterate", _cbiterate);
 BA.debugLineNum = 127;BA.debugLine="gameScene.ChildrenIterate(stars, cbIterate)";
Debug.ShouldStop(1073741824);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_childreniterate" /*RemoteObject*/ ,(Object)(pgindex._stars),(Object)(_cbiterate));
 BA.debugLineNum = 129;BA.debugLine="Dim x As Int";
Debug.ShouldStop(1);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 130;BA.debugLine="Dim playerX As Int = gameScene.GetX(playerObj)";
Debug.ShouldStop(2);
_playerx = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(_playerobj));Debug.locals.put("playerX", _playerx);Debug.locals.put("playerX", _playerx);
 BA.debugLineNum = 131;BA.debugLine="If playerX < 400 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_playerx,BA.numberCast(double.class, 400))) { 
 BA.debugLineNum = 132;BA.debugLine="x = game.Between(400, 800)";
Debug.ShouldStop(8);
_x = pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_between" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(int.class, 800)));Debug.locals.put("x", _x);
 }else {
 BA.debugLineNum = 134;BA.debugLine="x = game.Between(0, 400)";
Debug.ShouldStop(32);
_x = pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_between" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 400)));Debug.locals.put("x", _x);
 };
 BA.debugLineNum = 137;BA.debugLine="Dim bomb As BANanoObject = gameScene.CreateInsta";
Debug.ShouldStop(256);
_bomb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bomb = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createinstance" /*RemoteObject*/ ,(Object)(pgindex._bombs),(Object)(_x),(Object)(BA.numberCast(int.class, 16)),(Object)(RemoteObject.createImmutable("bomb")));Debug.locals.put("bomb", _bomb);Debug.locals.put("bomb", _bomb);
 BA.debugLineNum = 138;BA.debugLine="Dim vx As Int = game.Between(-200, 200)";
Debug.ShouldStop(512);
_vx = pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_between" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 200))),(Object)(BA.numberCast(int.class, 200)));Debug.locals.put("vx", _vx);Debug.locals.put("vx", _vx);
 BA.debugLineNum = 139;BA.debugLine="gameScene.SetBounce(bomb, 1)";
Debug.ShouldStop(1024);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setbounce" /*RemoteObject*/ ,(Object)(_bomb),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 140;BA.debugLine="gameScene.SetCollideWorldBounds(bomb, True)";
Debug.ShouldStop(2048);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setcollideworldbounds" /*RemoteObject*/ ,(Object)(_bomb),(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 141;BA.debugLine="gameScene.SetVelocityXY(bomb, vx, 20)";
Debug.ShouldStop(4096);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityxy" /*RemoteObject*/ ,(Object)(_bomb),(Object)((_vx)),(Object)(RemoteObject.createImmutable((20))));
 BA.debugLineNum = 142;BA.debugLine="gameScene.AllowGravity(bomb, False)";
Debug.ShouldStop(8192);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_allowgravity" /*RemoteObject*/ ,(Object)(_bomb),(Object)(pgindex.__c.getField(true,"False")));
 };
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hitbomb(RemoteObject _playerobj,RemoteObject _starobj) throws Exception{
try {
		Debug.PushSubsStack("hitBomb (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,155);
if (RapidSub.canDelegate("hitbomb")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","hitbomb", _playerobj, _starobj);}
RemoteObject _newtext = RemoteObject.createImmutable("");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _playerx = RemoteObject.createImmutable(0);
Debug.locals.put("playerObj", _playerobj);
Debug.locals.put("starObj", _starobj);
 BA.debugLineNum = 155;BA.debugLine="Sub hitBomb(playerObj As BANanoObject, starObj As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="lives = lives - 1";
Debug.ShouldStop(268435456);
pgindex._lives = RemoteObject.solve(new RemoteObject[] {pgindex._lives,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 159;BA.debugLine="gameScene.PhysicsPause";
Debug.ShouldStop(1073741824);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicspause" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="Dim newText As String = $\"Level: ${level} - Lives";
Debug.ShouldStop(-2147483648);
_newtext = (RemoteObject.concat(RemoteObject.createImmutable("Level: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._level))),RemoteObject.createImmutable(" - Lives: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._lives))),RemoteObject.createImmutable(" - Score: "),pgindex.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((pgindex._score))),RemoteObject.createImmutable("")));Debug.locals.put("newText", _newtext);Debug.locals.put("newText", _newtext);
 BA.debugLineNum = 161;BA.debugLine="gameScene.SetText(scoreText, newText)";
Debug.ShouldStop(1);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_settext" /*RemoteObject*/ ,(Object)(pgindex._scoretext),(Object)(_newtext));
 BA.debugLineNum = 163;BA.debugLine="Dim x As Int";
Debug.ShouldStop(4);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 164;BA.debugLine="Dim playerX As Int = gameScene.GetX(starObj)";
Debug.ShouldStop(8);
_playerx = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(_starobj));Debug.locals.put("playerX", _playerx);Debug.locals.put("playerX", _playerx);
 BA.debugLineNum = 165;BA.debugLine="If playerX < 400 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_playerx,BA.numberCast(double.class, 400))) { 
 BA.debugLineNum = 166;BA.debugLine="x = game.Between(400, 800)";
Debug.ShouldStop(32);
_x = pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_between" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(int.class, 800)));Debug.locals.put("x", _x);
 }else {
 BA.debugLineNum = 168;BA.debugLine="x = game.Between(0, 400)";
Debug.ShouldStop(128);
_x = pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_between" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 400)));Debug.locals.put("x", _x);
 };
 BA.debugLineNum = 170;BA.debugLine="gameScene.SetX(playerObj, x)";
Debug.ShouldStop(512);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setx" /*RemoteObject*/ ,(Object)(_playerobj),(Object)(_x));
 BA.debugLineNum = 171;BA.debugLine="gameScene.PhysicsResume";
Debug.ShouldStop(1024);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsresume" /*RemoteObject*/ );
 BA.debugLineNum = 173;BA.debugLine="If lives <= 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("k",pgindex._lives,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 174;BA.debugLine="gameOver = True";
Debug.ShouldStop(8192);
pgindex._gameover = pgindex.__c.getField(true,"True");
 BA.debugLineNum = 175;BA.debugLine="gameScene.PhysicsPause";
Debug.ShouldStop(16384);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicspause" /*RemoteObject*/ );
 BA.debugLineNum = 176;BA.debugLine="gameScene.SetTint(playerObj, \"0xff0000\")";
Debug.ShouldStop(32768);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_settint" /*RemoteObject*/ ,(Object)(_playerobj),(Object)((RemoteObject.createImmutable("0xff0000"))));
 BA.debugLineNum = 177;BA.debugLine="gameScene.PlayAnime(playerObj, \"turn\", Null)";
Debug.ShouldStop(65536);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_playanime" /*RemoteObject*/ ,(Object)(_playerobj),(Object)(BA.ObjectToString("turn")),(Object)(pgindex.__c.getField(false,"Null")));
 BA.debugLineNum = 179;BA.debugLine="BANano.Location.Reload(True)";
Debug.ShouldStop(262144);
pgindex._banano.runMethod(false,"Location").runVoidMethod ("Reload",(Object)(pgindex.__c.getField(true,"True")));
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _init() throws Exception{
try {
		Debug.PushSubsStack("Init (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,19);
if (RapidSub.canDelegate("init")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","init");}
 BA.debugLineNum = 19;BA.debugLine="Sub Init";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="body = BANano.GetElement(\"#body\")";
Debug.ShouldStop(1048576);
pgindex._body = pgindex._banano.runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#body")));
 BA.debugLineNum = 22;BA.debugLine="body.Empty";
Debug.ShouldStop(2097152);
pgindex._body.runVoidMethod ("Empty");
 BA.debugLineNum = 23;BA.debugLine="body.SetStyle(BANano.ToJson(CreateMap(\"margin\":\"0";
Debug.ShouldStop(4194304);
pgindex._body.runVoidMethod ("SetStyle",(Object)(BA.ObjectToString(pgindex._banano.runMethod(false,"ToJson",(Object)((pgindex.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),RemoteObject.createImmutable(("0")),RemoteObject.createImmutable(("padding")),(RemoteObject.createImmutable("0"))})).getObject()))))));
 BA.debugLineNum = 25;BA.debugLine="score = 0";
Debug.ShouldStop(16777216);
pgindex._score = BA.numberCast(int.class, 0);
 BA.debugLineNum = 26;BA.debugLine="level = 1";
Debug.ShouldStop(33554432);
pgindex._level = BA.numberCast(int.class, 1);
 BA.debugLineNum = 27;BA.debugLine="lives = 3";
Debug.ShouldStop(67108864);
pgindex._lives = BA.numberCast(int.class, 3);
 BA.debugLineNum = 28;BA.debugLine="gameOver = False";
Debug.ShouldStop(134217728);
pgindex._gameover = pgindex.__c.getField(true,"False");
 BA.debugLineNum = 30;BA.debugLine="game.Initialize";
Debug.ShouldStop(536870912);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_initialize" /*RemoteObject*/ ,pgindex.ba);
 BA.debugLineNum = 31;BA.debugLine="game.SetParent(\"body\")";
Debug.ShouldStop(1073741824);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_setparent" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("body")));
 BA.debugLineNum = 32;BA.debugLine="game.SetWidth(800)";
Debug.ShouldStop(-2147483648);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_setwidth" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 800)));
 BA.debugLineNum = 33;BA.debugLine="game.SetHeight(600)";
Debug.ShouldStop(1);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_setheight" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 600)));
 BA.debugLineNum = 36;BA.debugLine="game.SetTypeAuto(True)";
Debug.ShouldStop(8);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_settypeauto" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 37;BA.debugLine="game.SetPhysicsDefault(\"arcade\")";
Debug.ShouldStop(16);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_setphysicsdefault" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("arcade")));
 BA.debugLineNum = 38;BA.debugLine="game.SetPhysicsArcadeGravity(CreateMap(\"y\":300))";
Debug.ShouldStop(32);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_setphysicsarcadegravity" /*RemoteObject*/ ,(Object)((pgindex.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("y")),RemoteObject.createImmutable((300))})).getObject())));
 BA.debugLineNum = 39;BA.debugLine="game.SetPhysicsArcadeDebug(False)";
Debug.ShouldStop(64);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_setphysicsarcadedebug" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"False")));
 BA.debugLineNum = 42;BA.debugLine="gameScene = game.CreateScene(\"starcatcher\")";
Debug.ShouldStop(512);
pgindex._gamescene = pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_createscene" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("starcatcher")));
 BA.debugLineNum = 45;BA.debugLine="gameScene.SetOnPreload(Me, \"onPreLoad\")";
Debug.ShouldStop(4096);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setonpreload" /*RemoteObject*/ ,(Object)(pgindex.getObject()),(Object)(RemoteObject.createImmutable("onPreLoad")));
 BA.debugLineNum = 46;BA.debugLine="gameScene.SetOnCreate(Me, \"onCreate\")";
Debug.ShouldStop(8192);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setoncreate" /*RemoteObject*/ ,(Object)(pgindex.getObject()),(Object)(RemoteObject.createImmutable("onCreate")));
 BA.debugLineNum = 47;BA.debugLine="gameScene.SetOnUpdate(Me, \"onUpdate\")";
Debug.ShouldStop(16384);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setonupdate" /*RemoteObject*/ ,(Object)(pgindex.getObject()),(Object)(RemoteObject.createImmutable("onUpdate")));
 BA.debugLineNum = 48;BA.debugLine="gameScene.SetOnShutDown(Me, \"onShutDown\")";
Debug.ShouldStop(32768);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setonshutdown" /*RemoteObject*/ ,(Object)(pgindex.getObject()),(Object)(RemoteObject.createImmutable("onShutDown")));
 BA.debugLineNum = 49;BA.debugLine="game.SetScene(gameScene.Scene)";
Debug.ShouldStop(65536);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_setscene" /*RemoteObject*/ ,(Object)(pgindex._gamescene.getField(false,"_scene" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="game.Start";
Debug.ShouldStop(131072);
pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_start" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iteratechildren(RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("iterateChildren (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,184);
if (RapidSub.canDelegate("iteratechildren")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","iteratechildren", _child);}
RemoteObject _by = RemoteObject.createImmutable(0);
Debug.locals.put("child", _child);
 BA.debugLineNum = 184;BA.debugLine="Sub iterateChildren(child As BANanoObject)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 186;BA.debugLine="Dim by As Double = game.FloatBetween(0.4, 0.8)";
Debug.ShouldStop(33554432);
_by = pgindex._game.runClassMethod (b4j.example.bananophaser.class, "_floatbetween" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0.4)),(Object)(BA.numberCast(double.class, 0.8)));Debug.locals.put("by", _by);Debug.locals.put("by", _by);
 BA.debugLineNum = 187;BA.debugLine="gameScene.SetBounceY(child, by)";
Debug.ShouldStop(67108864);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setbouncey" /*RemoteObject*/ ,(Object)(_child),(Object)(_by));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newstars(RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("newStars (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,149);
if (RapidSub.canDelegate("newstars")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","newstars", _child);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("child", _child);
 BA.debugLineNum = 149;BA.debugLine="Sub newStars(child As BANanoObject)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim x As Int = gameScene.GetX(child)";
Debug.ShouldStop(2097152);
_x = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(_child));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 151;BA.debugLine="gameScene.EnableBody(child, True, x, 0, True, Tru";
Debug.ShouldStop(4194304);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_enablebody" /*RemoteObject*/ ,(Object)(_child),(Object)(pgindex.__c.getField(true,"True")),(Object)(_x),(Object)(BA.numberCast(int.class, 0)),(Object)(pgindex.__c.getField(true,"True")),(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _oncreate() throws Exception{
try {
		Debug.PushSubsStack("onCreate (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,58);
if (RapidSub.canDelegate("oncreate")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","oncreate");}
RemoteObject _p1 = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _child = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _cbiterate = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _star = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _plyr = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _cbcollectstar = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _cbhitbomb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 58;BA.debugLine="Sub onCreate";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="gameScene.SceneAddImage(400, 300, \"sky\")";
Debug.ShouldStop(134217728);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_sceneaddimage" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(int.class, 300)),(Object)(RemoteObject.createImmutable("sky")));
 BA.debugLineNum = 62;BA.debugLine="platforms = gameScene.PhysicsAddStaticGroup";
Debug.ShouldStop(536870912);
pgindex._platforms = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddstaticgroup" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="Dim p1 As BANanoObject = gameScene.CreateInstance";
Debug.ShouldStop(1);
_p1 = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_p1 = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createinstance" /*RemoteObject*/ ,(Object)(pgindex._platforms),(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(int.class, 568)),(Object)(RemoteObject.createImmutable("ground")));Debug.locals.put("p1", _p1);Debug.locals.put("p1", _p1);
 BA.debugLineNum = 66;BA.debugLine="gameScene.SetScale(p1, 2)";
Debug.ShouldStop(2);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setscale" /*RemoteObject*/ ,(Object)(_p1),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 67;BA.debugLine="gameScene.RefreshBody(p1)";
Debug.ShouldStop(4);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_refreshbody" /*RemoteObject*/ ,(Object)(_p1));
 BA.debugLineNum = 69;BA.debugLine="gameScene.CreateInstance(platforms, 600, 400, \"gr";
Debug.ShouldStop(16);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createinstance" /*RemoteObject*/ ,(Object)(pgindex._platforms),(Object)(BA.numberCast(int.class, 600)),(Object)(BA.numberCast(int.class, 400)),(Object)(RemoteObject.createImmutable("ground")));
 BA.debugLineNum = 70;BA.debugLine="gameScene.CreateInstance(platforms, 50, 250, \"gro";
Debug.ShouldStop(32);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createinstance" /*RemoteObject*/ ,(Object)(pgindex._platforms),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 250)),(Object)(RemoteObject.createImmutable("ground")));
 BA.debugLineNum = 71;BA.debugLine="gameScene.CreateInstance(platforms, 750, 220, \"gr";
Debug.ShouldStop(64);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createinstance" /*RemoteObject*/ ,(Object)(pgindex._platforms),(Object)(BA.numberCast(int.class, 750)),(Object)(BA.numberCast(int.class, 220)),(Object)(RemoteObject.createImmutable("ground")));
 BA.debugLineNum = 73;BA.debugLine="player = gameScene.PhysicsAddSprite(100, 450, \"du";
Debug.ShouldStop(256);
pgindex._player = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddsprite" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 450)),(Object)(RemoteObject.createImmutable("dude")));
 BA.debugLineNum = 75;BA.debugLine="gameScene.SetBounce(player, 0.2)";
Debug.ShouldStop(1024);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setbounce" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.numberCast(double.class, 0.2)));
 BA.debugLineNum = 77;BA.debugLine="gameScene.SetCollideWorldBounds(player, True)";
Debug.ShouldStop(4096);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setcollideworldbounds" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="gameScene.CreateAnime(\"left\", \"dude\", 10, 0, 3, -";
Debug.ShouldStop(16384);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createanime" /*RemoteObject*/ ,(Object)(BA.ObjectToString("left")),(Object)(BA.ObjectToString("dude")),(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))));
 BA.debugLineNum = 80;BA.debugLine="gameScene.CreateAnime(\"turn\", \"dude\", 20, 4, 4, N";
Debug.ShouldStop(32768);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createanime" /*RemoteObject*/ ,(Object)(BA.ObjectToString("turn")),(Object)(BA.ObjectToString("dude")),(Object)(BA.numberCast(int.class, 20)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 4)),(Object)(pgindex.__c.getField(false,"Null")));
 BA.debugLineNum = 81;BA.debugLine="gameScene.CreateAnime(\"right\", \"dude\", 10, 5, 8,";
Debug.ShouldStop(65536);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createanime" /*RemoteObject*/ ,(Object)(BA.ObjectToString("right")),(Object)(BA.ObjectToString("dude")),(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 8)),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))));
 BA.debugLineNum = 83;BA.debugLine="gameScene.CreateCursorKeys";
Debug.ShouldStop(262144);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_createcursorkeys" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="stars = gameScene.PhysicsAddGroup(\"star\", 11, 12,";
Debug.ShouldStop(1048576);
pgindex._stars = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddgroup" /*RemoteObject*/ ,(Object)(BA.ObjectToString("star")),(Object)(BA.NumberToString(11)),(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 70)),(Object)(pgindex.__c.getField(true,"False")));
 BA.debugLineNum = 87;BA.debugLine="Dim child As BANanoObject";
Debug.ShouldStop(4194304);
_child = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("child", _child);
 BA.debugLineNum = 88;BA.debugLine="Dim cbIterate As BANanoObject = BANano.CallBack(M";
Debug.ShouldStop(8388608);
_cbiterate = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cbiterate.setObject(pgindex._banano.runMethod(false,"CallBack",(Object)(pgindex.getObject()),(Object)(BA.ObjectToString("iterateChildren")),(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_child.getObject())}))))));Debug.locals.put("cbIterate", _cbiterate);
 BA.debugLineNum = 89;BA.debugLine="gameScene.ChildrenIterate(stars, cbIterate)";
Debug.ShouldStop(16777216);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_childreniterate" /*RemoteObject*/ ,(Object)(pgindex._stars),(Object)(_cbiterate));
 BA.debugLineNum = 91;BA.debugLine="bombs = gameScene.PhysicsAddGroup1";
Debug.ShouldStop(67108864);
pgindex._bombs = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddgroup1" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="scoreText = gameScene.SceneAddText(16,16, \"Level:";
Debug.ShouldStop(268435456);
pgindex._scoretext = pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_sceneaddtext" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 16)),(Object)(BA.numberCast(int.class, 16)),(Object)(BA.ObjectToString("Level: 1 - Lives: 3 - Score: 0")),(Object)(pgindex.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("fontSize")),RemoteObject.createImmutable(("32px")),RemoteObject.createImmutable(("fill")),(RemoteObject.createImmutable("#000"))}))));
 BA.debugLineNum = 95;BA.debugLine="gameScene.PhysicsAddCollider(player, platforms)";
Debug.ShouldStop(1073741824);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddcollider" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(pgindex._platforms));
 BA.debugLineNum = 96;BA.debugLine="gameScene.PhysicsAddCollider(stars, platforms)";
Debug.ShouldStop(-2147483648);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddcollider" /*RemoteObject*/ ,(Object)(pgindex._stars),(Object)(pgindex._platforms));
 BA.debugLineNum = 98;BA.debugLine="gameScene.PhysicsAddCollider(bombs, platforms)";
Debug.ShouldStop(2);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddcollider" /*RemoteObject*/ ,(Object)(pgindex._bombs),(Object)(pgindex._platforms));
 BA.debugLineNum = 100;BA.debugLine="Dim star As BANanoObject";
Debug.ShouldStop(8);
_star = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("star", _star);
 BA.debugLineNum = 101;BA.debugLine="Dim plyr As BANanoObject";
Debug.ShouldStop(16);
_plyr = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("plyr", _plyr);
 BA.debugLineNum = 102;BA.debugLine="Dim cbCollectStar As BANanoObject = BANano.CallBa";
Debug.ShouldStop(32);
_cbcollectstar = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cbcollectstar.setObject(pgindex._banano.runMethod(false,"CallBack",(Object)(pgindex.getObject()),(Object)(BA.ObjectToString("collectStar")),(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_plyr.getObject()),(_star.getObject())}))))));Debug.locals.put("cbCollectStar", _cbcollectstar);
 BA.debugLineNum = 103;BA.debugLine="gameScene.PhysicsAddOverlap(player, stars, cbColl";
Debug.ShouldStop(64);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddoverlap" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(pgindex._stars),(Object)(_cbcollectstar),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("com.ab.banano.BANanoObject"), pgindex.__c.getField(false,"Null")),(Object)(pgindex._gamescene.getField(false,"_physics" /*RemoteObject*/ )));
 BA.debugLineNum = 105;BA.debugLine="Dim cbHitBomb As BANanoObject = BANano.CallBack(M";
Debug.ShouldStop(256);
_cbhitbomb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cbhitbomb.setObject(pgindex._banano.runMethod(false,"CallBack",(Object)(pgindex.getObject()),(Object)(BA.ObjectToString("hitBomb")),(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_plyr.getObject()),(_star.getObject())}))))));Debug.locals.put("cbHitBomb", _cbhitbomb);
 BA.debugLineNum = 106;BA.debugLine="gameScene.PhysicsAddOverlap(player, bombs, cbHitB";
Debug.ShouldStop(512);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddoverlap" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(pgindex._bombs),(Object)(_cbhitbomb),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("com.ab.banano.BANanoObject"), pgindex.__c.getField(false,"Null")),(Object)(pgindex._gamescene.getField(false,"_physics" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onpreload() throws Exception{
try {
		Debug.PushSubsStack("onPreLoad (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,190);
if (RapidSub.canDelegate("onpreload")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","onpreload");}
 BA.debugLineNum = 190;BA.debugLine="Sub onPreLoad";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 192;BA.debugLine="gameScene.SetScaleMode(game.ScaleManagerShowAll)";
Debug.ShouldStop(-2147483648);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setscalemode" /*RemoteObject*/ ,(Object)(pgindex._game.getField(true,"_scalemanagershowall" /*RemoteObject*/ )));
 BA.debugLineNum = 193;BA.debugLine="gameScene.SetScalePageAlignHorizontally(True)";
Debug.ShouldStop(1);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setscalepagealignhorizontally" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 194;BA.debugLine="gameScene.SetScalepageAlignVertically(True)";
Debug.ShouldStop(2);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setscalepagealignvertically" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 199;BA.debugLine="gameScene.SceneLoadImage(\"bomb\", \"./assets/bomb.p";
Debug.ShouldStop(64);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("bomb")),(Object)(RemoteObject.createImmutable("./assets/bomb.png")));
 BA.debugLineNum = 200;BA.debugLine="gameScene.SceneLoadImage(\"ground\", \"./assets/plat";
Debug.ShouldStop(128);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ground")),(Object)(RemoteObject.createImmutable("./assets/platform.png")));
 BA.debugLineNum = 201;BA.debugLine="gameScene.SceneLoadImage(\"sky\", \"./assets/sky.png";
Debug.ShouldStop(256);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("sky")),(Object)(RemoteObject.createImmutable("./assets/sky.png")));
 BA.debugLineNum = 202;BA.debugLine="gameScene.SceneLoadImage(\"star\", \"./assets/star.p";
Debug.ShouldStop(512);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("star")),(Object)(RemoteObject.createImmutable("./assets/star.png")));
 BA.debugLineNum = 203;BA.debugLine="gameScene.SceneLoadSpriteSheet(\"dude\", \"./assets/";
Debug.ShouldStop(1024);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadspritesheet" /*RemoteObject*/ ,(Object)(BA.ObjectToString("dude")),(Object)(BA.ObjectToString("./assets/dude.png")),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 48)));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onshutdown() throws Exception{
try {
		Debug.PushSubsStack("onShutDown (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,55);
if (RapidSub.canDelegate("onshutdown")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","onshutdown");}
 BA.debugLineNum = 55;BA.debugLine="Sub onShutDown";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onupdate() throws Exception{
try {
		Debug.PushSubsStack("onUpdate (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,207);
if (RapidSub.canDelegate("onupdate")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","onupdate");}
 BA.debugLineNum = 207;BA.debugLine="Sub onUpdate";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="If gameOver Then";
Debug.ShouldStop(32768);
if (pgindex._gameover.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 209;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 213;BA.debugLine="If gameScene.LeftIsDown Then";
Debug.ShouldStop(1048576);
if (pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_leftisdown" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 214;BA.debugLine="gameScene.SetVelocityX(player, -160)";
Debug.ShouldStop(2097152);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityx" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.numberCast(int.class, -(double) (0 + 160))));
 BA.debugLineNum = 215;BA.debugLine="gameScene.PlayAnime(player, \"left\", True)";
Debug.ShouldStop(4194304);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_playanime" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.ObjectToString("left")),(Object)((pgindex.__c.getField(true,"True"))));
 }else 
{ BA.debugLineNum = 216;BA.debugLine="else if gameScene.RightIsDown Then";
Debug.ShouldStop(8388608);
if (pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_rightisdown" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 217;BA.debugLine="gameScene.SetVelocityX(player, 160)";
Debug.ShouldStop(16777216);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityx" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.numberCast(int.class, 160)));
 BA.debugLineNum = 218;BA.debugLine="gameScene.PlayAnime(player, \"right\", True)";
Debug.ShouldStop(33554432);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_playanime" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.ObjectToString("right")),(Object)((pgindex.__c.getField(true,"True"))));
 }else {
 BA.debugLineNum = 220;BA.debugLine="gameScene.SetVelocityX(player, 0)";
Debug.ShouldStop(134217728);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityx" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 221;BA.debugLine="gameScene.PlayAnime(player, \"turn\", Null)";
Debug.ShouldStop(268435456);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_playanime" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.ObjectToString("turn")),(Object)(pgindex.__c.getField(false,"Null")));
 }}
;
 BA.debugLineNum = 224;BA.debugLine="If gameScene.UpIsDown And gameScene.IsBodyTouchin";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_upisdown" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_isbodytouchingdown" /*RemoteObject*/ ,(Object)(pgindex._player)))) { 
 BA.debugLineNum = 225;BA.debugLine="gameScene.SetVelocityY(player, -330)";
Debug.ShouldStop(1);
pgindex._gamescene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityy" /*RemoteObject*/ ,(Object)(pgindex._player),(Object)(BA.numberCast(int.class, -(double) (0 + 330))));
 };
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano";
pgindex._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 4;BA.debugLine="Private body As BANanoElement";
pgindex._body = RemoteObject.createNew ("com.ab.banano.BANanoElement");
 //BA.debugLineNum = 5;BA.debugLine="Private game As BANanoPhaser";
pgindex._game = RemoteObject.createNew ("b4j.example.bananophaser");
 //BA.debugLineNum = 6;BA.debugLine="Private platforms As BANanoObject";
pgindex._platforms = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 7;BA.debugLine="Private player As BANanoObject";
pgindex._player = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 8;BA.debugLine="Private stars As BANanoObject";
pgindex._stars = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 9;BA.debugLine="Private score As Int";
pgindex._score = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Private level As Int";
pgindex._level = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Private lives As Int";
pgindex._lives = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Private scoreText As BANanoObject";
pgindex._scoretext = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 13;BA.debugLine="Private bombs As BANanoObject";
pgindex._bombs = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 14;BA.debugLine="Private gameOver As Boolean";
pgindex._gameover = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 15;BA.debugLine="Private gameScene As PhaserScene";
pgindex._gamescene = RemoteObject.createNew ("b4j.example.phaserscene");
 //BA.debugLineNum = 16;BA.debugLine="Private livesText As BANanoObject";
pgindex._livestext = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}