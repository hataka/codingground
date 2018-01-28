// -*- mode: java -*- Time-stamp: <2009-06-30 13:08:03 kahata>
/*====================================================================
 * name: j821c.java 
 * created : Time-stamp: <09/06/30(火) 13:03:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j821c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821c.java >>
//
//  データ構造（２）：リスト（LinkedListクラス、同期処理・失敗例）
//
//　　LinkedListクラスはスレッドに対して安全でない。
//　　複数のスレッドがLinkedListオブジェクトに同時にアクセスし、
//　　要素の追加や削除を行なったとき、結果が保証されないことを確認する。
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
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { a.add(new Integer(i)); }
        for( int j=1; j<=1000; j++ ) { a.remove(new Integer(i)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + a.size());
  }
}

class j821c {

  public static void main(String args[]) {

	//int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
	//int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
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
% javac j821c.java
注: j821c.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j821c 2 100
m = 2
n = 100
Thread-0：処理開始 0
Thread-1：処理開始 501
java.lang.NullPointerException
Thread-0：処理終了 519
Thread-1：処理終了 501
リスト：501
</pre>

</body>
</html>
*/
