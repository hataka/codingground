<!--====================================================================-->
<!-- << m132a.htm >>                                                    -->
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
//  << m132a.java >>
//
//　メール（３）：メールの受信（受信メールの一覧）
//
//　　受信メールの一覧。
//
//　●javax.mail.Messageクラス
//　　public abstract class Message extends Object implements Part
//
//　●javax.mail.Messageクラスのメソッド
//    public abstract String getSubject() throws MessagingException
//　　　機能：Messageオブジェクトからサブジェクトを取得する。
//    public abstract Address[] getFrom() throws MessagingException
//　　　機能：MessageオブジェクトからFrom属性の値を取得する。
//    public abstract Address[] getRecipients(Message.RecipientType type)
//                                                  throws MessagingException
//　　　機能：type属性の値を取得する。
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m132a {
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
      Folder folder = df.getFolder("INBOX"); // 標準フォルダ(INBOX)を取得。
      folder.open(Folder.READ_ONLY);
      // POP3アカウントには、着信メールを格納するINBOXフォルダがある。
      // INBOXフォルダをREAD_ONLY(読み取り専用)として開くと、メールを読取後、
      // INBOXフォルダからメールが削除されることはない。

      ////////////////////////////////////////////
      // (手順４)Messageオブジェクトを取得する。//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // メールを全部取得。
      for (int i=0; i<msg.length; i++ ) {
        System.out.println("番号[" + (i+1) + "]");
        // サブジェクトの表示。
        System.out.println("Subject : " + msg[i].getSubject());

        // 送信元の表示。
        Address[] from = msg[i].getFrom();
        if(from != null) {
          for (int j=0; j<from.length; j++) {
            System.out.println("From : " + from[j]);
          }
        }

        // 送信先の表示。
        Address[] to = msg[i].getRecipients(Message.RecipientType.TO);
        if(to != null) {
          for (int j=0; j<to.length; j++) {
            System.out.println("To : " + to[j]);
          }
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
c:\> javac m132a.java
c:\> java m132a "xxx.yyy.zzz" "abcd" "12345678"
番号[1]
Subject : テキストメール
From : =?iso-2022-jp?B?GyRCQGdHSBsoQg==?= 
To : abcd@xxx.yyy.zzz
番号[2]
Subject : 画像メール
From : =?iso-2022-jp?B?GyRCQGdHSBsoQg==?= 
To : abcd@xxx.yyy.zzz
番号[3]
Subject : 添付メール
From : =?iso-2022-jp?B?GyRCQGdHSBsoQg==?= 
To : abcd@xxx.yyy.zzz
</pre>

</body>
</html>
