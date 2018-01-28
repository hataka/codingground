// -*- mode: java -*- Time-stamp: <2009-06-20 06:20:43 kahata>
/*====================================================================
 * name: j211c.java
 * created : Time-stamp: <09/06/20(土) 06:11:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://antlers.cis.ibaraki.ac.jp/PROGRAM/JAVA/CLASS/j211c.htm
 * http://antlers.cis.ibaraki.ac.jp/
 * description:Time-stamp: <2013-11-28 18:50:30 kahata>
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j211c.java >>
//
//  クラス（１）：オブジェクト（オブジェクトの代入と一致）
//
//　●オブジェクトの一致
//
//　　オブジェクトの一致、不一致をequalsメソッドで確認する。
//
//　　（１）１番目のオブジェクトobj1を作成。
//　　（２）２番目のオブジェクトobj2を作成。
//　　（３）作成後、obj1, obj2がオブジェクトとして一致するかしないか判定。
//　　（４）obj1をobj2に代入。
//　　（５）代入後、obj1, obj2がオブジェクトとして一致するかしないか判定。
//
////////////////////////////////////////////////////////////////////////////////
//package j211c;

// クラス(C)の定義。
class C {
  int n = 0; // フィールドの定義。
  int m(int a) { // メソッド(m)の定義。
    return 2*a;
  }
}

// クラス（j211c）の定義。
class j211c {

  public static void main(String args[]) {

    C obj1 = new C(); //（１）
    C obj2 = new C(); //（２）

    //（３）
    if( obj1.equals(obj2)) {
      System.out.println("（３）obj1とobj2は一致する");
    } else {
      System.out.println("（３）obj1とobj2は一致しない");
    }

    obj2 = obj1; //（４）

    //（５）
    if( obj1.equals(obj2)) {
      System.out.println("（５）obj1とobj2は一致する");
    } else {
      System.out.println("（５）obj1とobj2は一致しない");
    }
  }
}
/*
実行結果
% javac j211c.java
% java j211c
（３）obj1とobj2は一致しない
（５）obj1とobj2は一致する
*/
