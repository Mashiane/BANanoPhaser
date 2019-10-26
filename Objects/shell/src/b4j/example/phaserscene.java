
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class phaserscene {
    public static RemoteObject myClass;
	public phaserscene() {
	}
    public static PCBA staticBA = new PCBA(null, phaserscene.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _physics = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _anims = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _input = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _cursors = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _scene = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _scale = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _world = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _math = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgbreakout _pgbreakout = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Anims",_ref.getField(false, "_anims"),"BANano",_ref.getField(false, "_banano"),"Cursors",_ref.getField(false, "_cursors"),"Input",_ref.getField(false, "_input"),"Math",_ref.getField(false, "_math"),"Physics",_ref.getField(false, "_physics"),"Scale",_ref.getField(false, "_scale"),"Scene",_ref.getField(false, "_scene"),"World",_ref.getField(false, "_world")};
}
}