<!--====================================================================-->
<!-- << j641c.htm >>                                                    -->
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
// << j641c.java >>
//
//  �t�@�C�������i�S�jScanner�N���X�i�L�[�{�[�h�����������́j
//
//    �L�[�{�[�h����A�������ЂƂ����͂��A�R���\�[���֏o�͂���B
//
//  ��Scanner�N���X�̃��\�b�h
//    public boolean hasNextDouble()
//�@�@�@�@�\�F���͂ɓǂݍ��߂����������ꍇtrue�A�Ȃ��ꍇfalse�B
//    public double nextDouble()
//�@�@�@�@�\�F��؂蕶���ŋ�؂�Ȃ���A�����P�����͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641c {

  public static void main(String args[]) {

    try {
      // �L�[�{�[�h��ݒ�B
      Scanner kb = new Scanner(System.in);
      // �L�[�{�[�h��������P����͂��A�R���\�[���֏o�́B
      while( kb.hasNextDouble() ) {
        double d = kb.nextDouble();
        System.out.println("�����F" + d);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j641c.java
% java j641c
12.34
�����F12.34
-12.34 56.789
�����F-12.34
�����F56.789
Ctrl-c
</pre>

</body>
</html>
