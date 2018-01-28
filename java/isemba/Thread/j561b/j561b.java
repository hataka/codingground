<!--====================================================================-->
<!-- << j561b.htm >>                                                    -->
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
//  << j561b.java >>
//
//  スレッド（６）：デッドロック（解決法）
//
//　　解決法：複数のスレッドの場合、ロックを掛ける順はすべて同じにする。
//
//　　スレッド１は、オブジェクトobj1、オブジェクトobj2の順にロックを掛ける。
//　　スレッド２は、オブジェクトobj1、オブジェクトobj2の順にロックを掛ける。
//
////////////////////////////////////////////////////////////////////////////////

// 計算クラスの定義。
class Comp {
  long count = 0;
  void add() { count++; }
}

// スレッド１の定義。
class Thread1 extends Thread {
  Comp obj1,obj2;
  int n;
  Thread1(Comp obj1, Comp obj2, int n) { // コンストラクタ。
    this.obj1 = obj1; this.obj2 = obj2; this.n = n; 
  }
  public void run() { // 処理本体。
    System.out.println("スレッド１起動");

    for( int i=1; i<=n; i++ ) {
      synchronized(obj1) {
        obj1.add();

            try { // ランダムな間隔。  
              Thread.sleep((long)(Math.random()*10)+1);
            } catch ( InterruptedException e) { }

        synchronized(obj2) {
          obj2.add(); 
        }

            try { // ランダムな間隔。  
              Thread.sleep((long)(Math.random()*10)+1);
            } catch ( InterruptedException e) { }

      }

    }
  }
}

// スレッド２の定義。
class Thread2 extends Thread {
  Comp obj1,obj2;
  int n;
  Thread2(Comp obj1, Comp obj2, int n) { // コンストラクタ。
    this.obj1 = obj1; this.obj2 = obj2; this.n = n; 
  }
  public void run() { // 処理本体。
    System.out.println("スレッド２起動");

        try { // ランダムな間隔。  
          Thread.sleep(50);
        } catch ( InterruptedException e) { }

    for( int i=1; i<=n; i++ ) {
      synchronized(obj1) {
        obj1.add(); 

            try { // ランダムな間隔。  
              Thread.sleep((long)(Math.random()*10)+1);
            } catch ( InterruptedException e) { }

        synchronized(obj2) {
          obj2.add(); 
        }

            try { // ランダムな間隔。  
              Thread.sleep((long)(Math.random()*10)+1);
            } catch ( InterruptedException e) { }

      }

    }
  }
}

public class j561b {
  public static void main(String args[]) {
   
    int n = Integer.parseInt(args[0]); // 繰り返し回数nの取得。

    System.out.println("n = " + n);

    Comp obj1 = new Comp(); // 計算クラスのオブジェクトobj1の作成。
    Comp obj2 = new Comp(); // 計算クラスのオブジェクトobj2の作成。

    Thread1 th1 = new Thread1(obj1,obj2,n); // スレッドth1の作成。
    Thread2 th2 = new Thread2(obj1,obj2,n); // スレッドth2の作成。
     
    th1.start(); // スレッドth1の実行。
    th2.start(); // スレッドth1の実行。

    try {
      th1.join(); th2.join(); // すべてのスレッドの終了を待つ。
    } catch ( InterruptedException e ) { }
    System.out.println("すべてのスレッドが終了しました");
    System.out.println("obj1のcount = " + obj1.count);
    System.out.println("obj2のcount = " + obj2.count);

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j561b.java
% java j561b 10
n = 10
スレッド１起動
スレッド２起動
すべてのスレッドが終了しました
obj1のcount = 20
obj2のcount = 20

% java j561b 100
n = 100
スレッド１起動
スレッド２起動
すべてのスレッドが終了しました
obj1のcount = 200
obj2のcount = 200

% java j561b 1000
n = 1000
スレッド１起動
スレッド２起動
すべてのスレッドが終了しました
obj1のcount = 2000
obj2のcount = 2000
</pre>

</body>
</html>
