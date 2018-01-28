// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j181b.java 
 * created : Time-stamp: <09/06/30(火) 17:00:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j181b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j181b.java >>
//
//  基礎（８）：素数生成（エラトステネスの方法）
//
////////////////////////////////////////////////////////////////////////////////

class j181b {
  public static void main(String args[]) {

    int n = 100; // n以下の素数をすべて求める。
    int c,i,p;
    int a[]; // 配列の宣言。a[i]=0は、iが素数、a[i]=1は、iが合成数を意味する。

    // n+2個分の配列要素を確保。
    a = new int[n+2]; 
    // 初期設定として、n+1以下のすべての整数を素数と仮定する。
    for( i=2; i<=n+1; i++ ) { a[i] = 0; }

    // 偶数を合成数とする。
    p = 2; 
    for( i=2*p; i<=n; i=i+p ) { a[i] = 1; }

    while( p < n ) {
      p = p + 1;
      while( a[p] == 1 ) { p = p + 1; }
      // 素数pについて、2p,3p,... を合成数とする。
      for( i=2*p; i<=n; i=i+p ) { a[i] = 1; }
    }

    // 素数の表示。
    c = 0; // cは素数の個数。
    for( i=2; i<=n; i++ ) {
      if( a[i] == 0 ) {
        System.out.print(i + " ");
        c++; if( c%10 == 0 ) { System.out.println(); }
      }
    }
    System.out.println();
    System.out.println(n + "以下の素数は " + c + " 個存在する");

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j181b.java

% java j181b
2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97
100以下の素数は 25 個存在する
</pre>

</body>
</html>
*/
