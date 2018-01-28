// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861j.java 
 * created : Time-stamp: <09/07/02(木) 17:54:40 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861j.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861j.java >>
//
//  データ構造（６）：マップ（TreeMapクラス、実行時間）
//
//　　操作の実行時間を測定する。
//
//　●java.lang.Systemクラス
//　　・public final class System extends Object
//　　・Systemクラスには有用なクラスフィールドおよびメソッドがある。
//　　・オブジェクトを作成できない。 
//
//　●Systemクラスのメソッド
//　  public static long currentTimeMillis()
//　　　機能：現在時刻と協定世界時の UTC 1970年1月1日午前0時との差をミリ秒で
//　　　　　　返す。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

class j861j {

  public static void main(String args[]) {

//  int n = Integer.parseInt(args[0]); // args[0]:繰り返し回数。
    int n = 10000;

    System.out.println("繰り返し回数："+n);

    // 空のマップを作成。
    TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();

    // 要素の追加時間。
    long t0 = System.currentTimeMillis();
    for( int i=1; i<=n; i++ ) { tm.put(new Integer(i),new Integer(i)); }
    long t1 = System.currentTimeMillis();
    double mt = (t1-t0)/(double)n;
    System.out.println("追加操作(put   )の平均実行時間：" + mt + "ミリ秒");

    // 要素の削除時間。
    t0 = System.currentTimeMillis();
    for( int i=1; i<=n; i++ ) { tm.remove(new Integer(i)); }
    t1 = System.currentTimeMillis();
    mt = (t1-t0)/(double)n;
    System.out.println("削除操作(remove)の平均実行時間：" + mt + "ミリ秒");
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j861j.java
注:j861j.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j861j 10000
繰り返し回数：10000
追加操作(put   )の平均実行時間：0.0030ミリ秒
削除操作(remove)の平均実行時間：0.0020ミリ秒
</pre>

</body>
</html>
*/
