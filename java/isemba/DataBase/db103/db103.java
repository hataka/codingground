// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db103.java 
 * created : Time-stamp: <09/06/30(火) 10:16:40 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db103.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db103.java >>
//
//　データベース（０）：MySQL概説
//
//      MySQLはリレーショナルデータベース管理システムで、フリーソフトである。
//
//　●MySQLの操作
//
//　　○コマンドプロンプトを開く。
//      管理者(root)で実行する。パスワードを入力する。
//      c:\> mysql -u root -p
//      Enter password: *****
//      Welcome to the MySQL monitor.  Commands end with ; or \g.
//      Your MySQL connection id is 2 to server version: 4.1.13a-nt
//      Type 'help;' or '\h' for help. Type '\c' to clear the buffer.
//      mysql>
//
//      ・SQL文は大文字・小文字の区別はしない。
//　　　　データベース名、テーブル名では、大文字・小文字が区別される。
//      ・SQL文の最後に;をつける。
//                                                                
//  　○データベース(db1)の作成                                       
//      mysql> create database db1;                                     
//      Query OK, 1 row affected (0.00 sec)    
//
//　　　・データベースの削除は、mysql> drop database データベース名; とする。
//
//    ○データベース(db1)の確認                                       
//      mysql> show databases;                                      
//      +-----------+                                                       
//      | Databases |                                                       
//      +-----------+                                                       
//      | db1       |                                                       
//      | mysql     |                                                       
//      | test      |                                                       
//      +-----------+                                                       
//
//　　　・mysql,testは既に作成されているデータベース。              
//                                                                          
//    ○データベース(db1)内にテーブル(tb1)を新規作成。   
//      mysql> use db1;                                                 
//      Database changed
//      mysql> create table tb1(
//          -> 番号 integer primary key,
//          -> 名前 varchar(20),
//          -> 住所 varchar(80));
//      Query OK, 0 rows affected (0.44 sec)
//
//　　　・use データベース名 でデータベースを選択する。
//　　　・データ型
//　　　　　　integer：整数
//　　　　　　varchar(20)：半角20字の可変長。
//      ・primary key指定のついた列では、データの一意性が要求される。
//      ・テーブルの削除は、mysql> drop table テーブル名; とする。     
//　　　　                                               
//    ○レコードの追加                                                      
//      mysql> insert into tb1 (番号,名前,住所)
//          -> values(1,'水戸太郎','茨城県水戸市');
//      Query OK, 1 row affected (0.16 sec)
//                                                                          
//    ○レコードの確認                                                      
//      mysql> select * from tb1;                                      
//      +------+----------+--------------+                                  
//      | 番号 | 名前     | 住所         |                                  
//      +------+----------+--------------+                                  
//      |    1 | 水戸太郎 | 茨城県水戸市 |                                  
//      +------+----------+--------------+                                  
//      1 row in set (0.00 sec)                                             
//               
//　　○テーブルの一覧表示
//      mysql> show tables;
//      +---------------+                      
//      | Tables_in_db1 |                      
//      +---------------+                      
//      | tb1           |                      
//      +---------------+                      
//      1 row in set (0.33 sec)                
//
//　　○テーブルの内容表示
//      mysql> show columns from tb1;        
//      +-------+-------------+------+-----+---------+-------+
//      | Field | Type        | Null | Key | Default | Extra |
//      +-------+-------------+------+-----+---------+-------+
//      | 番号  | int(11)     |      | PRI | 0       |       |
//      | 名前  | varchar(20) | YES  |     | NULL    |       |
//      | 住所  | varchar(80) | YES  |     | NULL    |       |
//      +-------+-------------+------+-----+---------+-------+
//      3 rows in set (0.00 sec)     
//
//    ○MySQLの終了                                                      
//      mysql> quit                                                       
//      Bye                                                               
//                                                                          
///////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
