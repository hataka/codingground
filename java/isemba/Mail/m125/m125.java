<!--====================================================================-->
<!-- << m125.htm >>                                                     -->
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
//  << m125.java >>
//
//�@���[���i�Q�j�F���[���̑��M�iHTML���[���j
//
//�@�@HTML���[���̑��M�B
//
//�@��javax.mail.internet.MimeMessage�N���X�̃��\�b�h
//    public void setContent(Object obj,String type) throws MessagingException
//�@�@�@�@�\�FMIME�`��type�Ƃ��āA�I�u�W�F�N�gobj��{���ɐݒ肷��B
//�@�@�@�@�@�@HTML���[���œ��{��������Ƃ��́A
//            type�� "text/html; charset=iso-2022-jp"�Ƃ���B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;

class m125 {
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
      String subject = "HTML���[��";
      // �{���̍쐬�B
      // �{���̍Ō�ɁA���s�R�[�h(\n)�����Ă����Ȃ��ƁA��M���ɕs���ȕ�����
      // �\������邱�Ƃ�����B
      String text = "<html>"
                  + "<head><title>HTML</title></head>"
                  + "<body>"
                  + "<h1>����ɂ���</h1>"
                  + "</body>"
                  + "</html>";

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
      mm.setContent(text,"text/html; charset=iso-2022-jp");

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
c:\> javac m125.java
c:\> java m125 "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
���M�I��
</pre>

</body>
</html>
