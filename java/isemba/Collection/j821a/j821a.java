// -*- mode: java -*- Time-stamp: <2009-06-18 17:53:01 kahata>
/*====================================================================
 * name: j821a.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j821a.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j821a.java >>
//
//  データ構造（２）：リスト（LinkedListクラス　J2SE1.4までの機能）
//
//　●java.util.LinkedListクラス
//    ・public class LinkedList extends AbstractSequentialList
//                              implements List, Cloneable, Serializable
//　　・ArrayListクラスと同様に、実行時にサイズを変更できる。
//　　　連結リストで実現されている。
//    ・次のようなメソッドが実行できる。
//　　　　追加メソッド：add, addFirst, addLast
//　　　　取得メソッド：get, getFirst, getLast
//　　　　削除メソッド：remove, removeFirst, removeLast
//　　　　設定メソッド：set
//　　・長所：要素の追加・削除が高速に処理できる。
//　　　短所：インデックスを使ったランダムアクセスには時間がかかる。
//
//　○LinkedListクラスのコンストラクタ
//　　public LinkedList()
//      機能：空のLinkedListを生成する。
//
//　○LinkedListクラスのメソッド
//　　public boolean add(Object obj)
//　　　機能：要素objをこのリストの末尾に追加。戻り値はtrue。
//　　public void add(int i, Object obj)
//　　　機能：このリストの位置iに要素objを挿入する。
//　　public void addFirst(Object obj)
//　　　機能：要素objをこのリストの先頭に追加。
//　　public void addLast(Object obj)
//　　　機能：要素objをこのリストの末尾に追加。
//
//　　public Object get(int i)
//　　　機能：このリストの位置iの要素を取り出す。
//　　public Object getFirst()
//　　　機能：このリストの先頭要素を取り出す。
//　　public Object getLast()
//　　　機能：このリストの末尾要素を取り出す。
//
//　　public Object remove(int i)
//　　　機能：このリストの位置iの要素を削除。後続の要素は左に移動する。
//　　　　　　戻り値は、リストから削除された要素。 
//　　public Object remove(Object obj)
//　　　機能：このリスト内で最初に現れる要素objを削除。
//　　　　　　リストに、指定された要素が格納されている場合は、戻り値はtrue。
//　　public Object removeFirst()
//　　　機能：このリストの先頭要素を削除。
//　　public Object removeLast()
//　　　機能：このリストの末尾要素を削除。
//
//　　public Object set(int i, Object obj)
//　　　機能：位置iの要素を要素objに置き換える。
//
//　　public boolean contains(Object obj)
//　　　機能：このリストに要素objが存在するかどうか調べる。
//　　　　　　リストが、指定された要素を保持している場合、戻り値はtrue。
//　　public int size()
//　　　機能：このリストの要素数を返す。
//
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j821a {

  public static void main(String args[]) {

    // 空のリストを作成。
    LinkedList<String> a = new LinkedList<String>();

    // 要素を追加。
    System.out.println("追加前(LinkedList a)：" + a);
    a.add("aaa");
    a.add("bbb");
    a.add("ccc");
    System.out.println("追加後(LinkedList a)：" + a);
    System.out.println();

    // 要素数の表示。
    System.out.println("要素数・前(LinkedList a)：" + a);
    System.out.println("a.size()："+a.size());
    System.out.println("要素数・後(LinkedList a)：" + a);
    System.out.println();

    // 連結リストの末尾に要素を追加。
    System.out.println("追加前(LinkedList a)：" + a);
    a.addLast("ddd");
    System.out.println("a.addLast(\"ddd\")　");
    System.out.println("a.size()："+a.size());
    System.out.println("追加後(LinkedList a)：" + a);
    System.out.println();

    // 連結リストから要素を削除。
    System.out.println("削除前(LinkedList a)：" + a);
    a.remove("bbb");
    System.out.println("a.remove(\"bbb\")　");
    System.out.println("a.size()："+a.size());
    System.out.println("削除後(LinkedList a)：" + a);
    System.out.println();

    // 要素の置換。
    System.out.println("置換前(LinkedList a)：" + a);
    a.set(1,"eee");
    System.out.println("a.set(1,\"eee\")　");
    System.out.println("置換後(LinkedList a)：" + a);
    System.out.println();

    // 要素の存在。
    System.out.println("要素の存在確認前(LinkedList a)：" + a);
    System.out.println("a.contains(\"aaa\")　" + a.contains("aaa"));
    System.out.println("a.contains(\"fff\")　" + a.contains("fff"));
    System.out.println("要素の存在確認後(LinkedList a)：" + a);
  }
}
/*
実行結果
% javac j821a.java
注: j821a.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j821a
追加前(LinkedList a)：[]
追加後(LinkedList a)：[aaa, bbb, ccc]

要素数・表示前(LinkedList a)：[aaa, bbb, ccc]
a.size()：3
要素数・表示後(LinkedList a)：[aaa, bbb, ccc]

追加前(LinkedList a)：[aaa, bbb, ccc]
a.addLast("ddd")　
a.size()：4
追加後(LinkedList a)：[aaa, bbb, ccc, ddd]

削除前(LinkedList a)：[aaa, bbb, ccc, ddd]
a.remove("bbb")　
a.size()：3
削除後(LinkedList a)：[aaa, ccc, ddd]

置換前(LinkedList a)：[aaa, ccc, ddd]
a.set(1,"eee")　
置換後(LinkedList a)：[aaa, eee, ddd]

要素の存在確認前(LinkedList a)：[aaa, eee, ddd]
a.contains("aaa")　true
a.contains("fff")　false
要素の存在確認後(LinkedList a)：[aaa, eee, ddd]
*/
