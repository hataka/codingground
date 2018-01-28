// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db104.java 
 * created : Time-stamp: <09/06/30(火) 10:18:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db104.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db104.java >>
//
//　データベース（０）：MySQL概説(ユーザ管理)
//
//　　パスワードの変更、ユーザ登録などを示す。
//
//　●ユーザ管理
//
//　　○管理者でログイン
//      C:\> mysql -u root -p
//      Enter password: *****
//      Welcome to the MySQL monitor.  Commands end with ; or \g.
//      Your MySQL connection id is 1 to server version: 4.1.13a-nt
//      Type 'help;' or '\h' for help. Type '\c' to clear the buffer.
//      mysql>
//
//　　○ユーザ情報の表示
//      mysql> select host,user,password from mysql.user;
//      +-----------+------+-------------------------------------------+
//      | host      | user | password                                  |
//      +-----------+------+-------------------------------------------+
//      | localhost | root | *4ACFE3202A5FF5CF467898FC58AAB1D615029441 |
//      +-----------+------+-------------------------------------------+
//      1 row in set (0.39 sec)
//
//    　・mysqlはデータベース名、userはテーブル名。すでに作成されている。
//
//　　○管理者のパスワード変更
//　　　旧パスワード(abc123)を新パスワード(abc789)に変更する。
//　　　パスワードは任意に決めることができる。
//
//      mysql> set password for root@localhost = password('abc789');
//      Query OK, 0 rows affected (0.29 sec)
//
//　　　・パスワード変更後の確認
//        mysql> select host,user,password from mysql.user;    
//        +-----------+------+-------------------------------------------+
//        | host      | user | password                                  |
//        +-----------+------+-------------------------------------------+
//        | localhost | root | *9AF852C45661560C7D45364560A1B3EB77F28DA1 |
//        +-----------+------+-------------------------------------------+
//        1 row in set (0.00 sec)
//
//　　○ユーザ登録
//　　　MySQLを利用するユーザを登録するのにgrant文を使う。
//      mysql> grant all on db1.* to guest@localhost identified by 'anyone';
//      Query OK, 0 rows affected (0.11 sec)
//
//　　　・ユーザ名(guest) パスワード(anyone) データベース(db1)に
//　　　  すべての権限(all)をもつ。
//      ・データベース(db1)は、rootユーザがあらかじめ作成しておく。
//        mysql> create database db1;
//        Query OK, 1 row affected (0.11 sec)
//
//　　　・ユーザ登録後のユーザ情報表示
//        mysql> select host,user,password from mysql.user;    
//        +-----------+-------+-------------------------------------------+
//        | host      | user  | password                                  |
//        +-----------+-------+-------------------------------------------+
//        | localhost | root  | *4ACFE3202A5FF5CF467898FC58AAB1D615029441 |
//        | localhost | guest | *A71368B5CDE7B756D599106238FBE3818B3D320B |
//        +-----------+-------+-------------------------------------------+
//        2 rows in set (0.05 sec)
//
//　　○ユーザ削除
//      mysql> delete from mysql.user where user ='ユーザ名';
//      Query OK, 1 row affected (0.07 sec)
//      mysql> select host,user,password from mysql.user;
//      +-----------+------+-------------------------------------------+
//      | host      | user | password                                  |
//      +-----------+------+-------------------------------------------+
//      | localhost | root | *4ACFE3202A5FF5CF467898FC58AAB1D615029441 |
//      +-----------+------+-------------------------------------------+
//      1 row in set (0.00 sec)
//
///////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
