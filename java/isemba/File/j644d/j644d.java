<!--====================================================================-->
<!-- << j644d.htm >>                                                    -->
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
// << j644d.java >>
//
//  ファイル処理（４）PrintWriterクラス（ファイルへ出力、書式付き、追加機能）
//
//    既存ファイルの末尾に追加書き込みを行う機能を追加する。
//
//　●java.io.FileWriterクラスのコンストラクタ
//    public FileWriter(String fn) throws IOException
//　　　機能：ファイル名fnを指定して、FileWriterオブジェクトを作成する。 
//    public FileWriter(String fn, boolean b) throws IOException
//　　　機能：ファイル名fnを指定して、FileWriterオブジェクトを作成する。 
//            bがtrueの場合、データはファイルの末尾に書き込まれる。 
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j644d {

  public static void main(String args[]) {

    try {

      FileWriter fw = new FileWriter("j644d.txt",true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
                                                               
      int n = 123;                                             
      pw.printf("|%d|\n",n);                                   
      pw.printf("|%6d|\n",n);                                  
      pw.printf("|%-6d|\n",n);                                 
      pw.printf("\n");                                         
                                                               
      double d = 123.456;                                      
      pw.printf("|%f|\n",d);                                   
      pw.printf("|%12.1f|\n",d);                               
      pw.printf("|%-12.4f|\n",d);                              
      pw.printf("|%12.1e|\n",d);                               
      pw.printf("|%-12.4e|\n",d);                              
      pw.printf("\n");                                         
                                                               
      String s = "日本語";                                     
      pw.printf("|%s|\n",s);                                   
      pw.printf("|%10s|\n",s);                                 
      pw.printf("|%-10s|\n",s);                                

      pw.close();
      bw.close();
      fw.close();

    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% type j644d.txt
**********

% javac j644d.java
% java j644d

% type j644d.txt
**********|123|
|   123|
|123   |

|123.456000|
|       123.5|
|123.4560    |
|     1.2e+02|
|1.2346e+02  |

|日本語|
|       日本語|
|日本語       |
</pre>

</body>
</html>
