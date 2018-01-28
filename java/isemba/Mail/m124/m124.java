<!--====================================================================-->
<!-- << m124.htm >>                                                     -->
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
//  << m124.java >>
//
//�@���[���i�Q�j�F���[�����M(�Y�t���[��)
//
//�@�@�Y�t���[���̑��M�B
//
//�@  MIME���X�Ɋg������MIME Multi-part�Ƃ����d�l�ɂ���Ė{���ɉ摜�t�@�C��
//�@�@�Ȃǂ�Y�t���đ��M�ł���B
//�@�@�{������؂蕶���ɂ���ĕ����̕���(�p�[�g)�ɕ������A�e�p�[�g�ɂ͈قȂ�
//�@�@�f�[�^���i�[���邱�Ƃ��ł���B
//
//�@��������
//�@�@�EMimeMultipart�I�u�W�F�N�g���쐬����B
//�@�@�EMimeBodyPart�I�u�W�F�N�g�ɑ��M����t�@�C����Ή��t���A
//�@�@�@MimeMultipart�I�u�W�F�N�g�ɒǉ�����B
//�@�@�EMimeMultipart�I�u�W�F�N�g��{���Ƃ��Đݒ肷��B
//
//�@��java.mail.internet.MimeBodyPart�N���X
//    public class MimeBodyPart extends BodyPart implements MimePart
//    MimeBodyPart�́A�p�[�g��\���N���X�ŁA���M����e�L�X�g��摜�t�@�C����
//    �ݒ肷��B
//
//�@��javax.mail.internet.MimeBodyPart�N���X�̃R���X�g���N�^
//    public MimeBodyPart()
//    �@�@�\�F���MimeBodyPart�I�u�W�F�N�g���쐬����B
//
//�@��javax.mail.internet.MimeBodyPart�N���X�̃��\�b�h
//    public void setText(String s,String cs) throws MessagingException
//�@�@�@�@�\�F������s��MIME�`��(text/html)�A�����Z�b�gcs�Ńp�[�g�ɐݒ肷��B
//   public void setFileName(String s) throws MessagingException
//      �@�\�F�p�[�g�Ɋ֘A���閼�Os��ݒ肷��B
//
//  ��javax.mail.internet.MimeMultipart�N���X
//�@�@MimeMultipart�N���X�́A�p�[�g���Ǘ�����N���X�ł���B
//    public class MimeMultipart extends Multipart
//
//�@��javax.mail.internet.MimeMultipart�N���X�̃R���X�g���N�^
//    public MimeMultipart()
//    �@�@�\�F���MimeMultipart�I�u�W�F�N�g���쐬����B
//
//�@��javax.mail.Multipart�N���X�̃��\�b�h
//    public void addBodyPart(BodyPart part) throws MessagingException
//    �@�@�\�FBodyPart�I�u�W�F�N�g��ǉ�����B
//  
//�@��javax.activation.FileDataSource�N���X�̃��\�b�h
//    public String getName()
//    �@�@�\�F���̃I�u�W�F�N�g�̖��O���擾����B
//
//�@��javax.mail.internet.MimeUtility�N���X
//    public class MimeUtility extends Object
//
//�@��javax.mail.internet.MimeUtility�N���X�̃��\�b�h
//    public static String encodeWord(String s)
//                                        throws UnsupportedEncodingException
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.activation.DataHandler;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.MimeMultipart;
import javax.mail.Multipart;

class m124 {
  public static void main(String args[]) {

    try{
      ///////////////////////////////////////////////
      // (�菇�P)smtp�T�[�o�ƃZ�b�V�������m������B//
      ///////////////////////////////////////////////
      String smtphost = args[0]; // smtp�T�[�o�B
      Properties prop = new Properties();
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
      String subject = "�Y�t���[��";

      //////////////////////////////////////////////////////////
      //(�菇�R)���M���A���M��A�T�u�W�F�N�g�A�{����ݒ肷��B//
      //////////////////////////////////////////////////////////
      MimeMessage mm = new MimeMessage(ss);
      // ���M�����[���A�h���X(iafrom)�̐ݒ�B
      mm.setFrom(iafrom);
      // ���M�惁�[���A�h���X�̐ݒ�B
      mm.setRecipients(Message.RecipientType.TO,to);
      // �T�u�W�F�N�g�̐ݒ�B���{����g�p����ꍇ�A"iso-2022-jp"���w�肷��B
      mm.setSubject(subject,"iso-2022-jp");

      ///////////////////////
      // �Y�t���[���̍쐬�B//
      ///////////////////////

      // �P�ڂ̃p�[�g���쐬�B
      MimeBodyPart mbp1 = new MimeBodyPart();
      // ���[���̓��e��ݒ�B
      mbp1.setText("�Y�t�t�@�C���𑗐M���܂��B","iso-2022-jp");

      // �Q�ڂ̃p�[�g���쐬�B
      MimeBodyPart mbp2 = new MimeBodyPart();
      // �Y�t����t�@�C����ݒ�B
      DataSource ds = new FileDataSource("m124.java");
      DataHandler dh = new DataHandler(ds);
      mbp2.setDataHandler(dh);
      // �Y�t����t�@�C������ݒ�B
      mbp2.setFileName(MimeUtility.encodeWord(ds.getName()));

      // �����̃p�[�g���i�[����MimeMultipart�I�u�W�F�N�g���쐬�B
      MimeMultipart mp = new MimeMultipart();
      // �P�ڂ̃p�[�g��ǉ�
      mp.addBodyPart(mbp1);
      // �Q�ڂ̃p�[�g��ǉ�
      mp.addBodyPart(mbp2);

      // MimeMultipart�I�u�W�F�N�g��{���ɐݒ�
      mm.setContent(mp);

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
c:\> javac m124.java
c:\> java m124 "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
���M�I��
</pre>

</body>
</html>
