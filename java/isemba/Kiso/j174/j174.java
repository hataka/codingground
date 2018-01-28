// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j174.java 
 * created : Time-stamp: <09/06/30(火) 16:55:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j174.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j174.java >>
//
//  基礎（７）：分数ａ／ｂ (ａ＜ｂ）の計算
//
//　　分数を小数点以下１００桁まで求める。
//
//　　計算法:筆算をまねる。
//
//    　  １／７＝0.142857142...の計算      １／８＝0.125の計算
//                                                             
//　　　　１×１０＝７×１＋３                  １×１０＝８×１＋２   
//　　　　３×１０＝７×４＋２                  ２×１０＝８×２＋４   
//　　　　２×１０＝７×２＋６                  ４×１０＝８×５＋０   
//　　　　６×１０＝７×８＋４
//　　　　４×１０＝７×５＋５
//　　　　５×１０＝７×７＋１
//　　　　１×１０＝７×１＋３
//　　　　・・・
//
////////////////////////////////////////////////////////////////////////////////

class j174 {
  public static void main(String args[]) {

    int a,b; 
    int n; // 求める桁数。
    int d[] = new int[101]; // 求める分数。

    a = 1; b = 7;
    n = 100;
    System.out.println(a + "/" + b);
    for( int i=1; i<=n; i++ ) {
      a = a*10; d[i] = a/b; a = a%b;
    }

    // 分数の表示。
    int j = 0;
    for( int i=1; i<=n; i++ ) {  
      System.out.print(d[i]); 
      j++;
      if( j%5 == 0 ) { System.out.print(" "); } 
      if( j%50 == 0 ) { System.out.println(); }
    } 
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j174.java
% java j174
1/7
14285 71428 57142 85714 28571 42857 14285 71428 57142 85714
28571 42857 14285 71428 57142 85714 28571 42857 14285 71428
</pre>

</body>
</html>
*/
