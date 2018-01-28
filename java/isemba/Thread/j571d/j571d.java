<!--====================================================================-->
<!-- << j571d.htm >>                                                    -->
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
//  << j571d.java >>
//
//  �X���b�h�i�V�j�F�o�b�N�g���b�N�A���S���Y���̃X���b�h��
//
//�@�����
//
//�@�@�W��{1,2,...,n}��̂��ׂĂ̕����W��b[1]b[2]...b[n]�𐶐�����B
//    �������A�v�fi�������W���Ɋ܂܂��Ƃ�b[i]=1,�܂܂�Ȃ��Ƃ�b[i]=0�Ƃ���B
//
//�@����@
//
//�@�@j571c�̉��ǁB�����̎������ƌ��ʂ̎��W�B
//
////////////////////////////////////////////////////////////////////////////////

// ���ʂ����W����N���X�̒�`�B
class Result {
  long sum=0;
  synchronized void set(long a) {
    sum = sum + a;
  }
}

// �X���b�h�����ꂽ�N���X�B
class C extends Thread {

  int b[]; // �����W�����i�[����z��B
  long count = 0; // �������ꂽ�����W���̌��B
  int m,n;
  Result rst;

  C(int a[], int m, int n, Result rst) { // �R���X�g���N�^�B
    this.m = m; this.n = n; this.rst = rst;
    b = new int[n+1]; 
    for( int i=1; i<=m; i++ ) { b[i] = a[i]; }
  }
  
  void gen(int k, int n) { // �W��{k,...,n}��̂��ׂĂ̕����W��b[k]...b[n]�𐶐�����B
    if( k > n ) {
      count++;
    } else {
      b[k] = 0; gen(k+1,n);
      b[k] = 1; gen(k+1,n);
    }  
  }

  void show() {
    synchronized(rst) {
      System.out.print("�X���b�h�i" + Thread.currentThread().getName() + "�j ");
      for(int i=1; i<=m; i++ ) { System.out.print(b[i]); }
      System.out.println(" count = " + count);
    }
  }

  public void run() {
    gen(m+1,n);
    show();
    rst.set(count);
  }

}

class j571d {

  static int m,n,p,q=0;
  static int a[];
  static C obj[];
  static Result rst;

  static void gen(int k, int m) { // �W��{k,...,m}��̂��ׂĂ̕����W��a[k]...a[m]�𐶐�����B
    if( k > m ) {
      q++;
      obj[q] = new C(a,m,n,rst); // �����W��**b[m+1]...b[n]�𐶐�����X���b�h���쐬����B
      obj[q].start();          // �N������B
    } else {
      a[k] = 0; gen(k+1,m);
      a[k] = 1; gen(k+1,m);
    }  
  }

  public static void main(String args[]) {

    m = Integer.parseInt(args[0]); // args[0]��m��\���B
    n = Integer.parseInt(args[1]); // args[1]��n��\���B

    System.out.println("m = " + m + " n = " + n);

    a = new int[m+1]; // �������ʂ�ۑ�����z��B

    p = 1; // p�͕��������X���b�h�̌����Ӗ�����B
    for( int i=1; i<=m; i++ ) { p = p * 2; }
    obj = new C[p+1];

    rst = new Result(); // ���ʂ��i�[����I�u�W�F�N�grst���쐬�B

    gen(1,m); // ���������X���b�h���쐬�����s����B

    try { // ���ׂẴX���b�h�̏I����҂B
      for( int i=1; i<=p; i++ ) { obj[i].join(); }
      System.out.println("���ׂẴX���b�h���I�����܂���");
      System.out.println("���ׂĕ����W���̌��F" + rst.sum);
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j571d.java
% java j571d 3 10
m = 3 n = 10
�X���b�h�iThread-0�j 000 count = 128
�X���b�h�iThread-1�j 001 count = 128
�X���b�h�iThread-2�j 010 count = 128
�X���b�h�iThread-3�j 011 count = 128
�X���b�h�iThread-7�j 111 count = 128
�X���b�h�iThread-6�j 110 count = 128
�X���b�h�iThread-5�j 101 count = 128
�X���b�h�iThread-4�j 100 count = 128
���ׂẴX���b�h���I�����܂���
���ׂĕ����W���̌��F1024
</pre>

</body>
</html>
