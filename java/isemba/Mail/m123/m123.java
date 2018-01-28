<!--====================================================================-->
<!-- << m123.htm >>                                                     -->
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
//  << m123.java >>
//
//　メール（２）：メールの送信(画像メール)
//
//　　画像メールの送信。
//
//　●書き方
//      DataSource ds = new FileDataSource("画像ファイル名"); 
//      DataHandler dh = new DataHandler(ds);     
//      mm.setDataHandler(dh);
//　
//　●JAF(JavaBeans Activation Framework)
//　　データのタイプを識別し、そのデータにだされた処理を行うコンポーネントを
//　　動的に呼び出す仕組みである。
//    したがって、画像ファイルのように複数の表現形式がある場合に扱いが簡明になる。
//
//　●javax.activation.FileDataSourceクラス
//　  public class FileDataSource extends Object implements DataSource
//
//　●javax.activation.FileDataSourceクラスのコンストラクタ
//    public FileDataSource(String s)　
//      機能：送信するファイル名sからDataSourceオブジェクトを作成する。
//
//　●javax.activation.DataSourceインターフェース
//    public interface DataSource
//
//　●javax.activation.DataHandlerクラス
//    public class DataHandler extends Object implements Transferable
//
//　●javax.activation.DataHandlerクラスのコンストラクタ
//    public DataHandler(DataSource ds)
//    　機能：DataSourceオブジェクトからDataHandlerオブジェクトを作成する。
//
//　●javax.mail.internet.MimeMessageクラスのメソッド
//    public void setDataHandler(DataHandler dh) throws MessagingException
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

class m123 {
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
      String subject = "画像メール";

      //////////////////////////////////////////////////////////////
      //(手順３)送信元、送信先、サブジェクト、本文などを設定する。//
      //////////////////////////////////////////////////////////////
      MimeMessage mm = new MimeMessage(ss);
      // 送信元メールアドレス(iafrom)の設定。
      mm.setFrom(iafrom);
      // 送信先メールアドレスの設定。
      mm.setRecipients(Message.RecipientType.TO,to);
      // サブジェクトの設定。日本語を使用する場合、"iso-2022-jp"を指定する。
      mm.setSubject(subject,"iso-2022-jp");
      // 画像ファイルの設定。
      DataSource ds = new FileDataSource("semba.gif"); 
      DataHandler dh = new DataHandler(ds);     
      mm.setDataHandler(dh);

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
c:\> javac m123.java
c:\> java m123 "xxx.yyy.zzz" "xyz@xxx.yyy.zzz" "abc@aaa.bbb.ccc"
送信終了
</pre>

</body>
</html>
