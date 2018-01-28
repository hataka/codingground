// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j702.java 
 * created : Time-stamp: <09/07/03(金) 08:43:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j702.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j702.java >>
//
//  ネットワーク（０）：基礎（リモートホストのホスト名とＩＰアドレス）
//
//　　リモートホスト名（またはＩＰアドレス）はコマンドラインから入力し、
//　　ＩＰアドレス（またはリモートホスト名）を取得する。
//
//　●InetAddressクラスのメソッド
//    static InetAddress getByName(String host)
//      機能：ホスト名hostのオブジェクトを取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;

class j702 {
  public static void main(String args[]) {

    try { 
      // コマンドラインからリモートホスト名(args[0])を読み込み接続する。
      InetAddress a = InetAddress.getByName(args[0]);

      // リモートホストのホスト名を表示。
      System.out.println("ホスト名　："+a.getHostName());

      // リモートホストのIPアドレスを表示。
      System.out.println("IPアドレス："+a.getHostAddress());

    } catch ( UnknownHostException e ) {
      System.out.println(e);
    } 
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j702.java
% java j702 hcs.ipc.ibaraki.ac.jp
ホスト名　：hcs.ipc.ibaraki.ac.jp
IPアドレス：157.80.75.51

% java j702 mcs.ipc.ibaraki.ac.jp
ホスト名　：mcs.ipc.ibaraki.ac.jp
IPアドレス：157.80.76.51

% java j702 127.0.0.1
ホスト名　：localhost
IPアドレス：127.0.0.1

% java j702 157.80.82.35
ホスト名　：jubilo.cis.ibaraki.ac.jp
IPアドレス：157.80.82.35
</pre>

</body>
</html>


*/
