// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861c.java 
 * created : Time-stamp: <09/07/02(木) 17:42:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861c.java >>
//
//  データ構造（６）：マップ（TreeMapクラス、同期処理・失敗例）
//
//　　TreeMapクラスはスレッドに対して安全でない。
//　　複数のスレッドがTreeMapオブジェクトに同時にアクセスし、
//　　要素の追加や削除を行なったとき、結果が保証されないことを確認する。
//
//    マップに対して1000個の要素の追加・削除をn回繰り返すスレッドm個を
//　　実行させて、最後にマップが空になるかどうか調べる。
//　　同期がとれていれば空マップが得られるが、失敗すれば、空でないマップが
//　　得られるか、停止しなくなる。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

// スレッド(AR)の定義。
class ARThread extends Thread {
  TreeMap<Integer,Integer> tm;
  int n;
  ARThread(TreeMap<Integer,Integer> tm, int n) { // コンストラクタ。 
    this.tm = tm; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + tm.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { tm.put(new Integer(j), new Integer(j)); }
        for( int j=1; j<=1000; j++ ) { tm.remove(new Integer(j)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + tm.size());
  }
}

class j861c {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 5;
    int n = 100;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全でない空のマップを作成。
    TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(tm,n); arth[i].start();
    }

    // マップ処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("マップ：" + tm.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j861c.java
注:j861c.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j861c 5 100
m = 5
n = 100
Thread-0：処理開始 0
Thread-2：処理開始 652
Thread-1：処理開始 426
Thread-3：処理開始 446
Thread-4：処理開始 697
java.lang.NullPointerException
Thread-3：処理終了 496
java.lang.NullPointerException
Thread-4：処理終了 866
Thread-2：処理終了 7
Thread-1：処理終了 7
Thread-0：処理終了 7
マップ：7
</pre>

</body>
</html>
*/
