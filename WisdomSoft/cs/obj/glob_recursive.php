<?php // -*- mode: php -*-  <2017-07-14 20:57:03 kahata>
/*================================================================
 * title: msnet glob_recursive 
 * file: glob_recursive.php
 * path: F:\GitHub\hataka\codingground\WisdomSoft\msnet\obj\glob_recursive.php
 * url:  http://192.168.1.53/f/GitHub/hataka/codingground/WisdomSoft/msnet/obj/glob_recursive.php
 * created: Time-stamp: <2016-11-20 10:33:14 kahata>
 * revised: Time-stamp: <2017-07-05 10:42:03 kahata>
 * revised: Time-stamp: <2017-07-14 20:57:03 kahata>
 * revision: $Id$
 * Programmed By: 畑 和彦
 * link: 
 * description: 
 *================================================================*/
require_once("F:/php1/commonLib/Lib.class.php");
require_once('F:/php1/lib/file.inc.php');

//error_reporting(E_ERROR | E_WARNING | E_PARSE | E_NOTICE);
error_reporting(E_ERROR | E_PARSE );

define('HTML_FILE',true);
define('SRC_FILE',true);
define('OUTPUT_PDF', false);

//Record class $pathlistからul_linkを生成する例
global $option,$br;
$option = 'overwrite';
$br = isset($_SERVER["HTTP_USER_AGENT"]) ? "<br />\n" : "\n";

$rootpath    = "F:\\codingground\\WisdomSoft\\cs";
$filepattern = "build.xml";
$sitedata    = "F:/codingground/WisdomSoft/template/site.txt";
$title       = "WisdomSoft C#入門";
$pathlist= Lib::glob_recursive($rootpath,$filepattern);
$sitelist=file($sitedata);

//print_r($pathlist);
//get_files();

foreach($pathlist as $path){
	//echo $br.$br.$path.$br;
	//replace($path);
	//copy_build_file($path);
	//test($path);
}
///////////////////////////////////////////////////////////////////////	
	function replace($path){
		$search = "<delete dir=\"obj\" />";
		$replace = "<delete dir=\"obj/Debug\" />";
		$content = file_get_contents($path);
		$content = str_replace($search, $replace, $content);
		echo $content.$br;
		file_put_contents($path, $content);
	}
	
  function test($path){
		global $br;
		echo($path.$br);
//	$pattern ="'FFFFFF\" />\s+</output>'si";
//	$replace ="FFFFFF\" />\n    <movie preferredSDK=\"F:\\codingground\\WisdomSoft\\java\\obj\" />\n  </output>";

		//$search = "\n\n\tDim shell\n";
	
		//$content = file_get_contents($path);
		//$content = str_replace($search,"", $content);
		//echo($path."\n=============\n".trim($content)."\n=============\n\n");

		//$count = preg_match_all($pattern,$content,$matches);
		//echo $count.$br;
		//if($count>0) echo($matches[0][0].$br);
		//if($count==2){
			//echo $replace;
			//$content = str_replace($matches[0][0],"", $content);
	 		//echo($path."\n=============\n".trim($content)."\n=============\n\n");
			//file_put_contents($path,$content);
		//}
	//}
	}

	function copy_build_file($path){
		global $br;
		$template = "F:\\codingground\\WisdomSoft\\java\\obj\\RunApp.wsf";
		//echo($path.$br);
		$content = make_from_template($template, dirname($path));
	 	echo($path."\n=============\n".trim($content)."\n=============\n\n");
	}
	
	function make_from_template($template, $destdir){
		if(Lib::filebody($template) == 'DirName'){
			$destfile = $destdir.'/'.basename($destdir).'.'.Lib::fileext($template);
		}
		else if(Lib::filebody($template) == 'BaseName'){
			//$destfile = $directory.'/'.filebody($this->basefile).'.'.fileext($template);
		}
		else { 
			$destfile = $destdir.'/'.basename($template);
		}
		$target = basename($destdir);
		//echo $target.$br;
		//$localpath = get_realpath($distfile);
		//$localurl  = get_localurl($distfile);
		$content = file_get_contents($template);
		$content = str_replace('%%TARGET%%',$target,$content);
		$content = str_replace('%%TIMESTAMP%%',output_timestamp(),$content);
		$content = str_replace('%%FILENAME%%',basename($destfile),$content);
		$content = str_replace('%%FILEDIR%%',$destdir.'/',$content);
		$content = str_replace('%%DIR_NAME%%',basename($destdir),$content);
		//$content = str_replace('%%PATH%%',$localpath,$content);
		//$content = str_replace('%%LOCALDIR%%',dirname($localurl),$content);
		//$content = str_replace('%%LOCALURL%%',$localurl,$content);
		return mb_convert_encoding($content,"UTF-8","auto");
	}

///////////////////////////////////////////////////////////////////////	
	function get_files(){
		global $br,$option, $sitelist,$rootpath,$title; 
	  for($i=107;$i<179;$i++){ //cs
			$body = format_name(filebody(basename($sitelist[$i])));
			$dir = $rootpath."\\".$body;
			$data = @file_get_contents(trim($sitelist[$i]));
			$data = format_html($data,trim($sitelist[$i]));
			if(HTML_FILE){
				if(!file_exists($dir)) mkdir($dir, 0777, true);
				file_put_contents($dir."\\".$body.".html",$data);
				echo "download: ".$dir."\\".$body.".html".$br;
				if(OUTPUT_PDF){
					$wkhtmltopdf = "F:/Programs/wkhtmltopdf/bin/wkhtmltopdf.exe";
					$url = trim($sitelist[$i]);
					$pdf = $dir."\\".$body.".pdf";
					$cmd = $wkhtmltopdf.' --encoding shift_jis '.$url.' '.$pdf;
					$output = shell_exec($cmd);
					echo $output;
				}
			}
			$pattern ="'<title>(.+?)</title>'si";
			$count = preg_match_all($pattern,$data,$matches);
			if($count){
				$title= trim($matches[1][0]);
			}			
			$pattern ="'<pre class=\"prg\">(.+?)</pre's";
			$count = preg_match_all($pattern,$data,$matches);
			if($count){
				for ($j = 0; $j<$count; $j++) {
					$srcdir= sprintf("%s\\%s_%d",$dir,$body,$j+1);
					$srcfile=$srcdir."\\main.cs";
					$source = format_src(trim($matches[1][$j]));
					$source = putput_heading($srcfile, trim($sitelist[$i]))."\n".$source."\n";				
					if(SRC_FILE){
						if(!file_exists($srcdir)) mkdir($srcdir, 0777, true);
						file_put_contents($srcfile,$source);
						echo "download: ".$srcfile.$br;
					}
				}
				echo $br;
			}
		}
	}

///////////////////////////////////////////////////////////////////////	
	function format_html($data, $site){
  	$data = str_replace('layout.css','http://wisdom.sakura.ne.jp/programming/java/layout.css',$data);
		$data = str_replace('charset=Shift_JIS','charset=UTF-8',$data);
		$data = str_replace('< <','<<',$data);
		$data = str_replace('> >','>>',$data);
		$data = str_replace("</head>","<meta http-equiv='Content-Type'content='text/htm; charset=UTF-8'>\n</head>",$data);
		//$data = str_replace("</head>"," <base href='".dirname($site)."'>\n</head>",$data);
		$data = mb_convert_encoding($data,'utf-8','shift_jis');
		return $data;
	}

	function format_src($data){
		$source= strip_tags($data);
		$source= str_replace("&#60;"," <",$source);
		$source= str_replace("&#62;",">",$source);
		$source= str_replace("&lt;","<",$source);
		$source= str_replace("&gt;",">",$source);
		$source= str_replace("&quot;","\"",$source);
		$source= str_replace("< <","<<",$source);
		$source= str_replace("> >",">>",$source);
		return $source;
	}

	function putput_heading($filepath,$site){
		global $title;
		$fname= basename($filepath);
		$path = $filepath;//dirname(__FILE__).'/'.
		//$path =str_replace('/','\\',$path);
		$url = str_replace('F:','http://localhost/f',$path);
		$url = str_replace('\\','/',$url);
	
		$timestamp=output_timestamp();
		$output =<<<EOB
// -*- mode: java -*-  $timestamp
/*================================================================
 * title: $title 
 * file:  $fname
 * path;  $path
 * url:   $url
 * created: $timestamp
 * revision: ＄Id＄
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: http://wisdom.sakura.ne.jp/
 * link: $site
 * description: 
 *
 *================================================================*/

EOB;
		return mb_convert_encoding(str_replace('＄','$',$output),'UTF-8','auto');
	}

	function output_timestamp(){
		list($sec,$min,$hour,$mday,$month,$year,$wday,$yday,$isdst) = localtime(time());
		$year = $year + 1900;$month++;
		$timestamp = sprintf("Time-stamp: <%04d-%02d-%02d %02d:%02d:%02d kahata>", $year, $month, $mday, $hour, $min, $sec);
		return $timestamp;
	}

	function format_name($name){
		$pattern ="'([a-z]+)([0-9]+)'";
		preg_match($pattern, $name, $matches);
		return $matches[1].sprintf("%03d",intval($matches[2]));
	}

