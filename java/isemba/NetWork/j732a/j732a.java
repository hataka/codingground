<!--====================================================================-->
<!-- << j732a.htm >>                                                    -->
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
// << j732a.java >>
//
//  ネットワーク（３）：マルチスレッドサーバ
//
//　　サーバはクライアントからのメッセージをそのままクライアントに返す。
//    親サーバはクライアントからの接続を受けると子サーバを作成し処理を任せ、
//　　次のクライアントからの接続を待つ。
//　　したがって、一度に複数のクライアントに対応できる。
//
//　●Threadクラスのメソッド　
//    public final void setName(String name)
//　　　機能：スレッドの名前をnameに設定する。
//    public final String getName()
//　　　機能：スレッドの名前を取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

// 親サーバの定義。
class Server extends Thread {

  ServerSocket ss;
  int num = 0; // 子サーバを識別するための番号。

  Server(int port) { // コンストラクタ。
    try {
      ss = new ServerSocket(port);
    } catch( Exception e ) {
      System.out.println(e);
    }
  }

  public void run() {
    try {
      while( true ) {
        // クライアントからの接続を待つ。接続されると新たにソケットを作成する。
        Socket cs = ss.accept();

        // 子サーバの作成。
        ChildServer childserver = new ChildServer(cs);
        num++;
        String t = "子サーバ(" + num + ")";
        childserver.setName(t);

        // 子サーバ起動。
        childserver.start();
        System.out.println(t + "起動");     
      }
    } catch( Exception e ) { 
      System.out.println("Server:"+e);
    }
  }
}

// 子サーバの定義。
class ChildServer extends Thread {

  Socket s;
  BufferedReader br;
  PrintWriter pw;

  ChildServer(Socket s) { // コンストラクタ。
    this.s = s;
    try { // クライアントとの入力・出力ストリームをソケットから作成。
      br = new BufferedReader(new InputStreamReader(s.getInputStream(),
                                                    "JISAutoDetect"));
      pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
    } catch( Exception e ) {
      System.out.println(e);
    }
  }

  public void run() {
    String line;
    try { 
      // クライアントとの送受信。文字列endで終了。
      String t = this.getName();
      while( (line = br.readLine()) != null ) {
        System.out.println(t + line);
        pw.println(line); pw.flush();
        if( line.equals("end") ) { break; }
      }
      System.out.println(t + "終了");

      // 入出力ストリームを閉じる。
      br.close(); pw.close();
      // ソケットを閉じる。
      s.close();

    } catch (Exception e ) {
      System.out.println("ChildServer:" + e);
    }
  }
}

public class j732a {
  public static void main(String args[]) {

    // コマンドラインからポート番号args[0]を取得する。 
    int port = Integer.parseInt(args[0]);

    // マルチスレッドサーバの作成。
    Server server = new Server(port);

    // マルチスレッドサーバの起動。
    server.start();
    System.out.println("マルチスレッドサーバ起動");
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
子サーバ(2)bbb
子サーバ(2)end
子サーバ(2)終了
子サーバ(3)起動
子サーバ(3)ccc
子サーバ(3)end
子サーバ(3)終了
</pre>

<font size=3 color=blue>［クライアント側］</font>

<pre>
% java j723 localhost 3333
Readerスレッド開始
Writerスレッド開始
aaa
aaa
end
end
Readerスレッド、Writerスレッド終了

% java j723 localhost 3333
Readerスレッド開始
Writerスレッド開始
bbb
bbb
end
end
Readerスレッド、Writerスレッド終了

% java j723 localhost 3333
Readerスレッド開始
Writerスレッド開始
ccc
ccc
end
end
Readerスレッド、Writerスレッド終了
</pre>

</body>
</html>
