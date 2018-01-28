// -*- mode: java -*- Time-stamp: <2009-06-28 10:30:34 kahata>
/*====================================================================
 * name: j241c.java 
 * created : Time-stamp: <09/06/28(��) 10:29:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j241c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j241c.java >>
//
//  �N���X�i�S�j�F�p���i���\�b�h�j
//
//�@�@���\�b�h�̌p�����m�F����B
//                     
//�@�@�i�P�j�e�N���X�̃C���X�^���X���\�b�h�̒�`�B
//�@�@�i�Q�j�e�N���X�̃N���X���\�b�h�̒�`�B
//�@�@�i�R�j�q�N���XChild�̃I�u�W�F�N�gobj�̍쐬�B
//�@�@�i�S�j�e�N���X�Œ�`�����C���X�^���X���\�b�h�̌Ăяo���B
//�@�@�i�T�j�e�N���X�Œ�`�����N���X���\�b�h�̌Ăяo���B
//
///////////////////////////////////////////////////////////////////////////////

// �e�N���X�̒�`�B
class Parent {
  void pm() { //�i�P�j
    System.out.println("�e�N���X(Parent)�̃C���X�^���X���\�b�h(pm)");
  }
  static void psm() { //�i�Q�j
    System.out.println("�e�N���X(Parent)�̃N���X���\�b�h(psm)");
  }
}

// �q�N���X�̒�`�B
class Child extends Parent {
  // ���e�Ȃ��B
}

class j241c {
  public static void main(String args[]) {

    Child obj = new Child(); //�i�R�j
   
    System.out.print("�i�S�jobj.pm()�F");
    obj.pm(); //�i�S�j

    System.out.print("�i�T�jobj.psm()�F");
    obj.psm(); //�i�T�j
    System.out.print("�i�T�jChild.psm()�F");
    Child.psm(); //�i�T�j
  }
}
/*
���s����
% javac j241c.java
% java j241c
�i�S�jobj.pm()�F�e�N���X(Parent)�̃C���X�^���X���\�b�h(pm)
�i�T�jobj.psm()�F�e�N���X(Parent)�̃N���X���\�b�h(psm)
�i�T�jChild.psm()�F�e�N���X(Parent)�̃N���X���\�b�h(psm)
*/
