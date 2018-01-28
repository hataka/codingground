<!--====================================================================-->
<!-- << j552a.htm >>                                                    -->
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
//  << j552a.java >>
//
//  スレッド（５）：生産者・消費者問題（１）
//
//　●生産者・消費者問題
//
//　　生産者側
//　　　(a)テーブル上に生産物がない場合、生産物を１個テーブルに乗せる。
//　　　　 同時に、消費者にテーブルに生産物をのせたことを消費者に通知する。
//　　　(b)テーブル上に生産物が１個ある場合、待つ。
//　　消費者側
//　　　(c)テーブル上に生産物がなければ、生産物が届けられるまで待つ。
//　　　(d)テーブル上に生産物が１個あれば消費する。
//　　　　 同時に、テーブル上の生産物を消費したことを生産者に通知する。
//
//    生産者を生産者スレッド、消費者を消費者スレッドで表す。
//　　テーブルクラスを使い、生産者スレッドと消費者スレッドの通信を行う。
//
//　　（１）テーブルクラスの定義。
//　　（２）生産者クラスの定義。
//　　（３）消費者クラスの定義。
//　　（４）テーブルクラスのオブジェクトの作成。
//　　（５）生産・消費回数を設定。
//　　（６）生産者スレッドの作成。
//　　（７）消費者スレッドの作成。
//　　（８）生産者スレッドの実行。
//　　（９）消費者スレッドの実行。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Table {
  int count = 0; // 現在の生産物の個数。
  synchronized void seisan() {
    while( count == 1 ) {
      try {
        wait(); // 他のスレッドで実行されたnotifyメソッドによって再開された
                // スレッドは、直ちにロックをかける。
                // しかし、この時点で、countの値が0である保証はない。
                // したがって、countの値が0であることを確認する必要がある。
                // 0ならば実行を続け、1ならばwaitを実行して再度一時停止する。
      } catch( InterruptedException e ) { }
    }
    count = 1;
    System.out.println("生産");
    notify(); // オブジェクトtに対してnotifyが実行される。この結果、
              // オブジェクトtの処理を待っているスレッドのひとつが実行を
              // 再開できる状態になる。待っているスレッドがない場合、
              // notifyは無効になる。 
  }
  synchronized void syohi() {
    while( count == 0 ) {
      try {
        wait(); // 他のスレッドで実行されたnotifyメソッドによって再開された
                // スレッドは、直ちにロックをかける。
                // しかし、この時点で、countの値が1である保証はない。
                // したがって、countの値が1であることを確認する必要がある。
                // 1ならば実行を続け、0ならばwaitを実行して再度一時停止する。
       } catch( InterruptedException e ) { }
     }
    count = 0;
    System.out.println("　　消費");
    notify(); // オブジェクトtに対してnotifyが実行される。この結果、
              // オブジェクトtの処理を待っているスレッドのひとつが実行を
              // 再開できる状態になる。待っているスレッドがない場合、
              // notifyは無効になる。 
  }
}

//（２）
class Seisan extends Thread { 
  Table t;
  int n;
  Seisan(Table t, int n) { // コンストラクタ。
    this.t = t; this.n = n;
  }
  public void run() {
    for( int i=0; i<n; i++ ) { t.seisan(); } 
  }
}

//（３）
class Syohi extends Thread { 
  Table t;
  int n;
  Syohi(Table t, int n) { // コンストラクタ。
    this.t = t; this.n = n;
  }
  public void run() {
    for( int i=0; i<n; i++ ) { t.syohi(); } 
  }
}

class j552a {
  public static void main(String args[]) {

    Table t = new Table(); //（４）

    int n = 3; //（５）

    Seisan tha = new Seisan(t,n); //（６）
    Syohi thb = new Syohi(t,n); //（７）

    tha.start(); //（８）
    thb.start(); //（９） 

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j552a.java
% java j552a 
生産
　　消費
生産
　　消費
生産
　　消費
</pre>

</body>
</html>
