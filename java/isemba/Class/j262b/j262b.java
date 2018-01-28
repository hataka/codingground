// -*- mode: java -*- Time-stamp: <2009-06-29 17:12:16 kahata>
/*====================================================================
 * name: j262b.java 
 * created : Time-stamp: <09/06/29(��) 17:11:39 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j262b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j262b.java >>
//
//  �N���X�i�U�j�F��O�i����̗�O�����A�����\�b�h�O�ŏ���)
//
//    ����̗�O�����A�����\�b�h�O�ŏ������m�F����B
//
//�@�@�i�P�j����̗�O�N���X�B
//�@�@�i�Q�j�����\�b�h�O�ɗ�O�N���X�𑗏o���郁�\�b�h�̋L�q�B
//�@�@�i�R�j��O�����B
//�@�@�i�S�jtry�u���b�N�B
//�@�@�i�T�j��O�N���X�𑗏o���郁�\�b�h�B
//    �i�U�jcatch�u���b�N�FException
//�@�@�i�V�jfinally�u���b�N
//
////////////////////////////////////////////////////////////////////////////////

//�i�P�j
class MyException extends Exception {
  MyException() { // �R���X�g���N�^�B
    System.out.println("�����O�N���X���Ăяo����܂���");
  }
}

class j262b {
  //�i�Q�j
  static void m() throws MyException {
    System.out.println("���\�b�hm()�����s����܂���");
    MyException e = new MyException();
    throw e; //�i�R�j
  }

  public static void main(String args[]) {

    System.out.println("�v���O�����J�n");

    try { //�i�S�j
      System.out.println("�i�S�jtry�u���b�N�J�n");
      m(); //�i�T�j 
      System.out.println("�i�S�jtry�u���b�N�I��");

    } catch ( Exception e ) { //�i�T�j
      System.out.println("�i�T�jcatch�u���b�N(Exception)�J�n");
      System.out.println(e); // �G���[�̏ڍׂ�\���B
      System.out.println("�i�T�jcatch�u���b�N(Exception)�I��");

    } finally { //�i�U�j
      System.out.println("�i�U�jfinally�u���b�N�J�n");
      System.out.println("�i�U�jfinally�u���b�N�I��");
    }
    System.out.println("�v���O�����I��");
  }
}
/*
���s����
% javac j262b.java
% java j262b
�v���O�����J�n
�i�S�jtry�u���b�N�J�n
���\�b�hm()�����s����܂���
�����O�N���X���Ăяo����܂���
�i�T�jcatch�u���b�N(Exception)�J�n
MyException
�i�T�jcatch�u���b�N(Exception)�I��
�i�U�jfinally�u���b�N�J�n
�i�U�jfinally�u���b�N�I��
�v���O�����I��
*/
