<!--====================================================================-->
<!-- << j641a.htm >>                                                    -->
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
// << j641a.java >>
//
//  �t�@�C�������i�S�jScanner�N���X�i�L�[�{�[�h����P�s�����́j
//
//    �L�[�{�[�h����A�P�s�����͂��A�R���\�[���֏o�͂���B
//
//�@��java.util.Scanner�N���X
//    ���̃N���X���g���āA1�s���A�g�[�N���P�A�A���l�P����͂��邱�Ƃ��ł���B
//
//  ��Scanner�N���X�̃R���X�g���N�^
//    public Scanner(InputStream is)
//�@�@�@�@�\�F���̓X�g���[��is����Scanner�I�u�W�F�N�g���쐬����B
//�@�@�@�@�@�@�X�g���[������擾�����o�C�g�́A�v���b�g�t�H�[���̃f�t�H���g
//�@�@�@�@�@�@�����Z�b�g���g�p���ĕ����ɕϊ������B
// 
//  ��Scanner�N���X�̃��\�b�h
//    public boolean hasNextLine()
//�@�@�@�@�\�F���͂ɓǂݍ��߂�s������ꍇtrue�A�Ȃ��ꍇfalse�B
//    public String nextLine()
//�@�@�@�@�\�F�s���̉��s�����܂łP�s�����͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class j641a {

  public static void main(String args[]) {

    try {
      // �L�[�{�[�h��ݒ�B
      Scanner kb = new Scanner(System.in);
      // �L�[�{�[�h����P�s�����͂��R���\�[���֏o�́B
      while( kb.hasNextLine() ) {
        String s = kb.nextLine();
        System.out.println("�P�s���F" + s);
      }
    } catch( Exception e ) { }

  }

} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j641a.java
% java j641a
123 456 789
�P�s���F123 456 789
abc def ghi
�P�s���Fabc def ghi
Ctrl-c
</pre>

</body>
</html>
