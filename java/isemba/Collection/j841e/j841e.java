// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j841e.java 
 * created : Time-stamp: <09/07/02(��) 09:41:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841e.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841e.java >>
//
//  �f�[�^�\���i�S�j�F�W���iTreeSet�N���X�A���������@�΍�Q�j
//
//�@�@TreeSet�N���X�̓X���b�h�ɑ΂��Ĉ��S�łȂ��B
//�@�@�����̃X���b�h��TreeSet�I�u�W�F�N�g�ɓ����ɃA�N�Z�X���A
//�@�@�v�f�̒ǉ���폜���s�Ȃ����Ƃ��A���ʂ��ۏ؂���Ȃ��B
//
//�@�@�΍��@�Q�FCollections.synchronizedSortedSet���\�b�h���g���āA�X���b�h��
//�@�@�@�@�@�@�@�΂��Ĉ��S�ȏW�����쐬����B
//
//        SortedSet ss = Collections.synchronizedSortedSet(new TreeSet());
//
//    �W���ɑ΂���1000�̗v�f�̒ǉ��E�폜��n��J��Ԃ��X���b�hm�����s�����āA
//�@�@�Ō�ɏW������ɂȂ邩�ǂ������ׂ�B
//�@�@�������Ƃ�Ă���΋�W���������邪�A���s����΁A��łȂ��W����
//�@�@�����邩�A��~���Ȃ��Ȃ�B
//
//�@��Collections�N���X�̃��\�b�h
//    public static SortedSet synchronizedSortedSet(SortedSet a)
//�@�@�@�@�\�F�W��a����X���b�h�ɑ΂��Ĉ��S�ȏW����Ԃ��B
//�@�@�@�@�@�@���ׂẴA�N�Z�X�́A�Ԃ��ꂽ�W���΂��čs���K�v������B 
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

// �X���b�h(AR)�̒�`�B
class ARThread extends Thread {
  SortedSet<Integer> ss;
  int n;
  ARThread(SortedSet<Integer> ss, int n) { // �R���X�g���N�^�B 
    this.ss = ss; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + ss.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { ss.add(new Integer(i)); }
        for( int j=1; j<=1000; j++ ) { ss.remove(new Integer(i)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + ss.size());
  }
}

class j841e {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//  int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 5;
    int n = 1000;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�ȋ�̏W�����쐬�B
    SortedSet<Integer> ss = Collections.synchronizedSortedSet(new TreeSet<Integer>());

    // �X���b�h�̍쐬�Ǝ��s�B
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(ss,n); arth[i].start();
    }

    // �W�������̊m�F�B
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("�W���F" + ss.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j841e.java
��:j841e.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j841e 5 1000
m = 5
n = 1000
Thread-0�F�����J�n 0
Thread-1�F�����J�n 0
Thread-2�F�����J�n 1
Thread-3�F�����J�n 1
Thread-4�F�����J�n 1
Thread-2�F�����I�� 2
Thread-0�F�����I�� 3
Thread-1�F�����I�� 0
Thread-4�F�����I�� 0
Thread-3�F�����I�� 0
�W���F0

% java j841e 5 10000
m = 5
n = 10000
Thread-0�F�����J�n 0
Thread-1�F�����J�n 0
Thread-2�F�����J�n 1
Thread-3�F�����J�n 1
Thread-4�F�����J�n 1
Thread-0�F�����I�� 3
Thread-1�F�����I�� 0
Thread-4�F�����I�� 0
Thread-2�F�����I�� 0
Thread-3�F�����I�� 0
�W���F0
</pre>

</body>
</html>
*/
