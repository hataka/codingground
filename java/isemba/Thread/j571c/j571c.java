<!--====================================================================-->
<!-- << j571c.htm >>                                                    -->
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
//  << j571c.java >>
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
//　　クラスをスレッド化し、複数のスレッドで分担して生成する。
//    たとえば、集合{1,2,...,n}上の部分集合を、
//　　　　00b[3]...b[n]
//　　　　01b[3]...b[n]
//　　　　10b[3]...b[n]
//　　　　11b[3]...b[n]
//　　に分割し、それぞれをスレッドで生成する。
//　　分割のために使われる先頭の2ビットを、mとおく。
//　　スレッドの個数は、2**mとなる。
//
////////////////////////////////////////////////////////////////////////////////

// スレッド化されたクラス。
class C extends Thread {
  int b[]; // 部分集合を格納する配列。
  int count = 0; // 生成された部分集合の個数。
  int m,n;
  C(int a[], int m, int n) { // コンストラクタ。
    this.m = m; this.n = n;
    b = new int[n+1]; 
    for( int i=1; i<=m; i++ ) { b[i] = a[i]; }
  }
  // 集合{k,...,n}上のすべての部分集合b[k]...b[n]を生成する。
  void gen(int k, int n) {
    if( k > n ) {
      count++;
    } else {
      b[k] = 0; gen(k+1,n);
      b[k] = 1; gen(k+1,n);
    }  
  }
  public void run() {
    gen(m+1,n);
    System.out.print("スレッド（" + Thread.currentThread().getName() + "） ");
    for(int i=1; i<=m; i++ ) { System.out.print(b[i]); }
    System.out.println(" count = " + count);
  }
}

class j571c {
  public static void main(String args[]) {

    int n = Integer.parseInt(args[0]); // args[0]は集合のサイズを表す。

    System.out.println("集合のサイズ：" + n);

    int m = 2; 
    int a[] = new int[m+1]; // 部分結果を保存する配列。

    a[1]=0; a[2]=0;
    C obj1 = new C(a,m,n); // 部分集合00b[m+1]...b[n]を生成するスレッドを作成する。
    obj1.start();          // 起動する。

    a[1]=0; a[2]=1;
    C obj2 = new C(a,m,n); // 部分集合01b[m+1]...b[n]を生成するスレッドを作成する。
    obj2.start();          // 起動する。
    
    a[1]=1; a[2]=0;
    C obj3 = new C(a,m,n); // 部分集合10b[m+1]...b[n]を生成するスレッドを作成する。
    obj3.start();          // 起動する。
    
    a[1]=1; a[2]=1;
    C obj4 = new C(a,m,n); // 部分集合11b[m+1]...b[n]を生成するスレッドを作成する。
    obj4.start();          // 起動する。

    try { // すべてのスレッドの終了を待つ。
      obj1.join(); obj2.join(); obj3.join(); obj4.join();
      System.out.println("すべてのスレッドが終了しました");
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j571c.java
% java j571c 10
集合のサイズ：10
スレッド（Thread-0） 00 count = 256
スレッド（Thread-1） 01 count = 256
スレッド（Thread-2） 10 count = 256
スレッド（Thread-3） 11 count = 256
すべてのスレッドが終了しました
</pre>

</body>
</html>
