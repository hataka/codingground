// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j192a.java 
 * created : Time-stamp: <09/06/30(火) 17:08:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j192a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j192a.java >>
//
//  基礎（９）：キーボードから入力（方法１、整数入力）
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;  

class j192a {
  public static void main(String args[]) {
 
    // キーボードから入力する準備。
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 整数を読込むループ。
    String line;
    while( true ) {
      try {
        System.out.print("データを入力して下さい：");
        // １行分の読込み。
        line = br.readLine();
        if( line == null ) { break; }
        // 整数へ変換。
        int i = Integer.parseInt(line);
        System.out.println("入力データ：" + i);
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
% javac j192a.java
% java j192a
データを入力して下さい：12
入力データ：12
データを入力して下さい：345
入力データ：345
データを入力して下さい：^Z
</pre>

</body>
</html>
*/
