// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j173.java 
 * created : Time-stamp: <09/06/30(火) 16:54:54 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j173.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j173.java >>
//
//  基礎（７）：２のｎ乗の計算
//
//      各桁を配列要素に対応させ（10のk乗の桁を配列要素d[k]に対応させる）、
//　　　筆算をまねて計算する。
//
////////////////////////////////////////////////////////////////////////////////

class j173 {
  public static void main(String args[]) {

    int n; 
    int d[] = new int[1000]; // 求める２のn乗。
    int k; // 計算途中における最高位の桁。
    int w; // 下位の桁からの桁上がり。

    n = 1000;
    System.out.println("２の" + n + "乗");
    d[0] = 1; k = 0;
    for( int i=1; i<=n; i++ ) {
      w = 0;
      for( int j=0; j<=k; j++ ) {
        w = d[j] * 2 + w; d[j] = w%10; w = w/10;
      }
      // 最高位の桁kの調整。
      while( w > 0 ) { k++; d[k] = w%10; w = w/10; }
    }

    // ２のｎ乗の表示。
    int j = 0;
    for( int i=k; i>=0; i-- ) {  
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
% javac j173.java
% java j173
２の1000乗
10715 08607 18626 73209 48425 04906 00018 10561 40481 17055
33607 44375 03883 70351 05112 49361 22493 19837 88156 95858
12759 46729 17553 14682 51871 45285 69231 40435 98457 75746
98574 80393 45677 74824 23098 54210 74605 06237 11418 77954
18215 30464 74983 58194 12673 98767 55916 55439 46077 06291
45711 96477 68654 21676 60429 83165 26243 86837 20566 80693
76
</pre>

</body>
</html>
*/
