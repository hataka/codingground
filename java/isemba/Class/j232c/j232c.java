// -*- mode: java -*- Time-stamp: <2009-06-26 20:07:48 kahata>
/*====================================================================
 * name: j232c.java 
 * created : Time-stamp: <09/06/26(金) 20:07:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j232c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j232c.java >>
//
//　クラス（３）：引数（１次元配列　参照渡し）
//
//　　配列も参照型の変数なので、参照渡しが行われる。
//
//　　（１）オブジェクトobjの作成。
//　　（２）実引数(配列a[])に値を代入。
//　　（３）メソッドmの呼び出し。
//　　（４）仮引数(配列b[])を変更。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m(int b[]) {
    System.out.print("メソッド開始直後：   　　　 ");
    for( int i=0; i<b.length; i++ ) { System.out.print(" b["+i+"]="+b[i]); }
    System.out.println();

    for( int i=0; i<b.length; i++ ) { b[i] = -b[i]; } //（４）    

    System.out.print("メソッド終了直前：　   　　 ");
    for( int i=0; i<b.length; i++ ) { System.out.print(" b["+i+"]="+b[i]); }
    System.out.println();
  }
}

class j232c {
  public static void main(String args[]) {

    C obj = new C(); //（１）

    int a[] = { 111,222,333 }; //（２）

    System.out.print("１次元配列・参照渡し実行前：");
    for( int i=0; i<a.length; i++ ) { System.out.print(" a["+i+"]="+a[i]); }
    System.out.println();

    obj.m(a); //（３）

    System.out.print("１次元配列・参照渡し実行後：");
    for( int i=0; i<a.length; i++ ) { System.out.print(" a["+i+"]="+a[i]); }
    System.out.println();
  }
}
/*
実行結果
% javac j232c.java
% java j232c
１次元配列・参照渡し実行前： a[0]=111 a[1]=222 a[2]=333
メソッド開始直後：   　　　  b[0]=111 b[1]=222 b[2]=333
メソッド終了直前：　   　　  b[0]=-111 b[1]=-222 b[2]=-333
１次元配列・参照渡し実行後： a[0]=-111 a[1]=-222 a[2]=-333
*/
