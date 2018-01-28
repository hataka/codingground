// -*- mode: java -*- Time-stamp: <2009-06-29 17:20:18 kahata>
/*====================================================================
 * name: j271b.java 
 * created : Time-stamp: <09/06/29(月) 17:19:34 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j271b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j271b.java >>
//
//  クラス（７）：内部クラス（内部クラスの作成、内部クラスのスコープ）
//
//　　内部クラスのスコープを確認する。
//
//　　（１）内部クラスの定義。
//　　　　　クラスメソッドmainから呼ばれているのでstatic宣言は必要。
//　　（２）内部クラスCのオブジェクトobjiの作成
//　　（３）内部クラスINCのフィールドsincをクラスj271bのメソッドmainから参照する。
//　　（４）内部クラスINCのメソッドmincをクラスj271bのメソッドmainから呼び出す。
//　　（５）クラスj271bのフィールドsを内部クラスから参照する。
//　　（６）クラスj271bのメソッドmを内部クラスから呼び出す。
//
////////////////////////////////////////////////////////////////////////////////

class j271b {

  static String s = "クラスj271b内のフィールド変数";
  static String m() {
    return "クラスj271b内のメソッドm";
  }             

  public static void main(String args[]) {

    INC obji = new INC(); //（２）

    System.out.println("（３）obji.sinc = " + obji.sinc); //（３）

    System.out.println("（４）obji.minc()："); obji.minc(); //（４）

  }

  //（１）
  static class INC { 
    String sinc = "内部クラス内のフィールド変数";
    void minc() {
      System.out.println("（５）s = " + s); //（５）
      System.out.println("（６）m()：" + m()); //（６）
    }
  }
}
/*
実行結果
% javac j271b.java
% java j271b
（３）obji.sinc = 内部クラス内のフィールド変数
（４）obji.minc()：
（５）s = クラスj271b内のフィールド変数
（６）m()：クラスj271b内のメソッドm
*/
