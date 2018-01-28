// -*- mode: java -*- Time-stamp: <2009-06-28 20:55:45 kahata>
/*====================================================================
 * name: j252e.java 
 * created : Time-stamp: <09/06/28(��) 20:54:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252e.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252e.java >>
//
//  �N���X�i�T�j�F�C���^�[�t�F�[�X�i�Q�̃C���^�[�t�F�[�X�̎����j
//
//�@�@�Q�̃C���^�[�t�F�[�X�̊�{�I�Ȏ������m�F����B
//
//�@�@�i�P�j�C���^�[�t�F�[�X(intf1)�̒�`�B
//�@�@�i�Q�j�C���^�[�t�F�[�X(intf2)�̒�`�B
//�@�@�i�R�j�C���^�[�t�F�[�X(intf1)�̎����B
//�@�@�i�S�j�C���^�[�t�F�[�X(intf2)�̎����B
//�@�@�i�T�j�I�u�W�F�N�gobj�̍쐬�B
//�@�@�i�U�j�C���^�[�t�F�[�X(intf1)���萔s1�̎Q�ƁB
//�@�@�i�V�j�C���^�[�t�F�[�X(intf2)���萔s2�̎Q�ƁB
//�@�@�i�W�j�C���^�[�t�F�[�X(intf1)�����\�b�h(m1)�̌Ăяo���B
//�@�@�i�X�j�C���^�[�t�F�[�X(intf2)�����\�b�h(m2)�̌Ăяo���B
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

class j252e {
  public static void main(String args[]) {

    C obj = new C(); //�i�T�j

    System.out.println("�i�U�jobj.s1 =" + obj.s1); //�i�U�j
    System.out.println("�i�V�jobj.s2 =" + obj.s2); //�i�V�j
    System.out.print("�i�W�jobj.m1()�F"); obj.m1(); //�i�W�j
    System.out.print("�i�X�jobj.m2()�F"); obj.m2(); //�i�X�j
  }
}
/*
���s����
% javac j252e.java
% java j252e
�i�U�jobj.s1 =�C���^�[�t�F�[�X(intf1)�����b�Z�[�W
�i�V�jobj.s2 =�C���^�[�t�F�[�X(intf2)�����b�Z�[�W
�i�W�jobj.m1()�F�N���X(C)�Ŏ������ꂽ���\�b�h(m1)
�i�X�jobj.m2()�F�N���X(C)�Ŏ������ꂽ���\�b�h(m2)
*/
