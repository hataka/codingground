<!--====================================================================-->
<!-- << m131c.htm >>                                                    -->
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
//  << m131c.java >>
//
//�@���[���i�R�j�F���[����M�̎菇�i�菇�R�j
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
//�@��javax.mail.Folder�N���X
//    public abstract class Folder extends Object
//
//�@��javax.mail.Folder�N���X�̃t�B�[���h
//    public static final int READ_ONLY
//    public static final int READ_WRITE
//
//�@��javax.mail.Folder�N���X�̃��\�b�h
//    public abstract void open(int m) throws MessagingException
//�@�@�@�@�\�F�t�H���_�����[�hm�ŊJ���B
//�@�@�@�@�@�@���[�h�́AREAD_ONLY�܂���READ_WRITE�B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m131c {
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

      // �t�H���_�����B
      folder.close(false);
      store.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
</pre>

</body>
</html>
