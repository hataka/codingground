<!--====================================================================-->
<!-- << j722d.htm >>                                                    -->
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
// << j722d.java >>
//
//  �l�b�g���[�N�i�Q�j�F���������삵�Ȃ��N���C�A���g
//
//�@�@�v�����v�g��\�����R�}���h���͂�҂B
//�@�@�R�}���h�̓��͌�A�T�[�o�ɃR�}���h�𑗐M���A�T�[�o����̃f�[�^����M����B
//�@�@���̓�����J��Ԃ��B
//
//�@�@���_�F�T�[�o�Ƃ̐ڑ����s���A���̌�ɃT�[�o�Ƃ̑���M�����݂ɍs����B
//�@�@�@�@�@�@�������A�L�[�{�[�h������͂�҂ԁA�T�[�o����̎�M�͂ł��Ȃ��B
//�@�@�@�@�@�@���Ȃ킿�A�s�K���ɑ���M���s����ꍇ�A�Ή��ł��Ȃ��Ȃ�B
//�@�@�@�@�@�@
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j722d {
  public static void main(String args[]) {

    try { 
      // �T�[�o���ƃ|�[�g�ԍ����擾����B
      String server = args[0];
      int port = Integer.parseInt(args[1]);

      // (�菇�P)�T�[�o���ƃ|�[�g�ԍ����w�肵�\�P�b�g���쐬�B
      Socket s = new Socket(server, port); 

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
      String line;
      while( true ) {
        System.out.print("> ");      // �v�����v�g�̕\���B
        line = kb.readLine();        // �L�[�{�[�h����P�s�ǂݍ��ށB��s�ŏI���B
        if( line.length() == 0 ) { break; }                        
        pw.println(line);            // �T�[�o�ɑ��M�B         
        pw.flush();                  // �����I�ɏo�͂��s���B       
        while( (line = br.readLine()) != null ) {
          System.out.println(line);  // �W���o��(���)�ɕ\���B        
        }
      }

      // (�菇�S)���o�̓X�g���[�������B
      // �\�P�b�g�����B
      brs.close(); isr.close(); is.close();
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

</body>
</html>
