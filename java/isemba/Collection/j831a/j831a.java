// -*- mode: java -*- Time-stamp: <2009-06-18 17:53:01 kahata>
/*====================================================================
 * name: j831a.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j831a.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j831a.java >>
//
//  データ構造（３）：集合（HashSetクラス　J2SE1.4までの機能）
//
//　●java.util.HashSetクラス      
//    ・public class HashSet extends AbstractSet
//                           implements Set, Cloneable, Serializable
//　　・HashSetクラスは、ハッシュを使って集合を実現している。
//      要素は互いに異なり、重複しない。
//    　要素の追加・削除の操作は一定時間で行われる。
//    ・次のようなメソッドが実行できる。
//　　　　追加メソッド：add
//　　　　削除メソッド：remove
//　　・長所：要素数によらず、追加・削除・検索が高速に行われる。
//
//  ○HashSetクラスのコンストラクタ
//　　public HashSet()
//      機能：空のセットを作成する。
//
//　○HashSetクラスのメソッド
//　　public boolean add(Object obj)
//　　　機能：要素objを追加する。
//　　public void clear()
//　　　機能：集合からすべての要素を削除する。
//　　public boolean contains(Object obj)
//　　　機能：要素objが存在するかどうか調べる。要素を保持している場合true。
//　　public boolean remove(Object obj)
//　　　機能：要素objを削除する。指定された要素が集合内にあった場合、戻り値はtrue。
//　　public int size()
//　　　機能：集合に含まれている要素数を返す。
//
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j831a {

  public static void main(String args[]) {

    // 空の集合を作成。
    HashSet<String> hs = new HashSet<String>();

    // 要素の追加。
    System.out.println("追加前(HashSet hs)：" + hs);
    hs.add("A"); 
    hs.add("B"); hs.add("B");  // 要素が重複した場合、ひとつだけ登録される。
    hs.add("C");
    hs.add("D");
    hs.add("E");
    // 要素を表示。出力は追加された順とは無関係である。
    System.out.println("追加後(HashSet h)：" + hs);
    System.out.println();

    // 要素数。
    System.out.println("要素数・確認前(HashSet hs)：" + hs);
    System.out.println("hs.size()：" + hs.size());
    System.out.println("要素数・確認後(HashSet hs)：" + hs);
    System.out.println();

    // 要素の削除。
    System.out.println("削除前(HashSet hs)：" + hs);
    hs.remove("C");
    System.out.println("hs.remove(\"C\")　");
    System.out.println("hs.size()：" + hs.size());
    System.out.println("削除後(HashSet hs)：" + hs);
    System.out.println();

    // 要素の存在。
    System.out.println("要素の存在確認前(HashSet hs)：" + hs);
    System.out.println("hs.contains(\"A\")：" + hs.contains("A"));
    System.out.println("hs.contains(\"C\")：" + hs.contains("C"));
    System.out.println("要素の存在確認後(HashSet hs)：" + hs);
  }
}
/*
実行結果
% javac j831a.java
注: j831a.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j831a
追加前(HashSet hs)：[]
追加後(HashSet h)：[D, A, C, B, E]

要素数・確認前(HashSet hs)：[D, A, C, B, E]
hs.size()：5
要素数・確認後(HashSet hs)：[D, A, C, B, E]

削除前(HashSet hs)：[D, A, C, B, E]
hs.remove("C")　
hs.size()：4
削除後(HashSet hs)：[D, A, B, E]

要素の存在確認前(HashSet hs)：[D, A, B, E]
hs.contains("A")：true
hs.contains("C")：false
要素の存在確認後(HashSet hs)：[D, A, B, E]
*/
