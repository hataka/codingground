<!--====================================================================-->
<!-- << m131c.htm >>                                                    -->
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
//  << m131c.java >>
//
//　メール（３）：メール受信の手順（手順３）
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
//　●javax.mail.Folderクラス
//    public abstract class Folder extends Object
//
//　●javax.mail.Folderクラスのフィールド
//    public static final int READ_ONLY
//    public static final int READ_WRITE
//
//　●javax.mail.Folderクラスのメソッド
//    public abstract void open(int m) throws MessagingException
//　　　機能：フォルダをモードmで開く。
//　　　　　　モードは、READ_ONLYまたはREAD_WRITE。
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m131c {
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

      // フォルダを閉じる。
      folder.close(false);
      store.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
</pre>

</body>
</html>
