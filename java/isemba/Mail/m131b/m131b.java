<!--====================================================================-->
<!-- << m131b.htm >>                                                    -->
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
//  << m131b.java >>
//
//　メール（３）：メール受信の手順（手順２）
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
//　●javax.mail.Storeクラス
//　　public abstract class Store extends Service
//　　サーバへの接続・切断、フォルダの管理を行うクラス。
//　　プロトコルに応じて、Sessionオブジェクトから作成される。
//
//　●javax.mail.Storeクラスのメソッド
//    public abstract Folder getFolder(String name) throws MessagingException
//　　　機能：名前sをもつFolderオブジェクトを取得する。
//    public void connect(String host,
//                  int port,
//                  String user,
//                  String password) throws MessagingException
//    public void close() throws MessagingException
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

class m131b {
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

      ////////////////////////////////////////////
      // (手順４)Messageオブジェクトを取得する。//
      ////////////////////////////////////////////

      // フォルダを閉じる。

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
</pre>

</body>
</html>
