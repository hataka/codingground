// -*- mode: java -*- Time-stamp: <2009-06-26 17:55:29 kahata>
/*====================================================================
 * name: j212b.java 
 * created : Time-stamp: <09/06/26(金) 17:54:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j212b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j212b.java >>
//
//  クラス（１）：プログラムの書き方（書き方２）
//
//　　１つのクラスを使う書き方２を確認する。
//
//　　（１）フィールドaの定義。
//　　（２）メソッド（m）の定義。 
//　　（３）オブジェクトobjを作成。
//　　（４）フィールド編の参照。
//　　（５）メソッドの呼び出し。

////////////////////////////////////////////////////////////////////////////////

// クラス(j212b)の定義。
class j212b { 
  int a = 123; //（１）
  String m() { //（２）
    return "メソッドm";
  }

  public static void main(String args[]) {
    
    j212b obj = new j212b(); //（３）

    System.out.println("（４）obj.a  : " + obj.a); //（４）

    System.out.println("（５）obj.m(): " + obj.m()); //（５）
  }
}
/*
実行結果
% javac j212b.java
% java j212b
（４）obj.a  : 123
（５）obj.m(): メソッドm
*/
