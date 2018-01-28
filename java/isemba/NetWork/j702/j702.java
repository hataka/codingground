// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j702.java 
 * created : Time-stamp: <09/07/03(��) 08:43:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j702.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j702.java >>
//
//  �l�b�g���[�N�i�O�j�F��b�i�����[�g�z�X�g�̃z�X�g���Ƃh�o�A�h���X�j
//
//�@�@�����[�g�z�X�g���i�܂��͂h�o�A�h���X�j�̓R�}���h���C��������͂��A
//�@�@�h�o�A�h���X�i�܂��̓����[�g�z�X�g���j���擾����B
//
//�@��InetAddress�N���X�̃��\�b�h
//    static InetAddress getByName(String host)
//      �@�\�F�z�X�g��host�̃I�u�W�F�N�g���擾����B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;

class j702 {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C�����烊���[�g�z�X�g��(args[0])��ǂݍ��ݐڑ�����B
      InetAddress a = InetAddress.getByName(args[0]);

      // �����[�g�z�X�g�̃z�X�g����\���B
      System.out.println("�z�X�g���@�F"+a.getHostName());

      // �����[�g�z�X�g��IP�A�h���X��\���B
      System.out.println("IP�A�h���X�F"+a.getHostAddress());

    } catch ( UnknownHostException e ) {
      System.out.println(e);
    } 
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j702.java
% java j702 hcs.ipc.ibaraki.ac.jp
�z�X�g���@�Fhcs.ipc.ibaraki.ac.jp
IP�A�h���X�F157.80.75.51

% java j702 mcs.ipc.ibaraki.ac.jp
�z�X�g���@�Fmcs.ipc.ibaraki.ac.jp
IP�A�h���X�F157.80.76.51

% java j702 127.0.0.1
�z�X�g���@�Flocalhost
IP�A�h���X�F127.0.0.1

% java j702 157.80.82.35
�z�X�g���@�Fjubilo.cis.ibaraki.ac.jp
IP�A�h���X�F157.80.82.35
</pre>

</body>
</html>


*/
