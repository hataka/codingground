// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j713.java 
 * created : Time-stamp: <09/07/03(金) 09:42:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j713.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j713.java >>
//
//  ネットワーク（１）：URLConnectionクラスを使ってURLに関する情報を表示
//
//　　URLConnectionクラスを使って、URLに関する情報を取得する。
//
//　●URLクラスのメソッド
//    public URLConnection openConnection() throws IOException
//      機能：URLへの接続を表すURLConnectionクラスのオブジェクトを取得。
//
//  ●URLConnectionクラス
//    アプリケーションとURL間の通信リンクを表すすべてのクラスのスーパークラス
//　　である。このクラスのオブジェクトを使って、URLで参照するリソースへの入出力
//　　ができる。
//
//　●URLConnectionクラスのメソッド
//    public String getContentType()
//    　機能：content-typeヘッダの値を取得。
//    public int getContentLength()
//    　機能：content-lengthヘッダの値を取得。
//    public long getDate()
//    　機能：dateヘッダの値を取得。  
//            戻り値はグリニッジ標準時 1970年1月1日から起算したミリ秒数
//    public long getLastModified()
//    　機能：last-modifiedヘッダの値を取得。
//            戻り値はグリニッジ標準時 1970年1月1日から起算したミリ秒数
//
//  ●Dateクラスのコンストラクタ
//　　public Date(long t) 
//      機能：1970年1月1日から経過したミリ秒t（long型で格納）を日付時刻の
//            文字列に変換する。
// 
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;
import java.util.Date;

class j713 {
  public static void main(String args[]) {

    try { 
      // URLクラスのオブジェクトを取得。
      URL url = new URL(args[0]); // args[0]は、URLを表す。
      // URLConnectionクラスのオブジェクトを取得。
      URLConnection urlc = url.openConnection();

      // 各種ヘッダ情報を取得。
      System.out.println("content-typeヘッダ  :" + urlc.getContentType());
      System.out.println("content-lengthヘッダ:" + urlc.getContentLength());
      System.out.println("dateヘッダ          :" + (new Date(urlc.getDate())));
      System.out.println("last-modifiedヘッダ :" +
                         (new Date(urlc.getLastModified())));

    } catch ( IOException e ) {
      System.out.println(e);
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j713.java
% java j713 http://www.ibaraki.ac.jp/index.html
content-typeヘッダ  :text/html; charset=none
content-lengthヘッダ:919
dateヘッダ          :Mon Jul 12 16:02:20 JST 2004
last-modifiedヘッダ :Thu Apr 01 10:15:51 JST 2004
</pre>

</body>
</html>
*/
