// -*- mode: java -*- Time-stamp: <2009-07-02 20:56:41 kahata>
/*====================================================================
 * name: db115.java 
 * created : Time-stamp: <09/07/02(木) 20:54:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db115.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db115.java >>
//
//　データベース（１）：テーブルの作成(レコードの検索)
//
//　●関連するSQLの構文
//
//　　SELECT * FROM テーブル名 WHERE 検索条件
//    　意味：テーブル中の列において、検索条件を満たすものを選ぶ。
//
//　●起動法
//　　MySQLは起動しているものとする。
//    (1) c:\>javac db115.java
//    (2) c:\>java db115 db1 tb1
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db115 {
  public static void main(String args[]) {

//  String database = args[0]; // データベース名。
//  String table = args[1];    // テーブル名。
    String database = "test";  // データベース名。
    String table = "tb1";      // テーブル名。

    try{
      // (手順１)JDBCドライバのロード。
      String driver = "org.gjt.mm.mysql.Driver";
      Class.forName(driver);

      // (手順２)ユーザ(guest)としてデータベース(db1)に接続。
      // テーブルで日本語を扱う場合、属性(useUnicode=true&characterEncoding=SJIS)
      // を指定する。
      String url = "jdbc:mysql://localhost/" + database +  
                   "?useUnicode=true&characterEncoding=SJIS"; // データベース。
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      // (手順３)SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
      Statement st = cn.createStatement();

      // (手順４)SQL文を作成・実行する。
        String q1 = "USE " + database;
        st.execute(q1);                     


        String q2 = "CREATE TABLE " + table
                  + "(番号 INTEGER PRIMARY KEY, 名前 varchar(20)," 
                  + " 住所 varchar(80) )";
        st.execute(q2);

        String q3 = "INSERT INTO " + table + " (番号,名前,住所) " +
                    "VALUES(1,'水戸太郎','茨城県水戸市')";
        st.executeUpdate(q3);

        String q4 = "INSERT INTO " + table + " (番号,名前,住所) " + 
                    "VALUES(2,'日立花子','茨城県日立市')";
        st.executeUpdate(q4);


        // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
        String q5 = "SELECT * FROM " + table + " WHERE 名前='日立花子'";
        ResultSet rs = st.executeQuery(q5);

      // (手順５)実行結果の表示。
        System.out.println("データベース：" + database);
        System.out.println("テーブル：" + table);
        while( rs.next() ) {
          System.out.println("番号：" + rs.getInt("番号"));
          System.out.println("名前：" + rs.getString("名前"));
          System.out.println("住所：" + rs.getString("住所"));
        }


        String q6 = "DROP TABLE " + table;
        st.execute(q6);
        System.out.print("データベース(" + database + ") ");
        System.out.println("テーブル(" + table + ")を削除しました");


        String q7 = "SHOW TABLES";
        rs = st.executeQuery(q7);
        // (手順５)実行結果の表示。
        System.out.println("データベース：" + database);
        System.out.println("テーブル一覧");
        while( rs.next() ) {
          System.out.println(rs.getString(1));
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
c:\> javac db115.java
c:\> java db115 db1 tb1
データベース：db1
テーブル：tb1
番号：2
名前：日立花子
住所：茨城県日立市
</pre>

</body>
</html>
*/
