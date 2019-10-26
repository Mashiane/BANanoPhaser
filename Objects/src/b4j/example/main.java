package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 500, 500);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static String _appname = "";
public static String _publish = "";
public static b4j.example.bananopostprocessor _bp = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.pgbreakout _pgbreakout = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
long _version = 0L;
String _appfile = "";
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="BP.Initialize";
_bp._initialize(ba);
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="BP.RedirectOutput(File.DirApp,\"log.txt\")";
_bp._redirectoutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="Publish = \"C:\\laragon\\www\"";
_publish = "C:\\laragon\\www";
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="Dim Version As Long = DateTime.now";
_version = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="Dim appFile As String = $\"app${Version}.js\"$";
_appfile = ("app"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version))+".js");
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="BANano.Initialize(\"BANano\", AppName, Version)";
_banano.Initialize("BANano",_appname,_version);
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
_banano.HTML_NAME = "index.html";
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="BANano.Header.Title = AppName";
_banano.Header.Title = _appname;
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="BANano.JAVASCRIPT_NAME = appFile";
_banano.JAVASCRIPT_NAME = _appfile;
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = True";
_banano.TranspilerOptions.setUseServiceWorker(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="BANano.Header.AddJavascriptFile(\"phaser.min.js\")";
_banano.Header.AddJavascriptFile("phaser.min.js");
RDebugUtils.currentLine=65563;
 //BA.debugLineNum = 65563;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
RDebugUtils.currentLine=65564;
 //BA.debugLineNum = 65564;BA.debugLine="BP.OpenLog(File.DirApp, \"log.txt\")";
_bp._openlog(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="BP.PublishPath = Publish";
_bp._publishpath = _publish;
RDebugUtils.currentLine=65567;
 //BA.debugLineNum = 65567;BA.debugLine="BP.ShortName = AppName";
_bp._shortname = _appname;
RDebugUtils.currentLine=65568;
 //BA.debugLineNum = 65568;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
_bp._assetspath = _banano.ASSETS_FOLDER;
RDebugUtils.currentLine=65569;
 //BA.debugLineNum = 65569;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
_bp._scriptspath = _banano.SCRIPTS_FOLDER;
RDebugUtils.currentLine=65570;
 //BA.debugLineNum = 65570;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
_bp._stylespath = _banano.STYLES_FOLDER;
RDebugUtils.currentLine=65571;
 //BA.debugLineNum = 65571;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
_bp._scriptfile = _banano.JAVASCRIPT_NAME;
RDebugUtils.currentLine=65574;
 //BA.debugLineNum = 65574;BA.debugLine="BP.Open(True)";
_bp._open(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65575;
 //BA.debugLineNum = 65575;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=65576;
 //BA.debugLineNum = 65576;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "banano_ready", false))
	 {return ((String) Debug.delegate(ba, "banano_ready", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub BANano_Ready";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="pgBreakOut.init";
_pgbreakout._init /*String*/ ();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
}