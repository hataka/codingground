// -*- mode: java -*- Time-stamp: <2009-06-29 17:16:54 kahata>
/*====================================================================
 * name: j271a.java 
 * created : Time-stamp: <09/06/29(月) 17:16:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j271a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j271a.java >>
//
//  クラス（７）：内部クラス（内部クラスの作成、内部クラスのスコープ）
//
//　　内部クラスのスコープを確認する。
//
//　　・内部クラスは、内部クラスを含むクラスのスコープ内にあるので、
//　　　内部クラスを含むクラスのメンバに内部クラスからアクセスできる。
//
//　　（１）内部クラスの定義。
//　　（２）内部クラスINCを指す変数objiを宣言。
//　　（３）内部クラスINCのオブジェクトobjiの作成
//　　（４）クラスCのオブジェクトobjの作成
//　　（５）クラスCのメソッドm1の呼び出し。
//　　（６）内部クラスINCのフィールドsincをクラスCのメソッドm1から参照する。
//　　（７）内部クラスINCのメソッドmincをクラスCのメソッドm1から呼び出す。
//　　（８）クラスCのフィールドsを内部クラスから参照する。
//　　（９）クラスCのメソッドm2を内部クラスから呼び出す。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  String s = "クラスC内のフィールド変数";

  INC obji; //（２）

  C() { // クラスCのコンストラクタ。
    obji = new INC(); //（３）
  }

  void m1() {
    System.out.println("（６）obji.sinc = " + obji.sinc); //（６）
    System.out.println("（７）obji.minc()："); obji.minc(); //（７）
  }

  void m2() {
    System.out.println("クラスC内のメソッド"); 
  }

  //（１）
  class INC {
    String sinc = "内部クラス内のフィールド変数";
    void minc() {
      System.out.println("（８）s = " + s); //（８）
      System.out.print("（９）m2()："); m2(); //（９）
    }
  }

}

class j271a {
  public static void main(String args[]) {

    C obj = new C(); //（４）

    System.out.println("（５）obj.m1()：");obj.m1(); //（５）
  }
}
/*
実行結果
% javac j271a.java
% java j271a
（５）obj.m1()：
（６）obji.sinc = 内部クラス内のフィールド変数
（７）obji.minc()：
（８）s = クラスC内のフィールド変数
（９）m2()：クラスC内のメソッド
*/
