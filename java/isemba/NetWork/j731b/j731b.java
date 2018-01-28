<!--====================================================================-->
<!-- << j731b.htm >>                                                    -->
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
// << j731b.java >>
//
//  �l�b�g���[�N�i�R�j�F�T�[�o
//
//  ���T�[�o�̋@�\
//�@�@(1) �N���C�A���g����̐ڑ��B
//    (2) �N���C�A���g����P�s���̃f�[�^����M�B
//    (3) �N���C�A���g�ɂP�s���̃f�[�^�𑗐M�B
//    (4) (2),(3)���J��Ԃ��B
//
//  �@��x�ɑΉ��ł���N���C�A���g�͂P�B�������ɐڑ����Ă����N���C�A���g�́A
//�@�@�҂��s��ɓ������B�҂��s�񂪖��܂��Ă���ꍇ�A�ڑ��͋��ۂ����B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j731b {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C������|�[�g�ԍ�args[0]���擾����B
      int port = Integer.parseInt(args[0]);
      // �҂��s��̍ő����ݒ�B
      int n = 5; 

      // (�菇�P)�|�[�g�ԍ��Ƒ҂��s��̍ő�����w�肵�ăT�[�o�\�P�b�g���쐬�B
      ServerSocket ss = new ServerSocket(port, n);

      while( true ) {
        System.out.println("�T�[�o�ҋ@��");       

        // (�菇�Q)�N���C�A���g����̐ڑ���҂B�ڑ���A�V���ȃ\�P�b�g���쐬�B
        Socket cs = ss.accept();                                               

        // �N���C�A���g�̃z�X�g����\���B                                      
        String chost = cs.getInetAddress().getHostName();                       
        System.out.println("�ڑ��N���C�A���g(" + chost + ")");           

        BufferedReader br =                                                    
               new BufferedReader(new InputStreamReader(cs.getInputStream(),
                                                         "JISAutoDetect")); 

        // (�菇�R)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
        PrintWriter pw =                                                      
               new PrintWriter(new OutputStreamWriter(cs.getOutputStream()));  

        // (�菇�S)�N���C�A���g�Ƃ̑���M�B
        String line;                                                           
        while( (line = br.readLine()) != null ) {                              
          System.out.println(line); // �W���o��(���)�ɕ\���B      
          pw.println(line);         // �N���C�A���g�ɑ��M�B           
          pw.flush();               // �����I�ɏo�́B                    
        }                                                                      

        // (�菇�T)���o�̓X�g���[�������B
        br.close(); pw.close();

        // (�菇�U)�\�P�b�g�����B
        cs.close(); 
      }

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
}
</pre>

<font size=5 color=blue>���s����</font>
<br><br>

<font size=3 color=blue>�m�T�[�o���n</font>

<pre>
% javac j731b.java

% java j731b 3333
�T�[�o�ҋ@��
�ڑ��N���C�A���g(localhost)
abc
���{��
end
�T�[�o�ҋ@��
</pre>

<font size=3 color=blue>�m�N���C�A���g���n</font>

<pre>
% java j723 localhost 3333
Reader�X���b�h�J�n
Writer�X���b�h�J�n
abc
abc
���{��
���{��
end
end
Reader�X���b�h�AWriter�X���b�h�I��
</pre>

</body>
</html>
