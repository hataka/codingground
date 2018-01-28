////////////////////////////////////////////////////////////////////////////////
// << j652a.java >>
//
//  �t�@�C�������i�T�j�t�@�C���_���v�i�P�U�i���j
//
//�@�@�t�@�C���̓��e���P�U�i���ŕ\������B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j652a {

  static char ch[] = { '0','1','2','3','4','5','6','7','8','9',
                       'a','b','c','d','e','f' };
  static int c1,c2;

  public static void main(String args[]) {

    try {
      // ���̓X�g���[�����쐬�B 
      FileInputStream fis = new FileInputStream(args[0]); 

      System.out.printf("       ");
      for( int i=0; i<=15; i++ ) { System.out.printf("  " + ch[i]); }
      System.out.println();
      for( int i=0; i<=6+3*16; i++ ) { System.out.printf("-"); }

      // �Ǎ��݃��[�v�B
      int c; // �ǂݍ��܂ꂽ�P�o�C�g�B���o�͂�int�^�ōs����B
             // byte�^�́A-128�`127�Bint�^�́A0�`255�B
      int n = 0, k = 16;
      while( (c = fis.read()) != -1 ) {
        if( k > 15 ) { 
          System.out.println();
          System.out.printf("%05x: ",n);
          k = 0;
        }
        n++; k++;
        // ����c����ʂS�r�b�gc1�A���ʂS�r�b�gc2�ɕ����B
        c1 = c/16; c2 = c%16;
        System.out.print(" " + ch[c1] + ch[c2]); 
      }

      if( k != 0 ) { System.out.println(); }

      for( int i=0; i<=6+3*16; i++ ) { System.out.printf("-"); }
      System.out.println();

      // ���̓X�g���[�������B
      fis.close();
    } catch ( Exception e ) { } 

  }

} 
/*
<font size=5 color=blue>���s����</font><br>

<pre>
% javac j652a.java
% java j652a j631a.txt
         0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f
-------------------------------------------------------
00000:  0c f4 0c 00
-------------------------------------------------------

% java j652a j631b.txt
         0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f
-------------------------------------------------------
00000:  31 32 0d 0a 2d 31 32 0d 0a 31 32 0d 0a 32 35 36
00010:  0d 0a
-------------------------------------------------------
*/
