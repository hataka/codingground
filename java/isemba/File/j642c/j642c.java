<!--====================================================================-->
<!-- << j642c.htm >>                                                    -->
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
// << j642c.java >>
//
//  ファイル処理（４）Scannerクラス（ファイルから実数を入力）
//
//    ファイルから、実数をひとつずつ入力し、コンソールへ出力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class j642c {

  public static void main(String args[]) {

    try {
      // ファイルを指定し開く。
      Scanner f = new Scanner(new File("j642c.txt"));
      // ファイルから実数１個を入力し、コンソールへ出力。
      while( f.hasNextDouble() ) {
        double d = f.nextDouble();
        System.out.println("実数：" + d);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% type j642c.txt
123.456
0
-123.456

% javac j642c.java
% java j642c
実数：123.456
実数：0.0
実数：-123.456
</pre>

</body>
</html>
