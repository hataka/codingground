// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j721.java 
 * created : Time-stamp: <09/07/03(金) 12:58:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j721.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j721.java >>
//
//  ネットワーク（２）：ソケット（基礎）
//
//　　ソケットを使うと、ローカルホスト(手元のコンピュータ)とリモートホスト
//　　(ネットワーク上の他のコンピュータ)の間で、データを交換できるようになる。
//    すなわち、２つのコンピュータは、ソケットを介して通信を行う。
//
//　　ソケットを作成するには、リモートホスト名、リモートホスト側のポート番号、
//　　ローカルホスト名、ローカルホスト側のポート番号が必要である。
//
//　　ローカルホスト側では、リモートホストのホスト名とポート番号を指定して
//　　ソケットを作成する。ローカルホスト側でローカルホスト名は自明、ポート番号は
//　　ソケットを作成する都度、自動的に割り当てられる。
//
//  ●java.net.Socketクラス
//    コンピュータ間で、通信をするときに使用するソケットを実装したクラス。
//
//  ●Socketクラスのコンストラクタ
//    public Socket(String host, int port) throws UnknownHostException,
//                                                IOException
//      機能：ソケットを作成し、指定されたホストhost上の指定されたポート番号port
//　　　　　　に接続する。
//
//  ●Socketクラスのメソッド
//    public InetAddress getInetAddress()
//      機能：ソケットのリモートホスト側アドレスを取得する。
//    public InetAddress getLocalAddress()
//      機能：ソケットのローカルホスト側アドレスを取得する。
//　　public int getPort()
//      機能：ソケットのリモートホスト側ポート番号を取得する。
//　　public int getLocalPort()
//      機能：ソケットのローカルホスト側ポート番号を取得する。
//　　public void close() throws IOException
//      機能：ソケットを閉じる。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j721 {
  public static void main(String args[]) {

    try { 
      // コマンドラインから、リモートホスト名(args[0])、ポート番号(args[1])を
      // 取得する。
      String host = args[0];
      int port = Integer.parseInt(args[1]);

      // ソケットの作成。
      Socket s = new Socket(host, port); 

      // リモートホスト側アドレスの取得。 
      InetAddress rhost = s.getInetAddress();
      System.out.println("リモートホスト：" + rhost);
      // リモートホスト側ポート番号の取得。 
      int rport = s.getPort();
      System.out.println("リモートホストのポート番号：" + rport);

      // ローカルホスト側アドレスの取得。
      InetAddress lhost = s.getLocalAddress();
      System.out.println("ローカルホスト：" + lhost);
      // ローカルホスト側ポート番号の取得。
      int lport = s.getLocalPort();
      System.out.println("ローカルホストのポート番号：" + lport);

      // ソケットを閉じる。
      s.close();

    } catch( UnknownHostException e ) {
      System.out.println("リモートホストが見つかりません");
    } catch( Exception e ) {
      System.out.println(e);
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j721.java

% java j721 jubilo.cis.ibaraki.ac.jp 80
リモートホスト：jubilo.cis.ibaraki.ac.jp/157.80.82.35
リモートホストのポート番号：80
ローカルホスト：/157.80.82.52
ローカルホストのポート番号：1039

% java j721 jubilo.cis.ibaraki.ac.jp 80
リモートホスト：jubilo.cis.ibaraki.ac.jp/157.80.82.35
リモートホストのポート番号：80
ローカルホスト：/157.80.82.52
ローカルホストのポート番号：1040

% java j721 jubilo.cis.ibaraki.ac.jp 81
java.net.ConnectException: Connection refused: connect

% java j721 antlers.cis.ibaraki.ac.jp 80
java.net.ConnectException: Connection timed out: connect
</pre>

</body>
</html>
*/
