// -*- mode: java -*- Time-stamp: <2009-07-02 09:21:25 kahata>
/*====================================================================
 * name: j841b.java 
 * created : Time-stamp: <09/07/02(��) 09:13:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841b.java >>
//
//  �f�[�^�\���i�S�j�F�W���iTreeSet�N���X�A�����q�@J2SE1.4�܂ł̋@�\�j
//
//�@�@�����q���g���āA�W���̂��ׂĂ̗v�f�����ǂ�B
//
//    �����̏ꍇ�FIterator�C���^�[�t�F�[�X���g���B
//�@�@�~���̏ꍇ�FIterator�C���^�[�t�F�[�X��Comparator�C���^�[�t�F�[�X���g���B
//
//      Comparator�C���^�[�t�F�[�X���g���Ƃ��ǂ鏇����ύX�ł���B
//
//  ��TreeSet�N���X�̃R���X�g���N�^
//�@�@public TreeSet()
//      �@�\�F�v�f�̎��R�����t���ɂ���������̏W�����쐬����B
//�@�@public TreeSet(Comparator c)
//      �@�\�F�R���p���[�^c�ɂ�鏇���Â��ɂ���������̏W�����쐬����B
//
//  ��TreeSet�N���X�̃��\�b�h
//�@�@public Iterator iterator()
//      �@�\�F�����q���擾����B
//
//�@��Iterator�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public boolean hasNext()
//      �@�\�F���̗v�f������ꍇtrue�A���̑�false�B
//�@�@public Object next()
//      �@�\�F���̗v�f���擾����B
//
//�@��Comparator�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public int compare(Object obj1, Object obj2)
//      �@�\�Fobj1��obj2��菬�����Ƃ��A-1
//            obj1��obj2���������Ƃ��A0
//            obj1��obj2���傫���Ƃ��A1
//�@�@�@�@�@�@���̃��\�b�h���I�[�o�[���C�h���ď�����ύX�ł���B
//
//  ��String�N���X�̃��\�b�h
//�@�@public int compareTo(String s)
//      �@�\�F��������������ɔ�r����B
//            s1.compareTo(s2) s1,s2�͕�����
//�@�@�@�@�@�@s1��s2��莫�����ɑO�ɂ���ꍇ�́A���ʂ͕��̐���
//�@�@�@�@�@�@s1��s2�Ɠ������ꍇ�́A���ʂ�0
//�@�@�@�@�@�@s1��s2��莫�����Ɍ�ɂ���ꍇ�́A���ʂ͐��̐���
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class decorder implements Comparator<String> {
  public int compare(String obj1, String obj2) {
    int c = obj1.compareTo(obj2);
    return -c;
  }
} 

class j841b {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    TreeSet<String> ts = new TreeSet<String>();

    // �v�f��ǉ��B
    ts.add("C"); 
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("D");

    // ���ׂĂ̗v�f�������ɂ��ǂ�B
    System.out.println("���ׂĂ̗v�f�����ǂ�i�����j");
    Iterator it = ts.iterator();
    while( it.hasNext() ) {
      System.out.println(it.next());
    }
    System.out.println();

    // ��̏W���𐶐��B
    TreeSet<String> tsdec = new TreeSet<String>(new decorder());

    // �v�f��ǉ��B
    tsdec.add("C");
    tsdec.add("A");
    tsdec.add("B");
    tsdec.add("E");
    tsdec.add("D"); 

    // ���ׂĂ̗v�f���~���ɂ��ǂ�B
    System.out.println("���ׂĂ̗v�f�����ǂ�i�~���j");
    Iterator is = tsdec.iterator();
    while( is.hasNext() ) {
      System.out.println(is.next());
    }

  }

}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j841b.java
��:j841b.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j841b
���ׂĂ̗v�f�����ǂ�i�����j
A
B
C
D
E

���ׂĂ̗v�f�����ǂ�i�~���j
E
D
C
B
A
</pre>

</body>
</html>
*/
