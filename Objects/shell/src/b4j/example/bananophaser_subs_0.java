package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananophaser_subs_0 {


public static RemoteObject  _between(RemoteObject __ref,RemoteObject _dfrom,RemoteObject _dto) throws Exception{
try {
		Debug.PushSubsStack("Between (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("between")) { return __ref.runUserSub(false, "bananophaser","between", __ref, _dfrom, _dto);}
RemoteObject _dres = RemoteObject.createImmutable(0);
Debug.locals.put("dFrom", _dfrom);
Debug.locals.put("dTo", _dto);
 BA.debugLineNum = 69;BA.debugLine="Sub Between(dFrom As Int, dTo As Int) As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim dRes As Int = Phaser.GetField(\"Math\").RunMeth";
Debug.ShouldStop(32);
_dres = BA.numberCast(int.class, __ref.getField(false,"_phaser" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Math"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("Between")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_dfrom),(_dto)})))).runMethod(false,"Result"));Debug.locals.put("dRes", _dres);Debug.locals.put("dRes", _dres);
 BA.debugLineNum = 71;BA.debugLine="Return dRes";
Debug.ShouldStop(64);
if (true) return _dres;
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private BANano As BANano";
bananophaser._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananophaser._banano);
 //BA.debugLineNum = 3;BA.debugLine="Private Phaser As BANanoObject";
bananophaser._phaser = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_phaser",bananophaser._phaser);
 //BA.debugLineNum = 4;BA.debugLine="Public game As BANanoObject";
bananophaser._game = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_game",bananophaser._game);
 //BA.debugLineNum = 6;BA.debugLine="Private mconfig As Map";
bananophaser._mconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mconfig",bananophaser._mconfig);
 //BA.debugLineNum = 7;BA.debugLine="Private mphysics As Map";
bananophaser._mphysics = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mphysics",bananophaser._mphysics);
 //BA.debugLineNum = 8;BA.debugLine="Private marcade As Map";
bananophaser._marcade = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_marcade",bananophaser._marcade);
 //BA.debugLineNum = 9;BA.debugLine="Private mscale As Map";
bananophaser._mscale = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mscale",bananophaser._mscale);
 //BA.debugLineNum = 10;BA.debugLine="Private mscene As Map";
bananophaser._mscene = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mscene",bananophaser._mscene);
 //BA.debugLineNum = 12;BA.debugLine="Public const ScaleManagerShowAll As Int = 2";
bananophaser._scalemanagershowall = BA.numberCast(int.class, 2);__ref.setField("_scalemanagershowall",bananophaser._scalemanagershowall);
 //BA.debugLineNum = 13;BA.debugLine="Public const ScaleManagerNoScale As Int = 1";
bananophaser._scalemanagernoscale = BA.numberCast(int.class, 1);__ref.setField("_scalemanagernoscale",bananophaser._scalemanagernoscale);
 //BA.debugLineNum = 14;BA.debugLine="Public const ScaleManagerExactFit As Int = 0";
bananophaser._scalemanagerexactfit = BA.numberCast(int.class, 0);__ref.setField("_scalemanagerexactfit",bananophaser._scalemanagerexactfit);
 //BA.debugLineNum = 15;BA.debugLine="Public const ScaleManagerResize As Int = 3";
bananophaser._scalemanagerresize = BA.numberCast(int.class, 3);__ref.setField("_scalemanagerresize",bananophaser._scalemanagerresize);
 //BA.debugLineNum = 16;BA.debugLine="Public const ScaleManagerUserScale As Int = 4";
bananophaser._scalemanageruserscale = BA.numberCast(int.class, 4);__ref.setField("_scalemanageruserscale",bananophaser._scalemanageruserscale);
 //BA.debugLineNum = 18;BA.debugLine="Public const ScaleModeRESIZE As Int = 5";
bananophaser._scalemoderesize = BA.numberCast(int.class, 5);__ref.setField("_scalemoderesize",bananophaser._scalemoderesize);
 //BA.debugLineNum = 19;BA.debugLine="Public const ScaleModeENVELOP As Int = 4";
bananophaser._scalemodeenvelop = BA.numberCast(int.class, 4);__ref.setField("_scalemodeenvelop",bananophaser._scalemodeenvelop);
 //BA.debugLineNum = 20;BA.debugLine="Public const ScaleModeFIT As Int = 3";
bananophaser._scalemodefit = BA.numberCast(int.class, 3);__ref.setField("_scalemodefit",bananophaser._scalemodefit);
 //BA.debugLineNum = 21;BA.debugLine="Public const ScaleModeHEIGHT_CONTROLS_WIDTH As In";
bananophaser._scalemodeheight_controls_width = BA.numberCast(int.class, 2);__ref.setField("_scalemodeheight_controls_width",bananophaser._scalemodeheight_controls_width);
 //BA.debugLineNum = 22;BA.debugLine="Public const ScaleModeWIDTH_CONTROLS_HEIGHT As In";
bananophaser._scalemodewidth_controls_height = BA.numberCast(int.class, 1);__ref.setField("_scalemodewidth_controls_height",bananophaser._scalemodewidth_controls_height);
 //BA.debugLineNum = 23;BA.debugLine="Public const ScaleModeNONE As Int = 0";
bananophaser._scalemodenone = BA.numberCast(int.class, 0);__ref.setField("_scalemodenone",bananophaser._scalemodenone);
 //BA.debugLineNum = 25;BA.debugLine="Public const ScaleCenterCENTER_BOTH As Int = 1";
bananophaser._scalecentercenter_both = BA.numberCast(int.class, 1);__ref.setField("_scalecentercenter_both",bananophaser._scalecentercenter_both);
 //BA.debugLineNum = 26;BA.debugLine="Public const ScaleCenterCENTER_HORIZONTALLY As In";
bananophaser._scalecentercenter_horizontally = BA.numberCast(int.class, 2);__ref.setField("_scalecentercenter_horizontally",bananophaser._scalecentercenter_horizontally);
 //BA.debugLineNum = 27;BA.debugLine="Public const ScaleCenterCENTER_VERTICALLY As Int";
bananophaser._scalecentercenter_vertically = BA.numberCast(int.class, 3);__ref.setField("_scalecentercenter_vertically",bananophaser._scalecentercenter_vertically);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createscene(RemoteObject __ref,RemoteObject _scenename) throws Exception{
try {
		Debug.PushSubsStack("CreateScene (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("createscene")) { return __ref.runUserSub(false, "bananophaser","createscene", __ref, _scenename);}
RemoteObject _ps = RemoteObject.declareNull("b4j.example.phaserscene");
Debug.locals.put("sceneName", _scenename);
 BA.debugLineNum = 84;BA.debugLine="Sub CreateScene(sceneName As String) As PhaserScen";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Dim ps As PhaserScene";
Debug.ShouldStop(1048576);
_ps = RemoteObject.createNew ("b4j.example.phaserscene");Debug.locals.put("ps", _ps);
 BA.debugLineNum = 86;BA.debugLine="ps.Initialize(sceneName)";
Debug.ShouldStop(2097152);
_ps.runClassMethod (b4j.example.phaserscene.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_scenename));
 BA.debugLineNum = 87;BA.debugLine="Return ps";
Debug.ShouldStop(4194304);
if (true) return _ps;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cstr(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("Cstr (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "bananophaser","cstr", __ref, _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 110;BA.debugLine="Sub Cstr(obj As Object) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Return \"\" & obj";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_obj);
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
public static RemoteObject  _floatbetween(RemoteObject __ref,RemoteObject _dfrom,RemoteObject _dto) throws Exception{
try {
		Debug.PushSubsStack("FloatBetween (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("floatbetween")) { return __ref.runUserSub(false, "bananophaser","floatbetween", __ref, _dfrom, _dto);}
RemoteObject _dres = RemoteObject.createImmutable(0);
Debug.locals.put("dFrom", _dfrom);
Debug.locals.put("dTo", _dto);
 BA.debugLineNum = 63;BA.debugLine="Sub FloatBetween(dFrom As Double, dTo As Double) A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="Dim dRes As Double = Phaser.GetField(\"Math\").RunM";
Debug.ShouldStop(1);
_dres = BA.numberCast(double.class, __ref.getField(false,"_phaser" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Math"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("FloatBetween")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_dfrom),(_dto)})))).runMethod(false,"Result"));Debug.locals.put("dRes", _dres);Debug.locals.put("dRes", _dres);
 BA.debugLineNum = 66;BA.debugLine="Return dRes";
Debug.ShouldStop(2);
if (true) return _dres;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananophaser","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Phaser.Initialize(\"Phaser\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_phaser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("Phaser"))));
 BA.debugLineNum = 34;BA.debugLine="mconfig = CreateMap()";
Debug.ShouldStop(2);
__ref.setField ("_mconfig" /*RemoteObject*/ ,bananophaser.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 35;BA.debugLine="mphysics = CreateMap()";
Debug.ShouldStop(4);
__ref.setField ("_mphysics" /*RemoteObject*/ ,bananophaser.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 36;BA.debugLine="marcade = CreateMap()";
Debug.ShouldStop(8);
__ref.setField ("_marcade" /*RemoteObject*/ ,bananophaser.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 37;BA.debugLine="mscale = CreateMap()";
Debug.ShouldStop(16);
__ref.setField ("_mscale" /*RemoteObject*/ ,bananophaser.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 38;BA.debugLine="mscene = CreateMap()";
Debug.ShouldStop(32);
__ref.setField ("_mscene" /*RemoteObject*/ ,bananophaser.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 39;BA.debugLine="mphysics.Put(\"arcade\", marcade)";
Debug.ShouldStop(64);
__ref.getField(false,"_mphysics" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("arcade"))),(Object)((__ref.getField(false,"_marcade" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 40;BA.debugLine="mconfig.Put(\"physics\", mphysics)";
Debug.ShouldStop(128);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("physics"))),(Object)((__ref.getField(false,"_mphysics" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 41;BA.debugLine="mconfig.Put(\"scale\", mscale)";
Debug.ShouldStop(256);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("scale"))),(Object)((__ref.getField(false,"_mscale" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 42;BA.debugLine="mconfig.Put(\"scene\", mscene)";
Debug.ShouldStop(512);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("scene"))),(Object)((__ref.getField(false,"_mscene" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _colour) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundColor (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "bananophaser","setbackgroundcolor", __ref, _colour);}
Debug.locals.put("colour", _colour);
 BA.debugLineNum = 54;BA.debugLine="Sub SetBackgroundColor(colour As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="mconfig.Put(\"backgroundColor\", colour)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("backgroundColor"))),(Object)((_colour)));
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
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "bananophaser","setheight", __ref, _height);}
Debug.locals.put("height", _height);
 BA.debugLineNum = 94;BA.debugLine="Sub SetHeight(height As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="mconfig.Put(\"height\", height)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((_height)));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setparent(RemoteObject __ref,RemoteObject _parentid) throws Exception{
try {
		Debug.PushSubsStack("SetParent (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setparent")) { return __ref.runUserSub(false, "bananophaser","setparent", __ref, _parentid);}
Debug.locals.put("parentID", _parentid);
 BA.debugLineNum = 74;BA.debugLine="Sub SetParent(parentID As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="mconfig.Put(\"parent\", parentID)";
Debug.ShouldStop(1024);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("parent"))),(Object)((_parentid)));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setphysicsarcadedebug(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPhysicsArcadeDebug (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setphysicsarcadedebug")) { return __ref.runUserSub(false, "bananophaser","setphysicsarcadedebug", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 128;BA.debugLine="Sub SetPhysicsArcadeDebug(b As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="marcade.Put(\"debug\", b)";
Debug.ShouldStop(1);
__ref.getField(false,"_marcade" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)((_b)));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setphysicsarcadegravity(RemoteObject __ref,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("SetPhysicsArcadeGravity (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setphysicsarcadegravity")) { return __ref.runUserSub(false, "bananophaser","setphysicsarcadegravity", __ref, _options);}
Debug.locals.put("options", _options);
 BA.debugLineNum = 124;BA.debugLine="Sub SetPhysicsArcadeGravity(options As Object)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="marcade.Put(\"gravity\", options)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_marcade" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gravity"))),(Object)(_options));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setphysicsdefault(RemoteObject __ref,RemoteObject _def) throws Exception{
try {
		Debug.PushSubsStack("SetPhysicsDefault (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setphysicsdefault")) { return __ref.runUserSub(false, "bananophaser","setphysicsdefault", __ref, _def);}
Debug.locals.put("def", _def);
 BA.debugLineNum = 120;BA.debugLine="Sub SetPhysicsDefault(def As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="mphysics.Put(\"default\", def)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mphysics" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("default"))),(Object)((_def)));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscaleautocenter(RemoteObject __ref,RemoteObject _autocenter) throws Exception{
try {
		Debug.PushSubsStack("SetScaleAutoCenter (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setscaleautocenter")) { return __ref.runUserSub(false, "bananophaser","setscaleautocenter", __ref, _autocenter);}
Debug.locals.put("autoCenter", _autocenter);
 BA.debugLineNum = 50;BA.debugLine="Sub SetScaleAutoCenter(autoCenter As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="mscale.Put(\"autoCenter\", autoCenter)";
Debug.ShouldStop(262144);
__ref.getField(false,"_mscale" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("autoCenter"))),(Object)((_autocenter)));
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
public static RemoteObject  _setscalemode(RemoteObject __ref,RemoteObject _scalemode) throws Exception{
try {
		Debug.PushSubsStack("SetScaleMode (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setscalemode")) { return __ref.runUserSub(false, "bananophaser","setscalemode", __ref, _scalemode);}
Debug.locals.put("scaleMode", _scalemode);
 BA.debugLineNum = 46;BA.debugLine="Sub SetScaleMode(scaleMode As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="mscale.Put(\"mode\", scaleMode)";
Debug.ShouldStop(16384);
__ref.getField(false,"_mscale" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((_scalemode)));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscene(RemoteObject __ref,RemoteObject _gs) throws Exception{
try {
		Debug.PushSubsStack("SetScene (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setscene")) { return __ref.runUserSub(false, "bananophaser","setscene", __ref, _gs);}
Debug.locals.put("gs", _gs);
 BA.debugLineNum = 59;BA.debugLine="Sub SetScene(gs As BANanoObject)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="mconfig.Put(\"scene\", gs)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("scene"))),(Object)((_gs.getObject())));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypeauto(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeAuto (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("settypeauto")) { return __ref.runUserSub(false, "bananophaser","settypeauto", __ref, _b);}
RemoteObject _auto = RemoteObject.declareNull("Object");
Debug.locals.put("b", _b);
 BA.debugLineNum = 104;BA.debugLine="Sub SetTypeAuto(b As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="If b = False Then Return";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_b,bananophaser.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 106;BA.debugLine="Dim auto As Object = Phaser.GetField(\"AUTO\")";
Debug.ShouldStop(512);
_auto = (__ref.getField(false,"_phaser" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("AUTO"))).getObject());Debug.locals.put("auto", _auto);Debug.locals.put("auto", _auto);
 BA.debugLineNum = 107;BA.debugLine="mconfig.Put(\"type\", auto)";
Debug.ShouldStop(1024);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)(_auto));
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
public static RemoteObject  _settypecanvas(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeCanvas (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("settypecanvas")) { return __ref.runUserSub(false, "bananophaser","settypecanvas", __ref, _b);}
RemoteObject _auto = RemoteObject.declareNull("Object");
Debug.locals.put("b", _b);
 BA.debugLineNum = 114;BA.debugLine="Sub SetTypeCanvas(b As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="If b = False Then Return";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_b,bananophaser.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 116;BA.debugLine="Dim auto As Object = Phaser.GetField(\"CANVAS\")";
Debug.ShouldStop(524288);
_auto = (__ref.getField(false,"_phaser" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("CANVAS"))).getObject());Debug.locals.put("auto", _auto);Debug.locals.put("auto", _auto);
 BA.debugLineNum = 117;BA.debugLine="mconfig.Put(\"type\", auto)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)(_auto));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypewebgl(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeWebGL (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("settypewebgl")) { return __ref.runUserSub(false, "bananophaser","settypewebgl", __ref, _b);}
RemoteObject _auto = RemoteObject.declareNull("Object");
Debug.locals.put("b", _b);
 BA.debugLineNum = 98;BA.debugLine="Sub SetTypeWebGL(b As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="If b = False Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_b,bananophaser.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 100;BA.debugLine="Dim auto As Object = Phaser.GetField(\"WEBGL\")";
Debug.ShouldStop(8);
_auto = (__ref.getField(false,"_phaser" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("WEBGL"))).getObject());Debug.locals.put("auto", _auto);Debug.locals.put("auto", _auto);
 BA.debugLineNum = 101;BA.debugLine="mconfig.Put(\"type\", auto)";
Debug.ShouldStop(16);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)(_auto));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "bananophaser","setwidth", __ref, _width);}
Debug.locals.put("width", _width);
 BA.debugLineNum = 90;BA.debugLine="Sub SetWidth(width As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="mconfig.Put(\"width\", width)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((_width)));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Start (bananophaser) ","bananophaser",3,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("start")) { return __ref.runUserSub(false, "bananophaser","start", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Sub Start";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="game.Initialize2(\"Phaser.Game\", mconfig)";
Debug.ShouldStop(32768);
__ref.getField(false,"_game" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Phaser.Game")),(Object)((__ref.getField(false,"_mconfig" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}