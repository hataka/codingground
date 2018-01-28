	var fso = WScript.CreateObject("Scripting.FileSystemObject");
	var scriptFolder = fso.GetFile(WScript.ScriptFullName).ParentFolder.Path;
	
	var projectPath = WScript.Arguments. Named.Item("projectPath");
  var curDir = WScript.Arguments. Named.Item("curDir");
	var curFile = WScript.Arguments. Named.Item("curFile");
	var projectDir = WScript.Arguments. Named.Item("projectDir");

	var shell = new ActiveXObject("WScript.Shell")
	if(projectDir == "F:\\codingground\\WisdomSoft\\cs"){
		shell.CurrentDirectory = dirname(curFile);
	}
	else shell.CurrentDirectory = projectDir;
//shell.CurrentDirectory = projectPath;