// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db105.java 
 * created : Time-stamp: <09/06/30(火) 10:19:36 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db105.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db105.java >>
//
//　データベース（０）：JDBCドライバ
//
//　　JavaのプログラムからMySQLのデータベースへ接続するにはJDBCドライバが
//　　必要である。
//
//  ●JDBCドライバのダウンロード
//  （１）Webブラウザで、http://www.mysql.com/に接続する。
//        Downloads 項目のMySQL Connectorsをクリックする。
//　（２）http://dev.mysql.com/downloads/connector/に切り替わる。
//  　    Connector/J項目から
//          ファイル(mysql-connector-java-3.1.10.zip)
//        をダウンロードする。
//　（３）ダウンロードが始まるので、保存先をデスクトップにする。　　
//  　    ファイル(mysql-connector-java-3.1.10.zip)がデスクトップに保存される。
//
//  ●ファイル(mysql-connector-java-3.1.10.zip)が改ざんされていないことの確認。
//    ダウンロードページに記載されている
//　　　MD5チェックサム(0358f500fde7a5969f491472d13c4f84) 
//    とmd5コマンドの実行結果を比較し一致しているかどうかを確認する。
//    一致していればOK。
//    Windowsのmd5コマンドは、http://www.fourmilab.ch/md5/ から入手する。 
//　　・実行例
//      md5コマンド(md5.exe)とファイル(mysql-connector-java-3.1.10.zip)を
//      ディレクトリ(c:\temp)にコピーし確認する。
//
//      C:\temp>md5 mysql-connector-java-3.1.10.zip
//      0358F500FDE7A5969F491472D13C4F84  mysql-connector-java-3.1.10.zip
//
//  ●MySQLのインストール
//　（１）ZIP形式のファイル(mysql-connector-java-3.1.10.zip)を解凍する。
//        解凍先ディレクトリをデスクトップとする。
//　（２）デスクトップにディレクトリ(mysql-connector-java-3.1.10)が作成される。
//        デスクトップ上のディレクトリ(mysql-connector-java-3.1.10
//        \mysql-connector-java-3.1.10)内のファイル
//　　　　(mysql-connector-java-3.1.10-bin.jar)にJDBCドライバが存在する。
//　（３）JDBCドライバを環境変数CLASSPATHに追加する。
//        ただし、JDBCドライバは、
//　　　　　　c:\mysql-connector-java-3.1.10
//              \mysql-connector-java-3.1.10-bin.jar
//　　　　に存在する。
//
//　●Tomcatに組み込む。
//　　ファイル(mysql-connector-java-3.1.10-bin.jar)を
//    %CATALINA_HOME%\shared\libの下にコピーする。その後、再起動する。
//　　
///////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
