<!--====================================================================-->
<!-- << j651d.htm >>                                                    -->
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
//  << j651d.java >>
//
//  �t�@�C�������i�S�j�I�u�W�F�N�g���񉻁i�o�C�g����I�u�W�F�N�g�ɕϊ��j
//
//    ���񉻂��ꂽ�I�u�W�F�N�g�����ɖ߂��m�F����B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j651d {

  public static void main(String args[]) {

    try {
      // ���̓X�g���[���̍쐬�B
      FileInputStream fis = new FileInputStream("j651c.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      // ois����I�u�W�F�N�g����́B
      A obj = (A)ois.readObject();

      // �I�u�W�F�N�g�̊m�F�B
      System.out.println(obj.ma("abc"));

      // ���̓X�g���[�������B
      fis.close();
      ois.close();
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j651d.java
% java j651d
[(abc)]
</pre>

</body>
</html>
