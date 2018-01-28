<!--====================================================================-->
<!-- << j513a.htm >>                                                    -->
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
//  << j513a.java >>
//
//  スレッド（１）：スレッドの優先順位
//
//　　　スレッドには優先順位を設定できることを確認する。
//
//　　（１）スレッド(Thread1)の定義。
//　　（２）スレッドthaの作成。
//　　（３）スレッドthbの作成。
//　　（４）スレッドthaに優先順位MIN_PRIORITYを設定。
//　　（５）スレッドthbに優先順位MAX_PRIORITYを設定。
//　　（６）スレッドthaの実行。
//　　（７）スレッドthaの優先順位を取得。
//　　（８）スレッドthbの実行。
//　　（７）スレッドthbの優先順位を取得。
//
//  ●Threadクラスのメソッド
//    public final int getPriority()
//      機能：優先順位を取得する。
//　　public final void setPriority(int n)
//      機能：優先順位の値nを設定する。
//
//  ●Threadクラスのフィールド
//    public static final int MIN_PRIORITY    最低の優先順位の値
//    public static final int NORM_PRIORITY   通常の優先順位の値
//    public static final int MAX_PRIORITY    最高の優先順位の値
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Thread1 extends Thread { 
  public void run() {
    int p = this.getPriority(); //（７）
    String s = this.getName();
    System.out.println("スレッド：" + s + "の優先順位 " + p);
  }
}

class j513a {
  public static void main(String args[]) {

    Thread1 tha = new Thread1(); //（２）
    Thread1 thb = new Thread1(); //（３）

    tha.setPriority(Thread.MIN_PRIORITY); //（４）
    thb.setPriority(Thread.MAX_PRIORITY); //（５）

    tha.start(); //（６）
    thb.start(); //（８）

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j513a.java
% java j513a
スレッド：Thread-1の優先順位 10
スレッド：Thread-0の優先順位 1
</pre>

</body>
</html>
