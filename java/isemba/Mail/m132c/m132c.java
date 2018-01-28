<!--====================================================================-->
<!-- << m132c.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
//  << m132c.java >>
//
//　メール（３）：メールの受信（ヘッダの一覧）
//
//　　受信メールに関連するヘッダの一覧。
//
//　●javax.mail.internet.MimeMessageクラスのメソッド
//　　public Enumeration getAllHeaders() throws MessagingException
//　　　機能：Messeageオブジェクトに関連するすべてのヘッダをHeaderオブジェクト
//　　　　　　のEnumerationオブジェクトとして返す。
//
//　●javax.mail.Headerクラスのメソッド
//    public String getName()
//    　機能：Headerオブジェクトからヘッダ名を取得する。
//    public String getValue()
//    　機能：Headerオブジェクトからヘッダ値を取得する。
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m132c {
  public static void main(String args[]) {

    try {
      ////////////////////////////////////////////
      // (手順１)Sessionオブジェクトを取得する。//
      ////////////////////////////////////////////
      Properties prop = System.getProperties();
      Session ss = Session.getDefaultInstance(prop);

      ////////////////////////////////////////////
      // (手順２)Storeオブジェクトを取得する。//
      ////////////////////////////////////////////
      Store store = ss.getStore("pop3");
      // popサーバと接続。
      // 第２引数を-1とすると、デフォルトのポート番号(110)を指定することになる。
      String pophost = args[0];  // popサーバ。
      String user = args[1];     // アカウント。
      String password = args[2]; // パスワード。
      store.connect(pophost, -1, user, password);

      ////////////////////////////////////////////
      // (手順３)Folderオブジェクトを取得する。//
      ////////////////////////////////////////////
      Folder df = store.getDefaultFolder(); // ルートのフォルダを取得。
      Folder folder = df.getFolder("INBOX"); // 
      folder.open(Folder.READ_ONLY);
      // POP3アカウントには、着信メールを格納するINBOXフォルダがある。
      // INBOXフォルダをREAD_ONLY(読み取り専用)として開くと、メールを読取後、
      // INBOXフォルダからメールが削除されることはない。

      ////////////////////////////////////////////
      // (手順４)Messageオブジェクトを取得する。//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // メールを全部取得。
      for (int i=0; i<msg.length; i++ ) {
        System.out.println();
        System.out.println("番号[" + (i+1) + "]");
        // ヘッダをすべて表示。
        Enumeration enum = msg[i].getAllHeaders();
        while( enum.hasMoreElements() ) {
          Header h = (Header)enum.nextElement();
          String name = h.getName();
          String value = h.getValue();
          System.out.println(MimeUtility.decodeText(name));
          System.out.println("--> " + MimeUtility.decodeText(value));
        }
      }

      // フォルダを閉じる。
      folder.close(false);
      store.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m132c.java
c:\> java m132c "xxx.yyy.zzz" "abcd" "12345678" 
番号[1]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7N7fAoS001436
    for <abcd@xxx.yyy.zzz>; Tue, 23 Aug 2005 16:41:11 +0900 (JST)
Date
--> Tue, 23 Aug 2005 16:41:10 +0900 (JST)
Message-ID
--> <32961174.1124782870563.JavaMail.abcd@dynabook>
From
--> 仙波 <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> テキストメール
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

番号[2]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7O6SYoS024380
    for <abcd@xxx.yyy.zzz>; Wed, 24 Aug 2005 15:28:35 +0900 (JST)
Date
--> Wed, 24 Aug 2005 15:28:34 +0900 (JST)
Message-ID
--> <21471211.1124864915070.JavaMail.abcd@dynabook>
From
--> 仙波 <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> 画像メール
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

番号[3]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7O6SpoS024389
    for <abcd@xxx.yyy.zzz>; Wed, 24 Aug 2005 15:28:51 +0900 (JST)
Date
--> Wed, 24 Aug 2005 15:28:51 +0900 (JST)
Message-ID
--> <31156635.1124864931173.JavaMail.abcd@dynabook>
From
--> 仙波 <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> 添付メール
Mime-Version
--> 1.0
Content-Type
--> multipart/mixed; boundary="----=_Part_0_3086625.1124864931033"
Content-Length
--> 7925
Status
--> RO

番号[4]
Received
--> from dynabook (localhost [127.0.0.1])
    by xxx.yyy.zzz (8.12.9/8.12.8) with ESMTP id j7P2YLoS007886
    for <abcd@xxx.yyy.zzz>; Thu, 25 Aug 2005 11:34:22 +0900 (JST)
Date
--> Thu, 25 Aug 2005 11:34:21 +0900 (JST)
Message-ID
--> <28349544.1124937262081.JavaMail.abcd@dynabook>
From
--> 仙波 <abcd@xxx.yyy.zzz>
To
--> abcd@xxx.yyy.zzz
Subject
--> HTMLメール
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
