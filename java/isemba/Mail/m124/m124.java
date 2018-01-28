<!--====================================================================-->
<!-- << m124.htm >>                                                     -->
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
//  << m124.java >>
//
//　メール（２）：メール送信(添付メール)
//
//　　添付メールの送信。
//
//　  MIMEを更に拡張したMIME Multi-partという仕様によって本文に画像ファイル
//　　などを添付して送信できる。
//　　本文を区切り文字によって複数の部分(パート)に分割し、各パートには異なる
//　　データを格納することができる。
//
//　●書き方
//　　・MimeMultipartオブジェクトを作成する。
//　　・MimeBodyPartオブジェクトに送信するファイルを対応付け、
//　　　MimeMultipartオブジェクトに追加する。
//　　・MimeMultipartオブジェクトを本文として設定する。
//
//　●java.mail.internet.MimeBodyPartクラス
//    public class MimeBodyPart extends BodyPart implements MimePart
//    MimeBodyPartは、パートを表すクラスで、送信するテキストや画像ファイルを
//    設定する。
//
//　●javax.mail.internet.MimeBodyPartクラスのコンストラクタ
//    public MimeBodyPart()
//    　機能：空のMimeBodyPartオブジェクトを作成する。
//
//　●javax.mail.internet.MimeBodyPartクラスのメソッド
//    public void setText(String s,String cs) throws MessagingException
//　　　機能：文字列sをMIME形式(text/html)、文字セットcsでパートに設定する。
//   public void setFileName(String s) throws MessagingException
//      機能：パートに関連する名前sを設定する。
//
//  ●javax.mail.internet.MimeMultipartクラス
//　　MimeMultipartクラスは、パートを管理するクラスである。
//    public class MimeMultipart extends Multipart
//
//　●javax.mail.internet.MimeMultipartクラスのコンストラクタ
//    public MimeMultipart()
//    　機能：空のMimeMultipartオブジェクトを作成する。
//
//　●javax.mail.Multipartクラスのメソッド
//    public void addBodyPart(BodyPart part) throws MessagingException
//    　機能：BodyPartオブジェクトを追加する。
//  
//　●javax.activation.FileDataSourceクラスのメソッド
//    public String getName()
//    　機能：このオブジェクトの名前を取得する。
//
//　●javax.mail.internet.MimeUtilityクラス
//    public class MimeUtility extends Object
//
//　●javax.mail.internet.MimeUtilityクラスのメソッド
//    public static String encodeWord(String s)
//                                        throws UnsupportedEncodingException
//
////////////////////////////////////////////////////////////////////////////////

import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.activation.DataHandler;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.MimeMultipart;
import javax.mail.Multipart;

class m124 {
  public static void main(String args[]) {

    try{
      ///////////////////////////////////////////////
      // (手順１)smtpサーバとセッションを確立する。//
      ///////////////////////////////////////////////
      String smtphost = args[0]; // smtpサーバ。
      Properties prop = new Properties();
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
      String subject = "添付メール";

      //////////////////////////////////////////////////////////
      //(手順３)送信元、送信先、サブジェクト、本文を設定する。//
      //////////////////////////////////////////////////////////
      MimeMessage mm = new MimeMessage(ss);
      // 送信元メールアドレス(iafrom)の設定。
      mm.setFrom(iafrom);
      // 送信先メールアドレスの設定。
      mm.setRecipients(Message.RecipientType.TO,to);
      // サブジェクトの設定。日本語を使用する場合、"iso-2022-jp"を指定する。
      mm.setSubject(subject,"iso-2022-jp");

      ///////////////////////
      // 添付メールの作成。//
      ///////////////////////

      // １つ目のパートを作成。
      MimeBodyPart mbp1 = new MimeBodyPart();
      // メールの内容を設定。
      mbp1.setText("添付ファイルを送信します。","iso-2022-jp");

      // ２つ目のパートを作成。
      MimeBodyPart mbp2 = new MimeBodyPart();
      // 添付するファイルを設定。
      DataSource ds = new FileDataSource("m124.java");
      DataHandler dh = new DataHandler(ds);
      mbp2.setDataHandler(dh);
      // 添付するファイル名を設定。
      mbp2.setFileName(MimeUtility.encodeWord(ds.getName()));

      // 複数のパートを格納するMimeMultipartオブジェクトを作成。
      MimeMultipart mp = new MimeMultipart();
      // １つ目のパートを追加
      mp.addBodyPart(mbp1);
      // ２つ目のパートを追加
      mp.addBodyPart(mbp2);

      // MimeMultipartオブジェクトを本文に設定
      mm.setContent(mp);

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
c:\> javac m124.java
c:\> java m124 "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
送信終了
</pre>

</body>
</html>
