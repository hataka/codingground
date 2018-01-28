// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j161b.java 
 * created : Time-stamp: <09/06/30(火) 16:50:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j161b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j161b.java >>
//
//  基礎（６）：メソッド（作成）
//
////////////////////////////////////////////////////////////////////////////////

class j161b {

  public static void main(String args[]) {
    System.out.println("power(2,10)=" + power(2,10));
  }

  static int power(int x, int n) { 
    int z = 1;
    for( int i=1; i<=n; i++ ) { z = z * x; }
    return z;
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j161b.java
% java j161b
power(2,10)=1024
</pre>

</body>
</html>

*/
