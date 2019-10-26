package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class phaserscene extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.phaserscene", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.phaserscene.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANanoObject _physics = null;
public com.ab.banano.BANanoObject _anims = null;
public com.ab.banano.BANanoObject _input = null;
public com.ab.banano.BANanoObject _cursors = null;
public com.ab.banano.BANanoObject _scene = null;
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _scale = null;
public com.ab.banano.BANanoObject _world = null;
public com.ab.banano.BANanoObject _math = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgbreakout _pgbreakout = null;
public String  _disablebody(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,boolean _disablegameobject,boolean _hidegameobject) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "disablebody", false))
	 {return ((String) Debug.delegate(ba, "disablebody", new Object[] {_obj,_disablegameobject,_hidegameobject}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Sub DisableBody(obj As BANanoObject, disableGameOb";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="obj.RunMethod(\"disableBody\", Array(disableGameObj";
_obj.RunMethod("disableBody",(Object)(new Object[]{(Object)(_disablegameobject),(Object)(_hidegameobject)}));
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "settext", false))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_bo,_text}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub SetText(bo As BANanoObject, text As String)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="bo.RunMethod(\"setText\", Array(text))";
_bo.RunMethod("setText",(Object)(new Object[]{(Object)(_text)}));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public int  _countactive(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "countactive", false))
	 {return ((Integer) Debug.delegate(ba, "countactive", new Object[] {_bo,_b}));}
int _active = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub CountActive(bo As BANanoObject, b As Boolean)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim active As Int = bo.RunMethod(\"countActive\", A";
_active = (int)(BA.ObjectToNumber(_bo.RunMethod("countActive",(Object)(new Object[]{(Object)(_b)})).Result()));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Return active";
if (true) return _active;
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return 0;
}
public String  _childreniterate(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _parent,com.ab.banano.BANanoObject _callthisback) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "childreniterate", false))
	 {return ((String) Debug.delegate(ba, "childreniterate", new Object[] {_parent,_callthisback}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub ChildrenIterate(parent As BANanoObject, CallTh";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="parent.GetField(\"children\").RunMethod(\"iterate\",";
_parent.GetField("children").RunMethod("iterate",(Object)(_callthisback.getObject()));
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public int  _getx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getx", false))
	 {return ((Integer) Debug.delegate(ba, "getx", new Object[] {_bo}));}
int _x = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub GetX(bo As BANanoObject) As Int";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim x As Int = bo.GetField(\"x\").Result";
_x = (int)(BA.ObjectToNumber(_bo.GetField("x").Result()));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return 0;
}
public com.ab.banano.BANanoObject  _createinstance(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _parent,int _x,int _y,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "createinstance", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "createinstance", new Object[] {_parent,_x,_y,_key}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub CreateInstance(parent As BANanoObject, x As In";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim bo As BANanoObject = parent.RunMethod(\"create";
_bo = new com.ab.banano.BANanoObject();
_bo = _parent.RunMethod("create",(Object)(new Object[]{(Object)(_x),(Object)(_y),(Object)(_key)}));
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="End Sub";
return null;
}
public String  _setbounce(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,double _bounce) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setbounce", false))
	 {return ((String) Debug.delegate(ba, "setbounce", new Object[] {_bo,_bounce}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub SetBounce(bo As BANanoObject, bounce As Double";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="bo.RunMethod(\"setBounce\", Array(bounce))";
_bo.RunMethod("setBounce",(Object)(new Object[]{(Object)(_bounce)}));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public String  _setcollideworldbounds(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setcollideworldbounds", false))
	 {return ((String) Debug.delegate(ba, "setcollideworldbounds", new Object[] {_obj,_b}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub SetCollideWorldBounds(obj As BANanoObject, b A";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="obj.RunMethod(\"setCollideWorldBounds\", Array(b))";
_obj.RunMethod("setCollideWorldBounds",(Object)(new Object[]{(Object)(_b)}));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public String  _setvelocityxy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,Object _x,Object _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setvelocityxy", false))
	 {return ((String) Debug.delegate(ba, "setvelocityxy", new Object[] {_obj,_x,_y}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub SetVelocityXY(obj As BANanoObject, x As Object";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="obj.RunMethod(\"setVelocity\", Array(x, y))";
_obj.RunMethod("setVelocity",(Object)(new Object[]{_x,_y}));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="End Sub";
return "";
}
public String  _allowgravity(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "allowgravity", false))
	 {return ((String) Debug.delegate(ba, "allowgravity", new Object[] {_bo,_b}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub AllowGravity(bo As BANanoObject, b As Boolean)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="bo.SetField(\"allowGravity\", Array(b))";
_bo.SetField("allowGravity",(Object)(new Object[]{(Object)(_b)}));
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _physicspause(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicspause", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "physicspause", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub PhysicsPause() As BANanoObject";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Physics.RunMethod(\"pause\", Null)";
__ref._physics /*com.ab.banano.BANanoObject*/ .RunMethod("pause",__c.Null);
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return null;
}
public String  _setx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setx", false))
	 {return ((String) Debug.delegate(ba, "setx", new Object[] {_bo,_x}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub SetX(bo As BANanoObject, x As Int)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="bo.SetField(\"x\", x)";
_bo.SetField("x",(Object)(_x));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _physicsresume(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsresume", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "physicsresume", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub PhysicsResume() As BANanoObject";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Physics.RunMethod(\"resume\", Null)";
__ref._physics /*com.ab.banano.BANanoObject*/ .RunMethod("resume",__c.Null);
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return null;
}
public String  _settint(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,Object _tintcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "settint", false))
	 {return ((String) Debug.delegate(ba, "settint", new Object[] {_bo,_tintcolor}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub SetTint(bo As BANanoObject, tintColor As Objec";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="bo.RunMethod(\"setTint\", Array(tintColor))";
_bo.RunMethod("setTint",(Object)(new Object[]{_tintcolor}));
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public String  _playanime(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,String _anime,Object _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "playanime", false))
	 {return ((String) Debug.delegate(ba, "playanime", new Object[] {_bo,_anime,_b}));}
com.ab.banano.BANanoObject _animsx = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub PlayAnime(bo As BANanoObject, anime As String,";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim animsx As BANanoObject = bo.GetField(\"anims\")";
_animsx = new com.ab.banano.BANanoObject();
_animsx = _bo.GetField("anims");
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="If b = Null Then";
if (_b== null) { 
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="animsx.RunMethod(\"play\", Array(anime))";
_animsx.RunMethod("play",(Object)(new Object[]{(Object)(_anime)}));
 }else {
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="animsx.RunMethod(\"play\", Array(anime, b))";
_animsx.RunMethod("play",(Object)(new Object[]{(Object)(_anime),_b}));
 };
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="End Sub";
return "";
}
public String  _setonpreload(b4j.example.phaserscene __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setonpreload", false))
	 {return ((String) Debug.delegate(ba, "setonpreload", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub SetOnPreload(module As Object, methodName As S";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Scene.SetField(\"preload\", cb)";
__ref._scene /*com.ab.banano.BANanoObject*/ .SetField("preload",(Object)(_cb.getObject()));
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="End Sub";
return "";
}
public String  _setoncreate(b4j.example.phaserscene __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setoncreate", false))
	 {return ((String) Debug.delegate(ba, "setoncreate", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub SetOnCreate(module As Object, methodName As St";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Scene.SetField(\"create\", cb)";
__ref._scene /*com.ab.banano.BANanoObject*/ .SetField("create",(Object)(_cb.getObject()));
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="End Sub";
return "";
}
public String  _setonupdate(b4j.example.phaserscene __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setonupdate", false))
	 {return ((String) Debug.delegate(ba, "setonupdate", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub SetOnUpdate(module As Object, methodName As St";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Scene.SetField(\"update\", cb)";
__ref._scene /*com.ab.banano.BANanoObject*/ .SetField("update",(Object)(_cb.getObject()));
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="End Sub";
return "";
}
public String  _setonshutdown(b4j.example.phaserscene __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setonshutdown", false))
	 {return ((String) Debug.delegate(ba, "setonshutdown", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub SetOnShutDown(module As Object, methodName As";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Scene.SetField(\"shutdown\", cb)";
__ref._scene /*com.ab.banano.BANanoObject*/ .SetField("shutdown",(Object)(_cb.getObject()));
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return "";
}
public String  _setbouncey(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,double _bounce) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setbouncey", false))
	 {return ((String) Debug.delegate(ba, "setbouncey", new Object[] {_bo,_bounce}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub SetBounceY(bo As BANanoObject, bounce As Doubl";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="bo.RunMethod(\"setBounceY\", Array(bounce))";
_bo.RunMethod("setBounceY",(Object)(new Object[]{(Object)(_bounce)}));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return "";
}
public String  _enablebody(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,boolean _b1,int _x,int _y,boolean _b2,boolean _b3) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "enablebody", false))
	 {return ((String) Debug.delegate(ba, "enablebody", new Object[] {_bo,_b1,_x,_y,_b2,_b3}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub EnableBody(bo As BANanoObject, b1 As Boolean,";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="bo.RunMethod(\"enableBody\", Array(b1, x, y, b2, b3";
_bo.RunMethod("enableBody",(Object)(new Object[]{(Object)(_b1),(Object)(_x),(Object)(_y),(Object)(_b2),(Object)(_b3)}));
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _sceneaddimage(b4j.example.phaserscene __ref,int _x,int _y,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneaddimage", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "sceneaddimage", new Object[] {_x,_y,_key}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub SceneAddImage(x As Int, y As Int, key As Strin";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("image",(Object)(new Object[]{(Object)(_x),(Object)(_y),(Object)(_key)}));
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _physicsaddstaticgroup(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddstaticgroup", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "physicsaddstaticgroup", null));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub PhysicsAddStaticGroup As BANanoObject";
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("staticGroup",__c.Null);
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="End Sub";
return null;
}
public String  _setscale(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,Object _vscale) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setscale", false))
	 {return ((String) Debug.delegate(ba, "setscale", new Object[] {_bo,_vscale}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub SetScale(bo As BANanoObject, vScale As Object)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="bo.RunMethod(\"setScale\", Array(vScale))";
_bo.RunMethod("setScale",(Object)(new Object[]{_vscale}));
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public String  _refreshbody(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "refreshbody", false))
	 {return ((String) Debug.delegate(ba, "refreshbody", new Object[] {_bo}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub RefreshBody(bo As BANanoObject)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="bo.RunMethod(\"refreshBody\", Null)";
_bo.RunMethod("refreshBody",__c.Null);
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _physicsaddsprite(b4j.example.phaserscene __ref,int _x,int _y,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddsprite", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "physicsaddsprite", new Object[] {_x,_y,_key}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub PhysicsAddSprite(x As Int, y As Int, key As St";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("sprite",(Object)(new Object[]{(Object)(_x),(Object)(_y),(Object)(_key)}));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return null;
}
public String  _createanime(b4j.example.phaserscene __ref,String _key,String _spritename,int _framerate,int _startframe,int _endframe,Object _irepeat) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "createanime", false))
	 {return ((String) Debug.delegate(ba, "createanime", new Object[] {_key,_spritename,_framerate,_startframe,_endframe,_irepeat}));}
anywheresoftware.b4a.objects.collections.Map _anime = null;
anywheresoftware.b4a.objects.collections.Map _options = null;
anywheresoftware.b4a.objects.collections.List _lframes = null;
com.ab.banano.BANanoObject _bframes = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub CreateAnime(key As String, spriteName As Strin";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim anime As Map = CreateMap()";
_anime = new anywheresoftware.b4a.objects.collections.Map();
_anime = __c.createMap(new Object[] {});
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="anime.Put(\"key\", key)";
_anime.Put((Object)("key"),(Object)(_key));
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="anime.Put(\"frameRate\", frameRate)";
_anime.Put((Object)("frameRate"),(Object)(_framerate));
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="If irepeat <> Null Then";
if (_irepeat!= null) { 
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="anime.Put(\"repeat\", irepeat)";
_anime.Put((Object)("repeat"),_irepeat);
 };
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="If startFrame = endFrame Then";
if (_startframe==_endframe) { 
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="Dim options As Map = CreateMap()";
_options = new anywheresoftware.b4a.objects.collections.Map();
_options = __c.createMap(new Object[] {});
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="options.Put(\"key\", spriteName)";
_options.Put((Object)("key"),(Object)(_spritename));
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="options.Put(\"frame\", startFrame)";
_options.Put((Object)("frame"),(Object)(_startframe));
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="Dim lframes As List";
_lframes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="lframes.Initialize2(Array(options))";
_lframes.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_options.getObject())}));
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="anime.Put(\"frames\", lframes)";
_anime.Put((Object)("frames"),(Object)(_lframes.getObject()));
 }else {
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Dim bframes As BANanoObject = GenerateFrameNumbe";
_bframes = new com.ab.banano.BANanoObject();
_bframes = __ref._generateframenumbers /*com.ab.banano.BANanoObject*/ (null,_spritename,_startframe,_endframe);
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="anime.Put(\"frames\", bframes)";
_anime.Put((Object)("frames"),(Object)(_bframes.getObject()));
 };
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="Anims.RunMethod(\"create\", anime)";
__ref._anims /*com.ab.banano.BANanoObject*/ .RunMethod("create",(Object)(_anime.getObject()));
RDebugUtils.currentLine=5373972;
 //BA.debugLineNum = 5373972;BA.debugLine="End Sub";
return "";
}
public String  _createcursorkeys(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "createcursorkeys", false))
	 {return ((String) Debug.delegate(ba, "createcursorkeys", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub CreateCursorKeys";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Cursors = Input.GetField(\"keyboard\").RunMethod(\"c";
__ref._cursors /*com.ab.banano.BANanoObject*/  = __ref._input /*com.ab.banano.BANanoObject*/ .GetField("keyboard").RunMethod("createCursorKeys",__c.Null);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _physicsaddgroup(b4j.example.phaserscene __ref,String _key,String _irepeat,int _x,int _y,int _stepx,boolean _immovable) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddgroup", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "physicsaddgroup", new Object[] {_key,_irepeat,_x,_y,_stepx,_immovable}));}
anywheresoftware.b4a.objects.collections.Map _setxy = null;
anywheresoftware.b4a.objects.collections.Map _options = null;
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub PhysicsAddGroup(key As String, irepeat As Stri";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim setxy As Map = CreateMap()";
_setxy = new anywheresoftware.b4a.objects.collections.Map();
_setxy = __c.createMap(new Object[] {});
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="setxy.Put(\"x\", x)";
_setxy.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="setxy.Put(\"y\", y)";
_setxy.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="setxy.Put(\"stepX\", stepX)";
_setxy.Put((Object)("stepX"),(Object)(_stepx));
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Dim options As Map = CreateMap()";
_options = new anywheresoftware.b4a.objects.collections.Map();
_options = __c.createMap(new Object[] {});
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="options.Put(\"key\", key)";
_options.Put((Object)("key"),(Object)(_key));
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="options.Put(\"repeat\", irepeat)";
_options.Put((Object)("repeat"),(Object)(_irepeat));
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="options.Put(\"immovable\", immovable)";
_options.Put((Object)("immovable"),(Object)(_immovable));
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="options.Put(\"setXY\", setxy)";
_options.Put((Object)("setXY"),(Object)(_setxy.getObject()));
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("group",(Object)(_options.getObject()));
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _physicsaddgroup1(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddgroup1", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "physicsaddgroup1", null));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub PhysicsAddGroup1() As BANanoObject";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim bo As BANanoObject = Physics.GetField(\"add\").";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("group",__c.Null);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _sceneaddtext(b4j.example.phaserscene __ref,int _x,int _y,String _text,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneaddtext", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "sceneaddtext", new Object[] {_x,_y,_text,_options}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub SceneAddText(x As Int, y As Int, text As Strin";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("text",(Object)(new Object[]{(Object)(_x),(Object)(_y),(Object)(_text),(Object)(_options.getObject())}));
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="End Sub";
return null;
}
public String  _physicsaddcollider(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj1,com.ab.banano.BANanoObject _obj2) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddcollider", false))
	 {return ((String) Debug.delegate(ba, "physicsaddcollider", new Object[] {_obj1,_obj2}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub PhysicsAddCollider(obj1 As BANanoObject, obj2";
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Physics.GetField(\"add\").RunMethod(\"collider\", Arr";
__ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("collider",(Object)(new Object[]{(Object)(_obj1.getObject()),(Object)(_obj2.getObject())}));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="End Sub";
return "";
}
public String  _physicsaddoverlap(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj1,com.ab.banano.BANanoObject _obj2,com.ab.banano.BANanoObject _obj3,com.ab.banano.BANanoObject _obj4,com.ab.banano.BANanoObject _obj5) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddoverlap", false))
	 {return ((String) Debug.delegate(ba, "physicsaddoverlap", new Object[] {_obj1,_obj2,_obj3,_obj4,_obj5}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub PhysicsAddOverlap(obj1 As BANanoObject, obj2 A";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Physics.GetField(\"add\").RunMethod(\"overlap\", Arra";
__ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("overlap",(Object)(new Object[]{(Object)(_obj1.getObject()),(Object)(_obj2.getObject()),(Object)(_obj3.getObject()),(Object)(_obj4.getObject()),(Object)(_obj5.getObject())}));
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return "";
}
public String  _setscalemode(b4j.example.phaserscene __ref,int _scalemode) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setscalemode", false))
	 {return ((String) Debug.delegate(ba, "setscalemode", new Object[] {_scalemode}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub SetScaleMode(scaleMode As Int)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Scale.SetField(\"scaleMode\", scaleMode)";
__ref._scale /*com.ab.banano.BANanoObject*/ .SetField("scaleMode",(Object)(_scalemode));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public String  _setscalepagealignhorizontally(b4j.example.phaserscene __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setscalepagealignhorizontally", false))
	 {return ((String) Debug.delegate(ba, "setscalepagealignhorizontally", new Object[] {_b}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub SetScalePageAlignHorizontally(b As Boolean)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Scale.SetField(\"pageAlignHorizontally\", b)";
__ref._scale /*com.ab.banano.BANanoObject*/ .SetField("pageAlignHorizontally",(Object)(_b));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _setscalepagealignvertically(b4j.example.phaserscene __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setscalepagealignvertically", false))
	 {return ((String) Debug.delegate(ba, "setscalepagealignvertically", new Object[] {_b}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub SetScalepageAlignVertically(b As Boolean)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Scale.SetField(\"pageAlignVertically\", b)";
__ref._scale /*com.ab.banano.BANanoObject*/ .SetField("pageAlignVertically",(Object)(_b));
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public String  _sceneloadimage(b4j.example.phaserscene __ref,String _key,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneloadimage", false))
	 {return ((String) Debug.delegate(ba, "sceneloadimage", new Object[] {_key,_url}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub SceneLoadImage(key As String, URL As String)";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Scene.GetField(\"load\").RunMethod(\"image\", Array(k";
__ref._scene /*com.ab.banano.BANanoObject*/ .GetField("load").RunMethod("image",(Object)(new Object[]{(Object)(_key),(Object)(_url)}));
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="End Sub";
return "";
}
public String  _sceneloadspritesheet(b4j.example.phaserscene __ref,String _key,String _url,int _framewidth,int _frameheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneloadspritesheet", false))
	 {return ((String) Debug.delegate(ba, "sceneloadspritesheet", new Object[] {_key,_url,_framewidth,_frameheight}));}
anywheresoftware.b4a.objects.collections.Map _options = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub SceneLoadSpriteSheet(key As String, URL As Str";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim options As Map = CreateMap()";
_options = new anywheresoftware.b4a.objects.collections.Map();
_options = __c.createMap(new Object[] {});
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="options.Put(\"frameWidth\", frameWidth)";
_options.Put((Object)("frameWidth"),(Object)(_framewidth));
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="options.Put(\"frameHeight\", frameHeight)";
_options.Put((Object)("frameHeight"),(Object)(_frameheight));
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Scene.GetField(\"load\").RunMethod(\"spritesheet\", A";
__ref._scene /*com.ab.banano.BANanoObject*/ .GetField("load").RunMethod("spritesheet",(Object)(new Object[]{(Object)(_key),(Object)(_url),(Object)(_options.getObject())}));
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="End Sub";
return "";
}
public boolean  _leftisdown(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "leftisdown", false))
	 {return ((Boolean) Debug.delegate(ba, "leftisdown", null));}
boolean _bres = false;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub LeftIsDown As Boolean";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"left\").Ge";
_bres = BA.ObjectToBoolean(__ref._cursors /*com.ab.banano.BANanoObject*/ .GetField("left").GetField("isDown"));
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Return bres";
if (true) return _bres;
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="End Sub";
return false;
}
public String  _setvelocityx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setvelocityx", false))
	 {return ((String) Debug.delegate(ba, "setvelocityx", new Object[] {_bo,_x}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub SetVelocityX(bo As BANanoObject, x As Int)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="bo.RunMethod(\"setVelocityX\", Array(x))";
_bo.RunMethod("setVelocityX",(Object)(new Object[]{(Object)(_x)}));
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return "";
}
public boolean  _rightisdown(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "rightisdown", false))
	 {return ((Boolean) Debug.delegate(ba, "rightisdown", null));}
boolean _bres = false;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub RightIsDown As Boolean";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"right\").G";
_bres = BA.ObjectToBoolean(__ref._cursors /*com.ab.banano.BANanoObject*/ .GetField("right").GetField("isDown"));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Return bres";
if (true) return _bres;
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="End Sub";
return false;
}
public boolean  _upisdown(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "upisdown", false))
	 {return ((Boolean) Debug.delegate(ba, "upisdown", null));}
boolean _bres = false;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub UpIsDown As Boolean";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"up\").GetF";
_bres = BA.ObjectToBoolean(__ref._cursors /*com.ab.banano.BANanoObject*/ .GetField("up").GetField("isDown"));
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Return bres";
if (true) return _bres;
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return false;
}
public boolean  _isbodytouchingdown(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _player) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "isbodytouchingdown", false))
	 {return ((Boolean) Debug.delegate(ba, "isbodytouchingdown", new Object[] {_player}));}
com.ab.banano.BANanoObject _body = null;
boolean _td = false;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub IsBodyTouchingDown(player As BANanoObject) As";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim Body As BANanoObject = GetBody(player)";
_body = new com.ab.banano.BANanoObject();
_body = __ref._getbody /*com.ab.banano.BANanoObject*/ (null,_player);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim td As Boolean = Body.GetField(\"touching\").Get";
_td = BA.ObjectToBoolean(_body.GetField("touching").GetField("down").Result());
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Return td";
if (true) return _td;
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="End Sub";
return false;
}
public String  _setvelocityy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setvelocityy", false))
	 {return ((String) Debug.delegate(ba, "setvelocityy", new Object[] {_bo,_y}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub SetVelocityY(bo As BANanoObject, y As Int)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="bo.RunMethod(\"setVelocityY\", Array(y))";
_bo.RunMethod("setVelocityY",(Object)(new Object[]{(Object)(_y)}));
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public int  _getbodyvelocityx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getbodyvelocityx", false))
	 {return ((Integer) Debug.delegate(ba, "getbodyvelocityx", new Object[] {_obj}));}
int _x = 0;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub GetBodyVelocityX(obj As BANanoObject) As Int";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim x As Int = obj.GetField(\"body\").GetField(\"vel";
_x = (int)(BA.ObjectToNumber(_obj.GetField("body").GetField("velocity").GetField("x").Result()));
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="End Sub";
return 0;
}
public double  _random(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "random", false))
	 {return ((Double) Debug.delegate(ba, "random", null));}
double _r = 0;
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Sub random() As Double";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Dim r As Double = Math.RunMethod(\"random\", Null)";
_r = (double)(BA.ObjectToNumber(__ref._math /*com.ab.banano.BANanoObject*/ .RunMethod("random",__c.Null)));
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="End Sub";
return 0;
}
public String  _setbodyvelocityx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,int _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setbodyvelocityx", false))
	 {return ((String) Debug.delegate(ba, "setbodyvelocityx", new Object[] {_obj,_x}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub SetBodyVelocityX(obj As BANanoObject, x As Int";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityX\", Ar";
_obj.GetField("body").RunMethod("setVelocityX",(Object)(new Object[]{(Object)(_x)}));
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="End Sub";
return "";
}
public int  _getbodyvelocityy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getbodyvelocityy", false))
	 {return ((Integer) Debug.delegate(ba, "getbodyvelocityy", new Object[] {_obj}));}
int _y = 0;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub GetBodyVelocityY(obj As BANanoObject) As Int";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim y As Int = obj.GetField(\"body\").GetField(\"vel";
_y = (int)(BA.ObjectToNumber(_obj.GetField("body").GetField("velocity").GetField("y").Result()));
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Return y";
if (true) return _y;
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="End Sub";
return 0;
}
public String  _absolute(b4j.example.phaserscene __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "absolute", false))
	 {return ((String) Debug.delegate(ba, "absolute", new Object[] {_v}));}
int _a = 0;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Sub absolute(v As Int)";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim a As Int = Math.RunMethod(\"abs\", Array(v))";
_a = (int)(BA.ObjectToNumber(__ref._math /*com.ab.banano.BANanoObject*/ .RunMethod("abs",(Object)(new Object[]{(Object)(_v)}))));
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Return a";
if (true) return BA.NumberToString(_a);
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="End Sub";
return "";
}
public int  _getphysicsworldboundsheight(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getphysicsworldboundsheight", false))
	 {return ((Integer) Debug.delegate(ba, "getphysicsworldboundsheight", null));}
int _dbl = 0;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Sub getPhysicsWorldBoundsHeight As Int";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim dbl As Int = World.GetField(\"bounds\").GetFiel";
_dbl = (int)(BA.ObjectToNumber(__ref._world /*com.ab.banano.BANanoObject*/ .GetField("bounds").GetField("height").Result()));
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="Return dbl";
if (true) return _dbl;
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="End Sub";
return 0;
}
public int  _getbodyy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getbodyy", false))
	 {return ((Integer) Debug.delegate(ba, "getbodyy", new Object[] {_obj}));}
int _y = 0;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub GetBodyY(obj As BANanoObject) As Int";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim y As Int = obj.GetField(\"body\").GetField(\"y\")";
_y = (int)(BA.ObjectToNumber(_obj.GetField("body").GetField("y").Result()));
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Return y";
if (true) return _y;
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="End Sub";
return 0;
}
public String  _setbouncexy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,Object _x,Object _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setbouncexy", false))
	 {return ((String) Debug.delegate(ba, "setbouncexy", new Object[] {_obj,_x,_y}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub SetBounceXY(obj As BANanoObject, x As Object,";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="obj.RunMethod(\"setBounce\", Array(x, y))";
_obj.RunMethod("setBounce",(Object)(new Object[]{_x,_y}));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="End Sub";
return "";
}
public String  _setphysicsworldcheckcollisiondown(b4j.example.phaserscene __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setphysicsworldcheckcollisiondown", false))
	 {return ((String) Debug.delegate(ba, "setphysicsworldcheckcollisiondown", new Object[] {_b}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub SetPhysicsWorldCheckCollisionDown(b As Boolean";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="World.GetField(\"checkCollision\").SetField(\"down\",";
__ref._world /*com.ab.banano.BANanoObject*/ .GetField("checkCollision").SetField("down",(Object)(_b));
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return "";
}
public String  _physicsaddcollider5(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj1,com.ab.banano.BANanoObject _obj2,com.ab.banano.BANanoObject _obj3,com.ab.banano.BANanoObject _obj4,com.ab.banano.BANanoObject _obj5) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddcollider5", false))
	 {return ((String) Debug.delegate(ba, "physicsaddcollider5", new Object[] {_obj1,_obj2,_obj3,_obj4,_obj5}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub PhysicsAddCollider5(obj1 As BANanoObject, obj2";
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Physics.GetField(\"add\").RunMethod(\"collider\", Arr";
__ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("collider",(Object)(new Object[]{(Object)(_obj1.getObject()),(Object)(_obj2.getObject()),(Object)(_obj3.getObject()),(Object)(_obj4.getObject()),(Object)(_obj5.getObject())}));
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="End Sub";
return "";
}
public String  _setimmovable(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setimmovable", false))
	 {return ((String) Debug.delegate(ba, "setimmovable", new Object[] {_obj,_b}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub SetImmovable(obj As BANanoObject, b As Boolean";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="obj.RunMethod(\"setImmovable\", Array(b))";
_obj.RunMethod("setImmovable",(Object)(new Object[]{(Object)(_b)}));
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
return "";
}
public int  _getphysicsworldboundswidth(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getphysicsworldboundswidth", false))
	 {return ((Integer) Debug.delegate(ba, "getphysicsworldboundswidth", null));}
int _dbl = 0;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub getPhysicsWorldBoundsWidth As Int";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim dbl As Int = World.GetField(\"bounds\").GetFiel";
_dbl = (int)(BA.ObjectToNumber(__ref._world /*com.ab.banano.BANanoObject*/ .GetField("bounds").GetField("width").Result()));
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Return dbl";
if (true) return _dbl;
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="End Sub";
return 0;
}
public String  _setorigin(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,double _dbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setorigin", false))
	 {return ((String) Debug.delegate(ba, "setorigin", new Object[] {_obj,_dbl}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Sub SetOrigin(obj As BANanoObject, dbl As Double)";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="obj.RunMethod(\"setOrigin\", Array(dbl))";
_obj.RunMethod("setOrigin",(Object)(new Object[]{(Object)(_dbl)}));
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_obj,_b}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Sub SetVisible(obj As BANanoObject, b As Boolean)";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="obj.RunMethod(\"setVisible\", Array(b))";
_obj.RunMethod("setVisible",(Object)(new Object[]{(Object)(_b)}));
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return "";
}
public String  _bodysetvelocityx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,Object _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "bodysetvelocityx", false))
	 {return ((String) Debug.delegate(ba, "bodysetvelocityx", new Object[] {_obj,_x}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Sub BodySetVelocityX(obj As BANanoObject, x As Obj";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityX\", Ar";
_obj.GetField("body").RunMethod("setVelocityX",(Object)(new Object[]{_x}));
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="End Sub";
return "";
}
public boolean  _spaceisdown(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "spaceisdown", false))
	 {return ((Boolean) Debug.delegate(ba, "spaceisdown", null));}
boolean _bres = false;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Sub SpaceIsDown As Boolean";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"space\").G";
_bres = BA.ObjectToBoolean(__ref._cursors /*com.ab.banano.BANanoObject*/ .GetField("space").GetField("isDown"));
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Return bres";
if (true) return _bres;
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.phaserscene __ref,anywheresoftware.b4a.BA _ba,String _scenename) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_scenename}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Initialize(sceneName As String)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Math.Initialize(\"Math\")";
__ref._math /*com.ab.banano.BANanoObject*/ .Initialize((Object)("Math"));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Scene.Initialize2(\"Phaser.Scene\", Array(sceneName";
__ref._scene /*com.ab.banano.BANanoObject*/ .Initialize2("Phaser.Scene",(Object)(new Object[]{(Object)(_scenename)}));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="SetOnInit(Me, \"getScene\")";
__ref._setoninit /*String*/ (null,this,"getScene");
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="End Sub";
return "";
}
public String  _anchorset(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,double _x,double _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "anchorset", false))
	 {return ((String) Debug.delegate(ba, "anchorset", new Object[] {_bo,_x,_y}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub AnchorSet(bo As BANanoObject, x As Double, y A";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="bo.GetField(\"anchor\").RunMethod(\"set\", Array(x, y";
_bo.GetField("anchor").RunMethod("set",(Object)(new Object[]{(Object)(_x),(Object)(_y)}));
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="End Sub";
return "";
}
public String  _bodysetvelocityy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,Object _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "bodysetvelocityy", false))
	 {return ((String) Debug.delegate(ba, "bodysetvelocityy", new Object[] {_obj,_y}));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub BodySetVelocityY(obj As BANanoObject, y As Obj";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityY\", Ar";
_obj.GetField("body").RunMethod("setVelocityY",(Object)(new Object[]{_y}));
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Public Physics As BANanoObject";
_physics = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Private Anims As BANanoObject";
_anims = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Private Input As BANanoObject";
_input = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Private Cursors As BANanoObject";
_cursors = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Public Scene As BANanoObject";
_scene = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Private Scale As BANanoObject";
_scale = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="Private World As BANanoObject";
_world = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Private Math As BANanoObject";
_math = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="End Sub";
return "";
}
public String  _cleartint(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "cleartint", false))
	 {return ((String) Debug.delegate(ba, "cleartint", new Object[] {_bo}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub ClearTint(bo As BANanoObject)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="bo.RunMethod(\"clearTint\", Null)";
_bo.RunMethod("clearTint",__c.Null);
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _generateframenumbers(b4j.example.phaserscene __ref,String _spritename,int _startframe,int _endframe) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "generateframenumbers", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "generateframenumbers", new Object[] {_spritename,_startframe,_endframe}));}
anywheresoftware.b4a.objects.collections.Map _options = null;
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="private Sub GenerateFrameNumbers(spriteName As Str";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim options As Map = CreateMap()";
_options = new anywheresoftware.b4a.objects.collections.Map();
_options = __c.createMap(new Object[] {});
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="options.Put(\"start\", startFrame)";
_options.Put((Object)("start"),(Object)(_startframe));
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="options.Put(\"end\", endFrame)";
_options.Put((Object)("end"),(Object)(_endframe));
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Dim bo As BANanoObject = Anims.RunMethod(\"generat";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._anims /*com.ab.banano.BANanoObject*/ .RunMethod("generateFrameNumbers",(Object)(new Object[]{(Object)(_spritename),(Object)(_options.getObject())}));
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _createemitter(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _particles,int _speed,int _scalestart,int _scaleend,String _blendmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "createemitter", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "createemitter", new Object[] {_particles,_speed,_scalestart,_scaleend,_blendmode}));}
anywheresoftware.b4a.objects.collections.Map _vscale = null;
anywheresoftware.b4a.objects.collections.Map _options = null;
com.ab.banano.BANanoObject _emitter = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub CreateEmitter(particles As BANanoObject, speed";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim vscale As Map = CreateMap(\"start\":scaleStart,";
_vscale = new anywheresoftware.b4a.objects.collections.Map();
_vscale = __c.createMap(new Object[] {(Object)("start"),(Object)(_scalestart),(Object)("end"),(Object)(_scaleend)});
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim options As Map = CreateMap()";
_options = new anywheresoftware.b4a.objects.collections.Map();
_options = __c.createMap(new Object[] {});
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="options.Put(\"speed\", speed)";
_options.Put((Object)("speed"),(Object)(_speed));
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="options.Put(\"scale\", vscale)";
_options.Put((Object)("scale"),(Object)(_vscale.getObject()));
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="options.Put(\"blendMode\", blendMode)";
_options.Put((Object)("blendMode"),(Object)(_blendmode));
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Dim emitter As BANanoObject = particles.RunMethod";
_emitter = new com.ab.banano.BANanoObject();
_emitter = _particles.RunMethod("createEmitter",(Object)(_options.getObject()));
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Return emitter";
if (true) return _emitter;
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="End Sub";
return null;
}
public String  _cstr(b4j.example.phaserscene __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "cstr", false))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_obj}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Cstr(obj As Object) As String";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Return \"\" & obj";
if (true) return ""+BA.ObjectToString(_obj);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _decrementx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "decrementx", false))
	 {return ((String) Debug.delegate(ba, "decrementx", new Object[] {_bo,_x}));}
int _oldx = 0;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub DecrementX(bo As BANanoObject, x As Int)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim oldx As Int = GetX(bo)";
_oldx = __ref._getx /*int*/ (null,_bo);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="oldx = oldx - x";
_oldx = (int) (_oldx-_x);
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="SetX(bo, oldx)";
__ref._setx /*String*/ (null,_bo,_oldx);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="End Sub";
return "";
}
public String  _decrementy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "decrementy", false))
	 {return ((String) Debug.delegate(ba, "decrementy", new Object[] {_bo,_y}));}
int _oldy = 0;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub DecrementY(bo As BANanoObject, y As Int)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim oldy As Int = GetY(bo)";
_oldy = __ref._gety /*int*/ (null,_bo);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="oldy = oldy - y";
_oldy = (int) (_oldy-_y);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="SetY(bo, oldy)";
__ref._sety /*String*/ (null,_bo,_oldy);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return "";
}
public int  _gety(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "gety", false))
	 {return ((Integer) Debug.delegate(ba, "gety", new Object[] {_bo}));}
int _y = 0;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub GetY(bo As BANanoObject) As Int";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim y As Int = bo.GetField(\"y\").Result";
_y = (int)(BA.ObjectToNumber(_bo.GetField("y").Result()));
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Return y";
if (true) return _y;
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="End Sub";
return 0;
}
public String  _sety(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sety", false))
	 {return ((String) Debug.delegate(ba, "sety", new Object[] {_bo,_y}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub SetY(bo As BANanoObject, y As Int)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="bo.SetField(\"y\", y)";
_bo.SetField("y",(Object)(_y));
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public boolean  _downisdown(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "downisdown", false))
	 {return ((Boolean) Debug.delegate(ba, "downisdown", null));}
boolean _bres = false;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub DownIsDown As Boolean";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim bres As Boolean = Cursors.GetField(\"down\").Ge";
_bres = BA.ObjectToBoolean(__ref._cursors /*com.ab.banano.BANanoObject*/ .GetField("down").GetField("isDown"));
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Return bres";
if (true) return _bres;
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="End Sub";
return false;
}
public com.ab.banano.BANanoObject  _getbody(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _player) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getbody", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getbody", new Object[] {_player}));}
com.ab.banano.BANanoObject _body = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub GetBody(player As BANanoObject) As BANanoObjec";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim Body As BANanoObject = player.GetField(\"body\"";
_body = new com.ab.banano.BANanoObject();
_body = _player.GetField("body");
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Return Body";
if (true) return _body;
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return null;
}
public int  _getbodyx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getbodyx", false))
	 {return ((Integer) Debug.delegate(ba, "getbodyx", new Object[] {_obj}));}
int _x = 0;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub GetBodyX(obj As BANanoObject) As Int";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Dim x As Int = obj.GetField(\"body\").GetField(\"x\")";
_x = (int)(BA.ObjectToNumber(_obj.GetField("body").GetField("x").Result()));
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="End Sub";
return 0;
}
public String  _getscene(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getscene", false))
	 {return ((String) Debug.delegate(ba, "getscene", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="private Sub GetScene";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Physics = Scene.GetField(\"physics\")";
__ref._physics /*com.ab.banano.BANanoObject*/  = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("physics");
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Anims = Scene.GetField(\"anims\")";
__ref._anims /*com.ab.banano.BANanoObject*/  = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("anims");
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Input = Scene.GetField(\"input\")";
__ref._input /*com.ab.banano.BANanoObject*/  = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("input");
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Scale = Scene.GetField(\"scale\")";
__ref._scale /*com.ab.banano.BANanoObject*/  = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("scale");
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="World = Physics.GetField(\"world\")";
__ref._world /*com.ab.banano.BANanoObject*/  = __ref._physics /*com.ab.banano.BANanoObject*/ .GetField("world");
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Log(Scene)";
__c.Log(BA.ObjectToString(__ref._scene /*com.ab.banano.BANanoObject*/ ));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="End Sub";
return "";
}
public double  _getworldheight(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getworldheight", false))
	 {return ((Double) Debug.delegate(ba, "getworldheight", null));}
double _h = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub GetWorldHeight As Double";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim h As Double = World.GetField(\"height\").Result";
_h = (double)(BA.ObjectToNumber(__ref._world /*com.ab.banano.BANanoObject*/ .GetField("height").Result()));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Return h";
if (true) return _h;
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return 0;
}
public double  _getworldwidth(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "getworldwidth", false))
	 {return ((Double) Debug.delegate(ba, "getworldwidth", null));}
double _w = 0;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub GetWorldWidth As Double";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim w As Double = World.GetField(\"width\").Result";
_w = (double)(BA.ObjectToNumber(__ref._world /*com.ab.banano.BANanoObject*/ .GetField("width").Result()));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Return w";
if (true) return _w;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="End Sub";
return 0;
}
public String  _incrementx(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "incrementx", false))
	 {return ((String) Debug.delegate(ba, "incrementx", new Object[] {_bo,_x}));}
int _oldx = 0;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub IncrementX(bo As BANanoObject, x As Int)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim oldx As Int = GetX(bo)";
_oldx = __ref._getx /*int*/ (null,_bo);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="oldx = oldx + x";
_oldx = (int) (_oldx+_x);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="SetX(bo, oldx)";
__ref._setx /*String*/ (null,_bo,_oldx);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="End Sub";
return "";
}
public String  _incrementy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "incrementy", false))
	 {return ((String) Debug.delegate(ba, "incrementy", new Object[] {_bo,_y}));}
int _oldy = 0;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub IncrementY(bo As BANanoObject, y As Int)";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim oldy As Int = GetY(bo)";
_oldy = __ref._gety /*int*/ (null,_bo);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="oldy = oldy + y";
_oldy = (int) (_oldy+_y);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="SetY(bo, oldy)";
__ref._sety /*String*/ (null,_bo,_oldy);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="End Sub";
return "";
}
public String  _setoninit(b4j.example.phaserscene __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setoninit", false))
	 {return ((String) Debug.delegate(ba, "setoninit", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub SetOnInit(module As Object, methodName As Stri";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Scene.SetField(\"init\", cb)";
__ref._scene /*com.ab.banano.BANanoObject*/ .SetField("init",(Object)(_cb.getObject()));
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _physicsaddimage(b4j.example.phaserscene __ref,int _x,int _y,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "physicsaddimage", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "physicsaddimage", new Object[] {_x,_y,_key}));}
com.ab.banano.BANanoObject _img = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub PhysicsAddImage(x As Int, y As Int, key As Str";
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim img As BANanoObject = Physics.GetField(\"add\")";
_img = new com.ab.banano.BANanoObject();
_img = __ref._physics /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("image",(Object)(new Object[]{(Object)(_x),(Object)(_y),(Object)(_key)}));
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Return img";
if (true) return _img;
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="End Sub";
return null;
}
public String  _playsound(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "playsound", false))
	 {return ((String) Debug.delegate(ba, "playsound", new Object[] {_bo}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub PlaySound(bo As BANanoObject)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="bo.RunMethod(\"play\", Null)";
_bo.RunMethod("play",__c.Null);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return "";
}
public String  _playsoundloop(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "playsoundloop", false))
	 {return ((String) Debug.delegate(ba, "playsoundloop", new Object[] {_bo}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub PlaySoundLoop(bo As BANanoObject)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="bo.RunMethod(\"play\", Array(\"\",0 , 1, True))";
_bo.RunMethod("play",(Object)(new Object[]{(Object)(""),(Object)(0),(Object)(1),(Object)(__c.True)}));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _sceneaddparticles(b4j.example.phaserscene __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneaddparticles", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "sceneaddparticles", new Object[] {_key}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub SceneAddParticles(key As String) As BANanoObje";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("particles",(Object)(new Object[]{(Object)(_key)}));
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _sceneaddsound(b4j.example.phaserscene __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneaddsound", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "sceneaddsound", new Object[] {_key}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub SceneAddSound(key As String) As BANanoObject";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("sound",(Object)(new Object[]{(Object)(_key)}));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _sceneaddsprite(b4j.example.phaserscene __ref,int _x,int _y,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneaddsprite", false))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "sceneaddsprite", new Object[] {_x,_y,_key}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub SceneAddSprite(x As Int, y As Int, key As Stri";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Dim bo As BANanoObject = Scene.GetField(\"add\").Ru";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._scene /*com.ab.banano.BANanoObject*/ .GetField("add").RunMethod("sprite",(Object)(new Object[]{(Object)(_x),(Object)(_y),(Object)(_key)}));
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="End Sub";
return null;
}
public String  _sceneloadsound(b4j.example.phaserscene __ref,String _key,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "sceneloadsound", false))
	 {return ((String) Debug.delegate(ba, "sceneloadsound", new Object[] {_key,_url}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub SceneLoadSound(key As String, URL As String)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Scene.GetField(\"load\").RunMethod(\"sound\", Array(k";
__ref._scene /*com.ab.banano.BANanoObject*/ .GetField("load").RunMethod("sound",(Object)(new Object[]{(Object)(_key),(Object)(_url)}));
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public String  _scenerestart(b4j.example.phaserscene __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "scenerestart", false))
	 {return ((String) Debug.delegate(ba, "scenerestart", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub SceneReStart";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Scene.RunMethod(\"restart\", Null)";
__ref._scene /*com.ab.banano.BANanoObject*/ .RunMethod("restart",__c.Null);
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public String  _setbodyvelocityy(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _obj,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setbodyvelocityy", false))
	 {return ((String) Debug.delegate(ba, "setbodyvelocityy", new Object[] {_obj,_y}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Sub SetBodyVelocityY(obj As BANanoObject, y As Int";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="obj.GetField(\"body\").RunMethod(\"setVelocityY\", Ar";
_obj.GetField("body").RunMethod("setVelocityY",(Object)(new Object[]{(Object)(_y)}));
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return "";
}
public String  _setbouncex(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,double _bounce) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setbouncex", false))
	 {return ((String) Debug.delegate(ba, "setbouncex", new Object[] {_bo,_bounce}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub SetBounceX(bo As BANanoObject, bounce As Doubl";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="bo.RunMethod(\"setBounceX\", Array(bounce))";
_bo.RunMethod("setBounceX",(Object)(new Object[]{(Object)(_bounce)}));
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return "";
}
public String  _setscalex(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,double _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setscalex", false))
	 {return ((String) Debug.delegate(ba, "setscalex", new Object[] {_bo,_x}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub SetScaleX(bo As BANanoObject, x As Double)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim Scale As BANanoObject = bo.GetField(\"scale\")";
_scale = new com.ab.banano.BANanoObject();
_scale = _bo.GetField("scale");
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Scale.SetField(\"x\", x)";
__ref._scale /*com.ab.banano.BANanoObject*/ .SetField("x",(Object)(_x));
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="End Sub";
return "";
}
public String  _setscaley(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _bo,double _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "setscaley", false))
	 {return ((String) Debug.delegate(ba, "setscaley", new Object[] {_bo,_y}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub SetScaleY(bo As BANanoObject, y As Double)";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim Scale As BANanoObject = bo.GetField(\"scale\")";
_scale = new com.ab.banano.BANanoObject();
_scale = _bo.GetField("scale");
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Scale.SetField(\"y\", y)";
__ref._scale /*com.ab.banano.BANanoObject*/ .SetField("y",(Object)(_y));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
return "";
}
public String  _startfollow(b4j.example.phaserscene __ref,com.ab.banano.BANanoObject _source,com.ab.banano.BANanoObject _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="phaserscene";
if (Debug.shouldDelegate(ba, "startfollow", false))
	 {return ((String) Debug.delegate(ba, "startfollow", new Object[] {_source,_target}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub StartFollow(source As BANanoObject, target As";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="source.RunMethod(\"startFollow\", Array(target))";
_source.RunMethod("startFollow",(Object)(new Object[]{(Object)(_target.getObject())}));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
}