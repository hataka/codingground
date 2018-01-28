// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j193d.java 
 * created : Time-stamp: <09/06/30(火) 17:11:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j193d.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j193d.java >>
//
//  基礎（９）：キーボードから入力（方法２、トークン入力）
//
//　●hasNext()メソッド
//　　next()が実行可能の場合true、実行不可能の場合false。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;  

class j193d {
  public static void main(String args[]) {
 
    // キーボードから入力する準備。
    Scanner sc = new Scanner(System.in);

    // トークンを読込むループ。
    try {
      while( sc.hasNext() ) {
        String s = sc.next();
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
% javac j193d.java
% java j193d
abc 123  def
入力データ：abc
入力データ：123
入力データ：def
^Z
</pre>

</body>
</html>
*/
