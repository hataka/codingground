// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j221c.java 
 * created : Time-stamp: <09/06/25(木) 18:51:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j221c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
 ////////////////////////////////////////////////////////////////////////////////
//  << j221c.java >>
//
//  クラス（２）：変数（クラス変数の性質２）
//
//　　クラス変数は、同じクラスから作成されたオブジェクトが複数存在するとき、
//　　他のオブジェクトでの値の更新の影響を受けることを確認する。
//
//　　（１）クラス変数bの定義と初期化。
//　　（２）１番目のオブジェクトを作成。　
//　　（３）２番目のオブジェクトを作成。　
//　　（４）クラス変数bを参照。
//　　（５）クラス変数bへ111を代入。
//　　（６）クラス変数bを参照。
//　　（７）クラス変数bへ222を代入。
//　　（８）クラス変数bを参照。
//　
////////////////////////////////////////////////////////////////////////////////

class C {
  static int b = 0; //（１）
}

class j221c {
  public static void main(String args[]) {

    C obj1= new C(); //（２）
    C obj2= new C(); //（３）

    System.out.println("（４）obj1.b: " + C.b); //（４） 
    System.out.println("（４）obj2.b: " + obj2.b); //（４）
    System.out.println("（４）C.b: " + C.b); //（４）

    obj1.b = 111; //（５）

    System.out.println("（６）obj1.b: " + obj1.b); //（６）
    System.out.println("（６）obj2.b: " + obj2.b); //（６）
    System.out.println("（６）C.b: " + C.b); //（６） 

    obj2.b = 222; //（７）

    System.out.println("（８）obj1.b: " + obj1.b); //（８）
    System.out.println("（８）obj2.b: " + obj2.b); //（８）
    System.out.println("（８）C.b: " + C.b); //（８）

  }

}
/*
実行結果
% javac j221c.java
% java j221c
（４）obj1.b: 0
（４）obj2.b: 0
（４）C.b: 0
（６）obj1.b: 111
（６）obj2.b: 111
（６）C.b: 111
（８）obj1.b: 222
（８）obj2.b: 222
（８）C.b: 222
*/
