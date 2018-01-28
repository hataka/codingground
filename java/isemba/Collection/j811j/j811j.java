// -*- mode: java -*- Time-stamp: <2009-06-30 12:48:12 kahata>
/*====================================================================
 * name: j811j.java 
 * created : Time-stamp: <09/06/30 12:45:43 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j811j.htm
 * description: Java データ構造（１）：リスト（ArrayListクラス、実行時間）
 * ====================================================================*/
/*
<html>
<head>
  <META http-equiv=Content-Type content="text/html; charset=shift_jis">
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
*/
////////////////////////////////////////////////////////////////////////////////
// << j811j.java >>
//
//  データ構造（１）：リスト（ArrayListクラス、実行時間）
//
//　　操作の実行時間を測定する。
//
//　●java.lang.Systemクラス
//　　・public final class System extends Object
//　　・Systemクラスには有用なクラスフィールドおよびメソッドがある。
//　　・オブジェクトを作成できない。 
//
//　○Systemクラスのメソッド
//　  public static long currentTimeMillis()
//　　　機能：現在時刻と協定世界時の UTC 1970年1月1日午前0時との差をミリ秒で
//　　　　　　返す。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j811j {

  public static void main(String args[]) {

    int n = Integer.parseInt(args[0]); // args[0]:繰り返し回数。
    System.out.println("繰り返し回数：" + n);

    // 空のリストを作成。
    ArrayList a = new ArrayList();

    // 要素の追加時間。
    long t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.add(new Integer(i)); }
    long t1 = System.currentTimeMillis();
    double mt = (t1-t0)/(double)n;
    System.out.println("追加操作(add   )の平均実行時間：" + mt + "ミリ秒");

    // 要素の変更時間。
    t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.set(i,new Integer(i)); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("変更操作(set   )の平均実行時間：" + mt + "ミリ秒");

    // 要素の取得時間。
    t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.get(i); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("取得操作(get   )の平均実行時間：" + mt + "ミリ秒");

    // 要素の削除時間。
    t0 = System.currentTimeMillis();
    for( int i=0; i<n; i++ ) { a.remove(new Integer(i)); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("削除操作(remove)の平均実行時間：" + mt + "ミリ秒");

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br>

<pre>
% javac j811j.java
注: j811j.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811j 100000
繰り返し回数：100000
追加操作(add   )の平均実行時間：0.00211ミリ秒
変更操作(set   )の平均実行時間：5.0E-4ミリ秒
取得操作(get   )の平均実行時間：1.0E-4ミリ秒
削除操作(remove)の平均実行時間：0.0738ミリ秒
</pre>

</body>
</html>
*/
