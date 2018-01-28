// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j821f.java 
 * created : Time-stamp: <09/07/01(水) 11:05:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j821f.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821f.java >>
//
//  データ構造（１）：リスト（LinkedListクラス、同期処理、失敗例）
//
//　　Collections.synchronizedListメソッドを使って、スレッドに対して安全な
//　　リスト
//
//        List a = Collections.synchronizedList(new LinkedList());
//
//　　を作成しても、このクラスのiteratorメソッドによって作成される反復子を使って、
//　　リストを構造的に変更すると、反復子は ConcurrentModificationException を
//　　スローする。
//
////////////////////////////////////////////////////////////////////////////////

import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  List<Integer> a;
  int n;
  ARThread(List<Integer> a, int n) { // コンストラクタ。 
    this.a = a; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + a.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { a.add(new Integer(i)); }
        Iterator ia = a.iterator();
        while( ia.hasNext() ) { a.remove(ia.next()); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + a.size());
  }
}

class j821f {

  public static void main(String args[]) {

//    int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//    int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 2;
    int n = 100;
    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全な空のリストを作成。
    List<Integer> a = Collections.synchronizedList(new LinkedList<Integer>());

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(a,n); arth[i].start();
    }

    // リスト処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("リスト：" + a.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font><br>

<pre>
% javac j821f.java
注: j821f.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j821f 2 100
m = 2
n = 100
Thread-0：処理開始 0
java.util.ConcurrentModificationException
Thread-0：処理終了 999
Thread-1：処理開始 999
java.util.ConcurrentModificationException
Thread-1：処理終了 1998
リスト：1998
</pre>

</body>
</html>
*/
