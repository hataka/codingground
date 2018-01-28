<!--====================================================================-->
<!-- << j731b.htm >>                                                    -->
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
// << j731b.java >>
//
//  ネットワーク（３）：サーバ
//
//  ●サーバの機能
//　　(1) クライアントからの接続。
//    (2) クライアントから１行分のデータを受信。
//    (3) クライアントに１行分のデータを送信。
//    (4) (2),(3)を繰り返す。
//
//  　一度に対応できるクライアントは１個。処理中に接続してきたクライアントは、
//　　待ち行列に入れられる。待ち行列が埋まっている場合、接続は拒否される。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j731b {
  public static void main(String args[]) {

    try { 
      // コマンドラインからポート番号args[0]を取得する。
      int port = Integer.parseInt(args[0]);
      // 待ち行列の最大個数を設定。
      int n = 5; 

      // (手順１)ポート番号と待ち行列の最大個数を指定してサーバソケットを作成。
      ServerSocket ss = new ServerSocket(port, n);

      while( true ) {
        System.out.println("サーバ待機中");       

        // (手順２)クライアントからの接続を待つ。接続後、新たなソケットを作成。
        Socket cs = ss.accept();                                               

        // クライアントのホスト名を表示。                                      
        String chost = cs.getInetAddress().getHostName();                       
        System.out.println("接続クライアント(" + chost + ")");           

        BufferedReader br =                                                    
               new BufferedReader(new InputStreamReader(cs.getInputStream(),
                                                         "JISAutoDetect")); 

        // (手順３)ソケットに入出力ストリームを設定。
        PrintWriter pw =                                                      
               new PrintWriter(new OutputStreamWriter(cs.getOutputStream()));  

        // (手順４)クライアントとの送受信。
        String line;                                                           
        while( (line = br.readLine()) != null ) {                              
          System.out.println(line); // 標準出力(画面)に表示。      
          pw.println(line);         // クライアントに送信。           
          pw.flush();               // 強制的に出力。                    
        }                                                                      

        // (手順５)入出力ストリームを閉じる。
        br.close(); pw.close();

        // (手順６)ソケットを閉じる。
        cs.close(); 
      }

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
}
</pre>

<font size=5 color=blue>実行結果</font>
<br><br>

<font size=3 color=blue>［サーバ側］</font>

<pre>
% javac j731b.java

% java j731b 3333
サーバ待機中
接続クライアント(localhost)
abc
日本語
end
サーバ待機中
</pre>

<font size=3 color=blue>［クライアント側］</font>

<pre>
% java j723 localhost 3333
Readerスレッド開始
Writerスレッド開始
abc
abc
日本語
日本語
end
end
Readerスレッド、Writerスレッド終了
</pre>

</body>
</html>
