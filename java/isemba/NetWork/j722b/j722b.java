<!--====================================================================-->
<!-- << j722b.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
// << j722b.java >>
//
//  ネットワーク（２）：クライアント
//
//  ●クライアントの機能
//　　(1) サーバに接続。
//    (2) サーバに１行分のデータを送信。
//    (3) サーバから１行分のデータを受信。
//    (4) 終了。
//
//　　echoプロトコルが対応し、echoサーバに接続後、キーボードから入力した
//　　文字列を送信し、受信する。
//
//  ●Socketクラスのメソッド
//    public OutputStream getOutputStream() throws IOException
//      機能：このソケットの出力ストリームを取得する。
//
//  ●PrintWriterクラスのコンストラクタ
//　　public PrintWriter(OutputStream os)
//　　　機能：OutputStream osからPrintWriterクラスの出力ストリーム
//            を作成する。行の自動フラッシュは行われない。
//
//  ●PrintWriterクラスのメソッド
//　　public void println(String s)
//　　　機能：文字列sを出力して、行を終了する。
//　　public void flush()
//　　　機能：強制的に書き込み操作を行う。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j722b {
  public static void main(String args[]) {

    try { 
      // コマンドラインから、サーバ名(args[0])を取得する。
      // echoサーバのポート番号は7と決まっている。
      String server = args[0];
      int port = 7;

      // (手順１)サーバ名とポート番号を指定しソケットを作成。
      Socket s = new Socket(server,port); 

      // (手順２)ソケットに入出力ストリームを設定。
      InputStream is = s.getInputStream();
      InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");
      BufferedReader br = new BufferedReader(isr);

      // (手順２)ソケットに入出力ストリームを設定。
      OutputStream os = s.getOutputStream();
      PrintWriter pw = new PrintWriter(os);

      // キーボード用の入力ストリームを設定。
      BufferedReader kb =
             new BufferedReader(new InputStreamReader(System.in));

      //(手順３)サーバとの送受信。
      System.out.print("> ");      // プロンプトの表示。           
      String line = kb.readLine(); // キーボードから１行読み込む。  
      pw.println(line);            // サーバに送信。               
      pw.flush();                  // 強制的に出力を行う。         
      line = br.readLine();        // サーバから１行分受信。       
      System.out.println(line);    // 標準出力(画面)に表示。       

      // (手順４)入出力ストリームを閉じる。
      br.close(); isr.close(); is.close();
      pw.close(); os.close(); 
      kb.close();

      // (手順５)ソケットを閉じる。
      s.close();

    } catch( Exception e ) {
      System.out.println(e);
    }
  }
}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j722b.java

% java j722b jubilo.cis.ibaraki.ac.jp
> abc
abc

% java j722b jubilo.cis.ibaraki.ac.jp
> 日本語
日本語
</pre>

</body>
</html>
