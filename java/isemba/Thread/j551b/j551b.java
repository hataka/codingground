<!--====================================================================-->
<!-- << j551b.htm >>                                                    -->
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
//  << j551b.java >>
//
//  �X���b�h�i�T�j�F�X���b�h�ԒʐM�iwait���\�b�h�AnotifyAll���\�b�h�̑g�����j
//
//�@�@n�̃X���b�h��wait���\�b�h�����s���ꎞ��~����B
//�@�@main���\�b�h����notifyAll���\�b�h���g���āAn�̃��\�b�h�̎��s���ĊJ����B
//    �X���b�h�Ԃ̒ʐM�̂��߂ɂЂƂ̃I�u�W�F�N�g���g���B
//�@�@���̂��߂Ɋ��N���X���`����B
//
//�@�@�i�P�j���N���X�̒�`�B
//�@�@�i�Q�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�R�j���݂̃X���b�h��\�����郁�\�b�h�̒�`�B
//�@�@�i�S�j���݂̃X���b�h��\�����郁�\�b�h�̒�`�B
//�@�@�i�T�j�X���b�h�̌���ݒ�B
//�@�@�i�U�j�X���b�h���i�[����z��������B
//�@�@�i�V�j�X���b�h���쐬�B
//�@�@�i�W�j�X���b�h�����s�B
//�@�@�i�X�j�ҋ@���ԁB
//�@�@�i�P�O�j���݂̃X���b�h�����ׂĕ\���B
//�@�@�i�P�P�j�ꎞ��~���̃X���b�h�����ׂčĊJ�B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Flag {
  synchronized void WAIT() { 
    try {
      System.out.println("�X���b�h(" + Thread.currentThread().getName() + ") wait �J�n");
      wait();
      System.out.println("�X���b�h(" + Thread.currentThread().getName() + ") wait �I��");
    } catch( InterruptedException e ) { }
  }
  synchronized void NOTIFYALL() {
    System.out.println("�X���b�h(" + Thread.currentThread().getName() + ") notify �J�n");
    notifyAll();
    System.out.println("�X���b�h(" + Thread.currentThread().getName() + ") notify �I��");
  }
}

//�i�Q�j
class Thread1 extends Thread { 
  Flag f;
  Thread1(Flag f) { // �R���X�g���N�^�B
    this.f = f; 
  }
  public void run() {
    System.out.println("�X���b�h(" + this.getName() + ") �J�n");
    f.WAIT();
    System.out.println("�X���b�h(" + this.getName() + ") �I��");
  }
}

class j551b {
  //�i�R�j
  static void show() {
    int n = Thread.activeCount();
    Thread th[] = new Thread[n];
    int m = Thread.enumerate(th);
    System.out.println("�@�@[���݂̃X���b�h�\���J�n]");
    for( int i=0; i<m; i++ ) {
      System.out.println("�@�@" + i + "�Ԗڂ̃X���b�h�F" + th[i].getName());
    }
    System.out.println("�@�@[���݂̃X���b�h�\���I��]");
  }

  public static void main(String args[]) {

    Flag f = new Flag(); //�i�S�j

    int p = 5; //�i�T�j

    Thread th[] = new Thread1[p]; //�i�U�j
    for( int i=0; i<p; i++ ) {
      th[i] = new Thread1(f); //�i�V�j 
      th[i].start(); //�i�W�j
    }

    try {
      Thread.sleep(3000); //�i�X�j
    } catch ( InterruptedException e ) { } 

    show(); //�i�P�O�j

    f.NOTIFYALL(); //�i�P�P�j

    try {
      Thread.sleep(3000); //�i�V�j
    } catch ( InterruptedException e ) { } 

     show(); //�i�P�O�j

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j551b.java
% java j551b 
�X���b�h(Thread-0) �J�n
�X���b�h(Thread-0) wait �J�n
�X���b�h(Thread-1) �J�n
�X���b�h(Thread-1) wait �J�n
�X���b�h(Thread-2) �J�n
�X���b�h(Thread-2) wait �J�n
�X���b�h(Thread-3) �J�n
�X���b�h(Thread-3) wait �J�n
�X���b�h(Thread-4) �J�n
�X���b�h(Thread-4) wait �J�n
�@�@[���݂̃X���b�h�\���J�n]
�@�@0�Ԗڂ̃X���b�h�Fmain
�@�@1�Ԗڂ̃X���b�h�FThread-0
�@�@2�Ԗڂ̃X���b�h�FThread-1
�@�@3�Ԗڂ̃X���b�h�FThread-2
�@�@4�Ԗڂ̃X���b�h�FThread-3
�@�@5�Ԗڂ̃X���b�h�FThread-4
�@�@[���݂̃X���b�h�\���I��]
�X���b�h(main) notify �J�n
�X���b�h(main) notify �I��
�X���b�h(Thread-0) wait �I��
�X���b�h(Thread-0) �I��
�X���b�h(Thread-1) wait �I��
�X���b�h(Thread-1) �I��
�X���b�h(Thread-2) wait �I��
�X���b�h(Thread-2) �I��
�X���b�h(Thread-3) wait �I��
�X���b�h(Thread-3) �I��
�X���b�h(Thread-4) wait �I��
�X���b�h(Thread-4) �I��
�@�@[���݂̃X���b�h�\���J�n]
�@�@0�Ԗڂ̃X���b�h�Fmain
�@�@[���݂̃X���b�h�\���I��]
</pre>

</body>
</html>
