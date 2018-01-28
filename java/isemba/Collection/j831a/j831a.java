// -*- mode: java -*- Time-stamp: <2009-06-18 17:53:01 kahata>
/*====================================================================
 * name: j831a.java 
 * created : Time-stamp: <09/06/18(��) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j831a.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j831a.java >>
//
//  �f�[�^�\���i�R�j�F�W���iHashSet�N���X�@J2SE1.4�܂ł̋@�\�j
//
//�@��java.util.HashSet�N���X      
//    �Epublic class HashSet extends AbstractSet
//                           implements Set, Cloneable, Serializable
//�@�@�EHashSet�N���X�́A�n�b�V�����g���ďW�����������Ă���B
//      �v�f�݂͌��ɈقȂ�A�d�����Ȃ��B
//    �@�v�f�̒ǉ��E�폜�̑���͈�莞�Ԃōs����B
//    �E���̂悤�ȃ��\�b�h�����s�ł���B
//�@�@�@�@�ǉ����\�b�h�Fadd
//�@�@�@�@�폜���\�b�h�Fremove
//�@�@�E�����F�v�f���ɂ�炸�A�ǉ��E�폜�E�����������ɍs����B
//
//  ��HashSet�N���X�̃R���X�g���N�^
//�@�@public HashSet()
//      �@�\�F��̃Z�b�g���쐬����B
//
//�@��HashSet�N���X�̃��\�b�h
//�@�@public boolean add(Object obj)
//�@�@�@�@�\�F�v�fobj��ǉ�����B
//�@�@public void clear()
//�@�@�@�@�\�F�W�����炷�ׂĂ̗v�f���폜����B
//�@�@public boolean contains(Object obj)
//�@�@�@�@�\�F�v�fobj�����݂��邩�ǂ������ׂ�B�v�f��ێ����Ă���ꍇtrue�B
//�@�@public boolean remove(Object obj)
//�@�@�@�@�\�F�v�fobj���폜����B�w�肳�ꂽ�v�f���W�����ɂ������ꍇ�A�߂�l��true�B
//�@�@public int size()
//�@�@�@�@�\�F�W���Ɋ܂܂�Ă���v�f����Ԃ��B
//
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j831a {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    HashSet<String> hs = new HashSet<String>();

    // �v�f�̒ǉ��B
    System.out.println("�ǉ��O(HashSet hs)�F" + hs);
    hs.add("A"); 
    hs.add("B"); hs.add("B");  // �v�f���d�������ꍇ�A�ЂƂ����o�^�����B
    hs.add("C");
    hs.add("D");
    hs.add("E");
    // �v�f��\���B�o�͂͒ǉ����ꂽ���Ƃ͖��֌W�ł���B
    System.out.println("�ǉ���(HashSet h)�F" + hs);
    System.out.println();

    // �v�f���B
    System.out.println("�v�f���E�m�F�O(HashSet hs)�F" + hs);
    System.out.println("hs.size()�F" + hs.size());
    System.out.println("�v�f���E�m�F��(HashSet hs)�F" + hs);
    System.out.println();

    // �v�f�̍폜�B
    System.out.println("�폜�O(HashSet hs)�F" + hs);
    hs.remove("C");
    System.out.println("hs.remove(\"C\")�@");
    System.out.println("hs.size()�F" + hs.size());
    System.out.println("�폜��(HashSet hs)�F" + hs);
    System.out.println();

    // �v�f�̑��݁B
    System.out.println("�v�f�̑��݊m�F�O(HashSet hs)�F" + hs);
    System.out.println("hs.contains(\"A\")�F" + hs.contains("A"));
    System.out.println("hs.contains(\"C\")�F" + hs.contains("C"));
    System.out.println("�v�f�̑��݊m�F��(HashSet hs)�F" + hs);
  }
}
/*
���s����
% javac j831a.java
��: j831a.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j831a
�ǉ��O(HashSet hs)�F[]
�ǉ���(HashSet h)�F[D, A, C, B, E]

�v�f���E�m�F�O(HashSet hs)�F[D, A, C, B, E]
hs.size()�F5
�v�f���E�m�F��(HashSet hs)�F[D, A, C, B, E]

�폜�O(HashSet hs)�F[D, A, C, B, E]
hs.remove("C")�@
hs.size()�F4
�폜��(HashSet hs)�F[D, A, B, E]

�v�f�̑��݊m�F�O(HashSet hs)�F[D, A, B, E]
hs.contains("A")�Ftrue
hs.contains("C")�Ffalse
�v�f�̑��݊m�F��(HashSet hs)�F[D, A, B, E]
*/
