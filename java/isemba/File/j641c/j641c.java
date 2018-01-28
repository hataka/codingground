<!--====================================================================-->
<!-- << j641c.htm >>                                                    -->
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
// << j641c.java >>
//
//  ファイル処理（４）Scannerクラス（キーボードから実数を入力）
//
//    キーボードから、実数をひとつずつ入力し、コンソールへ出力する。
//
//  ●Scannerクラスのメソッド
//    public boolean hasNextDouble()
//　　　機能：入力に読み込める実数がある場合true、ない場合false。
//    public double nextDouble()
//　　　機能：区切り文字で区切りながら、実数１個分入力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641c {

  public static void main(String args[]) {

    try {
      // キーボードを設定。
      Scanner kb = new Scanner(System.in);
      // キーボードから実数１個を入力し、コンソールへ出力。
      while( kb.hasNextDouble() ) {
        double d = kb.nextDouble();
        System.out.println("実数：" + d);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j641c.java
% java j641c
12.34
実数：12.34
-12.34 56.789
実数：-12.34
実数：56.789
Ctrl-c
</pre>

</body>
</html>
