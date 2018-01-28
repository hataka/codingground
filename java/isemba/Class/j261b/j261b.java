// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j261b.java 
 * created : Time-stamp: <09/06/29(��) 16:53:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j261b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j261b.java >>
//
//  �N���X�i�U�j�F��O�i��{�I�ȗ�O�����j
//
//�@�@��O�ɑΉ������O�N���X���킩��Ȃ��ꍇ�AException�N���X�ŗ�O��
//�@�@�󂯎��΂悢�B
//�@�@Exception�N���X�ŁA�񕜏�����K�؂ɍs���Ǝ��s���p���ł���
//�@�@��O�N���X���󂯎�邱�Ƃ��ł���B
//
//�@�@��{�I�ȗ�O�������m�F����B
//
//�@�@�i�P�jtry�u���b�N
//    �i�Q�j��O����
//    �i�R�jcatch�u���b�N�FException
//�@�@�i�S�jfinally�u���b�N

////////////////////////////////////////////////////////////////////////////////

class j261b {
  public static void main(String args[]) {

    System.out.println("�v���O�����J�n");

    try { //�i�P�j
      System.out.println("�i�P�jtry�u���b�N�J�n");
      int a,b;
      a = 1;
      b = 1/(a-1); //�i�Q�j
      System.out.println("�i�P�jtry�u���b�N�I��");

    } catch ( Exception e ) { //�i�R�j
      System.out.println("�i�R�jcatch�u���b�N(Exception)�J�n");
      System.out.println(e); // �G���[�̏ڍׂ�\���B
      System.out.println("�i�R�jcatch�u���b�N(Exception)�I��");

    } finally { //�i�S�j
      System.out.println("�i�S�jfinally�u���b�N�J�n");
      System.out.println("�i�S�jfinally�u���b�N�I��");
    }

    System.out.println("�v���O�����J�n");
  }
}
/*
% javac j261b.java
% java j261b
�v���O�����J�n
�i�P�jtry�u���b�N�J�n
�i�R�jcatch�u���b�N(Exception)�J�n
java.lang.ArithmeticException: / by zero
�i�R�jcatch�u���b�N(Exception)�I��
�i�S�jfinally�u���b�N�J�n
�i�S�jfinally�u���b�N�I��
�v���O�����J�n
*/
