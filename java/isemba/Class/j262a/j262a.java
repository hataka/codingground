// -*- mode: java -*- Time-stamp: <2009-06-29 17:09:29 kahata>
/*====================================================================
 * name: j262a.java 
 * created : Time-stamp: <09/06/29(��) 17:08:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j262a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j262a.java >>
//
//  �N���X�i�U�j�F��O�i�����\�b�h�O�ŗ�O����������ꍇ�j
//
//�@�@�����\�b�h�O�ł̊�{�I��O�������m�F����B
//
//�@�@�i�P�j�����\�b�h�O�ɗ�O�N���X�𑗏o���郁�\�b�h�̋L�q�B
//�@�@�i�Q�j��O�����B
//�@�@�i�R�jtry�u���b�N�B
//�@�@�i�S�j��O�N���X�𑗏o���郁�\�b�h�B
//    �i�T�jcatch�u���b�N�FException
//�@�@�i�U�jfinally�u���b�N
//
////////////////////////////////////////////////////////////////////////////////

class j262a {
  //�i�P�j
  static void m() throws ArithmeticException {
    int a,b;
    System.out.println("m()���s");
    a = 1;
    b = 1/(a-1); //�i�Q�j
  } 

  public static void main(String args[]) {

    System.out.println("�v���O�����J�n");

    try { //�i�R�j
      System.out.println("�i�R�jtry�u���b�N�J�n");
      m(); //�i�S�j 
      System.out.println("�i�R�jtry�u���b�N�I��");

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
% javac j262a.java
% java j262a
�v���O�����J�n
�i�R�jtry�u���b�N�J�n
m()���s
�i�T�jcatch�u���b�N(Exception)�J�n
java.lang.ArithmeticException: / by zero
�i�T�jcatch�u���b�N(Exception)�I��
�i�U�jfinally�u���b�N�J�n
�i�U�jfinally�u���b�N�I��
�v���O�����I��
*/
