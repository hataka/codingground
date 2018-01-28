<!--====================================================================-->
<!-- << j641d.htm >>                                                    -->
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
// << j641d.java >>
//
//  ファイル処理（４）Scannerクラス（キーボードからトークンを入力）
//
//    キーボードから、トークンをひとつずつ入力し、コンソールへ出力する。
//
//  ●Scannerクラスのメソッド
//    public boolean hasNext()
//　　　機能：入力に読み込めるトークンがある場合true、ない場合false。
//    public double next()
//　　　機能：区切り文字で区切りながら、トークン１個分入力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641d {

  public static void main(String args[]) {

    try {
      // キーボードを設定。
      Scanner kb = new Scanner(System.in);
      // キーボードからトークン１個を入力し、コンソールへ出力。
      while( kb.hasNext() ) {
        String s = kb.next();
        System.out.println("トークン：" + s);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j641d.java
% java j641d
123 abc
トークン：123
トークン：abc
45.67 def 123ABC
トークン：45.67
トークン：def
トークン：123ABC
Ctrl-c
</pre>

</body>
</html>
