// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j194d.java 
 * created : Time-stamp: <09/06/30(火) 17:14:40 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j194d.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j194d.java >>
//
//  基礎（９）：書式付き出力（引数インデックス）
//
////////////////////////////////////////////////////////////////////////////////

class j194d {
  public static void main(String args[]) {
    int i=123,j=456,k=789;
    System.out.printf("|%d|%d|%d|\n",i,j,k);
    System.out.printf("|%3$d|%2$d|%1$d|\n",i,j,k);
    System.out.printf("|%1$d|%1$d|%2$d|%2$d|\n",i,j,k);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j194d.java
% java j194d
|123|456|789|
|789|456|123|
|123|123|456|456|
</pre>

</body>
</html>
*/
