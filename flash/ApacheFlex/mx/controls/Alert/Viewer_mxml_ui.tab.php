<?php // -*- mode: php -*-  Time-stamp: <2010-09-05 9:43:53 kahata>
/**
 * <pre>
 *================================================================
 * title: 
 * file: tab_viewer.php
 * path: F:\tex\photochem\tab_viewer.php
 * url:  http://hata2/tex/jquery_ui.tab.php
 * created: Time-stamp: <2010-09-05 9:43:53 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: 
 *================================================================*
 * </pre>
 * @package    Openspc2
 * @subpackage new_JavaScript_reibun
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2010 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
 */
	require_once('/php1/lib/file.inc.php');
	require_once('/php1/lib/geshi/geshi_dsp.php'); 

	$br = '<br />';
	$realpath = realpath(__FILE__);
	$localurl = localurl(__FILE__);
//	$filename = basename(__FILE__);
//	$filebody = filebody(__FILE__);
//	$fileext  = fileext(__FILE__);

if(empty($_GET['dir'])){
	$filepath = 'http://hata2/Flash/ApacheFlex/mx/controls/Alert//SimpleAlert.mxml';
	$target   = filebody($filepath);
	$filename = basename($filepath);
}
else {
	$filepath = $_GET['dir'];
	$target   = filebody($filepath);
}
$src2output = array('java' => 'html', 'tex' => 'pdf', 'mxml' => 'swf','as' => 'swf');

function iframe_output($url){
  global $src2output;
  if(key_exists(fileext($url), $src2output)){
    $url = str_replace('.'.fileext($url),'.'.$src2output[fileext($url)],$url);
  } 
 	if(@file_get_contents($url)){
 		if(fileext($url) == 'pdf'){
			return '<embed src="'.$url.'" width=100% height=100%></embed>';
 		}
 		else {
 			return '<iframe id="Z" name="newZ" onload="GetHeight(this.id,this.name)" frameborder="0" width=100%  src ="'
				.$url.'"></iframe>';
 		}
// 		return '<iframe id="Z" name="newZ" onload="GetHeight(this.id,this.name)" frameborder="0" width=100%  src ="'
//		.$url.'"></iframe>';
	}
	else {
		return '';
	}
}


function geshi_output($url){
	$path = str_replace('http://hata2','http://hata2',$url);
	//$path = str_replace('//','',$path);
	if(@file_get_contents($url)){
		$output = geshi_dsp($path,fileext($path),'number,onlyinclude'); 
		return mb_convert_encoding($output,'Shift_JIS','auto'); 
	}
	else {
		return '';
	}
}

function applet_output($url,$width,$height){
	$class = filebody($url);
	if(@file_get_contents($url)){
		return '<applet codebase = "./" code="'.$class.'.class" width=640 height=480></applet>';
	} else {
		return '';
	}
}

?>
<!-- ここにcomment必要 理由不明 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" 
		"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja">
<head>
 <meta http-equiv="content-type" content="application/xhtml+xml; charset=Shift_JIS" />
 <meta http-equiv="Content-Style-Type" content="text/css" />
 <meta http-equiv="Content-Script-Type" content="text/javascript" />
 <title><?php echo $target; ?></title>
 <link href="/FrameWork/scripts/layout.css" rel="stylesheet" type="text/css" />  
 <style type="text/css" media="all">
	.note {color:red;}
 </style>
 <script src="/FrameWork/scripts/jquery-latest.js"></script>
 <script type="text/javascript" src="/FrameWork/scripts/ui.tabs/ui.core.js"></script>
 <script type="text/javascript" src="/FrameWork/scripts/ui.tabs/ui.tabs.js"></script>
 <link href="/FrameWork/scripts/ui.tabs/ui.tabs.css" rel="stylesheet" type="text/css" />  
 <script type="text/javascript">
	$(document).ready(function (){
      $('#tabC > ul').tabs();   // Slide effect
	});

	function GetHeight(ID,NAME){
		if (document.height){
			document.getElementById(ID).style.height = this.frames[NAME].document.height +30 +"px" ;
		}
		else{
			document.getElementById(ID).style.height = "800px";
		}
}

	function load_file(target,url){
		$(target).css("background-color","white");
		$(target).css("color","black");
		$(target).load(url);
	}

	function load_iframe(target,url,height){
		$(target).html("<iframe frameborder=no scrolling=auto style='border: 1px gray dotted;' width=100% height=" + height + "px src =" + url + "></iframe>");
	}

	function iframe_autoheight(target, url){
		$(target).html("<iframe id='Z' name='newZ' onload='GetHeight(this.id,this.name)' frameborder='no' style='border: 0px gray dotted;' width=100% src ='" + url + "'></iframe>");
	}

// ]]>
</script>
</head>
<body style="margin:0;">
<div id="tabC" style="margin:0px;">
  <ul>   
    <li><a href="#tabC1"><span>tabC1</span></a></li>
    <li><a href="#tabC2"><span>tabC2</span></a></li>
<!--
    <li><a href="#tabC2" onclick="spreadsheet();return false;" ><span>Spread&nbsp;Sheet</span></a></li>
-->
    <li><a href="#tabC3"><span>tabC3</span></a></li>
<li><a href="#tabC4"><span>tabC4</span></a></li>

  </ul>   
  <div id="tabC1" style="margin:0.5;">
	<!--	<h3 style="border-bottom:1px solid gray">source : <?php echo basename($filepath);?></h3> -->
		<?php //echo iframe_output(str_replace('.java','.html',$filepath)); ?>
		<?php echo iframe_output($filepath); ?>
		<?php //echo applet_output($filepath,800,600); ?>
		</div>
  <div id="tabC2">
		<div id="target_tabC2" style="margin:0.5em;">
		<?php echo geshi_output($filepath);?>
		</div>	
  </div> 
  <div id="tabC3">
  tab3
  </div>   
  <div id="tabC4">
	<?php //include('links.html');?>
  </div>
</div>


	<div style ="color: #f00;	font-weight: bold; margin: 0; padding-top: .5em; padding-bottom: .17em; border-bottom: 1px solid #aaa;font-size: 150%;">Memo</div>
<?php
		//if($this->memofile != '')
		//{
			//if(!$this->startsWith($this->memofile, 'http://')) $memofile = $baseurl.'/'.$this->memofile;
			//else $memofile = $this->memofile;
			$memofile = dirname($filepath).'/memo.inc.php';
			if($memo = @file_get_contents($memofile)) echo $memo;
		//}
?>

  <p>
		<div style ="color: #f00;	font-weight: bold; margin: 0; padding-top: .5em; padding-bottom: .17em; border-bottom: 1px solid #aaa;font-size: 150%;"  ><a name="#Link">Links</a></div>
	<ul>
	<li><a href="https://www.google.co.jp/" target="_blank">google</a></li>
	<li><a href="http://www.adobe.com/devnet-archive/flex/tourdeflex/web/#" target="_blank">Tour de Flex</a></li>
	<li><a href="http://help.adobe.com/ja_JP/FlashPlatform/reference/actionscript/3/index.html" target="_blank">Adobe ActionScriptR 3（AS3 ）API リファレンス</a></li>
	<li><a href="http://flex.apache.org/" target="_blank">Apache Flex</a></li>
	<li><a href="/Flash/Flash_links.html" target="_blank">Flash Web links</a></li>
  </ul>

	<hr />
   <b>user_agent:  </b><br/>
	<?php 
		$Agent = getenv( "HTTP_USER_AGENT" );
		echo $Agent.'<br />';
	?>
  <b>fileurl:  </b><br/>
  <span id="fileurl"><?php echo $filepath; ?></span>
<hr>
 <div style="text-align:right; margin-right:1em;">
	<SCRIPT language="JavaScript"><!---
		document.write("Last update: ",document.lastModified)
		parent.TargetFilePath = parent.EditFilePath = document.getElementById("fileurl").innerHTML; 
	//--></SCRIPT>
  </div>
</div>  
  <p align="center"></p>
</body>
</html>
