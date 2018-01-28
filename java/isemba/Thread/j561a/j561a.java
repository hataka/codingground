<!--====================================================================-->
<!-- << j561a.htm >>                                                    -->
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
//  << j561a.java >>
//
//  �X���b�h�i�U�j�F�f�b�h���b�N�i������j
//
//�@�@�f�b�h���b�N�̗�������B
//
//�@�@�X���b�h�P�́A�I�u�W�F�N�gobj1�A�I�u�W�F�N�gobj2�̏��Ƀ��b�N���|����B
//�@�@�X���b�h�Q�́A�I�u�W�F�N�gobj2�A�I�u�W�F�N�gobj1�̏��Ƀ��b�N���|����B
//
////////////////////////////////////////////////////////////////////////////////

// �v�Z�N���X�̒�`�B
class Comp {
  long count = 0;
  void add() { count++; }
}

// �X���b�h�P�̒�`�B
class Thread1 extends Thread {
  Comp obj1,obj2;
  int n;
  Thread1(Comp obj1, Comp obj2, int n) { // �R���X�g���N�^�B
    this.obj1 = obj1; this.obj2 = obj2; this.n = n; 
  }
  public void run() { // �����{�́B
    System.out.println("�X���b�h�P�N��");

    for( int i=1; i<=n; i++ ) {
      synchronized(obj1) {
        obj1.add();

            try { // �����_���ȊԊu�B  
              Thread.sleep((long)(Math.random()*10)+1);
            } catch ( InterruptedException e) { }
            System.out.println("�X���b�h�P(obj1)�Fi=" + i);

        synchronized(obj2) {
          obj2.add(); 
        }

            try { // �����_���ȊԊu�B  
              Thread.sleep((long)(Math.random()*10)+1);
            } catch ( InterruptedException e) { }
            System.out.println("�X���b�h�P(obj2)�Fi=" + i);

      }

    }
  }
}

// �X���b�h�Q�̒�`�B
class Thread2 extends Thread {
  Comp obj1,obj2;
  int n;
  Thread2(Comp obj1, Comp obj2, int n) { // �R���X�g���N�^�B
    this.obj1 = obj1; this.obj2 = obj2; this.n = n; 
  }
  public void run() { // �����{�́B
    System.out.println("�X���b�h�Q�N��");

        try { // �����_���ȊԊu�B  
          Thread.sleep(50);
        } catch ( InterruptedException e) { }
        System.out.println("�X���b�h�Q");

    for( int i=1; i<=n; i++ ) {
      synchronized(obj2) {
        obj2.add(); 

            try { // �����_���ȊԊu�B  
              Thread.sleep(10);
            } catch ( InterruptedException e) { }
            System.out.println("�X���b�h�Q(obj2)�Fi=" + i);

        synchronized(obj1) {
          obj1.add(); 
        }

            try { // �����_���ȊԊu�B  
              Thread.sleep(10);
            } catch ( InterruptedException e) { }
            System.out.println("�X���b�h�Q(obj1)�Fi=" + i);

      }

    }
  }
}

public class j561a {
  public static void main(String args[]) {
   
    int n = Integer.parseInt(args[0]); // �J��Ԃ���n�̎擾�B

    System.out.println("n = " + n);

    Comp obj1 = new Comp(); // �v�Z�N���X�̃I�u�W�F�N�gobj1�̍쐬�B
    Comp obj2 = new Comp(); // �v�Z�N���X�̃I�u�W�F�N�gobj2�̍쐬�B

    Thread1 th1 = new Thread1(obj1,obj2,n); // �X���b�hth1�̍쐬�B
    Thread2 th2 = new Thread2(obj1,obj2,n); // �X���b�hth2�̍쐬�B
     
    th1.start(); // �X���b�hth1�̎��s�B
    th2.start(); // �X���b�hth1�̎��s�B

    try {
      th1.join(); th2.join(); // ���ׂẴX���b�h�̏I����҂B
    } catch ( InterruptedException e ) { }
    System.out.println("���ׂẴX���b�h���I�����܂���");
    System.out.println("obj1��count = " + obj1.count);
    System.out.println("obj2��count = " + obj2.count);

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j561a.java
% java j561a 10
n = 10
�X���b�h�P�N��
�X���b�h�Q�N��
�X���b�h�P(obj1)�Fi=1
�X���b�h�P(obj2)�Fi=1
�X���b�h�P(obj1)�Fi=2
�X���b�h�P(obj2)�Fi=2
�X���b�h�P(obj1)�Fi=3
�X���b�h�P(obj2)�Fi=3
�X���b�h�P(obj1)�Fi=4
�X���b�h�P(obj2)�Fi=4
�X���b�h�P(obj1)�Fi=5
�X���b�h�Q
�X���b�h�P(obj2)�Fi=5
�X���b�h�Q(obj2)�Fi=1
�X���b�h�P(obj1)�Fi=6
Ctrl-c �Œ��f
</pre>

</body>
</html>
