<!--====================================================================-->
<!-- << m122a.htm >>                                                    -->
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
//  << m122a.java >>
//
//　メール（２）：メールの送信（テキストメール）
//
//　　テキストメールの送信。
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;

class m122a {
  public static void main(String args[]) {

    try{
      ///////////////////////////////////////////////
      // (手順１)smtpサーバとセッションを確立する。//
      ///////////////////////////////////////////////
      String smtphost = args[0]; // smtpサーバ。
      Properties prop = new Properties();
      // メールサーバに接続する上で必要なプロパティ(mail.smtp.host)を設定する。
      prop.put("mail.smtp.host",smtphost);
      // Sessionオブジェクトを取得。
      Session ss = Session.getDefaultInstance(prop);

      //////////////////////////////////////////////////////////////
      //(手順２)送信元、送信先、サブジェクト、本文などを作成する。//
      //////////////////////////////////////////////////////////////
      // 送信元メールアドレス(iafrom)の作成。
      String from = args[1];
      InternetAddress iafrom = new InternetAddress(from,"仙波","iso-2022-jp");
      // 送信先メールアドレスの作成。
      String to = args[2];
      // サブジェクトの作成。
      String subject = "テキストメール";
      // 本文の作成。
      // 本文の最後に、改行コード(\n)を入れておかないと、受信時に不明な文字が
      // 表示されることがある。
      String text = "abc 123 こんにちは\n";

      //////////////////////////////////////////////////////////////
      //(手順３)送信元、送信先、サブジェクト、本文などを設定する。//
      //////////////////////////////////////////////////////////////
      MimeMessage mm = new MimeMessage(ss);
      // 送信元メールアドレス(iafrom)の設定。
      mm.setFrom(iafrom);
      // 送信先メールアドレスの設定。
      mm.setRecipients(Message.RecipientType.TO,to);
      // サブジェクトの作成。日本語を使用する場合、"iso-2022-jp"を指定する。
      mm.setSubject(subject,"iso-2022-jp");
      // 本文の設定。日本語を使用する場合、"iso-2022-jp"を指定する。
      mm.setText(text,"iso-2022-jp");

      //////////////////////////
      //(手順４)メールの送信。//
      //////////////////////////
      Transport.send(mm);
      System.out.println("送信終了");

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
} 
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac m122a.java
c:\> java m122a  "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
送信終了
</pre>

</body>
</html>
