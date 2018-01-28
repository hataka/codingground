<!--====================================================================-->
<!-- << j651b.htm >>                                                    -->
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
//  << j651b.java >>
//
//  ファイル処理（４）オブジェクト整列化（バイト列をオブジェクトに変換）
//
//    整列化されたオブジェクトを元に戻し確認する。
//
//　●java.io.ObjectIntputStreamクラス
//    オブジェクト整列化のときに使うクラスである。
//
//　○ObjectIntputStreamクラスのコンストラクタ
//　　public ObjectInputStream(InputStream obj) throws IOException
//　　　機能：指定されたInputStreamから読み込むObjectInputStreamを作成。
//　　
//　○ObjectInputStreamクラスのメソッド
//　　public final Object readObject() throws IOException,ClassNotFoundException
//　　　機能：ObjectInputStreamからオブジェクトを読み込みます
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j651b {

  public static void main(String args[]) {

    try {
      // 入力ストリーム作成。
      FileInputStream fis = new FileInputStream("j651a.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      // oisからオブジェクトを入力。
      A obj = (A)ois.readObject();

      // オブジェクトの確認。
      System.out.println(obj.doubleString("abc"));

      // 入力ストリームを閉じる。
      fis.close();
      ois.close();
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j651b.java
% java j651b
abcabc
</pre>

</body>
</html>
