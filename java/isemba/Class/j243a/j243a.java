// -*- mode: java -*- Time-stamp: <2009-06-28 16:38:19 kahata>
/*====================================================================
 * name: j243a.java 
 * created : Time-stamp: <09/06/28(��) 16:37:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j243a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j243a.java >>
//
//  �N���X�i�S�j�F�p���i�I�[�o�[���C�h�j
//
//�@�@�I�[�o�[���C�h���m�F����B
//
//�@�@�i�P�j�q�N���X�Őe�N���X�Ɠ������O�̃t�B�[���h�ϐ����`�B
//�@�@�i�Q�j�q�N���X�Őe�N���X�̃��\�b�hm���I�[�o�[���C�h�B
//�@�@�i�R�j�q�N���X�̃I�u�W�F�N�gobjc�̍쐬�B
//�@�@�i�S�j�e�N���X�Ɠ������O�̃t�B�[���h�ϐ��̎Q�ƁB
//�@�@�i�T�j�I�[�o�[���C�h�����q�N���X�̃��\�b�hm�̌Ăяo���B
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  int a = 123;
  void m() {
    System.out.println("�e�N���X�̃��\�b�h(m)");
  }
}

class Child extends Parent {
  int a = 456; //�i�P�j
  void m() { //�i�Q�j
    System.out.println("�I�[�o�[���C�h�����q�N���X�̃��\�b�h(m)");
  }
}

class j243a {
  public static void main(String args[]) {

    Child objc = new Child(); //�i�R�j

    System.out.println("�i�S�jobjc.a�F" + objc.a); //�i�S�j

    System.out.print("�i�T�jobjc.m()�F");
    objc.m(); //�i�T�j
  }
}
/*
���s����
% javac j243a.java
% java j243a
�i�S�jobjc.a�F456
�i�T�jobjc.m()�F�I�[�o�[���C�h�����q�N���X�̃��\�b�h(m)
*/
