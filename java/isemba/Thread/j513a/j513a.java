<!--====================================================================-->
<!-- << j513a.htm >>                                                    -->
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
//  << j513a.java >>
//
//  �X���b�h�i�P�j�F�X���b�h�̗D�揇��
//
//�@�@�@�X���b�h�ɂ͗D�揇�ʂ�ݒ�ł��邱�Ƃ��m�F����B
//
//�@�@�i�P�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�Q�j�X���b�htha�̍쐬�B
//�@�@�i�R�j�X���b�hthb�̍쐬�B
//�@�@�i�S�j�X���b�htha�ɗD�揇��MIN_PRIORITY��ݒ�B
//�@�@�i�T�j�X���b�hthb�ɗD�揇��MAX_PRIORITY��ݒ�B
//�@�@�i�U�j�X���b�htha�̎��s�B
//�@�@�i�V�j�X���b�htha�̗D�揇�ʂ��擾�B
//�@�@�i�W�j�X���b�hthb�̎��s�B
//�@�@�i�V�j�X���b�hthb�̗D�揇�ʂ��擾�B
//
//  ��Thread�N���X�̃��\�b�h
//    public final int getPriority()
//      �@�\�F�D�揇�ʂ��擾����B
//�@�@public final void setPriority(int n)
//      �@�\�F�D�揇�ʂ̒ln��ݒ肷��B
//
//  ��Thread�N���X�̃t�B�[���h
//    public static final int MIN_PRIORITY    �Œ�̗D�揇�ʂ̒l
//    public static final int NORM_PRIORITY   �ʏ�̗D�揇�ʂ̒l
//    public static final int MAX_PRIORITY    �ō��̗D�揇�ʂ̒l
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Thread1 extends Thread { 
  public void run() {
    int p = this.getPriority(); //�i�V�j
    String s = this.getName();
    System.out.println("�X���b�h�F" + s + "�̗D�揇�� " + p);
  }
}

class j513a {
  public static void main(String args[]) {

    Thread1 tha = new Thread1(); //�i�Q�j
    Thread1 thb = new Thread1(); //�i�R�j

    tha.setPriority(Thread.MIN_PRIORITY); //�i�S�j
    thb.setPriority(Thread.MAX_PRIORITY); //�i�T�j

    tha.start(); //�i�U�j
    thb.start(); //�i�W�j

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j513a.java
% java j513a
�X���b�h�FThread-1�̗D�揇�� 10
�X���b�h�FThread-0�̗D�揇�� 1
</pre>

</body>
</html>
