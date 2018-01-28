<!--====================================================================-->
<!-- << m133a.htm >>                                                    -->
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
//  << m133a.java >>
//
//　メール（３）：メールの受信（テキストメールの受信と表示）
//
//　　テキストメールの受信と表示。
//
//　●javax.mail.Partインターフェースのメソッド
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
      Folder folder = df.getFolder("INBOX"); 
      folder.open(Folder.READ_ONLY);
      // POP3アカウントには、着信メールを格納するINBOXフォルダがある。
      // INBOXフォルダをREAD_ONLY(読み取り専用)として開くと、メールを読取後、
      // INBOXフォルダからメールが削除されることはない。

      ////////////////////////////////////////////
      // (手順４)Messageオブジェクトを取得する。//
      ////////////////////////////////////////////
      Message[] msg = folder.getMessages(); // メールを全部取得。
      for( int i=0; i<msg.length; i++ ) {
        System.out.println();
        System.out.println("番号[" + (i+1) + "]");
        showheader(msg[i]);
        showbody(msg[i]);
      }

      // フォルダを閉じる。
      folder.close(false);
      store.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  ///////////////////////////////////////////////////////
  // サブジェクト、送信元、送信先、送信日時を表示する。//
  ///////////////////////////////////////////////////////
  static void showheader(Message msg) throws Exception {
    // サブジェクトの表示。                                                
    System.out.println("Subject : " + msg.getSubject());                
    // 送信元の表示。                                                      
    Address[] from = msg.getFrom();                                     
    if( from != null ) {                                                     
      for (int j=0; j<from.length; j++) {                                  
        String sfrom = from[j].toString();                                  
        System.out.println("From : " + MimeUtility.decodeText(sfrom));      
      }                                                                    
    }                                                                      
    // 送信先の表示。                                                      
    Address[] to = msg.getRecipients(Message.RecipientType.TO);         
    if( to != null ) {                                                       
      for (int j=0; j<to.length; j++) {                                    
        String sto = to[j].toString();                                     
        System.out.println("To : " + MimeUtility.decodeText(sto));         
      }                                                                    
    }                                                                      
    // 送信日時の表示。                                                   
    Date d = msg.getSentDate();                                     
    System.out.println("Date : " + d);         
  }

  /////////////////////
  // 本文を表示する。//
  /////////////////////
  static void showbody(Message msg) throws Exception {
    String ct = msg.getContentType();
    System.out.println("Content-Type：" + ct);
    // 本文の表示(MIME形式がtext/plainの場合)。                            
    if( msg.isMimeType("text/plain") ) {
      String text = (String)msg.getContent();                           
      System.out.println("本文：" + text);                  
      return;
    }
    System.out.println("MIME形式がtext/plain以外なので表示しません");
  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m133a.java
c:\. java m133a "xxx.yyy.zzz" "abcd" "12345678" 

番号[1]
Subject : テキストメール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Tue Aug 23 16:41:10 JST 2005
Content-Type：text/plain; charset=iso-2022-jp
本文：abc 123 こんにちは




番号[2]
Subject : 画像メール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:34 JST 2005
Content-Type：image/gif
MIME形式がtext/plain以外なので表示しません

番号[3]
Subject : 添付メール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:51 JST 2005
Content-Type：multipart/mixed; boundary="----=_Part_0_3086625.1124864931033"
MIME形式がtext/plain以外なので表示しません

番号[4]
Subject : HTMLメール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Thu Aug 25 11:34:21 JST 2005
Content-Type：text/html; charset=iso-2022-jp
MIME形式がtext/plain以外なので表示しません
</pre>

</body>
</html>
