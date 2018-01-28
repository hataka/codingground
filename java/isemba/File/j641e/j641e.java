<!--====================================================================-->
<!-- << j641e.htm >>                                                    -->
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
// << j641e.java >>
//
//  ファイル処理（４）Scannerクラス（キーボードから整数、実数、トークンを入力）
//
//    キーボードから、整数、実数、トークンを区別しながらひとつずつ入力し、
//　　コンソールへ出力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641e {

  public static void main(String args[]) {

    try {
      // キーボードを設定。
      Scanner kb = new Scanner(System.in);
      // キーボードから、整数、実数、トークン１個を区別しながら入力し、
      // コンソールへ出力。
      while( kb.hasNextInt()||kb.hasNextDouble()||kb.hasNext() ) {
        if( kb.hasNextInt() ) {                            
          int n = kb.nextInt();                            
          System.out.println("整数：" + n);                
        }                                                  
        if( kb.hasNextDouble() ) {                         
          double d = kb.nextDouble();                      
          System.out.println("実数：" + d);                
        }                                                  
        if( kb.hasNext() ) {                               
          String s = kb.next();                            
          System.out.println("トークン：" + s);            
        }                                                  
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j641e.java
% java j641e
123 45.67 abc
整数：123
実数：45.67
トークン：abc
-123 -45.67 123abc
整数：-123
実数：-45.67
トークン：123abc
Ctrl-c
</pre>

</body>
</html>
