<!--====================================================================-->
<!-- << m121d.htm >>                                                    -->
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
//  << m121d.java >>
//
//�@���[���i�Q�j�F���[�����M�̎菇�i�菇�S�j
//
//�@�@�菇�S���������B
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
//�@��javax.mail.Transport�N���X
//    public abstract class Transport extends Service
//
//�@��javax.mail.Transport�N���X�̃��\�b�h
//    public static void send(Message msg) throws MessagingException
//�@�@�@�@�\�F���b�Z�[�Wmsg�𑗐M����B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;

class m121d {
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
      // �{���̍쐬�B
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
      Transport.send(mm);
      System.out.println("���M�I��");
    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
} 
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m121d.java 
c:\> java m121d "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
���M�I��
</pre>

</body>
</html>
