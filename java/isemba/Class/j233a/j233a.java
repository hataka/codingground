// -*- mode: java -*- Time-stamp: <2009-06-26 17:24:50 kahata>
/*====================================================================
 * name: j233a.java 
 * created : Time-stamp: <09/06/26(金) 17:23:56 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j233a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j233a.java >>
//
//　クラス（３）：可変引数（可変引数のみ）
//
//　　可変引数の機能を確認する。
//
//　　（１）オブジェクトobjの作成。
//　　（２）引数０個のメソッドの呼び出し。
//　　（３）引数１個のメソッドの呼び出し。
//　　（４）引数２個のメソッドの呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m(int... a) {
    System.out.println("メソッド開始直後");
    System.out.println("　　　a.legth = " + a.length);
    System.out.print("　　　配列 ");
    for( int i=0; i<a.length; i++ ) {
      System.out.print(" a[" + i + "]=" + a[i]);
    }
    System.out.println();
  }
}

class j233a {
  public static void main(String args[]) {

    C obj = new C(); //（１）

    System.out.print("（２）");
    obj.m(); //（２）

    System.out.print("（３）");
    obj.m(111);//（３）

    System.out.print("（４）");
    obj.m(111,222);//（４）
  }
}
/*
実行結果
% javac j233a.java
% java j233a
（２）メソッド開始直後
　　　a.legth = 0
　　　配列
（３）メソッド開始直後
　　　a.legth = 1
　　　配列  a[0]=111
（４）メソッド開始直後
　　　a.legth = 2
　　　配列  a[0]=111 a[1]=222
*/
