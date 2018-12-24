<!--====================================================================-->
<!-- << j571b.htm >>                                                    -->
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
//  << j571b.java >>
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
//�@�@�V���ȃN���X�𐶐����A���̒��ōċA�I���\�b�h���g���B
//
////////////////////////////////////////////////////////////////////////////////

class C {
  int b[]; // �����W����\���z��B 
  int count = 0; // �������ꂽ�����W���̌��B
  C(int n) { // �R���X�g���N�^�B
    b = new int[n+1];
  }
  // �W��{k,...,n}��̂��ׂĂ̕����W��b[k]...b[n]�𐶐�����B
  void gen(int k, int n) {
    if( k > n ) {
      count++; System.out.print(count + ": ");
      for( int i=1; i<=n; i++ ) { System.out.print(b[i]); }
      System.out.println();
    } else {
      b[k] = 0; gen(k+1,n);
      b[k] = 1; gen(k+1,n);
    }  
  }
}

class j571b {
  public static void main(String args[]) {

    int n = Integer.parseInt(args[0]); // args[0]�͏W���̃T�C�Yn��\���B

    System.out.println("�W���̃T�C�Y�F" + n);

    C obj = new C(n);

    obj.gen(1,n);

  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j571b.java
% java j571b 4
�W���̃T�C�Y�F4
1: 0000
2: 0001
3: 0010
4: 0011
5: 0100
6: 0101
7: 0110
8: 0111
9: 1000
10: 1001
11: 1010
12: 1011
13: 1100
14: 1101
15: 1110
16: 1111
</pre>

</body>
</html>