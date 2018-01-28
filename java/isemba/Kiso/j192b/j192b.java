// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j192b.java 
 * created : Time-stamp: <09/06/30(火) 17:08:56 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j192b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j192b.java >>
//
//  基礎（９）：キーボードから入力（方法２、実数入力）
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;  

class j192b {
  public static void main(String args[]) {
 
    // キーボードから入力する準備。
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 実数を読込むループ。
    while( true ) {
      try {
        System.out.print("データを入力して下さい：");
        // １行分の読込み。
        String line = br.readLine();
        if( line == null ) { break; }
        // 実数へ変換。
        double d = Double.parseDouble(line);
        System.out.println("入力データ：" + d);
      } catch (Exception e) {
        System.out.println(e);
      }
    } 
  } 
} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j192b.java
% java j192b
データを入力して下さい：12.34
入力データ：12.34
データを入力して下さい：-5678.9
入力データ：-5678.9
データを入力して下さい：^Z
</pre>

</body>
</html>
*/
