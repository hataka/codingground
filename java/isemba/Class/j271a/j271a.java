// -*- mode: java -*- Time-stamp: <2009-06-29 17:16:54 kahata>
/*====================================================================
 * name: j271a.java 
 * created : Time-stamp: <09/06/29(��) 17:16:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j271a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j271a.java >>
//
//  �N���X�i�V�j�F�����N���X�i�����N���X�̍쐬�A�����N���X�̃X�R�[�v�j
//
//�@�@�����N���X�̃X�R�[�v���m�F����B
//
//�@�@�E�����N���X�́A�����N���X���܂ރN���X�̃X�R�[�v���ɂ���̂ŁA
//�@�@�@�����N���X���܂ރN���X�̃����o�ɓ����N���X����A�N�Z�X�ł���B
//
//�@�@�i�P�j�����N���X�̒�`�B
//�@�@�i�Q�j�����N���XINC���w���ϐ�obji��錾�B
//�@�@�i�R�j�����N���XINC�̃I�u�W�F�N�gobji�̍쐬
//�@�@�i�S�j�N���XC�̃I�u�W�F�N�gobj�̍쐬
//�@�@�i�T�j�N���XC�̃��\�b�hm1�̌Ăяo���B
//�@�@�i�U�j�����N���XINC�̃t�B�[���hsinc���N���XC�̃��\�b�hm1����Q�Ƃ���B
//�@�@�i�V�j�����N���XINC�̃��\�b�hminc���N���XC�̃��\�b�hm1����Ăяo���B
//�@�@�i�W�j�N���XC�̃t�B�[���hs������N���X����Q�Ƃ���B
//�@�@�i�X�j�N���XC�̃��\�b�hm2������N���X����Ăяo���B
//
////////////////////////////////////////////////////////////////////////////////

class C {
  String s = "�N���XC���̃t�B�[���h�ϐ�";

  INC obji; //�i�Q�j

  C() { // �N���XC�̃R���X�g���N�^�B
    obji = new INC(); //�i�R�j
  }

  void m1() {
    System.out.println("�i�U�jobji.sinc = " + obji.sinc); //�i�U�j
    System.out.println("�i�V�jobji.minc()�F"); obji.minc(); //�i�V�j
  }

  void m2() {
    System.out.println("�N���XC���̃��\�b�h"); 
  }

  //�i�P�j
  class INC {
    String sinc = "�����N���X���̃t�B�[���h�ϐ�";
    void minc() {
      System.out.println("�i�W�js = " + s); //�i�W�j
      System.out.print("�i�X�jm2()�F"); m2(); //�i�X�j
    }
  }

}

class j271a {
  public static void main(String args[]) {

    C obj = new C(); //�i�S�j

    System.out.println("�i�T�jobj.m1()�F");obj.m1(); //�i�T�j
  }
}
/*
���s����
% javac j271a.java
% java j271a
�i�T�jobj.m1()�F
�i�U�jobji.sinc = �����N���X���̃t�B�[���h�ϐ�
�i�V�jobji.minc()�F
�i�W�js = �N���XC���̃t�B�[���h�ϐ�
�i�X�jm2()�F�N���XC���̃��\�b�h
*/
