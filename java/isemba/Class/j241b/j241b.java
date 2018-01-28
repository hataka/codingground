// -*- mode: java -*- Time-stamp: <2009-06-28 10:24:04 kahata>
/*====================================================================
 * name: j241b.java 
 * created : Time-stamp: <09/06/28(日) 10:22:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j241b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j241b.java >>
//
//  クラス（４）：継承（フィールド）
//
//　　フィールドの継承を確認する。
//
// 　 フィールド変数を参照すると、自分のクラスから探し、もしなければ親クラスを探す。
//　　そこにもなければ、そのまた親クラスを探すことを見つかるまで続ける。
//
//　　（１）祖先クラスのインスタンス変数。
//　　（２）祖先クラスのクラス変数。
//　　（３）子クラスChildのオブジェクトobjの生成。
//　　（４）祖先クラスで定義したインスタンス変数paの参照。
//　　（５）祖先クラスで定義したクラス変数pbの参照。
//
///////////////////////////////////////////////////////////////////////////////

// 祖先クラスの定義。
class Ancestor {
  int aa = 111; //（１）        
  static int ab = 222; //（２）
}

// 親クラスの定義。
class Parent extends Ancestor { 
  // 内容なし。
}

// 子クラスの定義。
class Child extends Parent { 
  // 内容なし。
}

class j241b {
  public static void main(String args[]) {

    Child obj = new Child(); //（３）
   
    System.out.println("（４）obj.aa = " + obj.aa); //（４）

    System.out.println("（５）obj.ab = " + obj.ab); //（５）
    System.out.println("（５）Child.ab = " + Child.ab); //（５）
  }
}
/*
実行結果
% javac j241b.java
% java j241b
（４）obj.aa = 111
（５）obj.ab = 222
（５）Child.ab = 222
*/
