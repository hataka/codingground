// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j175.java 
 * created : Time-stamp: <09/06/30(火) 16:56:24 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j175.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j175.java >>
//
//  基礎（７）：単語の抽出
//
//  　与えられた文字列から空白を区切り文字として単語を抽出する。
//
//　　　文字列："  ab  cde  fghi  "
//    　抽出された単語："ab","cde","fghi"
//
////////////////////////////////////////////////////////////////////////////////

class j175 {
  public static void main(String args[]) {

    // 文字列の指定。 
    String s;
    s = "  ab  cde  fghi   ";
    System.out.println("文字列："+"|"+s+"|");

    int i,j=0;
    while( true ) {
      // 空白の検出。
      while( j < s.length() ) {
        if( s.charAt(j) != ' ' ) { break; }
        j++;
      }
      if( j == s.length() ) { break; }
      i = j; j++;
      // 単語の検出。
      while( j < s.length() ) {
        if( s.charAt(j) == ' ' ) { break; }
        j++;
      }
      System.out.println("単語："+s.substring(i,j));
      if( j == s.length() ) { break; }
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j175.java
% java j175
文字列：|  ab  cde  fghi   |
単語：ab
単語：cde
単語：fghi
</pre>

</body>
</html>
*/
