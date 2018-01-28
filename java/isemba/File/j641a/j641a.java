<!--====================================================================-->
<!-- << j641a.htm >>                                                    -->
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
// << j641a.java >>
//
//  ファイル処理（４）Scannerクラス（キーボードから１行分入力）
//
//    キーボードから、１行分入力し、コンソールへ出力する。
//
//　●java.util.Scannerクラス
//    このクラスを使って、1行分、トークン１個、、数値１個を入力することができる。
//
//  ○Scannerクラスのコンストラクタ
//    public Scanner(InputStream is)
//　　　機能：入力ストリームisからScannerオブジェクトを作成する。
//　　　　　　ストリームから取得したバイトは、プラットフォームのデフォルト
//　　　　　　文字セットを使用して文字に変換される。
// 
//  ○Scannerクラスのメソッド
//    public boolean hasNextLine()
//　　　機能：入力に読み込める行がある場合true、ない場合false。
//    public String nextLine()
//　　　機能：行末の改行文字まで１行分入力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641a {

  public static void main(String args[]) {

    try {
      // キーボードを設定。
      Scanner kb = new Scanner(System.in);
      // キーボードから１行分入力しコンソールへ出力。
      while( kb.hasNextLine() ) {
        String s = kb.nextLine();
        System.out.println("１行分：" + s);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j641a.java
% java j641a
123 456 789
１行分：123 456 789
abc def ghi
１行分：abc def ghi
Ctrl-c
</pre>

</body>
</html>
