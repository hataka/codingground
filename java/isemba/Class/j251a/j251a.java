// -*- mode: java.php -*- Time-stamp: <2009-06-28 18:31:51 kahata>
/*====================================================================
 * name: j251a.java.php 
 * created : Time-stamp: <09/06/28(日) 18:31:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j251a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j251a.java >>
//
//  クラス（５）：抽象クラス（基本的使い方）
//
//　　抽象メソッド、抽象クラスの基本的使い方を確認する。
//
//　　（１）抽象メソッドの定義。      
//　　（２）抽象メソッドのオーバーライド。      
//　　（３）オブジェクトobjを作成。      
//　　（４）実体を記述した抽象クラスの呼び出し。      
//
///////////////////////////////////////////////////////////////////////////////

// 抽象クラス。
abstract class AC {
  abstract void am(); //（１）
}
// 抽象クラスを継承するクラス。
class C extends AC {
  void am() { //（２）
    System.out.println("抽象メソッドamのオーバーライド");
  }
}

class j251a {
   public static void main(String args[]) {

     C obj = new C(); //（３）

     System.out.print("（４）obj.am()："); obj.am(); //（４）
  }
}
/*
実行結果
% javac j251a.java
% java j251a
（４）obj.am()：抽象メソッドamのオーバーライド
*/
