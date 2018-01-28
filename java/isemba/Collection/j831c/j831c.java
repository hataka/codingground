// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j831c.java 
 * created : Time-stamp: <09/07/01(水) 14:19:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831c.java >>
//
//  データ構造（３）：リスト（HashSetクラス、同期処理・失敗例　J2SE1.4までの機能）
//
//　　HashSetクラスはスレッドに対して安全でない。
//　　複数のスレッドがHashSetオブジェクトに同時にアクセスし、
//　　要素の追加や削除を行なったとき、結果が保証されないことを確認する。
//
//    集合に対して1000個の要素の追加・削除をn回繰り返すスレッドm個を実行させて、
//　　最後に集合が空になるかどうか調べる。
//　　同期がとれていれば空集合が得られるが、失敗すれば、空でない集合が
//　　得られるか、停止しなくなる。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  HashSet<Integer> hs;
  int n;
  ARThread(HashSet<Integer> hs, int n) { // コンストラクタ。 
    this.hs = hs; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + hs.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { hs.add(new Integer(i)); }
        for( int j=1; j<=1000; j++ ) { hs.remove(new Integer(i)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + hs.size());
  }
}

class j831c {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 2;
    int n = 100;
    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全でない空の集合を作成。
    HashSet<Integer> hs = new HashSet<Integer>();

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
% javac j831c.java
注: j831c.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j831c 2 100
m = 2
n = 100
Thread-0：処理開始 0
Thread-1：処理開始 0
Thread-1：処理終了 1
Thread-0：処理終了 0
集合：0

% java j831c 5 10000
m = 5
n = 10000
Thread-0：処理開始 0
Thread-1：処理開始 1
Thread-2：処理開始 1
Thread-3：処理開始 1
Thread-4：処理開始 1
Thread-1：処理終了 1
Thread-4：処理終了 1
Thread-0：処理終了 0
Thread-2：処理終了 -1
Thread-3：処理終了 -1
集合：-1
</pre>

</body>
</html>
*/
