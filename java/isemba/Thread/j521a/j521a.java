<!--====================================================================-->
<!-- << j521a.htm >>                                                    -->
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
//  << j521a.java >>
//
//  �X���b�h�i�Q�j�F�X���b�h�̐���(sleep���\�b�h)
//  
//    �X���b�h����莞�Ԓ�~�ł��邱�Ƃ��m�F����B
//
//�@�@�i�P�j�X���b�h�̒�`�B
//�@�@�i�Q�j�X���b�h�̍쐬�B
//�@�@�i�R�j�X���b�h�̎��s�B
//�@�@�i�S�j5000�~���b�X���[�v�B
//
//  ��Thread�N���X�̃��\�b�h
//�@�@static void sleep(long t) throws InterruptedException
//    �@�\�Ft �~���b�ԃX���[�v����B
//          ���Ȃ킿�At�~���b�ԃX���b�h���u���b�N��Ԃɂ���B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Thread1 extends Thread {
  public void run() {
    System.out.println("�X���[�v�J�n"); 
    try {
      Thread.sleep(5000); //�i�S�j
    } catch ( InterruptedException e) { }
    System.out.println("�X���[�v�I��"); 
  }
}    

class j521a {
  public static void main(String args[]) {
 
    Thread1 th = new Thread1(); //�i�Q�j

    th.start(); //�i�R�j

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j521a.java
% java j521a
�X���[�v�J�n
�X���[�v�I��
</pre>

</body>
</html>
