// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db126b.java 
 * created : Time-stamp: <09/07/07(火) 17:15:43 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db126b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db126b.java >>
//
//　データベース（２）：トランザクション処理（実験）
//
//      データベース(db1),テーブル(tb2)に対して、複数のプロセスがアクセスした
//      ときの整合性を調べる。
//      すなわち、一つのプロセスが一定回数レコードの更新を行い、その回数の合計と
//　　　レコードの記録が一致するかどうかをみる。
//
//　●準備
//　　事前に、管理者(root)が、ユーザ(guest)に対して、データベース(db1)に含まれる
//　　テーブル(tb2)へのすべての権限を与えておく。
//　　すなわち、つぎのコマンドを実行しておく必要がある。
//　　　mysql> grant all on db1.tb2 to guest@localhost identified by 'anyone';
//
//　●起動法
//　　MySQLは起動しているとする。
//    (1) c:\>javac db126b.java
//    (2) c:\>java db126b 繰り返し回数
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db126b {
  public static void main(String args[]) {

    String database = "db1"; // データベース名。
    String table = "tb2";    // テーブル名。
    int n = Integer.parseInt(args[0]); // 繰り返し回数args[0]。
    int n1=0, n2=0, n3=0;
    Connection cn;
    Statement st;
    ResultSet rs=null;

    String url = "jdbc:mysql://localhost/" + database +
                 "?useUnicode=true&characterEncoding=SJIS";
    String user = "guest";
    String passwd = "anyone";

    // 一定回数の繰り返し。
    for( int i=1; i<=n; i++ ) {

      try{
        // JDBCドライバのロード。
        String driver = "org.gjt.mm.mysql.Driver"; // JDBCドライバ。
        Class.forName(driver);

        // ユーザ(guest)としてデータベースに接続。
        cn = DriverManager.getConnection(url,user,passwd);

        ///////////////////////////
        // トランザクション処理。//
        ///////////////////////////
        cn.setAutoCommit(false); // トランザクション処理の開始。

        // SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
        st = cn.createStatement();

        try{
          ////////////////////////
          // SQL文を作成・実行。//
          ////////////////////////
          String q1 = "USE " + database;
          st.execute(q1);

          // テーブルのロック。
          String q2 = "LOCK TABLE " + table + " WRITE";
          st.execute(q2);

          // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
          String q3 = "SELECT * FROM " + table;
          rs = st.executeQuery(q3);

          rs.next();
          int m = rs.getInt("更新回数") + 1;

          String q4 = "UPDATE " + table + " SET 更新回数=" + m;
          st.executeUpdate(q4);

          n1++;
          cn.commit(); // トランザクション処理を正常終了。

        } catch( Exception e ) {
          System.out.println(e);
          n2++;
          cn.rollback(); // トランザクション処理を異常終了。

        } finally {
          n3++;
          cn.setAutoCommit(true); // トランザクション処理の終了。
        }

        // データベースとの接続を閉じる。
        cn.close();

      } catch( Exception e ) {
        System.out.println(e);
      }
    }

    /////////////////////
    // 最終結果の出力。//
    /////////////////////
    try {
      cn = DriverManager.getConnection(url,user,passwd);
      // SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
      st = cn.createStatement();

      String q1 = "USE " + database;
      st.execute(q1);

      // SQL文を作成・実行し、実行結果をResultSetオブジェクトに格納する。
      String q2 = "SELECT * FROM " + table;
      rs = st.executeQuery(q2);

      System.out.println("テーブル(" + table + ")の内容");
      while( rs.next() ) {
        System.out.println("更新回数：" + rs.getInt("更新回数"));
      }
      System.out.println();

    } catch( Exception e) { }

    System.out.println("繰り返し回数 = " + n);
    System.out.println("正常終了回数 = " + n1);
    System.out.println("異常終了回数 = " + n2);
    System.out.println("処理終了回数 = " + n3);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

同じプログラム(db126b)をほぼ同時に起動する。<br>
最終の更新回数が３０００となれば、正常に処理されている。<br><br>

テーブルをロックした場合、正しく処理されている。<br>
<img src="db126ba.jpg" width=500 height=250><br><br>
<img src="db126bb.jpg" width=500 height=250><br><br>
<img src="db126bc.jpg" width=500 height=250><br><br>

テーブルをロックしない場合、正しく処理されていない。<br>
<img src="db126bd.jpg" width=500 height=250><br><br>
<img src="db126be.jpg" width=500 height=250><br><br>
<img src="db126bf.jpg" width=500 height=250><br><br>
</body>
</html>
*/
