// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j821b.java 
 * created : Time-stamp: <09/06/30(��) 12:57:55 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j821b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821b.java >>
//
//  �f�[�^�\���i�Q�j�F���X�g�iLinkedList�N���X�A�����q�@J2SE1.4�܂ł̋@�\�j
//
//�@�@���X�g�̂��ׂĂ̗v�f�����ǂ�B
//
//    �Q�̕��@�������B
//�@�@�@���@�P�F�ʒu���w�肵�ĕ\��������@
//�@�@�@�@�@�@�@�������A�t�����̏������ł��邪�A�����͈����B
//�@�@�@���@�Q�F�����q���g�����@
//              �����q(���X�g���̗v�f��K�؂ȏ����Ŏ��o��)���g���āA
//�@�@�@�@�@�@�@�������A�t�����̏������ł���B
//                                
//�@�@�@�����q��ListIterator�C���^�[�t�F�[�X�Ŏ�������B
//
//�@��java.util.ListIerator�C���^�[�t�F�[�X
//    �Epublic interface ListIterator extends Iterator
//
//�@��ListIerator�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public boolean hasNext()
//      �@�\�F�������ɗv�f������ꍇtrue�B
//�@�@public boolean hasPrevious()
//      �@�\�F�t�����ɗv�f������ꍇtrue�B
//�@�@public Object next()
//      �@�\�F���̗v�f���擾����B
//�@�@public Object previous()
//      �@�\�F���O�̗v�f���擾����B
//
//�@��LinkedList�N���X�̃��\�b�h
//�@�@public ListIterator listIterator(int i)
//      �@�\�F�ʒui���n�_�Ƃ��郊�X�g�����q���擾����B
//�@�@public Object get(int i)
//�@�@�@�@�\�F���̃��X�g�̈ʒui�̗v�f�����o���B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j821b {

  public static void main(String args[]) {

    // ��̃��X�g���쐬�B
    LinkedList<String> a = new LinkedList<String>();

    // �v�f�̒ǉ��B
    a.add("aaa");
    a.add("bbb");
    a.add("ccc");
    a.add("ddd");

    // ���X�g�̂��ׂĂ̗v�f�����ǂ�(���@�P�F������)�B
    System.out.print("���@�P(������)�F"); 
    for( int i=0; i<a.size(); i++ ) {
      System.out.print(" [" + i + "]" + (String)a.get(i));
    }   
    System.out.println(); 

    // ���X�g�̂��ׂĂ̗v�f�����ǂ�(���@�P�F�t����)�B
    System.out.print("���@�P(�t����)�F"); 
    for( int i=a.size()-1; i>=0; i-- ) {
      System.out.print(" [" + i + "]" + (String)a.get(i));
    }   
    System.out.println(); 

    // ���X�g�̂��ׂĂ̗v�f�����ǂ�(���@�Q�F������)�B
    ListIterator li = a.listIterator(0);
    System.out.print("���@�Q(������)�F"); 
    while( li.hasNext() ) {
      System.out.print(" " + li.next()); 
    }   
    System.out.println();

    // ���X�g�̂��ׂĂ̗v�f�����ǂ�(���@�Q�F�t����)�B
    ListIterator lj = a.listIterator(a.size());
    System.out.print("���@�Q(�t����)�F"); 
    while( lj.hasPrevious() ) {
      System.out.print(" " + lj.previous()); 
    }   
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font><br>

<pre>
% javac j821b.java
��: j821b.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j821b
���@�P(������)�F [0]aaa [1]bbb [2]ccc [3]ddd
���@�P(�t����)�F [3]ddd [2]ccc [1]bbb [0]aaa
���@�Q(������)�F aaa bbb ccc ddd
���@�Q(�t����)�F ddd ccc bbb aaa
</pre>

</body>
</html>
*/
