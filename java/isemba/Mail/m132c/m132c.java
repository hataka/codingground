<!--====================================================================-->
<!-- << m132c.htm >>                                                    -->
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
//  << m132c.java >>
//
//�@���[���i�R�j�F���[���̎�M�i�w�b�_�̈ꗗ�j
//
//�@�@��M���[���Ɋ֘A����w�b�_�̈ꗗ�B
//
//�@��javax.mail.internet.MimeMessage�N���X�̃��\�b�h
//�@�@public Enumeration getAllHeaders() throws MessagingException
//�@�@�@�@�\�FMesseage�I�u�W�F�N�g�Ɋ֘A���邷�ׂẴw�b�_��Header�I�u�W�F�N�g
//�@�@�@�@�@�@��Enumeration�I�u�W�F�N�g�Ƃ��ĕԂ��B
//
//�@��javax.mail.Header�N���X�̃��\�b�h
//    public String getName()
//    �@�@�\�FHeader�I�u�W�F�N�g����w�b�_�����擾����B
//    public String getValue()
//    �@�@�\�FHeader�I�u�W�F�N�g����w�b�_�l���擾����B
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m132c {
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
      Folder folder = df.getFolder("INBOX"); // 
      folder.open(Folder.READ_ONLY);
      // POP3�A�J�E���g�ɂ́A���M���[�����i�[����INBOX�t�H���_������B
      // INBOX�t�H���_��READ_ONLY(�ǂݎ���p)�Ƃ��ĊJ���ƁA���[����ǎ��A
      // INBOX�t�H���_���烁�[�����폜����邱�Ƃ͂Ȃ��B

      ////////////////////////////////////////////
      // (�菇�S)Message�I�u�W�F�N�g���擾����B//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // ���[����S���擾�B
      for (int i=0; i<msg.length; i++ ) {
        System.out.println();
        System.out.println("�ԍ�[" + (i+1) + "]");
        // �w�b�_�����ׂĕ\���B
        Enumeration enum = msg[i].getAllHeaders();
        while( enum.hasMoreElements() ) {
          Header h = (Header)enum.nextElement();
          String name = h.getName();
          String value = h.getValue();
          System.out.println(MimeUtility.decodeText(name));
          System.out.println("--> " + MimeUtility.decodeText(value));
        }
      }

      // �t�H���_�����B
      folder.close(false);
      store.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m132c.java
c:\> java m132c "xxx.yyy.zzz" "abcd" "12345678" 
�ԍ�[1]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7N7fAoS001436
    for <abcd@xxx.yyy.zzz>; Tue, 23 Aug 2005 16:41:11 +0900 (JST)
Date
--> Tue, 23 Aug 2005 16:41:10 +0900 (JST)
Message-ID
--> <32961174.1124782870563.JavaMail.abcd@dynabook>
From
--> ��g <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> �e�L�X�g���[��
Mime-Version
--> 1.0
Content-Type
--> text/plain; charset=iso-2022-jp
Content-Transfer-Encoding
--> 8bit
X-MIME-Autoconverted
--> from quoted-printable to 8bit by xxx.yyy.zzz id j7N7fAoS001436
Content-Length
--> 27
Status
--> RO

�ԍ�[2]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7O6SYoS024380
    for <abcd@xxx.yyy.zzz>; Wed, 24 Aug 2005 15:28:35 +0900 (JST)
Date
--> Wed, 24 Aug 2005 15:28:34 +0900 (JST)
Message-ID
--> <21471211.1124864915070.JavaMail.abcd@dynabook>
From
--> ��g <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> �摜���[��
Mime-Version
--> 1.0
Content-Type
--> image/gif
Content-Transfer-Encoding
--> base64
Content-Length
--> 2383
Status
--> RO

�ԍ�[3]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7O6SpoS024389
    for <abcd@xxx.yyy.zzz>; Wed, 24 Aug 2005 15:28:51 +0900 (JST)
Date
--> Wed, 24 Aug 2005 15:28:51 +0900 (JST)
Message-ID
--> <31156635.1124864931173.JavaMail.abcd@dynabook>
From
--> ��g <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> �Y�t���[��
Mime-Version
--> 1.0
Content-Type
--> multipart/mixed; boundary="----=_Part_0_3086625.1124864931033"
Content-Length
--> 7925
Status
--> RO

�ԍ�[4]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7P2YLoS007886
    for <abcd@xxx.yyy.zzz>; Thu, 25 Aug 2005 11:34:22 +0900 (JST)
Date
--> Thu, 25 Aug 2005 11:34:21 +0900 (JST)
Message-ID
--> <28349544.1124937262081.JavaMail.abcd@dynabook>
From
--> ��g <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> HTML���[��
Mime-Version
--> 1.0
Content-Type
--> text/html; charset=iso-2022-jp
Content-Transfer-Encoding
--> quoted-printable
Content-Length
--> 90
Status
--> RO
</pre>

</body>
</html>
