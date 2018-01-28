// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j333.java 
 * created : Time-stamp: <09/06/30(火) 20:09:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j333.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j333.java >>
//
//  アプレット（３）：リモートホストやローカルホストのアプレットを使う
//  
//　　他のサーバ(リモートホスト)や他のディレクトリ(ローカルホスト)のアプレット
//　　を使うことができる。
//
//  ●codebase属性
//    codebaseに、アプレットのクラスファイルがあるディレクトリのＵＲＬを書く。
//　　省略されると、HTMLファイルと同じディレクトリと見なされる。
//
//　・リモートホスト（アナログ時計）
//
//    <applet codebase="http://java.sun.com/applets/jdk/1.4/demo/applets/Clock/"
//            code="Clock.class"
//            width=300
//            height=200>
//    </applet>
//
//　・ローカルホスト（アナログ時計）
//
//    <applet codebase="file://d:/jdk1.5.0_06/demo/applets/Clock/"
//            code="Clock.class"
//            width=300
//            height=200>
//    </applet>
//
////////////////////////////////////////////////////////////////////////////////
/*
</pre>

<font size=5 color=blue>ＨＴＭＬファイル</font><br>

<pre>
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>

<applet codebase="http://java.sun.com/applets/jdk/1.4/demo/applets/Clock/"
          code="Clock.class" width=300 height=200>
</applet>

<applet codebase="file://c:jdk1.5.0_06/demo/applets/Clock/"
          code="Clock.class" width=300 height=200>
</applet>

<body>
<html>
</pre>

<font size=5 color=blue>実行結果</font><br>

<applet codebase="http://java.sun.com/applets/jdk/1.4/demo/applets/Clock/"
          code="Clock.class" width=300 height=200>
</applet>
<applet codebase="file://c:\jdk1.5.0_06\demo\applets\Clock"
        code="Clock.class" width=300 height=200>
</applet>

</body>
</html>
*/
