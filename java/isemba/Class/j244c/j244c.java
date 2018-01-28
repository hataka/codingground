// -*- mode: java -*- Time-stamp: <2009-06-28 18:23:23 kahata>
/*====================================================================
 * name: j244c.java 
 * created : Time-stamp: <09/06/28(��) 18:22:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j244c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j244c.java >>
//
//  �N���X�i�S�j�F�p���i�I�[�o�[���C�h�A�����R�j
//
//�@�@Child objc = new Child();
//    Parent objp = objc;
//
//�@�@(�����R) �e�N���X�Œ�`���ꂽ���\�b�hm()���A�q�N���X�ŃI�[�o�[���C�h�����
//�@�@       �@����Ƃ��Aobjp.m()�ŌĂяo�����̂́A�e�N���X�Œ�`���ꂽ
//             ���\�b�h�ł͂Ȃ��A�q�N���X�ŃI�[�o�[���C�h���ꂽ���\�b�h�ɂȂ�B
//
//�@�@�i�P�j�q�N���X�̃I�u�W�F�N�gobjc�̍쐬�B
//�@�@�i�Q�j�q�N���X�̃I�u�W�F�N�gobjc��e�N���X�̕ϐ�objp�ɑ���B
//�@�@�i�R�j�e�N���X�̃I�u�W�F�N�gobjp�Ń��\�b�hm�̌Ăяo���B
// �@�@�@�@ �e�N���X�̃��\�b�hm�ł͂Ȃ��A�q�N���X�ŃI�[�o���C�h���ꂽ���\�b�hm��
//�@�@�@�@�@�Ăяo�����B
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  void m() {
    System.out.println("�e�N���X�̃��\�b�h(m)");
  }
}

class Child extends Parent {
  void m() {
    System.out.println("�q�N���X�ŃI�[�o�[���C�h�������\�b�h(m)");
  }
}

class j244c {
  public static void main(String args[]) {

    Child objc = new Child(); //�i�P�j
    Parent objp = objc; //�i�Q�j

    System.out.print("�i�R�jobjp.m()�F"); objp.m();
  }
}
/*
���s����
% javac j244c.java
% java j244c
�i�R�jobjp.m()�F�q�N���X�ŃI�[�o�[���C�h�������\�b�h(m)
*/
