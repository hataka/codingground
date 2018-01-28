// -*- mode: java -*- Time-stamp: <2009-06-26 19:57:06 kahata>
/*====================================================================
 * name: j232a.java 
 * created : Time-stamp: <09/06/26(金) 19:56:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j232a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j232a.java >>
//
//　クラス（３）：引数（基本型　値渡し）
//
//    「値渡し」結果、メソッド内で仮引数に変更がなされても、
//　　実引数にその影響は及ばないことを確認する。
//
//　　（１）オブジェクトobjの作成。
//　　（２）実引数nに111を代入。
//　　（３）メソッドmの呼び出し。
//　　（４）メソッド内で仮引数の変更。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m(int a) {
    System.out.println("メソッド開始直後：a = " + a);
    a = -a; //（４）
    System.out.println("メソッド終了直前：a = " + a);
  }
}

class j232a {
  public static void main(String args[]) {

    C obj = new C(); //（１）

    int n = 111; //（２）

    System.out.println("値渡し実行前：n = " + n);
    obj.m(n); //（３）
    System.out.println("値渡し実行後：n = " + n);
  }
}
/*
実行結果
% javac j232a.java
% java j232a
値渡し実行前：n = 111
メソッド開始直後：a = 111
メソッド終了直前：a = -111
値渡し実行後：n = 111
*/
