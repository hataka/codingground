// -*- mode: java -*- Time-stamp: <2009-06-28 18:16:55 kahata>
/*====================================================================
 * name: j244a.java 
 * created : Time-stamp: <09/06/28(��) 18:16:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j244a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j244a.java >>
//
//  �N���X�i�S�j�F�p���i�I�[�o�[���C�h�A����1�j
//
//�@�@Child objc = new Child();
//    Parent objp = objc;
//
//�@�@(�����P) �ϐ�objp����q�N���X�ŐV���ɒ�`���ꂽ�����o(�t�B�[���h�A���\�b�h)
//             �ɃA�N�Z�X���邱�Ƃ͂ł��Ȃ��B
//
//�@�@�i�P�j�q�N���X�̃I�u�W�F�N�gobjc�̍쐬�B
//�@�@�i�Q�j�q�N���X�̃I�u�W�F�N�gobjc��e�N���X�̕ϐ�objp�ɑ���B
//�@�@�i�R�j�e�N���X�Œ�`���ꂽ�t�B�[���h�ϐ��ɃA�N�Z�X�\�B
//�@�@�i�S�j�q�N���X�ŐV���ɒ�`���ꂽ�t�B�[���h�ϐ��ɃA�N�Z�X�s�\�B
//�@�@�i�T�j�e�N���X�Œ�`���ꂽ���\�b�h�ɌĂяo���\�B
//�@�@�i�U�j�q�N���X�ŐV���ɒ�`���ꂽ���\�b�h�ɌĂяo���s�\�B
//
///////////////////////////////////////////////////////////////////////////////

class Parent {
  int pa = 111; // �e�N���X�݂̂̃t�B�[���h�B
  void pm() {
    System.out.println("�e�N���X�Œ�`���ꂽ���\�b�h(pm)");
  }
}

class Child extends Parent {
  int ca = 222; // �q�N���X�݂̂̃t�B�[���h�B
  void cm() {
    System.out.println("�q�N���X�ŐV���ɒ�`���ꂽ���\�b�h(cm)");
  }
}

class j244a {
  public static void main(String args[]) {

    Child objc = new Child(); //�i�P�j
    Parent objp = objc; //�i�Q�j

    System.out.println("�i�R�jobjp.pa = " + objp.pa); //�i�R�j
    System.out.println("�i�S�jobjp.ca = " + "�G���[");

    System.out.print("�i�T�jobjp.pm()�F"); objp.pm(); 
    System.out.print("�i�U�jobjp.cm()�F�G���[");
  }
}
/*
���s����
% javac j244a.java
% java j244a
�i�R�jobjp.pa = 111
�i�S�jobjp.ca = �G���[
�i�T�jobjp.pm()�F�e�N���X�Œ�`���ꂽ���\�b�h(pm)
�i�U�jobjp.cm()�F�G���[
*/
