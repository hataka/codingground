<!--====================================================================-->
<!-- << j531c.htm >>                                                    -->
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
//  << j531c.java >>
//
//  �X���b�h�i�R�j�F�����isynchronized�u���b�N�j
//  
//�@�@�����̃X���b�h�𓯎��Ɏ��s����B�u���b�N�P�ʂŏ�������������悤��
//�@�@synchronized�u���b�N���g���Ď�������B
//
//�@�@�i�P�jsynchronized�u���b�N�����N���XSyncComp�̒�`�B
//�@�@�@�@�@�����̃X���b�h����A�N�Z�X�����B
//�@�@�i�Q�j�X���b�h(Thread1)�̒�`
//�@�@�i�R�j�X���b�h�̌��̐ݒ�B
//�@�@�i�S�jSyncComp�N���X�̃I�u�W�F�N�g�̍쐬�B
//�@�@�i�T�j�����̃X���b�h���i�[����z��̏����B
//�@�@�i�U�j�X���b�h�̍쐬�B
//�@�@�i�V�j�X���b�h�̎��s�B
//�@�@�i�W�j�ҋ@���ԁB
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class SyncComp {
  void execute() {
    synchronized(this) {
      System.out.print("(" + Thread.currentThread().getName() + ")�F�J�n�@");
      try {
        Thread.sleep(1000); //�i�W�j
      } catch ( InterruptedException e) { }
      System.out.println("(" + Thread.currentThread().getName() + ")�F�I��");
    }
  }
}

//�i�Q�j                       
class Thread1 extends Thread {                         
  SyncComp obj;                                          
  Thread1(SyncComp obj) { // �R���X�g���N�^�B
    this.obj = obj;
  }                
  public void run() { obj.execute(); }    
}                                                      

class j531c {
  public static void main(String args[]) {

    int n = 9; //�i�R�j

    SyncComp obj = new SyncComp(); //�i�S�j

    Thread1 th[] = new Thread1[n]; //�i�T�j 
    for( int i=0; i<n; i++ ) {
      th[i] = new Thread1(obj); //�i�U�j 
      th[i].start(); //�i�V�j
    }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j531c.java
% java j531c
(Thread-0)�F�J�n�@(Thread-0)�F�I��
(Thread-1)�F�J�n�@(Thread-1)�F�I��
(Thread-2)�F�J�n�@(Thread-2)�F�I��
(Thread-3)�F�J�n�@(Thread-3)�F�I��
(Thread-4)�F�J�n�@(Thread-4)�F�I��
(Thread-5)�F�J�n�@(Thread-5)�F�I��
(Thread-6)�F�J�n�@(Thread-6)�F�I��
(Thread-7)�F�J�n�@(Thread-7)�F�I��
(Thread-8)�F�J�n�@(Thread-8)�F�I��
</pre>

</body>
</html>
