<!--====================================================================-->
<!-- << m122a.htm >>                                                    -->
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
//  << m122a.java >>
//
//�@���[���i�Q�j�F���[���̑��M�i�e�L�X�g���[���j
//
//�@�@�e�L�X�g���[���̑��M�B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;

class m122a {
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
      String subject = "�e�L�X�g���[��";
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
c:\> javac m122a.java
c:\> java m122a  "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
���M�I��
</pre>

</body>
</html>
