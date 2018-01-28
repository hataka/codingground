// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j171b.java 
 * created : Time-stamp: <09/06/30(火) 16:51:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * TODO: tag jump
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j171b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j171b.java >>
//
//  基礎（７）：九九の表の作成
//
//　　配列を使って作成する。
//
////////////////////////////////////////////////////////////////////////////////

class j171b {
  public static void main(String args[]) {

    System.out.println("九九のテーブル");

    // 配列の宣言。
    int x[][] = new int[10][10];

    // 九九の結果を配列に保存。
    for( int i=1; i<=9; i++ ) {
      for( int j=1; j<=9; j++ ) { x[i][j] = i * j; }
    }

    // 九九の結果を表示。
    for( int i=1; i<=9; i++ ) {
      for( int j=1; j<=9; j++ ) { System.out.print(x[i][j] + " "); }
      System.out.println(); 
    }
  }
}
