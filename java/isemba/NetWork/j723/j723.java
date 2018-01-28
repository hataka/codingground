<!--====================================================================-->
<!-- << j723.htm >>                                                     -->
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
// << j723.java >>
//
//  ネットワーク（２）：マルチスレッドクライアント
//
//　　キーボードからの入力を処理するスレッド(Writer)とサーバからの受信を画面に
//　　出力するスレッド(Reader)を作る。
//    入力と出力を別のスレッドで行うため、サーバからデータがどのような
//　　タイミングで送られてきても対応できる。
//    　　　　
//  ●Threadクラスのメソッド
//　　public final void setPriority(int p)
//      機能：優先順位をpに変更する。値pが大きいほど優先順位が高い。
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

// スレッド(Reader)の定義。
class Reader extends Thread {

  Socket s;
  BufferedReader br; 

  Reader(Socket s) { // コンストラクタ。
    this.s = s;
    try { // ソケット用の入力ストリームを設定。 
      br = new BufferedReader(new InputStreamReader(s.getInputStream(),
                                                    "JISAutoDetect"));
    } catch( Exception e ) {
      System.out.println(e); 
    }
  }

  public void run() {
    System.out.println("Readerスレッド開始");
    try {
      String line;
      while( br != null ) { // 入力ストリームから１行読み込み表示する。
        line = br.readLine(); 
        if( line != null ) { 
          System.out.println(line); 
          if( line.equals("end") ) { br = null; }
        }
      } 
    } catch( Exception e ) { 
      System.out.println("Reader:" + e); 
    }
  }
}

// スレッド(Writer)の定義。
class Writer extends Thread {

  Socket s;
  BufferedReader kb;
  PrintWriter pw;

  Writer(Socket s) { // コンストラクタ。
    this.s = s;
    try {
      // ソケット用の出力ストリームを設定。 
      pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
      // キーボードからの入力ストリームを設定。
      kb = new BufferedReader(new InputStreamReader(System.in));
    } catch( Exception e ) { 
      System.out.println(e); 
    }
  }

  public void run() {
    System.out.println("Writerスレッド開始");
    try {
      String line;
      while( pw != null ) { // キーボードから１行読み込む。endで終了。
        line = kb.readLine(); 
        pw.println(line);
        pw.flush();
        if( line.equals("end") ) { pw = null; }
      } 
    } catch( Exception e ) {
      System.out.println("Writer:" + e); 
    }
  }
}

class j723 {
  public static void main(String args[]) {

    try { 
      // コマンドラインから、サーバ名args[0]、ポート番号args[1]を取得する。
      String server = args[0];
      int port = Integer.parseInt(args[1]);

      // ソケットの作成。
      Socket s = new Socket(server, port); 

      // スレッドの作成。
      Thread reader = new Reader(s); 
      Thread writer = new Writer(s);

      // 優先度の変更。readerに高い優先度を与える。 
      reader.setPriority(6); 
      writer.setPriority(5);

      // スレッドの起動。
      reader.start(); 
      writer.start();

      // Writerスレッド、Readerスレッドの終了を待つ。
      writer.join(); 
      reader.join();
      System.out.println("Readerスレッド、Writerスレッド終了");

      // ソケットを閉じる。
      s.close();        

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j723.java

% java j723 jubilo.cis.ibaraki.ac.jp 7
Readerスレッド開始
Writerスレッド開始
abc
abc
日本語
日本語
end
Readerスレッド、Writerスレッド終了

% java j723 jubilo.cis.ibaraki.ac.jp 13
Readerスレッド開始
Thu Jul 15 12:22:16 2004
Writerスレッド開始
end
Readerスレッド、Writerスレッド終了
</pre>

</body>
</html>
