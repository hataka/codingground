// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j151b.java 
 * created : Time-stamp: <09/06/30(火) 16:42:23 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j151b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j151b.java >>
//
//  基礎（５）：制御構造（for文、break文、continue文）
//
//  ●break文
//　　現在のループを中断し、現在のループから抜け、直後の文に進む。
//
//　●continue文
//　　現在のループにおいて、残りの処理をせずにつぎの繰り返しに進む。
//
////////////////////////////////////////////////////////////////////////////////

public class j151b {
  public static void main(String args[]) {

    int i,j;

    // break文の動作確認。    
    System.out.println("break文の動作確認");
    for( i=1; i<=5; i++ ) {
      System.out.println(" i=" + i);
      if( i >= 3 ) { break; } 
      System.out.println("-----");
    }
    System.out.println("ループ脱出後のiの値：" + i);
    System.out.println();

    // continue文の動作確認。    
    System.out.println("continue文の動作確認");
    for( j=1; j<=5; j++ ) {
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
% javac j151b.java
% java j151b
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
ループ脱出後のjの値：6
</pre>

</body>
</html>
*/
