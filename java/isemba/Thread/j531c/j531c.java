<!--====================================================================-->
<!-- << j531c.htm >>                                                    -->
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
//  << j531c.java >>
//
//  スレッド（３）：同期（synchronizedブロック）
//  
//　　複数のスレッドを同時に実行する。ブロック単位で処理が完了するように
//　　synchronizedブロックを使って実現する。
//
//　　（１）synchronizedブロックをもつクラスSyncCompの定義。
//　　　　　複数のスレッドからアクセスされる。
//　　（２）スレッド(Thread1)の定義
//　　（３）スレッドの個数の設定。
//　　（４）SyncCompクラスのオブジェクトの作成。
//　　（５）複数のスレッドを格納する配列の準備。
//　　（６）スレッドの作成。
//　　（７）スレッドの実行。
//　　（８）待機時間。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class SyncComp {
  void execute() {
    synchronized(this) {
      System.out.print("(" + Thread.currentThread().getName() + ")：開始　");
      try {
        Thread.sleep(1000); //（８）
      } catch ( InterruptedException e) { }
      System.out.println("(" + Thread.currentThread().getName() + ")：終了");
    }
  }
}

//（２）                       
class Thread1 extends Thread {                         
  SyncComp obj;                                          
  Thread1(SyncComp obj) { // コンストラクタ。
    this.obj = obj;
  }                
  public void run() { obj.execute(); }    
}                                                      

class j531c {
  public static void main(String args[]) {

    int n = 9; //（３）

    SyncComp obj = new SyncComp(); //（４）

    Thread1 th[] = new Thread1[n]; //（５） 
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(obj); //（６） 
      th[i].start(); //（７）
    }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j531c.java
% java j531c
(Thread-0)：開始　(Thread-0)：終了
(Thread-1)：開始　(Thread-1)：終了
(Thread-2)：開始　(Thread-2)：終了
(Thread-3)：開始　(Thread-3)：終了
(Thread-4)：開始　(Thread-4)：終了
(Thread-5)：開始　(Thread-5)：終了
(Thread-6)：開始　(Thread-6)：終了
(Thread-7)：開始　(Thread-7)：終了
(Thread-8)：開始　(Thread-8)：終了
</pre>

</body>
</html>
