// -*- mode: java -*- Time-stamp: <2009-07-03 16:17:38 kahata>
/*====================================================================
 * name: db121.java 
 * created : Time-stamp: <09/07/03(金) 16:16:59 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/DATABASE/db121.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db121.java >>
//
//　データベース（２）：トランザクション処理（概説）
//
//　●トランザクション処理
//
//　　一連のまとまったデータベース処理（更新、参照）をトランザクション処理という。
//
//　　・書き方
//
//        // データベースへの接続。
//        Connection cn = DriverManager.getConnection(url,user,passwd);
//        // 自動コミットを無効としてトランザクション処理を開始する。
//　　　　cn.setAutoCommit(false); 
//        try{
//          データベース処理（処理するテーブルをロック)
//          データベース処理（SQL文)
//          ……
//          データベース処理（SQL文)
//　　　　　cn.commit(); // トランザクション処理で行われた変更を有効とし、
//　　　　　　　　　　　 // 正常終了。
//        } catch( Exception e ) {
//          cn.rollback(); // トランザクション処理で行われた変更を無効とし、
//　　　　　　　　　　　　 // 異常終了。
//        } finally {
//          cn.setAutoCommit(true); // 自動コミットを有効とする。
//        }
//
//　●java.sql.Connectionインターフェース
//　　特定のデータベースとの接続(セッション)を表現する。接続のコンテキスト内で
//　　SQL文が実行され結果が返される。
//
//　●Connectionインターフェースのメソッド
//    public void setAutoCommit(boolean b) throws SQLException
//    　機能：接続の自動コミットモードbを設定する。
//　　　　　　自動コミットモードbがtrue の場合、自動コミットが有効、
//　　　　　　false の場合、自動コミットが無効となる。
//　　　　　　接続が自動コミットモードの場合、ひとつのSQL文が、トランザクション
//　　　　　　として処理される。そうでない場合、トランザクション処理が開始され、
//　　　　　　複数のSQL文が実行された後、commitメソッドまたはrollbackメソッドで
//　　　　　　トランザクション処理は終了する。
//　　　　　　デフォルトは、自動コミットモードとなる。
//    public void commit() throws SQLException
//　　　機能：トランザクション処理で行われた変更を有効とし、トランザクション
//　　　　　　処理中のデータベースロックをすべて解除する。
//　　　　　　このメソッドは、自動コミットモードが無効の場合に使われる。
//    public void rollback() throws SQLException
//　　　機能：トランザクション処理で行われた変更を無効とし、トランザクション
//　　　　　　処理中のデータベースロックをすべて解除する。
//　　　　　　このメソッドは、自動コミットモードが無効の場合に使われる。
//
///////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
