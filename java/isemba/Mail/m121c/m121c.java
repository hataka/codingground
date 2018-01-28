<!--====================================================================-->
<!-- << m121c.htm >>                                                    -->
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
//  << m121c.java >>
//
//�@���[���i�Q�j�F���[�����M�̎菇�i�菇�R�j
//
//�@�@�菇�R���������B
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
//�@��javax.mail.internet.MimeMessage�N���X
//�@�@MIME�`���̃��[�����b�Z�[�W��\���B
//    public class MimeMessage extends Message implements MimePart
//
//�@��javax.mail.internet.MimeMessage�N���X�̃R���X�g���N�^
//    public MimeMessage(Session ss)
//�@�@�@�@�\�FSession�I�u�W�F�N�gss������MimeMessage�I�u�W�F�N�g���쐬����B
//
//�@��javax.mail.internet.MimeMessage�N���X�̃��\�b�h
//�@�@public void setFrom(Address address) throws MessagingException
//�@�@�@�@�\�FFrom�t�B�[���h���쐬����B
//    public void setRecipients(Message.RecipientType type, String address)
//�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@                   throws MessagingException
//�@�@�@�@�\�F�w�肵��type�Ƀ��[���A�h���Xaddress�����蓖�Ă�B
//�@�@public void setSubject(String s,String cs) throws MessagingException
//�@�@�@�@�\�FSubject�t�B�[���h�𕶎���s�ɐݒ肷��B���{��������Ƃ��́A
//�@�@�@�@�@�@�����Z�b�gcs��"iso-2022-jp"�Ƃ���B
//    public void setText(String s,String cs) throws MessagingException
//�@�@�@�@�\�F�{���𕶎���s�ɐݒ肷��B���{��������Ƃ��́A
//�@�@�@�@�@�@�����Z�b�gcs��"iso-2022-jp"�Ƃ���B
//
//�@��javax.mail.Message.RecipientType�N���X
//�@�@Message.RecipientType.TO�́A���M����Ӗ�����B
//�@�@Message.RecipientType.CC�́A�ʂ�����Ӗ�����B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.internet.MimeMessage;

class m121c {
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
      // ���M�����[���A�h���X(iafrom)�̍쐬�B
      String from = args[1];
      InternetAddress iafrom = new InternetAddress(from,"��g","iso-2022-jp");
      // ���M�惁�[���A�h���X�̍쐬�B
      String to = args[2];
      // �T�u�W�F�N�g�̍쐬�B
      String subject = "���[��";
      // �{���̍Ō�ɁA���s�R�[�h(\n)�����Ă����Ȃ��ƁA��M���ɕs���ȕ�����
      // �\������邱�Ƃ�����B
      String text = "abc 123 ����ɂ���\n";

      //////////////////////////////////////////////////////////////
      //(�菇�R)���M���A���M��A�T�u�W�F�N�g�A�{���Ȃǂ�ݒ肷��B//
      //////////////////////////////////////////////////////////////
      MimeMessage mm = new MimeMessage(ss);
      // ���M�����[���A�h���X(iafrom)�̐ݒ�B
      mm.setFrom(iafrom);
      // ���M�惁�[���A�h���X�̐ݒ�B
      mm.setRecipients(Message.RecipientType.TO,to);
      // �T�u�W�F�N�g�̍쐬�B���{����g�p����ꍇ�A"iso-2022-jp"���w�肷��B
      mm.setSubject(subject,"iso-2022-jp");
      // �{���̐ݒ�B���{����g�p����ꍇ�A"iso-2022-jp"���w�肷��B
      mm.setText(text,"iso-2022-jp");

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
