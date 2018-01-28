// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j841c.java 
 * created : Time-stamp: <09/07/02(木) 09:33:06 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841c.java >>
//
//  データ構造（４）：集合（TreeSetクラス、同期処理・失敗例　J2SE1.4までの機能）
//
//　　TreeSetクラスはスレッドに対して安全でない。
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
  TreeSet<Integer> ts;
  int n;
  ARThread(TreeSet<Integer> ts, int n) { // コンストラクタ。 
    this.ts = ts; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + ts.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { ts.add(new Integer(i)); }
        for( int j=1; j<=1000; j++ ) { ts.remove(new Integer(i)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + ts.size());
  }
}

class j841c {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 5;
    int n = 1000;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全でない空の集合を作成。
    TreeSet<Integer> ts = new TreeSet<Integer>();

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(ts,n); arth[i].start();
    }

    // 集合処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("集合：" + ts.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }

  }

}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j841c.java
注:j841c.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j841c 5 1000
m = 5
n = 1000
Thread-0：処理開始 0
Thread-1：処理開始 0
Thread-2：処理開始 1
Thread-3：処理開始 1
Thread-4：処理開始 2
Thread-2：処理終了 3
Thread-0：処理終了 4
java.lang.NullPointerException
Thread-4：処理終了 6
Thread-1：処理終了 3
Thread-3：処理終了 3
集合：3
</pre>

</body>
</html>
*/
