<!--====================================================================-->
<!-- << m123.htm >>                                                     -->
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
//  << m123.java >>
//
//�@���[���i�Q�j�F���[���̑��M(�摜���[��)
//
//�@�@�摜���[���̑��M�B
//
//�@��������
//      DataSource ds = new FileDataSource("�摜�t�@�C����"); 
//      DataHandler dh = new DataHandler(ds);     
//      mm.setDataHandler(dh);
//�@
//�@��JAF(JavaBeans Activation Framework)
//�@�@�f�[�^�̃^�C�v�����ʂ��A���̃f�[�^�ɂ����ꂽ�������s���R���|�[�l���g��
//�@�@���I�ɌĂяo���d�g�݂ł���B
//    ���������āA�摜�t�@�C���̂悤�ɕ����̕\���`��������ꍇ�Ɉ������Ȗ��ɂȂ�B
//
//�@��javax.activation.FileDataSource�N���X
//�@  public class FileDataSource extends Object implements DataSource
//
//�@��javax.activation.FileDataSource�N���X�̃R���X�g���N�^
//    public FileDataSource(String s)�@
//      �@�\�F���M����t�@�C����s����DataSource�I�u�W�F�N�g���쐬����B
//
//�@��javax.activation.DataSource�C���^�[�t�F�[�X
//    public interface DataSource
//
//�@��javax.activation.DataHandler�N���X
//    public class DataHandler extends Object implements Transferable
//
//�@��javax.activation.DataHandler�N���X�̃R���X�g���N�^
//    public DataHandler(DataSource ds)
//    �@�@�\�FDataSource�I�u�W�F�N�g����DataHandler�I�u�W�F�N�g���쐬����B
//
//�@��javax.mail.internet.MimeMessage�N���X�̃��\�b�h
//    public void setDataHandler(DataHandler dh) throws MessagingException
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

class m123 {
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
      String subject = "�摜���[��";

      //////////////////////////////////////////////////////////////
      //(�菇�R)���M���A���M��A�T�u�W�F�N�g�A�{���Ȃǂ�ݒ肷��B//
      //////////////////////////////////////////////////////////////
      MimeMessage mm = new MimeMessage(ss);
      // ���M�����[���A�h���X(iafrom)�̐ݒ�B
      mm.setFrom(iafrom);
      // ���M�惁�[���A�h���X�̐ݒ�B
      mm.setRecipients(Message.RecipientType.TO,to);
      // �T�u�W�F�N�g�̐ݒ�B���{����g�p����ꍇ�A"iso-2022-jp"���w�肷��B
      mm.setSubject(subject,"iso-2022-jp");
      // �摜�t�@�C���̐ݒ�B
      DataSource ds = new FileDataSource("semba.gif"); 
      DataHandler dh = new DataHandler(ds);     
      mm.setDataHandler(dh);

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
c:\> javac m123.java
c:\> java m123 "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
���M�I��
</pre>

</body>
</html>
