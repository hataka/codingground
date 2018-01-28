// -*- mode: java -*- Time-stamp: <2009-06-18 13:47:03 kahata>
/*====================================================================
 * name: j811f.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811f.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811f.java >>
//
//  データ構造（１）：リスト（ArrayListクラス、同期処理、失敗例）
//
//　　Collections.synchronizedListメソッドを使って、スレッドに対して安全な
//　　リスト
//
//        List a = Collections.synchronizedList(new ArrayList());
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

class j811f {

  public static void main(String args[]) {

//    int m = Integer.parseInt(args[0]); // args[0]:スレッドの個数。
//    int n = Integer.parseInt(args[1]); // args[1]:繰り返し回数。
	int m = 2;
	int n = 100;
    System.out.println("m = " + m);
    System.out.println("n = " + n);

    // スレッドに対して安全な空のリストを作成。
    List<Integer> a = Collections.synchronizedList(new ArrayList<Integer>());

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
% javac j811f.java
注: j811f.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811f 2 100
m = 2
n = 100
Thread-0：処理開始 0
java.util.ConcurrentModificationException
Thread-0：処理終了 999
Thread-1：処理開始 999
java.util.ConcurrentModificationException
Thread-1：処理終了 1998
リスト：1998
*/
