// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j721.java 
 * created : Time-stamp: <09/07/03(��) 12:58:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j721.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j721.java >>
//
//  �l�b�g���[�N�i�Q�j�F�\�P�b�g�i��b�j
//
//�@�@�\�P�b�g���g���ƁA���[�J���z�X�g(�茳�̃R���s���[�^)�ƃ����[�g�z�X�g
//�@�@(�l�b�g���[�N��̑��̃R���s���[�^)�̊ԂŁA�f�[�^�������ł���悤�ɂȂ�B
//    ���Ȃ킿�A�Q�̃R���s���[�^�́A�\�P�b�g����ĒʐM���s���B
//
//�@�@�\�P�b�g���쐬����ɂ́A�����[�g�z�X�g���A�����[�g�z�X�g���̃|�[�g�ԍ��A
//�@�@���[�J���z�X�g���A���[�J���z�X�g���̃|�[�g�ԍ����K�v�ł���B
//
//�@�@���[�J���z�X�g���ł́A�����[�g�z�X�g�̃z�X�g���ƃ|�[�g�ԍ����w�肵��
//�@�@�\�P�b�g���쐬����B���[�J���z�X�g���Ń��[�J���z�X�g���͎����A�|�[�g�ԍ���
//�@�@�\�P�b�g���쐬����s�x�A�����I�Ɋ��蓖�Ă���B
//
//  ��java.net.Socket�N���X
//    �R���s���[�^�ԂŁA�ʐM������Ƃ��Ɏg�p����\�P�b�g�����������N���X�B
//
//  ��Socket�N���X�̃R���X�g���N�^
//    public Socket(String host, int port) throws UnknownHostException,
//                                                IOException
//      �@�\�F�\�P�b�g���쐬���A�w�肳�ꂽ�z�X�ghost��̎w�肳�ꂽ�|�[�g�ԍ�port
//�@�@�@�@�@�@�ɐڑ�����B
//
//  ��Socket�N���X�̃��\�b�h
//    public InetAddress getInetAddress()
//      �@�\�F�\�P�b�g�̃����[�g�z�X�g���A�h���X���擾����B
//    public InetAddress getLocalAddress()
//      �@�\�F�\�P�b�g�̃��[�J���z�X�g���A�h���X���擾����B
//�@�@public int getPort()
//      �@�\�F�\�P�b�g�̃����[�g�z�X�g���|�[�g�ԍ����擾����B
//�@�@public int getLocalPort()
//      �@�\�F�\�P�b�g�̃��[�J���z�X�g���|�[�g�ԍ����擾����B
//�@�@public void close() throws IOException
//      �@�\�F�\�P�b�g�����B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j721 {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C������A�����[�g�z�X�g��(args[0])�A�|�[�g�ԍ�(args[1])��
      // �擾����B
      String host = args[0];
      int port = Integer.parseInt(args[1]);

      // �\�P�b�g�̍쐬�B
      Socket s = new Socket(host, port); 

      // �����[�g�z�X�g���A�h���X�̎擾�B 
      InetAddress rhost = s.getInetAddress();
      System.out.println("�����[�g�z�X�g�F" + rhost);
      // �����[�g�z�X�g���|�[�g�ԍ��̎擾�B 
      int rport = s.getPort();
      System.out.println("�����[�g�z�X�g�̃|�[�g�ԍ��F" + rport);

      // ���[�J���z�X�g���A�h���X�̎擾�B
      InetAddress lhost = s.getLocalAddress();
      System.out.println("���[�J���z�X�g�F" + lhost);
      // ���[�J���z�X�g���|�[�g�ԍ��̎擾�B
      int lport = s.getLocalPort();
      System.out.println("���[�J���z�X�g�̃|�[�g�ԍ��F" + lport);

      // �\�P�b�g�����B
      s.close();

    } catch( UnknownHostException e ) {
      System.out.println("�����[�g�z�X�g��������܂���");
    } catch( Exception e ) {
      System.out.println(e);
    }
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j721.java

% java j721 jubilo.cis.ibaraki.ac.jp 80
�����[�g�z�X�g�Fjubilo.cis.ibaraki.ac.jp/157.80.82.35
�����[�g�z�X�g�̃|�[�g�ԍ��F80
���[�J���z�X�g�F/157.80.82.52
���[�J���z�X�g�̃|�[�g�ԍ��F1039

% java j721 jubilo.cis.ibaraki.ac.jp 80
�����[�g�z�X�g�Fjubilo.cis.ibaraki.ac.jp/157.80.82.35
�����[�g�z�X�g�̃|�[�g�ԍ��F80
���[�J���z�X�g�F/157.80.82.52
���[�J���z�X�g�̃|�[�g�ԍ��F1040

% java j721 jubilo.cis.ibaraki.ac.jp 81
java.net.ConnectException: Connection refused: connect

% java j721 antlers.cis.ibaraki.ac.jp 80
java.net.ConnectException: Connection timed out: connect
</pre>

</body>
</html>
*/
