// -*- mode: java -*- Time-stamp: <2009-06-19 15:13:44 kahata>
/*====================================================================
 * name: j861b.java 
 * created : Time-stamp: <09/06/19(��) 15:10:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j861b.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j861b.java >>
//
//  �f�[�^�\���i�U�j�F�}�b�v�iTreeMap�N���X�A�����q�@J2SE1.4�܂ł̋@�\�j
//
//�@�@�����q���g���āA�}�b�v�̂��ׂĂ̗v�f�����ǂ�B
//
//    �����̏ꍇ�FIterator�C���^�[�t�F�[�X���g���B
//�@�@�~���̏ꍇ�FIterator�C���^�[�t�F�[�X��Comparator�C���^�[�t�F�[�X���g���B
//
//      Comparator�C���^�[�t�F�[�X���g���Ƃ��ǂ鏇����ύX�ł���B
//
//  ��TreeMap�N���X�̃R���X�g���N�^
//�@�@public TreeMap()
//      �@�\�F�v�f�̎��R�����t���ɂ���������̃}�b�v�𐶐�����B
//�@�@public TreeMap(Comparator c)
//      �@�\�F�R���p���[�^c�ɂ�鏇���Â��ɂ���������̃}�b�v�𐶐�����B
//
//  ��TreeMap�N���X�̃��\�b�h
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
/////////////////////////////////////////////////////////////////////////

import java.util.*;


class decorder implements Comparator<String> {
	public int compare(String obj1, String obj2) {
		int c = obj1.compareTo(obj2);
		return -c;
	}
}
/****
class decorder implements Comparator {
  public int compare(Object obj1, Object obj2) {
    int c = ((String)obj1).compareTo((String)obj2);
    return -c;
  }
} 
*****/

class j861b {

  public static void main(String args[]) {

    // ��̃}�b�v���쐬�B
    TreeMap<String,String> tm = new TreeMap<String,String>();

    // �L�[�ƒl�̑g��ǉ��B
    tm.put("C","Car");
    tm.put("A","Airplane");
    tm.put("B","Book");
    tm.put("E","Earth");
    tm.put("D","Door");

    // �L�[�ƒl�̂��ׂĂ̑g�������ɂ��ǂ�B
    System.out.println("�L�[�ƒl�̂��ׂĂ̑g�������ɂ��ǂ�"); 
    Set a = (Set)(tm.keySet());
    Iterator ia = a.iterator();
    while( ia.hasNext() ) {
      Object key = ia.next();
      System.out.println("�L�[�F" + key + "�@�l�F" + (String)tm.get(key));
    }
    System.out.println(); 

    // ��̃}�b�v���쐬�B
/*
F:\java\isemba\Collection\j861b>javac -Xlint:unchecked j861b.java
j861b.java:92: �x��:[unchecked] �������ϊ��ł�
���o�l  : decorder
���Ғl  : java.util.Comparator<? super java.lang.String>
    TreeMap<String,String> s = new TreeMap<String,String>(new decorder());
                                                          ^
�x�� 1 ��
*/
    TreeMap<String,String> s = new TreeMap<String,String>(new decorder());

    // �L�[�ƒl�̑g��ǉ��B
    s.put("C","Car");
    s.put("A","Airplane");
    s.put("B","Book");
    s.put("E","Earth");
    s.put("D","Door");

    // �L�[�ƒl�̂��ׂĂ̑g���~���ɂ��ǂ�B
    System.out.println("�L�[�ƒl�̂��ׂĂ̑g���~���ɂ��ǂ�"); 
    Set b = (Set)(s.keySet());
    Iterator ib = b.iterator();
    while( ib.hasNext() ) {
      Object key = ib.next();
      System.out.println("�L�[�F" + key + "�@�l�F" + (String)s.get(key));
    }
  }
}
/*
���s����
% javac j861b.java
��:j861b.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j861b
�L�[�ƒl�̂��ׂĂ̑g�������ɂ��ǂ�
�L�[�FA�@�l�FAirplane
�L�[�FB�@�l�FBook
�L�[�FC�@�l�FCar
�L�[�FD�@�l�FDoor
�L�[�FE�@�l�FEarth

�L�[�ƒl�̂��ׂĂ̑g���~���ɂ��ǂ�
�L�[�FE�@�l�FEarth
�L�[�FD�@�l�FDoor
�L�[�FC�@�l�FCar
�L�[�FB�@�l�FBook
�L�[�FA�@�l�FAirplane
*/
