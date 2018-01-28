/*<!--====================================================================-->
<!-- << j641b.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>*/
////////////////////////////////////////////////////////////////////////////////
// << j641b.java >>
//
//  ファイル処理（４）Scannerクラス（キーボードから整数を入力）
//
//    キーボードから、整数をひとつずつ入力し、コンソールへ出力する。
//
//  ●Scannerクラスのメソッド
//    public boolean hasNextInt()
//　　　機能：入力に読み込める整数がある場合true、ない場合false。
//    public int nextInt()
//　　　機能：区切り文字で区切りながら整数１個分入力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class j641b {

  public static void main(String args[]) {

    try {
      // キーボードを設定。
      Scanner kb = new Scanner(System.in);
      // キーボードから整数を１個入力しコンソールへ出力。
      while( kb.hasNextInt() ) {
        int n = kb.nextInt();
        System.out.println("整数：" + n);
      }
    } catch( Exception e ) { }

  }

}
/*</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j641b.java
% java j641b
123
整数：123
456 789
整数：456
整数：789
Ctrl-c
</pre>

</body>
</html>*/
