// -*- mode: java -*- Time-stamp: <2009-07-02 08:31:15 kahata>
/*====================================================================
 * name: j831f.java 
 * created : Time-stamp: <09/07/02(��) 08:25:42 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831f.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831f.java >>
//
//  �f�[�^�\���i�R�j�F�W���iHashSet�N���X�A���������A���s��j
//
//�@�@Collections.synchronizedSet���\�b�h���g���āA�X���b�h�ɑ΂��Ĉ��S��
//�@�@�W��
//
//        Set hs = Collections.synchronizedSet(new HashSet());
//
//�@�@���쐬���Ă��A���̃N���X��iterator���\�b�h�ɂ���č쐬����锽���q���g���āA
//�@�@�W�����\���I�ɕύX����ƁA�����q�� ConcurrentModificationException ��
//�@�@�X���[����B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// �X���b�h(AR)�̒�`�B
class ARThread extends Thread {
  Set<Integer> hs;
  int n;
  ARThread(Set<Integer> hs, int n) { // �R���X�g���N�^�B 
    this.hs = hs; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + hs.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { hs.add(new Integer(i)); }
        Iterator ih = hs.iterator();
        while( ih.hasNext() ) { hs.remove(ih.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + hs.size());
  }
}

class j831f {

  public static void main(String args[]) {

//    int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//    int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 2;
    int n = 100;


    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�ȋ�̏W�����쐬�B
    Set<Integer> hs = Collections.synchronizedSet(new HashSet<Integer>());

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
% javac j831f.java
��: j831f.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j831f 2 100
m = 2
n = 100
Thread-0�F�����J�n 0
Thread-1�F�����J�n 1
Thread-1�F�����I�� 0
java.util.ConcurrentModificationException
Thread-0�F�����I�� 0
�W���F0
</pre>

</body>
</html>
*/
