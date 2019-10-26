
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bananophaser {
    public static RemoteObject myClass;
	public bananophaser() {
	}
    public static PCBA staticBA = new PCBA(null, bananophaser.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _phaser = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _game = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _mconfig = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mphysics = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _marcade = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mscale = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mscene = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _scalemanagershowall = RemoteObject.createImmutable(0);
public static RemoteObject _scalemanagernoscale = RemoteObject.createImmutable(0);
public static RemoteObject _scalemanagerexactfit = RemoteObject.createImmutable(0);
public static RemoteObject _scalemanagerresize = RemoteObject.createImmutable(0);
public static RemoteObject _scalemanageruserscale = RemoteObject.createImmutable(0);
public static RemoteObject _scalemoderesize = RemoteObject.createImmutable(0);
public static RemoteObject _scalemodeenvelop = RemoteObject.createImmutable(0);
public static RemoteObject _scalemodefit = RemoteObject.createImmutable(0);
public static RemoteObject _scalemodeheight_controls_width = RemoteObject.createImmutable(0);
public static RemoteObject _scalemodewidth_controls_height = RemoteObject.createImmutable(0);
public static RemoteObject _scalemodenone = RemoteObject.createImmutable(0);
public static RemoteObject _scalecentercenter_both = RemoteObject.createImmutable(0);
public static RemoteObject _scalecentercenter_horizontally = RemoteObject.createImmutable(0);
public static RemoteObject _scalecentercenter_vertically = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgbreakout _pgbreakout = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"game",_ref.getField(false, "_game"),"marcade",_ref.getField(false, "_marcade"),"mconfig",_ref.getField(false, "_mconfig"),"mphysics",_ref.getField(false, "_mphysics"),"mscale",_ref.getField(false, "_mscale"),"mscene",_ref.getField(false, "_mscene"),"Phaser",_ref.getField(false, "_phaser"),"ScaleCenterCENTER_BOTH",_ref.getField(false, "_scalecentercenter_both"),"ScaleCenterCENTER_HORIZONTALLY",_ref.getField(false, "_scalecentercenter_horizontally"),"ScaleCenterCENTER_VERTICALLY",_ref.getField(false, "_scalecentercenter_vertically"),"ScaleManagerExactFit",_ref.getField(false, "_scalemanagerexactfit"),"ScaleManagerNoScale",_ref.getField(false, "_scalemanagernoscale"),"ScaleManagerResize",_ref.getField(false, "_scalemanagerresize"),"ScaleManagerShowAll",_ref.getField(false, "_scalemanagershowall"),"ScaleManagerUserScale",_ref.getField(false, "_scalemanageruserscale"),"ScaleModeENVELOP",_ref.getField(false, "_scalemodeenvelop"),"ScaleModeFIT",_ref.getField(false, "_scalemodefit"),"ScaleModeHEIGHT_CONTROLS_WIDTH",_ref.getField(false, "_scalemodeheight_controls_width"),"ScaleModeNONE",_ref.getField(false, "_scalemodenone"),"ScaleModeRESIZE",_ref.getField(false, "_scalemoderesize"),"ScaleModeWIDTH_CONTROLS_HEIGHT",_ref.getField(false, "_scalemodewidth_controls_height")};
}
}