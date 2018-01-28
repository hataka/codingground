<!--====================================================================-->
<!-- << j571c.htm >>                                                    -->
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
//  << j571c.java >>
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
//�@�@�N���X���X���b�h�����A�����̃X���b�h�ŕ��S���Đ�������B
//    ���Ƃ��΁A�W��{1,2,...,n}��̕����W�����A
//�@�@�@�@00b[3]...b[n]
//�@�@�@�@01b[3]...b[n]
//�@�@�@�@10b[3]...b[n]
//�@�@�@�@11b[3]...b[n]
//�@�@�ɕ������A���ꂼ����X���b�h�Ő�������B
//�@�@�����̂��߂Ɏg����擪��2�r�b�g���Am�Ƃ����B
//�@�@�X���b�h�̌��́A2**m�ƂȂ�B
//
////////////////////////////////////////////////////////////////////////////////

// �X���b�h�����ꂽ�N���X�B
class C extends Thread {
  int b[]; // �����W�����i�[����z��B
  int count = 0; // �������ꂽ�����W���̌��B
  int m,n;
  C(int a[], int m, int n) { // �R���X�g���N�^�B
    this.m = m; this.n = n;
    b = new int[n+1]; 
    for( int i=1; i<=m; i++ ) { b[i] = a[i]; }
  }
  // �W��{k,...,n}��̂��ׂĂ̕����W��b[k]...b[n]�𐶐�����B
  void gen(int k, int n) {
    if( k > n ) {
      count++;
    } else {
      b[k] = 0; gen(k+1,n);
      b[k] = 1; gen(k+1,n);
    }  
  }
  public void run() {
    gen(m+1,n);
    System.out.print("�X���b�h�i" + Thread.currentThread().getName() + "�j ");
    for(int i=1; i<=m; i++ ) { System.out.print(b[i]); }
    System.out.println(" count = " + count);
  }
}

class j571c {
  public static void main(String args[]) {

    int n = Integer.parseInt(args[0]); // args[0]�͏W���̃T�C�Y��\���B

    System.out.println("�W���̃T�C�Y�F" + n);

    int m = 2; 
    int a[] = new int[m+1]; // �������ʂ�ۑ�����z��B

    a[1]=0; a[2]=0;
    C obj1 = new C(a,m,n); // �����W��00b[m+1]...b[n]�𐶐�����X���b�h���쐬����B
    obj1.start();          // �N������B

    a[1]=0; a[2]=1;
    C obj2 = new C(a,m,n); // �����W��01b[m+1]...b[n]�𐶐�����X���b�h���쐬����B
    obj2.start();          // �N������B
    
    a[1]=1; a[2]=0;
    C obj3 = new C(a,m,n); // �����W��10b[m+1]...b[n]�𐶐�����X���b�h���쐬����B
    obj3.start();          // �N������B
    
    a[1]=1; a[2]=1;
    C obj4 = new C(a,m,n); // �����W��11b[m+1]...b[n]�𐶐�����X���b�h���쐬����B
    obj4.start();          // �N������B

    try { // ���ׂẴX���b�h�̏I����҂B
      obj1.join(); obj2.join(); obj3.join(); obj4.join();
      System.out.println("���ׂẴX���b�h���I�����܂���");
    } catch ( Exception e ) { }

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j571c.java
% java j571c 10
�W���̃T�C�Y�F10
�X���b�h�iThread-0�j 00 count = 256
�X���b�h�iThread-1�j 01 count = 256
�X���b�h�iThread-2�j 10 count = 256
�X���b�h�iThread-3�j 11 count = 256
���ׂẴX���b�h���I�����܂���
</pre>

</body>
</html>
