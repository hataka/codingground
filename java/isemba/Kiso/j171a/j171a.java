// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j171a.java 
 * created : Time-stamp: <09/06/30(火) 16:50:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run: JavaConsoleApplication
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j171a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j171a.java >>
//
//  基礎（７）：九九の表の作成
//
//　　for文を入れ子構造にして作成する。
//
////////////////////////////////////////////////////////////////////////////////

class j171a {
  public static void main(String args[]) {

    System.out.println("九九の表");

    for( int i=1; i<=9; i++ ) {
      for( int j=1; j<=9; j++ ) {
        System.out.print(i*j + " ");
      }
      System.out.println(); 
    }

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j171a.java

% java j171
九九の表
1 2 3 4 5 6 7 8 9
2 4 6 8 10 12 14 16 18
3 6 9 12 15 18 21 24 27
4 8 12 16 20 24 28 32 36
5 10 15 20 25 30 35 40 45
6 12 18 24 30 36 42 48 54
7 14 21 28 35 42 49 56 63
8 16 24 32 40 48 56 64 72
9 18 27 36 45 54 63 72 81
</pre>

</body>
</html>
*/
