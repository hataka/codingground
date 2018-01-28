<!--====================================================================-->
<!-- << j551b.htm >>                                                    -->
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
//  << j551b.java >>
//
//  スレッド（５）：スレッド間通信（waitメソッド、notifyAllメソッドの組合せ）
//
//　　n個のスレッドがwaitメソッドを実行し一時停止する。
//　　mainメソッドからnotifyAllメソッドを使って、n個のメソッドの実行を再開する。
//    スレッド間の通信のためにひとつのオブジェクトを使う。
//　　このために旗クラスを定義する。
//
//　　（１）旗クラスの定義。
//　　（２）スレッド(Thread1)の定義。
//　　（３）現在のスレッドを表示するメソッドの定義。
//　　（４）現在のスレッドを表示するメソッドの定義。
//　　（５）スレッドの個数を設定。
//　　（６）スレッドを格納する配列を準備。
//　　（７）スレッドを作成。
//　　（８）スレッドを実行。
//　　（９）待機時間。
//　　（１０）現在のスレッドをすべて表示。
//　　（１１）一時停止中のスレッドをすべて再開。
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
  synchronized void NOTIFYALL() {
    System.out.println("スレッド(" + Thread.currentThread().getName() + ") notify 開始");
    notifyAll();
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

class j551b {
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

    int p = 5; //（５）

    Thread th[] = new Thread1[p]; //（６）
    for( int i=0; i<p; i++ ) {
      th[i] = new Thread1(f); //（７） 
      th[i].start(); //（８）
    }

    try {
      Thread.sleep(3000); //（９）
    } catch ( InterruptedException e ) { } 

    show(); //（１０）

    f.NOTIFYALL(); //（１１）

    try {
      Thread.sleep(3000); //（７）
    } catch ( InterruptedException e ) { } 

     show(); //（１０）

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j551b.java
% java j551b 
スレッド(Thread-0) 開始
スレッド(Thread-0) wait 開始
スレッド(Thread-1) 開始
スレッド(Thread-1) wait 開始
スレッド(Thread-2) 開始
スレッド(Thread-2) wait 開始
スレッド(Thread-3) 開始
スレッド(Thread-3) wait 開始
スレッド(Thread-4) 開始
スレッド(Thread-4) wait 開始
　　[現在のスレッド表示開始]
　　0番目のスレッド：main
　　1番目のスレッド：Thread-0
　　2番目のスレッド：Thread-1
　　3番目のスレッド：Thread-2
　　4番目のスレッド：Thread-3
　　5番目のスレッド：Thread-4
　　[現在のスレッド表示終了]
スレッド(main) notify 開始
スレッド(main) notify 終了
スレッド(Thread-0) wait 終了
スレッド(Thread-0) 終了
スレッド(Thread-1) wait 終了
スレッド(Thread-1) 終了
スレッド(Thread-2) wait 終了
スレッド(Thread-2) 終了
スレッド(Thread-3) wait 終了
スレッド(Thread-3) 終了
スレッド(Thread-4) wait 終了
スレッド(Thread-4) 終了
　　[現在のスレッド表示開始]
　　0番目のスレッド：main
　　[現在のスレッド表示終了]
</pre>

</body>
</html>
