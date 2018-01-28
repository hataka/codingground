<!--====================================================================-->
<!-- << j541c.htm >>                                                    -->
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
//  << j541c.java >>
//
//  �X���b�h�i�S�j�F���̉����@�Q�isynchronized�u���b�N�j
//
//�@�@synchronized�u���b�N���g���Ċ�����������B
//
//�@�@�i�P�j�v�Z�N���X�̒�`�B
//�@�@�i�Q�j���Z�N���X�̒�`�B
//�@�@�@�@�@synchroized�u���b�N���L�q����B
//�@�@�i�R�j�R�}���h���C������J��Ԃ���args[0]���擾�B
//�@�@�i�S�jComp�N���X�̃I�u�W�F�N�g�̍쐬�B
//�@�@�i�T�j�X���b�htha�̍쐬�B
//�@�@�i�U�j�X���b�hthb�̍쐬�B
//�@�@�i�V�j�X���b�htha�̎��s�B
//�@�@�i�W�j�X���b�hthb�̎��s�B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Comp {
  long count = 0;
  void add() { count++; }
}

//�i�Q�j
class Thread1 extends Thread {
  Comp c;
  long n;
  Thread1(Comp c, long n) { // �R���X�g���N�^�B 
    this.c = c; this.n = n;
  }
  public void run() {
    for( long i=1; i<=n; i++ ) { 
      synchronized(c) { c.add(); }
    }
    System.out.println("���Z�X���b�h�i" +  this.getName() + "�j�F" + c.count);
  }
}

class j541c {
  public static void main(String args[]) {

    long n = Long.parseLong(args[0]); //�i�R�j
    System.out.println("�J��Ԃ��� = " + n);

    Comp c = new Comp(); //�i�S�j

    Thread1 tha = new Thread1(c,n); //�i�T�j
    Thread1 thb = new Thread1(c,n); //�i�U�j

    tha.start(); //�i�V�j
    thb.start(); //�i�W�j

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j541c.java
% java j541c 1000000
�J��Ԃ��� = 1000000
���Z�X���b�h�iThread-0�j�F1000000
���Z�X���b�h�iThread-1�j�F2000000

% java j541c 10000000
�J��Ԃ��� = 10000000
���Z�X���b�h�iThread-0�j�F17402773
���Z�X���b�h�iThread-1�j�F20000000

% java j541c 100000000
�J��Ԃ��� = 100000000
���Z�X���b�h�iThread-0�j�F195161233
���Z�X���b�h�iThread-1�j�F200000000
</pre>

</body>
</html>
