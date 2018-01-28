// -*- mode: java -*- Time-stamp: <2009-07-03 14:41:22 kahata>
/*====================================================================
 * name: m111.java 
 * created : Time-stamp: <09/07/03(金) 14:40:32 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/MAIL/m111.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m111.java >>
//
//　メール（１）：プロパティ(システムプロパティ、設定と取得)
//
//　　システムプロパティの設定と取得。
//
//　●プロパティ
//　　・プロパティは、環境変数やシェル変数のようにシステムやアプリケーションの
//　　　情報を保存する仕組みである。
//    ・プロパティは、プロパティ名とプロパティ値から構成される。
//　　・システムプロパティ(システムに関する情報）とユーザプロパティがある。
//
//    　システムプロパティの例
//　　　　　プロパティ名　　　説明
//          ----------------------------------------
//　　　　　java.version      Javaのバージョン
//          java.home         JREのインストール先
//          os.version        OSのバージョン
//          os.name           OS名
//          user.name         ユーザ名
//          ----------------------------------------
//
//　●java.lang.Systemクラスのメソッド
//    public static String getProperty(String s)
//      機能：プロパティ名sによって示されるシステムプロパティ値を取得する。 
//            見つからない場合は、null が返される。
//    public static String setProperty(String s1, String s2)
//　　　機能：システムプロパティ名s1と、その値s2を設定する。
//            戻り値は、システムプロパティの以前の値、ない場合は、null。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Properties;

class m111 {
  public static void main(String args[]) {

    // システムプロパティ(user.name)を取得する。
    String t1 = System.getProperty("user.name");
    System.out.println("変更前：user.name = " + t1);

    // システムプロパティ(user.name)を変更する。
    String t2 = System.setProperty("user.name","taro");
    System.out.println("変更時：user.name = " + t2);

    // システムプロパティ(user.name)を取得する。
    String t3 = System.getProperty("user.name");
    System.out.println("変更後：user.name = " + t3);

  }
} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m111.java
c:\> java m111
変更前：user.name = 一郎
変更時：user.name = 一郎
変更後：user.name = taro

c:\> java m111
変更前：user.name = 一郎
変更時：user.name = 一郎
変更後：user.name = taro

この結果、システムプロパティの変更が有効なのはプログラム内のみで、
再起動された場合、初期設定に戻ることがわかる。
</pre>

</body>
</html>
*/
