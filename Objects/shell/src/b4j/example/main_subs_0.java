package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,58);
if (RapidSub.canDelegate("application_error")) { return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 58;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,15);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _version = RemoteObject.createImmutable(0L);
RemoteObject _appfile = RemoteObject.createImmutable("");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 15;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="BP.Initialize";
Debug.ShouldStop(65536);
main._bp.runVoidMethod ("_initialize",main.ba);
 BA.debugLineNum = 18;BA.debugLine="BP.RedirectOutput(File.DirApp,\"log.txt\")";
Debug.ShouldStop(131072);
main._bp.runVoidMethod ("_redirectoutput",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("log.txt")));
 BA.debugLineNum = 19;BA.debugLine="Publish = \"C:\\laragon\\www\"";
Debug.ShouldStop(262144);
main._publish = BA.ObjectToString("C:\\laragon\\www");
 BA.debugLineNum = 21;BA.debugLine="Dim Version As Long = DateTime.now";
Debug.ShouldStop(1048576);
_version = main.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("Version", _version);Debug.locals.put("Version", _version);
 BA.debugLineNum = 22;BA.debugLine="Dim appFile As String = $\"app${Version}.js\"$";
Debug.ShouldStop(2097152);
_appfile = (RemoteObject.concat(RemoteObject.createImmutable("app"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_version))),RemoteObject.createImmutable(".js")));Debug.locals.put("appFile", _appfile);Debug.locals.put("appFile", _appfile);
 BA.debugLineNum = 25;BA.debugLine="BANano.Initialize(\"BANano\", AppName, Version)";
Debug.ShouldStop(16777216);
main._banano.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("BANano")),(Object)(main._appname),(Object)(_version));
 BA.debugLineNum = 26;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
Debug.ShouldStop(33554432);
main._banano.setField ("HTML_NAME",BA.ObjectToString("index.html"));
 BA.debugLineNum = 27;BA.debugLine="BANano.Header.Title = AppName";
Debug.ShouldStop(67108864);
main._banano.getField(false,"Header").setField ("Title",main._appname);
 BA.debugLineNum = 28;BA.debugLine="BANano.JAVASCRIPT_NAME = appFile";
Debug.ShouldStop(134217728);
main._banano.setField ("JAVASCRIPT_NAME",_appfile);
 BA.debugLineNum = 29;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = True";
Debug.ShouldStop(268435456);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setUseServiceWorker",main.__c.getField(true,"True"));
 BA.debugLineNum = 31;BA.debugLine="BANano.Header.AddJavascriptFile(\"phaser.min.js\")";
Debug.ShouldStop(1073741824);
main._banano.getField(false,"Header").runVoidMethod ("AddJavascriptFile",(Object)(RemoteObject.createImmutable("phaser.min.js")));
 BA.debugLineNum = 42;BA.debugLine="BANano.Build(Publish)";
Debug.ShouldStop(512);
main._banano.runVoidMethod ("Build",(Object)(main._publish));
 BA.debugLineNum = 43;BA.debugLine="BP.OpenLog(File.DirApp, \"log.txt\")";
Debug.ShouldStop(1024);
main._bp.runVoidMethod ("_openlog",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("log.txt")));
 BA.debugLineNum = 45;BA.debugLine="BP.PublishPath = Publish";
Debug.ShouldStop(4096);
main._bp.setField ("_publishpath",main._publish);
 BA.debugLineNum = 46;BA.debugLine="BP.ShortName = AppName";
Debug.ShouldStop(8192);
main._bp.setField ("_shortname",main._appname);
 BA.debugLineNum = 47;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
Debug.ShouldStop(16384);
main._bp.setField ("_assetspath",main._banano.getField(true,"ASSETS_FOLDER"));
 BA.debugLineNum = 48;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
Debug.ShouldStop(32768);
main._bp.setField ("_scriptspath",main._banano.getField(true,"SCRIPTS_FOLDER"));
 BA.debugLineNum = 49;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
Debug.ShouldStop(65536);
main._bp.setField ("_stylespath",main._banano.getField(true,"STYLES_FOLDER"));
 BA.debugLineNum = 50;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
Debug.ShouldStop(131072);
main._bp.setField ("_scriptfile",main._banano.getField(true,"JAVASCRIPT_NAME"));
 BA.debugLineNum = 53;BA.debugLine="BP.Open(True)";
Debug.ShouldStop(1048576);
main._bp.runVoidMethod ("_open",(Object)(main.__c.getField(true,"True")));
 BA.debugLineNum = 54;BA.debugLine="ExitApplication";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _banano_ready() throws Exception{
try {
		Debug.PushSubsStack("BANano_Ready (main) ","main",0,main.ba,main.mostCurrent,62);
if (RapidSub.canDelegate("banano_ready")) { return b4j.example.main.remoteMe.runUserSub(false, "main","banano_ready");}
 BA.debugLineNum = 62;BA.debugLine="Sub BANano_Ready";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="pgBreakOut.init";
Debug.ShouldStop(-2147483648);
main._pgbreakout.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
pgindex_subs_0._process_globals();
pgbreakout_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
pgindex.myClass = BA.getDeviceClass ("b4j.example.pgindex");
pgbreakout.myClass = BA.getDeviceClass ("b4j.example.pgbreakout");
bananophaser.myClass = BA.getDeviceClass ("b4j.example.bananophaser");
phaserscene.myClass = BA.getDeviceClass ("b4j.example.phaserscene");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public BANano As BANano 'ignore";
main._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 10;BA.debugLine="Public AppName As String = \"bananophaser\"";
main._appname = BA.ObjectToString("bananophaser");
 //BA.debugLineNum = 11;BA.debugLine="Private Publish As String";
main._publish = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Private BP As BANanoPostProcessor";
main._bp = RemoteObject.createNew ("b4j.example.bananopostprocessor");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}