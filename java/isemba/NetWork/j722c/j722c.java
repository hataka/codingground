<!--====================================================================-->
<!-- << j722c.htm >>                                                    -->
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
// << j722c.java >>
//
//  ネットワーク（２）：クライアント
//
//  ●クライアントの機能
//　　(1) サーバに接続。
//    (2) サーバに１行分のデータを送信。
//    (3) サーバから複数行分のデータを受信。
//    (4) 終了。
//
//　　httpプロトコルが対応する。
//　　Webサーバに接続し、キーボードから指定したWebページを受信・画面に表示する。
//
//    コマンド(GET /)を送信すると、Webサーバのホームページが送られてくる。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j722c {
  public static void main(String args[]) {

    try { 
      // コマンドラインから、サーバ名(args[0])を取得する。
      // ポート番号は80と決まっている。
      String server = args[0];
      int port = 80;

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

      // (手順３)サーバとの送受信。
      System.out.print("> ");      // プロンプトの表示。                    
      String line = kb.readLine(); // キーボードから１行読み込む。   
      pw.println(line);            // サーバに送信。                 
      pw.flush();                  // 強制的に出力を行う。           
      while( line != null ) {                                        
        line = br.readLine();      // サーバから１行分受信。          
        System.out.println(line);  // 標準出力(画面)に表示。            
      }                                                              

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
% javac j722c.java

% java j722c jubilo.cis.ibaraki.ac.jp
> GET /

Webサーバ(jubilo.cis.ibaraki.ac.jp)からWebページが送られてくる。
</pre>

</body>
</html>
