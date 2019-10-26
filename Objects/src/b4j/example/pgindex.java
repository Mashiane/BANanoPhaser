package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static com.ab.banano.BANanoElement _body = null;
public static b4j.example.bananophaser _game = null;
public static com.ab.banano.BANanoObject _platforms = null;
public static com.ab.banano.BANanoObject _player = null;
public static com.ab.banano.BANanoObject _stars = null;
public static int _score = 0;
public static int _level = 0;
public static int _lives = 0;
public static com.ab.banano.BANanoObject _scoretext = null;
public static com.ab.banano.BANanoObject _bombs = null;
public static boolean _gameover = false;
public static b4j.example.phaserscene _gamescene = null;
public static com.ab.banano.BANanoObject _livestext = null;
public static b4j.example.main _main = null;
public static b4j.example.pgbreakout _pgbreakout = null;
public static String  _collectstar(com.ab.banano.BANanoObject _playerobj,com.ab.banano.BANanoObject _starobj) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "collectstar", false))
	 {return ((String) Debug.delegate(ba, "collectstar", new Object[] {_playerobj,_starobj}));}
String _newtext = "";
com.ab.banano.BANanoObject _child = null;
com.ab.banano.BANanoObject _cbiterate = null;
int _x = 0;
int _playerx = 0;
com.ab.banano.BANanoObject _bomb = null;
int _vx = 0;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub collectStar(playerObj As BANanoObject, starObj";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="gameScene.DisableBody(starObj, True, True)";
_gamescene._disablebody /*String*/ (null,_starobj,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="score = score + 10";
_score = (int) (_score+10);
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim newText As String = $\"Level: ${level} - Lives";
_newtext = ("Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" - Lives: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lives))+" - Score: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_score))+"");
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="gameScene.SetText(scoreText, newText)";
_gamescene._settext /*String*/ (null,_scoretext,_newtext);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="If gameScene.CountActive(stars, True) = 0 Then";
if (_gamescene._countactive /*int*/ (null,_stars,anywheresoftware.b4a.keywords.Common.True)==0) { 
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="level = level + 1";
_level = (int) (_level+1);
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="lives = lives + 1";
_lives = (int) (_lives+1);
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="newText = $\"Level: ${level} - Lives: ${lives} -";
_newtext = ("Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" - Lives: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lives))+" - Score: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_score))+"");
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="gameScene.SetText(scoreText, newText)";
_gamescene._settext /*String*/ (null,_scoretext,_newtext);
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="Dim child As BANanoObject";
_child = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Dim cbIterate As BANanoObject = BANano.CallBack(";
_cbiterate = new com.ab.banano.BANanoObject();
_cbiterate.setObject((java.lang.Object)(_banano.CallBack(pgindex.getObject(),"newStars",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_child.getObject())}))));
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="gameScene.ChildrenIterate(stars, cbIterate)";
_gamescene._childreniterate /*String*/ (null,_stars,_cbiterate);
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="Dim playerX As Int = gameScene.GetX(playerObj)";
_playerx = _gamescene._getx /*int*/ (null,_playerobj);
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="If playerX < 400 Then";
if (_playerx<400) { 
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="x = game.Between(400, 800)";
_x = _game._between /*int*/ (null,(int) (400),(int) (800));
 }else {
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="x = game.Between(0, 400)";
_x = _game._between /*int*/ (null,(int) (0),(int) (400));
 };
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="Dim bomb As BANanoObject = gameScene.CreateInsta";
_bomb = new com.ab.banano.BANanoObject();
_bomb = _gamescene._createinstance /*com.ab.banano.BANanoObject*/ (null,_bombs,_x,(int) (16),"bomb");
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="Dim vx As Int = game.Between(-200, 200)";
_vx = _game._between /*int*/ (null,(int) (-200),(int) (200));
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="gameScene.SetBounce(bomb, 1)";
_gamescene._setbounce /*String*/ (null,_bomb,1);
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="gameScene.SetCollideWorldBounds(bomb, True)";
_gamescene._setcollideworldbounds /*String*/ (null,_bomb,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="gameScene.SetVelocityXY(bomb, vx, 20)";
_gamescene._setvelocityxy /*String*/ (null,_bomb,(Object)(_vx),(Object)(20));
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="gameScene.AllowGravity(bomb, False)";
_gamescene._allowgravity /*String*/ (null,_bomb,anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="End Sub";
return "";
}
public static String  _hitbomb(com.ab.banano.BANanoObject _playerobj,com.ab.banano.BANanoObject _starobj) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "hitbomb", false))
	 {return ((String) Debug.delegate(ba, "hitbomb", new Object[] {_playerobj,_starobj}));}
String _newtext = "";
int _x = 0;
int _playerx = 0;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub hitBomb(playerObj As BANanoObject, starObj As";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="lives = lives - 1";
_lives = (int) (_lives-1);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="gameScene.PhysicsPause";
_gamescene._physicspause /*com.ab.banano.BANanoObject*/ (null);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim newText As String = $\"Level: ${level} - Lives";
_newtext = ("Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" - Lives: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lives))+" - Score: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_score))+"");
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="gameScene.SetText(scoreText, newText)";
_gamescene._settext /*String*/ (null,_scoretext,_newtext);
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Dim playerX As Int = gameScene.GetX(starObj)";
_playerx = _gamescene._getx /*int*/ (null,_starobj);
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="If playerX < 400 Then";
if (_playerx<400) { 
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="x = game.Between(400, 800)";
_x = _game._between /*int*/ (null,(int) (400),(int) (800));
 }else {
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="x = game.Between(0, 400)";
_x = _game._between /*int*/ (null,(int) (0),(int) (400));
 };
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="gameScene.SetX(playerObj, x)";
_gamescene._setx /*String*/ (null,_playerobj,_x);
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="gameScene.PhysicsResume";
_gamescene._physicsresume /*com.ab.banano.BANanoObject*/ (null);
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="If lives <= 0 Then";
if (_lives<=0) { 
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="gameOver = True";
_gameover = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="gameScene.PhysicsPause";
_gamescene._physicspause /*com.ab.banano.BANanoObject*/ (null);
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="gameScene.SetTint(playerObj, \"0xff0000\")";
_gamescene._settint /*String*/ (null,_playerobj,(Object)("0xff0000"));
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="gameScene.PlayAnime(playerObj, \"turn\", Null)";
_gamescene._playanime /*String*/ (null,_playerobj,"turn",anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="BANano.Location.Reload(True)";
_banano.Location().Reload(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "init", false))
	 {return ((String) Debug.delegate(ba, "init", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Init";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="body = BANano.GetElement(\"#body\")";
_body = _banano.GetElement("#body");
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="body.Empty";
_body.Empty();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="body.SetStyle(BANano.ToJson(CreateMap(\"margin\":\"0";
_body.SetStyle(BA.ObjectToString(_banano.ToJson((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("margin"),(Object)("0"),(Object)("padding"),(Object)("0")}).getObject()))));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="score = 0";
_score = (int) (0);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="level = 1";
_level = (int) (1);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="lives = 3";
_lives = (int) (3);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="gameOver = False";
_gameover = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="game.Initialize";
_game._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="game.SetParent(\"body\")";
_game._setparent /*String*/ (null,"body");
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="game.SetWidth(800)";
_game._setwidth /*String*/ (null,(int) (800));
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="game.SetHeight(600)";
_game._setheight /*String*/ (null,(int) (600));
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="game.SetTypeAuto(True)";
_game._settypeauto /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="game.SetPhysicsDefault(\"arcade\")";
_game._setphysicsdefault /*String*/ (null,"arcade");
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="game.SetPhysicsArcadeGravity(CreateMap(\"y\":300))";
_game._setphysicsarcadegravity /*String*/ (null,(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("y"),(Object)(300)}).getObject()));
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="game.SetPhysicsArcadeDebug(False)";
_game._setphysicsarcadedebug /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="gameScene = game.CreateScene(\"starcatcher\")";
_gamescene = _game._createscene /*b4j.example.phaserscene*/ (null,"starcatcher");
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="gameScene.SetOnPreload(Me, \"onPreLoad\")";
_gamescene._setonpreload /*String*/ (null,pgindex.getObject(),"onPreLoad");
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="gameScene.SetOnCreate(Me, \"onCreate\")";
_gamescene._setoncreate /*String*/ (null,pgindex.getObject(),"onCreate");
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="gameScene.SetOnUpdate(Me, \"onUpdate\")";
_gamescene._setonupdate /*String*/ (null,pgindex.getObject(),"onUpdate");
RDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="gameScene.SetOnShutDown(Me, \"onShutDown\")";
_gamescene._setonshutdown /*String*/ (null,pgindex.getObject(),"onShutDown");
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="game.SetScene(gameScene.Scene)";
_game._setscene /*String*/ (null,_gamescene._scene /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="game.Start";
_game._start /*String*/ (null);
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="End Sub";
return "";
}
public static String  _iteratechildren(com.ab.banano.BANanoObject _child) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "iteratechildren", false))
	 {return ((String) Debug.delegate(ba, "iteratechildren", new Object[] {_child}));}
double _by = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub iterateChildren(child As BANanoObject)";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim by As Double = game.FloatBetween(0.4, 0.8)";
_by = _game._floatbetween /*double*/ (null,0.4,0.8);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="gameScene.SetBounceY(child, by)";
_gamescene._setbouncey /*String*/ (null,_child,_by);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return "";
}
public static String  _newstars(com.ab.banano.BANanoObject _child) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "newstars", false))
	 {return ((String) Debug.delegate(ba, "newstars", new Object[] {_child}));}
int _x = 0;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub newStars(child As BANanoObject)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim x As Int = gameScene.GetX(child)";
_x = _gamescene._getx /*int*/ (null,_child);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="gameScene.EnableBody(child, True, x, 0, True, Tru";
_gamescene._enablebody /*String*/ (null,_child,anywheresoftware.b4a.keywords.Common.True,_x,(int) (0),anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public static String  _oncreate() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "oncreate", false))
	 {return ((String) Debug.delegate(ba, "oncreate", null));}
com.ab.banano.BANanoObject _p1 = null;
com.ab.banano.BANanoObject _child = null;
com.ab.banano.BANanoObject _cbiterate = null;
com.ab.banano.BANanoObject _star = null;
com.ab.banano.BANanoObject _plyr = null;
com.ab.banano.BANanoObject _cbcollectstar = null;
com.ab.banano.BANanoObject _cbhitbomb = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub onCreate";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="gameScene.SceneAddImage(400, 300, \"sky\")";
_gamescene._sceneaddimage /*com.ab.banano.BANanoObject*/ (null,(int) (400),(int) (300),"sky");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="platforms = gameScene.PhysicsAddStaticGroup";
_platforms = _gamescene._physicsaddstaticgroup /*com.ab.banano.BANanoObject*/ (null);
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Dim p1 As BANanoObject = gameScene.CreateInstance";
_p1 = new com.ab.banano.BANanoObject();
_p1 = _gamescene._createinstance /*com.ab.banano.BANanoObject*/ (null,_platforms,(int) (400),(int) (568),"ground");
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="gameScene.SetScale(p1, 2)";
_gamescene._setscale /*String*/ (null,_p1,(Object)(2));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="gameScene.RefreshBody(p1)";
_gamescene._refreshbody /*String*/ (null,_p1);
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="gameScene.CreateInstance(platforms, 600, 400, \"gr";
_gamescene._createinstance /*com.ab.banano.BANanoObject*/ (null,_platforms,(int) (600),(int) (400),"ground");
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="gameScene.CreateInstance(platforms, 50, 250, \"gro";
_gamescene._createinstance /*com.ab.banano.BANanoObject*/ (null,_platforms,(int) (50),(int) (250),"ground");
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="gameScene.CreateInstance(platforms, 750, 220, \"gr";
_gamescene._createinstance /*com.ab.banano.BANanoObject*/ (null,_platforms,(int) (750),(int) (220),"ground");
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="player = gameScene.PhysicsAddSprite(100, 450, \"du";
_player = _gamescene._physicsaddsprite /*com.ab.banano.BANanoObject*/ (null,(int) (100),(int) (450),"dude");
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="gameScene.SetBounce(player, 0.2)";
_gamescene._setbounce /*String*/ (null,_player,0.2);
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="gameScene.SetCollideWorldBounds(player, True)";
_gamescene._setcollideworldbounds /*String*/ (null,_player,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="gameScene.CreateAnime(\"left\", \"dude\", 10, 0, 3, -";
_gamescene._createanime /*String*/ (null,"left","dude",(int) (10),(int) (0),(int) (3),(Object)(-1));
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="gameScene.CreateAnime(\"turn\", \"dude\", 20, 4, 4, N";
_gamescene._createanime /*String*/ (null,"turn","dude",(int) (20),(int) (4),(int) (4),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="gameScene.CreateAnime(\"right\", \"dude\", 10, 5, 8,";
_gamescene._createanime /*String*/ (null,"right","dude",(int) (10),(int) (5),(int) (8),(Object)(-1));
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="gameScene.CreateCursorKeys";
_gamescene._createcursorkeys /*String*/ (null);
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="stars = gameScene.PhysicsAddGroup(\"star\", 11, 12,";
_stars = _gamescene._physicsaddgroup /*com.ab.banano.BANanoObject*/ (null,"star",BA.NumberToString(11),(int) (12),(int) (0),(int) (70),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="Dim child As BANanoObject";
_child = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="Dim cbIterate As BANanoObject = BANano.CallBack(M";
_cbiterate = new com.ab.banano.BANanoObject();
_cbiterate.setObject((java.lang.Object)(_banano.CallBack(pgindex.getObject(),"iterateChildren",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_child.getObject())}))));
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="gameScene.ChildrenIterate(stars, cbIterate)";
_gamescene._childreniterate /*String*/ (null,_stars,_cbiterate);
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="bombs = gameScene.PhysicsAddGroup1";
_bombs = _gamescene._physicsaddgroup1 /*com.ab.banano.BANanoObject*/ (null);
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="scoreText = gameScene.SceneAddText(16,16, \"Level:";
_scoretext = _gamescene._sceneaddtext /*com.ab.banano.BANanoObject*/ (null,(int) (16),(int) (16),"Level: 1 - Lives: 3 - Score: 0",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("fontSize"),(Object)("32px"),(Object)("fill"),(Object)("#000")}));
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="gameScene.PhysicsAddCollider(player, platforms)";
_gamescene._physicsaddcollider /*String*/ (null,_player,_platforms);
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="gameScene.PhysicsAddCollider(stars, platforms)";
_gamescene._physicsaddcollider /*String*/ (null,_stars,_platforms);
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="gameScene.PhysicsAddCollider(bombs, platforms)";
_gamescene._physicsaddcollider /*String*/ (null,_bombs,_platforms);
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="Dim star As BANanoObject";
_star = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=458795;
 //BA.debugLineNum = 458795;BA.debugLine="Dim plyr As BANanoObject";
_plyr = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="Dim cbCollectStar As BANanoObject = BANano.CallBa";
_cbcollectstar = new com.ab.banano.BANanoObject();
_cbcollectstar.setObject((java.lang.Object)(_banano.CallBack(pgindex.getObject(),"collectStar",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_plyr.getObject()),(Object)(_star.getObject())}))));
RDebugUtils.currentLine=458797;
 //BA.debugLineNum = 458797;BA.debugLine="gameScene.PhysicsAddOverlap(player, stars, cbColl";
_gamescene._physicsaddoverlap /*String*/ (null,_player,_stars,_cbcollectstar,(com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Null)),_gamescene._physics /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=458799;
 //BA.debugLineNum = 458799;BA.debugLine="Dim cbHitBomb As BANanoObject = BANano.CallBack(M";
_cbhitbomb = new com.ab.banano.BANanoObject();
_cbhitbomb.setObject((java.lang.Object)(_banano.CallBack(pgindex.getObject(),"hitBomb",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_plyr.getObject()),(Object)(_star.getObject())}))));
RDebugUtils.currentLine=458800;
 //BA.debugLineNum = 458800;BA.debugLine="gameScene.PhysicsAddOverlap(player, bombs, cbHitB";
_gamescene._physicsaddoverlap /*String*/ (null,_player,_bombs,_cbhitbomb,(com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Null)),_gamescene._physics /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=458802;
 //BA.debugLineNum = 458802;BA.debugLine="End Sub";
return "";
}
public static String  _onpreload() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "onpreload", false))
	 {return ((String) Debug.delegate(ba, "onpreload", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub onPreLoad";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="gameScene.SetScaleMode(game.ScaleManagerShowAll)";
_gamescene._setscalemode /*String*/ (null,_game._scalemanagershowall /*int*/ );
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="gameScene.SetScalePageAlignHorizontally(True)";
_gamescene._setscalepagealignhorizontally /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="gameScene.SetScalepageAlignVertically(True)";
_gamescene._setscalepagealignvertically /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="gameScene.SceneLoadImage(\"bomb\", \"./assets/bomb.p";
_gamescene._sceneloadimage /*String*/ (null,"bomb","./assets/bomb.png");
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="gameScene.SceneLoadImage(\"ground\", \"./assets/plat";
_gamescene._sceneloadimage /*String*/ (null,"ground","./assets/platform.png");
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="gameScene.SceneLoadImage(\"sky\", \"./assets/sky.png";
_gamescene._sceneloadimage /*String*/ (null,"sky","./assets/sky.png");
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="gameScene.SceneLoadImage(\"star\", \"./assets/star.p";
_gamescene._sceneloadimage /*String*/ (null,"star","./assets/star.png");
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="gameScene.SceneLoadSpriteSheet(\"dude\", \"./assets/";
_gamescene._sceneloadspritesheet /*String*/ (null,"dude","./assets/dude.png",(int) (32),(int) (48));
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="End Sub";
return "";
}
public static String  _onshutdown() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "onshutdown", false))
	 {return ((String) Debug.delegate(ba, "onshutdown", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub onShutDown";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="End Sub";
return "";
}
public static String  _onupdate() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "onupdate", false))
	 {return ((String) Debug.delegate(ba, "onupdate", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub onUpdate";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If gameOver Then";
if (_gameover) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="If gameScene.LeftIsDown Then";
if (_gamescene._leftisdown /*boolean*/ (null)) { 
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="gameScene.SetVelocityX(player, -160)";
_gamescene._setvelocityx /*String*/ (null,_player,(int) (-160));
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="gameScene.PlayAnime(player, \"left\", True)";
_gamescene._playanime /*String*/ (null,_player,"left",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else 
{RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="else if gameScene.RightIsDown Then";
if (_gamescene._rightisdown /*boolean*/ (null)) { 
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="gameScene.SetVelocityX(player, 160)";
_gamescene._setvelocityx /*String*/ (null,_player,(int) (160));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="gameScene.PlayAnime(player, \"right\", True)";
_gamescene._playanime /*String*/ (null,_player,"right",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="gameScene.SetVelocityX(player, 0)";
_gamescene._setvelocityx /*String*/ (null,_player,(int) (0));
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="gameScene.PlayAnime(player, \"turn\", Null)";
_gamescene._playanime /*String*/ (null,_player,"turn",anywheresoftware.b4a.keywords.Common.Null);
 }}
;
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="If gameScene.UpIsDown And gameScene.IsBodyTouchin";
if (_gamescene._upisdown /*boolean*/ (null) && _gamescene._isbodytouchingdown /*boolean*/ (null,_player)) { 
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="gameScene.SetVelocityY(player, -330)";
_gamescene._setvelocityy /*String*/ (null,_player,(int) (-330));
 };
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="End Sub";
return "";
}
}