// -*- mode: java -*- Time-stamp: <2009-06-20 06:20:43 kahata>
/*====================================================================
 * name: j211d.java 
 * created : Time-stamp: <09/06/20(土) 06:11:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j21d.htm
 * description:
 * TODO: tag jump 2
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j211d.java >>
//
//  クラス（１）：オブジェクト（オブジェクトの配列）
//
//　　複数のオブジェクトをまとめて扱うとき、配列にして処理すると便利である。
//　　オブジェクトを格納する配列を作成して確認する。
//
//　　（１）オブジェクトを格納する配列の準備。
//　　（２）オブジェクトの作成。
//　　（３）フィールド変数の参照。
//　　（４）メソッドの呼び出し。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  int a = 123;
  String m() {
    return "Methd[m]";
  }
}
 
class j211d {
  public static void main(String args[]) {

    C obj[] = new C[3]; //（１）

    //（２）
    for( int i=0; i<obj.length; i++ ) {
      obj[i] = new C();
    }
   
    //（３）
    for( int i=0; i<obj.length; i++ ) {
       System.out.println("（３）obj[" + i + "].a = " + obj[i].a);
    }
    System.out.println();

    //（４）
    for( int i=0; i<obj.length; i++ ) {
       System.out.println("（４）obj[" + i + "].m()：" + obj[i].m());
    }
  }
}
/*
実行結果
% javac j211d.java
% java j211d
（３）obj[0].a = 123
（３）obj[1].a = 123
（３）obj[2].a = 123

（４）obj[0].m()：メソッドm
（４）obj[1].m()：メソッドm
（４）obj[2].m()：メソッドm
*/
