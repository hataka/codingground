// -*- mode: java -*- Time-stamp: <2009-06-28 18:20:23 kahata>
/*====================================================================
 * name: j244b.java 
 * created : Time-stamp: <09/06/28(��) 18:19:40 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j244b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j244bjava >>
//
//  �N���X�i�S�j�F�p���i�I�[�o�[���C�h�A����2�j
//
//�@�@Child objc = new Child();
//    Parent objp = objc;
//
//�@�@(�����Q) �e�N���X�Ǝq�N���X�������t�B�[���ha�����Ƃ��Aobjp.a�Őe�N���X��
//�@�@�@       �t�B�[���h���Q�Ƃ����B
//
//�@�@�i�P�j�q�N���X�̃I�u�W�F�N�gobjc�̍쐬�B
//�@�@�i�Q�j�q�N���X�̃I�u�W�F�N�gobjc��e�N���X�̕ϐ�objp�ɑ���B
//�@�@�i�R�j�e�N���X�̃I�u�W�F�N�g�Ńt�B�[���h�ϐ�a�̎Q�ƁB
//�@�@�i�S�j�q�N���X�̃I�u�W�F�N�g�Ńt�B�[���h�ϐ�a�̎Q�ƁB
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  int a = 111; // �q�N���X�Ɠ������O�̃t�B�[���h�B
}

class Child extends Parent {
  int a = 222; // �e�N���X�Ɠ������O�̃t�B�[���h�B
}

class j244b {
  public static void main(String args[]) {

    Child objc = new Child(); //�i�P�j
    Parent objp = objc; //�i�Q�j

    System.out.println("�i�R�jobjp.a =" + objp.a);
    System.out.println("�i�S�jobjc.a =" + objc.a);
  }
}
/*
���s���� 
% javac j244b.java
% java j244b
�i�R�jobjp.a =111
�i�S�jobjc.a =222
*/
