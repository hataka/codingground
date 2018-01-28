// -*- mode: java -*- Time-stamp: <2009-06-28 16:31:58 kahata>
/*====================================================================
 * name: j242c.java 
 * created : Time-stamp: <09/06/28(日) 16:31:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j242c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j242c.java >>
//
//  クラス（４）：継承（コンストラクタ、場合３）
//
//　　場合３について確認する。
//
//　　（１）オブジェクトobjの作成とコンストラクタの実行。
//
///////////////////////////////////////////////////////////////////////////////

// 親クラスの定義。
class Parent {
  Parent() { // 引数なしコンストラクタ。
    System.out.println("親クラスの引数なしコンストラクタ(Parent())");
  }
  Parent(int p) { // 引数ありコンストラクタ。
    System.out.println("親クラスの引数ありコンストラクタ(Parent(int p))");
  }
}

// 子クラスの定義。
class Child extends Parent {
  // ここに、「Child() { super(); }」が挿入される。
}

class j242c {
  public static void main(String args[]) {

    System.out.println("（１）");
    Child obj = new Child(); //（１）
  }
}
/*
実行結果
% javac j242c.java
% java j242c
（１）
親クラスの引数なしコンストラクタ(Parent())
*/
