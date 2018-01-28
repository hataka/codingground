<!--====================================================================-->
<!-- << j731a.htm >>                                                    -->
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
// << j731a.java >>
//
//  ネットワーク（３）：サーバ
//
//  ●サーバの機能
//　　(1) クライアントからの接続。
//    (2) クライアントに１行分のデータを送信。
//    (3) クライアントとの接続を切る。
//
//　　クライアントからの接続があると、接続順と現在時刻を返すサーバ。
//
//  　一度に対応できるクライアントは１個。処理中に接続してきたクライアントは、
//　　待ち行列に入れられる。待ち行列が埋まっている場合、接続は拒否される。
//
//　●サーバの書き方
//
//　　class クラス名 {
//      public static void main(String args[]) {
//        try {
//          (手順１)ポート番号と待ち行列の最大個数を指定してサーバソケットを
//　　　　　　　　　作成。
//          while( true ) {
//            System.out.println("サーバ待機中");  
//　　　　    (手順２)クライアントからの接続を待つ。接続後、新たなソケットを作成。
//　　　　　  (手順３)ソケットに入出力ストリームを設定。
//　　　　  　(手順４)クライアントとの送受信。
//　　　　　  (手順５)入出力ストリームを閉じる。
//　　　　　  (手順６)ソケットを閉じる。
//          }
//        } catch ( Exception e ) {
//          例外処理メッセージ
//        }
//      }
//    }
//
//  ●ServerSocketクラスのコンストラクタ
//　　public ServerSocket(int port, int n) throws IOException
//      機能：ポート番号portと待ち行列に入れるクライアントの最大個数nをもつ
//    　　　　サーバソケットを作成する。
//
//  ●ServerSocketクラスのメソッド
//    public Socket accept() throws IOException
//      機能：クライアントからの接続があるまで待ち続け、受け付けるとソケットを
//　　　　　　返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;
import java.util.*;

class j731a {
  public static void main(String args[]) {

    try { 
      // コマンドラインからポート番号args[0]を取得する。
      int port = Integer.parseInt(args[0]); 
      int n = 5; 

      // (手順１)ポート番号と待ち行列の最大個数を指定してサーバソケットを作成。
      ServerSocket ss = new ServerSocket(port,n);

      int num = 0; // 接続順の初期設定。

      while( true ) {
        System.out.println("サーバ待機中");  

        // (手順２)クライアントからの接続を待ち。接続後、新たなソケットを作成。
        Socket cs = ss.accept();             

        // 接続番号を表示。     
        num ++; System.out.print(num+"番目の接続　");  
        // クライアントのホスト名と接続時刻を表示。     
        String host = cs.getInetAddress().getHostName();                       
        System.out.print("クライアント(" + host + ")　");           
        Date time = new Date();
        System.out.println("時刻：" + time);

        // (手順３)ソケットに入出力ストリームを設定。
        PrintWriter pw =                                                      
               new PrintWriter(new OutputStreamWriter(cs.getOutputStream()));  

        // (手順４)クライアントとの送受信。 クライアントへ接続順と接続時刻を送信。
        pw.println(num + "番目の接続　" + time); 
        pw.flush(); // 強制的に出力。                                       

        // (手順５)入出力ストリームを閉じる。
        pw.close(); 

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
% javac j731a.java

% java j731a 3333
サーバ待機中
1番目の接続　クライアント(localhost)　時刻：Thu Jul 15 16:07:22 JST 2004
サーバ待機中
2番目の接続　クライアント(localhost)　時刻：Thu Jul 15 16:07:54 JST 2004
サーバ待機中
</pre>

<font size=3 color=blue>［クライアント側］</font>

<pre>
% java j723 localhost 3333
Readerスレッド開始
Writerスレッド開始
1番目の接続　Thu Jul 15 16:07:22 JST 2004
Ctrl-C

% java j723 localhost 3333
Readerスレッド開始
2番目の接続　Thu Jul 15 16:07:54 JST 2004
Writerスレッド開始
Ctrl-C
</pre>

</body>
</html>
