// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j841f.java 
 * created : Time-stamp: <09/07/02(��) 09:47:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841f.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841f.java >>
//
//  �f�[�^�\���i�S�j�F�W���iTreeSet�N���X�A���������A���s��j
//
//�@�@Collections.synchronizedSortedSet���\�b�h���g���āA�X���b�h�ɑ΂��Ĉ��S��
//�@�@�W��
//
//        SortedSet ss = Collections.synchronizedSortedSet(new TreeSet());
//
//�@�@���쐬���Ă��A���̃N���X��iterator���\�b�h�ɂ���č쐬����锽���q���g���āA
//�@�@�W�����\���I�ɕύX����ƁA�����q�� ConcurrentModificationException ��
//�@�@�X���[����B
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
        Iterator is = ss.iterator();
        while( is.hasNext() ) { ss.remove(is.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + ss.size());
  }
}

class j841f {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//  int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 2;
    int n = 100;

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
% javac j841f.java
��:j841f.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j841f 2 100
m = 2
n = 100
Thread-0�F�����J�n 0
Thread-1�F�����J�n 1
java.util.ConcurrentModificationException
Thread-0�F�����I�� 1
java.util.ConcurrentModificationException
Thread-1�F�����I�� 1
�W���F1
</pre>

</body>
</html>
*/
