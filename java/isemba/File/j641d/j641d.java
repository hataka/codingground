<!--====================================================================-->
<!-- << j641d.htm >>                                                    -->
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
// << j641d.java >>
//
//  �t�@�C�������i�S�jScanner�N���X�i�L�[�{�[�h����g�[�N������́j
//
//    �L�[�{�[�h����A�g�[�N�����ЂƂ����͂��A�R���\�[���֏o�͂���B
//
//  ��Scanner�N���X�̃��\�b�h
//    public boolean hasNext()
//�@�@�@�@�\�F���͂ɓǂݍ��߂�g�[�N��������ꍇtrue�A�Ȃ��ꍇfalse�B
//    public double next()
//�@�@�@�@�\�F��؂蕶���ŋ�؂�Ȃ���A�g�[�N���P�����͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641d {

  public static void main(String args[]) {

    try {
      // �L�[�{�[�h��ݒ�B
      Scanner kb = new Scanner(System.in);
      // �L�[�{�[�h����g�[�N���P����͂��A�R���\�[���֏o�́B
      while( kb.hasNext() ) {
        String s = kb.next();
        System.out.println("�g�[�N���F" + s);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j641d.java
% java j641d
123 abc
�g�[�N���F123
�g�[�N���Fabc
45.67 def 123ABC
�g�[�N���F45.67
�g�[�N���Fdef
�g�[�N���F123ABC
Ctrl-c
</pre>

</body>
</html>
