<!--====================================================================-->
<!-- << j731a.htm >>                                                    -->
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
// << j731a.java >>
//
//  �l�b�g���[�N�i�R�j�F�T�[�o
//
//  ���T�[�o�̋@�\
//�@�@(1) �N���C�A���g����̐ڑ��B
//    (2) �N���C�A���g�ɂP�s���̃f�[�^�𑗐M�B
//    (3) �N���C�A���g�Ƃ̐ڑ���؂�B
//
//�@�@�N���C�A���g����̐ڑ�������ƁA�ڑ����ƌ��ݎ�����Ԃ��T�[�o�B
//
//  �@��x�ɑΉ��ł���N���C�A���g�͂P�B�������ɐڑ����Ă����N���C�A���g�́A
//�@�@�҂��s��ɓ������B�҂��s�񂪖��܂��Ă���ꍇ�A�ڑ��͋��ۂ����B
//
//�@���T�[�o�̏�����
//
//�@�@class �N���X�� {
//      public static void main(String args[]) {
//        try {
//          (�菇�P)�|�[�g�ԍ��Ƒ҂��s��̍ő�����w�肵�ăT�[�o�\�P�b�g��
//�@�@�@�@�@�@�@�@�@�쐬�B
//          while( true ) {
//            System.out.println("�T�[�o�ҋ@��");  
//�@�@�@�@    (�菇�Q)�N���C�A���g����̐ڑ���҂B�ڑ���A�V���ȃ\�P�b�g���쐬�B
//�@�@�@�@�@  (�菇�R)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
//�@�@�@�@  �@(�菇�S)�N���C�A���g�Ƃ̑���M�B
//�@�@�@�@�@  (�菇�T)���o�̓X�g���[�������B
//�@�@�@�@�@  (�菇�U)�\�P�b�g�����B
//          }
//        } catch ( Exception e ) {
//          ��O�������b�Z�[�W
//        }
//      }
//    }
//
//  ��ServerSocket�N���X�̃R���X�g���N�^
//�@�@public ServerSocket(int port, int n) throws IOException
//      �@�\�F�|�[�g�ԍ�port�Ƒ҂��s��ɓ����N���C�A���g�̍ő��n������
//    �@�@�@�@�T�[�o�\�P�b�g���쐬����B
//
//  ��ServerSocket�N���X�̃��\�b�h
//    public Socket accept() throws IOException
//      �@�\�F�N���C�A���g����̐ڑ�������܂ő҂������A�󂯕t����ƃ\�P�b�g��
//�@�@�@�@�@�@�Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;
import java.util.*;

class j731a {
  public static void main(String args[]) {

    try { 
      // �R�}���h���C������|�[�g�ԍ�args[0]���擾����B
      int port = Integer.parseInt(args[0]); 
      int n = 5; 

      // (�菇�P)�|�[�g�ԍ��Ƒ҂��s��̍ő�����w�肵�ăT�[�o�\�P�b�g���쐬�B
      ServerSocket ss = new ServerSocket(port,n);

      int num = 0; // �ڑ����̏����ݒ�B

      while( true ) {
        System.out.println("�T�[�o�ҋ@��");  

        // (�菇�Q)�N���C�A���g����̐ڑ���҂��B�ڑ���A�V���ȃ\�P�b�g���쐬�B
        Socket cs = ss.accept();             

        // �ڑ��ԍ���\���B     
        num ++; System.out.print(num+"�Ԗڂ̐ڑ��@");  
        // �N���C�A���g�̃z�X�g���Ɛڑ�������\���B     
        String host = cs.getInetAddress().getHostName();                       
        System.out.print("�N���C�A���g(" + host + ")�@");           
        Date time = new Date();
        System.out.println("�����F" + time);

        // (�菇�R)�\�P�b�g�ɓ��o�̓X�g���[����ݒ�B
        PrintWriter pw =                                                      
               new PrintWriter(new OutputStreamWriter(cs.getOutputStream()));  

        // (�菇�S)�N���C�A���g�Ƃ̑���M�B �N���C�A���g�֐ڑ����Ɛڑ������𑗐M�B
        pw.println(num + "�Ԗڂ̐ڑ��@" + time); 
        pw.flush(); // �����I�ɏo�́B                                       

        // (�菇�T)���o�̓X�g���[�������B
        pw.close(); 

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
% javac j731a.java

% java j731a 3333
�T�[�o�ҋ@��
1�Ԗڂ̐ڑ��@�N���C�A���g(localhost)�@�����FThu Jul 15 16:07:22 JST 2004
�T�[�o�ҋ@��
2�Ԗڂ̐ڑ��@�N���C�A���g(localhost)�@�����FThu Jul 15 16:07:54 JST 2004
�T�[�o�ҋ@��
</pre>

<font size=3 color=blue>�m�N���C�A���g���n</font>

<pre>
% java j723 localhost 3333
Reader�X���b�h�J�n
Writer�X���b�h�J�n
1�Ԗڂ̐ڑ��@Thu Jul 15 16:07:22 JST 2004
Ctrl-C

% java j723 localhost 3333
Reader�X���b�h�J�n
2�Ԗڂ̐ڑ��@Thu Jul 15 16:07:54 JST 2004
Writer�X���b�h�J�n
Ctrl-C
</pre>

</body>
</html>
