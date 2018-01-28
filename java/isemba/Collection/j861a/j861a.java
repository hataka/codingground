// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861a.java 
 * created : Time-stamp: <09/07/02(木) 17:38:32 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861a.java >>
//
//  データ構造（６）：マップ（TreeMapクラス　J2SE1.4までの機能）
//
//　●java.util.TreeMapクラス
//    ・public class TreeMap extends AbstractMap
//                           implements SortedMap, Cloneable, Serializable
//　　・キーと値の組の集まりをマップという。
//　　　キーを使って、値を取得することができる。
//　　・TreeMapクラスは、木を使ってマップを実装する。
//　　・キーも値もオブジェクトである。
//    ・長所：追加、取得、削除の操作が、要素数nの下でlog(n)のオーダーで行われる。
//　　　　　　要素は決められた順序に並んでいる。
//
//　○TreeMapクラスのコンストラクタ
//　　public TreeMap()
//　　　機能：空のマップを生成する。
//
//　○TreeMapクラスのメソッド
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
//　　public SortedMap headMap(Object k)
//      機能：キーkよりも小さいマップを返す。
//　　public SortedMap tailMap(Object k)
//      機能：キーk以上のマップを返す。
//　　public SortedMap subMap(Object k1, Object k2)
//      機能：キーk1以上、キーk2以下のマップを返す。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j861a {

  public static void main(String args[]) {

    // 空のマップを生成。
    TreeMap<String,String> tm = new TreeMap<String,String>();

    // キーと値の組を追加。
    System.out.println("追加前(TreeMap tm)：" + tm);
    tm.put("A","Airplane");
    tm.put("B","Book"); tm.put("B","Bird"); // 最初のBookは上書きされる。
    tm.put("C","Car"); 
    tm.put("D","Door");
    tm.put("E","Door");
    System.out.println("追加後(TreeMap tm)：" + tm);
    System.out.println();

    // マップの組数。 
    System.out.println("組数・確認前(TreeMap tm)：" + tm);
    System.out.println("tm.size()：" + tm.size()); 
    System.out.println("組数・確認後(TreeMap tm)：" + tm);
    System.out.println();

    // キーに対応する値。
    System.out.println("確認前(TreeMap tm)：" + tm);
    String a = (String)tm.get("A"); 
    System.out.println("(String)tm.get(\"A\")：" + a);
    System.out.println("確認後(TreeMap tm)：" + tm);
    System.out.println();

    // キーの削除。
    System.out.println("キーの削除前(TreeMap tm)：" + tm);
    System.out.println("tm.remove(\"A\")：" + tm.remove("A"));
    System.out.println("キーの削除後(TreeMap tm)：" + tm);
    System.out.println();
 
    // キーの集合。
    System.out.println("キーの集合・確認前(TreeMap tm)：" + tm);
    System.out.println("tm.keySet()：" + tm.keySet()); 
    System.out.println("キーの集合・確認後(TreeMap tm)：" + tm);
    System.out.println();

    // 値の集合。
    System.out.println("値の集合・確認前(TreeMap tm)：" + tm);
    System.out.println("tm.values()：" + tm.values()); 
    System.out.println("値の集合・確認後(TreeMap tm)：" + tm);
    System.out.println();

    // キーDよりも小さいマップを返す。
    System.out.println("キーDよりも小さいマップを返す");
    System.out.println("確認前(TreeMap tm)：" + tm);
    System.out.println("tm.headMap(\"D\")：" + tm.headMap("D")); 
    System.out.println("確認後(TreeMap tm)：" + tm);
    System.out.println();

    // キーD以上のマップを返す。
    System.out.println("キーD以上のマップを返す");
    System.out.println("確認前(TreeMap tm)：" + tm);
    System.out.println("tm.tailMap(\"D\")：" + tm.tailMap("D")); 
    System.out.println("確認後(TreeMap tm)：" + tm);
    System.out.println();

    // キーB以上、キーD未満のマップを返す。
    System.out.println("キーB以上、キーD未満のマップを返す");
    System.out.println("確認前(TreeMap tm)：" + tm);
    System.out.println("tm.subMap(\"B\",\"D\")：" + tm.subMap("B","D")); 
    System.out.println("確認後(TreeMap tm)：" + tm);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j861a.java
注:j861a.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j861a
追加前(TreeMap tm)：{}
追加後(TreeMap tm)：{A=Airplane, B=Bird, C=Car, D=Door, E=Door}

組数・確認前(TreeMap tm)：{A=Airplane, B=Bird, C=Car, D=Door, E=Door}
tm.size()：5
組数・確認後(TreeMap tm)：{A=Airplane, B=Bird, C=Car, D=Door, E=Door}

確認前(TreeMap tm)：{A=Airplane, B=Bird, C=Car, D=Door, E=Door}
(String)tm.get("A")：Airplane
確認後(TreeMap tm)：{A=Airplane, B=Bird, C=Car, D=Door, E=Door}

キーの削除前(TreeMap tm)：{A=Airplane, B=Bird, C=Car, D=Door, E=Door}
tm.remove("A")：Airplane
キーの削除後(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}

キーの集合・確認前(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}
tm.keySet()：[B, C, D, E]
キーの集合・確認後(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}

値の集合・確認前(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}
tm.values()：[Bird, Car, Door, Door]
値の集合・確認後(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}

キーDよりも小さいマップを返す
確認前(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}
tm.headMap("D")：{B=Bird, C=Car}
確認後(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}

キーD以上のマップを返す
確認前(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}
tm.tailMap("D")：{D=Door, E=Door}
確認後(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}

キーB以上、キーD未満のマップを返す
確認前(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}
tm.subMap("B","D")：{B=Bird, C=Car}
確認後(TreeMap tm)：{B=Bird, C=Car, D=Door, E=Door}
</pre>

</body>
</html>
*/
