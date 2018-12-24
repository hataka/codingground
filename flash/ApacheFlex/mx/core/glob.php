<?php
	
	foreach (glob("*.html") as $filename) {
    //echo "$filename size " . filesize($filename) . "<br />"; //\n";
		mkdir(str_replace('.html','', $filename));
		rename($filename, str_replace('.html','', $filename).'/'.$filename);
	}
	
	/*
	foreach (glob("*.mxml") as $filename) {
    //echo "$filename size " . filesize($filename) . "<br />"; //\n";
		mkdir(str_replace('.mxml','', $filename));
		//ename($filename, str_replace('.html','', $filename).'/'.$filename);
	}
*/

?>
