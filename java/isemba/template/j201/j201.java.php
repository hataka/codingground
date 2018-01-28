<?php // -*- mode: php -*-  Time-stamp: <08/07/22(火) 20:26:43 hata>
/**
 * <pre>
===================================================================================
 * プログラム: Java JAppletプログラミング
 * 作成日: Time-stamp: <08/07/20(日) 12:06:57 hata>
 * @run: http://localhost/java/isemba/Class/j201/j201.java.php
 * @link http://localhost/java/isemba/Class/j201/j201.java
 * @link http://localhost:8080/manager/html/
 * @realpath F:\java\isemba\Class\j201\j201.java
 * 説明: 
-----------------------------------------------------------------------------------
  j201
===================================================================================
 * </pre>
 * @package    PocketPHP
 * @subpackage VariableFunction
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2008 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
 */

   require_once($_SERVER['DOCUMENT_ROOT'] . '/php1/geshi/geshi_dsp.inc.php'); 
   require_once($_SERVER['DOCUMENT_ROOT'] . '/php1/lib/file_util.inc.php');

   $title       = 'j201.java';
   $description = 'j201';

//   $applet_width = 300; $applet_height =200; $applet_margin = 0;
//   $param  = ''; $jarfile = '';

   $filename    = 'j201.java';
   $filebody    = 'j201';
   $fileext     = 'java';

   $server_documentroot = $_SERVER['DOCUMENT_ROOT'];
   $http_serverroot     = 'http://' . $_SERVER['HTTP_HOST'];

   $php_self_filepath  = $http_serverroot . $_SERVER['PHP_SELF'];
   $php_self_realpath  =  realpath(__FILE__);

   $http_filedir  = dirname($php_self_filepath) . '/';
   $http_filepath = $http_filedir . $filename;
   $filerealdir  =  str_replace('\\', '/', dirname($php_self_realpath)) . '/';
   $filerealpath = $filerealdir . $filename;

//   $realpath  = 'F:\java\JApplet\isenba\ja155a\ja155a.java';
   $realpath  = $filerealpath;
//   $localdir  = 'http://localhost/java/JApplet/isenba/ja155a/';
   $localdir  = $http_filedir;
//   $localpath = 'http://localhost/java/JApplet/isenba/ja155a/ja155a.java';
   $localpath = $http_filepath;

   $s_F = $s_S = $s_A ='';
   $abstract    =<<< EOB
<!---------------- Astracts ---------------
<pre style="margin-left:50px; margin-right:50px">
 <b>$s_F strtr</b> - 特定の文字を変換する
       $s_S <b> strtr</b> ( $s_S <i>str</i> , $s_S <i>from</i> , $s_S <i>to</i> )
       $s_S <b> strtr</b> ( $s_S <i>str</i> , $s_A <i>replace_pairs</i> )
</pre>

<blockquote><pre style="line-height:1.2em;">
この関数は str を走査し、 from に含まれる文字が見つかると、そのすべてを to の中で
対応する文字に置き換え、 その結果を返します。 
from と to の長さが異なる場合、長い方の余分な文字は無視されます。
</pre></blockquote>
<hr />
---------------- Astracts --------------->
EOB;
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
    "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" >
<head>
<meta http-equiv="content-type" content="application/xhtml+xml; charset=Shift_JIS" />
<title><?php echo $title; ?></title>
<meta http-equiv="content-style-type" content="text/css" />
<link rel="stylesheet" href="<?php echo $http_serverroot .'/java/style.css'; ?>">
</head>

<body>
<center><h1> <?php echo $title; ?></h1></center>

<?php if ($description) { ?>
<h1 style=" padding-left:0.5em; color:white;background-color:#525D76;font-size:22px;">
<?php echo $description; ?>
</h1>
<?php } ?>

<!---------------- Astracts --------------->
<?php echo $abstract; ?>
<!---------------- Astracts --------------->

<!---------
<div style="margin-left:100px; margin-right:50px;">
----------->

<?php
	$output ='';
    $output .= '<a href="http://localhost/java/php_include/folder.lnk" target="_blank">[php_include/folder]</a> ';
    $output .= '<a href="http://localhost/php1/lib/folder.lnk" target="_blank">[php1/lib/folder]</a> ';
    $output .= '<a href="http://localhost/java/eclispe.lnk">[eclispeを起動する(eclispe.lnk)]</a> ';
    $output .= '<a href="' . $localdir . 'folder.lnk' . '" target="_blank">[フォルダを開く(folder)]</a>';
  echo $output;
?>	

<hr />
<div style="color: #000000; background-color: #e9e8e2; font-family: Monospaced" width="100%">
<?php echo $filename; ?>
</div>


<div style="font-size:12pt;margin-left:1em;margin-right:1em;">
<?php echo mb_convert_encoding(geshi_dsp($realpath,$fileext),'Shift_JIS','euc-JP,UTF-8'); ?>
</div>

<hr />

<pre style="padding:0.8em; background: #eee; color: black; border: 1px solid gray; margin-left:1em;margin-right:1em;">
<?php
	$classpath = $filerealdir;
    $ret = exec("java -classpath " . $classpath. ' ' .escapeshellarg($filebody),$lines);
    $output = join("\n",$lines);
    echo trim($output); 
?>
</pre>

<hr />

<!-----------------------------------------------------------------------------
<table class="head3" width="100%"><tr><td align="left">myTag.tld</td></tr></table>

<div class="java-block-code">
<?php
/**
$code = <<< EOB
	<tag>
		<name>ServletInfoSimple</name>
		<tag-class>to.msn.wings.chap4.Sts_DoTag</tag-class>
		<body-content>empty</body-content>
	</tag>
EOB;
	$geshi =new GeSHi($code, 'xml');
	echo $geshi->parse_code(); 
**/
?>
</div>
------------------------------------------------------------------------------->

<h4><a name="#Memo">メモ</a></h4>
<?php //include("/java/php_include/jsp-implicit-method.inc.php"); ?>
<br/>
<?php if(file_exists('./'. $filebody . '_memo.inc.php')) include('./'. $filebody . '_memo.inc.php'); ?>

<h4><a name="#Link">リンク</a></h4>
<?php include($_SERVER['DOCUMENT_ROOT'] . '/java/php_include/' . $fileext . '-document-link.inc.php'); ?>
<?php if(file_exists('./'. $filebody . '_links.inc.php')) include('./'. $filebody . '_links.inc.php'); ?>

<h4>KeyWord</h4>
<br/ >
<a href="http://java.sun.com/javase/ja/6/docs/ja/api/javax/swing/JApplet.html">
<span style="color: #0000ff; font-weight: bold;">
javax.swing.JApplet</span></a>(日本語)
<br /><br />
<?php if(file_exists('./'. $filebody . '_keywords.inc.php')) include('./'. $filebody . '_keywords.inc.php'); ?>

<hr />
<div style="text-align:right; margin-right:1em;">
  <SCRIPT language="JavaScript"><!---
    document.write("Last update: ",document.lastModified)
  //--></SCRIPT>
</div>
<p align="center">
</p>
</body>
</html>
