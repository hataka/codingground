// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j722a.java 
 * created : Time-stamp: <09/07/03(金) 13:07:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j722a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j722a.java >>
//
//  ネットワーク（２）：クライアント
//
//  ●クライアントの機能
//　　(1) サーバに接続。
//    (2) サーバから１行分のデータを受信。
//    (3) 終了。
//
//　　daytimeプロトコルが対応し、daytimeサーバに接続し日時を受信する。
//
//　●クライアントの書き方
//
//　　class クラス名 {
//      public static void main(String args[]) {
//        try {
//          (手順１)サーバ名とポート番号を指定しソケットを作成。
//　　　　  (手順２)ソケットに入出力ストリームを設定。
//　　　　  (手順３)サーバとの送受信。
//　　　　  (手順４)入出力ストリームを閉じる。
//　　　　  (手順５)ソケットを閉じる。
//        } catch ( Exception e ) {
//          例外処理メッセージ
//        }
//      }
//    }
//
//  ●Socketクラスのメソッド
//    public InputStream getInputStream() throws IOException
//      機能：このソケットの入力ストリームを取得する。 
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j722a {
  public static void main(String args[]) {

    try { 
      // コマンドラインから、サーバ名(args[0])を取得する。
      // daytimeサーバのポート番号は13と決まっている。
      String server = args[0];
      int port = 13;

      // (手順１)サーバ名とポート番号を指定しソケットを作成。
      Socket s = new Socket(server, port); 

      // (手順２)ソケットに入力ストリームを設定。
      InputStream is = s.getInputStream();
      InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");
      BufferedReader br = new BufferedReader(isr);

      // (手順３)サーバからの受信。
      String line = br.readLine(); // サーバから１行分受信。
      System.out.println("サーバ(" + server + ")の現在時刻：" + line);

      // (手順４)入出力ストリームを閉じる。
      br.close(); isr.close(); is.close();

      // (手順５)ソケットを閉じる。
      s.close();

    } catch( Exception e ) {
      System.out.println(e);
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j722a.java

% java j722a jubilo.cis.ibaraki.ac.jp
サーバ(jubilo.cis.ibaraki.ac.jp)の現在時刻：Thu Jul 15 10:36:14 2004

% java j722a sava.cis.ibaraki.ac.jp
java.net.ConnectException: Connection refused: connect
</pre>

</body>
</html>
*/
