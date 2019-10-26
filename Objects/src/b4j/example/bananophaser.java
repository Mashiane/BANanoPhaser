package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananophaser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananophaser", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananophaser.class).invoke(this, new Object[] {null});
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
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _phaser = null;
public com.ab.banano.BANanoObject _game = null;
public anywheresoftware.b4a.objects.collections.Map _mconfig = null;
public anywheresoftware.b4a.objects.collections.Map _mphysics = null;
public anywheresoftware.b4a.objects.collections.Map _marcade = null;
public anywheresoftware.b4a.objects.collections.Map _mscale = null;
public anywheresoftware.b4a.objects.collections.Map _mscene = null;
public int _scalemanagershowall = 0;
public int _scalemanagernoscale = 0;
public int _scalemanagerexactfit = 0;
public int _scalemanagerresize = 0;
public int _scalemanageruserscale = 0;
public int _scalemoderesize = 0;
public int _scalemodeenvelop = 0;
public int _scalemodefit = 0;
public int _scalemodeheight_controls_width = 0;
public int _scalemodewidth_controls_height = 0;
public int _scalemodenone = 0;
public int _scalecentercenter_both = 0;
public int _scalecentercenter_horizontally = 0;
public int _scalecentercenter_vertically = 0;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgbreakout _pgbreakout = null;
public int  _between(b4j.example.bananophaser __ref,int _dfrom,int _dto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "between", false))
	 {return ((Integer) Debug.delegate(ba, "between", new Object[] {_dfrom,_dto}));}
int _dres = 0;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Between(dFrom As Int, dTo As Int) As Int";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim dRes As Int = Phaser.GetField(\"Math\").RunMeth";
_dres = (int)(BA.ObjectToNumber(__ref._phaser /*com.ab.banano.BANanoObject*/ .GetField("Math").RunMethod("Between",(Object)(new Object[]{(Object)(_dfrom),(Object)(_dto)})).Result()));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Return dRes";
if (true) return _dres;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.bananophaser __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Initialize()";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Phaser.Initialize(\"Phaser\")";
__ref._phaser /*com.ab.banano.BANanoObject*/ .Initialize((Object)("Phaser"));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="mconfig = CreateMap()";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="mphysics = CreateMap()";
__ref._mphysics /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="marcade = CreateMap()";
__ref._marcade /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="mscale = CreateMap()";
__ref._mscale /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="mscene = CreateMap()";
__ref._mscene /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="mphysics.Put(\"arcade\", marcade)";
__ref._mphysics /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("arcade"),(Object)(__ref._marcade /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="mconfig.Put(\"physics\", mphysics)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("physics"),(Object)(__ref._mphysics /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="mconfig.Put(\"scale\", mscale)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("scale"),(Object)(__ref._mscale /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="mconfig.Put(\"scene\", mscene)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("scene"),(Object)(__ref._mscene /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="End Sub";
return "";
}
public String  _setparent(b4j.example.bananophaser __ref,String _parentid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setparent", false))
	 {return ((String) Debug.delegate(ba, "setparent", new Object[] {_parentid}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub SetParent(parentID As String)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="mconfig.Put(\"parent\", parentID)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("parent"),(Object)(_parentid));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4j.example.bananophaser __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setwidth", false))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_width}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub SetWidth(width As Int)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="mconfig.Put(\"width\", width)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("width"),(Object)(_width));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4j.example.bananophaser __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setheight", false))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_height}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub SetHeight(height As Int)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="mconfig.Put(\"height\", height)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("height"),(Object)(_height));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _settypeauto(b4j.example.bananophaser __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "settypeauto", false))
	 {return ((String) Debug.delegate(ba, "settypeauto", new Object[] {_b}));}
Object _auto = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub SetTypeAuto(b As Boolean)";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="If b = False Then Return";
if (_b==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Dim auto As Object = Phaser.GetField(\"AUTO\")";
_auto = (Object)(__ref._phaser /*com.ab.banano.BANanoObject*/ .GetField("AUTO").getObject());
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="mconfig.Put(\"type\", auto)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("type"),_auto);
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="End Sub";
return "";
}
public String  _setphysicsdefault(b4j.example.bananophaser __ref,String _def) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setphysicsdefault", false))
	 {return ((String) Debug.delegate(ba, "setphysicsdefault", new Object[] {_def}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub SetPhysicsDefault(def As String)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="mphysics.Put(\"default\", def)";
__ref._mphysics /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("default"),(Object)(_def));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public String  _setphysicsarcadegravity(b4j.example.bananophaser __ref,Object _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setphysicsarcadegravity", false))
	 {return ((String) Debug.delegate(ba, "setphysicsarcadegravity", new Object[] {_options}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub SetPhysicsArcadeGravity(options As Object)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="marcade.Put(\"gravity\", options)";
__ref._marcade /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("gravity"),_options);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _setphysicsarcadedebug(b4j.example.bananophaser __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setphysicsarcadedebug", false))
	 {return ((String) Debug.delegate(ba, "setphysicsarcadedebug", new Object[] {_b}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub SetPhysicsArcadeDebug(b As Boolean)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="marcade.Put(\"debug\", b)";
__ref._marcade /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("debug"),(Object)(_b));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public b4j.example.phaserscene  _createscene(b4j.example.bananophaser __ref,String _scenename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "createscene", false))
	 {return ((b4j.example.phaserscene) Debug.delegate(ba, "createscene", new Object[] {_scenename}));}
b4j.example.phaserscene _ps = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub CreateScene(sceneName As String) As PhaserScen";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim ps As PhaserScene";
_ps = new b4j.example.phaserscene();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="ps.Initialize(sceneName)";
_ps._initialize /*String*/ (null,ba,_scenename);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Return ps";
if (true) return _ps;
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return null;
}
public String  _setscene(b4j.example.bananophaser __ref,com.ab.banano.BANanoObject _gs) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setscene", false))
	 {return ((String) Debug.delegate(ba, "setscene", new Object[] {_gs}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub SetScene(gs As BANanoObject)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="mconfig.Put(\"scene\", gs)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("scene"),(Object)(_gs.getObject()));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _start(b4j.example.bananophaser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "start", false))
	 {return ((String) Debug.delegate(ba, "start", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Start";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="game.Initialize2(\"Phaser.Game\", mconfig)";
__ref._game /*com.ab.banano.BANanoObject*/ .Initialize2("Phaser.Game",(Object)(__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public double  _floatbetween(b4j.example.bananophaser __ref,double _dfrom,double _dto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "floatbetween", false))
	 {return ((Double) Debug.delegate(ba, "floatbetween", new Object[] {_dfrom,_dto}));}
double _dres = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub FloatBetween(dFrom As Double, dTo As Double) A";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim dRes As Double = Phaser.GetField(\"Math\").RunM";
_dres = (double)(BA.ObjectToNumber(__ref._phaser /*com.ab.banano.BANanoObject*/ .GetField("Math").RunMethod("FloatBetween",(Object)(new Object[]{(Object)(_dfrom),(Object)(_dto)})).Result()));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Return dRes";
if (true) return _dres;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return 0;
}
public String  _setscalemode(b4j.example.bananophaser __ref,int _scalemode) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setscalemode", false))
	 {return ((String) Debug.delegate(ba, "setscalemode", new Object[] {_scalemode}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub SetScaleMode(scaleMode As Int)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="mscale.Put(\"mode\", scaleMode)";
__ref._mscale /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("mode"),(Object)(_scalemode));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _setscaleautocenter(b4j.example.bananophaser __ref,int _autocenter) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setscaleautocenter", false))
	 {return ((String) Debug.delegate(ba, "setscaleautocenter", new Object[] {_autocenter}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub SetScaleAutoCenter(autoCenter As Int)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="mscale.Put(\"autoCenter\", autoCenter)";
__ref._mscale /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("autoCenter"),(Object)(_autocenter));
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.bananophaser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Private Phaser As BANanoObject";
_phaser = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Public game As BANanoObject";
_game = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Private mconfig As Map";
_mconfig = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Private mphysics As Map";
_mphysics = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Private marcade As Map";
_marcade = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Private mscale As Map";
_mscale = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Private mscene As Map";
_mscene = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Public const ScaleManagerShowAll As Int = 2";
_scalemanagershowall = (int) (2);
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Public const ScaleManagerNoScale As Int = 1";
_scalemanagernoscale = (int) (1);
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="Public const ScaleManagerExactFit As Int = 0";
_scalemanagerexactfit = (int) (0);
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="Public const ScaleManagerResize As Int = 3";
_scalemanagerresize = (int) (3);
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="Public const ScaleManagerUserScale As Int = 4";
_scalemanageruserscale = (int) (4);
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Public const ScaleModeRESIZE As Int = 5";
_scalemoderesize = (int) (5);
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="Public const ScaleModeENVELOP As Int = 4";
_scalemodeenvelop = (int) (4);
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="Public const ScaleModeFIT As Int = 3";
_scalemodefit = (int) (3);
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="Public const ScaleModeHEIGHT_CONTROLS_WIDTH As In";
_scalemodeheight_controls_width = (int) (2);
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="Public const ScaleModeWIDTH_CONTROLS_HEIGHT As In";
_scalemodewidth_controls_height = (int) (1);
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="Public const ScaleModeNONE As Int = 0";
_scalemodenone = (int) (0);
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="Public const ScaleCenterCENTER_BOTH As Int = 1";
_scalecentercenter_both = (int) (1);
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="Public const ScaleCenterCENTER_HORIZONTALLY As In";
_scalecentercenter_horizontally = (int) (2);
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="Public const ScaleCenterCENTER_VERTICALLY As Int";
_scalecentercenter_vertically = (int) (3);
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="End Sub";
return "";
}
public String  _cstr(b4j.example.bananophaser __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "cstr", false))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_obj}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Cstr(obj As Object) As String";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Return \"\" & obj";
if (true) return ""+BA.ObjectToString(_obj);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(b4j.example.bananophaser __ref,String _colour) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", false))
	 {return ((String) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_colour}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub SetBackgroundColor(colour As String)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="mconfig.Put(\"backgroundColor\", colour)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("backgroundColor"),(Object)(_colour));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _settypecanvas(b4j.example.bananophaser __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "settypecanvas", false))
	 {return ((String) Debug.delegate(ba, "settypecanvas", new Object[] {_b}));}
Object _auto = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub SetTypeCanvas(b As Boolean)";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="If b = False Then Return";
if (_b==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim auto As Object = Phaser.GetField(\"CANVAS\")";
_auto = (Object)(__ref._phaser /*com.ab.banano.BANanoObject*/ .GetField("CANVAS").getObject());
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="mconfig.Put(\"type\", auto)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("type"),_auto);
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="End Sub";
return "";
}
public String  _settypewebgl(b4j.example.bananophaser __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananophaser";
if (Debug.shouldDelegate(ba, "settypewebgl", false))
	 {return ((String) Debug.delegate(ba, "settypewebgl", new Object[] {_b}));}
Object _auto = null;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub SetTypeWebGL(b As Boolean)";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="If b = False Then Return";
if (_b==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim auto As Object = Phaser.GetField(\"WEBGL\")";
_auto = (Object)(__ref._phaser /*com.ab.banano.BANanoObject*/ .GetField("WEBGL").getObject());
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="mconfig.Put(\"type\", auto)";
__ref._mconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("type"),_auto);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="End Sub";
return "";
}
}