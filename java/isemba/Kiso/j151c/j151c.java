// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j151c.java 
 * created : Time-stamp: <09/06/30(火) 16:44:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j151c.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j151c.java >>
//
//  基礎（５）：制御構造（for文、ラベル付きbreak文、ラベル付きcontinue文）
//
//  ●ラベル付きbreak文
//　　現在のループを中断し、ラベルの付いたブロックから抜ける。
//
//　●ラベル付きcontinue文
//　　ラベルの付けられたループから繰り返す。
//
////////////////////////////////////////////////////////////////////////////////

class j151c {
  public static void main(String args[]) {

    int i,j;

    // ラベル付きbreak文の動作確認。    
    System.out.println("ラベル付きbreak文の動作確認");
  next1:
    for( i=1; i<=5; i++ ) {
      for( j=1; j<=3; j++ ) {
        System.out.println("i=" + i + " j=" + j);
        if( i+j >= 4 ) { 
          System.out.println("ラベル付きbreak文実行");
          break next1;
        } 
      }
    }
    System.out.println();

    // continue文の動作確認。    
    System.out.println("ラベル付きcontinue文の動作確認");
  next2:
    for( i=1; i<=5; i++ ) {
      for( j=1; j<=3; j++ ) {
        System.out.println("i=" + i + " j=" + j);
        if( i+j >= 4 ) { 
          System.out.println("ラベル付きcontinue文実行");
          continue next2;
        } 
      }
    }
  }
}    
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j151c.java
% java j151c
ラベル付きbreak文の動作確認
i=1 j=1
i=1 j=2
i=1 j=3
ラベル付きbreak文実行

ラベル付きcontinue文の動作確認
i=1 j=1
i=1 j=2
i=1 j=3
ラベル付きcontinue文実行
i=2 j=1
i=2 j=2
ラベル付きcontinue文実行
i=3 j=1
ラベル付きcontinue文実行
i=4 j=1
ラベル付きcontinue文実行
i=5 j=1
ラベル付きcontinue文実行
</pre>

</body>
</html>

*/
