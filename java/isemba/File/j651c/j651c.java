<!--====================================================================-->
<!-- << j651c.htm >>                                                    -->
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
//  << j651c.java >>
//
//  ファイル処理（５）オブジェクト整列化（オブジェクトをバイト列に変換）
//
//    オブジェクトが他のオブジェクトを参照している場合もオブジェクト整列化
//　　できる。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class A implements Serializable {
  B obj = new B();
  String ma(String s) {
    return "[" + obj.mb(s) + "]";
  }
}

class B implements Serializable {
  String mb(String s) {
    return "(" + s + ")";
  }
}

class j651c {

  public static void main(String args[]) {

    A obj = new A();

    try {
      // 出力ストリームの作成。
      FileOutputStream fos = new FileOutputStream("j651c.txt");
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
% javac j651c.java
% java j651c
</pre>

</body>
</html>
