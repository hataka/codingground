// -*- mode: java -*- Time-stamp: <2009-06-29 12:45:40 kahata>
/*====================================================================
 * name: j253.java 
 * created : Time-stamp: <09/06/29(月) 12:44:58 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j253.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j253.java >>
//
//  クラス（５）：インターフェース（マーカーインターフェース）
//
//　　あるインターフェースが実装されていたら、あるメソッドを実行するという
//　　ような処理を行う時に、内容が空のインターフェースを使う。
//　　このようなインターフェースをマーカーインターフェースという。
//
//　　（１）マーカーインターフェースintfの定義。
//　　（２）マーカインターフェースintfを実装するクラスC1の定義。
//　　（３）マーカインターフェースintfを実装しないクラスC2の定義。
//　　（４）クラスC1のオブジェクトobj1の作成。
//　　（５）クラスC2のオブジェクトobj2の作成。
//　　（６）オブジェクトobj1にマーカーインターフェースintfが
//　　　　　実装されているかいないかの判定。
//　　（７）オブジェクトobj2にマーカーインターフェースintfが
//　　　　　実装されているかいないかの判定。
//
///////////////////////////////////////////////////////////////////////////////

interface intf { } //（１）

class C1 implements intf { //（２）
  public void m1() {
    System.out.println("クラス(C1)で定義されたメソッド(m1)");
  }
}
class C2 { //（３）
  public void m2() {
    System.out.println("クラス(C1)で定義されたメソッド(m2)");
  }
}

class j253 {
  public static void main(String args[]) {

    C1 obj1 = new C1(); //（４）
    C2 obj2 = new C2(); //（５）

    //（６）
    if( obj1 instanceof intf ) {
      System.out.println("（６）obj1にはインターフェース(intf)が実装されている");
    } else {
      System.out.println("（６）obj1にはインターフェース(intf)が実装されていない");
    }

    //（７）
    if( obj2 instanceof intf ) {
      System.out.println("（７）obj2にはインターフェース(intf)が実装されている");
    } else {
      System.out.println("（７）obj2にはインターフェース(intf)が実装されていない");
    }
  }
}
/*
実行結果
% javac j253.java
% java j253
（６）obj1にはインターフェース(intf)が実装されている
（７）obj2にはインターフェース(intf)が実装されていない
*/
