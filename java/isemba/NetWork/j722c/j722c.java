<!--====================================================================-->
<!-- << j722c.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVA�v���O���~���O�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVA�v���O���~���O</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
// << j722c.java >>
//
//  �l�b�g���[�N�i�Q�j�F�N���C�A���g
//
//  ���N���C�A���g�̋@�\
//�@�@(1) �T�[�o�ɐڑ��B
//    (2) �T�[�o�ɂP�s���̃f�[�^�𑗐M�B
//    (3) �T�[�o���畡���s���̃f�[�^����M�B
//    (4) �I���B
//
//�@�@http�v���g�R�����Ή�����B
//�@�@Web�T�[�o�ɐڑ����A�L�[�{�[�h����w�肵��Web�y�[�W����M�E��ʂɕ\������B
//
//    �R�}���h(GET /)�𑗐M����ƁAWeb�T�[�o�̃z�[���y�[�W�������Ă���B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j722c {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C������A�T�[�o��(args[0])���擾����B
      // �|�[�g�ԍ���80�ƌ��܂��Ă���B
      String server = args[0];
      int port = 80;

      // (�菇�P)�T�[�o���ƃ|�[�g�ԍ����w�肵�\�P�b�g���쐬�B
      Socket s = new Socket(server,port);
 
      // (�菇�Q)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
      InputStream is = s.getInputStream();
      InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");
      BufferedReader br = new BufferedReader(isr);

      // (�菇�Q)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
      OutputStream os = s.getOutputStream();
      PrintWriter pw = new PrintWriter(os);

      // �L�[�{�[�h�p�̓��̓X�g���[����ݒ�B
      BufferedReader kb =
             new BufferedReader(new InputStreamReader(System.in));

      // (�菇�R)�T�[�o�Ƃ̑���M�B
      System.out.print("> ");      // �v�����v�g�̕\���B                    
      String line = kb.readLine(); // �L�[�{�[�h����P�s�ǂݍ��ށB   
      pw.println(line);            // �T�[�o�ɑ��M�B                 
      pw.flush();                  // �����I�ɏo�͂��s���B           
      while( line != null ) {                                        
        line = br.readLine();      // �T�[�o����P�s����M�B          
        System.out.println(line);  // �W���o��(���)�ɕ\���B            
      }                                                              

      // (�菇�S)���o�̓X�g���[�������B
      br.close(); isr.close(); is.close();
      pw.close(); os.close(); 
      kb.close();

      // (�菇�T)�\�P�b�g�����B
      s.close();

    } catch( Exception e ) {
      System.out.println(e);
    }
  }
}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j722c.java

% java j722c jubilo.cis.ibaraki.ac.jp
> GET /

Web�T�[�o(jubilo.cis.ibaraki.ac.jp)����Web�y�[�W�������Ă���B
</pre>

</body>
</html>
