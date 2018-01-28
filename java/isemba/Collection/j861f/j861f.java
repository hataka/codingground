// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861f.java 
 * created : Time-stamp: <09/07/02(木) 17:49:52 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861f.java >>
//
//  データ構造（６）：マップ（TreeMapクラス、同期処理、失敗例）
//
//　　Collections.synchronizedSortedMapメソッドを使って、スレッドに対して安全な
//　　マップ
//
//        SortedMap sm = Collections.synchronizedSortedMap(new TreeMap());
//
//　　を作成しても、このクラスのすべての「コレクションビューメソッド」によって
//　　返される反復子を使って、マップを構造的に変更すると、反復子は 
//　　ConcurrentModificationException をスローする。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  SortedMap<Integer,Integer> sm;
  int n;
  ARThread(SortedMap<Integer,Integer> sm, int n) { // コンストラクタ。 
    this.sm = sm; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + sm.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { sm.put(new Integer(j),new Integer(j)); }
        Set s = sm.keySet();
        Iterator is = s.iterator();
        while( is.hasNext() ) { sm.remove(is.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + sm.size());
  }
}

class j861f {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 2;
    int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全な空のマップを作成。
    SortedMap<Integer,Integer> sm = Collections.synchronizedSortedMap(new TreeMap<Integer,Integer>());

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(sm,n); arth[i].start();
    }

    // マップ処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("マップ：" + sm.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j861f.java
注:j861f.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j861f 2 100
m = 2
n = 100
Thread-0：処理開始 0
java.util.ConcurrentModificationException
Thread-0：処理終了 999
Thread-1：処理開始 999
java.util.ConcurrentModificationException
Thread-1：処理終了 999
マップ：999
</pre>

</body>
</html>
*/
