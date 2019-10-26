package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pgbreakout_subs_0 {


public static RemoteObject  _hitbrick(RemoteObject _bll,RemoteObject _bick) throws Exception{
try {
		Debug.PushSubsStack("hitBrick (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,200);
if (RapidSub.canDelegate("hitbrick")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","hitbrick", _bll, _bick);}
RemoteObject _vx = RemoteObject.createImmutable(0);
RemoteObject _randnum = RemoteObject.createImmutable(0);
Debug.locals.put("bll", _bll);
Debug.locals.put("bick", _bick);
 BA.debugLineNum = 200;BA.debugLine="Sub hitBrick(bll As BANanoObject, bick As BANanoOb";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Scene.DisableBody(bick, True, True)";
Debug.ShouldStop(256);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_disablebody" /*RemoteObject*/ ,(Object)(_bick),(Object)(pgbreakout.__c.getField(true,"True")),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 202;BA.debugLine="Dim vx As Int = Scene.getBodyVelocityX(bll)";
Debug.ShouldStop(512);
_vx = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getbodyvelocityx" /*RemoteObject*/ ,(Object)(_bll));Debug.locals.put("vx", _vx);Debug.locals.put("vx", _vx);
 BA.debugLineNum = 203;BA.debugLine="If vx = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_vx,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 204;BA.debugLine="Dim randNum As Double = Scene.random";
Debug.ShouldStop(2048);
_randnum = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_random" /*RemoteObject*/ );Debug.locals.put("randNum", _randnum);Debug.locals.put("randNum", _randnum);
 BA.debugLineNum = 205;BA.debugLine="If randNum >= 0.5 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",_randnum,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 206;BA.debugLine="Scene.SetBodyVelocityX(bll, 150)";
Debug.ShouldStop(8192);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setbodyvelocityx" /*RemoteObject*/ ,(Object)(_bll),(Object)(BA.numberCast(int.class, 150)));
 }else {
 BA.debugLineNum = 208;BA.debugLine="Scene.SetBodyVelocityX(bll, -150)";
Debug.ShouldStop(32768);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setbodyvelocityx" /*RemoteObject*/ ,(Object)(_bll),(Object)(BA.numberCast(int.class, -(double) (0 + 150))));
 };
 };
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hitplayer(RemoteObject _objball,RemoteObject _objplayer) throws Exception{
try {
		Debug.PushSubsStack("hitPlayer (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,218);
if (RapidSub.canDelegate("hitplayer")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","hitplayer", _objball, _objplayer);}
RemoteObject _vy = RemoteObject.createImmutable(0);
RemoteObject _newxvelocity = RemoteObject.createImmutable(0);
RemoteObject _bx = RemoteObject.createImmutable(0);
RemoteObject _px = RemoteObject.createImmutable(0);
Debug.locals.put("objBall", _objball);
Debug.locals.put("objPlayer", _objplayer);
 BA.debugLineNum = 218;BA.debugLine="Sub hitPlayer(objBall As BANanoObject, objPlayer A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 220;BA.debugLine="Dim vy As Int = Scene.GetBodyVelocityY(objBall)";
Debug.ShouldStop(134217728);
_vy = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getbodyvelocityy" /*RemoteObject*/ ,(Object)(_objball));Debug.locals.put("vy", _vy);Debug.locals.put("vy", _vy);
 BA.debugLineNum = 221;BA.debugLine="vy = vy - 5";
Debug.ShouldStop(268435456);
_vy = RemoteObject.solve(new RemoteObject[] {_vy,RemoteObject.createImmutable(5)}, "-",1, 1);Debug.locals.put("vy", _vy);
 BA.debugLineNum = 222;BA.debugLine="Scene.SetVelocityY(objBall, vy)";
Debug.ShouldStop(536870912);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityy" /*RemoteObject*/ ,(Object)(_objball),(Object)(_vy));
 BA.debugLineNum = 224;BA.debugLine="Dim newXVelocity As Int = Scene.GetBodyVelocityX(";
Debug.ShouldStop(-2147483648);
_newxvelocity = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getbodyvelocityx" /*RemoteObject*/ ,(Object)(_objball));Debug.locals.put("newXVelocity", _newxvelocity);Debug.locals.put("newXVelocity", _newxvelocity);
 BA.debugLineNum = 225;BA.debugLine="newXVelocity = Scene.absolute(newXVelocity)";
Debug.ShouldStop(1);
_newxvelocity = BA.numberCast(int.class, pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_absolute" /*RemoteObject*/ ,(Object)(_newxvelocity)));Debug.locals.put("newXVelocity", _newxvelocity);
 BA.debugLineNum = 226;BA.debugLine="newXVelocity = newXVelocity + 5";
Debug.ShouldStop(2);
_newxvelocity = RemoteObject.solve(new RemoteObject[] {_newxvelocity,RemoteObject.createImmutable(5)}, "+",1, 1);Debug.locals.put("newXVelocity", _newxvelocity);
 BA.debugLineNum = 228;BA.debugLine="Dim bx As Int = Scene.GetX(objBall)";
Debug.ShouldStop(8);
_bx = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(_objball));Debug.locals.put("bx", _bx);Debug.locals.put("bx", _bx);
 BA.debugLineNum = 229;BA.debugLine="Dim px As Int = Scene.GetX(objPlayer)";
Debug.ShouldStop(16);
_px = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(_objplayer));Debug.locals.put("px", _px);Debug.locals.put("px", _px);
 BA.debugLineNum = 231;BA.debugLine="If bx < px Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_bx,BA.numberCast(double.class, _px))) { 
 BA.debugLineNum = 232;BA.debugLine="newXVelocity = newXVelocity * (0 - 1)";
Debug.ShouldStop(128);
_newxvelocity = RemoteObject.solve(new RemoteObject[] {_newxvelocity,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),RemoteObject.createImmutable(1)}, "-",1, 1))}, "*",0, 1);Debug.locals.put("newXVelocity", _newxvelocity);
 BA.debugLineNum = 233;BA.debugLine="Scene.SetVelocityX(objBall, newXVelocity)";
Debug.ShouldStop(256);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityx" /*RemoteObject*/ ,(Object)(_objball),(Object)(_newxvelocity));
 }else {
 BA.debugLineNum = 235;BA.debugLine="Scene.SetVelocityX(objBall, newXVelocity)";
Debug.ShouldStop(1024);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityx" /*RemoteObject*/ ,(Object)(_objball),(Object)(_newxvelocity));
 };
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Init (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,25);
if (RapidSub.canDelegate("init")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","init");}
 BA.debugLineNum = 25;BA.debugLine="Sub Init";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="body = BANano.GetElement(\"#body\")";
Debug.ShouldStop(67108864);
pgbreakout._body = pgbreakout._banano.runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#body")));
 BA.debugLineNum = 28;BA.debugLine="body.SetStyle(BANano.ToJson(CreateMap(\"margin\":\"0";
Debug.ShouldStop(134217728);
pgbreakout._body.runVoidMethod ("SetStyle",(Object)(BA.ObjectToString(pgbreakout._banano.runMethod(false,"ToJson",(Object)((pgbreakout.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),RemoteObject.createImmutable(("0 auto")),RemoteObject.createImmutable(("padding")),RemoteObject.createImmutable(("0")),RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("100%")),RemoteObject.createImmutable(("height")),(RemoteObject.createImmutable("100%"))})).getObject()))))));
 BA.debugLineNum = 29;BA.debugLine="body.Empty";
Debug.ShouldStop(268435456);
pgbreakout._body.runVoidMethod ("Empty");
 BA.debugLineNum = 32;BA.debugLine="gameDiv = body.Append($\"<div id=\"game\"></div>\"$).";
Debug.ShouldStop(-2147483648);
pgbreakout._gamediv = pgbreakout._body.runMethod(false,"Append",(Object)((RemoteObject.createImmutable("<div id=\"game\"></div>")))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("#game"))));
 BA.debugLineNum = 33;BA.debugLine="gameDiv.SetStyle(BANano.ToJson(CreateMap(\"margin\"";
Debug.ShouldStop(1);
pgbreakout._gamediv.runVoidMethod ("SetStyle",(Object)(BA.ObjectToString(pgbreakout._banano.runMethod(false,"ToJson",(Object)((pgbreakout.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),RemoteObject.createImmutable(("10px auto")),RemoteObject.createImmutable(("padding")),RemoteObject.createImmutable(("0")),RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("800px")),RemoteObject.createImmutable(("height")),(RemoteObject.createImmutable("640px"))})).getObject()))))));
 BA.debugLineNum = 36;BA.debugLine="game.Initialize";
Debug.ShouldStop(8);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_initialize" /*RemoteObject*/ ,pgbreakout.ba);
 BA.debugLineNum = 39;BA.debugLine="game.SetTypeAuto(True)";
Debug.ShouldStop(64);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_settypeauto" /*RemoteObject*/ ,(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 41;BA.debugLine="game.SetParent(\"game\")";
Debug.ShouldStop(256);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setparent" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("game")));
 BA.debugLineNum = 42;BA.debugLine="game.SetWidth(800)";
Debug.ShouldStop(512);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setwidth" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 800)));
 BA.debugLineNum = 43;BA.debugLine="game.SetHeight(640)";
Debug.ShouldStop(1024);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setheight" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 640)));
 BA.debugLineNum = 45;BA.debugLine="game.SetScaleMode(game.ScaleModeRESIZE)";
Debug.ShouldStop(4096);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setscalemode" /*RemoteObject*/ ,(Object)(pgbreakout._game.getField(true,"_scalemoderesize" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="game.SetScaleAutoCenter(game.ScaleCenterCENTER_BO";
Debug.ShouldStop(16384);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setscaleautocenter" /*RemoteObject*/ ,(Object)(pgbreakout._game.getField(true,"_scalecentercenter_both" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="game.SetPhysicsDefault(\"arcade\")";
Debug.ShouldStop(262144);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setphysicsdefault" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("arcade")));
 BA.debugLineNum = 52;BA.debugLine="game.SetPhysicsArcadeGravity(False)";
Debug.ShouldStop(524288);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setphysicsarcadegravity" /*RemoteObject*/ ,(Object)((pgbreakout.__c.getField(true,"False"))));
 BA.debugLineNum = 55;BA.debugLine="Scene = game.CreateScene(\"breakout\")";
Debug.ShouldStop(4194304);
pgbreakout._scene = pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_createscene" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("breakout")));
 BA.debugLineNum = 57;BA.debugLine="Scene.SetOnPreload(Me, \"onPreLoad\")";
Debug.ShouldStop(16777216);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setonpreload" /*RemoteObject*/ ,(Object)(pgbreakout.getObject()),(Object)(RemoteObject.createImmutable("onPreLoad")));
 BA.debugLineNum = 58;BA.debugLine="Scene.SetOnCreate(Me, \"onCreate\")";
Debug.ShouldStop(33554432);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setoncreate" /*RemoteObject*/ ,(Object)(pgbreakout.getObject()),(Object)(RemoteObject.createImmutable("onCreate")));
 BA.debugLineNum = 59;BA.debugLine="Scene.SetOnUpdate(Me, \"onUpdate\")";
Debug.ShouldStop(67108864);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setonupdate" /*RemoteObject*/ ,(Object)(pgbreakout.getObject()),(Object)(RemoteObject.createImmutable("onUpdate")));
 BA.debugLineNum = 60;BA.debugLine="game.SetScene(Scene.Scene)";
Debug.ShouldStop(134217728);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_setscene" /*RemoteObject*/ ,(Object)(pgbreakout._scene.getField(false,"_scene" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="game.Start";
Debug.ShouldStop(536870912);
pgbreakout._game.runClassMethod (b4j.example.bananophaser.class, "_start" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isgameover() throws Exception{
try {
		Debug.PushSubsStack("isGameOver (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,173);
if (RapidSub.canDelegate("isgameover")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","isgameover");}
RemoteObject _wbh = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
 BA.debugLineNum = 173;BA.debugLine="Sub isGameOver As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Dim wbh As Int = Scene.PhysicsWorldBoundsHeight";
Debug.ShouldStop(8192);
_wbh = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getphysicsworldboundsheight" /*RemoteObject*/ );Debug.locals.put("wbh", _wbh);Debug.locals.put("wbh", _wbh);
 BA.debugLineNum = 175;BA.debugLine="Dim y As Int = Scene.GetBodyY(ball)";
Debug.ShouldStop(16384);
_y = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getbodyy" /*RemoteObject*/ ,(Object)(pgbreakout._ball));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 177;BA.debugLine="If y > wbh Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_y,BA.numberCast(double.class, _wbh))) { 
 BA.debugLineNum = 178;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return pgbreakout.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 180;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return pgbreakout.__c.getField(true,"False");
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isgamewon() throws Exception{
try {
		Debug.PushSubsStack("isGameWon (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,185);
if (RapidSub.canDelegate("isgamewon")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","isgamewon");}
RemoteObject _vb = RemoteObject.createImmutable(0);
RemoteObject _yb = RemoteObject.createImmutable(0);
RemoteObject _rb = RemoteObject.createImmutable(0);
RemoteObject _allactive = RemoteObject.createImmutable(0);
 BA.debugLineNum = 185;BA.debugLine="Sub isGameWon As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="Dim vb As Int = Scene.CountActive(violetBricks, T";
Debug.ShouldStop(33554432);
_vb = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_countactive" /*RemoteObject*/ ,(Object)(pgbreakout._violetbricks),(Object)(pgbreakout.__c.getField(true,"True")));Debug.locals.put("vb", _vb);Debug.locals.put("vb", _vb);
 BA.debugLineNum = 187;BA.debugLine="Dim yb As Int = Scene.CountActive(yellowBricks, T";
Debug.ShouldStop(67108864);
_yb = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_countactive" /*RemoteObject*/ ,(Object)(pgbreakout._yellowbricks),(Object)(pgbreakout.__c.getField(true,"True")));Debug.locals.put("yb", _yb);Debug.locals.put("yb", _yb);
 BA.debugLineNum = 188;BA.debugLine="Dim rb As Int = Scene.CountActive(redBricks, True";
Debug.ShouldStop(134217728);
_rb = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_countactive" /*RemoteObject*/ ,(Object)(pgbreakout._redbricks),(Object)(pgbreakout.__c.getField(true,"True")));Debug.locals.put("rb", _rb);Debug.locals.put("rb", _rb);
 BA.debugLineNum = 190;BA.debugLine="Dim allActive As Int = vb + yb + rb";
Debug.ShouldStop(536870912);
_allactive = RemoteObject.solve(new RemoteObject[] {_vb,_yb,_rb}, "++",2, 1);Debug.locals.put("allActive", _allactive);Debug.locals.put("allActive", _allactive);
 BA.debugLineNum = 191;BA.debugLine="If allActive = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_allactive,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 192;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return pgbreakout.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 194;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) return pgbreakout.__c.getField(true,"False");
 };
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _oncreate() throws Exception{
try {
		Debug.PushSubsStack("onCreate (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,120);
if (RapidSub.canDelegate("oncreate")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","oncreate");}
RemoteObject _currentball = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _currentplayer = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _cbhitbrick = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _cbhitplayer = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _txtx = RemoteObject.createImmutable(0);
RemoteObject _txty = RemoteObject.createImmutable(0);
 BA.debugLineNum = 120;BA.debugLine="Sub onCreate";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Log(\"creating...\")";
Debug.ShouldStop(16777216);
pgbreakout.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("creating...")));
 BA.debugLineNum = 123;BA.debugLine="player = Scene.PhysicsAddSprite(400, 600, \"paddle";
Debug.ShouldStop(67108864);
pgbreakout._player = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddsprite" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(int.class, 600)),(Object)(RemoteObject.createImmutable("paddle")));
 BA.debugLineNum = 124;BA.debugLine="ball = Scene.PhysicsAddSprite(400, 565, \"ball\")";
Debug.ShouldStop(134217728);
pgbreakout._ball = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddsprite" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(int.class, 565)),(Object)(RemoteObject.createImmutable("ball")));
 BA.debugLineNum = 126;BA.debugLine="violetBricks = Scene.PhysicsAddGroup(\"brick1\", 9,";
Debug.ShouldStop(536870912);
pgbreakout._violetbricks = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddgroup" /*RemoteObject*/ ,(Object)(BA.ObjectToString("brick1")),(Object)(BA.NumberToString(9)),(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 140)),(Object)(BA.numberCast(int.class, 70)),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 127;BA.debugLine="yellowBricks = Scene.PhysicsAddGroup(\"brick2\", 9,";
Debug.ShouldStop(1073741824);
pgbreakout._yellowbricks = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddgroup" /*RemoteObject*/ ,(Object)(BA.ObjectToString("brick2")),(Object)(BA.NumberToString(9)),(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.numberCast(int.class, 70)),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 128;BA.debugLine="redBricks = Scene.PhysicsAddGroup(\"brick3\", 9, 80";
Debug.ShouldStop(-2147483648);
pgbreakout._redbricks = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddgroup" /*RemoteObject*/ ,(Object)(BA.ObjectToString("brick3")),(Object)(BA.NumberToString(9)),(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 40)),(Object)(BA.numberCast(int.class, 70)),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 130;BA.debugLine="Scene.CreateCursorKeys";
Debug.ShouldStop(2);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_createcursorkeys" /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="Scene.SetCollideWorldBounds(player, True)";
Debug.ShouldStop(8);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setcollideworldbounds" /*RemoteObject*/ ,(Object)(pgbreakout._player),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 133;BA.debugLine="Scene.SetCollideWorldBounds(ball, True)";
Debug.ShouldStop(16);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setcollideworldbounds" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 135;BA.debugLine="Scene.SetBounceXY(ball, 1, 1)";
Debug.ShouldStop(64);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setbouncexy" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(RemoteObject.createImmutable((1))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 137;BA.debugLine="Scene.SetPhysicsWorldCheckCollisionDown(False)";
Debug.ShouldStop(256);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setphysicsworldcheckcollisiondown" /*RemoteObject*/ ,(Object)(pgbreakout.__c.getField(true,"False")));
 BA.debugLineNum = 139;BA.debugLine="Dim currentBall As BANanoObject";
Debug.ShouldStop(1024);
_currentball = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("currentBall", _currentball);
 BA.debugLineNum = 140;BA.debugLine="Dim currentPlayer As BANanoObject";
Debug.ShouldStop(2048);
_currentplayer = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("currentPlayer", _currentplayer);
 BA.debugLineNum = 141;BA.debugLine="Dim cbHitBrick As BANanoObject = BANano.CallBack(";
Debug.ShouldStop(4096);
_cbhitbrick = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cbhitbrick.setObject(pgbreakout._banano.runMethod(false,"CallBack",(Object)(pgbreakout.getObject()),(Object)(BA.ObjectToString("hitBrick")),(Object)(pgbreakout.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_currentball.getObject()),(_currentplayer.getObject())}))))));Debug.locals.put("cbHitBrick", _cbhitbrick);
 BA.debugLineNum = 142;BA.debugLine="Scene.PhysicsAddCollider5(ball, violetBricks, cbH";
Debug.ShouldStop(8192);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddcollider5" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(pgbreakout._violetbricks),(Object)(_cbhitbrick),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("com.ab.banano.BANanoObject"), pgbreakout.__c.getField(false,"Null")),(Object)(pgbreakout._scene.getField(false,"_scene" /*RemoteObject*/ )));
 BA.debugLineNum = 143;BA.debugLine="Scene.PhysicsAddCollider5(ball, yellowBricks, cbH";
Debug.ShouldStop(16384);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddcollider5" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(pgbreakout._yellowbricks),(Object)(_cbhitbrick),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("com.ab.banano.BANanoObject"), pgbreakout.__c.getField(false,"Null")),(Object)(pgbreakout._scene.getField(false,"_scene" /*RemoteObject*/ )));
 BA.debugLineNum = 144;BA.debugLine="Scene.PhysicsAddCollider5(ball, redBricks, cbHitB";
Debug.ShouldStop(32768);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddcollider5" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(pgbreakout._redbricks),(Object)(_cbhitbrick),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("com.ab.banano.BANanoObject"), pgbreakout.__c.getField(false,"Null")),(Object)(pgbreakout._scene.getField(false,"_scene" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="Scene.SetImmovable(player, True)";
Debug.ShouldStop(131072);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setimmovable" /*RemoteObject*/ ,(Object)(pgbreakout._player),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 148;BA.debugLine="Dim cbhitPlayer As BANanoObject = BANano.CallBack";
Debug.ShouldStop(524288);
_cbhitplayer = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cbhitplayer.setObject(pgbreakout._banano.runMethod(false,"CallBack",(Object)(pgbreakout.getObject()),(Object)(BA.ObjectToString("hitPlayer")),(Object)(pgbreakout.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_currentball.getObject()),(_currentplayer.getObject())}))))));Debug.locals.put("cbhitPlayer", _cbhitplayer);
 BA.debugLineNum = 149;BA.debugLine="Scene.PhysicsAddCollider5(ball, player, cbhitPlay";
Debug.ShouldStop(1048576);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_physicsaddcollider5" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(pgbreakout._player),(Object)(_cbhitplayer),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("com.ab.banano.BANanoObject"), pgbreakout.__c.getField(false,"Null")),(Object)(pgbreakout._scene.getField(false,"_scene" /*RemoteObject*/ )));
 BA.debugLineNum = 151;BA.debugLine="Dim txtX As Int = Scene.PhysicsWorldBoundsWidth /";
Debug.ShouldStop(4194304);
_txtx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getphysicsworldboundswidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("txtX", _txtx);Debug.locals.put("txtX", _txtx);
 BA.debugLineNum = 152;BA.debugLine="Dim txtY As Int = Scene.PhysicsWorldBoundsHeight";
Debug.ShouldStop(8388608);
_txty = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getphysicsworldboundsheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("txtY", _txty);Debug.locals.put("txtY", _txty);
 BA.debugLineNum = 154;BA.debugLine="openingText = Scene.SceneAddText(txtX, txtY, \"Pre";
Debug.ShouldStop(33554432);
pgbreakout._openingtext = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneaddtext" /*RemoteObject*/ ,(Object)(_txtx),(Object)(_txty),(Object)(BA.ObjectToString("Press SPACE to Start")),(Object)(pgbreakout.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("fontFamily")),RemoteObject.createImmutable(("Monaco, Courier, monospace")),RemoteObject.createImmutable(("fontSize")),RemoteObject.createImmutable(("50px")),RemoteObject.createImmutable(("fill")),(RemoteObject.createImmutable("#fff"))}))));
 BA.debugLineNum = 157;BA.debugLine="Scene.SetOrigin(openingText, 0.5)";
Debug.ShouldStop(268435456);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setorigin" /*RemoteObject*/ ,(Object)(pgbreakout._openingtext),(Object)(BA.numberCast(double.class, 0.5)));
 BA.debugLineNum = 159;BA.debugLine="gameOverText = Scene.SceneAddText(txtX, txtY, \"Ga";
Debug.ShouldStop(1073741824);
pgbreakout._gameovertext = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneaddtext" /*RemoteObject*/ ,(Object)(_txtx),(Object)(_txty),(Object)(BA.ObjectToString("Game Over")),(Object)(pgbreakout.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("fontFamily")),RemoteObject.createImmutable(("Monaco, Courier, monospace")),RemoteObject.createImmutable(("fontSize")),RemoteObject.createImmutable(("50px")),RemoteObject.createImmutable(("fill")),(RemoteObject.createImmutable("#fff"))}))));
 BA.debugLineNum = 161;BA.debugLine="Scene.SetOrigin(gameOverText, 0.5)";
Debug.ShouldStop(1);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setorigin" /*RemoteObject*/ ,(Object)(pgbreakout._gameovertext),(Object)(BA.numberCast(double.class, 0.5)));
 BA.debugLineNum = 163;BA.debugLine="Scene.SetVisible(gameOverText, False)";
Debug.ShouldStop(4);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvisible" /*RemoteObject*/ ,(Object)(pgbreakout._gameovertext),(Object)(pgbreakout.__c.getField(true,"False")));
 BA.debugLineNum = 165;BA.debugLine="playerWonText = Scene.SceneAddText(txtX, txtY, \"Y";
Debug.ShouldStop(16);
pgbreakout._playerwontext = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneaddtext" /*RemoteObject*/ ,(Object)(_txtx),(Object)(_txty),(Object)(BA.ObjectToString("You won!")),(Object)(pgbreakout.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("fontFamily")),RemoteObject.createImmutable(("Monaco, Courier, monospace")),RemoteObject.createImmutable(("fontSize")),RemoteObject.createImmutable(("50px")),RemoteObject.createImmutable(("fill")),(RemoteObject.createImmutable("#fff"))}))));
 BA.debugLineNum = 167;BA.debugLine="Scene.SetOrigin(playerWonText, 0.5)";
Debug.ShouldStop(64);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setorigin" /*RemoteObject*/ ,(Object)(pgbreakout._playerwontext),(Object)(BA.numberCast(double.class, 0.5)));
 BA.debugLineNum = 169;BA.debugLine="Scene.SetVisible(playerWonText, False)";
Debug.ShouldStop(256);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvisible" /*RemoteObject*/ ,(Object)(pgbreakout._playerwontext),(Object)(pgbreakout.__c.getField(true,"False")));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("onPreload (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,67);
if (RapidSub.canDelegate("onpreload")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","onpreload");}
 BA.debugLineNum = 67;BA.debugLine="Sub onPreload";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Log(\"preloading...\")";
Debug.ShouldStop(8);
pgbreakout.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("preloading...")));
 BA.debugLineNum = 69;BA.debugLine="Scene.SceneLoadImage(\"ball\", \"./assets/ball_32_32";
Debug.ShouldStop(16);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ball")),(Object)(RemoteObject.createImmutable("./assets/ball_32_32.png")));
 BA.debugLineNum = 70;BA.debugLine="Scene.SceneLoadImage(\"paddle\", \"./assets/paddle_1";
Debug.ShouldStop(32);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("paddle")),(Object)(RemoteObject.createImmutable("./assets/paddle_128_32.png")));
 BA.debugLineNum = 71;BA.debugLine="Scene.SceneLoadImage(\"brick1\", \"./assets/brick1_6";
Debug.ShouldStop(64);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("brick1")),(Object)(RemoteObject.createImmutable("./assets/brick1_64_32.png")));
 BA.debugLineNum = 72;BA.debugLine="Scene.SceneLoadImage(\"brick2\", \"./assets/brick2_6";
Debug.ShouldStop(128);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("brick2")),(Object)(RemoteObject.createImmutable("./assets/brick2_64_32.png")));
 BA.debugLineNum = 73;BA.debugLine="Scene.SceneLoadImage(\"brick3\", \"./assets/brick3_6";
Debug.ShouldStop(256);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_sceneloadimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("brick3")),(Object)(RemoteObject.createImmutable("./assets/brick3_64_32.png")));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("onUpdate (pgbreakout) ","pgbreakout",2,pgbreakout.ba,pgbreakout.mostCurrent,77);
if (RapidSub.canDelegate("onupdate")) { return b4j.example.pgbreakout.remoteMe.runUserSub(false, "pgbreakout","onupdate");}
RemoteObject _isover = RemoteObject.createImmutable(false);
RemoteObject _iswon = RemoteObject.createImmutable(false);
RemoteObject _px = RemoteObject.createImmutable(0);
 BA.debugLineNum = 77;BA.debugLine="Sub onUpdate";
Debug.ShouldStop(4096);
 BA.debugLineNum = 80;BA.debugLine="Dim isOver As Boolean = isGameOver";
Debug.ShouldStop(32768);
_isover = _isgameover();Debug.locals.put("isOver", _isover);Debug.locals.put("isOver", _isover);
 BA.debugLineNum = 81;BA.debugLine="Dim IsWon As Boolean = isGameWon";
Debug.ShouldStop(65536);
_iswon = _isgamewon();Debug.locals.put("IsWon", _iswon);Debug.locals.put("IsWon", _iswon);
 BA.debugLineNum = 83;BA.debugLine="If isOver Then";
Debug.ShouldStop(262144);
if (_isover.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 84;BA.debugLine="Scene.SetVisible(gameOverText, True)";
Debug.ShouldStop(524288);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvisible" /*RemoteObject*/ ,(Object)(pgbreakout._gameovertext),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 85;BA.debugLine="Scene.DisableBody(ball, True, True)";
Debug.ShouldStop(1048576);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_disablebody" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(pgbreakout.__c.getField(true,"True")),(Object)(pgbreakout.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 86;BA.debugLine="else if IsWon Then";
Debug.ShouldStop(2097152);
if (_iswon.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 87;BA.debugLine="Scene.SetVisible(playerWonText, True)";
Debug.ShouldStop(4194304);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvisible" /*RemoteObject*/ ,(Object)(pgbreakout._playerwontext),(Object)(pgbreakout.__c.getField(true,"True")));
 BA.debugLineNum = 88;BA.debugLine="Scene.DisableBody(ball, True, True)";
Debug.ShouldStop(8388608);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_disablebody" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(pgbreakout.__c.getField(true,"True")),(Object)(pgbreakout.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 91;BA.debugLine="Scene.BodySetVelocityX(player, 0)";
Debug.ShouldStop(67108864);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_bodysetvelocityx" /*RemoteObject*/ ,(Object)(pgbreakout._player),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 94;BA.debugLine="If Scene.LeftIsDown Then";
Debug.ShouldStop(536870912);
if (pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_leftisdown" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 95;BA.debugLine="Scene.BodySetVelocityX(player, -350)";
Debug.ShouldStop(1073741824);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_bodysetvelocityx" /*RemoteObject*/ ,(Object)(pgbreakout._player),(Object)(RemoteObject.createImmutable((-(double) (0 + 350)))));
 }else 
{ BA.debugLineNum = 96;BA.debugLine="Else if Scene.RightIsDown Then";
Debug.ShouldStop(-2147483648);
if (pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_rightisdown" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="Scene.BodySetVelocityX(player, 350)";
Debug.ShouldStop(1);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_bodysetvelocityx" /*RemoteObject*/ ,(Object)(pgbreakout._player),(Object)(RemoteObject.createImmutable((350))));
 }}
;
 BA.debugLineNum = 100;BA.debugLine="If gameStarted = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",pgbreakout._gamestarted,pgbreakout.__c.getField(true,"False"))) { 
 BA.debugLineNum = 102;BA.debugLine="Dim px As Int = Scene.GetX(player)";
Debug.ShouldStop(32);
_px = pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(pgbreakout._player));Debug.locals.put("px", _px);Debug.locals.put("px", _px);
 BA.debugLineNum = 103;BA.debugLine="Scene.SetX(ball, px)";
Debug.ShouldStop(64);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setx" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(_px));
 BA.debugLineNum = 105;BA.debugLine="If Scene.SpaceIsDown Then";
Debug.ShouldStop(256);
if (pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_spaceisdown" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="gameStarted = True";
Debug.ShouldStop(512);
pgbreakout._gamestarted = pgbreakout.__c.getField(true,"True");
 BA.debugLineNum = 107;BA.debugLine="Scene.SetVelocityY(ball, -200)";
Debug.ShouldStop(1024);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvelocityy" /*RemoteObject*/ ,(Object)(pgbreakout._ball),(Object)(BA.numberCast(int.class, -(double) (0 + 200))));
 BA.debugLineNum = 108;BA.debugLine="Scene.SetVisible(openingText, False)";
Debug.ShouldStop(2048);
pgbreakout._scene.runClassMethod (b4j.example.phaserscene.class, "_setvisible" /*RemoteObject*/ ,(Object)(pgbreakout._openingtext),(Object)(pgbreakout.__c.getField(true,"False")));
 };
 };
 }}
;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
pgbreakout._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 4;BA.debugLine="Private body As BANanoElement";
pgbreakout._body = RemoteObject.createNew ("com.ab.banano.BANanoElement");
 //BA.debugLineNum = 5;BA.debugLine="Private game As BANanoPhaser";
pgbreakout._game = RemoteObject.createNew ("b4j.example.bananophaser");
 //BA.debugLineNum = 6;BA.debugLine="Private gameDiv As BANanoElement";
pgbreakout._gamediv = RemoteObject.createNew ("com.ab.banano.BANanoElement");
 //BA.debugLineNum = 9;BA.debugLine="Private player As BANanoObject";
pgbreakout._player = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 10;BA.debugLine="Private ball As BANanoObject";
pgbreakout._ball = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 11;BA.debugLine="Private violetBricks As BANanoObject";
pgbreakout._violetbricks = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 12;BA.debugLine="Private yellowBricks As BANanoObject";
pgbreakout._yellowbricks = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 13;BA.debugLine="Private redBricks As BANanoObject";
pgbreakout._redbricks = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 15;BA.debugLine="Private gameStarted As Boolean = False";
pgbreakout._gamestarted = pgbreakout.__c.getField(true,"False");
 //BA.debugLineNum = 16;BA.debugLine="Private openingText As BANanoObject";
pgbreakout._openingtext = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 17;BA.debugLine="Private gameOverText As BANanoObject";
pgbreakout._gameovertext = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 18;BA.debugLine="Private playerWonText As BANanoObject";
pgbreakout._playerwontext = RemoteObject.createNew ("com.ab.banano.BANanoObject");
 //BA.debugLineNum = 20;BA.debugLine="Private Scene As PhaserScene";
pgbreakout._scene = RemoteObject.createNew ("b4j.example.phaserscene");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}