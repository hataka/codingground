// -*- mode: java -*- Time-stamp: <2009-06-26 09:25:03 kahata>
/*====================================================================
 * name: j631b.java 
 * created : Time-stamp: <09/06/26(��) 09:24:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j631b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j631b.java >>
//
//  �t�@�C�������i�R�j�o�C�g�X�g���[���i���́F�t�@�C���@�o�́F�t�@�C���j
//
//    �����Œ�`�����f�[�^�𕶎��X�g���[���Ńt�@�C���ɏo�͂�����A
//�@�@�o�C�g�X�g���[���œ��͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j631b {
  public static void main(String args[]) {

    try {
      byte b1 = 12;
      byte b2 = -12;
      int n1 = 12;
      int n2 = 256;

      // �o�̓X�g���[�����쐬�B
      PrintWriter pw = new PrintWriter("file.txt");
      // �t�@�C���ɏo�́B
      pw.println(b1);
      pw.println(b2);
      pw.println(n1);
      pw.println(n2);
      // �o�̓X�g���[�������B
      pw.close();

      // ���̓X�g���[�����쐬�B 
      FileInputStream fis = new FileInputStream("file.txt"); 
      // �Ǎ��݃��[�v�B
      int c; // �ǂݍ��܂ꂽ�P�o�C�g�B���o�͂�int�^�ōs����B
             // byte�^�́A-128�`127�Bint�^�́A0�`255�B
      while( (c = fis.read()) != -1 ) {
        System.out.print("�����l�F" + c); 
        System.out.println("�@�o�C�g�l�F" + (byte)c); 
      }
      // ���̓X�g���[�������B
      fis.close();
    } catch ( Exception e ) { } 
  }
} 
/*
���s����
% javac j631b.java
% java j631b
�����l�F49�@�o�C�g�l�F49
�����l�F50�@�o�C�g�l�F50
�����l�F13�@�o�C�g�l�F13
�����l�F10�@�o�C�g�l�F10
�����l�F45�@�o�C�g�l�F45
�����l�F49�@�o�C�g�l�F49
�����l�F50�@�o�C�g�l�F50
�����l�F13�@�o�C�g�l�F13
�����l�F10�@�o�C�g�l�F10
�����l�F49�@�o�C�g�l�F49
�����l�F50�@�o�C�g�l�F50
�����l�F13�@�o�C�g�l�F13
�����l�F10�@�o�C�g�l�F10
�����l�F50�@�o�C�g�l�F50
�����l�F53�@�o�C�g�l�F53
�����l�F54�@�o�C�g�l�F54
�����l�F13�@�o�C�g�l�F13
�����l�F10�@�o�C�g�l�F10
*/
