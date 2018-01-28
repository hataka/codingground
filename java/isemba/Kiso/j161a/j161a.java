// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j161a.java 
 * created : Time-stamp: <09/06/30(火) 16:49:34 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j161a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j161a.java >>
//
//  基礎（６）：メソッド（例）
//
////////////////////////////////////////////////////////////////////////////////

class j161a {
  public static void main(String args[]) {

    int n = 5; 
    double r; 

    System.out.println("平方根");
    for( int i=1; i<=n; i++ ) { 
      r = Math.sqrt((double)i);
      System.out.println("sqrt(" + i + ")=" + r);
    }
    System.out.println();

    System.out.println("一様乱数");
    for( int i=1; i<=n; i++ ) { 
      r = Math.random();
      System.out.println("(" + i + "): " + r);
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j161a.java
% java j161a
平方根
sqrt(1)=1.0
sqrt(2)=1.4142135623730951
sqrt(3)=1.7320508075688772
sqrt(4)=2.0
sqrt(5)=2.23606797749979

一様乱数
(1): 0.5181865445932866
(2): 0.19200715428072257
(3): 0.8500272938117701
(4): 0.428199701191317
(5): 0.13497397405729095
</pre>

</body>
</html>

*/
