// -*- mode: java -*- Time-stamp: <2009-06-18 13:47:03 kahata>
/*====================================================================
 * name: j811h.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811h.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811h.java >>
//
//  データ構造（１）：リスト（ArrayListクラス、リストと配列の相互変換）
//
//　　リストと配列の相互変換を行う。
//
//　●ArrayListクラスのメソッド
//    public Object[] toArray(Object[] s)
//　　　機能：リスト内に保存されてる順序と同じ順序で要素が格納されている配列s
//　　　　　　を返す。返される配列sの型は指定された配列の型になる。
//
//　●java.util.Arraysクラス
//　　・Arraysクラスを使って、配列のソートや検索を行うことができる。
//　　・Arraysクラスのメソッドは、クラスメソッドなので、オブジェクトを作成せずに
//　　　使うことができる。
//
//　○Arraysクラスのメソッド
//    static List asList(Object[] a)
//　　　機能：配列aからリストを返す。このリストのサイズの変更はできない。
//　　　　　　したがって、要素の追加・削除はできないが、変更はできる。
//　　　　　　また、リストへの変更は、そのまま配列に書き込まれる。
//
///////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j811h {

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
    System.out.println("変換前リスト：" + a);
    System.out.println();

    // リストから配列への変換と表示。
    String s[] = new String[a.size()];
    a.toArray(s);
    System.out.println("リストから配列への変換後の配列");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // 配列からリストへ変換。
    List<String> b = (List<String>)Arrays.asList(s);
    System.out.println("配列からリストへの変換後のリスト：" + b);
  }
}
/*
実行結果
% javac j811h.java
注: j811h.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811h
変換前リスト：[ddd, aaa, bbb, eee, ccc]

リストから配列への変換後の配列
 ddd aaa bbb eee ccc

配列からリストへの変換後のリスト：[ddd, aaa, bbb, eee, ccc]
*/
