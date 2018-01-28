// -*- mode: java -*- Time-stamp: <2009-06-28 18:23:23 kahata>
/*====================================================================
 * name: j244c.java 
 * created : Time-stamp: <09/06/28(日) 18:22:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j244c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j244c.java >>
//
//  クラス（４）：継承（オーバーライド、性質３）
//
//　　Child objc = new Child();
//    Parent objp = objc;
//
//　　(性質３) 親クラスで定義されたメソッドm()が、子クラスでオーバーライドされて
//　　       　いるとき、objp.m()で呼び出されるのは、親クラスで定義された
//             メソッドではなく、子クラスでオーバーライドされたメソッドになる。
//
//　　（１）子クラスのオブジェクトobjcの作成。
//　　（２）子クラスのオブジェクトobjcを親クラスの変数objpに代入。
//　　（３）親クラスのオブジェクトobjpでメソッドmの呼び出し。
// 　　　　 親クラスのメソッドmではなく、子クラスでオーバライドされたメソッドmが
//　　　　　呼び出される。
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  void m() {
    System.out.println("親クラスのメソッド(m)");
  }
}

class Child extends Parent {
  void m() {
    System.out.println("子クラスでオーバーライドしたメソッド(m)");
  }
}

class j244c {
  public static void main(String args[]) {

    Child objc = new Child(); //（１）
    Parent objp = objc; //（２）

    System.out.print("（３）objp.m()："); objp.m();
  }
}
/*
実行結果
% javac j244c.java
% java j244c
（３）objp.m()：子クラスでオーバーライドしたメソッド(m)
*/
