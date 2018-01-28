<!--====================================================================-->
<!-- << j541d.htm >>                                                    -->
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
//  << j541d.java >>
//
//  スレッド（４）：干渉の解決法実験（synchronizedメソッド）
//
//　　加算スレッドをm個作成し、各スレッドの繰り返し回数をnとする。
//　　最後の結果がmnになれば干渉を解決したことになる。
//
//　　（１）計算クラスの定義。
//　　　　　addメソッドをsynchronizedメソッドに書き換える。
//　　（２）加算クラスの定義。
//　　（３）コマンドラインからスレッド数args[0]を取得。
//　　（４）コマンドラインから繰り返し回数args[0]を取得。
//　　（５）Compクラスのオブジェクトの作成。
//　　（６）スレッドを格納する配列を準備。
//　　（７）スレッドの作成。
//　　（８）スレッドの実行。
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

class j541d {
  public static void main(String args[]) {

    int m = Integer.parseInt(args[0]); //（３）
    System.out.println("スレッド数 = " + m);
    long n = Integer.parseInt(args[1]); //（４）
    System.out.println("繰り返し回数 = " + n);

    Comp c = new Comp(); //（５）

    Thread1 th[] = new Thread1[m]; //（６）
    for( int i=0; i<m; i++ ) {
      th[i] = new Thread1(c,n); //（７）
      th[i].start(); //（８）
    }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j541d.java
% java j541d 9 1000000
スレッド数 = 9
繰り返し回数 = 1000000
加算スレッド（Thread-0）：1000000
加算スレッド（Thread-1）：2000000
加算スレッド（Thread-2）：3000000
加算スレッド（Thread-3）：4000000
加算スレッド（Thread-4）：5000000
加算スレッド（Thread-5）：6000000
加算スレッド（Thread-6）：7000000
加算スレッド（Thread-7）：8000000
加算スレッド（Thread-8）：9000000

% java j541d 9 10000000
スレッド数 = 9
繰り返し回数 = 10000000
加算スレッド（Thread-0）：72155131
加算スレッド（Thread-2）：89998491
加算スレッド（Thread-7）：89998927
加算スレッド（Thread-6）：89999299
加算スレッド（Thread-3）：89999411
加算スレッド（Thread-8）：89999606
加算スレッド（Thread-5）：89999734
加算スレッド（Thread-1）：89999795
加算スレッド（Thread-4）：90000000
</pre>

</body>
</html>
