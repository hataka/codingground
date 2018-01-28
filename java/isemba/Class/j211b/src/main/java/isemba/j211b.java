// -*- mode: java -*- Time-stamp: <2009-06-20 06:20:43 kahata>
/*====================================================================
 * name: j211b.java 
 * created : Time-stamp: <09/06/20(土) 06:11:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run: JavaConsoleApplication
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j21b.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j211b.java >>
//
//  クラス（１）：オブジェクト（メンバへのアクセス）
//
//　●オブジェクトのメンバへのアクセス。
//
//　　フィールドへの参照と代入、メソッドの呼び出しを確認する。
//
//　　（１）オブジェクトobjの作成。
//　　（２）フィールドobj.nの参照。
//　　（３）フィールドobj.nに代入。
//　　（４）フィールドobj.nの参照。
//    （５）メソッドm(3)の呼び出し。
//    （６）メソッドm(4)の呼び出し。
//    （７）オブジェクトobjの破棄。
//
////////////////////////////////////////////////////////////////////////////////
package isemba;

// クラス(C)の定義。
class C { 
  int n = 0; // フィールドの定義。
  int m(int a) { // メソッド(m)の定義。 
    return 2*a;
  }
}

// クラス(j211b)の定義。
public class j211b { 

  public static void main(String args[]) {
    
    C obj = new C(); //（１）
    System.out.println("（２）obj.n = " + obj.n); //（２）
    
    obj.n = 111; //（３）
    System.out.println("（４）obj.n = " + obj.n); //（４）

    int k = obj.m(3); //（５）
    System.out.println("（５）k = " + k); 
    System.out.println("（６）obj.m(4) = " + obj.m(4)); //（６）

    obj = null; //（７）
    // 次の2つの実行文は、objがオブジェクトを指さなくなるのでエラーになる。
    // obj.n; 
    // obj.m(5);
  }
}
/*
実行結果
% javac j211b.java
% java j211b
（２）obj.n = 0
（４）obj.n = 111
（５）k = 6
（６）obj.m(4) = 8
*/
