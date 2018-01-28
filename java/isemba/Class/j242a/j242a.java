// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j242a.java 
 * created : Time-stamp: <09/06/28(��) 11:00:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j242a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j242a.java >>
//
//  �N���X�i�S�j�F�p���i�R���X�g���N�^�A�ꍇ�P�j
//
//�@�@�ꍇ�P�ɂ��Ċm�F����B
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

// �R���X�g���N�^�̂���q�N���X�̒�`�B
class Child extends Parent {
  Child(String s) {
    super(222);
    System.out.println("�q�N���X�̃R���X�g���N�^(Child(String s))");
  }
}

class j242a {
  public static void main(String args[]) {

    System.out.println("�i�P�j");
    Child obj = new Child("abc"); //�i�P�j
  }
}
/*
���s����
% javac j242a.java
% java j242a
�i�P�j
�e�N���X�̈�������R���X�g���N�^(Parent(int p))
�q�N���X�̃R���X�g���N�^(Child(String s))
*/
