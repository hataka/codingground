// -*- mode: java -*- Time-stamp: <2009-06-28 10:30:34 kahata>
/*====================================================================
 * name: j241c.java 
 * created : Time-stamp: <09/06/28(日) 10:29:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j241c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j241c.java >>
//
//  クラス（４）：継承（メソッド）
//
//　　メソッドの継承を確認する。
//                     
//　　（１）親クラスのインスタンスメソッドの定義。
//　　（２）親クラスのクラスメソッドの定義。
//　　（３）子クラスChildのオブジェクトobjの作成。
//　　（４）親クラスで定義したインスタンスメソッドの呼び出し。
//　　（５）親クラスで定義したクラスメソッドの呼び出し。
//
///////////////////////////////////////////////////////////////////////////////

// 親クラスの定義。
class Parent {
  void pm() { //（１）
    System.out.println("親クラス(Parent)のインスタンスメソッド(pm)");
  }
  static void psm() { //（２）
    System.out.println("親クラス(Parent)のクラスメソッド(psm)");
  }
}

// 子クラスの定義。
class Child extends Parent {
  // 内容なし。
}

class j241c {
  public static void main(String args[]) {

    Child obj = new Child(); //（３）
   
    System.out.print("（４）obj.pm()：");
    obj.pm(); //（４）

    System.out.print("（５）obj.psm()：");
    obj.psm(); //（５）
    System.out.print("（５）Child.psm()：");
    Child.psm(); //（５）
  }
}
/*
実行結果
% javac j241c.java
% java j241c
（４）obj.pm()：親クラス(Parent)のインスタンスメソッド(pm)
（５）obj.psm()：親クラス(Parent)のクラスメソッド(psm)
（５）Child.psm()：親クラス(Parent)のクラスメソッド(psm)
*/
