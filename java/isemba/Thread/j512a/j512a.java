<!--====================================================================-->
<!-- << j512a.htm >>                                                    -->
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
//  << j512a.java >>
//
//  スレッド（１）：スレッド（名前の設定と取得）
//
//　　スレッドの名前の設定と取得を確認する。
//
//　　（１）スレッド(Thread1)の定義。
//　　（２）スレッドの作成。
//　　（３）スレッドの名前を設定。
//　　（４）スレッドの実行。
//　　（５）スレッドの名前を取得。
//
//  ●Threadクラスのメソッド
//    public final void setName(String s)
//　　　機能：スレッドの名前をsにする。 
//　　public String getName()
//      機能：Threadオブジェクトの名前を取得する。
//
////////////////////////////////////////////////////////////////////////////////

//（１）
class Thread1 extends Thread { 
  public void run() {
    String s = this.getName(); //（５）
    System.out.println("スレッド（名前：" + s + "）が起動しました");
  }
}

class j512a {
  public static void main(String args[]) {

    Thread1 th1 = new Thread1(); //（２）

    th1.setName("スレッド１"); //（３）

    th1.start(); //（４）

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j512a.java
% java j512a
スレッド（名前：スレッド１）が起動しました
</pre>

</body>
</html>
