// -*- mode: java -*- Time-stamp: <2009-06-28 20:59:29 kahata>
/*====================================================================
 * name: j252f.java 
 * created : Time-stamp: <09/06/28(日) 20:58:43 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252f.java >>
//
//  クラス（５）：インターフェース（２つのインターフェースの実装、多態性）
//
//　　２つのインターフェースの多態性を確認する。
//
//　　（１）インターフェース(intf1)の定義。
//　　（２）インターフェース(intf2)の定義。
//　　（３）インターフェース(intf1)の実装。
//　　（４）インターフェース(intf2)の実装。
//　　（５）オブジェクトobj1の作成。
//　　（６）インターフェース(intf1)内定数s1の参照。
//　　（７）インターフェース(intf2)内定数s2の参照はできない。
//　　（８）インターフェース(intf1)内メソッド(m1)の呼び出し。
//　　（９）obj1.m2(); クラス(C)で定義したメソッド(m2)の呼び出しはできない。
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

class j252f {
  public static void main(String args[]) {

    // オブジェクトobj1の作成。
    intf1 obj1 = new C(); //（５）

    System.out.println("（６）obj1.s1 =" + obj1.s1); //（６）
    System.out.println("（７）obj1.s2 は、エラー"); //（７）
    System.out.print("（８）obj1.m1()："); obj1.m1(); //（８）
    System.out.println("（９）obj1.m2()は、エラー"); //（９） 
  }
}
/*
実行結果
% javac j252f.java
% java j252f
（６）obj1.s1 =インターフェース(intf1)内メッセージ
（７）obj1.s2 は、エラー
（８）obj1.m1()：クラス(C)で実装されたメソッド(m1)
（９）obj1.m2()は、エラー
*/
