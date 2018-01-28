// -*- mode: java -*- Time-stamp: <2009-07-04 08:19:06 kahata>
/*====================================================================
 * name: db124.java 
 * created : Time-stamp: <09/07/04(土) 08:13:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db124.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db124.java >>
//
//　データベース（２）：トランザクション処理（レコードの削除）
//
//　●関連するSQLの構文
//
//　　DELETE FROM テーブル名 WHERE 削除条件
//    　意味：テーブルにおいて、削除条件を満たすものを削除する。
//
//　●準備
//　　事前に、管理者(root)が、ユーザ(guest)に対して、データベース(db1)に含まれる
//　　テーブル(tb1)へのすべての権限を与えておく。
//　　すなわち、つぎのコマンドを実行しておく必要がある。
//　　　mysql> grant all on db1.tb1 to guest@localhost identified by 'anyone';
//
//　●起動法
//　　MySQLは起動しているとする。
//    (1) c:\>javac db124.java
//    (2) c:\>java db124
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db124 {
  public static void main(String args[]) {

//  String database = args[0]; // データベース名。
//  String table = args[1];    // テーブル名。
    String database = "test";  // データベース名。
    String table = "tb1";      // テーブル名。

    try{
      // JDBCドライバのロード。
      String driver = "org.gjt.mm.mysql.Driver"; // JDBCドライバ。
      Class.forName(driver);

      // データベースへの接続。
      String url = "jdbc:mysql://localhost/" + database + 
                   "?useUnicode=true&characterEncoding=SJIS"; // データベース。
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      System.out.println("データベース："+database);
      System.out.println("テーブル："+table);
      ///////////////////////////
      // トランザクション処理。//
      ///////////////////////////
      cn.setAutoCommit(false); // トランザクション処理の開始。

      try{
        // SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
        Statement st = cn.createStatement();

        ////////////////////////
        // SQL文を作成・実行。//
        ////////////////////////
        String q1 = "USE " + database;
        st.execute(q1);

        String q2 = "CREATE TABLE " + table
                  + "(番号 INTEGER PRIMARY KEY, 名前 varchar(20)," 
                  + " 住所 varchar(80) )";
        st.execute(q2);

        String q3 = "LOCK TABLE " + table + " WRITE";
        st.execute(q3);

        String q4 = "INSERT INTO " + table + " (番号,名前,住所) " +
                    "VALUES(1,'水戸太郎','茨城県水戸市')";
        st.executeUpdate(q4);

        String q5 = "INSERT INTO " + table + " (番号,名前,住所) " + 
                    "VALUES(2,'日立花子','茨城県日立市')";
        st.executeUpdate(q5);

        // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
        String q6 = "SELECT * FROM " + table + " WHERE 名前='日立花子'";
        ResultSet rs = st.executeQuery(q6);
        // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
        System.out.println("SELECT * FROM " + table + " WHERE 名前='日立花子'" + " を実行しました ");

        /////////////////////
        // 実行結果の表示。//
        /////////////////////
 //       System.out.println("データベース："+database);
 //       System.out.println("テーブル："+table);
        while( rs.next() ) {
          System.out.println("番号：" + rs.getInt("番号"));
          System.out.println("名前：" + rs.getString("名前"));
          System.out.println("住所：" + rs.getString("住所"));
        }

        String q7 = "DELETE FROM " + table + " WHERE 番号=2";
        st.executeUpdate(q7);
        System.out.println("DELETE FROM " + table + " WHERE 番号=2" + " を実行しました");

        String q8 = "SELECT * FROM " + table;
        rs = st.executeQuery(q8);

        /////////////////////
        // 実行結果の表示。//
        /////////////////////
//        System.out.println("データベース："+database);
//        System.out.println("テーブル："+table);
        while( rs.next() ) {
          System.out.println("番号：" + rs.getInt("番号"));
          System.out.println("名前：" + rs.getString("名前"));
          System.out.println("住所：" + rs.getString("住所"));
        }

        String q9 = "DROP TABLE " + table;
        st.execute(q9);
        System.out.print("データベース(" + database + ") ");
        System.out.println("テーブル(" + table + ")を削除しました");


        String q10 = "SHOW TABLES";
//      ResultSet rs = st.executeQuery(q10);
        rs = st.executeQuery(q10);

        // (手順５)実行結果の表示。
        System.out.println("データベース：" + database);
        System.out.println("テーブル一覧");
        while( rs.next() ) {
          System.out.println(rs.getString(1));
        }

        cn.commit(); // トランザクション処理を正常終了。

      } catch( Exception e ) {
        System.out.println(e);
        cn.rollback(); // トランザクション処理を異常終了。

      } finally {
        cn.setAutoCommit(true); 
      }

      // データベースとの接続を閉じる。
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
c:\> javac db124.java
c:\> java db124
データベース：db1
テーブル：tb1
番号：1
名前：水戸太郎
住所：茨城県水戸市
</pre>

</body>
</html>
*/
