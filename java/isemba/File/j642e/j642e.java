<!--====================================================================-->
<!-- << j642e.htm >>                                                    -->
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
// << j642e.java >>
//
//  �t�@�C�������i�S�jScanner�N���X�i�t�@�C�����琮���A�����A�g�[�N������́j
//
//    �t�@�C������A�����A�����A�g�[�N������ʂ��Ȃ���ЂƂ����͂��A
//�@�@�R���\�[���֏o�͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class j642e {

  public static void main(String args[]) {

    try {
      // �t�@�C�����w�肵�J���B
      Scanner f = new Scanner(new File("j642e.txt"));
      // �t�@�C������A�����A�����A�g�[�N���P����ʂ��Ȃ�����͂��A
      // �R���\�[���֏o�́B
      while( f.hasNextInt()||f.hasNextDouble()||f.hasNext() ) {
        if( f.hasNextInt() ) {                            
          int n = f.nextInt();                            
          System.out.println("�����F" + n);                
        }                                                  
        if( f.hasNextDouble() ) {                         
          double d = f.nextDouble();                      
          System.out.println("�����F" + d);                
        }                                                  
        if( f.hasNext() ) {                               
          String s = f.next();                            
          System.out.println("�g�[�N���F" + s);            
        }                                                  
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% type j642e.txt
abc
123
123.456
0
0.0
-123.abc
���{��

% javac j642e.java
% java j642e
�g�[�N���Fabc
�����F123
�����F123.456
�g�[�N���F0
�����F0.0
�g�[�N���F-123.abc
�g�[�N���F���{��
</pre>

</body>
</html>
