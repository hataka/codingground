// -*- mode: java -*- Time-stamp: <2009-06-29 16:49:42 kahata>
/*====================================================================
 * name: j261a.java 
 * created : Time-stamp: <09/06/29(��) 16:49:07 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261a.java >>
//
//  �N���X�i�U�j�F��O�i��{�I�ȗ�O�����j
//
//�@�@��{�I�ȗ�O�������m�F����B
//
//�@�@�i�P�jtry�u���b�N
//    �i�Q�j��O����
//    �i�R�jcatch�u���b�N�FArithmeticException
//�@�@�i�S�jcatch�u���b�N�FException)
//�@�@�i�T�jfinally�u���b�N
//
////////////////////////////////////////////////////////////////////////////////

class j261a {
  public static void main(String args[]) {

    System.out.println("�v���O�����J�n");

    try { //�i�P�j
      System.out.println("�i�P�jtry�u���b�N�J�n");
      int a,b;
      a = 1;
      b = 1/(a-1); //�i�Q�j
      System.out.println("�i�P�jtry�u���b�N�I��");

    } catch ( ArithmeticException e ) { //�i�R�j
      System.out.println("�i�R�jcatch�u���b�N(ArithmeticException)�J�n");
      System.out.println(e); // �G���[�̏ڍׂ�\���B
      System.out.println("�i�R�jcatch�u���b�N(ArithmeticException)�I��");

    } catch ( Exception e ) { //�i�S�j
      System.out.println("�i�S�jcatch�u���b�N(Exception)�J�n");
      System.out.println(e); // �G���[�̏ڍׂ�\���B
      System.out.println("�i�S�jcatch�u���b�N(Exception)�I��");

    } finally { //�i�T�j
      System.out.println("�i�T�jfinally�u���b�N�J�n");
      System.out.println("�i�T�jfinally�u���b�N�I��");
    }

    System.out.println("�v���O�����I��");
  }
}
/*
% javac j261a.java
% java j261a
�v���O�����J�n
�i�P�jtry�u���b�N�J�n
�i�R�jcatch�u���b�N(ArithmeticException)�J�n
java.lang.ArithmeticException: / by zero
�i�R�jcatch�u���b�N(ArithmeticException)�I��
�i�T�jfinally�u���b�N�J�n
�i�T�jfinally�u���b�N�I��
�v���O�����I��
*/
