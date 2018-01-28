// -*- mode: java -*- Time-stamp: <2009-06-28 18:16:55 kahata>
/*====================================================================
 * name: j244a.java 
 * created : Time-stamp: <09/06/28(日) 18:16:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j244a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j244a.java >>
//
//  クラス（４）：継承（オーバーライド、性質1）
//
//　　Child objc = new Child();
//    Parent objp = objc;
//
//　　(性質１) 変数objpから子クラスで新たに定義されたメンバ(フィールド、メソッド)
//             にアクセスすることはできない。
//
//　　（１）子クラスのオブジェクトobjcの作成。
//　　（２）子クラスのオブジェクトobjcを親クラスの変数objpに代入。
//　　（３）親クラスで定義されたフィールド変数にアクセス可能。
//　　（４）子クラスで新たに定義されたフィールド変数にアクセス不可能。
//　　（５）親クラスで定義されたメソッドに呼び出し可能。
//　　（６）子クラスで新たに定義されたメソッドに呼び出し不可能。
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  int pa = 111; // 親クラスのみのフィールド。
  void pm() {
    System.out.println("親クラスで定義されたメソッド(pm)");
  }
}

class Child extends Parent {
  int ca = 222; // 子クラスのみのフィールド。
  void cm() {
    System.out.println("子クラスで新たに定義されたメソッド(cm)");
  }
}

class j244a {
  public static void main(String args[]) {

    Child objc = new Child(); //（１）
    Parent objp = objc; //（２）

    System.out.println("（３）objp.pa = " + objp.pa); //（３）
    System.out.println("（４）objp.ca = " + "エラー");

    System.out.print("（５）objp.pm()："); objp.pm(); 
    System.out.print("（６）objp.cm()：エラー");
  }
}
/*
実行結果
% javac j244a.java
% java j244a
（３）objp.pa = 111
（４）objp.ca = エラー
（５）objp.pm()：親クラスで定義されたメソッド(pm)
（６）objp.cm()：エラー
*/
