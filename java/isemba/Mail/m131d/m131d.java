<!--====================================================================-->
<!-- << m131d.htm >>                                                    -->
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
//  << m131d.java >>
//
//�@���[���i�R�j�F���[����M�̎菇�i�菇�S�j
//
//�@�@JavaMail API���g���ă��[������M����菇�������B
//�@�@pop3�v���g�R���ɂ���ă��[������M����B
//
//�@���菇
//�@�@(�菇�P)Session�I�u�W�F�N�g���擾����B
//�@�@(�菇�Q)Store�I�u�W�F�N�g���擾����B
//�@�@�@�@�@�@�v���g�R��(pop3)���w�肵�āAStore�I�u�W�F�N�g���擾���A
//�@�@�@�@�@�@pop�T�[�o�Ɛڑ�����B
//�@�@(�菇�R)Folder�I�u�W�F�N�g���擾����B
//�@�@�@�@�@�@�t�H���_(INBOX)���w�肵�āAFolder�I�u�W�F�N�g���擾����B
//      �@�@�@�t�H���_(INBOX)�ɂ́A���M���[�����i�[����Ă���B
//�@�@(�菇�S)Message�I�u�W�F�N�g���擾����B
//�@�@�@�@�@�@Folder�N���X��getMessages���\�b�h�𗘗p���āAMessage�I�u�W�F�N�g��
//�@�@�@�@�@�@�擾����B
//
//�@��javax.mail.Folder�N���X�̃��\�b�h
//    public abstract void close(boolean b) throws MessagingException
//�@�@�@�@�\�F�t�H���_�����B
//�@�@�@�@�@�@b��true�̏ꍇ�A�폜�̎w����������b�Z�[�W���ق�Ƃ��ɍ폜����B
//    public Message[] getMessages() throws MessagingException
//�@�@�@�@�\�F�t�H���_���炷�ׂĂ�Message�I�u�W�F�N�g���擾����B
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

class m131d {
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
      // ���[�g�̃t�H���_���擾�B
      Folder df = store.getDefaultFolder();
      // POP3�A�J�E���g�ɂ́A���M���[�����i�[����INBOX�t�H���_������B
      Folder folder = df.getFolder("INBOX"); 
      // INBOX�t�H���_��READ_ONLY(�ǂݎ���p)�Ƃ��ĊJ���ƁA���[����ǎ��A
      // INBOX�t�H���_���烁�[�����폜����邱�Ƃ͂Ȃ��B
      folder.open(Folder.READ_ONLY);

      ////////////////////////////////////////////
      // (�菇�S)Message�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // ���[����S���擾�B
      for (int i=0; i<msg.length; i++ ) {
        System.out.println("[" + (i+1) + "]" + msg[i].toString());
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
c:\> javac m131d.java
c:\> java m131d "xxx.yyy.zzz" "abcd" "12345678"
[1]com.sun.mail.pop3.POP3Message@c832d2
</pre>

</body>
</html>
