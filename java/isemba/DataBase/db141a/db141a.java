<!--====================================================================-->
<!-- << db141a.htm >>                                                   -->
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
<%--============================================================================
  << db141a.jsp >>

  データベース（４）：ＪＳＰからデータベースへアクセス

  ●機能
  　操作１：フォームからデータベース名、テーブル名、ユーザ名、パスワードを
  　　　　　入力する。
　　操作２：レコードの表示。
　　操作３：レコードの追加と削除。

　●起動法
    (1)MySQLを起動する。
    (2)Tomcatを起動する。
　　(3)JSPファイル(db141a.jsp)を作成し、
　　　　 %CATALINA_HOME%\webapps\SV\db141a.jsp
       に保存する。
    (4)URL(http://localhost:8080/SV/db141a.htm)を指定する。
============================================================================--%>

<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ page import="java.sql.*" %>

<html>
<head><title>データベース処理</title></head>
<body>

<%
  // データベース処理中、データベース名、テーブル名、ユーザ名、パスワードを
  // 保存しておくため、セッション機能を使う。
  String database=null, table=null, user=null, password=null;

  /////////////////////////////
  // フォームのデータを取得。//
  /////////////////////////////
  request.setCharacterEncoding("JISAutoDetect");
  String cmd = request.getParameter("cmd");

  // [実行]ボタンに対応する処理。
  if( "実行".equals(cmd) ) {
    database = request.getParameter("db1");
    session.setAttribute("DB1",database);
    table = request.getParameter("db2");
    session.setAttribute("DB2",table);
    user = request.getParameter("db3");
    session.setAttribute("DB3",user);
    password = request.getParameter("db4");
    session.setAttribute("DB4",password);
  } else {
    database = (String)session.getAttribute("DB1");
    table = (String)session.getAttribute("DB2");
    user = (String)session.getAttribute("DB3");
    password = (String)session.getAttribute("DB4");
  }
%>

データベース処理<br>
データベース：<%= database %>　テーブル：<%= table %>
<form action=http://localhost:8080/SV/db141a.jsp method=POST>
  <input type=submit name=cmd value=表示>
  <input type=submit name=cmd value=消去>
  <input type=submit name=cmd value=追加>
  <input type=submit name=cmd value=削除>
</form>

<%
  // [消去]ボタンに対応する処理。
  if( "消去".equals(cmd) ) {
    out.println("消去しました"
              + "</body>"
              + "</html>");
    return;
  }

  // [追加]ボタンに対応する処理。
  if( "追加".equals(cmd) ) {
    out.println("<form action=http://localhost:8080/SV/db141a.jsp "
              + "method=POST>"
              + "番号：<input type=text size=5 name=a1><br>"
              + "名前：<input type=text size=20 name=a2><br>"
              + "住所：<input type=text size=40 name=a3><br>"
              + "<input type=submit name=add value=追加実行>"
              + "</form>"
              + "</body>"
              + "</html>");
    return;
  }

  // [削除]ボタンに対応する処理。
  if( "削除".equals(cmd) ) {
    out.println("<form action=http://localhost:8080/SV/db141a.jsp "
              + "method=POST>"
              + "削除条件：<input type=text size=20 name=d1><br>"
              + "<input type=submit name=del value=削除実行>"
              + "</form>"
              + "</body>"
              + "</html>");
    return;
  }
%>

<%
  ////////////////////////////
  // データベース処理(開始) //
  ////////////////////////////
  try{
    // JDBCドライバのロード。
    String driver = "org.gjt.mm.mysql.Driver"; // JDBCドライバ。
    Class.forName(driver);

    // データベースに接続。
    String url = "jdbc:mysql://localhost/" + database +
                 "?useUnicode=true&characterEncoding=SJIS"; // データベース。
    Connection cn = DriverManager.getConnection(url,user,password);

    ////////////////////////////////
    // トランザクション処理(開始) //
    ////////////////////////////////
    cn.setAutoCommit(false);

    try{
      // SQL文をデータベースに送る機能を持つStatementオブジェクトを作成。
      Statement st = cn.createStatement();

      // [表示]ボタンに対応する処理。
      if( "表示".equals(cmd) ) {
        // SQL文を作成し実行。
        String q1 = "USE " + database;
        st.execute(q1);
        String q2 = "LOCK TABLE " + table + " WRITE";
        st.execute(q2);
        String q3 = "SELECT * FROM " + table;
        ResultSet rs = st.executeQuery(q3);
        // 実行結果の表示。
        out.println("[レコードの表示開始]<br>" + "<hr>");
        while( rs.next() ) {
          out.println("番号：" + rs.getInt("番号") + "　"
                    + "名前：" + rs.getString("名前") + "　"
                    + "住所：" + rs.getString("住所") + "<br>"
                    + "<hr>");
        }
        out.println("[レコードの表示終了]<br>");
      }

      // [追加実行]ボタンに対応する処理。
      String add = request.getParameter("add");
      if( "追加実行".equals(add) ) {
        String a1 = request.getParameter("a1");
        String a2 = request.getParameter("a2");
        String a3 = request.getParameter("a3");
        // SQL文を作成し実行。
        String q1 = "USE " + database;
        st.execute(q1);
        String q2 = "LOCK TABLE " + table + " WRITE";
        st.execute(q2);
        String q3 = "INSERT INTO " + table + " (番号,名前,住所  ) " +
             "VALUES(" + a1 + ",'" + a2 + "','" + a3 +   "')";
        st.executeUpdate(q3);
        // 実行結果の表示。
        out.println("[レコードの追加終了]<br>");
      }

      // [削除実行]ボタンに対応する処理。
      String del = request.getParameter("del");
      if( "削除実行".equals(del) ) {
        String d1 = request.getParameter("d1");
        // SQL文を作成し実行。
        String q1 = "USE " + database;
        st.execute(q1);
        String q2 = "LOCK TABLE " + table + " WRITE";
        st.execute(q2);
        String q3 = "DELETE FROM " + table + " WHERE " + d1;
        st.executeUpdate(q3);
        String q4 = "SELECT COUNT(*) FROM " + table;
        ResultSet rs = st.executeQuery(q4);
        // 実行結果の表示。
        while( rs.next() ) {
          out.println("現在のレコード数：" + rs.getInt(1  ) + "<br>");
        }
        out.println("[レコードの削除終了]<br>");
      }
      cn.commit(); // トランザクション処理を正常終了。
    } catch( Exception e ) {
      System.out.println(e);
      cn.rollback(); // トランザクション処理を異常終了。
    } finally {
      cn.setAutoCommit(true); // トランザクション処理の終了。
    }
    ////////////////////////////////
    // トランザクション処理(終了) //
    ////////////////////////////////

    // データベースとの接続を閉じる。
    cn.close();
  } catch( Exception e ) {
    System.out.println(e);
  }
  ////////////////////////////
  // データベース処理(終了) //
  ////////////////////////////
%>

</body>
</html>
</pre>

<font size=5 color=blue>HTMLファイル(hp141a.htm)</font><br>

<pre>
<!-- << hp141a.htm >> -->
<html>
<head><title>データベース処理</title></head>
<body>
データベース処理
<form action=http://localhost:8080/SV/db141a.jsp method=POST>
データベース：<input type=text size=30 name=db1><br>
テーブル　　：<input type=text size=30 name=db2><br>
ユーザ　　　：<input type=text size=20 name=db3><br>
パスワード　：<input type=password size=20 name=db4><br>
<input type=submit name=cmd value=実行>
</form>
</body>
</html>
</pre>

<font size=5 color=blue>実行結果</font><br><br>

URL(http://localhost:8080/SV/hp141a.htm)を指定後<br>
<img src="db141aa.jpg" width=400 height=250><br><br>
<img src="db141ab.jpg" width=400 height=250><br><br>

実行をクリック後<br>
<img src="db141ac.jpg" width=400 height=250><br><br>

表示をクリック後<br>
<img src="db141ad.jpg" width=400 height=350><br><br>

消去をクリック後<br>
<img src="db141ae.jpg" width=400 height=250><br><br>

追加をクリック後<br>
<img src="db141af.jpg" width=400 height=300><br><br>

追加実行をクリック後<br>
<img src="db141ag.jpg" width=400 height=250><br><br>

表示をクリック後<br>
<img src="db141ah.jpg" width=400 height=350><br><br>

削除をクリック後<br>
<img src="db141ai.jpg" width=400 height=300><br><br>

削除実行をクリック後<br>
<img src="db141aj.jpg" width=400 height=300><br><br>

表示をクリック後<br>
<img src="db141ak.jpg" width=400 height=300><br><br>

</body>
</html>
