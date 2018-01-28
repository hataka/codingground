// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j181a.java 
 * created : Time-stamp: <09/06/30(火) 16:59:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j181a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j181a.java >>
//
//  基礎（８）：素数生成（素朴な方法）
//
//　　　整数n以下の素数をすべて求める。
//
//　　　奇数iが素数かどうか判定するのに、
//　　　3,5,...,i-2のいずれかで割り切れた場合、合成数、
//　　　3,5,...,i-2すべてで割り切れなかった場合、素数と判定する。
//   
////////////////////////////////////////////////////////////////////////////////

class j181a {
  public static void main(String args[]) {

    int n = 100; // n以下の素数すべて求める。
    int c,i,j;

    System.out.print("2 "); // 2は素数。

    c = 1; // cは素数の個数。 
    for( i=3; i<=n; i=i+2 ) {
      for( j=3; j<i; j=j+2 ) {
        if( i%j == 0 ) { break; }
      }
      if( j >= i ) { // 素数の場合、出力する。
        System.out.print(i + " "); 
        c = c + 1;
        if( c%10 == 0 ) { System.out.println(); }
      }
    }

    System.out.println();
    System.out.println(n+"以下の素数は" + c + "個存在する");

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j181a.java

% java j181a
2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97
100以下の素数は25個存在する
</pre>

</body>
</html>
*/
