<!--====================================================================-->
<!-- << j723.htm >>                                                     -->
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
// << j723.java >>
//
//  �l�b�g���[�N�i�Q�j�F�}���`�X���b�h�N���C�A���g
//
//�@�@�L�[�{�[�h����̓��͂���������X���b�h(Writer)�ƃT�[�o����̎�M����ʂ�
//�@�@�o�͂���X���b�h(Reader)�����B
//    ���͂Əo�͂�ʂ̃X���b�h�ōs�����߁A�T�[�o����f�[�^���ǂ̂悤��
//�@�@�^�C�~���O�ő����Ă��Ă��Ή��ł���B
//    �@�@�@�@
//  ��Thread�N���X�̃��\�b�h
//�@�@public final void setPriority(int p)
//      �@�\�F�D�揇�ʂ�p�ɕύX����B�lp���傫���قǗD�揇�ʂ������B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

// �X���b�h(Reader)�̒�`�B
class Reader extends Thread {

  Socket s;
  BufferedReader br; 

  Reader(Socket s) { // �R���X�g���N�^�B
    this.s = s;
    try { // �\�P�b�g�p�̓��̓X�g���[����ݒ�B 
      br = new BufferedReader(new InputStreamReader(s.getInputStream(),
                                                    "JISAutoDetect"));
    } catch( Exception e ) {
      System.out.println(e); 
    }
  }

  public void run() {
    System.out.println("Reader�X���b�h�J�n");
    try {
      String line;
      while( br != null ) { // ���̓X�g���[������P�s�ǂݍ��ݕ\������B
        line = br.readLine(); 
        if( line != null ) { 
          System.out.println(line); 
          if( line.equals("end") ) { br = null; }
        }
      } 
    } catch( Exception e ) { 
      System.out.println("Reader:" + e); 
    }
  }
}

// �X���b�h(Writer)�̒�`�B
class Writer extends Thread {

  Socket s;
  BufferedReader kb;
  PrintWriter pw;

  Writer(Socket s) { // �R���X�g���N�^�B
    this.s = s;
    try {
      // �\�P�b�g�p�̏o�̓X�g���[����ݒ�B 
      pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
      // �L�[�{�[�h����̓��̓X�g���[����ݒ�B
      kb = new BufferedReader(new InputStreamReader(System.in));
    } catch( Exception e ) { 
      System.out.println(e); 
    }
  }

  public void run() {
    System.out.println("Writer�X���b�h�J�n");
    try {
      String line;
      while( pw != null ) { // �L�[�{�[�h����P�s�ǂݍ��ށBend�ŏI���B
        line = kb.readLine(); 
        pw.println(line);
        pw.flush();
        if( line.equals("end") ) { pw = null; }
      } 
    } catch( Exception e ) {
      System.out.println("Writer:" + e); 
    }
  }
}

class j723 {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C������A�T�[�o��args[0]�A�|�[�g�ԍ�args[1]���擾����B
      String server = args[0];
      int port = Integer.parseInt(args[1]);

      // �\�P�b�g�̍쐬�B
      Socket s = new Socket(server, port); 

      // �X���b�h�̍쐬�B
      Thread reader = new Reader(s); 
      Thread writer = new Writer(s);

      // �D��x�̕ύX�Breader�ɍ����D��x��^����B 
      reader.setPriority(6); 
      writer.setPriority(5);

      // �X���b�h�̋N���B
      reader.start(); 
      writer.start();

      // Writer�X���b�h�AReader�X���b�h�̏I����҂B
      writer.join(); 
      reader.join();
      System.out.println("Reader�X���b�h�AWriter�X���b�h�I��");

      // �\�P�b�g�����B
      s.close();        

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j723.java

% java j723 jubilo.cis.ibaraki.ac.jp 7
Reader�X���b�h�J�n
Writer�X���b�h�J�n
abc
abc
���{��
���{��
end
Reader�X���b�h�AWriter�X���b�h�I��

% java j723 jubilo.cis.ibaraki.ac.jp 13
Reader�X���b�h�J�n
Thu Jul 15 12:22:16 2004
Writer�X���b�h�J�n
end
Reader�X���b�h�AWriter�X���b�h�I��
</pre>

</body>
</html>
