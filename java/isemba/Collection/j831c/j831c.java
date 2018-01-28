// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j831c.java 
 * created : Time-stamp: <09/07/01(��) 14:19:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831c.java >>
//
//  �f�[�^�\���i�R�j�F���X�g�iHashSet�N���X�A���������E���s��@J2SE1.4�܂ł̋@�\�j
//
//�@�@HashSet�N���X�̓X���b�h�ɑ΂��Ĉ��S�łȂ��B
//�@�@�����̃X���b�h��HashSet�I�u�W�F�N�g�ɓ����ɃA�N�Z�X���A
//�@�@�v�f�̒ǉ���폜���s�Ȃ����Ƃ��A���ʂ��ۏ؂���Ȃ����Ƃ��m�F����B
//
//    �W���ɑ΂���1000�̗v�f�̒ǉ��E�폜��n��J��Ԃ��X���b�hm�����s�����āA
//�@�@�Ō�ɏW������ɂȂ邩�ǂ������ׂ�B
//�@�@�������Ƃ�Ă���΋�W���������邪�A���s����΁A��łȂ��W����
//�@�@�����邩�A��~���Ȃ��Ȃ�B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

// �X���b�h(AR)�̒�`�B
class ARThread extends Thread {
  HashSet<Integer> hs;
  int n;
  ARThread(HashSet<Integer> hs, int n) { // �R���X�g���N�^�B 
    this.hs = hs; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + hs.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { hs.add(new Integer(i)); }
        for( int j=1; j<=1000; j++ ) { hs.remove(new Integer(i)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + hs.size());
  }
}

class j831c {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//  int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 2;
    int n = 100;
    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�łȂ���̏W�����쐬�B
    HashSet<Integer> hs = new HashSet<Integer>();

    // �X���b�h�̍쐬�Ǝ��s�B
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(hs,n); arth[i].start();
    }

    // �W�������̊m�F�B
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("�W���F" + hs.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }

  }

}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j831c.java
��: j831c.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j831c 2 100
m = 2
n = 100
Thread-0�F�����J�n 0
Thread-1�F�����J�n 0
Thread-1�F�����I�� 1
Thread-0�F�����I�� 0
�W���F0

% java j831c 5 10000
m = 5
n = 10000
Thread-0�F�����J�n 0
Thread-1�F�����J�n 1
Thread-2�F�����J�n 1
Thread-3�F�����J�n 1
Thread-4�F�����J�n 1
Thread-1�F�����I�� 1
Thread-4�F�����I�� 1
Thread-0�F�����I�� 0
Thread-2�F�����I�� -1
Thread-3�F�����I�� -1
�W���F-1
</pre>

</body>
</html>
*/
