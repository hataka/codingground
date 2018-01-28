// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j193b.java 
 * created : Time-stamp: <09/06/30(火) 17:10:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j193b.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j193b.java >>
//
//  基礎（９）：キーボードから入力（方法２、整数入力）
//
//　●hasNextInt()メソッド
//　　nextInt()が実行可能の場合true、実行不可能の場合false。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;  

class j193b {
  public static void main(String args[]) {
 
    // キーボードから入力する準備。
    Scanner sc = new Scanner(System.in);

    // 整数を読込むループ。
    try {
      while( sc.hasNextInt() ) {
        int i = sc.nextInt();
        System.out.println("入力データ：" + i);
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
% javac j193b.java
% java j193b
123
入力データ：123
456789
入力データ：456789
^Z
</pre>

</body>
</html>
*/
