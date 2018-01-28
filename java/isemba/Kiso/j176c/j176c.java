// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j176c.java 
 * created : Time-stamp: <09/06/30(火) 16:58:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j176c.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j176c.java >>
//
//  基礎（７）：市松模様の表示
//
//　　方法３：行iと列jの関係で、■または□を出力する。
//          　i+jが偶数のとき、□、奇数のとき、■。
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

class j176c {
  public static void main(String args[]) {

    int a=8, // 行数。
        b=8; // 列数。

    // 表示。
    for( int i=1; i<=a; i++ ) {
      for( int j=1; j<=b; j++ ) {
        if( (i+j)%2 == 0 ) {
          System.out.print("□");
        } else {
          System.out.print("■");
        }
      }
      System.out.println();
    }

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j176c.java
% java j176c
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
