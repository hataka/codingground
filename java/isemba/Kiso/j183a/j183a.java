// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j183a.java 
 * created : Time-stamp: <09/06/30(火) 17:04:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j183a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j183a.java >>
//
//  基礎（８）：区間[0,1]の一様乱数の分布
//
////////////////////////////////////////////////////////////////////////////////

class j183a {
  public static void main(String args[]) {

    int n = 100000; // 乱数の個数。
    double r; // 区間[0,1]の一様乱数。
    int f[] = new int[10]; // 出現頻度。

    // 出現頻度の初期化。
    for( int i=0; i<10; i++ ) { f[i] = 0; }

    //　一様乱数を作成し出現頻度を数える。
    for( int j=1; j<=n; j++ ) { 
      r = Math.random();
      int k = (int)(r * 10);
      f[k] = f[k] + 1;
    }

    // 出現頻度の表示。
    System.out.println("乱数の個数：" + n);
    for( int m=0; m<10; m++ ) {
      System.out.print("[" + m/10.0 + "-" + (m+1)/10.0 + "] ");
      System.out.print(f[m]);
      System.out.println("(" + 100.0*f[m]/n + "%)");
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j183a.java

% java j183a
乱数の個数：100000
[0.0-0.1] 9962(9.962%)
[0.1-0.2] 9994(9.994%)
[0.2-0.3] 9845(9.845%)
[0.3-0.4] 10194(10.194%)
[0.4-0.5] 9939(9.939%)
[0.5-0.6] 9970(9.97%)
[0.6-0.7] 10020(10.02%)
[0.7-0.8] 10050(10.05%)
[0.8-0.9] 10107(10.107%)
[0.9-1.0] 9919(9.919%)
</pre>

</body>
</html>
*/
