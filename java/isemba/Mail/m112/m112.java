// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: m112.java 
 * created : Time-stamp: <09/07/02(木) 21:40:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/m112.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m112.java >>
//
//　メール（１）：プロパティ(システムプロパティ、一覧)
//
//　　システムプロパティの一覧。
//
//　●java.lang.Systemクラスのメソッド
//　　public static Properties getProperties()
//    　機能:システムプロパティを決定し、システムプロパティのセットを返す。
//           システムプロパティのセットには、プロパティ名とその値が含まれる。
//
//　●java.util.Propertiesクラス
//  　Propertiesクラスは、プロパティのセットを表す。
//　　プロパティのセット中のプロパティ名とその値は、文字列である。 
//
//　●java.util.Propertiesクラスのメソッド
//　　public void list(PrintStream out)
//    　機能:出力ストリームoutにプロパティリストを出力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Properties;

class m112 {
  public static void main(String args[]) {

    // システムプロパティのセットを取得する。
    Properties prop = System.getProperties();

    // システムプロパティの一覧を標準出力に出力する。
    prop.list(System.out);
  }
} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m112.java
c:\> java m112
-- listing properties --
java.runtime.name=Java(TM) 2 Runtime Environment, Stand...
sun.boot.library.path=C:\Program Files\Java\jre1.5.0_04\bin
user.country=JP
java.runtime.version=1.5.0_04-b05
os.arch=x86
os.name=Windows XP
os.version=5.1
user.name=一郎
java.class.path=c:\jakarta-tomcat-4.1.31\common\lib\s...
java.home=C:\Program Files\Java\jre1.5.0_04
user.language=ja
java.version=1.5.0_04
＜＜途中いくつか省略＞＞
</pre>

</body>
</html>
*/
