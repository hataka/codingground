<!--====================================================================-->
<!-- << m133c.htm >>                                                    -->
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
//  << m133c.java >>
//
//　メール（３）：メールの受信（添付ファイルのあるメールの受信と表示）
//
//　　添付ファイルのあるメールの受信と表示。
//　　添付ファイルは、ファイル名を付けてパソコン側に保存。
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.io.*;

class m133c {

  static int num = 0; // 添付ファイル名に付ける番号。

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
      for( int j=0; j<from.length; j++ ) {                                  
        String sfrom = from[j].toString();                                  
        System.out.println("From : " + MimeUtility.decodeText(sfrom));      
      }                                                                    
    }                                                                      
    // 送信先の表示。                                                      
    Address[] to = msg.getRecipients(Message.RecipientType.TO);         
    if( to != null ) {                                                       
      for( int j=0; j<to.length; j++ ) {                                    
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
  static void showbody(Part p) throws Exception {
    // テキストの場合。
    if( p.isMimeType("text/plain") ) { 
      String text = (String)p.getContent();
      System.out.println("内容：\n" + text);
      return;
    }
    // マルチパートの場合、再帰的に探索する。
    if( p.isMimeType("multipart/*") ) {
      Multipart mp = (Multipart)p.getContent();
      int count = mp.getCount();
      for (int i=0; i<count; i++) {
        BodyPart bp = mp.getBodyPart(i);
        showbody(bp);
      }
      return;
    }
    // その他の場合、添付ファイル名とContent-Typeを表示し、パソコン側に保存する。
    // ファイル名がない場合、ファイル名を「添付ファイル」+「番号」とする、
    String fn = p.getFileName();
    if( fn != null ) {
      fn =  MimeUtility.decodeText(fn);
    } else {
      num++;
      fn = "添付ファイル" + num;
    }
    System.out.println("添付ファイル名：" + fn);
    String ct = p.getContentType();
    System.out.println("Content-Type：" + ct);

    // ファイルの保存。                                                      
    try {                                                                    
      File f = new File(fn);                                                 
      OutputStream os = new BufferedOutputStream(new FileOutputStream(f));    
      InputStream is = p.getInputStream();                                 
      int c;                                                                 
      while( (c = is.read()) != -1 ) { os.write(c); }                        
      os.close();                                                            
      System.out.println(fn + "に保存しました。");                           
    } catch (Exception e) {                                                  
      System.out.println("添付ファイルの保存に失敗しました。" + e);          
    }                                                                        
  }

}
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m133c.java
c:\. java m133c "xxx.yyy.zzz" "abcd" "12345678" 

番号[1]
Subject : テキストメール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Tue Aug 23 16:41:10 JST 2005
内容：
abc 123 こんにちは




番号[2]
Subject : 画像メール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:34 JST 2005
添付ファイル名：添付ファイル1
Content-Type：image/gif
添付ファイル1に保存しました。

番号[3]
Subject : 添付メール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Wed Aug 24 15:28:51 JST 2005
内容：
添付ファイルを送信します。
添付ファイル名：m124.java
Content-Type：application/octet-stream; name=m124.java
m124.javaに保存しました。

番号[4]
Subject : HTMLメール
From : 仙波 
To : abcd@xxx.yyy.zzz
Date : Thu Aug 25 11:34:21 JST 2005
添付ファイル名：添付ファイル2
Content-Type：text/html; charset=iso-2022-jp
添付ファイル2に保存しました。
</pre>

</body>
</html>
