// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j211a.java 
 * created : Time-stamp: <09/06/20(土) 06:11:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j21a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j211a.java >>
//
//  クラス（１）：オブジェクト（オブジェクトの作成）
//　
//　●オブジェクトの作成
//
//　　２つのオブジェクトを作成し、ひとつのクラスから複数のオブジェクトが
//　　作成できることを確認する。
//
//　　（１）１番目のオブジェクトobj1を作成。
//　　（２）２番目のオブジェクトobj2を別の書き方で作成。
//
////////////////////////////////////////////////////////////////////////////////

// クラス(C)の定義。
class C { 
  int n = 0; // フィールドの定義。
  int m(int a) { // メソッド(m)の定義。
    return 2*a;
  }
}

// クラス(j211a)の定義。
public class j211a { 
  public static void main(String args[]) {
    C obj1 = new C(); //（１）
    C obj2;           //（２）
    obj2 = new C();    
  }
}
/*
実行結果
% javac j211a.java
% java j211a
*/
