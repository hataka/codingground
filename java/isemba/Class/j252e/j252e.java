// -*- mode: java -*- Time-stamp: <2009-06-28 20:55:45 kahata>
/*====================================================================
 * name: j252e.java 
 * created : Time-stamp: <09/06/28(日) 20:54:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252e.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252e.java >>
//
//  クラス（５）：インターフェース（２つのインターフェースの実装）
//
//　　２つのインターフェースの基本的な実装を確認する。
//
//　　（１）インターフェース(intf1)の定義。
//　　（２）インターフェース(intf2)の定義。
//　　（３）インターフェース(intf1)の実装。
//　　（４）インターフェース(intf2)の実装。
//　　（５）オブジェクトobjの作成。
//　　（６）インターフェース(intf1)内定数s1の参照。
//　　（７）インターフェース(intf2)内定数s2の参照。
//　　（８）インターフェース(intf1)内メソッド(m1)の呼び出し。
//　　（９）インターフェース(intf2)内メソッド(m2)の呼び出し。
//
///////////////////////////////////////////////////////////////////////////////

interface intf1 { //（１）
  String s1 = "インターフェース(intf1)内メッセージ";
  void m1(); 
}
interface intf2 { //（２）
  String s2 = "インターフェース(intf2)内メッセージ";
  void m2(); 
}

class C implements intf1,intf2 { 
  public void m1() { //（３）
    System.out.println("クラス(C)で実装されたメソッド(m1)");
  }
  public void m2() { //（４）
    System.out.println("クラス(C)で実装されたメソッド(m2)");
  }
}

class j252e {
  public static void main(String args[]) {

    C obj = new C(); //（５）

    System.out.println("（６）obj.s1 =" + obj.s1); //（６）
    System.out.println("（７）obj.s2 =" + obj.s2); //（７）
    System.out.print("（８）obj.m1()："); obj.m1(); //（８）
    System.out.print("（９）obj.m2()："); obj.m2(); //（９）
  }
}
/*
実行結果
% javac j252e.java
% java j252e
（６）obj.s1 =インターフェース(intf1)内メッセージ
（７）obj.s2 =インターフェース(intf2)内メッセージ
（８）obj.m1()：クラス(C)で実装されたメソッド(m1)
（９）obj.m2()：クラス(C)で実装されたメソッド(m2)
*/
