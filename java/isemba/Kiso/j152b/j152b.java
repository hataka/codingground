// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j152b.java 
 * created : Time-stamp: <09/06/30(火) 16:48:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j152b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j152b.java >>
//
//  基礎（５）：制御構造（while文、break文、continue文）
//
//  ●break文
//　　現在のループを中断し、現在のループから抜け、直後の文に進む。
//
//　●continue文
//　　現在のループにおいて、残りの処理をせずにつぎの繰り返しに進む。
//
////////////////////////////////////////////////////////////////////////////////

class j152b {
  public static void main(String args[]) {

    // break文の動作確認。
    System.out.println("break文の動作確認");
    int i = 0;
    while( i < 5 ) {
      i = i + 1;
      System.out.println(" i=" + i);
      if( i >= 3 ) { break; }
      System.out.println("-----");
    }
    System.out.println("ループ脱出後のiの値：" + i);
    System.out.println();

    // continue文の動作確認。
    System.out.println("continue文の動作確認");
    int j = 0;
    while( j < 5 ) {
      j = j + 1;
      System.out.println(" j=" + j);
      if( j >= 3 ) { continue; }
      System.out.println("-----");
    }
    System.out.println("ループ脱出後のjの値：" + j);
  }
}    
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j152b.java
% java j152b
break文の動作確認
 i=1
-----
 i=2
-----
 i=3
ループ脱出後のiの値：3

continue文の動作確認
 j=1
-----
 j=2
-----
 j=3
 j=4
 j=5
ループ脱出後のjの値：5
</pre>

</body>
</html>
*/
