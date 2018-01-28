// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861f.java 
 * created : Time-stamp: <09/07/02(��) 17:49:52 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861f.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861f.java >>
//
//  �f�[�^�\���i�U�j�F�}�b�v�iTreeMap�N���X�A���������A���s��j
//
//�@�@Collections.synchronizedSortedMap���\�b�h���g���āA�X���b�h�ɑ΂��Ĉ��S��
//�@�@�}�b�v
//
//        SortedMap sm = Collections.synchronizedSortedMap(new TreeMap());
//
//�@�@���쐬���Ă��A���̃N���X�̂��ׂẮu�R���N�V�����r���[���\�b�h�v�ɂ����
//�@�@�Ԃ���锽���q���g���āA�}�b�v���\���I�ɕύX����ƁA�����q�� 
//�@�@ConcurrentModificationException ���X���[����B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// �X���b�h(AR)�̒�`�B
class ARThread extends Thread {
  SortedMap<Integer,Integer> sm;
  int n;
  ARThread(SortedMap<Integer,Integer> sm, int n) { // �R���X�g���N�^�B 
    this.sm = sm; this.n = n;
  }
  // �����{�́B
  public void run() {
    System.out.println(Thread.currentThread().getName() + "�F�����J�n " + sm.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { sm.put(new Integer(j),new Integer(j)); }
        Set s = sm.keySet();
        Iterator is = s.iterator();
        while( is.hasNext() ) { sm.remove(is.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "�F�����I�� " + sm.size());
  }
}

class j861f {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:�X���b�h�̌��B
//  int n = Integer.parseInt(args[1]); // args[1]:�J��Ԃ��񐔁B
    int m = 2;
    int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // �X���b�h�ɑ΂��Ĉ��S�ȋ�̃}�b�v���쐬�B
    SortedMap<Integer,Integer> sm = Collections.synchronizedSortedMap(new TreeMap<Integer,Integer>());

    // �X���b�h�̍쐬�Ǝ��s�B
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(sm,n); arth[i].start();
    }

    // �}�b�v�����̊m�F�B
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("�}�b�v�F" + sm.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j861f.java
��:j861f.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j861f 2 100
m = 2
n = 100
Thread-0�F�����J�n 0
java.util.ConcurrentModificationException
Thread-0�F�����I�� 999
Thread-1�F�����J�n 999
java.util.ConcurrentModificationException
Thread-1�F�����I�� 999
�}�b�v�F999
</pre>

</body>
</html>
*/
