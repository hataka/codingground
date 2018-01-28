// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j235a.java 
 * created : Time-stamp: <09/06/27(土) 10:48:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j235a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j235a.java >>
//
//  クラス（３）：コンストラクタ（固定引数の場合）
//
//　　固定引数の場合、コンストラクタの実行を確認する。
//
//　　（１）オブジェクトobjの作成とコンストラクタの実行。
//
////////////////////////////////////////////////////////////////////////////////

class C { // コンストラクタのあるクラス。
  C(int a) { // コンストラクタの定義。
    System.out.println("（１）クラスCのコンストラクタ：a = " + a);
  }
}

class j235a {
  public static void main(String args[]) {

    C obj = new C(123); //（１）
  }
}
/*
実行結果
% javac j235a.java
% java j235a
（１）クラスCのコンストラクタ：a = 123
*/
