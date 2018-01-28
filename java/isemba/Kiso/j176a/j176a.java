// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j176a.java 
 * created : Time-stamp: <09/06/30(火) 16:57:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j176a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j176a.java >>
//
//  基礎（７）：市松模様の表示
//
//　　方法１：１行目と２行目を４回繰り返し出力する。
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

class j176a {
  public static void main(String args[]) {

    int a=8, // 行数。
        b=8; // 列数。

    // 表示。
    for( int i=1; i<=a/2; i++ ) {
      System.out.println("□■□■□■□■");
      System.out.println("■□■□■□■□");
    }

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j176a.java
% java j176a
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
