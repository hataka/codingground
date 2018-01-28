// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j182a.java 
 * created : Time-stamp: <09/06/30(火) 17:03:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j182a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j182a.java >>
//
//  基礎（８）：ピタゴラス数（素朴な解法)
//
//　　a*a + b*b = c*c (1<=a<=b<=c, c*c<=n)を満たすピタゴラス数の個数を求める。
//
//               n      n以下のピタゴラス数
//             10**3             11
//             10**4             52
//             10**5            220
//
////////////////////////////////////////////////////////////////////////////////

class j182a {
  public static void main(String args[]) {

    int n = 100000; 
    int count = 0; // ピタゴラス数の個数。
    int w;

    for( int c=1; c*c<=n; c++ ) { 
      for( int b=1; b<=c; b++ ) {
        for( int a=1; a<=b; a++ ) {
          w = a*a + b*b;
          if( w == c*c ) { count++; }
          if( w >= c*c ) { break; }
        }
      }
    }

    System.out.println(n + "以下のピタゴラス数は" + count + "個あります");
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j182a.java

% java j182a
100000以下のピタゴラス数は220個あります
</pre>

</body>
</html>
*/
