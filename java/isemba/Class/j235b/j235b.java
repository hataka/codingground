// -*- mode: java -*- Time-stamp: <2009-06-27 10:52:26 kahata>
/*====================================================================
 * name: j235b.java 
 * created : Time-stamp: <09/06/27(土) 10:51:18 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j235b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j235b.java >>
//
//  クラス（３）：コンストラクタ（可変引数の場合）
//
//　　可変引数の場合、コンストラクタの実行を確認する。
//
//　　（１）オブジェクトobjの作成とコンストラクタの実行。
//
////////////////////////////////////////////////////////////////////////////////

class C { // コンストラクタのあるクラス。
  C(int... a) { // コンストラクタの定義。
    System.out.println("（１）クラスCのコンストラクタ");
    for( int i=0; i<a.length; i++ ) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}

class j235b {
  public static void main(String args[]) {

    C obj = new C(123,456); //（１）

  }
}
/*
実行結果
% javac j235b.java
% java j235b
（１）クラスCのコンストラクタ
123 456
*/
