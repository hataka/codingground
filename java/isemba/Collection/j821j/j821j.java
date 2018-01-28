// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j821j.java 
 * created : Time-stamp: <09/07/01(��) 14:00:38 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j821j.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821j.java >>
//
//  �f�[�^�\���i�P�j�F���X�g�iLinkedList�N���X�A���s���ԁj
//
//�@�@����̎��s���Ԃ𑪒肷��B
//
//�@��java.lang.System�N���X
//�@�@�Epublic final class System extends Object
//�@�@�ESystem�N���X�ɂ͗L�p�ȃN���X�t�B�[���h����у��\�b�h������B
//�@�@�E�I�u�W�F�N�g���쐬�ł��Ȃ��B 
//
//�@��System�N���X�̃��\�b�h
//�@  public static long currentTimeMillis()
//�@�@�@�@�\�F���ݎ����Ƌ��萢�E���� UTC 1970�N1��1���ߑO0���Ƃ̍����~���b��
//�@�@�@�@�@�@�Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j821j {

  public static void main(String args[]) {

//  int n = Integer.parseInt(args[0]); // args[0]:�J��Ԃ��񐔁B
    int n = 20000;
    System.out.println("�J��Ԃ��񐔁F" + n);

    // ��̃��X�g���쐬�B
    LinkedList<Integer> a = new LinkedList<Integer>();

    // �v�f�̒ǉ����ԁB
    long t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.add(new Integer(i)); }
    long t1 = System.currentTimeMillis();
    double mt = (t1-t0)/(double)n;
    System.out.println("�ǉ�����(add   )�̕��ώ��s���ԁF" + mt + "�~���b");

    // �v�f�̕ύX���ԁB
    t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.set(i,new Integer(i)); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("�ύX����(set   )�̕��ώ��s���ԁF" + mt + "�~���b");

    // �v�f�̎擾���ԁB
    t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.get(i); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("�擾����(get   )�̕��ώ��s���ԁF" + mt + "�~���b");

    // �v�f�̍폜���ԁB
    t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.remove(new Integer(i)); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("�폜����(remove)�̕��ώ��s���ԁF" + mt + "�~���b");

  }

}
/*
</pre>

<font size=5 color=blue>���s����</font><br>

<pre>
% javac j821j.java
��: j821j.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j821j 100000
�J��Ԃ��񐔁F100000
�ǉ�����(add   )�̕��ώ��s���ԁF0.00311�~���b
�ύX����(set   )�̕��ώ��s���ԁF0.21771�~���b
�擾����(get   )�̕��ώ��s���ԁF0.21421�~���b
�폜����(remove)�̕��ώ��s���ԁF2.0E-4�~���b
</pre>

</body>
</html>
*/
