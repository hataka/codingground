// -*- mode: java -*- Time-stamp: <2009-06-18 13:47:03 kahata>
/*====================================================================
 * name: j811i.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811i.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811i.java >>
//
//  データ構造（１）：リスト（ArrayListクラス、Arraysクラス）
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
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j811i {

  public static void main(String args[]) {

    // 空のリストを作成。
    ArrayList<String> a = new ArrayList<String>();

    // 要素を追加。
    a.add("ddd");
    a.add("aaa");
    a.add("bbb");
    a.add("eee");
    a.add("ccc");

    // リストの表示。
    System.out.println("リスト：" + a);
    System.out.println();

    // リストから配列への変換と表示。
    String s[] = new String[a.size()];
    a.toArray(s);
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
実行結果
% javac j811i.java
注: j811i.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811i
リスト：[ddd, aaa, bbb, eee, ccc]

変換後の配列
 ddd aaa bbb eee ccc

ソート後の配列
 aaa bbb ccc ddd eee

要素の探索
Arrays.binarySearch(s,"ccc")=2
Arrays.binarySearch(s,"fff")=-6
*/
