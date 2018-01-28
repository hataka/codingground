// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j193a.java 
 * created : Time-stamp: <09/06/30(火) 17:10:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j193a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j193a.java >>
//
//  基礎（９）：キーボードから入力（方法２、文字列入力）
//
//　●hasNextLine()メソッド
//　　nextLine()が実行可能の場合true、実行不可能の場合false。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;  

class j193a {
  public static void main(String args[]) {
 
    // キーボードから入力する準備。
    Scanner sc = new Scanner(System.in);

    // 文字列を読込むループ。
    try {
      while( sc.hasNextLine() ) {
        String s = sc.nextLine();
        System.out.println("入力データ：" + s);
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
% javac j193a.java
% java j193a
abcd efg
入力データ：abcd efg
123456789 ABCD
入力データ：123456789 ABCD
^Z
</pre>

</body>
</html>
*/
