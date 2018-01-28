// -*- mode: java -*- Time-stamp: <2009-06-28 11:24:28 kahata>
/*====================================================================
 * name: j242b.java 
 * created : Time-stamp: <09/06/28(��) 11:23:47 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j242b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j242b.java >>
//
//  �N���X�i�S�j�F�p���i�R���X�g���N�^�A�ꍇ�Q�j
//
//�@�@�ꍇ�Q�ɂ��Ċm�F����B
//
//�@�@�i�P�j�I�u�W�F�N�gobj�̍쐬�ƃR���X�g���N�^�̎��s�B
//
///////////////////////////////////////////////////////////////////////////////

// �e�N���X�̒�`�B
class Parent {
  Parent() { // �����Ȃ��R���X�g���N�^�B
    System.out.println("�e�N���X�̈����Ȃ��R���X�g���N�^(Parent())");
  }
  Parent(int p) { // ��������R���X�g���N�^�B
    System.out.println("�e�N���X�̈�������R���X�g���N�^(Parent(int p))");
  }
}

// �q�N���X�̒�`�B
class Child extends Parent {
  Child(String s) {
    // �����ɁAJava�R���p�C���ɂ���āAsuper(); �������I�ɑ}�������B 
    System.out.println("�q�N���X�̃R���X�g���N�^(Child(String s))");
  }
}

class j242b {
  public static void main(String args[]) {

    System.out.println("�i�P�j");
    Child obj = new Child("abc");
  }
}
/*
���s����
% javac j242b.java
% java j242b
�i�P�j
�e�N���X�̈����Ȃ��R���X�g���N�^(Parent())
�q�N���X�̃R���X�g���N�^(Child(String s))
*/
