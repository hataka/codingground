// -*- mode: java -*- Time-stamp: <2009-06-26 17:07:03 kahata>
/*====================================================================
 * name: j232d.java 
 * created : Time-stamp: <09/06/26(金) 17:05:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j232d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j232d.java >>
//
//　クラス（３）：引数（２次元配列　参照渡し）
//
//　　配列も参照型の変数なので、参照渡しが行われる。
//
//　　（１）オブジェクトobjの作成。
//　　（２）実引数(配列a[][])に値を代入。
//　　（３）メソッドmの呼び出し。
//　　（４）仮引数(配列b[][])を変更。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m(int b[][]) {
    System.out.println("method開始直後：");
    for( int i=0; i<b.length; i++ ) { 
      for( int j=0; j<b[i].length; j++ ) {
        System.out.print(" b["+i+"]["+j+"]="+b[i][j]);
      }
      System.out.println();
    }

    //（４）
    for( int i=0; i<b.length; i++ ) { 
      for( int j=0; j<b[i].length; j++ ) { b[i][j] = -b[i][j]; }
    }

    System.out.println("method終了直前：");
    for( int i=0; i<b.length; i++ ) { 
      for( int j=0; j<b[i].length; j++ ) {
        System.out.print(" b["+i+"]["+j+"]="+b[i][j]);
      }
      System.out.println();
    }
  }
}

class j232d {
  public static void main(String args[]) {

    C obj = new C(); //（１）

    int a[][] = { {111,222,333}, {444,555} }; //（２）
    System.out.println("２次元配列・参照渡し実行前：");
    for( int i=0; i<a.length; i++ ) { 
      for( int j=0; j<a[i].length; j++ ) {
        System.out.print(" a["+i+"]["+j+"]="+a[i][j]);
      }
      System.out.println();
    }

    obj.m(a); //（３）

    System.out.println("１次元配列・参照渡し実行後：");
    for( int i=0; i<a.length; i++ ) { 
      for( int j=0; j<a[i].length; j++ ) {
        System.out.print(" a["+i+"]["+j+"]="+a[i][j]);
      }
      System.out.println();
   }
  }
}
/*
実行結果
% javac j232d.java
% java j232d
２次元配列・参照渡し実行前：
 a[0][0]=111 a[0][1]=222 a[0][2]=333
 a[1][0]=444 a[1][1]=555
method開始直後：
 b[0][0]=111 b[0][1]=222 b[0][2]=333
 b[1][0]=444 b[1][1]=555
method終了直前：
 b[0][0]=-111 b[0][1]=-222 b[0][2]=-333
 b[1][0]=-444 b[1][1]=-555
１次元配列・参照渡し実行後：
 a[0][0]=-111 a[0][1]=-222 a[0][2]=-333
 a[1][0]=-444 a[1][1]=-555
*/
