// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j242a.java 
 * created : Time-stamp: <09/06/28(日) 11:00:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j242a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j242a.java >>
//
//  クラス（４）：継承（コンストラクタ、場合１）
//
//　　場合１について確認する。
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

// コンストラクタのある子クラスの定義。
class Child extends Parent {
  Child(String s) {
    super(222);
    System.out.println("子クラスのコンストラクタ(Child(String s))");
  }
}

class j242a {
  public static void main(String args[]) {

    System.out.println("（１）");
    Child obj = new Child("abc"); //（１）
  }
}
/*
実行結果
% javac j242a.java
% java j242a
（１）
親クラスの引数ありコンストラクタ(Parent(int p))
子クラスのコンストラクタ(Child(String s))
*/
