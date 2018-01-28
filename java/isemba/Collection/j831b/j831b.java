// -*- mode: java -*- Time-stamp: <2009-06-19 11:21:54 kahata>
/*====================================================================
 * name: j831b.java 
 * created : Time-stamp: <09/06/19(��) 11:19:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j831b.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j831b.java >>
//
//  �f�[�^�\���i�R�j�F�W���iHashSet�N���X�A�����q�@J2SE1.4�܂ł̋@�\�j
//
//�@�@�W���̂��ׂĂ̗v�f�����ǂ�B
//�@�@������v�f�̏��Ԃ͐���ł��Ȃ��B
//
//�@��HashSet�N���X�̃��\�b�h
//�@�@public Iterator iterator()
//�@�@�@�@�\�F�W���̔����q���擾����B
//
//�@��Iterator�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public boolean hasNext()
//      �@�\�F���̗v�f������ꍇtrue�A���̑�false�B
//�@�@public Object next()
//      �@�\�F���̗v�f���擾����B
//
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j831b {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    HashSet<String> hs = new HashSet<String>();

    // �v�f�̒ǉ��B
    hs.add("A");
    hs.add("B");
    hs.add("C");

    // ���ׂĂ̗v�f�����ǂ�B
    System.out.println("���ׂĂ̗v�f");
    Iterator ih;
    ih = hs.iterator();
    while( ih.hasNext() ) {
      System.out.println(ih.next());
    }
    System.out.println();

    // �v�f�̒ǉ��B
    hs.add("D");
    hs.add("E");

    // ���ׂĂ̗v�f�����ǂ�B
    System.out.println("���ׂĂ̗v�f");
    ih = hs.iterator();
    while( ih.hasNext() ) {
      System.out.println(ih.next());
    }
  }
}
/*
���s����
% javac j831b.java
��: j831b.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j831b
���ׂĂ̗v�f
A
C
B

���ׂĂ̗v�f
D
A
C
B
E
*/
