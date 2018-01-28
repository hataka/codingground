// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j172b.java 
 * created : Time-stamp: <09/06/30(火) 16:53:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:　JavaConsoleApplication
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j172b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j172b.java >>
//
//  基礎（７）：１０進数と２進数の変換
//
//
//　●２進数から１０進数へ変換
//　　２進数の重みを加えていく。
//
//  　　    １１００１＝１×１６＋１×８＋０×４＋０×２＋１×１
//                    ＝２５
//
////////////////////////////////////////////////////////////////////////////////

class j172b {
  public static void main(String args[]) {

    int d; // １０進数。
    int b[] = new int[1000]; // ２進数を保存する配列。

    System.out.println("２進数から１０進数へ変換");

    // ２進数。
    int k = 5;
    b[4] = 1; b[3] = 1; b[2] = 0; b[1] = 0; b[0] =1;

    System.out.print("　２進数：");
    for( int i=k-1; i>=0; i-- ) { System.out.print(b[i]); } 
    System.out.println(); 

    // ２進数から１０進数へ変換。
    d = 0;
    for( int i=k-1; i>=0; i-- ) {
      d = d * 2 + b[i];
    }

    System.out.println("１０進数：" + d);

  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j172b.java

% java j172b
２進数から１０進数へ変換
　２進数：11001
１０進数：25
</pre>

</body>
</html>
*/
