<!--====================================================================-->
<!-- << j512c.htm >>                                                    -->
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
//  << j512c.java >>
//
//  �X���b�h�i�P�j�F�X���b�h�i�A�N�e�B�u�ȃX���b�h�̕\���j
//
//�@�@�A�N�e�B�u�ȃX���b�h���m�F����B
//
//�@�@�i�P�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�Q�j�쐬����X���b�h�̌�n��ݒ�B
//�@�@�i�R�j�쐬�����X���b�h���i�[����z��th�������B
//�@�@�i�S�j�X���b�h�̍쐬�B
//�@�@�i�T�j�X���b�h�̎��s�B
//�@�@�i�U�j�A�N�e�B�u�ȃX���b�h�����擾�B
//�@�@�i�V�j�A�N�e�B�u�ȃX���b�h���i�[����z��tha�������B
//�@�@�i�W�j�A�N�e�B�u�ȃX���b�h���擾�B
//�@�@�i�X�j�A�N�e�B�u�ȃX���b�h�����擾�B
//
//  �����C���X���b�h
//    Java�v���O�����́A�K����̃X���b�h(���O�Fmain)�����B
//
//  ��Thread�N���X�̃��\�b�h
//    public static int enumerate(Thread array[])
//      �@�\�F�A�N�e�B�u�Ȃ��ׂẴX���b�h�I�u�W�F�N�g���擾���A�z��ɕۑ��B
//            �X���b�h�I�u�W�F�N�g����Ԃ��B
//            �N���X���\�b�h�Ȃ̂ŁA�N���X��.���\�b�h���ŌĂяo���B
//�@�@public static int activeCount()
//      �@�\�F�A�N�e�B�u�ȃX���b�h�I�u�W�F�N�g����Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Thread1 extends Thread { 
  public void run() {
    String s = Thread.currentThread().getName();
    System.out.println("�X���b�h�F" + s + " �N��");
  }
}

class j512c {
  public static void main(String args[]) {

    int n = 5; //�i�Q�j

    Thread1 th[] = new Thread1[n]; //�i�R�j
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(); //�i�S�j
      th[i].start(); //�i�T�j
    }

    int m = Thread.activeCount(); //�i�U�j
    Thread tha[] = new Thread[m]; //�i�V�j
    Thread.enumerate(tha); //�i�W�j
    System.out.println("�A�N�e�B�u�ȃX���b�h���F" + m);
    System.out.println("�A�N�e�B�u�ȃX���b�h�ꗗ");
    for( int i=0; i<m; i++ ) {
      String s = tha[i].getName(); //�i�X�j
      System.out.println("[" + i + "] " + s);
    }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j512c.java
% java j512c
�A�N�e�B�u�ȃX���b�h���F6
�A�N�e�B�u�ȃX���b�h�ꗗ
[0] main
[1] Thread-0
[2] Thread-1
[3] Thread-2
[4] Thread-3
[5] Thread-4
�X���b�h�FThread-0 �N��
�X���b�h�FThread-1 �N��
�X���b�h�FThread-2 �N��
�X���b�h�FThread-3 �N��
�X���b�h�FThread-4 �N��
</pre>

</body>
</html>
