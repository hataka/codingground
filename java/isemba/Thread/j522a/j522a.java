<!--====================================================================-->
<!-- << j522a.htm >>                                                    -->
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
//  << j522a.java >>
//
//  スレッド（２）：スレッドの制御(joinメソッド)
//
//    joinメソッドを使って、特定のスレッドの終了を待つ。
//　　このことを確認する。
//
//　　（１）スレッド(Thread1)の定義。
//　　（２）スレッドの作成。
//　　（３）スレッドの実行。
//　　（４）th.join()を実行したスレッドは、スレッドオブジェクトthが
//　　　　　終了するまで待つ。
//　　（５）５秒間スリープ。
//  
//  ●Threadクラスのメソッド
//　　public final void join() throws InterruptedException
//      機能：startメソッドで起動したスレッドが終了するまで永遠に待つ。
//　　public final void join(long t) throws InterruptedException
//      機能：tミリ秒間、startメソッドで起動したスレッドが終了するまで待つ。
//　　　　    スレッドが終了しなくても戻る。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Thread1 extends Thread {
  public void run() {
    String t = this.getName();
    System.out.println("　スレッド" + t + "の開始");
    try {
      Thread.sleep(5000); //（５）
    } catch( InterruptedException e) { } 
    System.out.println("　スレッド" + t + "の終了");
  }
}

class j522a {
  public static void main(String args[]) {

    Thread1 th = new Thread1(); //（２） 

    th.start(); //（３）

    String c = Thread.currentThread().getName();
    String s = th.getName();
    System.out.println("スレッド" + c + "がスレッド" + s + "の終了を待ちます");

    try {
      th.join(); //（４）
    } catch ( InterruptedException e ) {  }

    System.out.println("スレッド" + c + "がスレッド" + s + "の終了を確認しました");

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j522a.java
% java j522a
スレッドmainがスレッドThread-0の終了を待ちます
　スレッドThread-0の開始
　スレッドThread-0の終了
スレッドmainがスレッドThread-0の終了を確認しました
</pre>

</body>
</html>
