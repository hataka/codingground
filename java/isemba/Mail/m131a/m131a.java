<!--====================================================================-->
<!-- << m131a.htm >>                                                    -->
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
//  << m131a.java >>
//
//�@���[���i�R�j�F���[����M�̎菇�i�菇�P�j
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
//�@��javax.mail.Session�N���X
//    ���b�Z�[�W�̑���M���s���Z�b�V������\���B
//     public final class Session extends Object
//
//�@��javax.mail.Session�N���X�̃��\�b�h
//    public static Session getDefaultInstance(Properties prop)
//�@�@�@�@�\�F�v���p�e�Bprop���g���āASession�I�u�W�F�N�g���쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m131a {
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
