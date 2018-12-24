// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861d.java 
 * created : Time-stamp: <09/07/02(��) 17:44:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861d.java >>
//
//  �f�[�^�\���i�U�j�F�}�b�v�iTreeMap�N���X�A���������@�΍�P�j
//
//�@�@TreeMap�N���X�̓X���b�h�ɑ΂��Ĉ��S�łȂ��B
//�@�@�����̃X���b�h��TreeMap�I�u�W�F�N�g�ɓ����ɃA�N�Z�X���A
//�@�@�v�f�̒ǉ���폜���s�Ȃ����Ƃ��A���ʂ��ۏ؂���Ȃ��B
//
//�@�@�΍��@�P�Fsynchronized�u���b�N���g���āA������ۏ؂���B
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
  TreeMap<Integer,Integer> tm;
  int n;
  ARThread(TreeMap<Integer,Integer> tm, int n) { // �R���X�g���N�^�B 
    this.tm = tm; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + tm.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        synchronized(tm) {
          for( int j=1; j<=1000; j++ ) { tm.put(new Integer(i),new Integer(i)); }
          for( int j=1; j<=1000; j++ ) { tm.remove(new Integer(i)); }
        }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + tm.size());
  }
}

class j861d {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//  int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 5;
    int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�łȂ���̃}�b�v���쐬�B
    TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();

    // �X���b�h�̍쐬�Ǝ��s�B
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(tm,n); arth[i].start();
    }

    // �}�b�v�����̊m�F�B
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("�}�b�v�F" + tm.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }

  }

}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j861d.java
��:j861d.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă�������

% java j861d 5 100
m = 5
n = 100
Thread-0�F�����J�n 0
Thread-2�F�����J�n 0
Thread-3�F�����J�n 0
Thread-4�F�����J�n 0
Thread-1�F�����J�n 0
Thread-0�F�����I�� 0
Thread-3�F�����I�� 0
Thread-4�F�����I�� 0
Thread-1�F�����I�� 0
Thread-2�F�����I�� 0
�}�b�v�F0

% java j861d 5 1000
m = 5
n = 1000
Thread-0�F�����J�n 0
Thread-2�F�����J�n 0
Thread-3�F�����J�n 0
Thread-4�F�����J�n 0
Thread-1�F�����J�n 0
Thread-0�F�����I�� 0
Thread-4�F�����I�� 0
Thread-2�F�����I�� 0
Thread-1�F�����I�� 0
Thread-3�F�����I�� 0
�}�b�v�F0
</pre>

</body>
</html>
*/