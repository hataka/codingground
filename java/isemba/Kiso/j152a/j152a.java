// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j152a.java 
 * created : Time-stamp: <09/06/30(火) 16:46:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j152a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j152a.java >>
//
//  基礎（５）：制御構造（while文）
//
//  ●while文
//
//      while(条件式) {
//        処理
//      }
//
//      ・条件式がtrueである間、処理を繰り返す。
//
////////////////////////////////////////////////////////////////////////////////

class j152a {
  public static void main(String args[]) {

    // while文の動作確認。
    System.out.println("while文の動作確認");
    int i = 0;
    while( i < 5 ) {
      i = i + 1;
      System.out.println(" i=" + i);
    }
    System.out.println("ループ脱出後のiの値：" + i);
  }
}    
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j152a.java
% java j152a
while文の動作確認
 i=1
 i=2
 i=3
 i=4
 i=5
ループ脱出後のiの値：5
</pre>

</body>
</html>
*/
