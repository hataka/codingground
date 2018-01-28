// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j712.java 
 * created : Time-stamp: <09/07/03(金) 09:03:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j712.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j712.java >>
//
//  ネットワーク（１）：URLクラスを使ったファイルのダウンロード
//
//　　URLで指定したファイルをダウンロードし、画面に表示する。
//
//　   (注意)URLクラスでは、URLの内容のみ取得できる。ヘッダ(ファイルの種類や
//　　　　　バイト数など)を取得するには、URLConnectionクラスを使う。
//
//    ホームページなどのファイル中に漢字が含まれていると、漢字にはJIS、EUC、
//　　シフトJISのいずれかのコードが使われているので、読み込むときにどのコード
//　　であるか判断する必要がある。違っていると文字化けの原因になる。
//　　JISAutoDetectを指定しておくと文字コードが自動的に判別される。
//　　読み込まれた文字はUnicodeという文字コード(１文字16ビット)に変換される。
//
//　●URLクラスのメソッド
//    public final InputStream openStream() throws IOException
//      機能：URLで参照される情報資源に接続し、バイト入力ストリームInputStream
//　　　　　　を返す。
//
//　●InputStreamReaderクラス
//　　このクラスを使って、バイトストリームから文字ストリームへの変換ができる。
//　　バイトデータを読み込み、指定されたcharsetを使用して文字に変換する。
//
//　●InputStreamReaderクラスのコンストラクタ
//　  public InputStreamReader(InputStream is, Charset cs)
//　　　機能：与えられた文字エンコーディングcsを使って、InputStreamReaderを
//　　　　　　作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j712 {
  public static void main(String args[]) {

    try { 
      URL url = new URL(args[0]); // args[0]は、URLを表す。
 //     URL url = new URL("http://www.ibaraki.ac.jp/"); // args[0]は、URLを表す。
      InputStream is = url.openStream();

      // バイト入力ストリームを文字入力ストリームに変換する。
      // 文字エンコーディングは、JISAutoDetectを指定すると、自動的に判断される。
      InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");

      // 文字入力を行単位で入力できるようにする。
      BufferedReader br = new BufferedReader(isr); 

      // １行づつ読み込み、画面に出力する。
      String line;
      while( (line  = br.readLine()) != null ) {
        System.out.println(line);
      }

      // 入力ストリームを閉じる。
      is.close(); 
      isr.close(); 
      br.close();

    } catch( Exception e ) {
      System.out.println(e); 
    } 
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j712.java
% java j712 http://www.ibaraki.ac.jp/

  Webページ(http://www.ibaraki.ac.jp/index.html)がダウンロードされる。
</pre>

</body>
</html>
*/
