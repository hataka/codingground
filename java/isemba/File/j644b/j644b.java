<!--====================================================================-->
<!-- << j644b.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVA�v���O���~���O�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVA�v���O���~���O</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
// << j644b.java >>
//
//  �t�@�C�������i�S�jPrintWriter�N���X�i�t�@�C���֏o�́A�����t���j
//
//    C�����printf�֐��Ɠ����̋L�q���ł���B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j644b {

  public static void main(String args[]) {

    try {

      PrintWriter pw = new PrintWriter("j644b.txt");           
                                                               
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
                                                               
      String s = "���{��";                                     
      pw.printf("|%s|\n",s);                                   
      pw.printf("|%10s|\n",s);                                 
      pw.printf("|%-10s|\n",s);                                

      pw.close();

    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j644b.java
% java j644b

% type j644b.txt
|123|
|   123|
|123   |

|123.456000|
|       123.5|
|123.4560    |
|     1.2e+02|
|1.2346e+02  |

|���{��|
|       ���{��|
|���{��       |
</pre>

</body>
</html>
