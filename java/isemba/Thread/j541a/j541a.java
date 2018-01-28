<!--====================================================================-->
<!-- << j541a.htm >>                                                    -->
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
//  << j541a.java >>
//
//  スレッド（４）：干渉
//
//　●干渉
//
//　　計算クラス(Comp)にあるインスタンス変数countに対して、加算を実行する複数の
//　　スレッドが同時にアクセスして、一貫性を失う現象を考察する。
//　　このような現象を干渉（競合状態）という。
//
//　　この例では、1増加する加算をn回行うスレッドを２つ作成し実行する。
//　　最終的にインスタンス変数countの値が2nになるはずであるが、干渉の結果、
//　　nが大きくなるにつれて、結果が2nでなくなる。
//
//　　（１）計算クラスの定義。
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
    for( long i=1; i<=n; i++ ) { c.add(); }
    System.out.println("加算スレッド（" +  this.getName() + "）：" + c.count);
  }
}

class j541a {
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
% javac j541a.java
% java j541a 1000000
繰り返し回数 = 1000000
加算スレッド（Thread-0）：1000000
加算スレッド（Thread-1）：2000000

% java j541a 10000000
繰り返し回数 = 10000000
加算スレッド（Thread-0）：16486183
加算スレッド（Thread-1）：20000000

% java j541a 100000000
繰り返し回数 = 100000000
加算スレッド（Thread-0）：171926222
加算スレッド（Thread-1）：173585364
</pre>

</body>
</html>
