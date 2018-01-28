// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j171c.java 
 * created : Time-stamp: <09/06/30(火) 16:52:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j171c.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j171c.java >>
//
//  基礎（７）：九九の表の作成
//
//　●タブ機能
//　　エスケープシーケンスを使うと、\tでタブ機能を設定できる。
//
////////////////////////////////////////////////////////////////////////////////

class j171c {
  public static void main(String args[]) {

    System.out.println("九九のテーブル");

    for( int i=1; i<=9; i++ ) {
      for( int j=1; j<=9; j++ ) { System.out.print(i*j + "\t"); }
      System.out.println(); 
    }

  }
}
