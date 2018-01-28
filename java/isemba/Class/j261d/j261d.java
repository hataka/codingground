// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j261d.java 
 * created : Time-stamp: <09/06/29(��) 17:02:24 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261d.java >>
//
//  �N���X�i�U�j�F��O�i����̗�O�����j
//
//    ����̗�O�N���X(MyException)��Exception�N���X�̎q�N���X�Ƃ��č쐬����B
//
//�@�@����̗�O�������m�F����B
//
//�@�@�i�P�j����̗�O�N���X�B
//�@�@�i�Q�jtry�u���b�N
//�@�@�i�R�jthrow���ŗ�O�𑗏o����B
//    �i�S�jcatch�u���b�N�FException
//�@�@�i�T�jfinally�u���b�N
//
////////////////////////////////////////////////////////////////////////////////

class MyException extends Exception { //�i�P�j
  MyException() { // �R���X�g���N�^�B
    System.out.println("�����O�N���X���Ăяo����܂���");
  }
}

class j261d {
  public static void main(String args[]) {

    System.out.println("�v���O�����J�n");

    try { //�i�Q�j
      System.out.println("�i�P�jtry�u���b�N�J�n");
      MyException e = new MyException();
      throw e; //�i�R�j

    } catch ( Exception e ) { //�i�R�j
      System.out.println("�i�R�jcatch�u���b�N(Exception)�J�n");
      System.out.println(e); // �G���[�̏ڍׂ�\���B
      System.out.println("�i�R�jcatch�u���b�N(Exception)�I��");

    } finally { //�i�S�j
      System.out.println("�i�S�jfinally�u���b�N�J�n");
      System.out.println("�i�S�jfinally�u���b�N�I��");
    }
    System.out.println("�v���O�����I��");
  }
}
/*
% javac j261d.java
% java j261d
�v���O�����J�n
�i�P�jtry�u���b�N�J�n
�����O�N���X���Ăяo����܂���
�i�R�jcatch�u���b�N(Exception)�J�n
MyException
�i�R�jcatch�u���b�N(Exception)�I��
�i�S�jfinally�u���b�N�J�n
�i�S�jfinally�u���b�N�I��
�v���O�����I��
*/
