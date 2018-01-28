// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j713.java 
 * created : Time-stamp: <09/07/03(��) 09:42:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j713.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j713.java >>
//
//  �l�b�g���[�N�i�P�j�FURLConnection�N���X���g����URL�Ɋւ������\��
//
//�@�@URLConnection�N���X���g���āAURL�Ɋւ�������擾����B
//
//�@��URL�N���X�̃��\�b�h
//    public URLConnection openConnection() throws IOException
//      �@�\�FURL�ւ̐ڑ���\��URLConnection�N���X�̃I�u�W�F�N�g���擾�B
//
//  ��URLConnection�N���X
//    �A�v���P�[�V������URL�Ԃ̒ʐM�����N��\�����ׂẴN���X�̃X�[�p�[�N���X
//�@�@�ł���B���̃N���X�̃I�u�W�F�N�g���g���āAURL�ŎQ�Ƃ��郊�\�[�X�ւ̓��o��
//�@�@���ł���B
//
//�@��URLConnection�N���X�̃��\�b�h
//    public String getContentType()
//    �@�@�\�Fcontent-type�w�b�_�̒l���擾�B
//    public int getContentLength()
//    �@�@�\�Fcontent-length�w�b�_�̒l���擾�B
//    public long getDate()
//    �@�@�\�Fdate�w�b�_�̒l���擾�B  
//            �߂�l�̓O���j�b�W�W���� 1970�N1��1������N�Z�����~���b��
//    public long getLastModified()
//    �@�@�\�Flast-modified�w�b�_�̒l���擾�B
//            �߂�l�̓O���j�b�W�W���� 1970�N1��1������N�Z�����~���b��
//
//  ��Date�N���X�̃R���X�g���N�^
//�@�@public Date(long t) 
//      �@�\�F1970�N1��1������o�߂����~���bt�ilong�^�Ŋi�[�j����t������
//            ������ɕϊ�����B
// 
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;
import java.util.Date;

class j713 {
  public static void main(String args[]) {

    try { 
      // URL�N���X�̃I�u�W�F�N�g���擾�B
      URL url = new URL(args[0]); // args[0]�́AURL��\���B
      // URLConnection�N���X�̃I�u�W�F�N�g���擾�B
      URLConnection urlc = url.openConnection();

      // �e��w�b�_�����擾�B
      System.out.println("content-type�w�b�_  :" + urlc.getContentType());
      System.out.println("content-length�w�b�_:" + urlc.getContentLength());
      System.out.println("date�w�b�_          :" + (new Date(urlc.getDate())));
      System.out.println("last-modified�w�b�_ :" +
                         (new Date(urlc.getLastModified())));

    } catch ( IOException e ) {
      System.out.println(e);
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j713.java
% java j713 http://www.ibaraki.ac.jp/index.html
content-type�w�b�_  :text/html; charset=none
content-length�w�b�_:919
date�w�b�_          :Mon Jul 12 16:02:20 JST 2004
last-modified�w�b�_ :Thu Apr 01 10:15:51 JST 2004
</pre>

</body>
</html>
*/
