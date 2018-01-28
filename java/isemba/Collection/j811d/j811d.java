// -*- mode: java -*- Time-stamp: <2009-06-18 13:47:03 kahata>
/*====================================================================
 * name: j811d.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811d.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811d.java >>
//
//  データ構造（１）：リスト（ArrayListクラス、同期処理・対策１）
//
//　　ArrayListクラスはスレッドに対して安全でない。
//　　複数のスレッドがArrayListオブジェクトに同時にアクセスし、
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
  ArrayList<Integer> a;
  int n;
  ARThread(ArrayList<Integer> a, int n) { // コンストラクタ。 
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

class j811d {

  public static void main(String args[]) {

//  int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//  int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
	int m = 2;
	int n = 100;
    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全でない空のリストを作成。
    ArrayList<Integer> a = new ArrayList<Integer>();

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
実行結果
% javac j811d.java
注: j811d.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811d 2 100
m = 2
n = 100
Thread-0：処理開始 0
Thread-1：処理開始 554
Thread-0：処理終了 526
Thread-1：処理終了 0
リスト：0

% java j811d 5 10000
m = 5
n = 10000
Thread-0：処理開始 0
Thread-1：処理開始 103
Thread-2：処理開始 103
Thread-3：処理開始 103
Thread-4：処理開始 103
Thread-0：処理終了 190
Thread-1：処理終了 250
Thread-2：処理終了 615
Thread-3：処理終了 314
Thread-4：処理終了 0
リスト：0
*/
