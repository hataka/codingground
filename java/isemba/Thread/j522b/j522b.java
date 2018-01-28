<!--====================================================================-->
<!-- << j522b.htm >>                                                    -->
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
//  << j522b.java >>
//
//  スレッド（２）：スレッドの制御(joinメソッド)
//
//    ９個のスレッドを起動し、すべてのスレッドが終了した後、mainスレッドが
//　　実行を開始する。
//  
//　　（１）スレッド(Thread1)の定義。
//　　（２）スレッドの個数を設定。
//　　（３）スレッドを格納する配列を準備する。
//　　（４）スレッドの作成。
//　　（５）スレッドの実行。
//　　（６）th[i].join()を実行したmainスレッドは、スレッドオブジェクトthが
//　　　　　終了するまで待つ。
//　　（７）１秒間スリープ。
//  
////////////////////////////////////////////////////////////////////////////////

//（１）
class Thread1 extends Thread {
  public void run() {
    String s = this.getName();
    System.out.println("スレッド(" + s + ")開始");
    try {
      Thread.sleep(1000); //（７）
    } catch ( InterruptedException e ) {  }
    System.out.println("スレッド(" + s + ")終了");
  }
}

class j522b {
  public static void main(String args[]) {

    int n = 9; //（２）

    Thread1 th[] = new Thread1[n]; //（３） 
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(); //（４） 
      th[i].start(); //（５）
    }

    String c = Thread.currentThread().getName();
    System.out.println("スレッド" + c + "が" + n + "個のスレッドの終了を待ちます");

    try {
      for( int i=0; i<n; i++ ) {
        th[i].join(); //（６）
      }
    } catch ( InterruptedException e ) { }

    System.out.println("スレッド" + c + "が" + n + "個のスレッドの終了を確認しました");

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j522b.java
% java j522b
スレッドmainが9個のスレッドの終了を待ちます
スレッド(Thread-0)開始
スレッド(Thread-1)開始
スレッド(Thread-8)開始
スレッド(Thread-2)開始
スレッド(Thread-7)開始
スレッド(Thread-6)開始
スレッド(Thread-5)開始
スレッド(Thread-4)開始
スレッド(Thread-3)開始
スレッド(Thread-0)終了
スレッド(Thread-1)終了
スレッド(Thread-2)終了
スレッド(Thread-7)終了
スレッド(Thread-6)終了
スレッド(Thread-5)終了
スレッド(Thread-4)終了
スレッド(Thread-3)終了
スレッド(Thread-8)終了
スレッドmainが9個のスレッドの終了を確認しました
</pre>

</body>
</html>
