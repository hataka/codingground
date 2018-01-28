// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j193c.java 
 * created : Time-stamp: <09/06/30(火) 17:11:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j193c.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j193c.java >>
//
//  基礎（９）：キーボードから入力（方法２、実数入力）
//
//　●hasNextDouble()メソッド
//　　nextDouble()が実行可能の場合true、実行不可能の場合false。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;  

class j193c {
  public static void main(String args[]) {
 
    // キーボードから入力する準備。
    Scanner sc = new Scanner(System.in);

    // 実数を読込むループ。
    try {
      while( sc.hasNextDouble() ) {
        double d = sc.nextDouble();
        System.out.println("入力データ：" + d);
      }
    } catch (Exception e) {
      System.out.println(e);
    } 
  } 
} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j193c.java
% java j193c
12.34
入力データ：12.34
-567.89
入力データ：-567.89
^Z
</pre>

</body>
</html>
*/
