<!--====================================================================-->
<!-- << j552a.htm >>                                                    -->
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
//  << j552a.java >>
//
//  �X���b�h�i�T�j�F���Y�ҁE����Җ��i�P�j
//
//�@�����Y�ҁE����Җ��
//
//�@�@���Y�ґ�
//�@�@�@(a)�e�[�u����ɐ��Y�����Ȃ��ꍇ�A���Y�����P�e�[�u���ɏ悹��B
//�@�@�@�@ �����ɁA����҂Ƀe�[�u���ɐ��Y�����̂������Ƃ�����҂ɒʒm����B
//�@�@�@(b)�e�[�u����ɐ��Y�����P����ꍇ�A�҂B
//�@�@����ґ�
//�@�@�@(c)�e�[�u����ɐ��Y�����Ȃ���΁A���Y�����͂�����܂ő҂B
//�@�@�@(d)�e�[�u����ɐ��Y�����P����Ώ����B
//�@�@�@�@ �����ɁA�e�[�u����̐��Y������������Ƃ𐶎Y�҂ɒʒm����B
//
//    ���Y�҂𐶎Y�҃X���b�h�A����҂�����҃X���b�h�ŕ\���B
//�@�@�e�[�u���N���X���g���A���Y�҃X���b�h�Ə���҃X���b�h�̒ʐM���s���B
//
//�@�@�i�P�j�e�[�u���N���X�̒�`�B
//�@�@�i�Q�j���Y�҃N���X�̒�`�B
//�@�@�i�R�j����҃N���X�̒�`�B
//�@�@�i�S�j�e�[�u���N���X�̃I�u�W�F�N�g�̍쐬�B
//�@�@�i�T�j���Y�E����񐔂�ݒ�B
//�@�@�i�U�j���Y�҃X���b�h�̍쐬�B
//�@�@�i�V�j����҃X���b�h�̍쐬�B
//�@�@�i�W�j���Y�҃X���b�h�̎��s�B
//�@�@�i�X�j����҃X���b�h�̎��s�B
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class Table {
  int count = 0; // ���݂̐��Y���̌��B
  synchronized void seisan() {
    while( count == 1 ) {
      try {
        wait(); // ���̃X���b�h�Ŏ��s���ꂽnotify���\�b�h�ɂ���čĊJ���ꂽ
                // �X���b�h�́A�����Ƀ��b�N��������B
                // �������A���̎��_�ŁAcount�̒l��0�ł���ۏ؂͂Ȃ��B
                // ���������āAcount�̒l��0�ł��邱�Ƃ��m�F����K�v������B
                // 0�Ȃ�Ύ��s�𑱂��A1�Ȃ��wait�����s���čēx�ꎞ��~����B
      } catch( InterruptedException e ) { }
    }
    count = 1;
    System.out.println("���Y");
    notify(); // �I�u�W�F�N�gt�ɑ΂���notify�����s�����B���̌��ʁA
              // �I�u�W�F�N�gt�̏�����҂��Ă���X���b�h�̂ЂƂ����s��
              // �ĊJ�ł����ԂɂȂ�B�҂��Ă���X���b�h���Ȃ��ꍇ�A
              // notify�͖����ɂȂ�B 
  }
  synchronized void syohi() {
    while( count == 0 ) {
      try {
        wait(); // ���̃X���b�h�Ŏ��s���ꂽnotify���\�b�h�ɂ���čĊJ���ꂽ
                // �X���b�h�́A�����Ƀ��b�N��������B
                // �������A���̎��_�ŁAcount�̒l��1�ł���ۏ؂͂Ȃ��B
                // ���������āAcount�̒l��1�ł��邱�Ƃ��m�F����K�v������B
                // 1�Ȃ�Ύ��s�𑱂��A0�Ȃ��wait�����s���čēx�ꎞ��~����B
       } catch( InterruptedException e ) { }
     }
    count = 0;
    System.out.println("�@�@����");
    notify(); // �I�u�W�F�N�gt�ɑ΂���notify�����s�����B���̌��ʁA
              // �I�u�W�F�N�gt�̏�����҂��Ă���X���b�h�̂ЂƂ����s��
              // �ĊJ�ł����ԂɂȂ�B�҂��Ă���X���b�h���Ȃ��ꍇ�A
              // notify�͖����ɂȂ�B 
  }
}

//�i�Q�j
class Seisan extends Thread { 
  Table t;
  int n;
  Seisan(Table t, int n) { // �R���X�g���N�^�B
    this.t = t; this.n = n;
  }
  public void run() {
    for( int i=0; i<n; i++ ) { t.seisan(); } 
  }
}

//�i�R�j
class Syohi extends Thread { 
  Table t;
  int n;
  Syohi(Table t, int n) { // �R���X�g���N�^�B
    this.t = t; this.n = n;
  }
  public void run() {
    for( int i=0; i<n; i++ ) { t.syohi(); } 
  }
}

class j552a {
  public static void main(String args[]) {

    Table t = new Table(); //�i�S�j

    int n = 3; //�i�T�j

    Seisan tha = new Seisan(t,n); //�i�U�j
    Syohi thb = new Syohi(t,n); //�i�V�j

    tha.start(); //�i�W�j
    thb.start(); //�i�X�j 

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j552a.java
% java j552a 
���Y
�@�@����
���Y
�@�@����
���Y
�@�@����
</pre>

</body>
</html>
