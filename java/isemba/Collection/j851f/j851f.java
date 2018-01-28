// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j851f.java 
 * created : Time-stamp: <09/07/02(木) 17:29:49 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851f.java >>
//
//  データ構造（５）：マップ（HashMapクラス、同期処理、失敗例）
//
//　　Collections.synchronizedMapメソッドを使って、スレッドに対して安全な
//　　マップ
//
//        Map m = Collections.synchronizedMap(new HashMap());
//
//　　を作成しても、このクラスのすべての「コレクションビューメソッド」によって
//　　返される反復子を使って、マップを構造的に変更すると、反復子は 
//　　ConcurrentModificationException をスローする。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  Map<Integer,Integer> mp;
  int n;
  ARThread(Map<Integer,Integer> mp, int n) { // コンストラクタ。 
    this.mp = mp; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + mp.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { mp.put(new Integer(j),new Integer(j)); }
        Set s = mp.keySet();
        Iterator is = s.iterator();
        while( is.hasNext() ) { mp.remove(is.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + mp.size());
  }
}

class j851f {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 2;
    int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全な空のマップを作成。
    Map<Integer,Integer> mp = Collections.synchronizedMap(new HashMap<Integer,Integer>());

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(mp,n); arth[i].start();
    }

    // マップ処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("マップ：" + mp.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j851f.java
注:j851f.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j851f 2 100
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
