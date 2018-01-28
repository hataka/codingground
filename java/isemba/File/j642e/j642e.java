<!--====================================================================-->
<!-- << j642e.htm >>                                                    -->
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
// << j642e.java >>
//
//  ファイル処理（４）Scannerクラス（ファイルから整数、実数、トークンを入力）
//
//    ファイルから、整数、実数、トークンを区別しながらひとつずつ入力し、
//　　コンソールへ出力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class j642e {

  public static void main(String args[]) {

    try {
      // ファイルを指定し開く。
      Scanner f = new Scanner(new File("j642e.txt"));
      // ファイルから、整数、実数、トークン１個を区別しながら入力し、
      // コンソールへ出力。
      while( f.hasNextInt()||f.hasNextDouble()||f.hasNext() ) {
        if( f.hasNextInt() ) {                            
          int n = f.nextInt();                            
          System.out.println("整数：" + n);                
        }                                                  
        if( f.hasNextDouble() ) {                         
          double d = f.nextDouble();                      
          System.out.println("実数：" + d);                
        }                                                  
        if( f.hasNext() ) {                               
          String s = f.next();                            
          System.out.println("トークン：" + s);            
        }                                                  
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% type j642e.txt
abc
123
123.456
0
0.0
-123.abc
日本語

% javac j642e.java
% java j642e
トークン：abc
整数：123
実数：123.456
トークン：0
実数：0.0
トークン：-123.abc
トークン：日本語
</pre>

</body>
</html>
