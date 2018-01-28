// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db113.java 
 * created : Time-stamp: <09/07/02(木) 19:45:29 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db113.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db113.java >>
//
//　データベース（１）：テーブルの作成・削除・一覧
//
//　●関連するSQLの構文
//
//　　USE データベース名
//　　　意味：利用するデータベースを選択する。
//　　SHOW TABLES
//　　　意味：テーブルの一覧を表示する。
//    CREATE TABLE テーブル名 (列名 データ型 オプション,…)
//　　　意味：テーブルを作成する。
//    DROP TABLE テーブル名
//　　　意味：テーブルを削除する。
//
//　●Statementインターフェースのメソッド
//    public boolean execute(String sql) throws SQLException
//      機能：任意のSQL文sqlを指定できる。
//            結果がResultSetオブジェクトの場合はtrue、結果がない場合はfalse。
//
//　●起動法
//　　MySQLは起動しているものとする。
//    (1) c:\>javac db113.java
//    (2) 新規テーブル作成
//        c:\>java db113 データベース名 create 新規テーブル名
//    (3) テーブル一覧
//        c:\>java db113 データベース名 show
//    (4) テーブル削除
//        c:\>java db113 データベース名 drop テーブル名
//    (5) テーブル一覧
//        c:\>java db113 データベース名 show
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db113 {
  public static void main(String args[]) {

    String database = args[0]; // データベース名。
    String cmd = args[1];      // サブコマンド。
    String table = "";         // テーブル名。
    if( args.length == 3 ) { table = args[2]; }  

    try{
      // (手順１)JDBCドライバのロード。
      String driver = "org.gjt.mm.mysql.Driver";
      Class.forName(driver);

      // (手順２)ユーザ(guest)としてデータベース(db1)に接続。
      String url = "jdbc:mysql://localhost/" + database; 
//      String user = "guest";
//      String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      // (手順３)SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
      Statement st = cn.createStatement();

      // (手順４)SQL文を作成・実行する。
      String q1 = "USE " + database;
      st.execute(q1);

      // (手順４)サブコマンド(create)の処理。SQL文を作成・実行する。
      if( cmd.equals("create") ) {
        String q2 = "CREATE TABLE " + table
                  + "(番号 INTEGER PRIMARY KEY, 名前 varchar(20)," 
                  + " 住所 varchar(80) )";
        st.execute(q2);
        System.out.print("データベース(" + database + ") ");
        System.out.println("テーブル(" + table + ")を作成しました");
      }

      // (手順４)サブコマンド(drop)の処理。SQL文を作成・実行する。
      if( cmd.equals("drop") ) {
        String q3 = "DROP TABLE " + table;
        st.execute(q3);
        System.out.print("データベース(" + database + ") ");
        System.out.println("テーブル(" + table + ")を削除しました");
      }

      // (手順４)サブコマンド(show)の処理。
      // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
      if( cmd.equals("show") ) {
        String q4 = "SHOW TABLES";
        ResultSet rs = st.executeQuery(q4);
        // (手順５)実行結果の表示。
        System.out.println("データベース：" + database);
        System.out.println("テーブル一覧");
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
c:\> javac db113.java

c:\> java db113 db1 create tb1
データベース(db1) テーブル(tb1)を作成しました

c:\> java db113 db1 show
データベース：db1
テーブル一覧
tb1

c:\> java db113 db1 drop tb1
データベース(db1) テーブル(tb1)を削除しました

c:\> java db113 db1 show
データベース：db1
テーブル一覧
</pre>

</body>
</html>
*/
