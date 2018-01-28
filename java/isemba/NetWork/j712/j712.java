// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j712.java 
 * created : Time-stamp: <09/07/03(��) 09:03:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j712.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j712.java >>
//
//  �l�b�g���[�N�i�P�j�FURL�N���X���g�����t�@�C���̃_�E�����[�h
//
//�@�@URL�Ŏw�肵���t�@�C�����_�E�����[�h���A��ʂɕ\������B
//
//�@   (����)URL�N���X�ł́AURL�̓��e�̂ݎ擾�ł���B�w�b�_(�t�@�C���̎�ނ�
//�@�@�@�@�@�o�C�g���Ȃ�)���擾����ɂ́AURLConnection�N���X���g���B
//
//    �z�[���y�[�W�Ȃǂ̃t�@�C�����Ɋ������܂܂�Ă���ƁA�����ɂ�JIS�AEUC�A
//�@�@�V�t�gJIS�̂����ꂩ�̃R�[�h���g���Ă���̂ŁA�ǂݍ��ނƂ��ɂǂ̃R�[�h
//�@�@�ł��邩���f����K�v������B����Ă���ƕ��������̌����ɂȂ�B
//�@�@JISAutoDetect���w�肵�Ă����ƕ����R�[�h�������I�ɔ��ʂ����B
//�@�@�ǂݍ��܂ꂽ������Unicode�Ƃ��������R�[�h(�P����16�r�b�g)�ɕϊ������B
//
//�@��URL�N���X�̃��\�b�h
//    public final InputStream openStream() throws IOException
//      �@�\�FURL�ŎQ�Ƃ�����񎑌��ɐڑ����A�o�C�g���̓X�g���[��InputStream
//�@�@�@�@�@�@��Ԃ��B
//
//�@��InputStreamReader�N���X
//�@�@���̃N���X���g���āA�o�C�g�X�g���[�����當���X�g���[���ւ̕ϊ����ł���B
//�@�@�o�C�g�f�[�^��ǂݍ��݁A�w�肳�ꂽcharset���g�p���ĕ����ɕϊ�����B
//
//�@��InputStreamReader�N���X�̃R���X�g���N�^
//�@  public InputStreamReader(InputStream is, Charset cs)
//�@�@�@�@�\�F�^����ꂽ�����G���R�[�f�B���Ocs���g���āAInputStreamReader��
//�@�@�@�@�@�@�쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j712 {
  public static void main(String args[]) {

    try { 
      URL url = new URL(args[0]); // args[0]�́AURL��\���B
 //     URL url = new URL("http://www.ibaraki.ac.jp/"); // args[0]�́AURL��\���B
      InputStream is = url.openStream();

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
      is.close(); 
      isr.close(); 
      br.close();

    } catch( Exception e ) {
      System.out.println(e); 
    } 
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j712.java
% java j712 http://www.ibaraki.ac.jp/

  Web�y�[�W(http://www.ibaraki.ac.jp/index.html)���_�E�����[�h�����B
</pre>

</body>
</html>
*/
