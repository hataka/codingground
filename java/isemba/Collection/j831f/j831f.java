// -*- mode: java -*- Time-stamp: <2009-07-02 08:31:15 kahata>
/*====================================================================
 * name: j831f.java 
 * created : Time-stamp: <09/07/02(木) 08:25:42 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831f.java >>
//
//  データ構造（３）：集合（HashSetクラス、同期処理、失敗例）
//
//　　Collections.synchronizedSetメソッドを使って、スレッドに対して安全な
//　　集合
//
//        Set hs = Collections.synchronizedSet(new HashSet());
//
//　　を作成しても、このクラスのiteratorメソッドによって作成される反復子を使って、
//　　集合を構造的に変更すると、反復子は ConcurrentModificationException を
//　　スローする。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  Set<Integer> hs;
  int n;
  ARThread(Set<Integer> hs, int n) { // コンストラクタ。 
    this.hs = hs; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + hs.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { hs.add(new Integer(i)); }
        Iterator ih = hs.iterator();
        while( ih.hasNext() ) { hs.remove(ih.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + hs.size());
  }
}

class j831f {

  public static void main(String args[]) {

//    int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//    int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 2;
    int n = 100;


    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全な空の集合を作成。
    Set<Integer> hs = Collections.synchronizedSet(new HashSet<Integer>());

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(hs,n); arth[i].start();
    }

    // 集合処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("集合：" + hs.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j831f.java
注: j831f.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j831f 2 100
m = 2
n = 100
Thread-0：処理開始 0
Thread-1：処理開始 1
Thread-1：処理終了 0
java.util.ConcurrentModificationException
Thread-0：処理終了 0
集合：0
</pre>

</body>
</html>
*/
