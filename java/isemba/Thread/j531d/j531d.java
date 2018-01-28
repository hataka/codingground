<!--====================================================================-->
<!-- << j531d.htm >>                                                    -->
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
//  << j531d.java >>
//
//  �X���b�h�i�R�j�F�����isynchronized�u���b�N�j
//  
//�@�@�����̃X���b�h�𓯎��Ɏ��s����B�u���b�N�P�ʂŏ�������������悤��
//�@�@synchronized�u���b�N���g���Ď�������B
//
//�@�@�i�P�j�N���XComp�̒�`�B
//�@�@�@�@�@�����̃X���b�h����A�N�Z�X�����B
//�@�@�i�Q�j�X���b�h(Thread1)�̒�`
//�@�@�i�R�j�X���b�h�̌��̐ݒ�B
//�@�@�i�S�jComp�N���X�̃I�u�W�F�N�g�̍쐬�B
//�@�@�i�T�j�����̃X���b�h���i�[����z��̏����B
//�@�@�i�U�j�X���b�h�̍쐬�B
//�@�@�i�V�j�X���b�h�̎��s�B
//�@�@�i�W�j�ҋ@���ԁB
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Comp {
  void execute() {
    System.out.print("(" + Thread.currentThread().getName() + ")�F�J�n�@");
    try {
      int t = 1000+(int)(Math.random()*1000); //�i�W�j
      Thread.sleep(t);
    } catch ( InterruptedException e) { }
    System.out.println("(" + Thread.currentThread().getName() + ")�F�I��");
  }
}

//�i�Q�j                       
class Thread1 extends Thread {                         
  Comp obj;                                          
  Thread1(Comp obj) { // �R���X�g���N�^�B
    this.obj = obj;
  }                
  public void run() { 
    synchronized(obj) {
      obj.execute(); 
    }
  }    
}                                                      

class j531d {
  public static void main(String args[]) {

    int n = 9; //�i�R�j

    Comp obj = new Comp(); //�i�S�j

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
% javac j531d.java
% java j531d
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
