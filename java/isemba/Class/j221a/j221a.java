// -*- mode: java -*- Time-stamp: <2009-06-20 07:23:51 kahata>
/*====================================================================
 * name: j221a.java 
 * created : Time-stamp: <09/06/20(土) 06:11:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j221a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j221a.java >>
//
//  クラス（２）：変数（インスタンス変数の性質）
//
//　　同じクラスから作成されたオブジェクトが複数存在するとき、
//　　他のオブジェクトでの値の更新の影響は受けないことを確認する。
//
//　　（１）インスタンス変数aの定義と初期化。
//　　（２）１番目のオブジェクトを作成。
//　　（３）２番目のオブジェクトを作成。
//　　（４）オブジェクトobj1の変数aの値を確認。
//　　　　　オブジェクトobj2の変数aの値を確認。
//　　（５）オブジェクトobj1の変数aに111を代入。
//　　（６）オブジェクトobj1の変数aの値を確認。
//　　　　　オブジェクトobj2の変数aの値を確認。
//　　（７）オブジェクトobj1の変数aに222を代入。
//　　（８）オブジェクトobj1の変数aの値を確認。
//　　　　　オブジェクトobj2の変数aの値を確認。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  int a = 0; //（１）
}

class j221a {
  public static void main(String args[]) {

    C obj1 = new C(); //（２） 
    C obj2 = new C(); //（３）

    System.out.println("（４）obj1.a: " + obj1.a); //（４）
    System.out.println("（４）obj2.a: " + obj2.a); //（４）

    obj1.a = 111; //（５）

    System.out.println("（６）obj1.a: " + obj1.a); //（６）
    System.out.println("（６）obj2.a: " + obj2.a); //（６）

    obj2.a = 222; //（７）

    System.out.println("（８）obj1.a: " + obj1.a); //（８）
    System.out.println("（８）obj2.a: " + obj2.a); //（８）
  }
}
/*
実行結果
% javac j221a.java
% java j221a
（４）obj1.a: 0
（４）obj2.a: 0
（６）obj1.a: 111
（６）obj2.a: 0
（８）obj1.a: 111
（８）obj2.a: 222
*/
