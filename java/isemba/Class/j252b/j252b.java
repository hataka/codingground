// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j252b.java 
 * created : Time-stamp: <09/06/19(金) 10:32:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252b.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
//  << j252b.java >>
//
//  クラス（５）：インターフェース（２つのクラスへの実装）
//
//　　２つのクラスへの実装を確認する。
//
//　　（１）インターフェース(intf)の定義。
//　　（２）インターフェース(intf)の実装。
//　　（３）インターフェース(intf)の実装。
//　　（４）クラス(C1)のオブジェクトの作成。
//　　（５）クラス(C2)のオブジェクトの作成。
//　　（６）インターフェース内定数obj1.msg, obj2.msgの参照。
//　　（７）インターフェース内メソッドobj1.mi(), obj2.mi()の呼び出し。
//
/////////////////////////////////////////////////////////////////////////

interface intf { //（１）
  static String msg = "interface内定数";
  void mi(); 
}

class C1 implements intf {
  public void mi() { //（２）
    System.out.println("クラス(C1)で実装されたインターフェイス内 method(mi)");
  }
}

class C2 implements intf { //（３）
  public void mi() {
    System.out.println("クラス(C2)で実装されたインターフェイス内 method(mi)");
  }
}

class j252b {
  public static void main(String args[]) {

    C1 obj1 = new C1(); //（４）
    C2 obj2 = new C2(); //（５）

    System.out.println("（６）obj1.msg：" + intf.msg); //（６）
    System.out.println("（６）obj2.msg：" + intf.msg); //（６）

    System.out.print("（７）obj1.mi()："); obj1.mi(); //（７）
    System.out.print("（７）obj2.mi()："); obj2.mi(); //（７）
  }
}
/*
実行結果
% javac j252b.java
% java j252b
（６）obj1.msg：interface内定数
（６）obj2.msg：interface内定数
（７）obj1.mi()：クラス(C1)で実装されたインターフェイス内メソッド(mi)
（７）obj2.mi()：クラス(C2)で実装されたインターフェイス内メソッド(mi)
*/
