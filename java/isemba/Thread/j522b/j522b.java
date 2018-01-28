<!--====================================================================-->
<!-- << j522b.htm >>                                                    -->
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
//  << j522b.java >>
//
//  �X���b�h�i�Q�j�F�X���b�h�̐���(join���\�b�h)
//
//    �X�̃X���b�h���N�����A���ׂẴX���b�h���I��������Amain�X���b�h��
//�@�@���s���J�n����B
//  
//�@�@�i�P�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�Q�j�X���b�h�̌���ݒ�B
//�@�@�i�R�j�X���b�h���i�[����z�����������B
//�@�@�i�S�j�X���b�h�̍쐬�B
//�@�@�i�T�j�X���b�h�̎��s�B
//�@�@�i�U�jth[i].join()�����s����main�X���b�h�́A�X���b�h�I�u�W�F�N�gth��
//�@�@�@�@�@�I������܂ő҂B
//�@�@�i�V�j�P�b�ԃX���[�v�B
//  
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Thread1 extends Thread {
  public void run() {
    String s = this.getName();
    System.out.println("�X���b�h(" + s + ")�J�n");
    try {
      Thread.sleep(1000); //�i�V�j
    } catch ( InterruptedException e ) {  }
    System.out.println("�X���b�h(" + s + ")�I��");
  }
}

class j522b {
  public static void main(String args[]) {

    int n = 9; //�i�Q�j

    Thread1 th[] = new Thread1[n]; //�i�R�j 
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(); //�i�S�j 
      th[i].start(); //�i�T�j
    }

    String c = Thread.currentThread().getName();
    System.out.println("�X���b�h" + c + "��" + n + "�̃X���b�h�̏I����҂��܂�");

    try {
      for( int i=0; i<n; i++ ) {
        th[i].join(); //�i�U�j
      }
    } catch ( InterruptedException e ) { }

    System.out.println("�X���b�h" + c + "��" + n + "�̃X���b�h�̏I�����m�F���܂���");

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j522b.java
% java j522b
�X���b�hmain��9�̃X���b�h�̏I����҂��܂�
�X���b�h(Thread-0)�J�n
�X���b�h(Thread-1)�J�n
�X���b�h(Thread-8)�J�n
�X���b�h(Thread-2)�J�n
�X���b�h(Thread-7)�J�n
�X���b�h(Thread-6)�J�n
�X���b�h(Thread-5)�J�n
�X���b�h(Thread-4)�J�n
�X���b�h(Thread-3)�J�n
�X���b�h(Thread-0)�I��
�X���b�h(Thread-1)�I��
�X���b�h(Thread-2)�I��
�X���b�h(Thread-7)�I��
�X���b�h(Thread-6)�I��
�X���b�h(Thread-5)�I��
�X���b�h(Thread-4)�I��
�X���b�h(Thread-3)�I��
�X���b�h(Thread-8)�I��
�X���b�hmain��9�̃X���b�h�̏I�����m�F���܂���
</pre>

</body>
</html>
