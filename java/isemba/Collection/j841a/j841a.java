// -*- mode: java -*- Time-stamp: <2009-06-19 15:03:57 kahata>
/*====================================================================
 * name: j841a.java 
 * created : Time-stamp: <09/06/19(金) 15:01:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j841a.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j841a.java >>
//
//  データ構造（４）：集合（TreeSetクラス　J2SE1.4までの機能）
//　
//　●java.util.TreeSetクラス
//    ・public class TreeSet extends AbstractSet
//                           implements SortedSet, Cloneable, Serializable
//　　・TreeSetクラスでは、集合をツリー構造を使って実現する。
//    ・次のようなメソッドが実行できる。
//　　　　追加メソッド：add
//　　　　取得メソッド：first, last
//　　　　削除メソッド：remove　　　　
//    ・長所：追加、取得、削除の操作が、要素数nの下でlog(n)のオーダーで行われる。
//　　　　　　要素は決められた順序に並んでいる。
//
//　○TreeSetクラスのコンストラクタ
//　　public TreeSet()
//　　　機能：空の集合を作成する。
//
//　○TreeSetクラスのメソッド
//　　public boolean add(Object obj)
//　　　機能：要素objを木に追加する。
//　　public void clear()
//　　　機能：木を空にする。
//　　public boolean contains(Object obj)
//　　　機能：木に要素objが存在するかどうか調べる。
//　　public boolean remove(Object obj)
//　　　機能：木から要素objを削除。
//　　public int size()
//　　　機能：木の要素数を返す。
//
//    public Object first()
//      機能：木から最小要素を取り出す。
//    public Object last()
//      機能：木から最大要素を取り出す。
//　　public SortedSet headSet(Object obj)
//      機能：要素objよりも小さい要素の集合を返す。
//　　public SortedSet tailSet(Object obj)
//      機能：要素obj以上の要素の集合を返す。
//　　public SortedSet subSet(Object obj1, Object obj2)
//      機能：要素obj1以上、要素obj2未満の要素の集合を返す。
//
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j841a {

  public static void main(String args[]) {

    // 空の集合を作成。
    TreeSet<String> ts = new TreeSet<String>();

    // 要素の追加。
    System.out.println("追加前(TreeSet ts)：" + ts);
    ts.add("A"); 
    ts.add("B"); ts.add("B"); // 要素が重複した場合、ひとつだけ登録される。
    ts.add("C");
    ts.add("D"); 
    ts.add("E");
    ts.add("F");
    System.out.println("追加後(TreeSet ts)：" + ts);
    System.out.println();

    // 集合のサイズを表示。
    System.out.println("確認前(TreeSet ts)：" + ts);
    System.out.println("ts.size()：" + ts.size());
    System.out.println("確認後(TreeSet ts)：" + ts);
    System.out.println();

    // 最小の要素、最大の要素を表示。
    System.out.println("確認前(TreeSet ts)：" + ts);
    System.out.println("ts.first()：" + ts.first());
    System.out.println("ts.last()：" + ts.last());
    System.out.println("確認後(TreeSet ts)：" + ts);
    System.out.println();

    // 木から要素Aを削除。
    System.out.println("削除前(TreeSet ts)：" + ts);
    System.out.println("ts.remove(\"A\")：" + ts.remove("A"));
    System.out.println("削除後(TreeSet ts)：" + ts);
    System.out.println();

    //要素Eよりも小さい要素の集合を返す。
    System.out.println("確認前(TreeSet ts)：" + ts);
    TreeSet w1 = (TreeSet)ts.headSet("E");
    System.out.println("(TreeSet)ts.headSet(\"E\")：" + w1); 
    System.out.println("確認後(TreeSet ts)：" + ts);
    System.out.println();

    //要素E以上の要素の集合を返す。
    System.out.println("確認前(TreeSet ts)：" + ts);
    TreeSet w2 = (TreeSet)ts.tailSet("E");
    System.out.println("(TreeSet)ts.tailSet(\"E\")：" + w2); 
    System.out.println("確認後(TreeSet ts)：" + ts);
    System.out.println();

    //要素B以上、要素E未満の要素の集合を返す。
    System.out.println("確認前(TreeSet ts)：" + ts);
    TreeSet w3 = (TreeSet)ts.subSet("B","E");
    System.out.println("(TreeSet)ts.subSet(\"B\",\"E\")：" + w3); 
    System.out.println("確認後(TreeSet ts)：" + ts);
  }
}
/*
% javac j841a.java
注:j841a.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j841a
追加前(TreeSet ts)：[]
追加後(TreeSet ts)：[A, B, C, D, E, F]

確認前(TreeSet ts)：[A, B, C, D, E, F]
ts.size()：6
確認後(TreeSet ts)：[A, B, C, D, E, F]

確認前(TreeSet ts)：[A, B, C, D, E, F]
ts.first()：A
ts.last()：F
確認後(TreeSet ts)：[A, B, C, D, E, F]

削除前(TreeSet ts)：[A, B, C, D, E, F]
ts.remove("A")：true
削除後(TreeSet ts)：[B, C, D, E, F]

確認前(TreeSet ts)：[B, C, D, E, F]
(TreeSet)ts.headSet("E")：[B, C, D]
確認後(TreeSet ts)：[B, C, D, E, F]

確認前(TreeSet ts)：[B, C, D, E, F]
(TreeSet)ts.tailSet("E")：[E, F]
確認後(TreeSet ts)：[B, C, D, E, F]

確認前(TreeSet ts)：[B, C, D, E, F]
(TreeSet)ts.subSet("B","E")：[B, C, D]
確認後(TreeSet ts)：[B, C, D, E, F]
*/
