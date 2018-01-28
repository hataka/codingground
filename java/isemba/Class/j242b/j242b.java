// -*- mode: java -*- Time-stamp: <2009-06-28 11:24:28 kahata>
/*====================================================================
 * name: j242b.java 
 * created : Time-stamp: <09/06/28(日) 11:23:47 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j242b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j242b.java >>
//
//  クラス（４）：継承（コンストラクタ、場合２）
//
//　　場合２について確認する。
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
  Child(String s) {
    // ここに、Javaコンパイラによって、super(); が自動的に挿入される。 
    System.out.println("子クラスのコンストラクタ(Child(String s))");
  }
}

class j242b {
  public static void main(String args[]) {

    System.out.println("（１）");
    Child obj = new Child("abc");
  }
}
/*
実行結果
% javac j242b.java
% java j242b
（１）
親クラスの引数なしコンストラクタ(Parent())
子クラスのコンストラクタ(Child(String s))
*/
