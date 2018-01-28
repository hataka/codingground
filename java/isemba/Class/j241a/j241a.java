// -*- mode: java -*- Time-stamp: <2009-06-28 10:15:13 kahata>
/*====================================================================
 * name: j241a.java 
 * created : Time-stamp: <09/06/28(日) 10:14:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j241a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j241a.java >>
//
//  クラス（４）：継承（フィールド）
//
//　　フィールドの継承を確認する。
//                     
//　　（１）親クラスのインスタンス変数。
//　　（２）親クラスのクラス変数。
//　　（３）子クラスChildのオブジェクトobjの生成。
//　　（４）親クラスで定義したインスタンス変数paの参照。
//　　（５）親クラスで定義したクラス変数pbの参照。
//
///////////////////////////////////////////////////////////////////////////////

// 親クラスの定義。
class Parent {
  int pa = 111; //（１）        
  static int pb = 222; //（２）
}

// 子クラスの定義。
class Child extends Parent { 
  // 内容なし。
}

class j241a {
  public static void main(String args[]) {

    Child obj = new Child(); //（３）
   
    System.out.println("（４）obj.pa = " + obj.pa); //（４）

    System.out.println("（５）obj.pb = " + obj.pb); //（５）
    System.out.println("（５）Child.pb = " + Child.pb); //（５）
  }
}
/*
実行結果
% javac j241a.java
% java j241a
（４）obj.pa = 111
（５）obj.pb = 222
（５）Child.pb = 222
*/
