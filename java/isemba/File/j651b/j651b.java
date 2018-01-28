<!--====================================================================-->
<!-- << j651b.htm >>                                                    -->
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
//  << j651b.java >>
//
//  �t�@�C�������i�S�j�I�u�W�F�N�g���񉻁i�o�C�g����I�u�W�F�N�g�ɕϊ��j
//
//    ���񉻂��ꂽ�I�u�W�F�N�g�����ɖ߂��m�F����B
//
//�@��java.io.ObjectIntputStream�N���X
//    �I�u�W�F�N�g���񉻂̂Ƃ��Ɏg���N���X�ł���B
//
//�@��ObjectIntputStream�N���X�̃R���X�g���N�^
//�@�@public ObjectInputStream(InputStream obj) throws IOException
//�@�@�@�@�\�F�w�肳�ꂽInputStream����ǂݍ���ObjectInputStream���쐬�B
//�@�@
//�@��ObjectInputStream�N���X�̃��\�b�h
//�@�@public final Object readObject() throws IOException,ClassNotFoundException
//�@�@�@�@�\�FObjectInputStream����I�u�W�F�N�g��ǂݍ��݂܂�
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j651b {

  public static void main(String args[]) {

    try {
      // ���̓X�g���[���쐬�B
      FileInputStream fis = new FileInputStream("j651a.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      // ois����I�u�W�F�N�g����́B
      A obj = (A)ois.readObject();

      // �I�u�W�F�N�g�̊m�F�B
      System.out.println(obj.doubleString("abc"));

      // ���̓X�g���[�������B
      fis.close();
      ois.close();
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j651b.java
% java j651b
abcabc
</pre>

</body>
</html>
