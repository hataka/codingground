// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j632.java 
 * created : Time-stamp: <09/06/26(��) 09:35:12 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j632.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j632.java >>
//
//  �t�@�C�������i�R�j�o�C�g�X�g���[���i���o�́F�t�@�C���A�o�b�t�@�����O�j
//
//    �t�@�C������n�o�C�g�P�ʂœǂݍ��݁A�t�@�C���ɏo�͂���B
//    ���o�͂Ƃ��Ƀo�b�t�@�����O���s���B
//
//�@��java.io.BufferedInputStream�N���X
//�@�@�o�C�g�P�ʂ̓��͂Ńo�b�t�@�����O���s���N���X�B
//
//�@��BufferedInputStream�N���X�̃R���X�g���N�^
//    BufferedInputStream(InputStream obj)
//      �@�\�FInputStream�N���X�̃I�u�W�F�N�gobj����BufferedInputStream��
//�@�@�@�@�@�@�I�u�W�F�N�g���쐬�B 
//
//  ��BufferedInputStream�N���X�̃��\�b�h
//    public int read(byte[] b, int j, int k) throws IOException
//      �@�\�F���̓X�g���[������byte�z��b�̎w�肳�ꂽ�ʒu(j����k�o�C�g��)��
//�@�@�@�@�@�@�ǂݍ��ށB�ǂ݂Ƃ����o�C�g����Ԃ��B�X�g���[���̏I���ɒB����
//�@�@�@�@�@�@�Ƃ���-1��Ԃ��B
//    public void close() throws IOException
//      �@�\�F�X�g���[�������B
//
//�@��java.io.BufferedOutputStream�N���X
//�@�@�o�C�g�P�ʂ̏o�͂Ńo�b�t�@�����O���s���N���X�B
//
//�@��BufferedOutputStream�N���X�̃R���X�g���N�^
//    public BufferedOutputStream(OutputStream obj)
//      �@�\�FOutputStream�N���X�̃I�u�W�F�N�gobj����BufferedOutputStream��
//�@�@�@�@�@�@�I�u�W�F�N�g���쐬�B 
//
//  ��BufferedOutputStream�N���X�̃��\�b�h
//    public void write(byte[] b, int j, int k) throws IOException
//      �@�\�Fbyte�z��b�̈ʒuj����k�o�C�g�����o�̓X�g���[���ɏ������ށB  
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j632 {

  public static void main(String args[]) {
    try {
      // ���̓X�g���[�����쐬�Bargs[0]�͓��̓t�@�C�����B
//      FileInputStream fis = new FileInputStream(args[0]);
      FileInputStream fis = new FileInputStream("in.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);

      // �o�̓X�g���[�����쐬�Bargs[1]�͏o�̓t�@�C�����B
//      FileOutputStream fos = new FileOutputStream(args[1]);
      FileOutputStream fos = new FileOutputStream("out.txt");
      BufferedOutputStream bos = new BufferedOutputStream(fos);

      // �Ǎ��݃��[�v�B
      byte buff[] = new byte[10]; // �ǂݍ��܂ꂽ�o�C�g���B
      int len; // �ǂݍ��܂ꂽ�o�C�g���B
      while( (len = bis.read(buff,0,10)) != -1 ) {
        bos.write(buff,0,len);
      }

      // ���́E�o�̓X�g���[�������B
      bis.close(); fis.close();
      bos.close(); fos.close();
    } catch ( Exception e ) { }
  }
}
/*
���s����
% type in.txt
123
abc
���{��

% javac j632.java
% java j632 in.txt out.txt

% type out.txt
123
abc
���{��
*/
