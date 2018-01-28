// -*- mode: java -*- Time-stamp: <2009-06-26 14:31:36 kahata>
/*====================================================================
 * name: j633a.java 
 * created : Time-stamp: <09/06/26(��) 14:30:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j633a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j633a.java >>
//
//  �t�@�C�������i�R�j�����_���A�N�Z�X�i�ǂݍ��݁j
//
//    �t�@�C���������_���A�N�Z�X�ŊJ���A�����̃f�[�^����ǂݍ��ށB
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
//    public void close() throws IOException
//�@�@�@�@�\�F�����_���A�N�Z�X�t�@�C���X�g���[�����I������B
//    public int read() throws IOException
//�@�@�@�@�\�F1�o�C�g�̃f�[�^��ǂݍ��ށB�l�́A0 �` 255�͈̔͂̐����B
//�@�@public void seek(long pos) throws IOException
//�@�@�@�@�\�F�t�@�C���̐擪���n�_(0)�Ƃ��āA�ǂݍ��݂܂��͏������݂́A
//�@�@�@�@�@�@�ʒupos����s����B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j633a {

  public static void main(String args[]) {

    try {

      // �t�@�C���������_���A�N�Z�X�ŊJ���B
      RandomAccessFile raf = new RandomAccessFile("j633a.txt","r");

      // �t�@�C���̖�������t���ɂP�o�C�g���ǂݍ��ށB
      for( long i=raf.length(); i>=1; i-- ) {
        raf.seek(i-1);
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
% type j633a.txt
12345abc

% javac j633a.java
% java j633a
99  c
98  b
97  a
53  5
52  4
51  3
50  2
49  1
*/
