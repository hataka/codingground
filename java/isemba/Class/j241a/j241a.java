// -*- mode: java -*- Time-stamp: <2009-06-28 10:15:13 kahata>
/*====================================================================
 * name: j241a.java 
 * created : Time-stamp: <09/06/28(��) 10:14:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j241a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j241a.java >>
//
//  �N���X�i�S�j�F�p���i�t�B�[���h�j
//
//�@�@�t�B�[���h�̌p�����m�F����B
//                     
//�@�@�i�P�j�e�N���X�̃C���X�^���X�ϐ��B
//�@�@�i�Q�j�e�N���X�̃N���X�ϐ��B
//�@�@�i�R�j�q�N���XChild�̃I�u�W�F�N�gobj�̐����B
//�@�@�i�S�j�e�N���X�Œ�`�����C���X�^���X�ϐ�pa�̎Q�ƁB
//�@�@�i�T�j�e�N���X�Œ�`�����N���X�ϐ�pb�̎Q�ƁB
//
///////////////////////////////////////////////////////////////////////////////

// �e�N���X�̒�`�B
class Parent {
  int pa = 111; //�i�P�j        
  static int pb = 222; //�i�Q�j
}

// �q�N���X�̒�`�B
class Child extends Parent { 
  // ���e�Ȃ��B
}

class j241a {
  public static void main(String args[]) {

    Child obj = new Child(); //�i�R�j
   
    System.out.println("�i�S�jobj.pa = " + obj.pa); //�i�S�j

    System.out.println("�i�T�jobj.pb = " + obj.pb); //�i�T�j
    System.out.println("�i�T�jChild.pb = " + Child.pb); //�i�T�j
  }
}
/*
���s����
% javac j241a.java
% java j241a
�i�S�jobj.pa = 111
�i�T�jobj.pb = 222
�i�T�jChild.pb = 222
*/
