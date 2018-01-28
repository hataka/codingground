<!--====================================================================-->
<!-- << j571d.htm >>                                                    -->
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
//  << j571d.java >>
//
//  スレッド（７）：バックトラックアルゴリズムのスレッド化
//
//　●問題
//
//　　集合{1,2,...,n}上のすべての部分集合b[1]b[2]...b[n]を生成する。
//    ただし、要素iが部分集合に含まれるときb[i]=1,含まれないときb[i]=0とする。
//
//　●解法
//
//　　j571cの改良。分割の自動化と結果の収集。
//
////////////////////////////////////////////////////////////////////////////////

// 結果を収集するクラスの定義。
class Result {
  long sum=0;
  synchronized void set(long a) {
    sum = sum + a;
  }
}

// スレッド化されたクラス。
class C extends Thread {

  int b[]; // 部分集合を格納する配列。
  long count = 0; // 生成された部分集合の個数。
  int m,n;
  Result rst;

  C(int a[], int m, int n, Result rst) { // コンストラクタ。
    this.m = m; this.n = n; this.rst = rst;
    b = new int[n+1]; 
    for( int i=1; i<=m; i++ ) { b[i] = a[i]; }
  }
  
  void gen(int k, int n) { // 集合{k,...,n}上のすべての部分集合b[k]...b[n]を生成する。
    if( k > n ) {
      count++;
    } else {
      b[k] = 0; gen(k+1,n);
      b[k] = 1; gen(k+1,n);
    }  
  }

  void show() {
    synchronized(rst) {
      System.out.print("スレッド（" + Thread.currentThread().getName() + "） ");
      for(int i=1; i<=m; i++ ) { System.out.print(b[i]); }
      System.out.println(" count = " + count);
    }
  }

  public void run() {
    gen(m+1,n);
    show();
    rst.set(count);
  }

}

class j571d {

  static int m,n,p,q=0;
  static int a[];
  static C obj[];
  static Result rst;

  static void gen(int k, int m) { // 集合{k,...,m}上のすべての部分集合a[k]...a[m]を生成する。
    if( k > m ) {
      q++;
      obj[q] = new C(a,m,n,rst); // 部分集合**b[m+1]...b[n]を生成するスレッドを作成する。
      obj[q].start();          // 起動する。
    } else {
      a[k] = 0; gen(k+1,m);
      a[k] = 1; gen(k+1,m);
    }  
  }

  public static void main(String args[]) {

    m = Integer.parseInt(args[0]); // args[0]はmを表す。
    n = Integer.parseInt(args[1]); // args[1]はnを表す。

    System.out.println("m = " + m + " n = " + n);

    a = new int[m+1]; // 部分結果を保存する配列。

    p = 1; // pは分割したスレッドの個数を意味する。
    for( int i=1; i<=m; i++ ) { p = p * 2; }
    obj = new C[p+1];

    rst = new Result(); // 結果を格納するオブジェクトrstを作成。

    gen(1,m); // 分割したスレッドを作成し実行する。

    try { // すべてのスレッドの終了を待つ。
      for( int i=1; i<=p; i++ ) { obj[i].join(); }
      System.out.println("すべてのスレッドが終了しました");
      System.out.println("すべて部分集合の個数：" + rst.sum);
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j571d.java
% java j571d 3 10
m = 3 n = 10
スレッド（Thread-0） 000 count = 128
スレッド（Thread-1） 001 count = 128
スレッド（Thread-2） 010 count = 128
スレッド（Thread-3） 011 count = 128
スレッド（Thread-7） 111 count = 128
スレッド（Thread-6） 110 count = 128
スレッド（Thread-5） 101 count = 128
スレッド（Thread-4） 100 count = 128
すべてのスレッドが終了しました
すべて部分集合の個数：1024
</pre>

</body>
</html>
