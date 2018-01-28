// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db102.java 
 * created : Time-stamp: <09/06/30(火) 10:15:07 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db102.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db102.java >>
//
//　データベース（０）：MySQLインストール
//
//　　MySQLはリレーショナルデータベース管理システムで、フリーソフトである。
//
//  ●MySQLのダウンロード
//  （１）Webブラウザで、http://www.mysql.com/に接続する。
//        Downloads 項目のMySQL Databaseをクリックする。
//　（２）http://dev.mysql.com/downloads/mysql/4.1.htmlに切り替わる。
//  　    Windows downloads項目から
//          ファイル(mysql-4.1.13a-win32.zip)
//        をダウンロードする。
//　（３）ダウンロードが始まるので、保存先をデスクトップにする。　　
//  　    ファイル(mysql-4.1.13a-win32.zip)がデスクトップに保存される。
//
//  ●MySQLのファイル(mysql-4.1.13a-win32.zip)が改ざんされていないことの確認。
//    MySQLダウンロードページに記載されている
//　　　MD5チェックサム(a2be37ddfb71123c9671e2b01d3a51f6)
//    とmd5コマンドの実行結果を比較し一致しているかどうかを確認する。
//    一致していればOK。
//    Windowsのmd5コマンドは、http://www.fourmilab.ch/md5/ から入手する。 
//　　・実行例
//      md5コマンド(md5.exe)とファイル(mysql-4.1.13a-win32.zip)をディレクトリ
//      (c:\temp)にコピーし確認する。
//
//      C:\temp>md5 mysql-4.1.13a-win32.zip
//      A2BE37DDFB71123C9671E2B01D3A51F6  mysql-4.1.13a-win32.zip
//
//  ●MySQLのインストール
//　（１）ZIP形式のファイル(mysql-4.1.13a-win32.zip)を解凍する。
//        解凍先ディレクトリを(c:\temp)とする。
//　（２）解凍先ディレクトリ(c:\temp)内のファイル(Setup.exe)を
//　　　　ダブルクリックして起動する。
//　（３）指示に従ってインストールする。
// 　     ・インストール先を
//　　　　　　ディレクトリ(C:\Program Files\MySQL\MySQL Server 4.1)
//　　　　　にする。
//　　　　　システム環境変数のPATH変数に、
//　　　　　　ディレクトリ(C:\Program Files\MySQL\MySQL Server 4.1\bin)
//　　　　　が自動的に追加されている。
//　　　　　このように環境変数PATHが設定されると、どのディレクトリにいても
//　　　　　コマンド名のみで実行することができる。
//　　　　　　設定なしの場合　C:\Program Files\MySQL\MySQL Server 4.1\bin\>mysql
//　　　　　　設定ありの場合　C:\>mysql
//        ・MySQLをWindowsサービスとしてインストールする。
//　　　　　Windowsの起動時または停止時に、MySQLサーバが自動的に起動または
//　　　　　停止される。
//　　　　　サービスとしてインストールされたサーバは、NETコマンドを使用して
//          コマンドラインから起動・停止できる。
//　　　　　　　起動: c:\WINDOWS\system32>net start mysql
//　　　　　　　停止: c:\WINDOWS\system32>net stop mysql
//        ・日本語処理ができるように設定する。
//        ・管理者(root)のパスワードを設定する。
//
//　（４）再起動する。
//
///////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
