// -*- mode: java -*- Time-stamp: <2009-07-03 14:43:35 kahata>
/*====================================================================
 * name: m113.java 
 * created : Time-stamp: <09/07/03(金) 14:43:03 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/MAIL/m113.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m113.java >>
//
//　メール（１）：プロパティ(システムプロパティ、設定と取得)
//
//　　システムプロパティの設定と取得。
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

class m113 {
  public static void main(String args[]) {

    // システムプロパティのセットを取得する。
    Properties prop = System.getProperties();

    // システムプロパティ(user.name)を取得する。
    String t1 = (String)prop.get("user.name");
    System.out.println("変更前：user.name = " + t1);

    // システムプロパティ(user.name)を変更する。
    String t2 = (String)prop.put("user.name","taro");
    System.out.println("変更時：user.name = " + t2);

    // システムプロパティ(user.name)を取得する。
    String t3 = (String)prop.get("user.name");
    System.out.println("変更後：user.name = " + t3);

  }
} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m113.java
c:\> java m113
変更前：user.name = 一郎
変更時：user.name = 一郎
変更後：user.name = taro

c:\> java m113
変更前：user.name = 一郎
変更時：user.name = 一郎
変更後：user.name = taro

この結果、システムプロパティの変更が有効なのはプログラム内のみで、
再起動された場合、初期設定に戻ることがわかる。
</pre>

</body>
</html>
*/
