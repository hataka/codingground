// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j701.java 
 * created : Time-stamp: <09/07/02(木) 21:44:09 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j701.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j701.java >>
//
//  ネットワーク（０）：基礎（ローカルホストのホスト名とＩＰアドレス）
//
//　　ローカルホストのホスト名とＩＰアドレスを取得する。
//
//　●InetAddressクラス
//    インターネットアドレスを取得するときに、InetAddressクラスを使う。
//　　パッケージ(java.netパッケージ)に含まれる。
//
//　●InetAddressクラスのメソッド
//    public static InetAddress getLocalHost() throws UnknownHostException
//      機能：ローカルホストを表すオブジェクトを取得する。
//    public String getHostName()
//      機能：IPアドレスに対応するホスト名を取得する。
//    public String getHostAddress()
//      機能：テキスト表現のIPアドレス文字列を取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;

class j701 {
  public static void main(String args[]) {

    try { 
      // ローカルホストを表すオブジェクトを取得。
      InetAddress a = InetAddress.getLocalHost();

      // ローカルホストのホスト名を表示。
      System.out.println("ホスト名　：" + a.getHostName());

      // ローカルホストのIPアドレスを表示。
      System.out.println("IPアドレス：" + a.getHostAddress());

    } catch ( UnknownHostException e ) {
      System.out.println(e);
    } 
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j701.java
% java j701
ホスト名　：hcs.ipc.ibaraki.ac.jp
IPアドレス：157.80.75.51
</pre>

</body>
</html>
*/
