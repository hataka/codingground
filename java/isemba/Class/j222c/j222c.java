// -*- mode: java -*- Time-stamp: <2009-06-26 18:02:29 kahata>
/*====================================================================
 * name: j222c.java 
 * created : Time-stamp: <09/06/26(金) 18:01:41 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j222c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j222c.java >>
//
//  クラス（２）：スコープ（ローカル変数のスコープ）
//
//　　・入れ子構造のブロック内で同じ名前のローカル変数は宣言できない。
//　　・ブロック内で宣言されたローカル変数は、ブロック外で解放される。
//
//　　（１）ブロック内で異なる名前のローカル変数は宣言できる。
//　　（２）ブロック内で同じ名前のローカル変数は宣言できない。
//　　（３）ブロック内でローカル変数は参照できる。
//　　（４）ブロック外でローカル変数は参照できない。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m() {
    int a = 111;
    // ブロック１。
    { 
      int b = 222; //（１）
      System.out.println("（２）int a;　はエラー"); //（２）
      System.out.println("（３）b = " + b); //（３）
    }
    System.out.println("（３）a = " + a); //（３）
    System.out.println("（４）ローカル変数bの参照はできない"); //（４）
  }
}

class j222c {
  public static void main(String args[]) {

    C obj = new C();

    obj.m();
  }
}
/*
実行結果
% javac j222c.java
% java j222c
（２）int a;　はエラー
（３）b = 222
（３）a = 111
（４）ローカル変数bの参照はできない
*/
