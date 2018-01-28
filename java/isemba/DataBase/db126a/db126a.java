// -*- mode: java -*- Time-stamp: <2009-07-04 08:39:10 kahata>
/*====================================================================
 * name: db126a.java 
 * created : Time-stamp: <09/07/04(土) 08:34:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/DATABASE/db126a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db126a.java >>
//
//　データベース（２）：トランザクション処理（実験、サンプルテーブルの作成）
//
//　　　データベース(db1),テーブル(tb2)を作成し、更新回数の初期設定を行う。
//
//　●準備
//　　事前に、管理者(root)が、ユーザ(guest)に対して、データベース(db1)に含まれる
//　　テーブル(tb2)へのすべての権限を与えておく。
//　　すなわち、つぎのコマンドを実行しておく必要がある。
//　　　mysql> grant all on db1.tb2 to guest@localhost identified by 'anyone';
//
//　●起動法
//　　MySQLは起動しているとする。
//    (1) c:\>javac db126a.java
//    (2) c:\>java db126a
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db126a {
  public static void main(String args[]) {

    String database = "db1"; // データベース名。
    String table = "tb2";    // テーブル名。

    String url = "jdbc:mysql://localhost/" + database +
                 "?useUnicode=true&characterEncoding=SJIS";
    String user = "guest";
    String passwd = "anyone";

    try{
      // JDBCドライバのロード。
      String driver = "org.gjt.mm.mysql.Driver"; // JDBCドライバ。
      Class.forName(driver);

      // ユーザ(guest)としてデータベースに接続。
      Connection cn = DriverManager.getConnection(url,user,passwd);

      // SQL文をデータベースに送る機能を持つStatementオブジェクトを作成 。
      Statement st = cn.createStatement();

      try{
        String q1 = "USE " + database;
        st.execute(q1);

        String q2 = "CREATE TABLE " + table + "(更新回数 INTEGER)";
        st.execute(q2);

        String q3 = "INSERT INTO " + table + "(更新回数) " + "VALUE(0)";
        st.executeUpdate(q3);

        // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
        String q4 = "SELECT * FROM " + table;
        ResultSet rs = st.executeQuery(q4);

        while( rs.next() ) {
          System.out.println("更新回数：" + rs.getInt("更新回数"));
        }

        String q5 = "DROP TABLE " + table;
        st.execute(q5);
        System.out.print("データベース(" + database + ") ");
        System.out.println("テーブル(" + table + ")を削除しました");


        String q6 = "SHOW TABLES";
        ResultSet rsa = st.executeQuery(q6);
//      rs = st.executeQuery(q6);

        // (手順５)実行結果の表示。
        System.out.println("データベース：" + database);
        System.out.println("テーブル一覧");
        while( rsa.next() ) {
          System.out.println(rsa.getString(1));
        }

      // データベースとの接続を閉じる。
      cn.close();

      } catch( Exception e ) {
        System.out.println(e);
      }
  } catch(Exception e){}
}
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac db126a.java
c:\> java db126a
更新回数：0
</pre>

</body>
</html>
*/
