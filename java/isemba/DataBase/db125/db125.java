///////////////////////////////////////////////////////////////////////////////
//  << db125.java >>
//
//　データベース（２）：トランザクション処理（レコードの更新）
//
//　●関連するSQLの構文
//
//　　UPDATE FROM テーブル名 SET 列名=値 WHERE 更新条件
//    　意味：更新条件を満たすレコードについて、列を値に更新する。
//
//　●準備
//　　事前に、管理者(root)が、ユーザ(guest)に対して、データベース(db1)に含まれる
//　　テーブル(tb1)へのすべての権限を与えておく。
//　　すなわち、つぎのコマンドを実行しておく必要がある。
//　　　mysql> grant all on db1.tb1 to guest@localhost identified by 'anyone';
//
//　●起動法
//　　MySQLは起動しているとする。
//    (1) c:\>javac db125.java
//    (2) c:\>java db125
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db125 {
  public static void main(String args[]) {

    String database = args[0]; // データベース名。
    String table = args[1];    // テーブル名。

    try{
      // JDBCドライバのロード。
      String driver = "org.gjt.mm.mysql.Driver"; // JDBCドライバ。
      Class.forName(driver);

      // データベースへの接続。
      String url = "jdbc:mysql://localhost/" + database + 
                   "?useUnicode=true&characterEncoding=SJIS"; // データベース。
      String user = "guest";
      String passwd = "anyone";
      Connection cn = DriverManager.getConnection(url,user,passwd);

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

        String q2 = "LOCK TABLE " + table + " WRITE";
        st.execute(q2);

        // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
        String q3 = "UPDATE " + table + " SET 住所='茨城県潮来市' " + 
                    "WHERE 名前='水戸太郎'";
        st.executeUpdate(q3);

        String q4 = "SELECT * FROM " + table;
        ResultSet rs = st.executeQuery(q4);

        /////////////////////
        // 実行結果の表示。//
        /////////////////////
        System.out.println("データベース："+database);
        System.out.println("テーブル："+table);
        while( rs.next() ) {
          System.out.println("番号：" + rs.getInt("番号"));
          System.out.println("名前：" + rs.getString("名前"));
          System.out.println("住所：" + rs.getString("住所"));
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

/*<font size=5 color=blue>実行結果</font>

<pre>
c:\> javac db125.java
c:\> java db125
データベース：db1
テーブル：tb1
番号：1
名前：水戸太郎
住所：茨城県潮来市
</pre>
*/
