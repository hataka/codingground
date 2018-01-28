// -*- mode: java -*- Time-stamp: <2009-06-25 19:42:31 kahata>
/*====================================================================
 * name: j222a.java 
 * created : Time-stamp: <09/06/25(木) 19:41:43 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j222a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j222a.java >>
//
//  クラス（２）：スコープ（フィールド変数のスコープ）
//
//　　フィールド変数は、メソッド内で有効であることを確認する。
//
//　　（１）メソッドm1開始直後のインスタンス変数aの参照。
//　　（２）メソッドm1開始直後のクラス変数bの参照。
//　　（３）メソッドm1内で変更後のインスタンス変数aの参照。
//　　（４）メソッドm1内で変更後のクラス変数bの参照。
//　　（５）メソッドm2開始直後のインスタンス変数aの参照。
//　　（６）メソッドm2開始直後のクラス変数bの参照。
//　　（７）メソッドm2内で変更後のインスタンス変数aの参照。
//　　（８）メソッドm2内で変更後のクラス変数bの参照。
//　　（９）オブジェクトobjの作成。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  int a = 111; // インスタンス変数。
  static int b = 222; // クラス変数。
  void m1() {
    System.out.println("（１）a = " + a); //（１）
    System.out.println("（２）b = " + b); //（２）
    a = 333;
    b = 444;
    System.out.println("（３）a = " + a); //（３）
    System.out.println("（４）b = " + b); //（４）
  }
  void m2() {
    System.out.println("（５）a = " + a); //（５）
    System.out.println("（６）b = " + b); //（６）
    a = 555;
    b = 666;
    System.out.println("（７）a = " + a); //（７）
    System.out.println("（８）b = " + b); //（８）
  }
}

class j222a {
  public static void main(String args[]) {

    C obj = new C(); //（９）

    obj.m1();

    obj.m2();
  }
}
/*
実行結果
% javac j222a.java
% java j222a
（１）a = 111
（２）b = 222
（３）a = 333
（４）b = 444
（５）a = 333
（６）b = 444
（７）a = 555
（８）b = 666
*/
