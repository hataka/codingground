/*
<!--====================================================================-->
<!-- << j642a.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>*/
////////////////////////////////////////////////////////////////////////////////
// << j642a.java >>
//
//  ファイル処理（４）Scannerクラス（ファイルから１行分入力）
//
//    ファイルから、１行分入力し、コンソールへ出力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.nio.file.Files;

class j642a {

  public static void main(String args[]) {
		try{
			Scanner s = new Scanner(new File("j642a.txt")).useDelimiter("\\n");
		while(s.hasNext()) {
    String line = s.next();
		System.out.println("１行分：" + line);
		}
		}
		catch{}
		
		
		
		//String contents = new String(Files.readAllBytes("j642a.txt"), StandardCharsets.UTF_8);
    /*
		Scanner f = new Scanner(new File("j642a.txt"));
		String content = f.useDelimiter("\\Z").next();
    //String content = new Scanner(new File("j642a.txt")).useDelimiter("\\Z").next();
		System.out.println(content);
		
		try {
      // ファイルを指定し開く。
      Scanner f = new Scanner(new File("j642a.txt"));
			System.out.println("１行分：");
      // ファイルから１行分入力しコンソールへ出力。
      while( f.hasNextLine() ) {
        String s = f.nextLine();
        System.out.println("１行分：" + s);
      }
    } catch( Exception e ) { }
*/
  }

} 
/*</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% type j642a.txt
123456
-123.456
abcdefg
ABCDEFG
日本語

% javac j642a.java
% java j642a
１行分：123456
１行分：-123.456
１行分：abcdefg
１行分：ABCDEFG
１行分：日本語
</pre>

</body>
</html>*/
