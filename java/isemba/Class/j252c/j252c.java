// -*- mode: java -*- Time-stamp: <2009-06-28 20:45:12 kahata>
/*====================================================================
 * name: j252c.java 
 * created : Time-stamp: <09/06/28(��) 20:44:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j252c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j252c.java >>
//
//  �N���X�i�T�j�F�C���^�[�t�F�[�X�i���Ԑ��j
//
//�@�@�C���^�[�t�F�[�X�́A�I�u�W�F�N�g�����Ȃ��B
//�@�@�������A�C���^�[�t�F�[�X�^�̕ϐ���錾���āA�C���^�[�t�F�[�X��
//�@�@�������Ă���N���X�̃I�u�W�F�N�g���w�����Ƃ͂ł���B
//
//�@�@    �C���^�[�t�F�[�X�� �ϐ��� = new �N���X��(); 
//
//�@�@�i�����P�j�C���^�[�t�F�[�X�Œ�`���ꂽ�ϐ��A
//�@�@�@�@�@�@�@�C���^�[�t�F�[�X�Œ�`����A�N���X���Ŏ������ꂽ���\�b�h��
//�@�@�@�@�@�@�@�A�N�Z�X�ł���B
//�@�@�i�����Q�j�N���X�ŐV���ɒ�`���ꂽ�ϐ��⃁�\�b�h�ɂ̓A�N�Z�X�ł��Ȃ��B
//
//�@�@�i�P�j�C���^�[�t�F�[�X(intf)�̒�`�B
//�@�@�i�Q�j�C���^�[�t�F�[�X(intf)�̎����B
//�@�@�i�R�j�N���X�ŐV���ɒ�`�������\�b�hm�B
//�@�@�i�S�j�C���^�[�t�F�[�X�̓I�u�W�F�N�g�����Ȃ��B
//�@�@�i�T�j�C���^�[�t�F�[�X�^�̕ϐ���錾���A�C���^�[�t�F�[�X(intf)��
//�@�@�@�@�@�������Ă���N���X�̃I�u�W�F�N�g���w�����Ƃ͂ł���B
//�@�@�i�U�j�C���^�[�t�F�[�X���t�B�[���hobj2.msg�ւ̃A�N�Z�X�\�B
//�@�@�i�V�j�C���^�[�t�F�[�X�����\�b�hmi�ւ̃A�N�Z�X�\�B
//�@�@�i�W�j�N���X���t�B�[���hobj2.a�ւ̃A�N�Z�X�͂ł��Ȃ��B
//�@�@�i�X�j�N���X�����\�b�hm���Ăяo���Ȃ��B
//
///////////////////////////////////////////////////////////////////////////////

interface intf { //�i�P�j
  String msg = "interface�����b�Z�[�W";
  void mi(); 
}

class C implements intf { 
  int a = 111;
  public void mi() { //�i�Q�j
    System.out.println("�N���X(C)�Ŏ��������C���^�[�t�F�C�X�����\�b�h(mi)");
  }
  void m() { //�i�R�j
    System.out.println("�N���X(C)�Œ�`�������\�b�h(m)");
  }
}

class j252c {
  public static void main(String args[]) {

    System.out.println("�i�S�jintf obj1 = new intf() �́A�G���[");

    intf obj2 = new C(); //�i�T�j 

    System.out.println("�i�U�jobj2.msg�F" + obj2.msg); //�i�U�j

    System.out.print("�i�V�jobj2.mi()�F"); obj2.mi(); //�i�V�j

    System.out.println("�i�W�jobj2.a �́A�G���["); //�i�W�j
    System.out.println("�i�X�jobj2.mc() �́A�G���["); //�i�X�j
  }
}
/*
���s����
% javac j252c.java
% java j252c
�i�S�jintf obj1 = new intf() �́A�G���[
�i�U�jobj2.msg�Finterface�����b�Z�[�W
�i�V�jobj2.mi()�F�N���X(C)�Ŏ��������C���^�[�t�F�C�X�����\�b�h(mi)
�i�W�jobj2.a �́A�G���[
�i�X�jobj2.mc() �́A�G���[
*/
