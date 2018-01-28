// -*- mode: java -*- Time-stamp: <2009-06-28 18:25:36 kahata>
/*====================================================================
 * name: j244d.java 
 * created : Time-stamp: <09/06/28(日) 18:24:59 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j244d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j244d.java >>
//
//  クラス（４）：継承（オーバーライド）
//
//  　オブジェクトの多態性の性質３から、共通の親クラスを持つ子クラスの
//　　メソッドがオーバーライドされていてもオブジェクトを統一的に扱うことができる。
//
//　　（１）親クラスの配列objp[]を準備。
//　　（２）子クラス(Child0)のオブジェクトobj[0]を作成。
//　　（３）子クラス(Child1)のオブジェクトobj[1]を作成。
//　　（４）親クラスのオブジェクトobj[2]を作成。
//　　（５）フィールドの場合、親クラスのフィールドが選択される。
//　　（６）メソッドの場合、オーバーライドされた子クラスのメソッドが選択される。
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  int a = 111;
  void m() {
    System.out.println("親クラスのメソッド(m)");
  }
}

class Child0 extends Parent {
  int a = 222;
  void m() {
    System.out.println("子クラス(Child0)でオーバーライドしたメソッド(m)");
  }
}
class Child1 extends Parent {
  int a = 333;
  void m() {
    System.out.println("子クラス(Child1)でオーバーライドしたメソッド(m)");
  }
}

class j244d {
  public static void main(String args[]) {

    Parent objp[] = new Parent[3]; //（１）

    objp[0] = new Child0(); //（２）

    objp[1] = new Child1(); //（３）

    objp[2] = new Parent(); //（４）

    for( int i=0; i<objp.length; i++ ) {
      System.out.println("（５）objp[" + i + "].a：" + objp[i].a);
    }
    System.out.println();

    for( int i=0; i<objp.length; i++ ) {
      System.out.print("（６）objp[" + i + "].m()："); objp[i].m();
    }
  }
}
/*
実行結果
% javac j244d.java
% java j244d
（５）objp[0].a：111
（５）objp[1].a：111
（５）objp[2].a：111

（６）objp[0].m()：子クラス(Child0)でオーバーライドしたメソッド(m)
（６）objp[1].m()：子クラス(Child1)でオーバーライドしたメソッド(m)
（６）objp[2].m()：親クラスのメソッド(m)
*/
