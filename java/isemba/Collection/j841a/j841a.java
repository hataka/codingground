// -*- mode: java -*- Time-stamp: <2009-06-19 15:03:57 kahata>
/*====================================================================
 * name: j841a.java 
 * created : Time-stamp: <09/06/19(��) 15:01:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j841a.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j841a.java >>
//
//  �f�[�^�\���i�S�j�F�W���iTreeSet�N���X�@J2SE1.4�܂ł̋@�\�j
//�@
//�@��java.util.TreeSet�N���X
//    �Epublic class TreeSet extends AbstractSet
//                           implements SortedSet, Cloneable, Serializable
//�@�@�ETreeSet�N���X�ł́A�W�����c���[�\�����g���Ď�������B
//    �E���̂悤�ȃ��\�b�h�����s�ł���B
//�@�@�@�@�ǉ����\�b�h�Fadd
//�@�@�@�@�擾���\�b�h�Ffirst, last
//�@�@�@�@�폜���\�b�h�Fremove�@�@�@�@
//    �E�����F�ǉ��A�擾�A�폜�̑��삪�A�v�f��n�̉���log(n)�̃I�[�_�[�ōs����B
//�@�@�@�@�@�@�v�f�͌��߂�ꂽ�����ɕ���ł���B
//
//�@��TreeSet�N���X�̃R���X�g���N�^
//�@�@public TreeSet()
//�@�@�@�@�\�F��̏W�����쐬����B
//
//�@��TreeSet�N���X�̃��\�b�h
//�@�@public boolean add(Object obj)
//�@�@�@�@�\�F�v�fobj��؂ɒǉ�����B
//�@�@public void clear()
//�@�@�@�@�\�F�؂���ɂ���B
//�@�@public boolean contains(Object obj)
//�@�@�@�@�\�F�؂ɗv�fobj�����݂��邩�ǂ������ׂ�B
//�@�@public boolean remove(Object obj)
//�@�@�@�@�\�F�؂���v�fobj���폜�B
//�@�@public int size()
//�@�@�@�@�\�F�؂̗v�f����Ԃ��B
//
//    public Object first()
//      �@�\�F�؂���ŏ��v�f�����o���B
//    public Object last()
//      �@�\�F�؂���ő�v�f�����o���B
//�@�@public SortedSet headSet(Object obj)
//      �@�\�F�v�fobj�����������v�f�̏W����Ԃ��B
//�@�@public SortedSet tailSet(Object obj)
//      �@�\�F�v�fobj�ȏ�̗v�f�̏W����Ԃ��B
//�@�@public SortedSet subSet(Object obj1, Object obj2)
//      �@�\�F�v�fobj1�ȏ�A�v�fobj2�����̗v�f�̏W����Ԃ��B
//
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j841a {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    TreeSet<String> ts = new TreeSet<String>();

    // �v�f�̒ǉ��B
    System.out.println("�ǉ��O(TreeSet ts)�F" + ts);
    ts.add("A"); 
    ts.add("B"); ts.add("B"); // �v�f���d�������ꍇ�A�ЂƂ����o�^�����B
    ts.add("C");
    ts.add("D"); 
    ts.add("E");
    ts.add("F");
    System.out.println("�ǉ���(TreeSet ts)�F" + ts);
    System.out.println();

    // �W���̃T�C�Y��\���B
    System.out.println("�m�F�O(TreeSet ts)�F" + ts);
    System.out.println("ts.size()�F" + ts.size());
    System.out.println("�m�F��(TreeSet ts)�F" + ts);
    System.out.println();

    // �ŏ��̗v�f�A�ő�̗v�f��\���B
    System.out.println("�m�F�O(TreeSet ts)�F" + ts);
    System.out.println("ts.first()�F" + ts.first());
    System.out.println("ts.last()�F" + ts.last());
    System.out.println("�m�F��(TreeSet ts)�F" + ts);
    System.out.println();

    // �؂���v�fA���폜�B
    System.out.println("�폜�O(TreeSet ts)�F" + ts);
    System.out.println("ts.remove(\"A\")�F" + ts.remove("A"));
    System.out.println("�폜��(TreeSet ts)�F" + ts);
    System.out.println();

    //�v�fE�����������v�f�̏W����Ԃ��B
    System.out.println("�m�F�O(TreeSet ts)�F" + ts);
    TreeSet w1 = (TreeSet)ts.headSet("E");
    System.out.println("(TreeSet)ts.headSet(\"E\")�F" + w1); 
    System.out.println("�m�F��(TreeSet ts)�F" + ts);
    System.out.println();

    //�v�fE�ȏ�̗v�f�̏W����Ԃ��B
    System.out.println("�m�F�O(TreeSet ts)�F" + ts);
    TreeSet w2 = (TreeSet)ts.tailSet("E");
    System.out.println("(TreeSet)ts.tailSet(\"E\")�F" + w2); 
    System.out.println("�m�F��(TreeSet ts)�F" + ts);
    System.out.println();

    //�v�fB�ȏ�A�v�fE�����̗v�f�̏W����Ԃ��B
    System.out.println("�m�F�O(TreeSet ts)�F" + ts);
    TreeSet w3 = (TreeSet)ts.subSet("B","E");
    System.out.println("(TreeSet)ts.subSet(\"B\",\"E\")�F" + w3); 
    System.out.println("�m�F��(TreeSet ts)�F" + ts);
  }
}
/*
% javac j841a.java
��:j841a.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j841a
�ǉ��O(TreeSet ts)�F[]
�ǉ���(TreeSet ts)�F[A, B, C, D, E, F]

�m�F�O(TreeSet ts)�F[A, B, C, D, E, F]
ts.size()�F6
�m�F��(TreeSet ts)�F[A, B, C, D, E, F]

�m�F�O(TreeSet ts)�F[A, B, C, D, E, F]
ts.first()�FA
ts.last()�FF
�m�F��(TreeSet ts)�F[A, B, C, D, E, F]

�폜�O(TreeSet ts)�F[A, B, C, D, E, F]
ts.remove("A")�Ftrue
�폜��(TreeSet ts)�F[B, C, D, E, F]

�m�F�O(TreeSet ts)�F[B, C, D, E, F]
(TreeSet)ts.headSet("E")�F[B, C, D]
�m�F��(TreeSet ts)�F[B, C, D, E, F]

�m�F�O(TreeSet ts)�F[B, C, D, E, F]
(TreeSet)ts.tailSet("E")�F[E, F]
�m�F��(TreeSet ts)�F[B, C, D, E, F]

�m�F�O(TreeSet ts)�F[B, C, D, E, F]
(TreeSet)ts.subSet("B","E")�F[B, C, D]
�m�F��(TreeSet ts)�F[B, C, D, E, F]
*/
