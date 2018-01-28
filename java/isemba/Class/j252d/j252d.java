// -*- mode: java -*- Time-stamp: <2009-06-28 20:49:54 kahata>
/*====================================================================
 * name: j252d.java 
 * created : Time-stamp: <09/06/28(日) 20:49:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252d.java >>
//
//  クラス（５）：インターフェース（統一的処理）
//
//　　インターフェース名を型とする変数や配列は、そのインターフェースを実装して
//　　いるクラスのオブジェクトを指すことができる。
//　　このことを利用すると、クラスは異なっていても、同じインターフェースを
//　　実装しているクラスに対して、インターフェース内のメソッドを統一的に処理できる。
//
//　　（１）インターフェース(intf)の定義。
//　　（２）インターフェース(intf)を実装するクラスC1。
//　　（３）インターフェース(intf)を実装するクラスC2。
//　　（４）インターフェース型の配列準備。
//　　（５）クラス(C1)のオブジェクトの作成。
//　　（６）クラス(C2)のオブジェクトの作成。
//　　（７）インターフェース内メソッドmiへのアクセス。
//
///////////////////////////////////////////////////////////////////////////////

interface intf { //（１）
  void mi(); 
}

class C1 implements intf {
  public void mi() { //（２）
    System.out.println("クラス(C1)で実装されたインターフェイス内メソッド(mi)");
  }
}

class C2 implements intf { 
    public void mi() { //（３）
    System.out.println("クラス(C2)で実装されたインターフェイス内メソッド(mi)");
  }
}

class j252d {
  public static void main(String args[]) {

    intf obj[] = new intf[4]; //（４）

    // オブジェクト生成。
    obj[0] = new C1(); //（５）
    obj[1] = new C1(); //（５）
    obj[2] = new C2(); //（６）
    obj[3] = new C2(); //（６）

    for( int i=0; i<obj.length; i++ ) {
      System.out.print("（７）obj[" + i + "].mi()："); obj[i].mi(); //（７）
    }
  }
}
/*
実行結果
% javac j252d.java
% java j252d
（７）obj[0].mi()：クラス(C1)で実装されたインターフェイス内メソッド(mi)
（７）obj[1].mi()：クラス(C1)で実装されたインターフェイス内メソッド(mi)
（７）obj[2].mi()：クラス(C2)で実装されたインターフェイス内メソッド(mi)
（７）obj[3].mi()：クラス(C2)で実装されたインターフェイス内メソッド(mi)
*/
