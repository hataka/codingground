<!--====================================================================-->
<!-- << j732a.htm >>                                                    -->
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
// << j732a.java >>
//
//  �l�b�g���[�N�i�R�j�F�}���`�X���b�h�T�[�o
//
//�@�@�T�[�o�̓N���C�A���g����̃��b�Z�[�W�����̂܂܃N���C�A���g�ɕԂ��B
//    �e�T�[�o�̓N���C�A���g����̐ڑ����󂯂�Ǝq�T�[�o���쐬��������C���A
//�@�@���̃N���C�A���g����̐ڑ���҂B
//�@�@���������āA��x�ɕ����̃N���C�A���g�ɑΉ��ł���B
//
//�@��Thread�N���X�̃��\�b�h�@
//    public final void setName(String name)
//�@�@�@�@�\�F�X���b�h�̖��O��name�ɐݒ肷��B
//    public final String getName()
//�@�@�@�@�\�F�X���b�h�̖��O���擾����B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

// �e�T�[�o�̒�`�B
class Server extends Thread {

  ServerSocket ss;
  int num = 0; // �q�T�[�o�����ʂ��邽�߂̔ԍ��B

  Server(int port) { // �R���X�g���N�^�B
    try {
      ss = new ServerSocket(port);
    } catch( Exception e ) {
      System.out.println(e);
    }
  }

  public void run() {
    try {
      while( true ) {
        // �N���C�A���g����̐ڑ���҂B�ڑ������ƐV���Ƀ\�P�b�g���쐬����B
        Socket cs = ss.accept();

        // �q�T�[�o�̍쐬�B
        ChildServer childserver = new ChildServer(cs);
        num++;
        String t = "�q�T�[�o(" + num + ")";
        childserver.setName(t);

        // �q�T�[�o�N���B
        childserver.start();
        System.out.println(t + "�N��");     
      }
    } catch( Exception e ) { 
      System.out.println("Server:"+e);
    }
  }
}

// �q�T�[�o�̒�`�B
class ChildServer extends Thread {

  Socket s;
  BufferedReader br;
  PrintWriter pw;

  ChildServer(Socket s) { // �R���X�g���N�^�B
    this.s = s;
    try { // �N���C�A���g�Ƃ̓��́E�o�̓X�g���[�����\�P�b�g����쐬�B
      br = new BufferedReader(new InputStreamReader(s.getInputStream(),
                                                    "JISAutoDetect"));
      pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
    } catch( Exception e ) {
      System.out.println(e);
    }
  }

  public void run() {
    String line;
    try { 
      // �N���C�A���g�Ƃ̑���M�B������end�ŏI���B
      String t = this.getName();
      while( (line = br.readLine()) != null ) {
        System.out.println(t + line);
        pw.println(line); pw.flush();
        if( line.equals("end") ) { break; }
      }
      System.out.println(t + "�I��");

      // ���o�̓X�g���[�������B
      br.close(); pw.close();
      // �\�P�b�g�����B
      s.close();

    } catch (Exception e ) {
      System.out.println("ChildServer:" + e);
    }
  }
}

public class j732a {
  public static void main(String args[]) {

    // �R�}���h���C������|�[�g�ԍ�args[0]���擾����B 
    int port = Integer.parseInt(args[0]);

    // �}���`�X���b�h�T�[�o�̍쐬�B
    Server server = new Server(port);

    // �}���`�X���b�h�T�[�o�̋N���B
    server.start();
    System.out.println("�}���`�X���b�h�T�[�o�N��");
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
�q�T�[�o(2)bbb
�q�T�[�o(2)end
�q�T�[�o(2)�I��
�q�T�[�o(3)�N��
�q�T�[�o(3)ccc
�q�T�[�o(3)end
�q�T�[�o(3)�I��
</pre>

<font size=3 color=blue>�m�N���C�A���g���n</font>

<pre>
% java j723 localhost 3333
Reader�X���b�h�J�n
Writer�X���b�h�J�n
aaa
aaa
end
end
Reader�X���b�h�AWriter�X���b�h�I��

% java j723 localhost 3333
Reader�X���b�h�J�n
Writer�X���b�h�J�n
bbb
bbb
end
end
Reader�X���b�h�AWriter�X���b�h�I��

% java j723 localhost 3333
Reader�X���b�h�J�n
Writer�X���b�h�J�n
ccc
ccc
end
end
Reader�X���b�h�AWriter�X���b�h�I��
</pre>

</body>
</html>
