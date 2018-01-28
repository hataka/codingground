// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j182b.java 
 * created : Time-stamp: <09/06/30(火) 17:03:56 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j182b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j182b.java >>
//
//  基礎（８）：ピタゴラス数（効率のよい解法)
//
//　　a*a + b*b = c*c (1<=a<=b<=c, c*c<=n)を満たすピタゴラス数の個数を求める。
//
//               n      n以下のピタゴラス数
//             10**3             11
//             10**4             52
//             10**5            220
//             10**6            881
//             10**7           3371
//             10**8          12471
//             10**9          45251
//             10**10        161436
//
////////////////////////////////////////////////////////////////////////////////

class j182b {
  public static void main(String args[]) {

    long n = 100000000; 
    long count = 0; // ピタゴラス数の個数。
    long a,b,c,w;

    c = 1;
    while( c*c <= n ) { 
      a = 1;
      b = c;
      while( a <= b ) {
        w = a*a + b*b - c*c;
        if( w == 0 ) { count++; }
        if( w > 0 ) { b--; } else { a++; } 
      }
      c++; 
    }

    System.out.println(n + "以下のピタゴラス数は" + count + "個あります");
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j182b.java

% java j182b
100000000以下のピタゴラス数は12471個あります
</pre>

</body>
</html>
*/
