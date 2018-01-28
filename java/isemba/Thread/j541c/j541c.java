<!--====================================================================-->
<!-- << j541c.htm >>                                                    -->
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
//  << j541c.java >>
//
//  スレッド（４）：干渉の解決法２（synchronizedブロック）
//
//　　synchronizedブロックを使って干渉を解決する。
//
//　　（１）計算クラスの定義。
//　　（２）加算クラスの定義。
//　　　　　synchroizedブロックを記述する。
//　　（３）コマンドラインから繰り返し回数args[0]を取得。
//　　（４）Compクラスのオブジェクトの作成。
//　　（５）スレッドthaの作成。
//　　（６）スレッドthbの作成。
//　　（７）スレッドthaの実行。
//　　（８）スレッドthbの実行。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Comp {
  long count = 0;
  void add() { count++; }
}

//（２）
class Thread1 extends Thread {
  Comp c;
  long n;
  Thread1(Comp c, long n) { // コンストラクタ。 
    this.c = c; this.n = n;
  }
  public void run() {
    for( long i=1; i<=n; i++ ) { 
      synchronized(c) { c.add(); }
    }
    System.out.println("加算スレッド（" +  this.getName() + "）：" + c.count);
  }
}

class j541c {
  public static void main(String args[]) {

    long n = Long.parseLong(args[0]); //（３）
    System.out.println("繰り返し回数 = " + n);

    Comp c = new Comp(); //（４）

    Thread1 tha = new Thread1(c,n); //（５）
    Thread1 thb = new Thread1(c,n); //（６）

    tha.start(); //（７）
    thb.start(); //（８）

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j541c.java
% java j541c 1000000
繰り返し回数 = 1000000
加算スレッド（Thread-0）：1000000
加算スレッド（Thread-1）：2000000

% java j541c 10000000
繰り返し回数 = 10000000
加算スレッド（Thread-0）：17402773
加算スレッド（Thread-1）：20000000

% java j541c 100000000
繰り返し回数 = 100000000
加算スレッド（Thread-0）：195161233
加算スレッド（Thread-1）：200000000
</pre>

</body>
</html>
