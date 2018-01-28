<!--====================================================================-->
<!-- << j551a.htm >>                                                    -->
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
//  << j551ajava >>
//
//  スレッド（５）：スレッド間通信（waitメソッド、notifyメソッドの組合せ）
//
//　　１つのスレッドがwaitメソッドを実行し一時停止する。
//　　mainメソッドからnotifyメソッドを使って、このメソッドの実行を再開する。
//    スレッド間通信のためにひとつのオブジェクトを使う。
//　　このために旗クラスを定義する。
//
//　　（１）旗クラスの定義。
//　　（２）スレッド(Thread1)の定義。
//　　（３）現在のスレッドを表示するメソッドの定義。
//　　（４）現在のスレッドを表示するメソッドの定義。
//　　（５）スレッドの作成。
//　　（６）スレッドの実行。
//　　（７）待機時間。
//　　（８）現在のスレッドをすべて表示。
//　　（９）一時停止中のスレッドを再開。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Flag {
  synchronized void WAIT() { 
    try {
      System.out.println("スレッド(" + Thread.currentThread().getName() + ") wait 開始");
      wait();
      System.out.println("スレッド(" + Thread.currentThread().getName() + ") wait 終了");
    } catch( InterruptedException e ) { }
  }
  synchronized void NOTIFY() {
    System.out.println("スレッド(" + Thread.currentThread().getName() + ") notify 開始");
    notify();
    System.out.println("スレッド(" + Thread.currentThread().getName() + ") notify 終了");
  }
}

//（２）
class Thread1 extends Thread { 
  Flag f;
  Thread1(Flag f) { // コンストラクタ。
    this.f = f; 
  }
  public void run() {
    System.out.println("スレッド(" + this.getName() + ") 開始");
    f.WAIT();
    System.out.println("スレッド(" + this.getName() + ") 終了");
  }
}

class j551a {
  //（３）
  static void show() {
    int n = Thread.activeCount();
    Thread th[] = new Thread[n];
    int m = Thread.enumerate(th);
    System.out.println("　　[現在のスレッド表示開始]");
    for( int i=0; i<m; i++ ) {
      System.out.println("　　" + i + "番目のスレッド：" + th[i].getName());
    }
    System.out.println("　　[現在のスレッド表示終了]");
  }

  public static void main(String args[]) {

    Flag f = new Flag(); //（４）

    Thread1 th = new Thread1(f); //（５） 

    th.start(); //（６）

    try {
      Thread.sleep(3000); //（７）
    } catch ( InterruptedException e ) { } 

    show(); //（８）

    f.NOTIFY(); //（９）

    try {
      Thread.sleep(3000); //（７）
    } catch ( InterruptedException e ) { } 

     show(); //（８）

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j551a.java
% java j551a 
スレッド(Thread-0) 開始
スレッド(Thread-0) wait 開始
　　[現在のスレッド表示開始]
　　0番目のスレッド：main
　　1番目のスレッド：Thread-0
　　[現在のスレッド表示終了]
スレッド(main) notify 開始
スレッド(main) notify 終了
スレッド(Thread-0) wait 終了
スレッド(Thread-0) 終了
　　[現在のスレッド表示開始]
　　0番目のスレッド：main
　　[現在のスレッド表示終了]
</pre>

</body>
</html>
