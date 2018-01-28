// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j194c.java 
 * created : Time-stamp: <09/06/30(火) 17:14:06 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j194c.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j194c.java >>
//
//  基礎（９）：書式付き出力（実数）
//
////////////////////////////////////////////////////////////////////////////////

class j194c {
  public static void main(String args[]) {
    double d = 123.456789;
    System.out.println(d);
    System.out.printf("|%f|\n",d);
    System.out.printf("|%16.8f|\n",d);
    System.out.printf("|%16.10f|\n",d);
    System.out.printf("|%-16.10f|\n",d);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j194c.java
% java j194c
123.456789
|123.456789|
|    123.45678900|
|  123.4567890000|
|123.4567890000  |
</pre>

</body>
</html>
*/
