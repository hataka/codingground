<!--====================================================================-->
<!-- << j651a.htm >>                                                    -->
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
//  << j651a.java >>
//
//  ファイル処理（５）オブジェクト整列化（オブジェクトをバイト列に変換）
//
//    オブジェクトをバイト列に変換することをオブジェクト整列化(Serializing)
//    という。この機能を利用すると、オブジェクトをファイルに保存したり、
//    ネットワーク上を転送したりできる。また、整列化したバイト列はオブジェクト
//    に戻すこともできる。
//
//    整列化するオブジェクトはSerializableインターフェースを実装する必要がある。
//　　このインターフェースはメソッドを持たない。
//
//　●java.io.ObjectOutputStreamクラス
//    オブジェクト整列化のときに使うクラスである。
//
//　○ObjectOutputStreamクラスのコンストラクタ
//　　public ObjectOutputStream(OutputStream os) throws IOException
//　　　機能：指定されたOutputStreamに書き込むObjectOutputStreamを作成。
//　　
//　○ObjectOutputStreamクラスのメソッド
//　　public final void writeObject(Object obj) throws IOException
//　　　機能：指定されたオブジェクトをObjectOutputStreamに書き込む。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class A implements Serializable {
  String doubleString(String s) {
    return s+s;
  }
}

class j651a {

  public static void main(String args[]) {

    // 整列化するオブジェクト。
    A obj = new A();

    try {
      // 出力ストリームの作成。
      FileOutputStream fos = new FileOutputStream("j651a.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // オブジェクトobjを整列化し、oosに書き込む。
      oos.writeObject(obj);

      // 出力ストリームを閉じる。
      fos.close();
      oos.close();
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j651a.java
% java j651a

</pre>

</body>
</html>
