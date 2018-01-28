// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db131a.java 
 * created : Time-stamp: <09/07/07(火) 17:21:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db131a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db131a.java >>
//
//　データベース（３）：サーブレットからデータベースへアクセス
//
//　　プログラムの構造を示す。
//
//　●機能
//　　操作１：フォームからデータベース名、テーブル名、ユーザ名、パスワードを
//　　　　　　入力する。
//　　操作２：レコードの表示。
//　　操作３：レコードの追加と削除。
//
//　●ファイルの配置
//　　(1)Javaファイル(db131a.java)をコンパイルし、classファイル(db131a.class)を
//       作成する。
//       ただし、Javaファイル(db131a.java)は、
//　　　　   %CATALINA_HOME%\webapps\SV\WEB-INF\classes\db131a.java
//   　　classファイル(db131a.class)は、
//   　　　　%CATALINA_HOME%\webapps\SV\WEB-INF\classes\db131a.class
//       に保存する。
//    (2)HTMLファイル(hp131a.htm)は、
//   　　　　%CATALINA_HOME%\webapps\SV\hp131a.htm
//       に保存する。
//    (3)URL(http://localhost:8080/SV/hp131a.htm)を指定する。
//
///////////////////////////////////////////////////////////////////////////////

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class db131a extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException,IOException {

    // データベース処理中、データベース名、テーブル名、ユーザ名、パスワードを
    // 保存しておくため、セッション機能を使う。
    HttpSession hs = request.getSession();
    String database, table, user, password;
    ResultSet rs=null;

    /////////////////////////////
    // フォームのデータを取得。//
    /////////////////////////////
    request.setCharacterEncoding("JISAutoDetect");
    String cmd = request.getParameter("cmd");

    // データベース名、テーブル名、ユーザ名、パスワードの保存と回復。
    if( "実行".equals(cmd) ) {
      database = request.getParameter("db1");
      hs.setAttribute("DB1",database);
      table = request.getParameter("db2");
      hs.setAttribute("DB2",table);
      user = request.getParameter("db3");
      hs.setAttribute("DB3",user);
      password = request.getParameter("db4");
      hs.setAttribute("DB4",password);
    } else {
      database = (String)hs.getAttribute("DB1");
      table = (String)hs.getAttribute("DB2");
      user = (String)hs.getAttribute("DB3");
      password = (String)hs.getAttribute("DB4");
    }

    //////////////////////////
    // HTML文書の出力(開始) //
    //////////////////////////

    // コンテンツタイプの指定。
    response.setContentType("text/html; charset=Shift_JIS");
    PrintWriter pw = response.getWriter();

    // 各ボタンに共通の処理。
    pw.println("<html>"
         + "<head><title>データベース処理</title></head>"
         + "<body>"
         + "データベース処理<br>"
         + "データベース：" + database + "　"
         + "テーブル：" + table + "　"
         + "<form action=http://localhost:8080/SV/servlet/db131c method=POST>"
         + "<input type=submit name=cmd value=表示>"
         + "<input type=submit name=cmd value=消去>"
         + "<input type=submit name=cmd value=追加>"
         + "<input type=submit name=cmd value=削除>"
         + "</form>");

    // [消去]ボタンに対応する処理。
    if( "消去".equals(cmd) ) {
    }                      

    // [追加]ボタンに対応する処理。
    if( "追加".equals(cmd) ) {
    }                                                                     

    // [削除]ボタンに対応する処理。       
    if( "削除".equals(cmd) ) {           
    }                                                                    

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
        }

        // [追加実行]ボタンに対応する処理。
        if( "追加実行".equals("add") ) {
        }

        // [削除実行]ボタンに対応する処理。
        if( "削除実行".equals("del") ) {
        }

        cn.commit(); // トランザクション処理を正常終了。
      } catch( Exception e ) {
        System.out.println(e);
        cn.rollback(); // トランザクション処理を異常終了。
      } finally {
        cn.setAutoCommit(true); 
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

    pw.println("</body>"                                             
             + "</html>");                                           
    pw.flush();                                                        
    pw.close();                                                        
    //////////////////////////
    // HTML文書の出力(終了) //
    //////////////////////////
  }
} 
/*
</pre>

<font size=5 color=blue>HTMLファイル(hp131a.htm)</font><br>

<pre>
<!-- << hp131a.htm >> -->
<html>
<head><title>データベース処理</title></head>
<body>
データベース処理
<form action=http://localhost:8080/SV/servlet/db131a method=POST>
データベース：<input type=text size=30 name=db1><br>
テーブル　　：<input type=text size=30 name=db2><br>
ユーザ　　　：<input type=text size=20 name=db3><br>
パスワード　：<input type=password size=20 name=db4><br>
<input type=submit name=cmd value=実行>
</form>
</body>
</html>
 
</pre>

</body>
</html>
*/
