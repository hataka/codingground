<?php // -*- mode: php -*-  Time-stamp: <2010-08-24 4:26:53 kahata>
/**
 * <pre>
 *================================================================
 * title: flex3sdk mxmlプログラム
 * file: SimpleAlert.php
 * path: F:\Flash\flex3.4\mxml\TourDeFlex\SimpleAlertSimpleAlert\pgp
 * url:  http://hata2/Flash/ApacheFlex/mx/controls/Alert//SimpleAlert.php
 * created: Time-stamp: <2010-09-21 15:35:01 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:F:\Flash\flex3.4\flex_sdk_3.4.0.9271_mpl\bin\mxmlc.exe SimpleAlert.mxml
 * To run: 
 * link: 
 * description: Flex3, ActionScript プログラム
 *================================================================*
 * </pre>
 * @package    Flex3.4
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
	$filename = basename(__FILE__);
	$filebody = filebody(__FILE__);
	$fileext  = fileext(__FILE__);

 //-----------設定 -------------
	$source = isset($_GET['file']) ? $_GET['file'] : 'SimpleAlert.mxml';
	$base = dirname($localurl).'/';
//  $width='640px';$height='480px';
//  $width='100%';$height='100%';
  $width='100%';$height='360px';
  $bgcolor = '#94AAB5';
  $object_style='background-color:#94AAB5;border:1px solid gray';  // Flex3 original bgcolor
  $embed_style ='background-color:#94AAB5;border:1px solid gray'; 
	$as  = filebody($source) . '.as';
	$swf = filebody($source) . '.swf' ;
	$mxml = filebody($source) . '.mxml' ;
//------------------------------
?>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <META http-equiv="content-type" content="text/html; charset=Shift_JIS">
  <META http-equiv="Content-Style-Type" content="text/css">
  <title><?php echo $source;?> Test</title>
  <link rel="stylesheet" href="/FrameWork/scripts/layout.css" type="text/css" media="all">
  <link rel="stylesheet" href="main.css" type="text/css" media="all">
  <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
  <script><!--
  	$(document).ready(function(){
  	});
  //--></script>
  <style><!--
  --></style>
</head>
<body>
<center>
<h1><?php echo filebody($source);?> Test</h1>
	<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
			id="<?php echo $source; ?>" width="<?php echo $width;?>" height="<?php echo $height;?>"
			codebase="http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab"
			style="<?php echo $object_style; ?>">
      <param name="movie" value="<?php echo $swf; ?>" />
			<param name="quality" value="high" />
		  <param name="bgcolor" value="<?php echo $bgcolor;?>" />
 			<param name="allowScriptAccess" value="sameDomain" />
		<embed src="<?php echo $swf;?>" 
			id ="<?php echo $source;?>_embed"
			play="false"
			loop="false"
			quality="high"
			bgcolor="<?php echo $bgcolor;?>"
			style="<?php echo $embed_style; ?>"
			width="<?php echo $width;?>" height="<?php echo $height;?>">
		</embed>
	</object>
<br>
</center>
<hr>
<?php
    echo '<h3>' . $source . '</h3>';
    echo mb_convert_encoding(geshi_dsp($base.$source ,fileext($source),'number,onlyinclude'),'Shift_JIS','auto');
?>
  <hr /><br>
  <h2 style="clear:both;width=100% ">リンク</h2>
  <ul>
<li><a href="menu(site).php" target="SideView">menu(site)</a></li>
<li><a href="http://livedocs.adobe.com/flex/3_jp/langref/index.html" target="_blank">AdobeR Flex! 3.2 リファレンスガイド</a></li>
<li><a href="http://www.adobe.com/jp/products/flex/" target="_blank">Adobe - Flex 3</a></li>


<!--
<li><a href="http://www.adobe.com/jp/products/flex/" target="_blank">Adobe - Flex 3</a></li>
<li><a href="index_All.html" target="SideView">index_All.html</a></li>
<li><a href="menu(catch).php" target="SideView">menu(catch)</a></li>
-->
<li><a href="http://wisdom.sakura.ne.jp/" target="MainPanel">top</a></li>
<li><a href="<?php echo dirname($filepath).'/folder.lnk';?>" target="MainPanel">folder</a></li>
  </ul>
  <hr>
  <h2><a name="#Memo">メモ</a></h2>
  <div id="fileurl"><?php echo $base.$source; ?></div>
  <hr>
  <div style="text-align:right; margin-right:1em;">
	<SCRIPT language="JavaScript"><!---
		document.write("Last update: ",document.lastModified)
	//--></SCRIPT>
  </div>
  <p align="center"></p>
</body>
</html>
