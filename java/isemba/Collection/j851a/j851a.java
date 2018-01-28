// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j851a.java 
 * created : Time-stamp: <09/07/02(木) 17:07:54 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851a.java >>
//
//  データ構造（５）：マップ（HashMapクラス　J2SE1.4までの機能）
//
//　●java.util.HashMapクラス
//  　・public class HashMap extends AbstractMap
//                           implements Map, Cloneable, Serializable
//　　・HashMapクラスは、ハッシュを使ってマップを実現する。
//　　・長所：要素数によらず、追加・削除・検索が高速に行われる。
//
//　○HashMapクラスのコンストラクタ
//　　public HashMap()
//　　　機能：空のマップを作成する。
//
//　○HashMapクラスのメソッド
//　　public boolean containsKey(Object obj)
//　　　機能：キーobjが存在するかどうか調べる。
//　　public boolean containsValue(Object obj)
//　　　機能：値objが存在するかどうか調べる。
//　　public Object get(Object obj)
//　　　機能：キーobjに対する値を返す。
//　　public Object put(Object k, Object v)
//　　　機能：キーkと値vの組を追加する。
//　　public Object remove(Object k)
//　　　機能：キーkとその値を削除する。
//　　public int size()
//　　　機能：キーと値の組数を返す。
//　　public Set keySet()
//      機能：キーのセットを取得する。
//　　public Collection values()
//      機能：値のセットを取得する。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j851a {

  public static void main(String args[]) {

    // 空のマップを作成。
    HashMap<String, String> hm = new HashMap<String, String>();

    // キーと値の組を追加。
    System.out.println("追加前(HashMap hm)：" + hm);
    hm.put("A","Airplane");
    hm.put("B","Book"); hm.put("B","Bird");
    hm.put("C","Car");
    hm.put("D","Door");
    hm.put("E","Earth"); 
    System.out.println("追加後(HashMap hm)：" + hm);
    System.out.println();

    // マップの組数。 
    System.out.println("組数・確認前(HashMap hm)：" + hm);
    System.out.println("hm.size()：" + hm.size()); 
    System.out.println("組数・確認後(HashMap hm)：" + hm);
    System.out.println();

    // キーに対応する値。
    System.out.println("確認前(HashMap hm)：" + hm);
    String a = (String)hm.get("A"); 
    System.out.println("(String)hm.get(\"A\")：" + (String)hm.get("A"));
    System.out.println("確認後(HashMap hm)：" + hm);
    System.out.println();

    // キーの削除。
    System.out.println("キーの削除前(HashMap hm)：" + hm);
    System.out.print("hm.remove(\"A\")：" + hm.remove("A")+"　");
    System.out.println("hm.size()：" + hm.size()); 
    System.out.println("キーの削除後(HashMap hm)：" + hm);
    System.out.println();
 
    // キーの集合。
    System.out.println("確認前(HashMap hm)：" + hm);
    System.out.println("hm.keySet()：" + hm.keySet()); 
    System.out.println("確認後(HashMap hm)：" + hm);
    System.out.println();

    // 値の集合。
    System.out.println("確認前(HashMap hm)：" + hm);
    System.out.println("hm.values()：" + hm.values()); 
    System.out.println("確認後(HashMap hm)：" + hm);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j851a.java
注:j851a.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j851a
追加前(HashMap hm)：{}
追加後(HashMap hm)：{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}

組数・確認前(HashMap hm)：{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}
hm.size()：5
組数・確認後(HashMap hm)：{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}

確認前(HashMap hm)：{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}
(String)hm.get("A")：Airplane
確認後(HashMap hm)：{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}

キーの削除前(HashMap hm)：{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}
hm.remove("A")：Airplane　hm.size()：4
キーの削除後(HashMap hm)：{D=Door, C=Car, B=Bird, E=Earth}

確認前(HashMap hm)：{D=Door, C=Car, B=Bird, E=Earth}
hm.keySet()：[D, C, B, E]
確認後(HashMap hm)：{D=Door, C=Car, B=Bird, E=Earth}

確認前(HashMap hm)：{D=Door, C=Car, B=Bird, E=Earth}
hm.values()：[Door, Car, Bird, Earth]
確認後(HashMap hm)：{D=Door, C=Car, B=Bird, E=Earth}
</pre>

</body>
</html>
*/
