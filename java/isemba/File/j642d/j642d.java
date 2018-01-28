/*
<!--====================================================================-->
<!-- << j642d.htm >>                                                    -->
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
// << j642d.java >>
//
//  ファイル処理（４）Scannerクラス（ファイルからトークンを入力）
//
//    ファイルから、トークンをひとつずつ入力し、コンソールへ出力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class j642d {

  public static void main(String args[]) {

    try {
      // ファイルを指定し開く。
      Scanner f = new Scanner(new File("j642d.txt"));
      // ファイルからトークン１個を入力し、コンソールへ出力。
      while( f.hasNext() ) {
        String s = f.next();
        System.out.println("トークン：" + s);
      }
    } catch( Exception e ) { }

  }

} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% type j642d.txt
abc
123
123.456
0
-123.abc
日本語

% javac j642d.java
% java j642d
トークン：abc
トークン：123
トークン：123.456
トークン：0
トークン：-123.abc
トークン：日本語
</pre>

</body>
</html>
*/