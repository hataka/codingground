// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j172a.java 
 * created : Time-stamp: <09/06/30(火) 16:53:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j172a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j172a.java >>
//
//  基礎（７）：１０進数と２進数の変換
//
//　●１０進数から２進数へ変換。
//　　10進数を2で割り、得られた余りを逆順に並べる。
//
//  　　    ２５＝２×１２＋１
//　　　　　１２＝２×６　＋０
//　　　　　　６＝２×３　＋０
//　　　　　　３＝２×１　＋１
//　　　　　　１＝２×０　＋１
//
//　　　　  求める２進数は、１１００１
//
////////////////////////////////////////////////////////////////////////////////

class j172a {
  public static void main(String args[]) {

    int d; // １０進数。
    int b[] = new int[1000]; // ２進数を保存する配列。

    System.out.println("１０進数から２進数へ変換");

    d = 25;
    System.out.println("１０進数：" + d);

    // １０進数から２進数へ変換。
    int k = 0;
    while( d > 0 ) { b[k] = d%2; ; d = d/2; k++; }

    // ２進数の表示。
    System.out.print("　２進数：");
    for( int i=k-1; i>=0; i-- ) { System.out.print(b[i]); } 
    System.out.println(); 

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j172a.java

% java j172a
１０進数から２進数へ変換
１０進数：25
　２進数：11001
</pre>

</body>
</html>
*/
