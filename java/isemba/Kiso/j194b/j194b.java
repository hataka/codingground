// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j194b.java 
 * created : Time-stamp: <09/06/30(火) 17:13:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j194b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j194b.java >>
//
//  基礎（９）：書式付き出力（整数）
//
////////////////////////////////////////////////////////////////////////////////

class j194b {
  public static void main(String args[]) {
    int i = 12345;
    System.out.println(i);
    System.out.printf("|%d|\n",i);
    System.out.printf("|%3d|\n",i);
    System.out.printf("|%8d|\n",i);
    System.out.printf("|%-8d|\n",i);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j194b.java
% java j194b
12345
|12345|
|12345|
|   12345|
|12345   |
</pre>

</body>
</html>
*/
