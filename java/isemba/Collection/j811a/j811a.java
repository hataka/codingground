// -*- mode: java -*- Time-stamp: <2009-06-18 11:13:07 kahata>
/*====================================================================
 * name: j612.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811a.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811a.java >>
//
//  データ構造（１）：リスト（ArrayListクラス J2SE1.4までの機能）
//
//　●java.util.ArrayListクラス
//    ・public class ArrayList extends AbstractList
//                       implements List, RandomAccess, Cloneable, Serializable
//　　・配列(実行前にあらかじめ記憶領域を確保し、実行中に確保した記憶領域は
//　　　変わらない)と異なり、実行時にそのサイズを変更できる。
//　　・このクラスに保存される要素は、単純なデータ型でなくオブジェクトである。
//      したがって、整数値を保存する場合、new Integer(9)のように、Integerクラス
//　　　のオブジェクトにする必要がある。
//　　　また、取り出すときは、対応するオブジェクトの型にキャストする必要がある。
//　　・次のようなメソッドが実行できる。
//　　　　取得メソッド：get
//　　　　設定メソッド：set
//　　　　追加メソッド：add
//　　　　削除メソッド：remove
//　　・長所：インデックスを使ったランダムアクセスが高速に行われる。
//　　　短所：要素の挿入・削除に時間がかかる。
//
//　○ArrayListクラスのコンストラクタ
//    public ArrayList()
//      機能：初期容量10のArrayListを作成する。
//
//　○ArrayListクラスのメソッド
//　　public void add(int i, Object obj)
//　　　機能：リストの位置iに要素objを挿入する。現在その位置にある要素と
//　　　　　　後続の要素は右に移動する。
//　　public boolean add(Object obj)
//　　　機能：要素objをこのリストの末尾に追加する。
//　　public boolean contains(Object obj)
//　　　機能：リストに要素objが存在するかどうか調べる。
//　　　　　　存在する場合true、存在しない場合false。
//　　public Object get(int i)
//　　　機能：リストの位置iの要素を取り出す。
//　　public int indexOf(Object obj)
//　　　機能：リストで要素objが最初に出現する位置を返す。
//　　public Object remove(int i)
//　　　機能：リストの位置iの要素を削除。後続の要素を左側に移動する。
//　　public Object set(int i, Object obj)
//      機能：位置iの要素を要素objで置き換える。
//　　public int size()
//　　　機能：リストの要素数を返す。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j811a {
	j811a(){}
	
  public static void main(String args[]) {

    // 空のリストを作成。
    ArrayList<String> a = new ArrayList<String>();

    // 要素の追加。
    System.out.println("追加前(ArrayList a)：" + a);
    a.add("aaa");
    a.add("ccc");
    a.add("bbb"); a.add("bbb");
    System.out.println("追加後(ArrayList a)：" + a);
    System.out.println();

    // 要素数の表示。
    System.out.println("要素数・表示前(ArrayList a)：" + a);
    System.out.println("a.size()："+a.size());
    System.out.println("要素数・表示後(ArrayList a)：" + a);
    System.out.println();

    // 要素の削除。
    System.out.println("削除前(ArrayList a)：" + a);
    a.remove(3);
    System.out.println("a.remove(3)");
    System.out.println("a.size()："+a.size());
    System.out.println("削除後(ArrayList a)：" + a);
    System.out.println();

    // 要素の置換。
    System.out.println("置換前(ArrayList a)：" + a);
    a.set(2,"CCC");
    System.out.println("a.set(2,\"CCC\")　");
    System.out.println("置換後(ArrayList a)：" + a);
    System.out.println();

    // 要素の位置検索。
    System.out.println("位置検索前(ArrayList a)：" + a);
    int i = a.indexOf("aaa");
    System.out.println("int i=a.indexOf(\"aaa\")　");
    System.out.println("i：" + i);
    int j = a.indexOf("ddd");
    System.out.println("int j=a.indexOf(\"ddd\")　");
    System.out.println("j：" + j);
    System.out.println("位置検索後(ArrayList a)：" + a);
    System.out.println();

    // 要素の存在確認。
    System.out.println("存在確認前(ArrayList a)：" + a);
    System.out.println("a.contains(\"aaa\")　" + a.contains("aaa"));
    System.out.println("a.contains(\"ddd\")　" + a.contains("ddd"));
    System.out.println("存在確認後(ArrayList a)：" + a);
    System.out.println();

    // 要素の取得。
    System.out.println("取得前(ArrayList a)：" + a);
    String s0 = (String)a.get(0);
    System.out.println("０番目の要素：" + s0);
    String s1 = (String)a.get(1);
    System.out.println("１番目の要素：" + s1);
    System.out.println("取得後(ArrayList a)：" + a);
  }
}
/*
実行結果
% javac j811a.java
注: j811a.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811a
追加前(ArrayList a)：[]
追加後(ArrayList a)：[aaa, ccc, bbb, bbb]

要素数・表示前(ArrayList a)：[aaa, ccc, bbb, bbb]
a.size()：4
要素数・表示後(ArrayList a)：[aaa, ccc, bbb, bbb]

削除前(ArrayList a)：[aaa, ccc, bbb, bbb]
a.remove(3)
a.size()：3
削除後(ArrayList a)：[aaa, ccc, bbb]

置換前(ArrayList a)：[aaa, ccc, bbb]
a.set(2,"CCC")　
置換後(ArrayList a)：[aaa, ccc, CCC]

位置検索前(ArrayList a)：[aaa, ccc, CCC]
int i=a.indexOf("aaa")　
i：0
int j=a.indexOf("ddd")　
j：-1
位置検索後(ArrayList a)：[aaa, ccc, CCC]

存在確認前(ArrayList a)：[aaa, ccc, CCC]
a.contains("aaa")　true
a.contains("ddd")　false
存在確認後(ArrayList a)：[aaa, ccc, CCC]

取得前(ArrayList a)：[aaa, ccc, CCC]
０番目の要素：aaa
１番目の要素：ccc
取得後(ArrayList a)：[aaa, ccc, CCC]
*/
