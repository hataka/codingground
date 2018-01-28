// -*- mode: java -*- Time-stamp: <2009-06-29 16:58:22 kahata>
/*====================================================================
 * name: j261c.java 
 * created : Time-stamp: <09/06/29(��) 16:57:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261c.java >>
//
//  �N���X�i�U�j�F��O�i��O�̑��o�j
//
//�@�@�\���throw���g���āA�����ŗ�O�𑗏o���邱�Ƃ��ł���B
//    ��O����������ƁA����ȍ~�̏����͎��s����Ȃ��B
//
//�@�@�����ŗ�O�𑗏o������@���m�F����B
//
//�@�@�i�P�jtry�u���b�N
//�@�@�i�Q�jthrow���ŗ�O�𑗏o����B
//    �i�R�jcatch�u���b�N�FException
//�@�@�i�S�jfinally�u���b�N

////////////////////////////////////////////////////////////////////////////////

class j261c {
  public static void main(String args[]) {

    System.out.println("�v���O�����J�n");

    try { //�i�P�j
      System.out.println("�i�P�jtry�u���b�N�J�n");
      throw new ArithmeticException(); //�i�Q�j

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
% javac j261c.java
% java j261c
�v���O�����J�n
�i�P�jtry�u���b�N�J�n
�i�R�jcatch�u���b�N(Exception)�J�n
java.lang.ArithmeticException
�i�R�jcatch�u���b�N(Exception)�I��
�i�S�jfinally�u���b�N�J�n
�i�S�jfinally�u���b�N�I��
�v���O�����I��
*/
