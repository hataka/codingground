// -*- mode: java -*- Time-stamp: <2009-06-28 16:31:58 kahata>
/*====================================================================
 * name: j242c.java 
 * created : Time-stamp: <09/06/28(��) 16:31:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j242c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j242c.java >>
//
//  �N���X�i�S�j�F�p���i�R���X�g���N�^�A�ꍇ�R�j
//
//�@�@�ꍇ�R�ɂ��Ċm�F����B
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
  // �����ɁA�uChild() { super(); }�v���}�������B
}

class j242c {
  public static void main(String args[]) {

    System.out.println("�i�P�j");
    Child obj = new Child(); //�i�P�j
  }
}
/*
���s����
% javac j242c.java
% java j242c
�i�P�j
�e�N���X�̈����Ȃ��R���X�g���N�^(Parent())
*/
