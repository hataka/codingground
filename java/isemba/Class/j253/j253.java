// -*- mode: java -*- Time-stamp: <2009-06-29 12:45:40 kahata>
/*====================================================================
 * name: j253.java 
 * created : Time-stamp: <09/06/29(��) 12:44:58 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j253.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j253.java >>
//
//  �N���X�i�T�j�F�C���^�[�t�F�[�X�i�}�[�J�[�C���^�[�t�F�[�X�j
//
//�@�@����C���^�[�t�F�[�X����������Ă�����A���郁�\�b�h�����s����Ƃ���
//�@�@�悤�ȏ������s�����ɁA���e����̃C���^�[�t�F�[�X���g���B
//�@�@���̂悤�ȃC���^�[�t�F�[�X���}�[�J�[�C���^�[�t�F�[�X�Ƃ����B
//
//�@�@�i�P�j�}�[�J�[�C���^�[�t�F�[�Xintf�̒�`�B
//�@�@�i�Q�j�}�[�J�C���^�[�t�F�[�Xintf����������N���XC1�̒�`�B
//�@�@�i�R�j�}�[�J�C���^�[�t�F�[�Xintf���������Ȃ��N���XC2�̒�`�B
//�@�@�i�S�j�N���XC1�̃I�u�W�F�N�gobj1�̍쐬�B
//�@�@�i�T�j�N���XC2�̃I�u�W�F�N�gobj2�̍쐬�B
//�@�@�i�U�j�I�u�W�F�N�gobj1�Ƀ}�[�J�[�C���^�[�t�F�[�Xintf��
//�@�@�@�@�@��������Ă��邩���Ȃ����̔���B
//�@�@�i�V�j�I�u�W�F�N�gobj2�Ƀ}�[�J�[�C���^�[�t�F�[�Xintf��
//�@�@�@�@�@��������Ă��邩���Ȃ����̔���B
//
///////////////////////////////////////////////////////////////////////////////

interface intf { } //�i�P�j

class C1 implements intf { //�i�Q�j
  public void m1() {
    System.out.println("�N���X(C1)�Œ�`���ꂽ���\�b�h(m1)");
  }
}
class C2 { //�i�R�j
  public void m2() {
    System.out.println("�N���X(C1)�Œ�`���ꂽ���\�b�h(m2)");
  }
}

class j253 {
  public static void main(String args[]) {

    C1 obj1 = new C1(); //�i�S�j
    C2 obj2 = new C2(); //�i�T�j

    //�i�U�j
    if( obj1 instanceof intf ) {
      System.out.println("�i�U�jobj1�ɂ̓C���^�[�t�F�[�X(intf)����������Ă���");
    } else {
      System.out.println("�i�U�jobj1�ɂ̓C���^�[�t�F�[�X(intf)����������Ă��Ȃ�");
    }

    //�i�V�j
    if( obj2 instanceof intf ) {
      System.out.println("�i�V�jobj2�ɂ̓C���^�[�t�F�[�X(intf)����������Ă���");
    } else {
      System.out.println("�i�V�jobj2�ɂ̓C���^�[�t�F�[�X(intf)����������Ă��Ȃ�");
    }
  }
}
/*
���s����
% javac j253.java
% java j253
�i�U�jobj1�ɂ̓C���^�[�t�F�[�X(intf)����������Ă���
�i�V�jobj2�ɂ̓C���^�[�t�F�[�X(intf)����������Ă��Ȃ�
*/
