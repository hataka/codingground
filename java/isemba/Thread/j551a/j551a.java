<!--====================================================================-->
<!-- << j551a.htm >>                                                    -->
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
//  << j551ajava >>
//
//  �X���b�h�i�T�j�F�X���b�h�ԒʐM�iwait���\�b�h�Anotify���\�b�h�̑g�����j
//
//�@�@�P�̃X���b�h��wait���\�b�h�����s���ꎞ��~����B
//�@�@main���\�b�h����notify���\�b�h���g���āA���̃��\�b�h�̎��s���ĊJ����B
//    �X���b�h�ԒʐM�̂��߂ɂЂƂ̃I�u�W�F�N�g���g���B
//�@�@���̂��߂Ɋ��N���X���`����B
//
//�@�@�i�P�j���N���X�̒�`�B
//�@�@�i�Q�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�R�j���݂̃X���b�h��\�����郁�\�b�h�̒�`�B
//�@�@�i�S�j���݂̃X���b�h��\�����郁�\�b�h�̒�`�B
//�@�@�i�T�j�X���b�h�̍쐬�B
//�@�@�i�U�j�X���b�h�̎��s�B
//�@�@�i�V�j�ҋ@���ԁB
//�@�@�i�W�j���݂̃X���b�h�����ׂĕ\���B
//�@�@�i�X�j�ꎞ��~���̃X���b�h���ĊJ�B
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
  synchronized void NOTIFY() {
    System.out.println("�X���b�h(" + Thread.currentThread().getName() + ") notify �J�n");
    notify();
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

class j551a {
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

    Thread1 th = new Thread1(f); //�i�T�j 

    th.start(); //�i�U�j

    try {
      Thread.sleep(3000); //�i�V�j
    } catch ( InterruptedException e ) { } 

    show(); //�i�W�j

    f.NOTIFY(); //�i�X�j

    try {
      Thread.sleep(3000); //�i�V�j
    } catch ( InterruptedException e ) { } 

     show(); //�i�W�j

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j551a.java
% java j551a 
�X���b�h(Thread-0) �J�n
�X���b�h(Thread-0) wait �J�n
�@�@[���݂̃X���b�h�\���J�n]
�@�@0�Ԗڂ̃X���b�h�Fmain
�@�@1�Ԗڂ̃X���b�h�FThread-0
�@�@[���݂̃X���b�h�\���I��]
�X���b�h(main) notify �J�n
�X���b�h(main) notify �I��
�X���b�h(Thread-0) wait �I��
�X���b�h(Thread-0) �I��
�@�@[���݂̃X���b�h�\���J�n]
�@�@0�Ԗڂ̃X���b�h�Fmain
�@�@[���݂̃X���b�h�\���I��]
</pre>

</body>
</html>
