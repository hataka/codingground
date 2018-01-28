// -*- mode: java -*- Time-stamp: <2009-07-03 16:28:12 kahata>
/*====================================================================
 * name: db122.java 
 * created : Time-stamp: <09/07/03(金) 16:22:25 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db122.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db122.java >>
//
//　データベース（２）：トランザクション処理（レコードの登録と表示）
//
//　●関連するSQLの構文
//
//　　INSERT INTO テーブル名 (列名,…) VALUES(データ,…)
//    　意味：テーブルにレコードを追加する。
//　　SELECT * FROM テーブル名
//    　意味：テーブルにおいて、すべてのレコードを選ぶ。
//　　LOCK TABLE テーブル名 WRITE
//    　意味：テーブルを排他的に占有し、他のユーザからの処理をさせない。
//　　LOCK TABLE テーブル名 READ
//    　意味：他のユーザにテーブルからの読み込みのみ許す。
//　　UNLOCK TABLE テーブル名
//    　意味：テーブルへのロックを解除する。
//
//　●java.sql.Statementインターフェース
//　　SQL文を実行し、作成された結果を返すために使用される。 
//
//　●Statementインターフェースのメソッド
//　　public ResultSet executeQuery(String sql) throws SQLException
//　　　機能：ResultSetオブジェクトを返すSQL文sqlを実行する。
//　　public int executeUpdate(String sql) throws SQLException
//　　　機能：INSERT文、UPDATE文、またはDELETE文を実行する。
//    public boolean execute(String sql) throws SQLException
//      機能：任意のSQL文sqlを指定できる。
//            次の結果がResultSetオブジェクトの場合はtrue、更新カウントまたは
//　　　　　　結果がない場合はfalse。
//
//　●ResultSetインターフェースのメソッド
//    public int getInt(String s) throws SQLException
//　　　機能：ResultSetオブジェクトの現在行にある指定された列sの値を、Javaの
//　　　　　　int型として取得する。 
//    public String getString(String s) throws SQLException
//　　　機能：ResultSetオブジェクトの現在行にある指定された列sの値を、Javaの
//　　　　　　String型として取得する。 
//
//　●準備
//　　事前に、管理者(root)が、ユーザ(guest)に対して、データベース(db1)に含まれる
//　　テーブル(tb1)へのすべての権限を与えておく。
//　　すなわち、つぎのコマンドを実行しておく必要がある。
//　　　mysql> grant all on db1.tb1 to guest@localhost identified by 'anyone';
//
//　●起動法
//　　MySQLはすでに起動しているとする。
//    (1) c:\>javac db122.java
//    (2) c:\>java db122 db1 tb1
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db122 {
  public static void main(String args[]) {

//  String database = args[0]; // データベース名。
//  String table = args[1];    // テーブル名。
    String database = "test";  // データベース名。
    String table = "tb1";      // テーブル名。

    try{
      // JDBCドライバのロード。
      String driver = "org.gjt.mm.mysql.Driver"; // JDBCドライバ。
      Class.forName(driver);

      // ユーザ(guest)としてデータベースに接続。
      String url = "jdbc:mysql://localhost/" + database + 
                   "?useUnicode=true&characterEncoding=SJIS"; // データベース。
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      ///////////////////////////
      // トランザクション処理。//
      ///////////////////////////
      cn.setAutoCommit(false); // トランザクション処理の開始。

      try{
        // SQL文をデータベースに送る機能を持つStatementオブジェクトを生成する。
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
        String q6 = "SELECT * FROM " + table;
        ResultSet rs = st.executeQuery(q6);

        /////////////////////
        // 実行結果の表示。//
        /////////////////////
        System.out.println("データベース：" + database);
        System.out.println("テーブル：" + table);
        while( rs.next() ) {
          System.out.println("番号：" + rs.getInt("番号"));
          System.out.println("名前：" + rs.getString("名前"));
          System.out.println("住所：" + rs.getString("住所"));
        }

        String q7 = "DROP TABLE " + table;
        st.execute(q7);
        System.out.print("データベース(" + database + ") ");
        System.out.println("テーブル(" + table + ")を削除しました");


        String q8 = "SHOW TABLES";
//      ResultSet rs = st.executeQuery(q9);
        rs = st.executeQuery(q8);

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
c:\> javac db122.java
c:\> java db122　db1 tb1
データベース：db1
テーブル：tb1
番号：1
名前：水戸太郎
住所：茨城県水戸市
番号：2
名前：日立花子
住所：茨城県日立市
</pre>

</body>
</html>
*/
