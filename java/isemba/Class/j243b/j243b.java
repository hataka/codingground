// -*- mode: java -*- Time-stamp: <2009-06-28 16:44:21 kahata>
/*====================================================================
 * name: j243b.java 
 * created : Time-stamp: <09/06/28(��) 16:43:37 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j243b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j243b.java >>
//
//  �N���X�i�S�j�F�p���i�I�[�o�[���C�h�j
//
//  �@�I�[�o�[���C�h����Ă��e�N���X�̃t�B�[���h�⃁�\�b�h���w�肵�Ďg�����Ƃ�
//�@�@�ł���B
//  �@���ڂ̐e�N���X���w��super�Ƃ����\�����g���B
//  �@super.�t�B�[���h���@super.���\�b�h���@�Ƃ���΂悢�B
//
//�@�@�I�[�o�[���C�h���m�F����B
//
//�@�@�i�P�j�q�N���X�Őe�N���X�Ɠ������O�̃t�B�[���h�ϐ����`�B
//�@�@�i�Q�j�q�N���X�Őe�N���X�̃��\�b�hm���I�[�o�[���C�h�B
//�@�@�i�R�j�q�N���X�̃I�u�W�F�N�gobjc�̍쐬�B
//�@�@�i�S�j�e�N���X�̃t�B�[���h�ƃ��\�b�hm�𕜌��B
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
    System.out.println("�q�N���X�ŃI�[�o�[���C�h�������\�b�h(m)");
    System.out.println("a = " + a);
  }
  void mm() { //
    System.out.println("super.a = " + super.a); //�i�S�j
    System.out.print("super.m()�F");
    super.m(); //�i�S�j
  }
}

class j243b {
  public static void main(String args[]) {

    Child objc = new Child(); //�i�R�j

    System.out.println("�i�S�j");
    objc.mm();
  }
}
/*
���s����
% javac j243b.java
% java j243b
�i�S�j
super.a = 123
super.m()�F�e�N���X�̃��\�b�h(m)
*/
