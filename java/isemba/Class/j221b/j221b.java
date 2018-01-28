// -*- mode: java -*- Time-stamp: <2009-06-20 10:56:05 kahata>
/*====================================================================
 * name: j221b.java 
 * created : Time-stamp: <09/06/20(土) 06:11:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j221b.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j221b.java >>
//
//  クラス（２）：変数（クラス変数の性質１）
//
//  　クラス変数は、そのクラスから生成されたオブジェクトがひとつもないときでも
//    存在することを確認する。
//  
//　　（１）クラス変数bの定義と初期化。
//　　（２）クラス変数bへの参照。オブジェクトがないときでも存在する。　
//　　（３）クラス変数へ代入。
//　　（４）クラス変数への参照。
//　
////////////////////////////////////////////////////////////////////////////////

/**
 * @author kazuhiko
 *
 */
class C {
  static int b = 0; //（１）
}

class j221b {
  public static void main(String args[]) {

    System.out.println("（２）C.b: " + C.b); //（２）

    C.b = 111; //（３）
    
    System.out.println("（４）C.b: " + C.b); //（４）
  }
}
/*
実行結果
% javac j221b.java
% java j221b
（２）C.b: 0
（４）C.b: 111
*/
