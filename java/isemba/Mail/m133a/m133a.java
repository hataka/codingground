<!--====================================================================-->
<!-- << m133a.htm >>                                                    -->
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
//  << m133a.java >>
//
//�@���[���i�R�j�F���[���̎�M�i�e�L�X�g���[���̎�M�ƕ\���j
//
//�@�@�e�L�X�g���[���̎�M�ƕ\���B
//
//�@��javax.mail.Part�C���^�[�t�F�[�X�̃��\�b�h
//    public boolean isMimeType(String mimeType) throws MessagingException
//    public abstract Date getSentDate() throws MessagingException
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m133a {
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
      for (int j=0; j<from.length; j++) {                                  
        String sfrom = from[j].toString();                                  
        System.out.println("From : " + MimeUtility.decodeText(sfrom));      
      }                                                                    
    }                                                                      
    // ���M��̕\���B                                                      
    Address[] to = msg.getRecipients(Message.RecipientType.TO);         
    if( to != null ) {                                                       
      for (int j=0; j<to.length; j++) {                                    
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
  static void showbody(Message msg) throws Exception {
    String ct = msg.getContentType();
    System.out.println("Content-Type�F" + ct);
    // �{���̕\��(MIME�`����text/plain�̏ꍇ)�B                            
    if( msg.isMimeType("text/plain") ) {
      String text = (String)msg.getContent();                           
      System.out.println("�{���F" + text);                  
      return;
    }
    System.out.println("MIME�`����text/plain�ȊO�Ȃ̂ŕ\�����܂���");
  }

}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m133a.java
c:\. java m133a "xxx.yyy.zzz" "abcd" "12345678" 

�ԍ�[1]
Subject : �e�L�X�g���[��
From : ��g 
To : abcd@xxx.yyy.zzz
Date : Tue Aug 23 16:41:10 JST 2005
Content-Type�Ftext/plain; charset=iso-2022-jp
�{���Fabc 123 ����ɂ���




�ԍ�[2]
Subject : �摜���[��
From : ��g 
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:34 JST 2005
Content-Type�Fimage/gif
MIME�`����text/plain�ȊO�Ȃ̂ŕ\�����܂���

�ԍ�[3]
Subject : �Y�t���[��
From : ��g 
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:51 JST 2005
Content-Type�Fmultipart/mixed; boundary="----=_Part_0_3086625.1124864931033"
MIME�`����text/plain�ȊO�Ȃ̂ŕ\�����܂���

�ԍ�[4]
Subject : HTML���[��
From : ��g 
To : abcd@xxx.yyy.zzz
Date : Thu Aug 25 11:34:21 JST 2005
Content-Type�Ftext/html; charset=iso-2022-jp
MIME�`����text/plain�ȊO�Ȃ̂ŕ\�����܂���
</pre>

</body>
</html>
