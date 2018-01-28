// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j183b.java 
 * created : Time-stamp: <09/06/30(火) 17:05:25 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j183b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j183b.java >>
//
//  基礎（８）：円周率の近似
//
//　　区間[0,1]の一様乱数の組(x,y)をn組生成し、x*x+y*y<=1を満たす組cを数えると、
//　　4c/nが円周率の近似値となる。
//
////////////////////////////////////////////////////////////////////////////////

class j183b {
  public static void main(String args[]) {

    int n = 100000; // 乱数組の個数。
    double x,y; // 区間[0,1]の一様乱数。
    int c = 0; // ４分円内(x*x+y*y<=1)に入る乱数組の個数。

    //　一様乱数を作成し出現頻度を数える。
    for( int i=1; i<=n; i++ ) { 
      x = Math.random();
      y = Math.random();
      if( x*x+y*y <= 1.0 ) { c++; }
      if( i%10000 == 0 ) {
        System.out.println("i=" + i + " 円周率の近似値=" + 4.0*c/i);
      }
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j183b.java

% java j183b
i=10000 円周率の近似値=3.144
i=20000 円周率の近似値=3.1388
i=30000 円周率の近似値=3.1414666666666666
i=40000 円周率の近似値=3.1397
i=50000 円周率の近似値=3.14704
i=60000 円周率の近似値=3.1484666666666667
i=70000 円周率の近似値=3.1498285714285714
i=80000 円周率の近似値=3.14465
i=90000 円周率の近似値=3.142622222222222
i=100000 円周率の近似値=3.1452
</pre>

</body>
</html>
*/
