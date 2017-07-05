<?php // -*- mode: php -*-  Time-stamp: <2017-07-05 10:42:03 kahata>
/*================================================================
 * title: msnet glob_recursive 
 * file: glob_recursive.php
 * path: F:\GitHub\hataka\codingground\WisdomSoft\msnet\obj\glob_recursive.php
 * url:  http://192.168.1.53/f/GitHub/hataka/codingground/WisdomSoft/msnet/obj/glob_recursive.php
 * created: Time-stamp: <2016-11-20 10:33:14 kahata>
 * revised: Time-stamp: <2017-07-05 10:42:03 kahata>
 * revision: $Id$
 * Programmed By: 畑 和彦
 * link: 
 * description: 
 *================================================================*/
require_once("F:/php1/commonLib/Lib.class.php");

//error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);
error_reporting(E_ERROR | E_PARSE );

//Record class $pathlistからul_linkを生成する例
$br ="\n";

$basepath = "F:\\GitHub\\hataka\\codingground\\WisdomSoft\\msnet";
$filepattern = "win*.fdp";
//$filepattern = "Main.cs";
$pathlist= Lib::glob_recursive($basepath,$filepattern);

//print_r($pathlist);

foreach($pathlist as $path){
	test($path);
}

function test($path){
	global $br;
	$replace ="FFFFFF\" />\n    <movie preferredSDK=\"F:\\GitHub\\hataka\\codingground\\WisdomSoft\\msnet\\obj\" />\n  </output>";

	//echo($path.$br);
	$content = file_get_contents($path);
	$pattern ="'FFFFFF\" />\s+</output>'si";
	//$pattern = "'===\*/\s+using System\.Windows\.Forms'";
	$count = preg_match_all($pattern,$content,$matches);
	//if($count>0) echo($matches[0][0].$br);
	if($count>0){
		$content = str_replace($matches[0][0],$replace, $content);
	 	echo($path."\n=============\n".trim($content)."\n=============\n\n");
		file_put_contents($path,$content);
	}
}
