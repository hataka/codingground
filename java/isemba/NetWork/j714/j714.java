// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j714.java 
 * created : Time-stamp: <09/07/03(金) 10:30:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j714.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j714.java >>
//
//  ネットワーク（１）：URLConnectionクラスを使ったファイルのダウンロード
//
//　　URLで指定したファイルをダウンロードし、画面に表示する。
//
//  　ホームページなどのファイル中に漢字が含まれていると、漢字にはJIS、EUC、
//　　シフトJISのいずれかのコードが使われているので、読み込むときにどのコード
//　　であるか判断する必要がある。違っていると文字化けの原因になる。
//　　JISAutoDetectを指定しておくと文字コードが自動的に判別される。
//　　読み込まれた文字はUnicodeという文字コード(１文字16ビット)に変換される。
//
//　●URLConnectionクラスのメソッド
//    public InputStream getInputStream() throws IOException
//    　機能：接続からの入力を受け取るバイト入力ストリームInputStreamを取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j714 {
  public static void main(String args[]) {

    try { 
      // URLクラスのオブジェクトを作成。
      URL url = new URL(args[0]); // args[0]は、URLを表す。

      // URLConnectionクラスのオブジェクトを作成。
      URLConnection urlc = url.openConnection();

      // InputStreamクラスのオブジェクトを作成。
      InputStream is = urlc.getInputStream();

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
      br.close();
      isr.close();
      is.close(); 

    } catch( Exception e ) {
      System.out.println(e); 
    } 
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j714.java
% java j714 http://www.ibaraki.ac.jp/

  Webページ(http://www.ibaraki.ac.jp/index.html)がダウンロードされる。
</pre>

</body>
</html>
*/
