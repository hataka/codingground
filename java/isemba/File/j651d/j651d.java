<!--====================================================================-->
<!-- << j651d.htm >>                                                    -->
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
//  << j651d.java >>
//
//  ファイル処理（４）オブジェクト整列化（バイト列をオブジェクトに変換）
//
//    整列化されたオブジェクトを元に戻し確認する。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j651d {

  public static void main(String args[]) {

    try {
      // 入力ストリームの作成。
      FileInputStream fis = new FileInputStream("j651c.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      // oisからオブジェクトを入力。
      A obj = (A)ois.readObject();

      // オブジェクトの確認。
      System.out.println(obj.ma("abc"));

      // 入力ストリームを閉じる。
      fis.close();
      ois.close();
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j651d.java
% java j651d
[(abc)]
</pre>

</body>
</html>
