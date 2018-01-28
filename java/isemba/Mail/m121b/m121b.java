/*
<!--====================================================================-->
<!-- << m121b.htm >>                                                    -->
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
//  << m121b.java >>
//
//　メール（２）：メール送信の手順（手順２）
//
//　　手順２を説明する。
//
//　●手順
//　　(手順１)SMTPサーバとセッションを確立する。
//　　　　　　Sessionオブジェクトを取得する。
//　　(手順２)送信元、送信先、サブジェクト、本文などを作成する。
//　　(手順３)送信元、送信先、サブジェクト、本文などを設定する。
//　　　　　　SessionオブジェクトからMimeMessageオブジェクトを作成する。
//　　　　　　MimeMessageオブジェクトに送信元、送信先、サブジェクト、本文などを
//　　　　　　設定する。
//　　(手順４)メールの送信。
//　　　　　　Transportクラスのsendメソッドを使って、MimeMessageオブジェクトを
//　　　　　　メールとして送信する。
//
//　●javax.mail.internet.InternetAddressクラス
//    インターネットのメールアドレスを表す。
//
//　●javax.mail.internet.InternetAddressクラスのコンストラクタ
//    public InternetAddress(String address) throws AddressException
//　　　機能：メールアドレスaddressからインターネットアドレスを作成する。
//    public InternetAddress(String address, String s, String cs)
//                                       throws UnsupportedEncodingException
//　　　機能：メールアドレスaddressから名前sをもつインターネットアドレスを
//　　　　　　作成する。日本語の名前の場合、文字セットcsを使う。
//
////////////////////////////////////////////////////////////////////////////////
*/
import javax.mail.Session;
import java.util.Properties;
import javax.mail.internet.InternetAddress;

class m121b {
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
      String subject = "メール";
      // 本文の最後に、改行コード(\n)を入れておかないと、受信時に不明な文字が
      // 表示されることがある。
      String text = "abc 123 こんにちは\n";

      //////////////////////////////////////////////////////////////
      //(手順３)送信元、送信先、サブジェクト、本文などを設定する。//
      //////////////////////////////////////////////////////////////

      //////////////////////////
      //(手順４)メールの送信。//
      //////////////////////////

      System.out.println("送信終了");

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

</body>
</html>
*/