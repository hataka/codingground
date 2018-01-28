// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j831i.java 
 * created : Time-stamp: <09/07/02(木) 08:48:52 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831i.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831i.java >>
//
//  データ構造（３）：集合（HashSetクラス、Arraysクラス）
//
//　　Arraysクラスを使って配列の処理を行う。
//
//　●java.util.Arraysクラス
//　　・Arraysクラスを使って、配列のソートや検索を行うことができる。
//　　・Arraysクラスのメソッドは、クラスメソッドなので、オブジェクトを作成せずに
//　　　使うことができる。
//
//　●Arraysクラスのメソッド
//　　static int binarySearch(Object[] a, Object b)
//    　機能：バイナリーサーチ法でObject型配列aから値bを検索する。
//　　　　　　Object型配列は、ソートされている必要がある。
//            配列中に値bが複数ある場合、どの位置かはわからない。
//　　static void sort(Object[] a)
//　　　機能：Object型配列aを要素に自然な順序で昇順にソートする。
//
///////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j831i {

  public static void main(String args[]) {

    // 空の集合を作成。
    HashSet<String> hs = new HashSet<String>();

    // 要素を追加。
    hs.add("ddd");
    hs.add("aaa");
    hs.add("bbb");
    hs.add("eee");
    hs.add("ccc");

    // 集合の表示。
    System.out.println("集合：" + hs);
    System.out.println();

    // 集合から配列への変換と表示。
    String s[] = new String[hs.size()];
    hs.toArray(s);
    System.out.println("変換後の配列");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // 配列のソート。
    Arrays.sort(s);
    System.out.println("ソート後の配列");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // 配列から要素を探索。
    System.out.println("要素の探索");
    int k = Arrays.binarySearch(s,"ccc");
    System.out.println("Arrays.binarySearch(s,\"ccc\")=" + k);
    k = Arrays.binarySearch(s,"fff");
    System.out.println("Arrays.binarySearch(s,\"fff\")=" + k);
    System.out.println();

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j831i.java
注: j831i.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j831i
集合：[ccc, aaa, eee, ddd, bbb]

変換後の配列
 ccc aaa eee ddd bbb

ソート後の配列
 aaa bbb ccc ddd eee

要素の探索
Arrays.binarySearch(s,"ccc")=2
Arrays.binarySearch(s,"fff")=-6
</pre>

</body>
</html>
*/
