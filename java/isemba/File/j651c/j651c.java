<!--====================================================================-->
<!-- << j651c.htm >>                                                    -->
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
//  << j651c.java >>
//
//  �t�@�C�������i�T�j�I�u�W�F�N�g���񉻁i�I�u�W�F�N�g���o�C�g��ɕϊ��j
//
//    �I�u�W�F�N�g�����̃I�u�W�F�N�g���Q�Ƃ��Ă���ꍇ���I�u�W�F�N�g����
//�@�@�ł���B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class A implements Serializable {
  B obj = new B();
  String ma(String s) {
    return "[" + obj.mb(s) + "]";
  }
}

class B implements Serializable {
  String mb(String s) {
    return "(" + s + ")";
  }
}

class j651c {

  public static void main(String args[]) {

    A obj = new A();

    try {
      // �o�̓X�g���[���̍쐬�B
      FileOutputStream fos = new FileOutputStream("j651c.txt");
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
% javac j651c.java
% java j651c
</pre>

</body>
</html>
