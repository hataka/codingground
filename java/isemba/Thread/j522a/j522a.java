<!--====================================================================-->
<!-- << j522a.htm >>                                                    -->
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
//  << j522a.java >>
//
//  �X���b�h�i�Q�j�F�X���b�h�̐���(join���\�b�h)
//
//    join���\�b�h���g���āA����̃X���b�h�̏I����҂B
//�@�@���̂��Ƃ��m�F����B
//
//�@�@�i�P�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�Q�j�X���b�h�̍쐬�B
//�@�@�i�R�j�X���b�h�̎��s�B
//�@�@�i�S�jth.join()�����s�����X���b�h�́A�X���b�h�I�u�W�F�N�gth��
//�@�@�@�@�@�I������܂ő҂B
//�@�@�i�T�j�T�b�ԃX���[�v�B
//  
//  ��Thread�N���X�̃��\�b�h
//�@�@public final void join() throws InterruptedException
//      �@�\�Fstart���\�b�h�ŋN�������X���b�h���I������܂ŉi���ɑ҂B
//�@�@public final void join(long t) throws InterruptedException
//      �@�\�Ft�~���b�ԁAstart���\�b�h�ŋN�������X���b�h���I������܂ő҂B
//�@�@�@�@    �X���b�h���I�����Ȃ��Ă��߂�B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Thread1 extends Thread {
  public void run() {
    String t = this.getName();
    System.out.println("�@�X���b�h" + t + "�̊J�n");
    try {
      Thread.sleep(5000); //�i�T�j
    } catch( InterruptedException e) { } 
    System.out.println("�@�X���b�h" + t + "�̏I��");
  }
}

class j522a {
  public static void main(String args[]) {

    Thread1 th = new Thread1(); //�i�Q�j 

    th.start(); //�i�R�j

    String c = Thread.currentThread().getName();
    String s = th.getName();
    System.out.println("�X���b�h" + c + "���X���b�h" + s + "�̏I����҂��܂�");

    try {
      th.join(); //�i�S�j
    } catch ( InterruptedException e ) {  }

    System.out.println("�X���b�h" + c + "���X���b�h" + s + "�̏I�����m�F���܂���");

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j522a.java
% java j522a
�X���b�hmain���X���b�hThread-0�̏I����҂��܂�
�@�X���b�hThread-0�̊J�n
�@�X���b�hThread-0�̏I��
�X���b�hmain���X���b�hThread-0�̏I�����m�F���܂���
</pre>

</body>
</html>
