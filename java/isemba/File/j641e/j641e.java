<!--====================================================================-->
<!-- << j641e.htm >>                                                    -->
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
// << j641e.java >>
//
//  �t�@�C�������i�S�jScanner�N���X�i�L�[�{�[�h���琮���A�����A�g�[�N������́j
//
//    �L�[�{�[�h����A�����A�����A�g�[�N������ʂ��Ȃ���ЂƂ����͂��A
//�@�@�R���\�[���֏o�͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641e {

  public static void main(String args[]) {

    try {
      // �L�[�{�[�h��ݒ�B
      Scanner kb = new Scanner(System.in);
      // �L�[�{�[�h����A�����A�����A�g�[�N���P����ʂ��Ȃ�����͂��A
      // �R���\�[���֏o�́B
      while( kb.hasNextInt()||kb.hasNextDouble()||kb.hasNext() ) {
        if( kb.hasNextInt() ) {                            
          int n = kb.nextInt();                            
          System.out.println("�����F" + n);                
        }                                                  
        if( kb.hasNextDouble() ) {                         
          double d = kb.nextDouble();                      
          System.out.println("�����F" + d);                
        }                                                  
        if( kb.hasNext() ) {                               
          String s = kb.next();                            
          System.out.println("�g�[�N���F" + s);            
        }                                                  
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j641e.java
% java j641e
123 45.67 abc
�����F123
�����F45.67
�g�[�N���Fabc
-123 -45.67 123abc
�����F-123
�����F-45.67
�g�[�N���F123abc
Ctrl-c
</pre>

</body>
</html>
