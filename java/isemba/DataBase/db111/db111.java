// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db111.java 
 * created : Time-stamp: <09/06/30(火) 10:20:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db111.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db111.java >>
//
//　データベース（１）：データベース利用の準備
//
//　●データベース利用の手順
//
//　　(手順１)JDBCドライバのロード。
//            利用するデータベース(MySQL)のJDBCドライバをJDBCドライバマネージャ
//　　　　　　に登録する。
//　　(手順２)データベースに接続。
//　　(手順３)SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
//　　(手順４)SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
//　　(手順５)実行結果の表示。
//　　(手順６)データベースとの接続を閉じる。
//
//　●java.lang.Classクラスのメソッド
//    public static Class forName(String s) throws ClassNotFoundException
//      機能：指定された文字列sを持つクラスまたはインタフェースのオブジェクトを
//　　　　　　返す。
//　　　　　  forName("X") の呼び出しによって、X というクラスが初期化される。 
//
//　●java.sql.DriverManagerクラス
//　　JDBCドライバを管理するためのクラス。
//
//　●DriverManagerクラスのメソッド
//    public static Connection getConnection(String url,
//                                           String user,
//                                           String password)
//                                           throws SQLException
//　　　機能：指定されたデータベースを指すURLへの接続を試みる。
//            url - jdbc:subprotocol://subname形式でデータベースを指定。
//                  MySQLのsubname形式は、ホスト名/データベース名?属性 となる。
//　　　　　　　　　[例] jdbc:mysql://localhost/mydbase
//            user - MySQLに登録されたユーザ名
//            password - MySQLに登録されたユーザのパスワード 
//
//　●java.sql.Connectionインターフェース
//　　特定のデータベースとの接続(セッション)を表現する。接続のコンテキスト内で
//　　SQL文が実行され結果が返される。
//
//　●Connectionインターフェースのメソッド
//　　public Statement createStatement() throws SQLException
//　　　機能：SQL文をデータベースに送るためのStatementオブジェクトを作成する。
//
//　●起動法
//　　MySQLはWindows起動時に起動されているとする。
//    (1) c:\>javac db111.java
//    (2) c:\>java db111
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db111 {
  public static void main(String args[]) {

    try{
      // (手順１)JDBCドライバのロード。
      // MySQLのJDBCドライバは、クラス名(org.git.mm.mysql.Driver)をもつ。
      // このドライバは、JARファイル(mysql-connector-java-3.1.10-bin.jar)に
      // 格納されている。
      String driver = "org.gjt.mm.mysql.Driver"; 
      // JDBCドライバーは自分自身をJDBCドライバマネージャに登録する。
      Class.forName(driver);

      // (手順２)ユーザ(guest)、パスワード(anyone)としてデータベース(db1)に接続。
      String url = "jdbc:mysql://localhost/test";  
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      System.out.println("データベースへの接続完了");

      // (手順３)SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。

      // (手順４)SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。

      // (手順５)実行結果の表示。

      // (手順６)データベースとの接続を閉じる。
      cn.close();

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
} 
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac db111.java
c:\> java db111 

データベースへの接続完了
</pre>

</body>
</html>
*/
