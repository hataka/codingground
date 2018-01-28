// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j714.java 
 * created : Time-stamp: <09/07/03(��) 10:30:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j714.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j714.java >>
//
//  �l�b�g���[�N�i�P�j�FURLConnection�N���X���g�����t�@�C���̃_�E�����[�h
//
//�@�@URL�Ŏw�肵���t�@�C�����_�E�����[�h���A��ʂɕ\������B
//
//  �@�z�[���y�[�W�Ȃǂ̃t�@�C�����Ɋ������܂܂�Ă���ƁA�����ɂ�JIS�AEUC�A
//�@�@�V�t�gJIS�̂����ꂩ�̃R�[�h���g���Ă���̂ŁA�ǂݍ��ނƂ��ɂǂ̃R�[�h
//�@�@�ł��邩���f����K�v������B����Ă���ƕ��������̌����ɂȂ�B
//�@�@JISAutoDetect���w�肵�Ă����ƕ����R�[�h�������I�ɔ��ʂ����B
//�@�@�ǂݍ��܂ꂽ������Unicode�Ƃ��������R�[�h(�P����16�r�b�g)�ɕϊ������B
//
//�@��URLConnection�N���X�̃��\�b�h
//    public InputStream getInputStream() throws IOException
//    �@�@�\�F�ڑ�����̓��͂��󂯎��o�C�g���̓X�g���[��InputStream���擾����B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j714 {
  public static void main(String args[]) {

    try { 
      // URL�N���X�̃I�u�W�F�N�g���쐬�B
      URL url = new URL(args[0]); // args[0]�́AURL��\���B

      // URLConnection�N���X�̃I�u�W�F�N�g���쐬�B
      URLConnection urlc = url.openConnection();

      // InputStream�N���X�̃I�u�W�F�N�g���쐬�B
      InputStream is = urlc.getInputStream();

      // �o�C�g���̓X�g���[���𕶎����̓X�g���[���ɕϊ�����B
      // �����G���R�[�f�B���O�́AJISAutoDetect���w�肷��ƁA�����I�ɔ��f�����B
      InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");

      // �������͂��s�P�ʂœ��͂ł���悤�ɂ���B
      BufferedReader br = new BufferedReader(isr); 

      // �P�s�Âǂݍ��݁A��ʂɏo�͂���B
      String line;
      while( (line  = br.readLine()) != null ) {
        System.out.println(line);
      }

      // ���̓X�g���[�������B
      br.close();
      isr.close();
      is.close(); 

    } catch( Exception e ) {
      System.out.println(e); 
    } 
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j714.java
% java j714 http://www.ibaraki.ac.jp/

  Web�y�[�W(http://www.ibaraki.ac.jp/index.html)���_�E�����[�h�����B
</pre>

</body>
</html>
*/
