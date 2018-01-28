<!--====================================================================-->
<!-- << m132a.htm >>                                                    -->
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
//  << m132a.java >>
//
//�@���[���i�R�j�F���[���̎�M�i��M���[���̈ꗗ�j
//
//�@�@��M���[���̈ꗗ�B
//
//�@��javax.mail.Message�N���X
//�@�@public abstract class Message extends Object implements Part
//
//�@��javax.mail.Message�N���X�̃��\�b�h
//    public abstract String getSubject() throws MessagingException
//�@�@�@�@�\�FMessage�I�u�W�F�N�g����T�u�W�F�N�g���擾����B
//    public abstract Address[] getFrom() throws MessagingException
//�@�@�@�@�\�FMessage�I�u�W�F�N�g����From�����̒l���擾����B
//    public abstract Address[] getRecipients(Message.RecipientType type)
//                                                  throws MessagingException
//�@�@�@�@�\�Ftype�����̒l���擾����B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m132a {
  public static void main(String args[]) {

    try {
      ////////////////////////////////////////////
      // (�菇�P)Session�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////
      Properties prop = System.getProperties();
      Session ss = Session.getDefaultInstance(prop);

      ////////////////////////////////////////////
      // (�菇�Q)Store�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////
      Store store = ss.getStore("pop3");
      // pop�T�[�o�Ɛڑ��B
      // ��Q������-1�Ƃ���ƁA�f�t�H���g�̃|�[�g�ԍ�(110)���w�肷�邱�ƂɂȂ�B
      String pophost = args[0];  // pop�T�[�o�B
      String user = args[1];     // �A�J�E���g�B
      String password = args[2]; // �p�X���[�h�B
      store.connect(pophost, -1, user, password);

      ////////////////////////////////////////////
      // (�菇�R)Folder�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////
      Folder df = store.getDefaultFolder(); // ���[�g�̃t�H���_���擾�B
      Folder folder = df.getFolder("INBOX"); // �W���t�H���_(INBOX)���擾�B
      folder.open(Folder.READ_ONLY);
      // POP3�A�J�E���g�ɂ́A���M���[�����i�[����INBOX�t�H���_������B
      // INBOX�t�H���_��READ_ONLY(�ǂݎ���p)�Ƃ��ĊJ���ƁA���[����ǎ��A
      // INBOX�t�H���_���烁�[�����폜����邱�Ƃ͂Ȃ��B

      ////////////////////////////////////////////
      // (�菇�S)Message�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // ���[����S���擾�B
      for (int i=0; i<msg.length; i++ ) {
        System.out.println("�ԍ�[" + (i+1) + "]");
        // �T�u�W�F�N�g�̕\���B
        System.out.println("Subject : " + msg[i].getSubject());

        // ���M���̕\���B
        Address[] from = msg[i].getFrom();
        if(from != null) {
          for (int j=0; j<from.length; j++) {
            System.out.println("From : " + from[j]);
          }
        }

        // ���M��̕\���B
        Address[] to = msg[i].getRecipients(Message.RecipientType.TO);
        if(to != null) {
          for (int j=0; j<to.length; j++) {
            System.out.println("To : " + to[j]);
          }
        }
      }

      // �t�H���_�����B
      folder.close(false);
      store.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m132a.java
c:\> java m132a "xxx.yyy.zzz" "abcd" "12345678"
�ԍ�[1]
Subject : �e�L�X�g���[��
From : =?iso-2022-jp?B?GyRCQGdHSBsoQg==?= 
To : abcd@xxx.yyy.zzz
�ԍ�[2]
Subject : �摜���[��
From : =?iso-2022-jp?B?GyRCQGdHSBsoQg==?= 
To : abcd@xxx.yyy.zzz
�ԍ�[3]
Subject : �Y�t���[��
From : =?iso-2022-jp?B?GyRCQGdHSBsoQg==?= 
To : abcd@xxx.yyy.zzz
</pre>

</body>
</html>
