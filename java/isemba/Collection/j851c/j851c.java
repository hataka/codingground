// -*- mode: java -*- Time-stamp: <2009-07-02 17:19:11 kahata>
/*====================================================================
 * name: j851c.java 
 * created : Time-stamp: <09/07/02(木) 17:17:07 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851c.java >>
//
//  データ構造（５）：マップ（HashMapクラス、同期処理・失敗例）
//
//　　HashMapクラスはスレッドに対して安全でない。
//　　複数のスレッドがHashMapオブジェクトに同時にアクセスし、
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
  HashMap<Integer,Integer> hm;
  int n;
  ARThread(HashMap<Integer,Integer> hm, int n) { // コンストラクタ。 
    this.hm = hm; this.n = n;
  }
  // 処理本体。
  public void run() {
    System.out.println(Thread.currentThread().getName() + "：処理開始 " + hm.size());
    try {
      for( int i=1; i<=n; i++ ) { 
        for( int j=1; j<=1000; j++ ) { hm.put(new Integer(j), new Integer(j)); }
        for( int j=1; j<=1000; j++ ) { hm.remove(new Integer(j)); }
      }
    } catch( Exception e ) {
      System.out.println(e);
    }
    System.out.println(Thread.currentThread().getName() + "：処理終了 " + hm.size());
  }
}

class j851c {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
    int m = 5;
    int n = 1000;

    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全でない空のマップを作成。
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

    // スレッドの作成と実行。
    ARThread arth[] = new ARThread[m];
    for( int i=0; i<m; i++ ) {
      arth[i] = new ARThread(hm,n); arth[i].start();
    }

    // マップ処理の確認。
    try {
      for( int i=0; i<m; i++ ) { arth[i].join(); } 
      System.out.println("マップ：" + hm.size());
    } catch ( Exception e ) {
      System.out.println(e); 
    }
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac j851c.java
注:j851c.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j851c 5 1000
m = 5
n = 1000
Thread-0：処理開始 0
Thread-2：処理開始 885
Thread-3：処理開始 885
Thread-4：処理開始 885
Thread-1：処理開始 923
Thread-3：処理終了 42
Thread-2：処理終了 44
Thread-4：処理終了 45
Thread-1：処理終了 45
Thread-0：処理終了 45
マップ：45
</pre>

</body>
</html>
*/
