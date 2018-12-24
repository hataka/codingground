// -*- mode: java -*- Time-stamp: <2009-07-02 17:19:11 kahata>
/*====================================================================
 * name: j851c.java 
 * created : Time-stamp: <09/07/02(��) 17:17:07 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851c.java >>
//
//  �f�[�^�\���i�T�j�F�}�b�v�iHashMap�N���X�A���������E���s��j
//
//�@�@HashMap�N���X�̓X���b�h�ɑ΂��Ĉ��S�łȂ��B
//�@�@�����̃X���b�h��HashMap�I�u�W�F�N�g�ɓ����ɃA�N�Z�X���A
//�@�@�v�f�̒ǉ���폜���s�Ȃ����Ƃ��A���ʂ��ۏ؂���Ȃ����Ƃ��m�F����B
//
//    �}�b�v�ɑ΂���1000�̗v�f�̒ǉ��E�폜��n��J��Ԃ��X���b�hm��
//�@�@���s�����āA�Ō�Ƀ}�b�v����ɂȂ邩�ǂ������ׂ�B
//�@�@�������Ƃ�Ă���΋�}�b�v�������邪�A���s����΁A��łȂ��}�b�v��
//�@�@�����邩�A��~���Ȃ��Ȃ�B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

// �X���b�h(AR)�̒�`�B
class ARThread extends Thread {
  HashMap<Integer,Integer> hm;
  int n;
  ARThread(HashMap<Integer,Integer> hm, int n) { // �R���X�g���N�^�B 
    this.hm = hm; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + hm.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { hm.put(new Integer(j), new Integer(j)); }
        for( int j=1; j<=1000; j++ ) { hm.remove(new Integer(j)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + hm.size());
  }
}

class j851c {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//  int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 5;
    int n = 1000;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�łȂ���̃}�b�v���쐬�B
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

    // �X���b�h�̍쐬�Ǝ��s�B
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(hm,n); arth[i].start();
    }

    // �}�b�v�����̊m�F�B
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("�}�b�v�F" + hm.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j851c.java
��:j851c.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j851c 5 1000
m = 5
n = 1000
Thread-0�F�����J�n 0
Thread-2�F�����J�n 885
Thread-3�F�����J�n 885
Thread-4�F�����J�n 885
Thread-1�F�����J�n 923
Thread-3�F�����I�� 42
Thread-2�F�����I�� 44
Thread-4�F�����I�� 45
Thread-1�F�����I�� 45
Thread-0�F�����I�� 45
�}�b�v�F45
</pre>

</body>
</html>
*/