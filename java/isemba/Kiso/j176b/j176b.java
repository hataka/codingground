// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j176b.java 
 * created : Time-stamp: <09/06/30(火) 16:57:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j176b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j176b.java >>
//
//  基礎（７）：市松模様の表示
//
//　　方法２：奇数行では、■□の順に４組出力し、偶数行では、□■の順に
//　　　　　　４組出力する。
//
//       □■□■□■□■
//       ■□■□■□■□
//       □■□■□■□■
//       ■□■□■□■□
//       □■□■□■□■
//       ■□■□■□■□
//       □■□■□■□■
//       ■□■□■□■□
//
////////////////////////////////////////////////////////////////////////////////

class j176b {
  public static void main(String args[]) {

    int a=8, // 行数。
        b=8; // 列数。

    // 表示。
    for( int i=1; i<=a; i++ ) {
      if( i%2 == 1 ) {
        for( int j=1; j<=b/2; j++ ) { System.out.print("□■"); }
      } else {
        for( int j=1; j<=b/2; j++ ) { System.out.print("■□"); }
      }
      System.out.println();
    }

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j176b.java
% java j176b
□■□■□■□■
■□■□■□■□
□■□■□■□■
■□■□■□■□
□■□■□■□■
■□■□■□■□
□■□■□■□■
■□■□■□■□
</pre>

</body>
</html>
*/
