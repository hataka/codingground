// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j841f.java 
 * created : Time-stamp: <09/07/02(木) 09:47:44 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841f.java >>
//
//  データ構造（４）：集合（TreeSetクラス、同期処理、失敗例）
//
//　　Collections.synchronizedSortedSetメソッドを使って、スレッドに対して安全な
//　　集合
//
//        SortedSet ss = Collections.synchronizedSortedSet(new TreeSet());
//
//　　を作成しても、このクラスのiteratorメソッドによって作成される反復子を使って、
//　　集合を構造的に変更すると、反復子は ConcurrentModificationException を
//　　スローする。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  SortedSet<Integer> ss;
  int n;
  ARThread(SortedSet<Integer> ss, int n) { // コンストラクタ。 
    this.ss = ss; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + ss.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { ss.add(new Integer(i)); }
        Iterator is = ss.iterator();
        while( is.hasNext() ) { ss.remove(is.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + ss.size());
  }
}

class j841f {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 2;
    int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全な空の集合を作成。
    SortedSet<Integer> ss = Collections.synchronizedSortedSet(new TreeSet<Integer>());

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(ss,n); arth[i].start();
    }

    // 集合処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("集合：" + ss.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j841f.java
注:j841f.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j841f 2 100
m = 2
n = 100
Thread-0：処理開始 0
Thread-1：処理開始 1
java.util.ConcurrentModificationException
Thread-0：処理終了 1
java.util.ConcurrentModificationException
Thread-1：処理終了 1
集合：1
</pre>

</body>
</html>
*/
