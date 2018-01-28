<!--====================================================================-->
<!-- << j651a.htm >>                                                    -->
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
//  << j651a.java >>
//
//  �t�@�C�������i�T�j�I�u�W�F�N�g���񉻁i�I�u�W�F�N�g���o�C�g��ɕϊ��j
//
//    �I�u�W�F�N�g���o�C�g��ɕϊ����邱�Ƃ��I�u�W�F�N�g����(Serializing)
//    �Ƃ����B���̋@�\�𗘗p����ƁA�I�u�W�F�N�g���t�@�C���ɕۑ�������A
//    �l�b�g���[�N���]��������ł���B�܂��A���񉻂����o�C�g��̓I�u�W�F�N�g
//    �ɖ߂����Ƃ��ł���B
//
//    ���񉻂���I�u�W�F�N�g��Serializable�C���^�[�t�F�[�X����������K�v������B
//�@�@���̃C���^�[�t�F�[�X�̓��\�b�h�������Ȃ��B
//
//�@��java.io.ObjectOutputStream�N���X
//    �I�u�W�F�N�g���񉻂̂Ƃ��Ɏg���N���X�ł���B
//
//�@��ObjectOutputStream�N���X�̃R���X�g���N�^
//�@�@public ObjectOutputStream(OutputStream os) throws IOException
//�@�@�@�@�\�F�w�肳�ꂽOutputStream�ɏ�������ObjectOutputStream���쐬�B
//�@�@
//�@��ObjectOutputStream�N���X�̃��\�b�h
//�@�@public final void writeObject(Object obj) throws IOException
//�@�@�@�@�\�F�w�肳�ꂽ�I�u�W�F�N�g��ObjectOutputStream�ɏ������ށB
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class A implements Serializable {
  String doubleString(String s) {
    return s+s;
  }
}

class j651a {

  public static void main(String args[]) {

    // ���񉻂���I�u�W�F�N�g�B
    A obj = new A();

    try {
      // �o�̓X�g���[���̍쐬�B
      FileOutputStream fos = new FileOutputStream("j651a.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // �I�u�W�F�N�gobj�𐮗񉻂��Aoos�ɏ������ށB
      oos.writeObject(obj);

      // �o�̓X�g���[�������B
      fos.close();
      oos.close();
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j651a.java
% java j651a

</pre>

</body>
</html>
