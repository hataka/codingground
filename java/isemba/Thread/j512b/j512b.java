<!--====================================================================-->
<!-- << j512b.htm >>                                                    -->
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
//  << j512b.java >>
//
//  スレッド（１）：スレッド（複数のスレッドの作成）
//
//　　複数のスレッドを作成し配列に格納する。
//    作成されたスレッドには、識別するために自動的に、"Thread-"+n という名前が
//　　つけられる。ただし、nは整数。
//    このことを確認する。
//
//　　（１）スレッド(Thread1)の定義。
//　　（２）作成するスレッドの個数nを設定。
//　　（３）作成したスレッドを格納する配列thを準備。
//　　（４）スレッドの作成。
//　　（５）スレッドの実行。
//
//　●Threadクラスのメソッド
//　　public static Thread currentThread()
//　　　機能：現在実行中のThreadオブジェクトを取得する。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Thread1 extends Thread { 
  public void run() {
    String s = Thread.currentThread().getName();
    System.out.println("スレッド：" + s + " 起動");
  }
}

class j512b {
  public static void main(String args[]) {

    int n = 5; //（２）

    Thread1 th[] = new Thread1[n]; //（３）
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(); //（４）
      th[i].start(); //（５）
    }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j512b.java
% java j512b
スレッド：Thread-0 起動
スレッド：Thread-1 起動
スレッド：Thread-2 起動
スレッド：Thread-3 起動
スレッド：Thread-4 起動
</pre>

</body>
</html>
