<!--====================================================================-->
<!-- << m131d.htm >>                                                    -->
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
//  << m131d.java >>
//
//　メール（３）：メール受信の手順（手順４）
//
//　　JavaMail APIを使ってメールを受信する手順を示す。
//　　pop3プロトコルによってメールを受信する。
//
//　●手順
//　　(手順１)Sessionオブジェクトを取得する。
//　　(手順２)Storeオブジェクトを取得する。
//　　　　　　プロトコル(pop3)を指定して、Storeオブジェクトを取得し、
//　　　　　　popサーバと接続する。
//　　(手順３)Folderオブジェクトを取得する。
//　　　　　　フォルダ(INBOX)を指定して、Folderオブジェクトを取得する。
//      　　　フォルダ(INBOX)には、着信メールが格納されている。
//　　(手順４)Messageオブジェクトを取得する。
//　　　　　　FolderクラスのgetMessagesメソッドを利用して、Messageオブジェクトを
//　　　　　　取得する。
//
//　●javax.mail.Folderクラスのメソッド
//    public abstract void close(boolean b) throws MessagingException
//　　　機能：フォルダを閉じる。
//　　　　　　bがtrueの場合、削除の指定をしたメッセージをほんとうに削除する。
//    public Message[] getMessages() throws MessagingException
//　　　機能：フォルダからすべてのMessageオブジェクトを取得する。
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

class m131d {
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
      // ルートのフォルダを取得。
      Folder df = store.getDefaultFolder();
      // POP3アカウントには、着信メールを格納するINBOXフォルダがある。
      Folder folder = df.getFolder("INBOX"); 
      // INBOXフォルダをREAD_ONLY(読み取り専用)として開くと、メールを読取後、
      // INBOXフォルダからメールが削除されることはない。
      folder.open(Folder.READ_ONLY);

      ////////////////////////////////////////////
      // (手順４)Messageオブジェクトを取得する。//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // メールを全部取得。
      for (int i=0; i<msg.length; i++ ) {
        System.out.println("[" + (i+1) + "]" + msg[i].toString());
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
c:\> javac m131d.java
c:\> java m131d "xxx.yyy.zzz" "abcd" "12345678"
[1]com.sun.mail.pop3.POP3Message@c832d2
</pre>

</body>
</html>
