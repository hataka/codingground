<!--====================================================================-->
<!-- << j521a.htm >>                                                    -->
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
//  << j521a.java >>
//
//  スレッド（２）：スレッドの制御(sleepメソッド)
//  
//    スレッドを一定時間停止できることを確認する。
//
//　　（１）スレッドの定義。
//　　（２）スレッドの作成。
//　　（３）スレッドの実行。
//　　（４）5000ミリ秒スリープ。
//
//  ●Threadクラスのメソッド
//　　static void sleep(long t) throws InterruptedException
//    機能：t ミリ秒間スリープする。
//          すなわち、tミリ秒間スレッドをブロック状態にする。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Thread1 extends Thread {
  public void run() {
    System.out.println("スリープ開始"); 
    try {
      Thread.sleep(5000); //（４）
    } catch ( InterruptedException e) { }
    System.out.println("スリープ終了"); 
  }
}    

class j521a {
  public static void main(String args[]) {
 
    Thread1 th = new Thread1(); //（２）

    th.start(); //（３）

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j521a.java
% java j521a
スリープ開始
スリープ終了
</pre>

</body>
</html>
