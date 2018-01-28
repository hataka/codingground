// -*- mode: java -*- Time-stamp: <2009-06-28 10:24:04 kahata>
/*====================================================================
 * name: j241b.java 
 * created : Time-stamp: <09/06/28(��) 10:22:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j241b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j241b.java >>
//
//  �N���X�i�S�j�F�p���i�t�B�[���h�j
//
//�@�@�t�B�[���h�̌p�����m�F����B
//
// �@ �t�B�[���h�ϐ����Q�Ƃ���ƁA�����̃N���X����T���A�����Ȃ���ΐe�N���X��T���B
//�@�@�����ɂ��Ȃ���΁A���̂܂��e�N���X��T�����Ƃ�������܂ő�����B
//
//�@�@�i�P�j�c��N���X�̃C���X�^���X�ϐ��B
//�@�@�i�Q�j�c��N���X�̃N���X�ϐ��B
//�@�@�i�R�j�q�N���XChild�̃I�u�W�F�N�gobj�̐����B
//�@�@�i�S�j�c��N���X�Œ�`�����C���X�^���X�ϐ�pa�̎Q�ƁB
//�@�@�i�T�j�c��N���X�Œ�`�����N���X�ϐ�pb�̎Q�ƁB
//
///////////////////////////////////////////////////////////////////////////////

// �c��N���X�̒�`�B
class Ancestor {
  int aa = 111; //�i�P�j        
  static int ab = 222; //�i�Q�j
}

// �e�N���X�̒�`�B
class Parent extends Ancestor { 
  // ���e�Ȃ��B
}

// �q�N���X�̒�`�B
class Child extends Parent { 
  // ���e�Ȃ��B
}

class j241b {
  public static void main(String args[]) {

    Child obj = new Child(); //�i�R�j
   
    System.out.println("�i�S�jobj.aa = " + obj.aa); //�i�S�j

    System.out.println("�i�T�jobj.ab = " + obj.ab); //�i�T�j
    System.out.println("�i�T�jChild.ab = " + Child.ab); //�i�T�j
  }
}
/*
���s����
% javac j241b.java
% java j241b
�i�S�jobj.aa = 111
�i�T�jobj.ab = 222
�i�T�jChild.ab = 222
*/
