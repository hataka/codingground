// -*- mode: java -*- Time-stamp: <2009-06-29 17:20:18 kahata>
/*====================================================================
 * name: j271b.java 
 * created : Time-stamp: <09/06/29(��) 17:19:34 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j271b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j271b.java >>
//
//  �N���X�i�V�j�F�����N���X�i�����N���X�̍쐬�A�����N���X�̃X�R�[�v�j
//
//�@�@�����N���X�̃X�R�[�v���m�F����B
//
//�@�@�i�P�j�����N���X�̒�`�B
//�@�@�@�@�@�N���X���\�b�hmain����Ă΂�Ă���̂�static�錾�͕K�v�B
//�@�@�i�Q�j�����N���XC�̃I�u�W�F�N�gobji�̍쐬
//�@�@�i�R�j�����N���XINC�̃t�B�[���hsinc���N���Xj271b�̃��\�b�hmain����Q�Ƃ���B
//�@�@�i�S�j�����N���XINC�̃��\�b�hminc���N���Xj271b�̃��\�b�hmain����Ăяo���B
//�@�@�i�T�j�N���Xj271b�̃t�B�[���hs������N���X����Q�Ƃ���B
//�@�@�i�U�j�N���Xj271b�̃��\�b�hm������N���X����Ăяo���B
//
////////////////////////////////////////////////////////////////////////////////

class j271b {

  static String s = "�N���Xj271b���̃t�B�[���h�ϐ�";
  static String m() {
    return "�N���Xj271b���̃��\�b�hm";
  }             

  public static void main(String args[]) {

    INC obji = new INC(); //�i�Q�j

    System.out.println("�i�R�jobji.sinc = " + obji.sinc); //�i�R�j

    System.out.println("�i�S�jobji.minc()�F"); obji.minc(); //�i�S�j

  }

  //�i�P�j
  static class INC { 
    String sinc = "�����N���X���̃t�B�[���h�ϐ�";
    void minc() {
      System.out.println("�i�T�js = " + s); //�i�T�j
      System.out.println("�i�U�jm()�F" + m()); //�i�U�j
    }
  }
}
/*
���s����
% javac j271b.java
% java j271b
�i�R�jobji.sinc = �����N���X���̃t�B�[���h�ϐ�
�i�S�jobji.minc()�F
�i�T�js = �N���Xj271b���̃t�B�[���h�ϐ�
�i�U�jm()�F�N���Xj271b���̃��\�b�hm
*/
