// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j821d.java 
 * created : Time-stamp: <09/06/30(火) 13:12:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j821d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821d.java >>
//
//  データ構造（２）：リスト（LinkedListクラス、同期処理・対策１）
//
//　　LinkedListクラスはスレッドに対して安全でない。
//　　複数のスレッドがLinkedListオブジェクトに同時にアクセスし、
//　　要素の追加や削除を行なったとき、結果が保証されない。
//
//　　対策法１：synchronizedブロックを使って、同期を保証する。
//
//    リストに対して1000個の要素の追加・削除をn回繰り返すスレッドm個を実行させて、
//　　最後にリストが空になるかどうか調べる。
//　　同期がとれていれば空リストが得られるが、失敗すれば、空でないリストが
//　　得られるか、停止しなくなる。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  LinkedList<Integer> a;
  int n;
  ARThread(LinkedList<Integer> a, int n) { // コンストラクタ。 
    this.a = a; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + a.size());
   try {
      synchronized(a) {
        for( int i=1; i<=n; i++ ) {      
          for( int j=1; j<=1000; j++ ) { a.add(new Integer(i)); }
          for( int j=1; j<=1000; j++ ) { a.remove(new Integer(i)); }
        }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + a.size());
  }
}

class j821d {

  public static void main(String args[]) {

//    int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//    int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
	int m = 2;
	int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全でない空のリストを作成。
    LinkedList<Integer> a = new LinkedList<Integer>();

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
% javac j821d.java
注: j821d.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j821d 2 100
m = 2
n = 100
Thread-0：処理開始 0
Thread-1：処理開始 304
Thread-0：処理終了 892
Thread-1：処理終了 0
リスト：0

% java j821d 5 10000
m = 5
n = 10000
Thread-0：処理開始 0
Thread-2：処理開始 458
Thread-3：処理開始 458
Thread-4：処理開始 458
Thread-1：処理開始 168
Thread-0：処理終了 507
Thread-2：処理終了 969
Thread-3：処理終了 457
Thread-4：処理終了 900
Thread-1：処理終了 0
リスト：0
</pre>

</body>
</html>
*/
