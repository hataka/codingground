<!--====================================================================-->
<!-- << m121a.htm >>                                                    -->
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
//  << m121a.java >>
//
//�@���[���i�Q�j�F���[�����M�̎菇�i�菇�P�j
//
//�@�@�菇�P���������B
//
//�@���菇
//�@�@(�菇�P)SMTP�T�[�o�ƃZ�b�V�������m������B
//�@�@�@�@�@�@Session�I�u�W�F�N�g���擾����B
//�@�@(�菇�Q)���M���A���M��A�T�u�W�F�N�g�A�{���Ȃǂ��쐬����B
//�@�@(�菇�R)���M���A���M��A�T�u�W�F�N�g�A�{���Ȃǂ�ݒ肷��B
//�@�@�@�@�@�@Session�I�u�W�F�N�g����MimeMessage�I�u�W�F�N�g���쐬����B
//�@�@�@�@�@�@MimeMessage�I�u�W�F�N�g�ɑ��M���A���M��A�T�u�W�F�N�g�A�{���Ȃǂ�
//�@�@�@�@�@�@�ݒ肷��B
//�@�@(�菇�S)���[���̑��M�B
//�@�@�@�@�@�@Transport�N���X��send���\�b�h���g���āAMimeMessage�I�u�W�F�N�g��
//�@�@�@�@�@�@���[���Ƃ��đ��M����B
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

import javax.mail.Session;
import java.util.Properties;

class m121a {
  public static void main(String args[]) {

    try{
      ///////////////////////////////////////////////
      // (�菇�P)smtp�T�[�o�ƃZ�b�V�������m������B//
      ///////////////////////////////////////////////
      String smtphost = args[0]; // smtp�T�[�o�B
      Properties prop = new Properties();
      // ���[���T�[�o�ɐڑ������ŕK�v�ȃv���p�e�B(mail.smtp.host)��ݒ肷��B
      prop.put("mail.smtp.host",smtphost);
      // Session�I�u�W�F�N�g���擾�B
      Session ss = Session.getDefaultInstance(prop);

      //////////////////////////////////////////////////////////////
      //(�菇�Q)���M���A���M��A�T�u�W�F�N�g�A�{���Ȃǂ��쐬����B//
      //////////////////////////////////////////////////////////////

      //////////////////////////////////////////////////////////////
      //(�菇�R)���M���A���M��A�T�u�W�F�N�g�A�{���Ȃǂ�ݒ肷��B//
      //////////////////////////////////////////////////////////////

      //////////////////////////
      //(�菇�S)���[���̑��M�B//
      //////////////////////////

      System.out.println("���M�I��");

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
} 
</pre>

</body>
</html>
