<!--====================================================================-->
<!-- << m133b.htm >>                                                    -->
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
//  << m133b.java >>
//
//�@���[���i�R�j�F���[���̎�M�i�Y�t�t�@�C���̂��郁�[���̎�M�ƕ\���j
//
//�@�@�Y�t�t�@�C���̂��郁�[���̎�M�ƕ\���B
//
//�@��javax.mail.Message�N���X
//    public abstract class Message extends Object implements Part
//
//�@��javax.mail.Part�C���^�[�t�F�[�X
//    public interface Part
//
//�@��javax.mail.Part�C���^�[�t�F�[�X�̃��\�b�h
//    public String getContentType() throws MessagingException
//    public Object getContent() throws IOException,MessagingException
//
//�@��javax.mail.Multipart�N���X
//    public abstract class Multipart extends Object
//
//�@��javax.mail.Multipart�N���X�̃��\�b�h
//�@�@public BodyPart getBodyPart(int index) throws MessagingException
//
//�@��javax.mail.BodyPart�N���X
//    public abstract class BodyPart extends Object implements Part
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m133b {
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
      Folder df = store.getDefaultFolder(); // ���[�g�̃t�H���_���擾�B
      Folder folder = df.getFolder("INBOX"); 
      folder.open(Folder.READ_ONLY);
      // POP3�A�J�E���g�ɂ́A���M���[�����i�[����INBOX�t�H���_������B
      // INBOX�t�H���_��READ_ONLY(�ǂݎ���p)�Ƃ��ĊJ���ƁA���[����ǎ��A
      // INBOX�t�H���_���烁�[�����폜����邱�Ƃ͂Ȃ��B

      ////////////////////////////////////////////
      // (�菇�S)Message�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // ���[����S���擾�B
      for( int i=0; i<msg.length; i++ ) {
        System.out.println();                
        System.out.println("�ԍ�[" + (i+1) + "]");
        showheader(msg[i]);
        showbody(msg[i]);
      }

      // �t�H���_�����B
      folder.close(false);
      store.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  ///////////////////////////////////////////////////////
  // �T�u�W�F�N�g�A���M���A���M��A���M������\������B//
  ///////////////////////////////////////////////////////
  static void showheader(Message msg) throws Exception {
    // �T�u�W�F�N�g�̕\���B                                                
    System.out.println("Subject : " + msg.getSubject());                
    // ���M���̕\���B                                                      
    Address[] from = msg.getFrom();                                     
    if( from != null ) {                                                     
      for( int j=0; j<from.length; j++ ) {                                  
        String sfrom = from[j].toString();                                  
        System.out.println("From : " + MimeUtility.decodeText(sfrom));      
      }                                                                    
    }                                                                      
    // ���M��̕\���B                                                      
    Address[] to = msg.getRecipients(Message.RecipientType.TO);         
    if( to != null ) {                                                       
      for( int j=0; j<to.length; j++ ) {                                    
        String sto = to[j].toString();                                     
        System.out.println("To : " + MimeUtility.decodeText(sto));         
      }                                                                    
    }
    // ���M�����̕\���B                                                   
    Date d = msg.getSentDate();                                     
    System.out.println("Date : " + d);                                         
  }

  /////////////////////
  // �{����\������B//
  /////////////////////
  static void showbody(Part p) throws Exception {
    // �e�L�X�g�̏ꍇ�B
    if( p.isMimeType("text/plain") ) { 
      String text = (String)p.getContent();
      System.out.println("���e�F\n" + text);
      return;
    }
    // �}���`�p�[�g�̏ꍇ�A�ċA�I�ɒT������B
    if( p.isMimeType("multipart/*") ) {
      Multipart mp = (Multipart)p.getContent();
      int count = mp.getCount();
      for (int i=0; i<count; i++) {
        BodyPart bp = mp.getBodyPart(i);
        showbody(bp);
      }
      return;
    }
    // ���̑��̏ꍇ�A�Y�t�t�@�C������Content-Type��\������B
    String fn = p.getFileName();
    if( fn != null ) {
      fn =  MimeUtility.decodeText(fn);
    } else {
      fn = "�t�@�C����������܂���";
    }
    System.out.println("�Y�t�t�@�C�����F" + fn);
    String ct = p.getContentType();
    System.out.println("Content-Type�F" + ct);
  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m133b.java
c:\. java m133b "xxx.yyy.zzz" "abcd" "12345678" 

�ԍ�[1]
Subject : �e�L�X�g���[��
From : ��g <abcd@xxx.yyy.zzz>
To : abcd@xxx.yyy.zzz
Date : Tue Aug 23 16:41:10 JST 2005
���e�F
abc 123 ����ɂ���




�ԍ�[2]
Subject : �摜���[��
From : ��g <abcd@xxx.yyy.zzz>
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:34 JST 2005
�Y�t�t�@�C�����F�t�@�C����������܂���
Content-Type�Fimage/gif

�ԍ�[3]
Subject : �Y�t���[��
From : ��g <abcd@xxx.yyy.zzz>
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:51 JST 2005
���e�F
�Y�t�t�@�C���𑗐M���܂��B
�Y�t�t�@�C�����Fm124.java
Content-Type�Fapplication/octet-stream; name=m124.java

�ԍ�[4]
Subject : HTML���[��
From : ��g <abcd@xxx.yyy.zzz>
To : abcd@xxx.yyy.zzz
Date : Thu Aug 25 11:34:21 JST 2005
�Y�t�t�@�C�����F�t�@�C����������܂���
Content-Type�Ftext/html; charset=iso-2022-jp

</pre>

</body>
</html>
