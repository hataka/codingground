<!--====================================================================-->
<!-- << j541b.htm >>                                                    -->
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
//  << j541b.java >>
//
//  スレッド（４）：干渉の解決法１（synchronizedメソッド）
//
//  ●クリティカルセクション
//　　干渉を防ぐには、インスタンス変数countの変更部分を排他的に処理しなければ
//　　ならない。
//　　プログラム中、排他的に処理しなければならない部分をクリティカルセクション
//　　という。この例では、addメソッドである。
//　　synchronizedをメソッドに指定すれば、そのメソッドを排他的に処理する
//　　ようにできる。
//
//　　（１）計算クラスの定義。
//　　　　　addメソッドをsynchronizedメソッドに書き換える。
//　　（２）加算クラスの定義。
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
  synchronized void add() { count++; }
}

//（２）
class Thread1 extends Thread {
  Comp c;
  long n;
  Thread1(Comp c, long n) { // コンストラクタ。 
    this.c = c; this.n = n;
  }
  public void run() {
    for( long i=1; i<=n; i++ ) { c.add(); }
    System.out.println("加算スレッド（" +  this.getName() + "）：" + c.count);
  }
}

class j541b {
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
% javac j541b.java
% java j541b 1000000
繰り返し回数 = 1000000
加算スレッド（Thread-0）：1000000
加算スレッド（Thread-1）：2000000

% java j541b 10000000
繰り返し回数 = 10000000
加算スレッド（Thread-0）：17669904
加算スレッド（Thread-1）：20000000

% java j541b 100000000
繰り返し回数 = 100000000
加算スレッド（Thread-0）：194143124
加算スレッド（Thread-1）：200000000
</pre>

</body>
</html>
