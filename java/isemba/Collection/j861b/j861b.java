// -*- mode: java -*- Time-stamp: <2009-06-19 15:13:44 kahata>
/*====================================================================
 * name: j861b.java 
 * created : Time-stamp: <09/06/19(金) 15:10:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j861b.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j861b.java >>
//
//  データ構造（６）：マップ（TreeMapクラス、反復子　J2SE1.4までの機能）
//
//　　反復子を使って、マップのすべての要素をたどる。
//
//    昇順の場合：Iteratorインターフェースを使う。
//　　降順の場合：IteratorインターフェースとComparatorインターフェースを使う。
//
//      Comparatorインターフェースを使うとたどる順序を変更できる。
//
//  ●TreeMapクラスのコンストラクタ
//　　public TreeMap()
//      機能：要素の自然順序付けにしたがう空のマップを生成する。
//　　public TreeMap(Comparator c)
//      機能：コンパレータcによる順序づけにしたがう空のマップを生成する。
//
//  ●TreeMapクラスのメソッド
//　　public Iterator iterator()
//      機能：反復子を取得する。
//
//　●Iteratorインターフェースのメソッド
//　　public boolean hasNext()
//      機能：つぎの要素がある場合true、その他false。
//　　public Object next()
//      機能：つぎの要素を取得する。
//
//　●Comparatorインターフェースのメソッド
//　　public int compare(Object obj1, Object obj2)
//      機能：obj1がobj2より小さいとき、-1
//            obj1とobj2が等しいとき、0
//            obj1がobj2より大きいとき、1
//　　　　　　このメソッドをオーバーライドして順序を変更できる。
//
//  ●Stringクラスのメソッド
//　　public int compareTo(String s)
//      機能：文字列を辞書式に比較する。
//            s1.compareTo(s2) s1,s2は文字列
//　　　　　　s1がs2より辞書式に前にある場合は、結果は負の整数
//　　　　　　s1がs2と等しい場合は、結果は0
//　　　　　　s1がs2より辞書式に後にある場合は、結果は正の整数
//
/////////////////////////////////////////////////////////////////////////

import java.util.*;


class decorder implements Comparator<String> {
	public int compare(String obj1, String obj2) {
		int c = obj1.compareTo(obj2);
		return -c;
	}
}
/****
class decorder implements Comparator {
  public int compare(Object obj1, Object obj2) {
    int c = ((String)obj1).compareTo((String)obj2);
    return -c;
  }
} 
*****/

class j861b {

  public static void main(String args[]) {

    // 空のマップを作成。
    TreeMap<String,String> tm = new TreeMap<String,String>();

    // キーと値の組を追加。
    tm.put("C","Car");
    tm.put("A","Airplane");
    tm.put("B","Book");
    tm.put("E","Earth");
    tm.put("D","Door");

    // キーと値のすべての組を昇順にたどる。
    System.out.println("キーと値のすべての組を昇順にたどる"); 
    Set a = (Set)(tm.keySet());
    Iterator ia = a.iterator();
    while( ia.hasNext() ) {
      Object key = ia.next();
      System.out.println("キー：" + key + "　値：" + (String)tm.get(key));
    }
    System.out.println(); 

    // 空のマップを作成。
/*
F:\java\isemba\Collection\j861b>javac -Xlint:unchecked j861b.java
j861b.java:92: 警告:[unchecked] 無検査変換です
検出値  : decorder
期待値  : java.util.Comparator<? super java.lang.String>
    TreeMap<String,String> s = new TreeMap<String,String>(new decorder());
                                                          ^
警告 1 個
*/
    TreeMap<String,String> s = new TreeMap<String,String>(new decorder());

    // キーと値の組を追加。
    s.put("C","Car");
    s.put("A","Airplane");
    s.put("B","Book");
    s.put("E","Earth");
    s.put("D","Door");

    // キーと値のすべての組を降順にたどる。
    System.out.println("キーと値のすべての組を降順にたどる"); 
    Set b = (Set)(s.keySet());
    Iterator ib = b.iterator();
    while( ib.hasNext() ) {
      Object key = ib.next();
      System.out.println("キー：" + key + "　値：" + (String)s.get(key));
    }
  }
}
/*
実行結果
% javac j861b.java
注:j861b.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j861b
キーと値のすべての組を昇順にたどる
キー：A　値：Airplane
キー：B　値：Book
キー：C　値：Car
キー：D　値：Door
キー：E　値：Earth

キーと値のすべての組を降順にたどる
キー：E　値：Earth
キー：D　値：Door
キー：C　値：Car
キー：B　値：Book
キー：A　値：Airplane
*/
