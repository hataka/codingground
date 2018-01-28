// -*- mode: java -*- Time-stamp: <2009-06-27 11:35:40 kahata>
/*====================================================================
 * name: j235d.java 
 * created : Time-stamp: <09/06/27(土) 11:34:55 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j235d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j235d.java >>
//
//  クラス（３）：コンストラクタ（オーバーロード）
//
//  　自分のクラスのコンストラクタの呼び出しに、this()やthis(引数リスト)が使える。
//　　この呼び出しは、コンストラクタの先頭に書かなければならない。
//    これらの呼び出しを使って、初期化処理を簡潔に記述することができる。
//
//　　this(引数リスト)の使い方を確認する。
//
//　　（１）オブジェクトobj1の作成とコンストラクタ実行。
//　　（２）オブジェクトobj2の作成とコンストラクタ実行。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  String s; // 変数の定義。
  C() { // 引数０個のコンストラクタ。
    this("名前なし"); 
    System.out.println("（１）引数０個のコンストラクタ：C()");
    System.out.println();
  }
  C(String s) { // 引数１個のコンストラクタ。
    System.out.println("（２）引数１個のコンストラクタ：C(String s)");
    System.out.println("　　　s = " + s);
  }
}

class j235d {
  public static void main(String args[]) {

    C obj1 = new C(); //（１） 

    C obj2 = new C("茨城太郎"); //（２） 

  }
}
/*
実行結果
% javac j235d.java
% java j235d
（２）引数１個のコンストラクタ：C(String s)
　　　s = 名前なし
（１）引数０個のコンストラクタ：C()

（２）引数１個のコンストラクタ：C(String s)
　　　s = 茨城太郎
*/
