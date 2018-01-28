// -*- mode: java -*- Time-stamp: <2009-06-26 17:46:24 kahata>
/*====================================================================
 * name: j233b.java 
 * created : Time-stamp: <09/06/26(金) 17:45:28 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j233b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j233b.java >>
//
//　クラス（３）：可変引数（固定引数と可変引数）
//
//　　固定引数と同時に書く場合、可変引数は最後に書く。
//
//　　（１）オブジェクトobjの作成。
//　　（２）固定引数１個、可変引数１個のメソッドの呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m(String s, int... a) {
    System.out.println("メソッド開始直後");
    System.out.println("　　　s = " + s);
    System.out.println("　　　a.legth = " + a.length);
    System.out.print("　　　配列 ");
    for( int i=0; i<a.length; i++ ) {
      System.out.print(" a[" + i + "]=" + a[i]);
    }
    System.out.println();
  }
}

class j233b {
  public static void main(String args[]) {

    C obj = new C(); //（１）

    System.out.print("（２）");
    obj.m("abc",111,222,333); //（２）

  }

}
/*
実行結果
% javac j233b.java
% java j233b
（２）メソッド開始直後
　　　s = abc
　　　a.legth = 3
　　　配列  a[0]=111 a[1]=222 a[2]=333
*/
