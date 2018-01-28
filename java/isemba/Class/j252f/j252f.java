// -*- mode: java -*- Time-stamp: <2009-06-28 20:59:29 kahata>
/*====================================================================
 * name: j252f.java 
 * created : Time-stamp: <09/06/28(��) 20:58:43 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252f.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252f.java >>
//
//  �N���X�i�T�j�F�C���^�[�t�F�[�X�i�Q�̃C���^�[�t�F�[�X�̎����A���Ԑ��j
//
//�@�@�Q�̃C���^�[�t�F�[�X�̑��Ԑ����m�F����B
//
//�@�@�i�P�j�C���^�[�t�F�[�X(intf1)�̒�`�B
//�@�@�i�Q�j�C���^�[�t�F�[�X(intf2)�̒�`�B
//�@�@�i�R�j�C���^�[�t�F�[�X(intf1)�̎����B
//�@�@�i�S�j�C���^�[�t�F�[�X(intf2)�̎����B
//�@�@�i�T�j�I�u�W�F�N�gobj1�̍쐬�B
//�@�@�i�U�j�C���^�[�t�F�[�X(intf1)���萔s1�̎Q�ƁB
//�@�@�i�V�j�C���^�[�t�F�[�X(intf2)���萔s2�̎Q�Ƃ͂ł��Ȃ��B
//�@�@�i�W�j�C���^�[�t�F�[�X(intf1)�����\�b�h(m1)�̌Ăяo���B
//�@�@�i�X�jobj1.m2(); �N���X(C)�Œ�`�������\�b�h(m2)�̌Ăяo���͂ł��Ȃ��B
//
///////////////////////////////////////////////////////////////////////////////

interface intf1 { //�i�P�j
  String s1 = "�C���^�[�t�F�[�X(intf1)�����b�Z�[�W";
  void m1(); 
}
interface intf2 { //�i�Q�j
  String s2 = "�C���^�[�t�F�[�X(intf2)�����b�Z�[�W";
  void m2(); 
}

class C implements intf1,intf2 { 
  public void m1() { //�i�R�j
    System.out.println("�N���X(C)�Ŏ������ꂽ���\�b�h(m1)");
  }
  public void m2() { //�i�S�j
    System.out.println("�N���X(C)�Ŏ������ꂽ���\�b�h(m2)");
  }
}

class j252f {
  public static void main(String args[]) {

    // �I�u�W�F�N�gobj1�̍쐬�B
    intf1 obj1 = new C(); //�i�T�j

    System.out.println("�i�U�jobj1.s1 =" + obj1.s1); //�i�U�j
    System.out.println("�i�V�jobj1.s2 �́A�G���["); //�i�V�j
    System.out.print("�i�W�jobj1.m1()�F"); obj1.m1(); //�i�W�j
    System.out.println("�i�X�jobj1.m2()�́A�G���["); //�i�X�j 
  }
}
/*
���s����
% javac j252f.java
% java j252f
�i�U�jobj1.s1 =�C���^�[�t�F�[�X(intf1)�����b�Z�[�W
�i�V�jobj1.s2 �́A�G���[
�i�W�jobj1.m1()�F�N���X(C)�Ŏ������ꂽ���\�b�h(m1)
�i�X�jobj1.m2()�́A�G���[
*/
