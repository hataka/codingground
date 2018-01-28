/*
<!--====================================================================-->
<!-- << j643a.htm >>                                                    -->
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
*/
////////////////////////////////////////////////////////////////////////////////
// << j643a.java >>
//
//  ファイル処理（４）PrintWriterクラス（コンソールへの出力）
//
//    PrintWriterクラスを使って、コンソールへ出力する。
//
//　●java.io.PrintWriterクラス
//    このクラスを使って、フォーマットされたオブジェクトの表現を
//    テキスト出力ストリームに出力する。
//
//  ○PrintWriterクラスのコンストラクタ
//    public PrintWriter(OutputStream out)
//　　　機能：OutputStreamオブジェクトoutからPrintWriterオブジェクトを作成する。
//            行の自動フラッシュは行わない。 
//    public PrintWriter(OutputStream out, boolean b)
//　　　機能：OutputStreamオブジェクトoutからPrintWriterオブジェクトを作成する。
//    　　　　bの値がtrue の場合、println、printfで出力バッファをフラッシュする。
//
//  ○PrintWriterクラスのメソッド
//   public void print(int i)
//　　　機能：整数を出力する。
//　　　　　　文字列に変換された整数は、プラットフォームのデフォルトの
//　　　　　　文字エンコーディングに従ってバイトに変換され書き込まれる。
//   public void print(double d)
//　　　機能：倍精度の浮動小数点の値を出力する。
//　　　　　　文字列に変換された実数は、プラットフォームのデフォルトの
//　　　　　　文字エンコーディングに従ってバイトに変換され書き込まれる。   
//　　public void print(String s)
//　　　機能：文字列sを出力する。
//　　　　　　文字列は、プラットフォームのデフォルトの文字エンコーディングに従って
//　　　　　　バイトに変換され書き込まれる。
//　　public void println(int x)
//　　　機能：整数を出力して行を終了する。他は、print(int i)と同じ。
//    public void println(double d)
//　　　機能：実数を出力して行を終了する。他は、print(double d)と同じ。
//    public void println(String s)
//　　　機能：文字列sを出力して行を終了する。他は、print(String s)と同じ。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j643a {

  public static void main(String args[]) {

    PrintWriter pw = new PrintWriter(System.out,true);

    int n = 123;
    pw.print(n);
    double d = 123.456;
    pw.print(d);
    String s = "日本語";
    pw.print(s);

    pw.println();
    pw.println(n);
    pw.println(d);
    pw.println(s);

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j643a.java
% java j643a
123123.456日本語
123
123.456
日本語
</pre>

</body>
</html>
*/