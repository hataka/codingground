// -*- mode: java -*- Time-stamp: <2009-06-27 11:35:40 kahata>
/*====================================================================
 * name: j235d.java 
 * created : Time-stamp: <09/06/27(�y) 11:34:55 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j235d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j235d.java >>
//
//  �N���X�i�R�j�F�R���X�g���N�^�i�I�[�o�[���[�h�j
//
//  �@�����̃N���X�̃R���X�g���N�^�̌Ăяo���ɁAthis()��this(�������X�g)���g����B
//�@�@���̌Ăяo���́A�R���X�g���N�^�̐擪�ɏ����Ȃ���΂Ȃ�Ȃ��B
//    �����̌Ăяo�����g���āA�������������Ȍ��ɋL�q���邱�Ƃ��ł���B
//
//�@�@this(�������X�g)�̎g�������m�F����B
//
//�@�@�i�P�j�I�u�W�F�N�gobj1�̍쐬�ƃR���X�g���N�^���s�B
//�@�@�i�Q�j�I�u�W�F�N�gobj2�̍쐬�ƃR���X�g���N�^���s�B
//
////////////////////////////////////////////////////////////////////////////////

class C {
  String s; // �ϐ��̒�`�B
  C() { // �����O�̃R���X�g���N�^�B
    this("���O�Ȃ�"); 
    System.out.println("�i�P�j�����O�̃R���X�g���N�^�FC()");
    System.out.println();
  }
  C(String s) { // �����P�̃R���X�g���N�^�B
    System.out.println("�i�Q�j�����P�̃R���X�g���N�^�FC(String s)");
    System.out.println("�@�@�@s = " + s);
  }
}

class j235d {
  public static void main(String args[]) {

    C obj1 = new C(); //�i�P�j 

    C obj2 = new C("��鑾�Y"); //�i�Q�j 

  }
}
/*
���s����
% javac j235d.java
% java j235d
�i�Q�j�����P�̃R���X�g���N�^�FC(String s)
�@�@�@s = ���O�Ȃ�
�i�P�j�����O�̃R���X�g���N�^�FC()

�i�Q�j�����P�̃R���X�g���N�^�FC(String s)
�@�@�@s = ��鑾�Y
*/
