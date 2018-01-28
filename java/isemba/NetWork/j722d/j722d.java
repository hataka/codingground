<!--====================================================================-->
<!-- << j722d.htm >>                                                    -->
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
// << j722d.java >>
//
//  ネットワーク（２）：正しく動作しないクライアント
//
//　　プロンプトを表示しコマンド入力を待つ。
//　　コマンドの入力後、サーバにコマンドを送信し、サーバからのデータを受信する。
//　　この動作を繰り返す。
//
//　　問題点：サーバとの接続が行われ、その後にサーバとの送受信が交互に行われる。
//　　　　　　しかし、キーボードから入力を待つ間、サーバからの受信はできない。
//　　　　　　すなわち、不規則に送受信が行われる場合、対応できなくなる。
//　　　　　　
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j722d {
  public static void main(String args[]) {

    try { 
      // サーバ名とポート番号を取得する。
      String server = args[0];
      int port = Integer.parseInt(args[1]);

      // (手順１)サーバ名とポート番号を指定しソケットを作成。
      Socket s = new Socket(server, port); 

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
      String line;
      while( true ) {
        System.out.print("> ");      // プロンプトの表示。
        line = kb.readLine();        // キーボードから１行読み込む。空行で終了。
        if( line.length() == 0 ) { break; }                        
        pw.println(line);            // サーバに送信。         
        pw.flush();                  // 強制的に出力を行う。       
        while( (line = br.readLine()) != null ) {
          System.out.println(line);  // 標準出力(画面)に表示。        
        }
      }

      // (手順４)入出力ストリームを閉じる。
      // ソケットを閉じる。
      brs.close(); isr.close(); is.close();
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

</body>
</html>
