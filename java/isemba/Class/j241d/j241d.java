// -*- mode: java -*- Time-stamp: <2009-06-28 10:45:45 kahata>
/*====================================================================
 * name: j241d.java 
 * created : Time-stamp: <09/06/28(日) 10:44:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j241d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j241d.java >>
//
//  クラス（４）：継承（メソッド）
//
//　　メソッドの継承を確認する。
//
// 　 メソッドを呼び出すと、自分のクラスから探し、もしなければ親クラスを探す。
//　　そこにもなければ、そのまた親クラスを探すことを見つかるまで続ける。
//
//　　（１）祖先クラスのインスタンスメソッドの定義。
//　　（２）祖先クラスのクラスメソッドの定義。
//　　（３）子クラスChildのオブジェクトobjの作成。
//　　（４）祖先クラスで定義したインスタンスメソッドの呼び出し。
//　　（５）祖先クラスで定義したクラスメソッドの呼び出し。
//
///////////////////////////////////////////////////////////////////////////////

// 祖先クラスの定義。
class Ancestor {
  void am() { //（１）
    System.out.println("祖先クラス(Ancestor)のインスタンスメソッド(am)");
  }
  static void asm() { //（２）
    System.out.println("祖先クラス(Ancestor)のクラスメソッド(asm)");
  }
}

// 親クラスの定義。
class Parent extends Ancestor {
  // 内容なし。
}

// 子クラスの定義。
class Child extends Parent {
  // 内容なし。
}

class j241d {
  public static void main(String args[]) {

    Child obj = new Child(); //（３）
   
    System.out.print("（４）obj.am()：");
    obj.am(); //（４）

    System.out.print("（５）obj.asm()：");
    obj.asm(); //（５）
    System.out.print("（５）Child.asm()：");
    Child.asm(); //（５）
  }
}
/*
実行結果
% javac j241d.java
% java j241d
（４）obj.am()：祖先クラス(Ancestor)のインスタンスメソッド(am)
（５）obj.asm()：祖先クラス(Ancestor)のクラスメソッド(asm)
（５）Child.asm()：祖先クラス(Ancestor)のクラスメソッド(asm)
*/
