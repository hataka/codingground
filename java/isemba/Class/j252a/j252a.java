// -*- mode: java -*- Time-stamp: <2009-06-19 10:30:11 kahata>
/*====================================================================
 * name: j252a.java 
 * created : Time-stamp: <09/06/19(金) 10:24:36 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252a.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
//  << j252a.java >>
//
//  クラス（５）：インターフェース（基本的使い方）
//
//　　基本的な使い方を確認する。
//
//　●インターフェース内の変数
//
//　　インターフェース内の変数は、どこからでも参照できるが値の変更はできない。
//　　したがって、自動的にpublic指定、static指定、final指定がつけられる。
//　　・public指定　どこからでも参照できる。
//　　・static指定　クラス変数扱い。
//　　・final指定 　変更できない。
//
//　●インターフェース内のメソッド
//
//　　インターフェース内のメソッドには、自動的にpublic指定、abstract指定が
//　　つけられる。
//　　・abstract指定　実装されていないメソッドを意味する。
//
//    したがって、使う側のクラスでもpublic指定が必要となる。
//　　また、戻り値、引数のデータ型と個数なども一致させる必要がある。
//
//　　（１）インターフェース(intf)の定義。
//　　（２）インターフェース(intf)の実装。
//　　（３）インターフェース内定数intf.msgの参照。
//　　　　　オブジェクトが無くても参照可能。
//　　（４）オブジェクトobjの作成。
//　　（５）インターフェース内定数obj.msgの参照。
//　　（６）インターフェース内メソッドの呼び出し。
//
/////////////////////////////////////////////////////////////////////////

interface intf { //（１）
  static String msg = "interface内定数";
  void mi(); 
}

class C implements intf { 
  public void mi() { //（２）
    System.out.println("クラス(C)で実装されたインターフェイス内method(mi)");
  }
}

class j252a {
  public static void main(String args[]) {

    System.out.println("（３）intf.msg：" + intf.msg); //（３）

    C obj = new C(); //（４）

    System.out.println("（５）obj.msg：" + intf.msg); //（５）
    System.out.print("（６）obj.mi()："); obj.mi(); //（６）
  }

}
/*
実行結果
% javac j252a.java
% java j252a
（３）intf.msg：interface内定数
（５）obj.msg：interface内定数
（６）obj.mi()：クラス(C)で実装されたインターフェイス内メソッド(mi)
*/
