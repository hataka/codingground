<!--====================================================================-->
<!-- << j512a.htm >>                                                    -->
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
//  << j512a.java >>
//
//  �X���b�h�i�P�j�F�X���b�h�i���O�̐ݒ�Ǝ擾�j
//
//�@�@�X���b�h�̖��O�̐ݒ�Ǝ擾���m�F����B
//
//�@�@�i�P�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�Q�j�X���b�h�̍쐬�B
//�@�@�i�R�j�X���b�h�̖��O��ݒ�B
//�@�@�i�S�j�X���b�h�̎��s�B
//�@�@�i�T�j�X���b�h�̖��O���擾�B
//
//  ��Thread�N���X�̃��\�b�h
//    public final void setName(String s)
//�@�@�@�@�\�F�X���b�h�̖��O��s�ɂ���B 
//�@�@public String getName()
//      �@�\�FThread�I�u�W�F�N�g�̖��O���擾����B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Thread1 extends Thread { 
  public void run() {
    String s = this.getName(); //�i�T�j
    System.out.println("�X���b�h�i���O�F" + s + "�j���N�����܂���");
  }
}

class j512a {
  public static void main(String args[]) {

    Thread1 th1 = new Thread1(); //�i�Q�j

    th1.setName("�X���b�h�P"); //�i�R�j

    th1.start(); //�i�S�j

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j512a.java
% java j512a
�X���b�h�i���O�F�X���b�h�P�j���N�����܂���
</pre>

</body>
</html>
