package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class phaserscene_subs_0 {


public static RemoteObject  _absolute(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("absolute (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("absolute")) { return __ref.runUserSub(false, "phaserscene","absolute", __ref, _v);}
RemoteObject _a = RemoteObject.createImmutable(0);
Debug.locals.put("v", _v);
 BA.debugLineNum = 26;BA.debugLine="Sub absolute(v As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Dim a As Int = Math.RunMethod(\"abs\", Array(v))";
Debug.ShouldStop(67108864);
_a = BA.numberCast(int.class, __ref.getField(false,"_math" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("abs")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_v)})))));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 28;BA.debugLine="Return a";
Debug.ShouldStop(134217728);
if (true) return BA.NumberToString(_a);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _allowgravity(RemoteObject __ref,RemoteObject _bo,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("AllowGravity (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("allowgravity")) { return __ref.runUserSub(false, "phaserscene","allowgravity", __ref, _bo, _b);}
Debug.locals.put("bo", _bo);
Debug.locals.put("b", _b);
 BA.debugLineNum = 214;BA.debugLine="Sub AllowGravity(bo As BANanoObject, b As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="bo.SetField(\"allowGravity\", Array(b))";
Debug.ShouldStop(4194304);
_bo.runVoidMethod ("SetField",(Object)(BA.ObjectToString("allowGravity")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)}))));
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _anchorset(RemoteObject __ref,RemoteObject _bo,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("AnchorSet (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,400);
if (RapidSub.canDelegate("anchorset")) { return __ref.runUserSub(false, "phaserscene","anchorset", __ref, _bo, _x, _y);}
Debug.locals.put("bo", _bo);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 400;BA.debugLine="Sub AnchorSet(bo As BANanoObject, x As Double, y A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 402;BA.debugLine="bo.GetField(\"anchor\").RunMethod(\"set\", Array(x, y";
Debug.ShouldStop(131072);
_bo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("anchor"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_x),(_y)}))));
 BA.debugLineNum = 403;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bodysetvelocityx(RemoteObject __ref,RemoteObject _obj,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("BodySetVelocityX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("bodysetvelocityx")) { return __ref.runUserSub(false, "phaserscene","bodysetvelocityx", __ref, _obj, _x);}
Debug.locals.put("obj", _obj);
Debug.locals.put("x", _x);
 BA.debugLineNum = 103;BA.debugLine="Sub BodySetVelocityX(obj As BANanoObject, x As Obj";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityX\", Ar";
Debug.ShouldStop(128);
_obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVelocityX")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_x}))));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bodysetvelocityy(RemoteObject __ref,RemoteObject _obj,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("BodySetVelocityY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("bodysetvelocityy")) { return __ref.runUserSub(false, "phaserscene","bodysetvelocityy", __ref, _obj, _y);}
Debug.locals.put("obj", _obj);
Debug.locals.put("y", _y);
 BA.debugLineNum = 107;BA.debugLine="Sub BodySetVelocityY(obj As BANanoObject, y As Obj";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityY\", Ar";
Debug.ShouldStop(2048);
_obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVelocityY")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_y}))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _childreniterate(RemoteObject __ref,RemoteObject _parent,RemoteObject _callthisback) throws Exception{
try {
		Debug.PushSubsStack("ChildrenIterate (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("childreniterate")) { return __ref.runUserSub(false, "phaserscene","childreniterate", __ref, _parent, _callthisback);}
Debug.locals.put("parent", _parent);
Debug.locals.put("CallThisBack", _callthisback);
 BA.debugLineNum = 95;BA.debugLine="Sub ChildrenIterate(parent As BANanoObject, CallTh";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="parent.GetField(\"children\").RunMethod(\"iterate\",";
Debug.ShouldStop(-2147483648);
_parent.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("children"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("iterate")),(Object)((_callthisback.getObject())));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Physics As BANanoObject";
phaserscene._physics = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_physics",phaserscene._physics);
 //BA.debugLineNum = 3;BA.debugLine="Private Anims As BANanoObject";
phaserscene._anims = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_anims",phaserscene._anims);
 //BA.debugLineNum = 4;BA.debugLine="Private Input As BANanoObject";
phaserscene._input = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_input",phaserscene._input);
 //BA.debugLineNum = 5;BA.debugLine="Private Cursors As BANanoObject";
phaserscene._cursors = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_cursors",phaserscene._cursors);
 //BA.debugLineNum = 6;BA.debugLine="Public Scene As BANanoObject";
phaserscene._scene = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_scene",phaserscene._scene);
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano";
phaserscene._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",phaserscene._banano);
 //BA.debugLineNum = 8;BA.debugLine="Private Scale As BANanoObject";
phaserscene._scale = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_scale",phaserscene._scale);
 //BA.debugLineNum = 9;BA.debugLine="Private World As BANanoObject";
phaserscene._world = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_world",phaserscene._world);
 //BA.debugLineNum = 10;BA.debugLine="Private Math As BANanoObject";
phaserscene._math = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_math",phaserscene._math);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleartint(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("ClearTint (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("cleartint")) { return __ref.runUserSub(false, "phaserscene","cleartint", __ref, _bo);}
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 205;BA.debugLine="Sub ClearTint(bo As BANanoObject)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="bo.RunMethod(\"clearTint\", Null)";
Debug.ShouldStop(8192);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("clearTint")),(Object)(phaserscene.__c.getField(false,"Null")));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _countactive(RemoteObject __ref,RemoteObject _bo,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("CountActive (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("countactive")) { return __ref.runUserSub(false, "phaserscene","countactive", __ref, _bo, _b);}
RemoteObject _active = RemoteObject.createImmutable(0);
Debug.locals.put("bo", _bo);
Debug.locals.put("b", _b);
 BA.debugLineNum = 149;BA.debugLine="Sub CountActive(bo As BANanoObject, b As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim active As Int = bo.RunMethod(\"countActive\", A";
Debug.ShouldStop(2097152);
_active = BA.numberCast(int.class, _bo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("countActive")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)})))).runMethod(false,"Result"));Debug.locals.put("active", _active);Debug.locals.put("active", _active);
 BA.debugLineNum = 151;BA.debugLine="Return active";
Debug.ShouldStop(4194304);
if (true) return _active;
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createanime(RemoteObject __ref,RemoteObject _key,RemoteObject _spritename,RemoteObject _framerate,RemoteObject _startframe,RemoteObject _endframe,RemoteObject _irepeat) throws Exception{
try {
		Debug.PushSubsStack("CreateAnime (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("createanime")) { return __ref.runUserSub(false, "phaserscene","createanime", __ref, _key, _spritename, _framerate, _startframe, _endframe, _irepeat);}
RemoteObject _anime = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lframes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _bframes = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("key", _key);
Debug.locals.put("spriteName", _spritename);
Debug.locals.put("frameRate", _framerate);
Debug.locals.put("startFrame", _startframe);
Debug.locals.put("endFrame", _endframe);
Debug.locals.put("irepeat", _irepeat);
 BA.debugLineNum = 341;BA.debugLine="Sub CreateAnime(key As String, spriteName As Strin";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 342;BA.debugLine="Dim anime As Map = CreateMap()";
Debug.ShouldStop(2097152);
_anime = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_anime = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("anime", _anime);Debug.locals.put("anime", _anime);
 BA.debugLineNum = 343;BA.debugLine="anime.Put(\"key\", key)";
Debug.ShouldStop(4194304);
_anime.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("key"))),(Object)((_key)));
 BA.debugLineNum = 344;BA.debugLine="anime.Put(\"frameRate\", frameRate)";
Debug.ShouldStop(8388608);
_anime.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("frameRate"))),(Object)((_framerate)));
 BA.debugLineNum = 345;BA.debugLine="If irepeat <> Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("N",_irepeat)) { 
 BA.debugLineNum = 346;BA.debugLine="anime.Put(\"repeat\", irepeat)";
Debug.ShouldStop(33554432);
_anime.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeat"))),(Object)(_irepeat));
 };
 BA.debugLineNum = 348;BA.debugLine="If startFrame = endFrame Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_startframe,BA.numberCast(double.class, _endframe))) { 
 BA.debugLineNum = 349;BA.debugLine="Dim options As Map = CreateMap()";
Debug.ShouldStop(268435456);
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_options = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 350;BA.debugLine="options.Put(\"key\", spriteName)";
Debug.ShouldStop(536870912);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("key"))),(Object)((_spritename)));
 BA.debugLineNum = 351;BA.debugLine="options.Put(\"frame\", startFrame)";
Debug.ShouldStop(1073741824);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("frame"))),(Object)((_startframe)));
 BA.debugLineNum = 352;BA.debugLine="Dim lframes As List";
Debug.ShouldStop(-2147483648);
_lframes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lframes", _lframes);
 BA.debugLineNum = 353;BA.debugLine="lframes.Initialize2(Array(options))";
Debug.ShouldStop(1);
_lframes.runVoidMethod ("Initialize2",(Object)(phaserscene.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_options.getObject())})))));
 BA.debugLineNum = 354;BA.debugLine="anime.Put(\"frames\", lframes)";
Debug.ShouldStop(2);
_anime.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("frames"))),(Object)((_lframes.getObject())));
 }else {
 BA.debugLineNum = 356;BA.debugLine="Dim bframes As BANanoObject = GenerateFrameNumbe";
Debug.ShouldStop(8);
_bframes = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bframes = __ref.runClassMethod (b4j.example.phaserscene.class, "_generateframenumbers" /*RemoteObject*/ ,(Object)(_spritename),(Object)(_startframe),(Object)(_endframe));Debug.locals.put("bframes", _bframes);Debug.locals.put("bframes", _bframes);
 BA.debugLineNum = 357;BA.debugLine="anime.Put(\"frames\", bframes)";
Debug.ShouldStop(16);
_anime.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("frames"))),(Object)((_bframes.getObject())));
 };
 BA.debugLineNum = 360;BA.debugLine="Anims.RunMethod(\"create\", anime)";
Debug.ShouldStop(128);
__ref.getField(false,"_anims" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("create")),(Object)((_anime.getObject())));
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcursorkeys(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateCursorKeys (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("createcursorkeys")) { return __ref.runUserSub(false, "phaserscene","createcursorkeys", __ref);}
 BA.debugLineNum = 312;BA.debugLine="Sub CreateCursorKeys";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Cursors = Input.GetField(\"keyboard\").RunMethod(\"c";
Debug.ShouldStop(16777216);
__ref.setField ("_cursors" /*RemoteObject*/ ,__ref.getField(false,"_input" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("keyboard"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createCursorKeys")),(Object)(phaserscene.__c.getField(false,"Null"))));
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createemitter(RemoteObject __ref,RemoteObject _particles,RemoteObject _speed,RemoteObject _scalestart,RemoteObject _scaleend,RemoteObject _blendmode) throws Exception{
try {
		Debug.PushSubsStack("CreateEmitter (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("createemitter")) { return __ref.runUserSub(false, "phaserscene","createemitter", __ref, _particles, _speed, _scalestart, _scaleend, _blendmode);}
RemoteObject _vscale = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _emitter = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("particles", _particles);
Debug.locals.put("speed", _speed);
Debug.locals.put("scaleStart", _scalestart);
Debug.locals.put("scaleEnd", _scaleend);
Debug.locals.put("blendMode", _blendmode);
 BA.debugLineNum = 260;BA.debugLine="Sub CreateEmitter(particles As BANanoObject, speed";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="Dim vscale As Map = CreateMap(\"start\":scaleStart,";
Debug.ShouldStop(16);
_vscale = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_vscale = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("start")),(_scalestart),RemoteObject.createImmutable(("end")),(_scaleend)}));Debug.locals.put("vscale", _vscale);Debug.locals.put("vscale", _vscale);
 BA.debugLineNum = 263;BA.debugLine="Dim options As Map = CreateMap()";
Debug.ShouldStop(64);
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_options = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 264;BA.debugLine="options.Put(\"speed\", speed)";
Debug.ShouldStop(128);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("speed"))),(Object)((_speed)));
 BA.debugLineNum = 265;BA.debugLine="options.Put(\"scale\", vscale)";
Debug.ShouldStop(256);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("scale"))),(Object)((_vscale.getObject())));
 BA.debugLineNum = 266;BA.debugLine="options.Put(\"blendMode\", blendMode)";
Debug.ShouldStop(512);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blendMode"))),(Object)((_blendmode)));
 BA.debugLineNum = 268;BA.debugLine="Dim emitter As BANanoObject = particles.RunMethod";
Debug.ShouldStop(2048);
_emitter = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_emitter = _particles.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createEmitter")),(Object)((_options.getObject())));Debug.locals.put("emitter", _emitter);Debug.locals.put("emitter", _emitter);
 BA.debugLineNum = 269;BA.debugLine="Return emitter";
Debug.ShouldStop(4096);
if (true) return _emitter;
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinstance(RemoteObject __ref,RemoteObject _parent,RemoteObject _x,RemoteObject _y,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("CreateInstance (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("createinstance")) { return __ref.runUserSub(false, "phaserscene","createinstance", __ref, _parent, _x, _y, _key);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("parent", _parent);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("key", _key);
 BA.debugLineNum = 209;BA.debugLine="Sub CreateInstance(parent As BANanoObject, x As In";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim bo As BANanoObject = parent.RunMethod(\"create";
Debug.ShouldStop(131072);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = _parent.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("create")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_x),(_y),(_key)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 211;BA.debugLine="Return bo";
Debug.ShouldStop(262144);
if (true) return _bo;
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Cstr (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "phaserscene","cstr", __ref, _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 123;BA.debugLine="Sub Cstr(obj As Object) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Return \"\" & obj";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_obj);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _decrementx(RemoteObject __ref,RemoteObject _bo,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("DecrementX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("decrementx")) { return __ref.runUserSub(false, "phaserscene","decrementx", __ref, _bo, _x);}
RemoteObject _oldx = RemoteObject.createImmutable(0);
Debug.locals.put("bo", _bo);
Debug.locals.put("x", _x);
 BA.debugLineNum = 171;BA.debugLine="Sub DecrementX(bo As BANanoObject, x As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Dim oldx As Int = GetX(bo)";
Debug.ShouldStop(2048);
_oldx = __ref.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(_bo));Debug.locals.put("oldx", _oldx);Debug.locals.put("oldx", _oldx);
 BA.debugLineNum = 173;BA.debugLine="oldx = oldx - x";
Debug.ShouldStop(4096);
_oldx = RemoteObject.solve(new RemoteObject[] {_oldx,_x}, "-",1, 1);Debug.locals.put("oldx", _oldx);
 BA.debugLineNum = 174;BA.debugLine="SetX(bo, oldx)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.phaserscene.class, "_setx" /*RemoteObject*/ ,(Object)(_bo),(Object)(_oldx));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _decrementy(RemoteObject __ref,RemoteObject _bo,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DecrementY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("decrementy")) { return __ref.runUserSub(false, "phaserscene","decrementy", __ref, _bo, _y);}
RemoteObject _oldy = RemoteObject.createImmutable(0);
Debug.locals.put("bo", _bo);
Debug.locals.put("y", _y);
 BA.debugLineNum = 177;BA.debugLine="Sub DecrementY(bo As BANanoObject, y As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Dim oldy As Int = GetY(bo)";
Debug.ShouldStop(131072);
_oldy = __ref.runClassMethod (b4j.example.phaserscene.class, "_gety" /*RemoteObject*/ ,(Object)(_bo));Debug.locals.put("oldy", _oldy);Debug.locals.put("oldy", _oldy);
 BA.debugLineNum = 179;BA.debugLine="oldy = oldy - y";
Debug.ShouldStop(262144);
_oldy = RemoteObject.solve(new RemoteObject[] {_oldy,_y}, "-",1, 1);Debug.locals.put("oldy", _oldy);
 BA.debugLineNum = 180;BA.debugLine="SetY(bo, oldy)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.phaserscene.class, "_sety" /*RemoteObject*/ ,(Object)(_bo),(Object)(_oldy));
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
public static RemoteObject  _disablebody(RemoteObject __ref,RemoteObject _obj,RemoteObject _disablegameobject,RemoteObject _hidegameobject) throws Exception{
try {
		Debug.PushSubsStack("DisableBody (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("disablebody")) { return __ref.runUserSub(false, "phaserscene","disablebody", __ref, _obj, _disablegameobject, _hidegameobject);}
Debug.locals.put("obj", _obj);
Debug.locals.put("disableGameObject", _disablegameobject);
Debug.locals.put("hideGameObject", _hidegameobject);
 BA.debugLineNum = 145;BA.debugLine="Sub DisableBody(obj As BANanoObject, disableGameOb";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="obj.RunMethod(\"disableBody\", Array(disableGameObj";
Debug.ShouldStop(131072);
_obj.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("disableBody")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_disablegameobject),(_hidegameobject)}))));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downisdown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DownIsDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("downisdown")) { return __ref.runUserSub(false, "phaserscene","downisdown", __ref);}
RemoteObject _bres = RemoteObject.createImmutable(false);
 BA.debugLineNum = 329;BA.debugLine="Sub DownIsDown As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"down\").Ge";
Debug.ShouldStop(512);
_bres = BA.ObjectToBoolean(__ref.getField(false,"_cursors" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("down"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("isDown"))));Debug.locals.put("bres", _bres);Debug.locals.put("bres", _bres);
 BA.debugLineNum = 331;BA.debugLine="Return bres";
Debug.ShouldStop(1024);
if (true) return _bres;
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enablebody(RemoteObject __ref,RemoteObject _bo,RemoteObject _b1,RemoteObject _x,RemoteObject _y,RemoteObject _b2,RemoteObject _b3) throws Exception{
try {
		Debug.PushSubsStack("EnableBody (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("enablebody")) { return __ref.runUserSub(false, "phaserscene","enablebody", __ref, _bo, _b1, _x, _y, _b2, _b3);}
Debug.locals.put("bo", _bo);
Debug.locals.put("b1", _b1);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("b2", _b2);
Debug.locals.put("b3", _b3);
 BA.debugLineNum = 196;BA.debugLine="Sub EnableBody(bo As BANanoObject, b1 As Boolean,";
Debug.ShouldStop(8);
 BA.debugLineNum = 198;BA.debugLine="bo.RunMethod(\"enableBody\", Array(b1, x, y, b2, b3";
Debug.ShouldStop(32);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enableBody")),(Object)((RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_b1),(_x),(_y),(_b2),(_b3)}))));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generateframenumbers(RemoteObject __ref,RemoteObject _spritename,RemoteObject _startframe,RemoteObject _endframe) throws Exception{
try {
		Debug.PushSubsStack("GenerateFrameNumbers (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("generateframenumbers")) { return __ref.runUserSub(false, "phaserscene","generateframenumbers", __ref, _spritename, _startframe, _endframe);}
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("spriteName", _spritename);
Debug.locals.put("startFrame", _startframe);
Debug.locals.put("endFrame", _endframe);
 BA.debugLineNum = 364;BA.debugLine="private Sub GenerateFrameNumbers(spriteName As Str";
Debug.ShouldStop(2048);
 BA.debugLineNum = 365;BA.debugLine="Dim options As Map = CreateMap()";
Debug.ShouldStop(4096);
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_options = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 366;BA.debugLine="options.Put(\"start\", startFrame)";
Debug.ShouldStop(8192);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("start"))),(Object)((_startframe)));
 BA.debugLineNum = 367;BA.debugLine="options.Put(\"end\", endFrame)";
Debug.ShouldStop(16384);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("end"))),(Object)((_endframe)));
 BA.debugLineNum = 368;BA.debugLine="Dim bo As BANanoObject = Anims.RunMethod(\"generat";
Debug.ShouldStop(32768);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_anims" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("generateFrameNumbers")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_spritename),(_options.getObject())}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 369;BA.debugLine="Return bo";
Debug.ShouldStop(65536);
if (true) return _bo;
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbody(RemoteObject __ref,RemoteObject _player) throws Exception{
try {
		Debug.PushSubsStack("GetBody (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("getbody")) { return __ref.runUserSub(false, "phaserscene","getbody", __ref, _player);}
RemoteObject _body = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("player", _player);
 BA.debugLineNum = 274;BA.debugLine="Sub GetBody(player As BANanoObject) As BANanoObjec";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Dim Body As BANanoObject = player.GetField(\"body\"";
Debug.ShouldStop(262144);
_body = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_body = _player.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body")));Debug.locals.put("Body", _body);Debug.locals.put("Body", _body);
 BA.debugLineNum = 276;BA.debugLine="Return Body";
Debug.ShouldStop(524288);
if (true) return _body;
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodyvelocityx(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("GetBodyVelocityX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("getbodyvelocityx")) { return __ref.runUserSub(false, "phaserscene","getbodyvelocityx", __ref, _obj);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 127;BA.debugLine="Sub GetBodyVelocityX(obj As BANanoObject) As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Dim x As Int = obj.GetField(\"body\").GetField(\"vel";
Debug.ShouldStop(-2147483648);
_x = BA.numberCast(int.class, _obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("velocity"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x"))).runMethod(false,"Result"));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 129;BA.debugLine="Return x";
Debug.ShouldStop(1);
if (true) return _x;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodyvelocityy(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("GetBodyVelocityY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("getbodyvelocityy")) { return __ref.runUserSub(false, "phaserscene","getbodyvelocityy", __ref, _obj);}
RemoteObject _y = RemoteObject.createImmutable(0);
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 132;BA.debugLine="Sub GetBodyVelocityY(obj As BANanoObject) As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim y As Int = obj.GetField(\"body\").GetField(\"vel";
Debug.ShouldStop(16);
_y = BA.numberCast(int.class, _obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("velocity"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y"))).runMethod(false,"Result"));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 134;BA.debugLine="Return y";
Debug.ShouldStop(32);
if (true) return _y;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodyx(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("GetBodyX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("getbodyx")) { return __ref.runUserSub(false, "phaserscene","getbodyx", __ref, _obj);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 45;BA.debugLine="Sub GetBodyX(obj As BANanoObject) As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Dim x As Int = obj.GetField(\"body\").GetField(\"x\")";
Debug.ShouldStop(8192);
_x = BA.numberCast(int.class, _obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x"))).runMethod(false,"Result"));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 47;BA.debugLine="Return x";
Debug.ShouldStop(16384);
if (true) return _x;
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodyy(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("GetBodyY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("getbodyy")) { return __ref.runUserSub(false, "phaserscene","getbodyy", __ref, _obj);}
RemoteObject _y = RemoteObject.createImmutable(0);
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 40;BA.debugLine="Sub GetBodyY(obj As BANanoObject) As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Dim y As Int = obj.GetField(\"body\").GetField(\"y\")";
Debug.ShouldStop(256);
_y = BA.numberCast(int.class, _obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y"))).runMethod(false,"Result"));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 42;BA.debugLine="Return y";
Debug.ShouldStop(512);
if (true) return _y;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getphysicsworldboundsheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPhysicsWorldBoundsHeight (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("getphysicsworldboundsheight")) { return __ref.runUserSub(false, "phaserscene","getphysicsworldboundsheight", __ref);}
RemoteObject _dbl = RemoteObject.createImmutable(0);
 BA.debugLineNum = 56;BA.debugLine="Sub getPhysicsWorldBoundsHeight As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim dbl As Int = World.GetField(\"bounds\").GetFiel";
Debug.ShouldStop(16777216);
_dbl = BA.numberCast(int.class, __ref.getField(false,"_world" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("bounds"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height"))).runMethod(false,"Result"));Debug.locals.put("dbl", _dbl);Debug.locals.put("dbl", _dbl);
 BA.debugLineNum = 58;BA.debugLine="Return dbl";
Debug.ShouldStop(33554432);
if (true) return _dbl;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getphysicsworldboundswidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPhysicsWorldBoundsWidth (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getphysicsworldboundswidth")) { return __ref.runUserSub(false, "phaserscene","getphysicsworldboundswidth", __ref);}
RemoteObject _dbl = RemoteObject.createImmutable(0);
 BA.debugLineNum = 51;BA.debugLine="Sub getPhysicsWorldBoundsWidth As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Dim dbl As Int = World.GetField(\"bounds\").GetFiel";
Debug.ShouldStop(524288);
_dbl = BA.numberCast(int.class, __ref.getField(false,"_world" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("bounds"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width"))).runMethod(false,"Result"));Debug.locals.put("dbl", _dbl);Debug.locals.put("dbl", _dbl);
 BA.debugLineNum = 53;BA.debugLine="Return dbl";
Debug.ShouldStop(1048576);
if (true) return _dbl;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscene(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScene (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("getscene")) { return __ref.runUserSub(false, "phaserscene","getscene", __ref);}
 BA.debugLineNum = 31;BA.debugLine="private Sub GetScene";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Physics = Scene.GetField(\"physics\")";
Debug.ShouldStop(-2147483648);
__ref.setField ("_physics" /*RemoteObject*/ ,__ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("physics"))));
 BA.debugLineNum = 33;BA.debugLine="Anims = Scene.GetField(\"anims\")";
Debug.ShouldStop(1);
__ref.setField ("_anims" /*RemoteObject*/ ,__ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("anims"))));
 BA.debugLineNum = 34;BA.debugLine="Input = Scene.GetField(\"input\")";
Debug.ShouldStop(2);
__ref.setField ("_input" /*RemoteObject*/ ,__ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("input"))));
 BA.debugLineNum = 35;BA.debugLine="Scale = Scene.GetField(\"scale\")";
Debug.ShouldStop(4);
__ref.setField ("_scale" /*RemoteObject*/ ,__ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scale"))));
 BA.debugLineNum = 36;BA.debugLine="World = Physics.GetField(\"world\")";
Debug.ShouldStop(8);
__ref.setField ("_world" /*RemoteObject*/ ,__ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("world"))));
 BA.debugLineNum = 37;BA.debugLine="Log(Scene)";
Debug.ShouldStop(16);
phaserscene.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_scene" /*RemoteObject*/ ))));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getworldheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetWorldHeight (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("getworldheight")) { return __ref.runUserSub(false, "phaserscene","getworldheight", __ref);}
RemoteObject _h = RemoteObject.createImmutable(0);
 BA.debugLineNum = 73;BA.debugLine="Sub GetWorldHeight As Double";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim h As Double = World.GetField(\"height\").Result";
Debug.ShouldStop(512);
_h = BA.numberCast(double.class, __ref.getField(false,"_world" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height"))).runMethod(false,"Result"));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 75;BA.debugLine="Return h";
Debug.ShouldStop(1024);
if (true) return _h;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getworldwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetWorldWidth (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("getworldwidth")) { return __ref.runUserSub(false, "phaserscene","getworldwidth", __ref);}
RemoteObject _w = RemoteObject.createImmutable(0);
 BA.debugLineNum = 78;BA.debugLine="Sub GetWorldWidth As Double";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Dim w As Double = World.GetField(\"width\").Result";
Debug.ShouldStop(16384);
_w = BA.numberCast(double.class, __ref.getField(false,"_world" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width"))).runMethod(false,"Result"));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 80;BA.debugLine="Return w";
Debug.ShouldStop(32768);
if (true) return _w;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getx(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("GetX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("getx")) { return __ref.runUserSub(false, "phaserscene","getx", __ref, _bo);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 154;BA.debugLine="Sub GetX(bo As BANanoObject) As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="Dim x As Int = bo.GetField(\"x\").Result";
Debug.ShouldStop(67108864);
_x = BA.numberCast(int.class, _bo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("x"))).runMethod(false,"Result"));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 156;BA.debugLine="Return x";
Debug.ShouldStop(134217728);
if (true) return _x;
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gety(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("GetY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("gety")) { return __ref.runUserSub(false, "phaserscene","gety", __ref, _bo);}
RemoteObject _y = RemoteObject.createImmutable(0);
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 191;BA.debugLine="Sub GetY(bo As BANanoObject) As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Dim y As Int = bo.GetField(\"y\").Result";
Debug.ShouldStop(-2147483648);
_y = BA.numberCast(int.class, _bo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("y"))).runMethod(false,"Result"));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 193;BA.debugLine="Return y";
Debug.ShouldStop(1);
if (true) return _y;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _incrementx(RemoteObject __ref,RemoteObject _bo,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("IncrementX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("incrementx")) { return __ref.runUserSub(false, "phaserscene","incrementx", __ref, _bo, _x);}
RemoteObject _oldx = RemoteObject.createImmutable(0);
Debug.locals.put("bo", _bo);
Debug.locals.put("x", _x);
 BA.debugLineNum = 159;BA.debugLine="Sub IncrementX(bo As BANanoObject, x As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="Dim oldx As Int = GetX(bo)";
Debug.ShouldStop(-2147483648);
_oldx = __ref.runClassMethod (b4j.example.phaserscene.class, "_getx" /*RemoteObject*/ ,(Object)(_bo));Debug.locals.put("oldx", _oldx);Debug.locals.put("oldx", _oldx);
 BA.debugLineNum = 161;BA.debugLine="oldx = oldx + x";
Debug.ShouldStop(1);
_oldx = RemoteObject.solve(new RemoteObject[] {_oldx,_x}, "+",1, 1);Debug.locals.put("oldx", _oldx);
 BA.debugLineNum = 162;BA.debugLine="SetX(bo, oldx)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.phaserscene.class, "_setx" /*RemoteObject*/ ,(Object)(_bo),(Object)(_oldx));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _incrementy(RemoteObject __ref,RemoteObject _bo,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("IncrementY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("incrementy")) { return __ref.runUserSub(false, "phaserscene","incrementy", __ref, _bo, _y);}
RemoteObject _oldy = RemoteObject.createImmutable(0);
Debug.locals.put("bo", _bo);
Debug.locals.put("y", _y);
 BA.debugLineNum = 165;BA.debugLine="Sub IncrementY(bo As BANanoObject, y As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Dim oldy As Int = GetY(bo)";
Debug.ShouldStop(32);
_oldy = __ref.runClassMethod (b4j.example.phaserscene.class, "_gety" /*RemoteObject*/ ,(Object)(_bo));Debug.locals.put("oldy", _oldy);Debug.locals.put("oldy", _oldy);
 BA.debugLineNum = 167;BA.debugLine="oldy = oldy + y";
Debug.ShouldStop(64);
_oldy = RemoteObject.solve(new RemoteObject[] {_oldy,_y}, "+",1, 1);Debug.locals.put("oldy", _oldy);
 BA.debugLineNum = 168;BA.debugLine="SetY(bo, oldy)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.phaserscene.class, "_sety" /*RemoteObject*/ ,(Object)(_bo),(Object)(_oldy));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _scenename) throws Exception{
try {
		Debug.PushSubsStack("Initialize (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "phaserscene","initialize", __ref, _ba, _scenename);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("sceneName", _scenename);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(sceneName As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Math.Initialize(\"Math\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_math" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("Math"))));
 BA.debugLineNum = 16;BA.debugLine="Scene.Initialize2(\"Phaser.Scene\", Array(sceneName";
Debug.ShouldStop(32768);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Phaser.Scene")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_scenename)}))));
 BA.debugLineNum = 18;BA.debugLine="SetOnInit(Me, \"getScene\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.phaserscene.class, "_setoninit" /*RemoteObject*/ ,(Object)(__ref),(Object)(RemoteObject.createImmutable("getScene")));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isbodytouchingdown(RemoteObject __ref,RemoteObject _player) throws Exception{
try {
		Debug.PushSubsStack("IsBodyTouchingDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("isbodytouchingdown")) { return __ref.runUserSub(false, "phaserscene","isbodytouchingdown", __ref, _player);}
RemoteObject _body = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _td = RemoteObject.createImmutable(false);
Debug.locals.put("player", _player);
 BA.debugLineNum = 279;BA.debugLine="Sub IsBodyTouchingDown(player As BANanoObject) As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="Dim Body As BANanoObject = GetBody(player)";
Debug.ShouldStop(8388608);
_body = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_body = __ref.runClassMethod (b4j.example.phaserscene.class, "_getbody" /*RemoteObject*/ ,(Object)(_player));Debug.locals.put("Body", _body);Debug.locals.put("Body", _body);
 BA.debugLineNum = 281;BA.debugLine="Dim td As Boolean = Body.GetField(\"touching\").Get";
Debug.ShouldStop(16777216);
_td = BA.ObjectToBoolean(_body.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("touching"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("down"))).runMethod(false,"Result"));Debug.locals.put("td", _td);Debug.locals.put("td", _td);
 BA.debugLineNum = 282;BA.debugLine="Return td";
Debug.ShouldStop(33554432);
if (true) return _td;
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leftisdown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LeftIsDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("leftisdown")) { return __ref.runUserSub(false, "phaserscene","leftisdown", __ref);}
RemoteObject _bres = RemoteObject.createImmutable(false);
 BA.debugLineNum = 317;BA.debugLine="Sub LeftIsDown As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"left\").Ge";
Debug.ShouldStop(536870912);
_bres = BA.ObjectToBoolean(__ref.getField(false,"_cursors" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("left"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("isDown"))));Debug.locals.put("bres", _bres);Debug.locals.put("bres", _bres);
 BA.debugLineNum = 319;BA.debugLine="Return bres";
Debug.ShouldStop(1073741824);
if (true) return _bres;
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddcollider(RemoteObject __ref,RemoteObject _obj1,RemoteObject _obj2) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddCollider (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,469);
if (RapidSub.canDelegate("physicsaddcollider")) { return __ref.runUserSub(false, "phaserscene","physicsaddcollider", __ref, _obj1, _obj2);}
Debug.locals.put("obj1", _obj1);
Debug.locals.put("obj2", _obj2);
 BA.debugLineNum = 469;BA.debugLine="Sub PhysicsAddCollider(obj1 As BANanoObject, obj2";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 471;BA.debugLine="Physics.GetField(\"add\").RunMethod(\"collider\", Arr";
Debug.ShouldStop(4194304);
__ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("collider")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_obj1.getObject()),(_obj2.getObject())}))));
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddcollider5(RemoteObject __ref,RemoteObject _obj1,RemoteObject _obj2,RemoteObject _obj3,RemoteObject _obj4,RemoteObject _obj5) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddCollider5 (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,474);
if (RapidSub.canDelegate("physicsaddcollider5")) { return __ref.runUserSub(false, "phaserscene","physicsaddcollider5", __ref, _obj1, _obj2, _obj3, _obj4, _obj5);}
Debug.locals.put("obj1", _obj1);
Debug.locals.put("obj2", _obj2);
Debug.locals.put("obj3", _obj3);
Debug.locals.put("obj4", _obj4);
Debug.locals.put("obj5", _obj5);
 BA.debugLineNum = 474;BA.debugLine="Sub PhysicsAddCollider5(obj1 As BANanoObject, obj2";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 476;BA.debugLine="Physics.GetField(\"add\").RunMethod(\"collider\", Arr";
Debug.ShouldStop(134217728);
__ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("collider")),(Object)((RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_obj1.getObject()),(_obj2.getObject()),(_obj3.getObject()),(_obj4.getObject()),(_obj5.getObject())}))));
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddgroup(RemoteObject __ref,RemoteObject _key,RemoteObject _irepeat,RemoteObject _x,RemoteObject _y,RemoteObject _stepx,RemoteObject _immovable) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddGroup (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,499);
if (RapidSub.canDelegate("physicsaddgroup")) { return __ref.runUserSub(false, "phaserscene","physicsaddgroup", __ref, _key, _irepeat, _x, _y, _stepx, _immovable);}
RemoteObject _setxy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("key", _key);
Debug.locals.put("irepeat", _irepeat);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("stepX", _stepx);
Debug.locals.put("immovable", _immovable);
 BA.debugLineNum = 499;BA.debugLine="Sub PhysicsAddGroup(key As String, irepeat As Stri";
Debug.ShouldStop(262144);
 BA.debugLineNum = 501;BA.debugLine="Dim setxy As Map = CreateMap()";
Debug.ShouldStop(1048576);
_setxy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_setxy = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("setxy", _setxy);Debug.locals.put("setxy", _setxy);
 BA.debugLineNum = 502;BA.debugLine="setxy.Put(\"x\", x)";
Debug.ShouldStop(2097152);
_setxy.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 503;BA.debugLine="setxy.Put(\"y\", y)";
Debug.ShouldStop(4194304);
_setxy.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 504;BA.debugLine="setxy.Put(\"stepX\", stepX)";
Debug.ShouldStop(8388608);
_setxy.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stepX"))),(Object)((_stepx)));
 BA.debugLineNum = 506;BA.debugLine="Dim options As Map = CreateMap()";
Debug.ShouldStop(33554432);
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_options = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 507;BA.debugLine="options.Put(\"key\", key)";
Debug.ShouldStop(67108864);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("key"))),(Object)((_key)));
 BA.debugLineNum = 508;BA.debugLine="options.Put(\"repeat\", irepeat)";
Debug.ShouldStop(134217728);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeat"))),(Object)((_irepeat)));
 BA.debugLineNum = 509;BA.debugLine="options.Put(\"immovable\", immovable)";
Debug.ShouldStop(268435456);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("immovable"))),(Object)((_immovable)));
 BA.debugLineNum = 510;BA.debugLine="options.Put(\"setXY\", setxy)";
Debug.ShouldStop(536870912);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("setXY"))),(Object)((_setxy.getObject())));
 BA.debugLineNum = 512;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
Debug.ShouldStop(-2147483648);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("group")),(Object)((_options.getObject())));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 513;BA.debugLine="Return bo";
Debug.ShouldStop(1);
if (true) return _bo;
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddgroup1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddGroup1 (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,525);
if (RapidSub.canDelegate("physicsaddgroup1")) { return __ref.runUserSub(false, "phaserscene","physicsaddgroup1", __ref);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 525;BA.debugLine="Sub PhysicsAddGroup1() As BANanoObject";
Debug.ShouldStop(4096);
 BA.debugLineNum = 527;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
Debug.ShouldStop(16384);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("group")),(Object)(phaserscene.__c.getField(false,"Null")));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 528;BA.debugLine="Return bo";
Debug.ShouldStop(32768);
if (true) return _bo;
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddimage(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddImage (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,487);
if (RapidSub.canDelegate("physicsaddimage")) { return __ref.runUserSub(false, "phaserscene","physicsaddimage", __ref, _x, _y, _key);}
RemoteObject _img = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("key", _key);
 BA.debugLineNum = 487;BA.debugLine="Sub PhysicsAddImage(x As Int, y As Int, key As Str";
Debug.ShouldStop(64);
 BA.debugLineNum = 489;BA.debugLine="Dim img As BANanoObject = Physics.GetField(\"add\")";
Debug.ShouldStop(256);
_img = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_img = __ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("image")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_x),(_y),(_key)}))));Debug.locals.put("img", _img);Debug.locals.put("img", _img);
 BA.debugLineNum = 490;BA.debugLine="Return img";
Debug.ShouldStop(512);
if (true) return _img;
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddoverlap(RemoteObject __ref,RemoteObject _obj1,RemoteObject _obj2,RemoteObject _obj3,RemoteObject _obj4,RemoteObject _obj5) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddOverlap (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("physicsaddoverlap")) { return __ref.runUserSub(false, "phaserscene","physicsaddoverlap", __ref, _obj1, _obj2, _obj3, _obj4, _obj5);}
Debug.locals.put("obj1", _obj1);
Debug.locals.put("obj2", _obj2);
Debug.locals.put("obj3", _obj3);
Debug.locals.put("obj4", _obj4);
Debug.locals.put("obj5", _obj5);
 BA.debugLineNum = 464;BA.debugLine="Sub PhysicsAddOverlap(obj1 As BANanoObject, obj2 A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 466;BA.debugLine="Physics.GetField(\"add\").RunMethod(\"overlap\", Arra";
Debug.ShouldStop(131072);
__ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("overlap")),(Object)((RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_obj1.getObject()),(_obj2.getObject()),(_obj3.getObject()),(_obj4.getObject()),(_obj5.getObject())}))));
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddsprite(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddSprite (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("physicsaddsprite")) { return __ref.runUserSub(false, "phaserscene","physicsaddsprite", __ref, _x, _y, _key);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("key", _key);
 BA.debugLineNum = 481;BA.debugLine="Sub PhysicsAddSprite(x As Int, y As Int, key As St";
Debug.ShouldStop(1);
 BA.debugLineNum = 483;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
Debug.ShouldStop(4);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("sprite")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_x),(_y),(_key)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 484;BA.debugLine="Return bo";
Debug.ShouldStop(8);
if (true) return _bo;
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsaddstaticgroup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PhysicsAddStaticGroup (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,493);
if (RapidSub.canDelegate("physicsaddstaticgroup")) { return __ref.runUserSub(false, "phaserscene","physicsaddstaticgroup", __ref);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 493;BA.debugLine="Sub PhysicsAddStaticGroup As BANanoObject";
Debug.ShouldStop(4096);
 BA.debugLineNum = 495;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
Debug.ShouldStop(16384);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_physics" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("staticGroup")),(Object)(phaserscene.__c.getField(false,"Null")));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 496;BA.debugLine="Return bo";
Debug.ShouldStop(32768);
if (true) return _bo;
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicspause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PhysicsPause (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("physicspause")) { return __ref.runUserSub(false, "phaserscene","physicspause", __ref);}
 BA.debugLineNum = 516;BA.debugLine="Sub PhysicsPause() As BANanoObject";
Debug.ShouldStop(8);
 BA.debugLineNum = 517;BA.debugLine="Physics.RunMethod(\"pause\", Null)";
Debug.ShouldStop(16);
__ref.getField(false,"_physics" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("pause")),(Object)(phaserscene.__c.getField(false,"Null")));
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physicsresume(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PhysicsResume (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("physicsresume")) { return __ref.runUserSub(false, "phaserscene","physicsresume", __ref);}
 BA.debugLineNum = 520;BA.debugLine="Sub PhysicsResume() As BANanoObject";
Debug.ShouldStop(128);
 BA.debugLineNum = 521;BA.debugLine="Physics.RunMethod(\"resume\", Null)";
Debug.ShouldStop(256);
__ref.getField(false,"_physics" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("resume")),(Object)(phaserscene.__c.getField(false,"Null")));
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playanime(RemoteObject __ref,RemoteObject _bo,RemoteObject _anime,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("PlayAnime (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("playanime")) { return __ref.runUserSub(false, "phaserscene","playanime", __ref, _bo, _anime, _b);}
RemoteObject _animsx = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("bo", _bo);
Debug.locals.put("anime", _anime);
Debug.locals.put("b", _b);
 BA.debugLineNum = 298;BA.debugLine="Sub PlayAnime(bo As BANanoObject, anime As String,";
Debug.ShouldStop(512);
 BA.debugLineNum = 299;BA.debugLine="Dim animsx As BANanoObject = bo.GetField(\"anims\")";
Debug.ShouldStop(1024);
_animsx = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_animsx = _bo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("anims")));Debug.locals.put("animsx", _animsx);Debug.locals.put("animsx", _animsx);
 BA.debugLineNum = 300;BA.debugLine="If b = Null Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("n",_b)) { 
 BA.debugLineNum = 301;BA.debugLine="animsx.RunMethod(\"play\", Array(anime))";
Debug.ShouldStop(4096);
_animsx.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("play")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_anime)}))));
 }else {
 BA.debugLineNum = 303;BA.debugLine="animsx.RunMethod(\"play\", Array(anime, b))";
Debug.ShouldStop(16384);
_animsx.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("play")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_anime),_b}))));
 };
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playsound(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("PlaySound (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("playsound")) { return __ref.runUserSub(false, "phaserscene","playsound", __ref, _bo);}
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 252;BA.debugLine="Sub PlaySound(bo As BANanoObject)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="bo.RunMethod(\"play\", Null)";
Debug.ShouldStop(268435456);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("play")),(Object)(phaserscene.__c.getField(false,"Null")));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playsoundloop(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("PlaySoundLoop (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("playsoundloop")) { return __ref.runUserSub(false, "phaserscene","playsoundloop", __ref, _bo);}
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 256;BA.debugLine="Sub PlaySoundLoop(bo As BANanoObject)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="bo.RunMethod(\"play\", Array(\"\",0 , 1, True))";
Debug.ShouldStop(1);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("play")),(Object)((RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable(("")),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((1)),(phaserscene.__c.getField(true,"True"))}))));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _random(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("random (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("random")) { return __ref.runUserSub(false, "phaserscene","random", __ref);}
RemoteObject _r = RemoteObject.createImmutable(0);
 BA.debugLineNum = 21;BA.debugLine="Sub random() As Double";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim r As Double = Math.RunMethod(\"random\", Null)";
Debug.ShouldStop(2097152);
_r = BA.numberCast(double.class, __ref.getField(false,"_math" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("random")),(Object)(phaserscene.__c.getField(false,"Null"))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 23;BA.debugLine="Return r";
Debug.ShouldStop(4194304);
if (true) return _r;
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshbody(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("RefreshBody (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("refreshbody")) { return __ref.runUserSub(false, "phaserscene","refreshbody", __ref, _bo);}
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 232;BA.debugLine="Sub RefreshBody(bo As BANanoObject)";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="bo.RunMethod(\"refreshBody\", Null)";
Debug.ShouldStop(256);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("refreshBody")),(Object)(phaserscene.__c.getField(false,"Null")));
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rightisdown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RightIsDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,459);
if (RapidSub.canDelegate("rightisdown")) { return __ref.runUserSub(false, "phaserscene","rightisdown", __ref);}
RemoteObject _bres = RemoteObject.createImmutable(false);
 BA.debugLineNum = 459;BA.debugLine="Sub RightIsDown As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 460;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"right\").G";
Debug.ShouldStop(2048);
_bres = BA.ObjectToBoolean(__ref.getField(false,"_cursors" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("right"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("isDown"))));Debug.locals.put("bres", _bres);Debug.locals.put("bres", _bres);
 BA.debugLineNum = 461;BA.debugLine="Return bres";
Debug.ShouldStop(4096);
if (true) return _bres;
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneaddimage(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("SceneAddImage (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,411);
if (RapidSub.canDelegate("sceneaddimage")) { return __ref.runUserSub(false, "phaserscene","sceneaddimage", __ref, _x, _y, _key);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("key", _key);
 BA.debugLineNum = 411;BA.debugLine="Sub SceneAddImage(x As Int, y As Int, key As Strin";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 413;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
Debug.ShouldStop(268435456);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("image")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_x),(_y),(_key)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 414;BA.debugLine="Return bo";
Debug.ShouldStop(536870912);
if (true) return _bo;
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneaddparticles(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("SceneAddParticles (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,405);
if (RapidSub.canDelegate("sceneaddparticles")) { return __ref.runUserSub(false, "phaserscene","sceneaddparticles", __ref, _key);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("key", _key);
 BA.debugLineNum = 405;BA.debugLine="Sub SceneAddParticles(key As String) As BANanoObje";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 407;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
Debug.ShouldStop(4194304);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("particles")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_key)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 408;BA.debugLine="Return bo";
Debug.ShouldStop(8388608);
if (true) return _bo;
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneaddsound(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("SceneAddSound (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("sceneaddsound")) { return __ref.runUserSub(false, "phaserscene","sceneaddsound", __ref, _key);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("key", _key);
 BA.debugLineNum = 417;BA.debugLine="Sub SceneAddSound(key As String) As BANanoObject";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
Debug.ShouldStop(2);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("sound")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_key)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 419;BA.debugLine="Return bo";
Debug.ShouldStop(4);
if (true) return _bo;
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneaddsprite(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("SceneAddSprite (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("sceneaddsprite")) { return __ref.runUserSub(false, "phaserscene","sceneaddsprite", __ref, _x, _y, _key);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("key", _key);
 BA.debugLineNum = 394;BA.debugLine="Sub SceneAddSprite(x As Int, y As Int, key As Stri";
Debug.ShouldStop(512);
 BA.debugLineNum = 396;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
Debug.ShouldStop(2048);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("sprite")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_x),(_y),(_key)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 397;BA.debugLine="Return bo";
Debug.ShouldStop(4096);
if (true) return _bo;
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneaddtext(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _text,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("SceneAddText (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,422);
if (RapidSub.canDelegate("sceneaddtext")) { return __ref.runUserSub(false, "phaserscene","sceneaddtext", __ref, _x, _y, _text, _options);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("text", _text);
Debug.locals.put("options", _options);
 BA.debugLineNum = 422;BA.debugLine="Sub SceneAddText(x As Int, y As Int, text As Strin";
Debug.ShouldStop(32);
 BA.debugLineNum = 424;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
Debug.ShouldStop(128);
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("add"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("text")),(Object)((RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_x),(_y),(_text),(_options.getObject())}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 425;BA.debugLine="Return bo";
Debug.ShouldStop(256);
if (true) return _bo;
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneloadimage(RemoteObject __ref,RemoteObject _key,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SceneLoadImage (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,372);
if (RapidSub.canDelegate("sceneloadimage")) { return __ref.runUserSub(false, "phaserscene","sceneloadimage", __ref, _key, _url);}
Debug.locals.put("key", _key);
Debug.locals.put("URL", _url);
 BA.debugLineNum = 372;BA.debugLine="Sub SceneLoadImage(key As String, URL As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 374;BA.debugLine="Scene.GetField(\"load\").RunMethod(\"image\", Array(k";
Debug.ShouldStop(2097152);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("load"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("image")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_key),(_url)}))));
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneloadsound(RemoteObject __ref,RemoteObject _key,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SceneLoadSound (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("sceneloadsound")) { return __ref.runUserSub(false, "phaserscene","sceneloadsound", __ref, _key, _url);}
Debug.locals.put("key", _key);
Debug.locals.put("URL", _url);
 BA.debugLineNum = 377;BA.debugLine="Sub SceneLoadSound(key As String, URL As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="Scene.GetField(\"load\").RunMethod(\"sound\", Array(k";
Debug.ShouldStop(33554432);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("load"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("sound")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_key),(_url)}))));
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sceneloadspritesheet(RemoteObject __ref,RemoteObject _key,RemoteObject _url,RemoteObject _framewidth,RemoteObject _frameheight) throws Exception{
try {
		Debug.PushSubsStack("SceneLoadSpriteSheet (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("sceneloadspritesheet")) { return __ref.runUserSub(false, "phaserscene","sceneloadspritesheet", __ref, _key, _url, _framewidth, _frameheight);}
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("key", _key);
Debug.locals.put("URL", _url);
Debug.locals.put("frameWidth", _framewidth);
Debug.locals.put("frameHeight", _frameheight);
 BA.debugLineNum = 381;BA.debugLine="Sub SceneLoadSpriteSheet(key As String, URL As Str";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 383;BA.debugLine="Dim options As Map = CreateMap()";
Debug.ShouldStop(1073741824);
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_options = phaserscene.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 384;BA.debugLine="options.Put(\"frameWidth\", frameWidth)";
Debug.ShouldStop(-2147483648);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("frameWidth"))),(Object)((_framewidth)));
 BA.debugLineNum = 385;BA.debugLine="options.Put(\"frameHeight\", frameHeight)";
Debug.ShouldStop(1);
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("frameHeight"))),(Object)((_frameheight)));
 BA.debugLineNum = 386;BA.debugLine="Scene.GetField(\"load\").RunMethod(\"spritesheet\", A";
Debug.ShouldStop(2);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("load"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("spritesheet")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_key),(_url),(_options.getObject())}))));
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scenerestart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SceneReStart (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("scenerestart")) { return __ref.runUserSub(false, "phaserscene","scenerestart", __ref);}
 BA.debugLineNum = 390;BA.debugLine="Sub SceneReStart";
Debug.ShouldStop(32);
 BA.debugLineNum = 391;BA.debugLine="Scene.RunMethod(\"restart\", Null)";
Debug.ShouldStop(64);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("restart")),(Object)(phaserscene.__c.getField(false,"Null")));
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbodyvelocityx(RemoteObject __ref,RemoteObject _obj,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("SetBodyVelocityX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("setbodyvelocityx")) { return __ref.runUserSub(false, "phaserscene","setbodyvelocityx", __ref, _obj, _x);}
Debug.locals.put("obj", _obj);
Debug.locals.put("x", _x);
 BA.debugLineNum = 137;BA.debugLine="Sub SetBodyVelocityX(obj As BANanoObject, x As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityX\", Ar";
Debug.ShouldStop(512);
_obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVelocityX")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_x)}))));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbodyvelocityy(RemoteObject __ref,RemoteObject _obj,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetBodyVelocityY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("setbodyvelocityy")) { return __ref.runUserSub(false, "phaserscene","setbodyvelocityy", __ref, _obj, _y);}
Debug.locals.put("obj", _obj);
Debug.locals.put("y", _y);
 BA.debugLineNum = 141;BA.debugLine="Sub SetBodyVelocityY(obj As BANanoObject, y As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityY\", Ar";
Debug.ShouldStop(8192);
_obj.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("body"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVelocityY")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_y)}))));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbounce(RemoteObject __ref,RemoteObject _bo,RemoteObject _bounce) throws Exception{
try {
		Debug.PushSubsStack("SetBounce (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("setbounce")) { return __ref.runUserSub(false, "phaserscene","setbounce", __ref, _bo, _bounce);}
Debug.locals.put("bo", _bo);
Debug.locals.put("bounce", _bounce);
 BA.debugLineNum = 236;BA.debugLine="Sub SetBounce(bo As BANanoObject, bounce As Double";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="bo.RunMethod(\"setBounce\", Array(bounce))";
Debug.ShouldStop(4096);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBounce")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_bounce)}))));
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbouncex(RemoteObject __ref,RemoteObject _bo,RemoteObject _bounce) throws Exception{
try {
		Debug.PushSubsStack("SetBounceX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setbouncex")) { return __ref.runUserSub(false, "phaserscene","setbouncex", __ref, _bo, _bounce);}
Debug.locals.put("bo", _bo);
Debug.locals.put("bounce", _bounce);
 BA.debugLineNum = 244;BA.debugLine="Sub SetBounceX(bo As BANanoObject, bounce As Doubl";
Debug.ShouldStop(524288);
 BA.debugLineNum = 245;BA.debugLine="bo.RunMethod(\"setBounceX\", Array(bounce))";
Debug.ShouldStop(1048576);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBounceX")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_bounce)}))));
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbouncexy(RemoteObject __ref,RemoteObject _obj,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetBounceXY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("setbouncexy")) { return __ref.runUserSub(false, "phaserscene","setbouncexy", __ref, _obj, _x, _y);}
Debug.locals.put("obj", _obj);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 111;BA.debugLine="Sub SetBounceXY(obj As BANanoObject, x As Object,";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="obj.RunMethod(\"setBounce\", Array(x, y))";
Debug.ShouldStop(32768);
_obj.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBounce")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_x,_y}))));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbouncey(RemoteObject __ref,RemoteObject _bo,RemoteObject _bounce) throws Exception{
try {
		Debug.PushSubsStack("SetBounceY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("setbouncey")) { return __ref.runUserSub(false, "phaserscene","setbouncey", __ref, _bo, _bounce);}
Debug.locals.put("bo", _bo);
Debug.locals.put("bounce", _bounce);
 BA.debugLineNum = 240;BA.debugLine="Sub SetBounceY(bo As BANanoObject, bounce As Doubl";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="bo.RunMethod(\"setBounceY\", Array(bounce))";
Debug.ShouldStop(65536);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBounceY")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_bounce)}))));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcollideworldbounds(RemoteObject __ref,RemoteObject _obj,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCollideWorldBounds (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("setcollideworldbounds")) { return __ref.runUserSub(false, "phaserscene","setcollideworldbounds", __ref, _obj, _b);}
Debug.locals.put("obj", _obj);
Debug.locals.put("b", _b);
 BA.debugLineNum = 115;BA.debugLine="Sub SetCollideWorldBounds(obj As BANanoObject, b A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="obj.RunMethod(\"setCollideWorldBounds\", Array(b))";
Debug.ShouldStop(524288);
_obj.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setCollideWorldBounds")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)}))));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimmovable(RemoteObject __ref,RemoteObject _obj,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetImmovable (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setimmovable")) { return __ref.runUserSub(false, "phaserscene","setimmovable", __ref, _obj, _b);}
Debug.locals.put("obj", _obj);
Debug.locals.put("b", _b);
 BA.debugLineNum = 69;BA.debugLine="Sub SetImmovable(obj As BANanoObject, b As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="obj.RunMethod(\"setImmovable\", Array(b))";
Debug.ShouldStop(32);
_obj.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImmovable")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)}))));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoncreate(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnCreate (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("setoncreate")) { return __ref.runUserSub(false, "phaserscene","setoncreate", __ref, _module, _methodname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 446;BA.debugLine="Sub SetOnCreate(module As Object, methodName As St";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 447;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.ShouldStop(1073741824);
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 448;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.ShouldStop(-2147483648);
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), phaserscene.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 449;BA.debugLine="Scene.SetField(\"create\", cb)";
Debug.ShouldStop(1);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("create")),(Object)((_cb.getObject())));
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoninit(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnInit (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("setoninit")) { return __ref.runUserSub(false, "phaserscene","setoninit", __ref, _module, _methodname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 428;BA.debugLine="Sub SetOnInit(module As Object, methodName As Stri";
Debug.ShouldStop(2048);
 BA.debugLineNum = 429;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.ShouldStop(4096);
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 430;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.ShouldStop(8192);
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), phaserscene.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 431;BA.debugLine="Scene.SetField(\"init\", cb)";
Debug.ShouldStop(16384);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("init")),(Object)((_cb.getObject())));
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonpreload(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnPreload (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("setonpreload")) { return __ref.runUserSub(false, "phaserscene","setonpreload", __ref, _module, _methodname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 440;BA.debugLine="Sub SetOnPreload(module As Object, methodName As S";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.ShouldStop(16777216);
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 442;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.ShouldStop(33554432);
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), phaserscene.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 443;BA.debugLine="Scene.SetField(\"preload\", cb)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("preload")),(Object)((_cb.getObject())));
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonshutdown(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnShutDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,434);
if (RapidSub.canDelegate("setonshutdown")) { return __ref.runUserSub(false, "phaserscene","setonshutdown", __ref, _module, _methodname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 434;BA.debugLine="Sub SetOnShutDown(module As Object, methodName As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 435;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.ShouldStop(262144);
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 436;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.ShouldStop(524288);
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), phaserscene.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 437;BA.debugLine="Scene.SetField(\"shutdown\", cb)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("shutdown")),(Object)((_cb.getObject())));
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonupdate(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnUpdate (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("setonupdate")) { return __ref.runUserSub(false, "phaserscene","setonupdate", __ref, _module, _methodname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 452;BA.debugLine="Sub SetOnUpdate(module As Object, methodName As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 453;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.ShouldStop(16);
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 454;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.ShouldStop(32);
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), phaserscene.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 455;BA.debugLine="Scene.SetField(\"update\", cb)";
Debug.ShouldStop(64);
__ref.getField(false,"_scene" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("update")),(Object)((_cb.getObject())));
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setorigin(RemoteObject __ref,RemoteObject _obj,RemoteObject _dbl) throws Exception{
try {
		Debug.PushSubsStack("SetOrigin (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setorigin")) { return __ref.runUserSub(false, "phaserscene","setorigin", __ref, _obj, _dbl);}
Debug.locals.put("obj", _obj);
Debug.locals.put("dbl", _dbl);
 BA.debugLineNum = 65;BA.debugLine="Sub SetOrigin(obj As BANanoObject, dbl As Double)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="obj.RunMethod(\"setOrigin\", Array(dbl))";
Debug.ShouldStop(2);
_obj.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOrigin")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_dbl)}))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setphysicsworldcheckcollisiondown(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPhysicsWorldCheckCollisionDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("setphysicsworldcheckcollisiondown")) { return __ref.runUserSub(false, "phaserscene","setphysicsworldcheckcollisiondown", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 307;BA.debugLine="Sub SetPhysicsWorldCheckCollisionDown(b As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="World.GetField(\"checkCollision\").SetField(\"down\",";
Debug.ShouldStop(524288);
__ref.getField(false,"_world" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("checkCollision"))).runVoidMethod ("SetField",(Object)(BA.ObjectToString("down")),(Object)((_b)));
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscale(RemoteObject __ref,RemoteObject _bo,RemoteObject _vscale) throws Exception{
try {
		Debug.PushSubsStack("SetScale (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("setscale")) { return __ref.runUserSub(false, "phaserscene","setscale", __ref, _bo, _vscale);}
Debug.locals.put("bo", _bo);
Debug.locals.put("vScale", _vscale);
 BA.debugLineNum = 218;BA.debugLine="Sub SetScale(bo As BANanoObject, vScale As Object)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="bo.RunMethod(\"setScale\", Array(vScale))";
Debug.ShouldStop(67108864);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setScale")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_vscale}))));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("SetScaleMode (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setscalemode")) { return __ref.runUserSub(false, "phaserscene","setscalemode", __ref, _scalemode);}
Debug.locals.put("scaleMode", _scalemode);
 BA.debugLineNum = 83;BA.debugLine="Sub SetScaleMode(scaleMode As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Scale.SetField(\"scaleMode\", scaleMode)";
Debug.ShouldStop(524288);
__ref.getField(false,"_scale" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("scaleMode")),(Object)((_scalemode)));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscalepagealignhorizontally(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetScalePageAlignHorizontally (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setscalepagealignhorizontally")) { return __ref.runUserSub(false, "phaserscene","setscalepagealignhorizontally", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 87;BA.debugLine="Sub SetScalePageAlignHorizontally(b As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Scale.SetField(\"pageAlignHorizontally\", b)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_scale" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("pageAlignHorizontally")),(Object)((_b)));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscalepagealignvertically(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetScalepageAlignVertically (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setscalepagealignvertically")) { return __ref.runUserSub(false, "phaserscene","setscalepagealignvertically", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 91;BA.debugLine="Sub SetScalepageAlignVertically(b As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Scale.SetField(\"pageAlignVertically\", b)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_scale" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("pageAlignVertically")),(Object)((_b)));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscalex(RemoteObject __ref,RemoteObject _bo,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("SetScaleX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("setscalex")) { return __ref.runUserSub(false, "phaserscene","setscalex", __ref, _bo, _x);}
Debug.locals.put("bo", _bo);
Debug.locals.put("x", _x);
 BA.debugLineNum = 222;BA.debugLine="Sub SetScaleX(bo As BANanoObject, x As Double)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim Scale As BANanoObject = bo.GetField(\"scale\")";
Debug.ShouldStop(1073741824);
phaserscene._scale = RemoteObject.createNew ("com.ab.banano.BANanoObject");
phaserscene._scale = _bo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scale")));__ref.setField("_scale",phaserscene._scale);
 BA.debugLineNum = 224;BA.debugLine="Scale.SetField(\"x\", x)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_scale" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("x")),(Object)((_x)));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscaley(RemoteObject __ref,RemoteObject _bo,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetScaleY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("setscaley")) { return __ref.runUserSub(false, "phaserscene","setscaley", __ref, _bo, _y);}
Debug.locals.put("bo", _bo);
Debug.locals.put("y", _y);
 BA.debugLineNum = 227;BA.debugLine="Sub SetScaleY(bo As BANanoObject, y As Double)";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Dim Scale As BANanoObject = bo.GetField(\"scale\")";
Debug.ShouldStop(8);
phaserscene._scale = RemoteObject.createNew ("com.ab.banano.BANanoObject");
phaserscene._scale = _bo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scale")));__ref.setField("_scale",phaserscene._scale);
 BA.debugLineNum = 229;BA.debugLine="Scale.SetField(\"y\", y)";
Debug.ShouldStop(16);
__ref.getField(false,"_scale" /*RemoteObject*/ ).runVoidMethod ("SetField",(Object)(BA.ObjectToString("y")),(Object)((_y)));
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _bo,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetText (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "phaserscene","settext", __ref, _bo, _text);}
Debug.locals.put("bo", _bo);
Debug.locals.put("text", _text);
 BA.debugLineNum = 248;BA.debugLine="Sub SetText(bo As BANanoObject, text As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="bo.RunMethod(\"setText\", Array(text))";
Debug.ShouldStop(16777216);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setText")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_text)}))));
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settint(RemoteObject __ref,RemoteObject _bo,RemoteObject _tintcolor) throws Exception{
try {
		Debug.PushSubsStack("SetTint (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("settint")) { return __ref.runUserSub(false, "phaserscene","settint", __ref, _bo, _tintcolor);}
Debug.locals.put("bo", _bo);
Debug.locals.put("tintColor", _tintcolor);
 BA.debugLineNum = 201;BA.debugLine="Sub SetTint(bo As BANanoObject, tintColor As Objec";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="bo.RunMethod(\"setTint\", Array(tintColor))";
Debug.ShouldStop(512);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTint")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_tintcolor}))));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvelocityx(RemoteObject __ref,RemoteObject _bo,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("SetVelocityX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("setvelocityx")) { return __ref.runUserSub(false, "phaserscene","setvelocityx", __ref, _bo, _x);}
Debug.locals.put("bo", _bo);
Debug.locals.put("x", _x);
 BA.debugLineNum = 287;BA.debugLine="Sub SetVelocityX(bo As BANanoObject, x As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="bo.RunMethod(\"setVelocityX\", Array(x))";
Debug.ShouldStop(-2147483648);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVelocityX")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_x)}))));
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvelocityxy(RemoteObject __ref,RemoteObject _obj,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetVelocityXY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setvelocityxy")) { return __ref.runUserSub(false, "phaserscene","setvelocityxy", __ref, _obj, _x, _y);}
Debug.locals.put("obj", _obj);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 99;BA.debugLine="Sub SetVelocityXY(obj As BANanoObject, x As Object";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="obj.RunMethod(\"setVelocity\", Array(x, y))";
Debug.ShouldStop(8);
_obj.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVelocity")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_x,_y}))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvelocityy(RemoteObject __ref,RemoteObject _bo,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetVelocityY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("setvelocityy")) { return __ref.runUserSub(false, "phaserscene","setvelocityy", __ref, _bo, _y);}
Debug.locals.put("bo", _bo);
Debug.locals.put("y", _y);
 BA.debugLineNum = 292;BA.debugLine="Sub SetVelocityY(bo As BANanoObject, y As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="bo.RunMethod(\"setVelocityY\", Array(y))";
Debug.ShouldStop(16);
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVelocityY")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_y)}))));
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _obj,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVisible (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "phaserscene","setvisible", __ref, _obj, _b);}
Debug.locals.put("obj", _obj);
Debug.locals.put("b", _b);
 BA.debugLineNum = 61;BA.debugLine="Sub SetVisible(obj As BANanoObject, b As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="obj.RunMethod(\"setVisible\", Array(b))";
Debug.ShouldStop(536870912);
_obj.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVisible")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_b)}))));
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
public static RemoteObject  _setx(RemoteObject __ref,RemoteObject _bo,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("SetX (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("setx")) { return __ref.runUserSub(false, "phaserscene","setx", __ref, _bo, _x);}
Debug.locals.put("bo", _bo);
Debug.locals.put("x", _x);
 BA.debugLineNum = 183;BA.debugLine="Sub SetX(bo As BANanoObject, x As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="bo.SetField(\"x\", x)";
Debug.ShouldStop(8388608);
_bo.runVoidMethod ("SetField",(Object)(BA.ObjectToString("x")),(Object)((_x)));
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sety(RemoteObject __ref,RemoteObject _bo,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetY (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("sety")) { return __ref.runUserSub(false, "phaserscene","sety", __ref, _bo, _y);}
Debug.locals.put("bo", _bo);
Debug.locals.put("y", _y);
 BA.debugLineNum = 187;BA.debugLine="Sub SetY(bo As BANanoObject, y As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="bo.SetField(\"y\", y)";
Debug.ShouldStop(134217728);
_bo.runVoidMethod ("SetField",(Object)(BA.ObjectToString("y")),(Object)((_y)));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spaceisdown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SpaceIsDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("spaceisdown")) { return __ref.runUserSub(false, "phaserscene","spaceisdown", __ref);}
RemoteObject _bres = RemoteObject.createImmutable(false);
 BA.debugLineNum = 322;BA.debugLine="Sub SpaceIsDown As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"space\").G";
Debug.ShouldStop(4);
_bres = BA.ObjectToBoolean(__ref.getField(false,"_cursors" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("space"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("isDown"))));Debug.locals.put("bres", _bres);Debug.locals.put("bres", _bres);
 BA.debugLineNum = 324;BA.debugLine="Return bres";
Debug.ShouldStop(8);
if (true) return _bres;
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startfollow(RemoteObject __ref,RemoteObject _source,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("StartFollow (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("startfollow")) { return __ref.runUserSub(false, "phaserscene","startfollow", __ref, _source, _target);}
Debug.locals.put("source", _source);
Debug.locals.put("target", _target);
 BA.debugLineNum = 119;BA.debugLine="Sub StartFollow(source As BANanoObject, target As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="source.RunMethod(\"startFollow\", Array(target))";
Debug.ShouldStop(8388608);
_source.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startFollow")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_target.getObject())}))));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _upisdown(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpIsDown (phaserscene) ","phaserscene",4,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("upisdown")) { return __ref.runUserSub(false, "phaserscene","upisdown", __ref);}
RemoteObject _bres = RemoteObject.createImmutable(false);
 BA.debugLineNum = 335;BA.debugLine="Sub UpIsDown As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"up\").GetF";
Debug.ShouldStop(32768);
_bres = BA.ObjectToBoolean(__ref.getField(false,"_cursors" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("up"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("isDown"))));Debug.locals.put("bres", _bres);Debug.locals.put("bres", _bres);
 BA.debugLineNum = 337;BA.debugLine="Return bres";
Debug.ShouldStop(65536);
if (true) return _bres;
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}