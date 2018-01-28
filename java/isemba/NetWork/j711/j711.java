// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j711.java 
 * created : Time-stamp: <09/07/03(金) 09:00:29 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j711.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j711.java >>
//
//  ネットワーク（１）：URLクラスによるURLのチェック
//
//　　いくつかのURL(Uniform Resource Locator)を指定して、有効かどうか調べる。
//　　有効でないとき例外が送出される。
//　　URLは、ネットワーク上の情報資源の位置を正確に示す。
//
//　●URLクラスのコンストラクタ
//    public URL(String s) throws MalformedURLException
//      機能：URL sからURLオブジェクトを作成。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;

class j711 {
  public static void main(String args[]) {

    try { 
      URL url1 = new URL("http://www.ibaraki.ac.jp/index.html");
      System.out.println(url1);

      URL url2 = new URL("ftp://ftp.ibaraki.ac.jp/");
      System.out.println(url2);

      URL url3 = new URL("mailto://vega.cis.ibaraki.ac.jp/");
      System.out.println(url3);

      URL url4 = new URL("xyz://sava.cis.ibaraki.ac.jp/");
      System.out.println(url4);

    } catch( MalformedURLException e ) {
      System.out.println(e); 
    } 
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j711.java
% java j711
http://www.ibaraki.ac.jp/index.html/
ftp://ftp.ibaraki.ac.jp/
mailto://vega.cis.ibaraki.ac.jp/
java.net.MalformedURLException: unknown protocol: xyz
</pre>

</body>
</html>
*/
