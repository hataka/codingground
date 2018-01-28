<!--====================================================================-->
<!-- << j541d.htm >>                                                    -->
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
//  << j541d.java >>
//
//  �X���b�h�i�S�j�F���̉����@�����isynchronized���\�b�h�j
//
//�@�@���Z�X���b�h��m�쐬���A�e�X���b�h�̌J��Ԃ��񐔂�n�Ƃ���B
//�@�@�Ō�̌��ʂ�mn�ɂȂ�Ί��������������ƂɂȂ�B
//
//�@�@�i�P�j�v�Z�N���X�̒�`�B
//�@�@�@�@�@add���\�b�h��synchronized���\�b�h�ɏ���������B
//�@�@�i�Q�j���Z�N���X�̒�`�B
//�@�@�i�R�j�R�}���h���C������X���b�h��args[0]���擾�B
//�@�@�i�S�j�R�}���h���C������J��Ԃ���args[0]���擾�B
//�@�@�i�T�jComp�N���X�̃I�u�W�F�N�g�̍쐬�B
//�@�@�i�U�j�X���b�h���i�[����z��������B
//�@�@�i�V�j�X���b�h�̍쐬�B
//�@�@�i�W�j�X���b�h�̎��s�B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Comp {
  long count = 0;
  synchronized void add() { count++; }
}

//�i�Q�j
class Thread1 extends Thread {
  Comp c;
  long n;
  Thread1(Comp c, long n) { // �R���X�g���N�^�B 
    this.c = c; this.n = n;
  }
  public void run() {
    for( long i=1; i<=n; i++ ) { c.add(); }
    System.out.println("���Z�X���b�h�i" +  this.getName() + "�j�F" + c.count);
  }
}

class j541d {
  public static void main(String args[]) {

    int m = Integer.parseInt(args[0]); //�i�R�j
    System.out.println("�X���b�h�� = " + m);
    long n = Integer.parseInt(args[1]); //�i�S�j
    System.out.println("�J��Ԃ��� = " + n);

    Comp c = new Comp(); //�i�T�j

    Thread1 th[] = new Thread1[m]; //�i�U�j
    for( int i=0; i<m; i++ ) {
      th[i] = new Thread1(c,n); //�i�V�j
      th[i].start(); //�i�W�j
    }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j541d.java
% java j541d 9 1000000
�X���b�h�� = 9
�J��Ԃ��� = 1000000
���Z�X���b�h�iThread-0�j�F1000000
���Z�X���b�h�iThread-1�j�F2000000
���Z�X���b�h�iThread-2�j�F3000000
���Z�X���b�h�iThread-3�j�F4000000
���Z�X���b�h�iThread-4�j�F5000000
���Z�X���b�h�iThread-5�j�F6000000
���Z�X���b�h�iThread-6�j�F7000000
���Z�X���b�h�iThread-7�j�F8000000
���Z�X���b�h�iThread-8�j�F9000000

% java j541d 9 10000000
�X���b�h�� = 9
�J��Ԃ��� = 10000000
���Z�X���b�h�iThread-0�j�F72155131
���Z�X���b�h�iThread-2�j�F89998491
���Z�X���b�h�iThread-7�j�F89998927
���Z�X���b�h�iThread-6�j�F89999299
���Z�X���b�h�iThread-3�j�F89999411
���Z�X���b�h�iThread-8�j�F89999606
���Z�X���b�h�iThread-5�j�F89999734
���Z�X���b�h�iThread-1�j�F89999795
���Z�X���b�h�iThread-4�j�F90000000
</pre>

</body>
</html>
