// -*- mode: java -*- Time-stamp: <2009-06-26 17:51:56 kahata>
/*====================================================================
 * name: j212a.java 
 * created : Time-stamp: <09/06/26(金) 17:51:06 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j212a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j212a.java >>
//
//  クラス（１）：プログラムの書き方（書き方１）
//
//　　２つのクラスを使う書き方１を確認する。
//
//　　（１）クラスCの定義。
//　　（２）フィールドの定義。
//　　（３）メソッド(m)の定義。
//　　（４）オブジェクトobjを作成。
//　　（５）フィールド編の参照。
//　　（６）メソッドの呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class C {    
  int a = 123; //（２）
  String m() { //（３） 
    return "メソッドm";
  }
}

// クラス（j212a）の定義。
public class j212a { 

  public static void main(String args[]) {
    
    C obj = new C(); //（４）

    System.out.println("（５）obj.a  : " + obj.a); //（５）

    System.out.println("（６）obj.m(): " + obj.m()); //（６）
  }
}
/*
実行結果
% javac j212a.java
% java j212a
（５）obj.a  : 123
（６）obj.m(): メソッドm
*/
