
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class pgbreakout implements IRemote{
	public static pgbreakout mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public pgbreakout() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new pgbreakout();
		remoteMe = RemoteObject.declareNull("b4j.example.pgbreakout");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("pgbreakout"), "b4j.example.pgbreakout");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, pgbreakout.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, pgbreakout.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _body = RemoteObject.declareNull("com.ab.banano.BANanoElement");
public static RemoteObject _game = RemoteObject.declareNull("b4j.example.bananophaser");
public static RemoteObject _gamediv = RemoteObject.declareNull("com.ab.banano.BANanoElement");
public static RemoteObject _player = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _ball = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _violetbricks = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _yellowbricks = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _redbricks = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _gamestarted = RemoteObject.createImmutable(false);
public static RemoteObject _openingtext = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _gameovertext = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _playerwontext = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _scene = RemoteObject.declareNull("b4j.example.phaserscene");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
  public Object[] GetGlobals() {
		return new Object[] {"ball",pgbreakout._ball,"BANano",pgbreakout._banano,"body",pgbreakout._body,"game",pgbreakout._game,"gameDiv",pgbreakout._gamediv,"gameOverText",pgbreakout._gameovertext,"gameStarted",pgbreakout._gamestarted,"Main",Debug.moduleToString(b4j.example.main.class),"openingText",pgbreakout._openingtext,"pgIndex",Debug.moduleToString(b4j.example.pgindex.class),"player",pgbreakout._player,"playerWonText",pgbreakout._playerwontext,"redBricks",pgbreakout._redbricks,"Scene",pgbreakout._scene,"violetBricks",pgbreakout._violetbricks,"yellowBricks",pgbreakout._yellowbricks};
}
}