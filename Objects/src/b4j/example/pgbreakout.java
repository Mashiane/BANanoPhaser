package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class pgbreakout extends Object{
public static pgbreakout mostCurrent = new pgbreakout();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pgbreakout", null);
		ba.loadHtSubs(pgbreakout.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgbreakout", ba);
		}
	}
    public static Class<?> getObject() {
		return pgbreakout.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static com.ab.banano.BANanoElement _body = null;
public static b4j.example.bananophaser _game = null;
public static com.ab.banano.BANanoElement _gamediv = null;
public static com.ab.banano.BANanoObject _player = null;
public static com.ab.banano.BANanoObject _ball = null;
public static com.ab.banano.BANanoObject _violetbricks = null;
public static com.ab.banano.BANanoObject _yellowbricks = null;
public static com.ab.banano.BANanoObject _redbricks = null;
public static boolean _gamestarted = false;
public static com.ab.banano.BANanoObject _openingtext = null;
public static com.ab.banano.BANanoObject _gameovertext = null;
public static com.ab.banano.BANanoObject _playerwontext = null;
public static b4j.example.phaserscene _scene = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static String  _init() throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "init", false))
	 {return ((String) Debug.delegate(ba, "init", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Init";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="body = BANano.GetElement(\"#body\")";
_body = _banano.GetElement("#body");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="body.SetStyle(BANano.ToJson(CreateMap(\"margin\":\"0";
_body.SetStyle(BA.ObjectToString(_banano.ToJson((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("margin"),(Object)("0 auto"),(Object)("padding"),(Object)("0"),(Object)("width"),(Object)("100%"),(Object)("height"),(Object)("100%")}).getObject()))));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="body.Empty";
_body.Empty();
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="gameDiv = body.Append($\"<div id=\"game\"></div>\"$).";
_gamediv = _body.Append(("<div id=\"game\"></div>")).Get((Object)("#game"));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="gameDiv.SetStyle(BANano.ToJson(CreateMap(\"margin\"";
_gamediv.SetStyle(BA.ObjectToString(_banano.ToJson((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("margin"),(Object)("10px auto"),(Object)("padding"),(Object)("0"),(Object)("width"),(Object)("800px"),(Object)("height"),(Object)("640px")}).getObject()))));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="game.Initialize";
_game._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="game.SetTypeAuto(True)";
_game._settypeauto /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="game.SetParent(\"game\")";
_game._setparent /*String*/ (null,"game");
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="game.SetWidth(800)";
_game._setwidth /*String*/ (null,(int) (800));
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="game.SetHeight(640)";
_game._setheight /*String*/ (null,(int) (640));
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="game.SetScaleMode(game.ScaleModeRESIZE)";
_game._setscalemode /*String*/ (null,_game._scalemoderesize /*int*/ );
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="game.SetScaleAutoCenter(game.ScaleCenterCENTER_BO";
_game._setscaleautocenter /*String*/ (null,_game._scalecentercenter_both /*int*/ );
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="game.SetPhysicsDefault(\"arcade\")";
_game._setphysicsdefault /*String*/ (null,"arcade");
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="game.SetPhysicsArcadeGravity(False)";
_game._setphysicsarcadegravity /*String*/ (null,(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="Scene = game.CreateScene(\"breakout\")";
_scene = _game._createscene /*b4j.example.phaserscene*/ (null,"breakout");
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="Scene.SetOnPreload(Me, \"onPreLoad\")";
_scene._setonpreload /*String*/ (null,pgbreakout.getObject(),"onPreLoad");
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="Scene.SetOnCreate(Me, \"onCreate\")";
_scene._setoncreate /*String*/ (null,pgbreakout.getObject(),"onCreate");
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="Scene.SetOnUpdate(Me, \"onUpdate\")";
_scene._setonupdate /*String*/ (null,pgbreakout.getObject(),"onUpdate");
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="game.SetScene(Scene.Scene)";
_game._setscene /*String*/ (null,_scene._scene /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="game.Start";
_game._start /*String*/ (null);
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="End Sub";
return "";
}
public static String  _hitbrick(com.ab.banano.BANanoObject _bll,com.ab.banano.BANanoObject _bick) throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "hitbrick", false))
	 {return ((String) Debug.delegate(ba, "hitbrick", new Object[] {_bll,_bick}));}
int _vx = 0;
double _randnum = 0;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub hitBrick(bll As BANanoObject, bick As BANanoOb";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Scene.DisableBody(bick, True, True)";
_scene._disablebody /*String*/ (null,_bick,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Dim vx As Int = Scene.getBodyVelocityX(bll)";
_vx = _scene._getbodyvelocityx /*int*/ (null,_bll);
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="If vx = 0 Then";
if (_vx==0) { 
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="Dim randNum As Double = Scene.random";
_randnum = _scene._random /*double*/ (null);
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="If randNum >= 0.5 Then";
if (_randnum>=0.5) { 
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="Scene.SetBodyVelocityX(bll, 150)";
_scene._setbodyvelocityx /*String*/ (null,_bll,(int) (150));
 }else {
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="Scene.SetBodyVelocityX(bll, -150)";
_scene._setbodyvelocityx /*String*/ (null,_bll,(int) (-150));
 };
 };
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="End Sub";
return "";
}
public static String  _hitplayer(com.ab.banano.BANanoObject _objball,com.ab.banano.BANanoObject _objplayer) throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "hitplayer", false))
	 {return ((String) Debug.delegate(ba, "hitplayer", new Object[] {_objball,_objplayer}));}
int _vy = 0;
int _newxvelocity = 0;
int _bx = 0;
int _px = 0;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub hitPlayer(objBall As BANanoObject, objPlayer A";
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Dim vy As Int = Scene.GetBodyVelocityY(objBall)";
_vy = _scene._getbodyvelocityy /*int*/ (null,_objball);
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="vy = vy - 5";
_vy = (int) (_vy-5);
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Scene.SetVelocityY(objBall, vy)";
_scene._setvelocityy /*String*/ (null,_objball,_vy);
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="Dim newXVelocity As Int = Scene.GetBodyVelocityX(";
_newxvelocity = _scene._getbodyvelocityx /*int*/ (null,_objball);
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="newXVelocity = Scene.absolute(newXVelocity)";
_newxvelocity = (int)(Double.parseDouble(_scene._absolute /*String*/ (null,_newxvelocity)));
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="newXVelocity = newXVelocity + 5";
_newxvelocity = (int) (_newxvelocity+5);
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="Dim bx As Int = Scene.GetX(objBall)";
_bx = _scene._getx /*int*/ (null,_objball);
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="Dim px As Int = Scene.GetX(objPlayer)";
_px = _scene._getx /*int*/ (null,_objplayer);
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="If bx < px Then";
if (_bx<_px) { 
RDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="newXVelocity = newXVelocity * (0 - 1)";
_newxvelocity = (int) (_newxvelocity*(0-1));
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="Scene.SetVelocityX(objBall, newXVelocity)";
_scene._setvelocityx /*String*/ (null,_objball,_newxvelocity);
 }else {
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="Scene.SetVelocityX(objBall, newXVelocity)";
_scene._setvelocityx /*String*/ (null,_objball,_newxvelocity);
 };
RDebugUtils.currentLine=18808851;
 //BA.debugLineNum = 18808851;BA.debugLine="End Sub";
return "";
}
public static boolean  _isgameover() throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "isgameover", false))
	 {return ((Boolean) Debug.delegate(ba, "isgameover", null));}
int _wbh = 0;
int _y = 0;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Sub isGameOver As Boolean";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Dim wbh As Int = Scene.PhysicsWorldBoundsHeight";
_wbh = _scene._getphysicsworldboundsheight /*int*/ (null);
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Dim y As Int = Scene.GetBodyY(ball)";
_y = _scene._getbodyy /*int*/ (null,_ball);
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="If y > wbh Then";
if (_y>_wbh) { 
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="End Sub";
return false;
}
public static boolean  _isgamewon() throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "isgamewon", false))
	 {return ((Boolean) Debug.delegate(ba, "isgamewon", null));}
int _vb = 0;
int _yb = 0;
int _rb = 0;
int _allactive = 0;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Sub isGameWon As Boolean";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Dim vb As Int = Scene.CountActive(violetBricks, T";
_vb = _scene._countactive /*int*/ (null,_violetbricks,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="Dim yb As Int = Scene.CountActive(yellowBricks, T";
_yb = _scene._countactive /*int*/ (null,_yellowbricks,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="Dim rb As Int = Scene.CountActive(redBricks, True";
_rb = _scene._countactive /*int*/ (null,_redbricks,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="Dim allActive As Int = vb + yb + rb";
_allactive = (int) (_vb+_yb+_rb);
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="If allActive = 0 Then";
if (_allactive==0) { 
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=19595275;
 //BA.debugLineNum = 19595275;BA.debugLine="End Sub";
return false;
}
public static String  _oncreate() throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "oncreate", false))
	 {return ((String) Debug.delegate(ba, "oncreate", null));}
com.ab.banano.BANanoObject _currentball = null;
com.ab.banano.BANanoObject _currentplayer = null;
com.ab.banano.BANanoObject _cbhitbrick = null;
com.ab.banano.BANanoObject _cbhitplayer = null;
int _txtx = 0;
int _txty = 0;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub onCreate";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Log(\"creating...\")";
anywheresoftware.b4a.keywords.Common.Log("creating...");
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="player = Scene.PhysicsAddSprite(400, 600, \"paddle";
_player = _scene._physicsaddsprite /*com.ab.banano.BANanoObject*/ (null,(int) (400),(int) (600),"paddle");
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="ball = Scene.PhysicsAddSprite(400, 565, \"ball\")";
_ball = _scene._physicsaddsprite /*com.ab.banano.BANanoObject*/ (null,(int) (400),(int) (565),"ball");
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="violetBricks = Scene.PhysicsAddGroup(\"brick1\", 9,";
_violetbricks = _scene._physicsaddgroup /*com.ab.banano.BANanoObject*/ (null,"brick1",BA.NumberToString(9),(int) (80),(int) (140),(int) (70),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="yellowBricks = Scene.PhysicsAddGroup(\"brick2\", 9,";
_yellowbricks = _scene._physicsaddgroup /*com.ab.banano.BANanoObject*/ (null,"brick2",BA.NumberToString(9),(int) (80),(int) (90),(int) (70),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="redBricks = Scene.PhysicsAddGroup(\"brick3\", 9, 80";
_redbricks = _scene._physicsaddgroup /*com.ab.banano.BANanoObject*/ (null,"brick3",BA.NumberToString(9),(int) (80),(int) (40),(int) (70),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="Scene.CreateCursorKeys";
_scene._createcursorkeys /*String*/ (null);
RDebugUtils.currentLine=9568268;
 //BA.debugLineNum = 9568268;BA.debugLine="Scene.SetCollideWorldBounds(player, True)";
_scene._setcollideworldbounds /*String*/ (null,_player,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9568269;
 //BA.debugLineNum = 9568269;BA.debugLine="Scene.SetCollideWorldBounds(ball, True)";
_scene._setcollideworldbounds /*String*/ (null,_ball,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9568271;
 //BA.debugLineNum = 9568271;BA.debugLine="Scene.SetBounceXY(ball, 1, 1)";
_scene._setbouncexy /*String*/ (null,_ball,(Object)(1),(Object)(1));
RDebugUtils.currentLine=9568273;
 //BA.debugLineNum = 9568273;BA.debugLine="Scene.SetPhysicsWorldCheckCollisionDown(False)";
_scene._setphysicsworldcheckcollisiondown /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9568275;
 //BA.debugLineNum = 9568275;BA.debugLine="Dim currentBall As BANanoObject";
_currentball = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=9568276;
 //BA.debugLineNum = 9568276;BA.debugLine="Dim currentPlayer As BANanoObject";
_currentplayer = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=9568277;
 //BA.debugLineNum = 9568277;BA.debugLine="Dim cbHitBrick As BANanoObject = BANano.CallBack(";
_cbhitbrick = new com.ab.banano.BANanoObject();
_cbhitbrick.setObject((java.lang.Object)(_banano.CallBack(pgbreakout.getObject(),"hitBrick",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_currentball.getObject()),(Object)(_currentplayer.getObject())}))));
RDebugUtils.currentLine=9568278;
 //BA.debugLineNum = 9568278;BA.debugLine="Scene.PhysicsAddCollider5(ball, violetBricks, cbH";
_scene._physicsaddcollider5 /*String*/ (null,_ball,_violetbricks,_cbhitbrick,(com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Null)),_scene._scene /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=9568279;
 //BA.debugLineNum = 9568279;BA.debugLine="Scene.PhysicsAddCollider5(ball, yellowBricks, cbH";
_scene._physicsaddcollider5 /*String*/ (null,_ball,_yellowbricks,_cbhitbrick,(com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Null)),_scene._scene /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=9568280;
 //BA.debugLineNum = 9568280;BA.debugLine="Scene.PhysicsAddCollider5(ball, redBricks, cbHitB";
_scene._physicsaddcollider5 /*String*/ (null,_ball,_redbricks,_cbhitbrick,(com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Null)),_scene._scene /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=9568282;
 //BA.debugLineNum = 9568282;BA.debugLine="Scene.SetImmovable(player, True)";
_scene._setimmovable /*String*/ (null,_player,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9568284;
 //BA.debugLineNum = 9568284;BA.debugLine="Dim cbhitPlayer As BANanoObject = BANano.CallBack";
_cbhitplayer = new com.ab.banano.BANanoObject();
_cbhitplayer.setObject((java.lang.Object)(_banano.CallBack(pgbreakout.getObject(),"hitPlayer",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_currentball.getObject()),(Object)(_currentplayer.getObject())}))));
RDebugUtils.currentLine=9568285;
 //BA.debugLineNum = 9568285;BA.debugLine="Scene.PhysicsAddCollider5(ball, player, cbhitPlay";
_scene._physicsaddcollider5 /*String*/ (null,_ball,_player,_cbhitplayer,(com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Null)),_scene._scene /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=9568287;
 //BA.debugLineNum = 9568287;BA.debugLine="Dim txtX As Int = Scene.PhysicsWorldBoundsWidth /";
_txtx = (int) (_scene._getphysicsworldboundswidth /*int*/ (null)/(double)2);
RDebugUtils.currentLine=9568288;
 //BA.debugLineNum = 9568288;BA.debugLine="Dim txtY As Int = Scene.PhysicsWorldBoundsHeight";
_txty = (int) (_scene._getphysicsworldboundsheight /*int*/ (null)/(double)2);
RDebugUtils.currentLine=9568290;
 //BA.debugLineNum = 9568290;BA.debugLine="openingText = Scene.SceneAddText(txtX, txtY, \"Pre";
_openingtext = _scene._sceneaddtext /*com.ab.banano.BANanoObject*/ (null,_txtx,_txty,"Press SPACE to Start",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("fontFamily"),(Object)("Monaco, Courier, monospace"),(Object)("fontSize"),(Object)("50px"),(Object)("fill"),(Object)("#fff")}));
RDebugUtils.currentLine=9568293;
 //BA.debugLineNum = 9568293;BA.debugLine="Scene.SetOrigin(openingText, 0.5)";
_scene._setorigin /*String*/ (null,_openingtext,0.5);
RDebugUtils.currentLine=9568295;
 //BA.debugLineNum = 9568295;BA.debugLine="gameOverText = Scene.SceneAddText(txtX, txtY, \"Ga";
_gameovertext = _scene._sceneaddtext /*com.ab.banano.BANanoObject*/ (null,_txtx,_txty,"Game Over",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("fontFamily"),(Object)("Monaco, Courier, monospace"),(Object)("fontSize"),(Object)("50px"),(Object)("fill"),(Object)("#fff")}));
RDebugUtils.currentLine=9568297;
 //BA.debugLineNum = 9568297;BA.debugLine="Scene.SetOrigin(gameOverText, 0.5)";
_scene._setorigin /*String*/ (null,_gameovertext,0.5);
RDebugUtils.currentLine=9568299;
 //BA.debugLineNum = 9568299;BA.debugLine="Scene.SetVisible(gameOverText, False)";
_scene._setvisible /*String*/ (null,_gameovertext,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9568301;
 //BA.debugLineNum = 9568301;BA.debugLine="playerWonText = Scene.SceneAddText(txtX, txtY, \"Y";
_playerwontext = _scene._sceneaddtext /*com.ab.banano.BANanoObject*/ (null,_txtx,_txty,"You won!",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("fontFamily"),(Object)("Monaco, Courier, monospace"),(Object)("fontSize"),(Object)("50px"),(Object)("fill"),(Object)("#fff")}));
RDebugUtils.currentLine=9568303;
 //BA.debugLineNum = 9568303;BA.debugLine="Scene.SetOrigin(playerWonText, 0.5)";
_scene._setorigin /*String*/ (null,_playerwontext,0.5);
RDebugUtils.currentLine=9568305;
 //BA.debugLineNum = 9568305;BA.debugLine="Scene.SetVisible(playerWonText, False)";
_scene._setvisible /*String*/ (null,_playerwontext,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9568306;
 //BA.debugLineNum = 9568306;BA.debugLine="End Sub";
return "";
}
public static String  _onpreload() throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "onpreload", false))
	 {return ((String) Debug.delegate(ba, "onpreload", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub onPreload";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Log(\"preloading...\")";
anywheresoftware.b4a.keywords.Common.Log("preloading...");
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Scene.SceneLoadImage(\"ball\", \"./assets/ball_32_32";
_scene._sceneloadimage /*String*/ (null,"ball","./assets/ball_32_32.png");
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Scene.SceneLoadImage(\"paddle\", \"./assets/paddle_1";
_scene._sceneloadimage /*String*/ (null,"paddle","./assets/paddle_128_32.png");
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Scene.SceneLoadImage(\"brick1\", \"./assets/brick1_6";
_scene._sceneloadimage /*String*/ (null,"brick1","./assets/brick1_64_32.png");
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Scene.SceneLoadImage(\"brick2\", \"./assets/brick2_6";
_scene._sceneloadimage /*String*/ (null,"brick2","./assets/brick2_64_32.png");
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Scene.SceneLoadImage(\"brick3\", \"./assets/brick3_6";
_scene._sceneloadimage /*String*/ (null,"brick3","./assets/brick3_64_32.png");
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="End Sub";
return "";
}
public static String  _onupdate() throws Exception{
RDebugUtils.currentModule="pgbreakout";
if (Debug.shouldDelegate(ba, "onupdate", false))
	 {return ((String) Debug.delegate(ba, "onupdate", null));}
boolean _isover = false;
boolean _iswon = false;
int _px = 0;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub onUpdate";
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Dim isOver As Boolean = isGameOver";
_isover = _isgameover();
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Dim IsWon As Boolean = isGameWon";
_iswon = _isgamewon();
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="If isOver Then";
if (_isover) { 
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="Scene.SetVisible(gameOverText, True)";
_scene._setvisible /*String*/ (null,_gameovertext,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="Scene.DisableBody(ball, True, True)";
_scene._disablebody /*String*/ (null,_ball,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="else if IsWon Then";
if (_iswon) { 
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="Scene.SetVisible(playerWonText, True)";
_scene._setvisible /*String*/ (null,_playerwontext,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="Scene.DisableBody(ball, True, True)";
_scene._disablebody /*String*/ (null,_ball,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="Scene.BodySetVelocityX(player, 0)";
_scene._bodysetvelocityx /*String*/ (null,_player,(Object)(0));
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="If Scene.LeftIsDown Then";
if (_scene._leftisdown /*boolean*/ (null)) { 
RDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="Scene.BodySetVelocityX(player, -350)";
_scene._bodysetvelocityx /*String*/ (null,_player,(Object)(-350));
 }else 
{RDebugUtils.currentLine=9175059;
 //BA.debugLineNum = 9175059;BA.debugLine="Else if Scene.RightIsDown Then";
if (_scene._rightisdown /*boolean*/ (null)) { 
RDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="Scene.BodySetVelocityX(player, 350)";
_scene._bodysetvelocityx /*String*/ (null,_player,(Object)(350));
 }}
;
RDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="If gameStarted = False Then";
if (_gamestarted==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9175065;
 //BA.debugLineNum = 9175065;BA.debugLine="Dim px As Int = Scene.GetX(player)";
_px = _scene._getx /*int*/ (null,_player);
RDebugUtils.currentLine=9175066;
 //BA.debugLineNum = 9175066;BA.debugLine="Scene.SetX(ball, px)";
_scene._setx /*String*/ (null,_ball,_px);
RDebugUtils.currentLine=9175068;
 //BA.debugLineNum = 9175068;BA.debugLine="If Scene.SpaceIsDown Then";
if (_scene._spaceisdown /*boolean*/ (null)) { 
RDebugUtils.currentLine=9175069;
 //BA.debugLineNum = 9175069;BA.debugLine="gameStarted = True";
_gamestarted = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9175070;
 //BA.debugLineNum = 9175070;BA.debugLine="Scene.SetVelocityY(ball, -200)";
_scene._setvelocityy /*String*/ (null,_ball,(int) (-200));
RDebugUtils.currentLine=9175071;
 //BA.debugLineNum = 9175071;BA.debugLine="Scene.SetVisible(openingText, False)";
_scene._setvisible /*String*/ (null,_openingtext,anywheresoftware.b4a.keywords.Common.False);
 };
 };
 }}
;
RDebugUtils.currentLine=9175075;
 //BA.debugLineNum = 9175075;BA.debugLine="End Sub";
return "";
}
}