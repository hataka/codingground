<!--====================================================================-->
<!-- << j512b.htm >>                                                    -->
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
//  << j512b.java >>
//
//  �X���b�h�i�P�j�F�X���b�h�i�����̃X���b�h�̍쐬�j
//
//�@�@�����̃X���b�h���쐬���z��Ɋi�[����B
//    �쐬���ꂽ�X���b�h�ɂ́A���ʂ��邽�߂Ɏ����I�ɁA"Thread-"+n �Ƃ������O��
//�@�@������B�������An�͐����B
//    ���̂��Ƃ��m�F����B
//
//�@�@�i�P�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�Q�j�쐬����X���b�h�̌�n��ݒ�B
//�@�@�i�R�j�쐬�����X���b�h���i�[����z��th�������B
//�@�@�i�S�j�X���b�h�̍쐬�B
//�@�@�i�T�j�X���b�h�̎��s�B
//
//�@��Thread�N���X�̃��\�b�h
//�@�@public static Thread currentThread()
//�@�@�@�@�\�F���ݎ��s����Thread�I�u�W�F�N�g���擾����B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Thread1 extends Thread { 
  public void run() {
    String s = Thread.currentThread().getName();
    System.out.println("�X���b�h�F" + s + " �N��");
  }
}

class j512b {
  public static void main(String args[]) {

    int n = 5; //�i�Q�j

    Thread1 th[] = new Thread1[n]; //�i�R�j
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(); //�i�S�j
      th[i].start(); //�i�T�j
    }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j512b.java
% java j512b
�X���b�h�FThread-0 �N��
�X���b�h�FThread-1 �N��
�X���b�h�FThread-2 �N��
�X���b�h�FThread-3 �N��
�X���b�h�FThread-4 �N��
</pre>

</body>
</html>
