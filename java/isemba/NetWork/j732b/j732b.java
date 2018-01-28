<!--====================================================================-->
<!-- << j732b.htm >>                                                    -->
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
// << j732b.java >>
//
//  �l�b�g���[�N�i�R�j�F�}���`�X���b�h�T�[�o����
//
//�@�@�}���`�X���b�h�T�[�o�ɑ����̃N���C�A���g����ڑ������s�������̗l�q������B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

class j732b {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C������A�T�[�o��args[0]�A�|�[�g�ԍ�args[1]�A
      // �ڑ���args[2]���擾����B
      String server = args[0];
      int port = Integer.parseInt(args[1]);
      int n = Integer.parseInt(args[2]);

      for( int i=1; i<=n; i++ ) {
        // (�菇�P)�T�[�o���ƃ|�[�g�ԍ����w�肵�\�P�b�g���쐬�B
        Socket s = new Socket(server,port); 

        // (�菇�Q)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is,"JISAutoDetect");
        BufferedReader br = new BufferedReader(isr);

        // (�菇�Q)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os);

        //(�菇�R)�T�[�o�Ƃ̑���M�B
        pw.println("aaa");           // �T�[�o�ɑ��M�B               
        pw.flush();                  // �����I�ɏo�͂��s���B         
        String line = br.readLine(); // �T�[�o����P�s����M�B       
        System.out.println(line);    // �W���o��(���)�ɕ\���B       
        pw.println("end");           // �T�[�o�ɑ��M�B               
        pw.flush();                  // �����I�ɏo�͂��s���B         

        // (�菇�S)���o�̓X�g���[�������B
        br.close(); isr.close(); is.close();
        pw.close(); os.close(); 

        // (�菇�T)�\�P�b�g�����B
        s.close();
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
% java j732a 3333
�}���`�X���b�h�T�[�o�N��
�q�T�[�o(1)�N��
�q�T�[�o(1)aaa
�q�T�[�o(1)end
�q�T�[�o(1)�I��
�q�T�[�o(2)�N��
�q�T�[�o(2)aaa
�q�T�[�o(3)�N��
�q�T�[�o(2)end
�q�T�[�o(2)�I��
�q�T�[�o(3)aaa
�q�T�[�o(3)end
�q�T�[�o(3)�I��
�q�T�[�o(4)�N��
�q�T�[�o(4)aaa
�q�T�[�o(5)�N��
�q�T�[�o(4)end
�q�T�[�o(4)�I��
�q�T�[�o(5)aaa
�q�T�[�o(5)end
�q�T�[�o(5)�I��
�q�T�[�o(6)�N��
�q�T�[�o(6)aaa
�q�T�[�o(6)end
�q�T�[�o(6)�I��
</pre>

<font size=3 color=blue>�m�N���C�A���g���n</font>

<pre>
% javac j732b.java

% java j732b localhost 3333 6
aaa
aaa
aaa
aaa
aaa
aaa
</pre>

</body>
</html>
