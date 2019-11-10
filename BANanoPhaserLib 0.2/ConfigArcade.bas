B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public gravity As Map
	Public debug As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	debug = True
	gravity.Initialize
End Sub