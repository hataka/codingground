<!--====================================================================-->
<!-- << j512c.htm >>                                                    -->
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
//  << j512c.java >>
//
//  スレッド（１）：スレッド（アクティブなスレッドの表示）
//
//　　アクティブなスレッドを確認する。
//
//　　（１）スレッド(Thread1)の定義。
//　　（２）作成するスレッドの個数nを設定。
//　　（３）作成したスレッドを格納する配列thを準備。
//　　（４）スレッドの作成。
//　　（５）スレッドの実行。
//　　（６）アクティブなスレッド数を取得。
//　　（７）アクティブなスレッドを格納する配列thaを準備。
//　　（８）アクティブなスレッドを取得。
//　　（９）アクティブなスレッド名を取得。
//
//  ●メインスレッド
//    Javaプログラムは、必ず一つのスレッド(名前：main)をもつ。
//
//  ●Threadクラスのメソッド
//    public static int enumerate(Thread array[])
//      機能：アクティブなすべてのスレッドオブジェクトを取得し、配列に保存。
//            スレッドオブジェクト数を返す。
//            クラスメソッドなので、クラス名.メソッド名で呼び出す。
//　　public static int activeCount()
//      機能：アクティブなスレッドオブジェクト数を返す。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Thread1 extends Thread { 
  public void run() {
    String s = Thread.currentThread().getName();
    System.out.println("スレッド：" + s + " 起動");
  }
}

class j512c {
  public static void main(String args[]) {

    int n = 5; //（２）

    Thread1 th[] = new Thread1[n]; //（３）
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(); //（４）
      th[i].start(); //（５）
    }

    int m = Thread.activeCount(); //（６）
    Thread tha[] = new Thread[m]; //（７）
    Thread.enumerate(tha); //（８）
    System.out.println("アクティブなスレッド数：" + m);
    System.out.println("アクティブなスレッド一覧");
    for( int i=0; i<m; i++ ) {
      String s = tha[i].getName(); //（９）
      System.out.println("[" + i + "] " + s);
    }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j512c.java
% java j512c
アクティブなスレッド数：6
アクティブなスレッド一覧
[0] main
[1] Thread-0
[2] Thread-1
[3] Thread-2
[4] Thread-3
[5] Thread-4
スレッド：Thread-0 起動
スレッド：Thread-1 起動
スレッド：Thread-2 起動
スレッド：Thread-3 起動
スレッド：Thread-4 起動
</pre>

</body>
</html>
