// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j222b.java 
 * created : Time-stamp: <09/06/25(木) 19:45:41 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j222b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j222b.java >>
//
//  クラス（２）：スコープ（仮引数）
//
//　　・仮引数は、ローカル変数である。
//　　・仮引数とフィールド変数が同じ名前を持つとき、フィールド変数に
//　　　予約語thisを付けて区別する。
//
//　　仮引数とフィールド変数が同じ名前を持つとき、フィールド変数に
//　　予約語thisを付けて区別できることを確認する。
//
//　　（１）仮引数aの参照。
//　　（２）仮引数bの参照。
//　　（３）インスタンス変数aの参照。
//　　（４）クラス変数bの参照。
//　　（５）オブジェクトobjの作成。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  int a = 111; // インスタンス変数。
  static int b = 222; // クラス変数。
  void m(int a, int b) { // 仮引数a,bはローカル変数。
    System.out.println("（１）a = " + a); //（１）
    System.out.println("（２）b = " + b); //（２）
    System.out.println("（３）this.a = " + this.a); //（３）
    System.out.println("（４）this.b = " + this.b); //（４）
  }
}

class j222b {
  public static void main(String args[]) {

    C obj = new C(); //（５）

    obj.m(333,444);
  }
}
/*
実行結果
% javac j222b.java
% java j222b
（１）a = 333
（２）b = 444
（３）this.a = 111
（４）this.b = 222
*/
