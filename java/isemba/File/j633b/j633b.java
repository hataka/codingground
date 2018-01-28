// -*- mode: java -*- Time-stamp: <2009-06-26 14:31:36 kahata>
/*====================================================================
 * name: j633b.java 
 * created : Time-stamp: <09/06/26(��) 14:30:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j633b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j633b.java >>
//
//  �t�@�C�������i�R�j�����_���A�N�Z�X�i�ǂݍ��݁A�������݁j
//
//    �t�@�C���������_���A�N�Z�X�ŊJ���A���e�𔽓]���ĕ\������B
//
//�@��java.io.RandomAccessFile�N���X
//    ���̃N���X���g���āA�t�@�C���Ƀ����_���A�N�Z�X�����邱�Ƃ��ł���B
//
//  ��RandomAccessFile�N���X�̃R���X�g���N�^
//    public RandomAccessFile(File f, String m) throws FileNotFoundExceptionFile
//�@�@�@�@�\�F�t�@�C��f�ɑ΂��āA�����_���A�N�Z�X�t�@�C���X�g���[�����쐬����B
//�@�@�@�@�@�@���[�hm���A"r"�̏ꍇ�A�ǂݍ��ݗp�ɊJ���B
//�@�@�@�@�@�@"rw"�̏ꍇ�A�ǂݍ��݂���я������ݗp�ɊJ���B�t�@�C�������݂��Ȃ�
//�@�@�@�@�@�@�ꍇ�́A�V�K�ɍ쐬�����B
// 
//  ��RandomAccessFile�N���X�̃��\�b�h
//    public int write(int n) throws IOException
//�@�@�@�@�\�F1�o�C�g�̃f�[�^�����݂̃t�@�C���|�C���^�̈ʒu�ɏ������ށB
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j633b {

  public static void main(String args[]) {

    try {

      // �t�@�C���������_���A�N�Z�X�ŊJ���B
      RandomAccessFile raf = new RandomAccessFile("j633b.txt","rw");

      // �t�@�C���̓��e�𔽓]����B
      int s,t;
      long i,j;
      i = 1; j = raf.length();
      while( i < j ) {
        raf.seek(i-1); s = raf.read();
        raf.seek(j-1); t = raf.read();
        raf.seek(j-1); raf.write(s);
        raf.seek(i-1); raf.write(t);
        i++; j--;
      }

      for( long k=1; k<=raf.length(); k++ ) {
        raf.seek(k-1);
        int n = raf.read();
        System.out.printf("%d  %c\n",n,(char)n);
      }

      // �t�@�C�������B
      raf.close();

    } catch( Exception e ) { }
  }
} 
/*
���s����
% type j633b.txt
123abc

% javac j633b.java
% java j633b
99  c
98  b
97  a
51  3
50  2
49  1
*/
