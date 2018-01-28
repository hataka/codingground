// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j722a.java 
 * created : Time-stamp: <09/07/03(��) 13:07:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j722a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j722a.java >>
//
//  �l�b�g���[�N�i�Q�j�F�N���C�A���g
//
//  ���N���C�A���g�̋@�\
//�@�@(1) �T�[�o�ɐڑ��B
//    (2) �T�[�o����P�s���̃f�[�^����M�B
//    (3) �I���B
//
//�@�@daytime�v���g�R�����Ή����Adaytime�T�[�o�ɐڑ�����������M����B
//
//�@���N���C�A���g�̏�����
//
//�@�@class �N���X�� {
//      public static void main(String args[]) {
//        try {
//          (�菇�P)�T�[�o���ƃ|�[�g�ԍ����w�肵�\�P�b�g���쐬�B
//�@�@�@�@  (�菇�Q)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
//�@�@�@�@  (�菇�R)�T�[�o�Ƃ̑���M�B
//�@�@�@�@  (�菇�S)���o�̓X�g���[�������B
//�@�@�@�@  (�菇�T)�\�P�b�g�����B
//        } catch ( Exception e ) {
//          ��O�������b�Z�[�W
//        }
//      }
//    }
//
//  ��Socket�N���X�̃��\�b�h
//    public InputStream getInputStream() throws IOException
//      �@�\�F���̃\�P�b�g�̓��̓X�g���[�����擾����B 
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j722a {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C������A�T�[�o��(args[0])���擾����B
      // daytime�T�[�o�̃|�[�g�ԍ���13�ƌ��܂��Ă���B
      String server = args[0];
      int port = 13;

      // (�菇�P)�T�[�o���ƃ|�[�g�ԍ����w�肵�\�P�b�g���쐬�B
      Socket s = new Socket(server, port); 

      // (�菇�Q)�\�P�b�g�ɓ��̓X�g���[����ݒ�B
      InputStream is = s.getInputStream();
      InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");
      BufferedReader br = new BufferedReader(isr);

      // (�菇�R)�T�[�o����̎�M�B
      String line = br.readLine(); // �T�[�o����P�s����M�B
      System.out.println("�T�[�o(" + server + ")�̌��ݎ����F" + line);

      // (�菇�S)���o�̓X�g���[�������B
      br.close(); isr.close(); is.close();

      // (�菇�T)�\�P�b�g�����B
      s.close();

    } catch( Exception e ) {
      System.out.println(e);
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j722a.java

% java j722a jubilo.cis.ibaraki.ac.jp
�T�[�o(jubilo.cis.ibaraki.ac.jp)�̌��ݎ����FThu Jul 15 10:36:14 2004

% java j722a sava.cis.ibaraki.ac.jp
java.net.ConnectException: Connection refused: connect
</pre>

</body>
</html>
*/
