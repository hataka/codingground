// -*- mode: java -*- Time-stamp: <2009-07-02 17:26:51 kahata>
/*====================================================================
 * name: j851e.java 
 * created : Time-stamp: <09/07/02(木) 17:25:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851e.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851e.java >>
//
//  データ構造（５）：マップ（HashMapクラス、同期処理　対策２）
//
//　　HashMapクラスはスレッドに対して安全でない。
//　　複数のスレッドがHashMapオブジェクトに同時にアクセスし、
//　　要素の追加や削除を行なったとき、結果が保証されない。
//
//　　対策法２：Collections.synchronizedMapメソッドを使って、スレッドに対して
//　　　　　　　安全なマップを作成する。
//
//        Map mp = Collections.synchronizedMap(new HashMap());
//
//    マップに対して1000個の要素の追加・削除をn回繰り返すスレッドm個を
//　　実行させて、最後にマップが空になるかどうか調べる。
//　　同期がとれていれば空マップが得られるが、失敗すれば、空でないマップが
//　　得られるか、停止しなくなる。
//
//　●Collectionsクラスのメソッド
//    public static Map synchronizedMap(Map a)
//　　　機能：マップaからスレッドに対して安全なマップを返す。
//　　　　　　すべてのアクセスは、返されたマップに対して行う必要がある。 
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
        for( int j=1; j<=1000; j++ ) { mp.put(new Integer(i),new Integer(i)); }
        for( int j=1; j<=1000; j++ ) { mp.remove(new Integer(i)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + mp.size());
  }
}

class j851e {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 5;
    int n = 1000;

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
% javac j851e.java
注:j851e.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j851e 5 1000
m = 5
n = 1000
Thread-0：処理開始 0
Thread-2：処理開始 0
Thread-3：処理開始 0
Thread-4：処理開始 0
Thread-1：処理開始 3
Thread-3：処理終了 2
Thread-0：処理終了 1
Thread-1：処理終了 0
Thread-4：処理終了 0
Thread-2：処理終了 0
マップ：0

% java j851e 5 10000
m = 5
n = 10000
Thread-0：処理開始 0
Thread-2：処理開始 0
Thread-1：処理開始 0
Thread-3：処理開始 1
Thread-4：処理開始 1
Thread-0：処理終了 1
Thread-4：処理終了 2
Thread-2：処理終了 2
Thread-3：処理終了 0
Thread-1：処理終了 0
マップ：0
</pre>

</body>
</html>
*/
