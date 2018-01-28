// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: m114.java 
 * created : Time-stamp: <09/07/03(金) 14:44:03 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/m114.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m114.java >>
//
//　メール（１）：プロパティ(ユーザプロパティ、設定と取得)
//
//　　ユーザプロパティの設定と取得。
//
//　●java.util.Propertiesクラス
//  　Propertiesクラスは、プロパティのセットを表す。
//　　プロパティのセット中のプロパティ名とその値は、文字列である。 
//    public class Properties extends Hashtable<Object,Object>
//
//　●java.util.Hashtable<K,V>クラス
//　　このクラスは、ハッシュテーブルを実装する。キーと値の組をもつ。
//
//　●java.util.Hashtable<K,V>クラスのメソッド
//    public V get(Object key)
//　　　機能：キーkeyに対応づけられている値を取得する。 
//    public V put(K key,V value)
//      機能：ハッシュテーブルにおいて、キーkeyを、値valueに対応づける。
//            戻り値は、ハッシュテーブルの指定されたキーの前の値。
//　　　　　  それがない場合は null。 
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Properties;

class m114 {
  public static void main(String args[]) {

    // プロパティのセットを取得する。
    Properties prop = new Properties();

    // プロパティ(p1)を設定する。
    String t1 = (String)prop.put("p1","taro");
    System.out.println("設定時：p1 = " + t1);

    // プロパティ(p1)を取得する。
    String t2 = (String)prop.get("p1");
    System.out.println("取得時：p1 = " + t2);

    // プロパティ(p2)を設定する。
    String t3 = (String)prop.put("p2","一郎");
    System.out.println("設定時：p2 = " + t3);

    // プロパティ(p2)を取得する。
    String t4 = (String)prop.get("p2");
    System.out.println("取得時：p2 = " + t4);

    // プロパティの一覧を標準出力に出力する。
    prop.list(System.out);
  }
} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m114.java
c:\> java m114    
設定時：p1 = null
取得時：p1 = taro
設定時：p2 = null
取得時：p2 = 一郎
-- listing properties --
p2=一郎
p1=taro
</pre>

</body>
</html>
*/
