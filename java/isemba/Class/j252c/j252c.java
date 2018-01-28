// -*- mode: java -*- Time-stamp: <2009-06-28 20:45:12 kahata>
/*====================================================================
 * name: j252c.java 
 * created : Time-stamp: <09/06/28(日) 20:44:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252c.java >>
//
//  クラス（５）：インターフェース（多態性）
//
//　　インターフェースは、オブジェクトを作れない。
//　　しかし、インターフェース型の変数を宣言して、インターフェースを
//　　実装しているクラスのオブジェクトを指すことはできる。
//
//　　    インターフェース名 変数名 = new クラス名(); 
//
//　　（性質１）インターフェースで定義された変数、
//　　　　　　　インターフェースで定義され、クラス内で実装されたメソッドに
//　　　　　　　アクセスできる。
//　　（性質２）クラスで新たに定義された変数やメソッドにはアクセスできない。
//
//　　（１）インターフェース(intf)の定義。
//　　（２）インターフェース(intf)の実装。
//　　（３）クラスで新たに定義したメソッドm。
//　　（４）インターフェースはオブジェクトを作れない。
//　　（５）インターフェース型の変数を宣言し、インターフェース(intf)を
//　　　　　実装しているクラスのオブジェクトを指すことはできる。
//　　（６）インターフェース内フィールドobj2.msgへのアクセス可能。
//　　（７）インターフェース内メソッドmiへのアクセス可能。
//　　（８）クラス内フィールドobj2.aへのアクセスはできない。
//　　（９）クラス内メソッドmを呼び出せない。
//
///////////////////////////////////////////////////////////////////////////////

interface intf { //（１）
  String msg = "interface内メッセージ";
  void mi(); 
}

class C implements intf { 
  int a = 111;
  public void mi() { //（２）
    System.out.println("クラス(C)で実装したインターフェイス内メソッド(mi)");
  }
  void m() { //（３）
    System.out.println("クラス(C)で定義したメソッド(m)");
  }
}

class j252c {
  public static void main(String args[]) {

    System.out.println("（４）intf obj1 = new intf() は、エラー");

    intf obj2 = new C(); //（５） 

    System.out.println("（６）obj2.msg：" + obj2.msg); //（６）

    System.out.print("（７）obj2.mi()："); obj2.mi(); //（７）

    System.out.println("（８）obj2.a は、エラー"); //（８）
    System.out.println("（９）obj2.mc() は、エラー"); //（９）
  }
}
/*
実行結果
% javac j252c.java
% java j252c
（４）intf obj1 = new intf() は、エラー
（６）obj2.msg：interface内メッセージ
（７）obj2.mi()：クラス(C)で実装したインターフェイス内メソッド(mi)
（８）obj2.a は、エラー
（９）obj2.mc() は、エラー
*/
