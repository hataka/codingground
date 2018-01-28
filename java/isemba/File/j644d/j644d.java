<!--====================================================================-->
<!-- << j644d.htm >>                                                    -->
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
// << j644d.java >>
//
//  �t�@�C�������i�S�jPrintWriter�N���X�i�t�@�C���֏o�́A�����t���A�ǉ��@�\�j
//
//    �����t�@�C���̖����ɒǉ��������݂��s���@�\��ǉ�����B
//
//�@��java.io.FileWriter�N���X�̃R���X�g���N�^
//    public FileWriter(String fn) throws IOException
//�@�@�@�@�\�F�t�@�C����fn���w�肵�āAFileWriter�I�u�W�F�N�g���쐬����B 
//    public FileWriter(String fn, boolean b) throws IOException
//�@�@�@�@�\�F�t�@�C����fn���w�肵�āAFileWriter�I�u�W�F�N�g���쐬����B 
//            b��true�̏ꍇ�A�f�[�^�̓t�@�C���̖����ɏ������܂��B 
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
                                                               
      String s = "���{��";                                     
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

<font size=5 color=blue>���s����</font>

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

|���{��|
|       ���{��|
|���{��       |
</pre>

</body>
</html>
