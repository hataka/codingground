<!--====================================================================-->
<!-- << m131b.htm >>                                                    -->
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
//  << m131b.java >>
//
//�@���[���i�R�j�F���[����M�̎菇�i�菇�Q�j
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
//�@��javax.mail.Store�N���X
//�@�@public abstract class Store extends Service
//�@�@�T�[�o�ւ̐ڑ��E�ؒf�A�t�H���_�̊Ǘ����s���N���X�B
//�@�@�v���g�R���ɉ����āASession�I�u�W�F�N�g����쐬�����B
//
//�@��javax.mail.Store�N���X�̃��\�b�h
//    public abstract Folder getFolder(String name) throws MessagingException
//�@�@�@�@�\�F���Os������Folder�I�u�W�F�N�g���擾����B
//    public void connect(String host,
//                  int port,
//                  String user,
//                  String password) throws MessagingException
//    public void close() throws MessagingException
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m131b {
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

      ////////////////////////////////////////////
      // (�菇�S)Message�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////

      // �t�H���_�����B

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
</pre>

</body>
</html>