<!--====================================================================-->
<!-- << j732b.htm >>                                                    -->
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
// << j732b.java >>
//
//  ネットワーク（３）：マルチスレッドサーバ実験
//
//　　マルチスレッドサーバに多数のクライアントから接続を実行し処理の様子を見る。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j732b {
  public static void main(String args[]) {

    try { 
      // コマンドラインから、サーバ名args[0]、ポート番号args[1]、
      // 接続回数args[2]を取得する。
      String server = args[0];
      int port = Integer.parseInt(args[1]);
      int n = Integer.parseInt(args[2]);

      for( int i=1; i<=n; i++ ) {
        // (手順１)サーバ名とポート番号を指定しソケットを作成。
        Socket s = new Socket(server,port); 

        // (手順２)ソケットに入出力ストリームを設定。
        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");
        BufferedReader br = new BufferedReader(isr);

        // (手順２)ソケットに入出力ストリームを設定。
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os);

        //(手順３)サーバとの送受信。
        pw.println("aaa");           // サーバに送信。               
        pw.flush();                  // 強制的に出力を行う。         
        String line = br.readLine(); // サーバから１行分受信。       
        System.out.println(line);    // 標準出力(画面)に表示。       
        pw.println("end");           // サーバに送信。               
        pw.flush();                  // 強制的に出力を行う。         

        // (手順４)入出力ストリームを閉じる。
        br.close(); isr.close(); is.close();
        pw.close(); os.close(); 

        // (手順５)ソケットを閉じる。
        s.close();
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
% java j732a 3333
マルチスレッドサーバ起動
子サーバ(1)起動
子サーバ(1)aaa
子サーバ(1)end
子サーバ(1)終了
子サーバ(2)起動
子サーバ(2)aaa
子サーバ(3)起動
子サーバ(2)end
子サーバ(2)終了
子サーバ(3)aaa
子サーバ(3)end
子サーバ(3)終了
子サーバ(4)起動
子サーバ(4)aaa
子サーバ(5)起動
子サーバ(4)end
子サーバ(4)終了
子サーバ(5)aaa
子サーバ(5)end
子サーバ(5)終了
子サーバ(6)起動
子サーバ(6)aaa
子サーバ(6)end
子サーバ(6)終了
</pre>

<font size=3 color=blue>［クライアント側］</font>

<pre>
% javac j732b.java

% java j732b localhost 3333 6
aaa
aaa
aaa
aaa
aaa
aaa
</pre>

</body>
</html>
