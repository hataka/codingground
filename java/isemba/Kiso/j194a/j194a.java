// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j194a.java 
 * created : Time-stamp: <09/06/30(火) 17:12:58 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j194a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j194a.java >>
//
//  基礎（９）：書式付き出力（文字列）
//
////////////////////////////////////////////////////////////////////////////////

class j194a {
  public static void main(String args[]) {
    String s = "abcde";
    System.out.println("|" + s + "|");
    System.out.printf("|%s|\n",s);
    System.out.printf("|%3s|\n",s);
    System.out.printf("|%8s|\n",s);
    System.out.printf("|%-8s|\n",s);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j194a.java
% java j194a
|abcde|
|abcde|
|abcde|
|   abcde|
|abcde   |
</pre>

</body>
</html>
*/
