<!--====================================================================-->
<!-- << j642c.htm >>                                                    -->
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
// << j642c.java >>
//
//  �t�@�C�������i�S�jScanner�N���X�i�t�@�C�������������́j
//
//    �t�@�C������A�������ЂƂ����͂��A�R���\�[���֏o�͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class j642c {

  public static void main(String args[]) {

    try {
      // �t�@�C�����w�肵�J���B
      Scanner f = new Scanner(new File("j642c.txt"));
      // �t�@�C����������P����͂��A�R���\�[���֏o�́B
      while( f.hasNextDouble() ) {
        double d = f.nextDouble();
        System.out.println("�����F" + d);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% type j642c.txt
123.456
0
-123.456

% javac j642c.java
% java j642c
�����F123.456
�����F0.0
�����F-123.456
</pre>

</body>
</html>
