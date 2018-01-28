// -*- mode: java -*- Time-stamp: <2009-07-02 19:40:13 kahata>
/*====================================================================
 * name: db112.java 
 * created : Time-stamp: <09/06/30(火) 10:22:03 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db112.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db112.java >>
//
//　データベース（１）：データベースの一覧
//
//　　ユーザ(guest)でMySQLにアクセスし、利用できるデータベースの一覧を
//　　表示する。
//
//　●関連するSQLの構文
//
//　　SHOW DATABASES
//　　　意味：既存のデータベースを一覧表示する。
//
//　●java.sql.Statementインターフェース
//　　SQL文を実行し、作成された結果を返すために使用される。 
//
//　●Statementインターフェースのメソッド
//　　public ResultSet executeQuery(String sql) throws SQLException
//　　　機能：ResultSetオブジェクトを返すSQL文sqlを実行する。
//
//　●java.sql.ResultSetインターフェース
//　　ResultSetオブジェクトには、データベースに送られたSQL文の実行結果が
//　　保存される。 
//　　ResultSetオブジェクトにはポインタがあり、SQL文が実行された直後、
//　　ポインタは、先頭行の前を指している。nextメソッドの最初の呼び出しによって、
//　　先頭行を指すようになる。
//
//　●ResultSetインターフェースのメソッド
//    public String getString(int n) throws SQLException
//　　　機能：ResultSetオブジェクトの現在行にある指定された列(n番目)の値を、
//　　　　　　Stringとして取得する。
//    public boolean next() throws SQLException
//　　　機能：ポインタを現在の位置からひとつ進める。
//　        　データがない場合に falseを返す。
//
//　●起動法
//　　MySQLはすでに起動しているとする。
//    (1) c:\>javac db112.java
//    (2) c:\>java db112 show
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db112 {
  public static void main(String args[]) {

//    String cmd = args[0]; // サブコマンド。
    String cmd = "show"; // サブコマンド。

    try{
      // (手順１)JDBCドライバのロード。
      String driver = "org.gjt.mm.mysql.Driver"; 
      Class.forName(driver);

      // (手順２)データベースに接続(ユーザ(guest))。
      String url = "jdbc:mysql://localhost/";  
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      // (手順３)SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
      Statement st = cn.createStatement();

      // (手順４)サブコマンド(show)の処理。
      // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
      if( cmd.equals("show") ) {
        String q = "SHOW DATABASES";
        ResultSet rs = st.executeQuery(q);
 
        // (手順５)実行結果の表示。
        System.out.println("データベース一覧");
        while( rs.next() ) {
          System.out.println(rs.getString(1));
        }
      }

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
c:\> javac db112.java
c:\> java db112 show
データベース一覧
db1
</pre>

</body>
</html>
*/
