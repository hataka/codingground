// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j821f.java 
 * created : Time-stamp: <09/07/01(��) 11:05:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j821f.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821f.java >>
//
//  �f�[�^�\���i�P�j�F���X�g�iLinkedList�N���X�A���������A���s��j
//
//�@�@Collections.synchronizedList���\�b�h���g���āA�X���b�h�ɑ΂��Ĉ��S��
//�@�@���X�g
//
//        List a = Collections.synchronizedList(new LinkedList());
//
//�@�@���쐬���Ă��A���̃N���X��iterator���\�b�h�ɂ���č쐬����锽���q���g���āA
//�@�@���X�g���\���I�ɕύX����ƁA�����q�� ConcurrentModificationException ��
//�@�@�X���[����B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// �X���b�h(AR)�̒�`�B
class ARThread extends Thread {
  List<Integer> a;
  int n;
  ARThread(List<Integer> a, int n) { // �R���X�g���N�^�B 
    this.a = a; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + a.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { a.add(new Integer(i)); }
        Iterator ia = a.iterator();
        while( ia.hasNext() ) { a.remove(ia.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + a.size());
  }
}

class j821f {

  public static void main(String args[]) {

//    int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//    int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 2;
    int n = 100;
    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�ȋ�̃��X�g���쐬�B
    List<Integer> a = Collections.synchronizedList(new LinkedList<Integer>());

    // �X���b�h�̍쐬�Ǝ��s�B
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(a,n); arth[i].start();
    }

    // ���X�g�����̊m�F�B
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("���X�g�F" + a.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }

  }

}
/*
</pre>

<font size=5 color=blue>���s����</font><br>

<pre>
% javac j821f.java
��: j821f.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j821f 2 100
m = 2
n = 100
Thread-0�F�����J�n 0
java.util.ConcurrentModificationException
Thread-0�F�����I�� 999
Thread-1�F�����J�n 999
java.util.ConcurrentModificationException
Thread-1�F�����I�� 1998
���X�g�F1998
</pre>

</body>
</html>
*/
