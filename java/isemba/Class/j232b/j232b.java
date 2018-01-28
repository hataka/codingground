// -*- mode: java -*- Time-stamp: <2009-06-26 20:03:28 kahata>
/*====================================================================
 * name: j232b.java 
 * created : Time-stamp: <09/06/26(金) 20:02:43 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j232b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j232b.java >>
//
//　クラス（３）：引数（文字列　値渡し・参照渡し）
//
//　　「参照渡し」の結果、メソッド内で仮引数に変更がなされると、
//　　実引数にその影響が及ぶ。
//
//　●Stringクラス
//　　・Stringクラスで作成された文字列は変更できない。
//    ・値渡しが行われる。
//
//　●StringBufferクラス
//　　・このクラスで作成された文字列は、文字列中の文字を変更(追加、削除、置換など)
//　　　できる。
//    ・参照渡しが行われる。
//
//　　（１）オブジェクトの作成。
//　　（２）実引数(Stringクラスの文字列変数)sにabcを代入。
//　　（３）メソッドm1の呼び出し。
//　　（４）仮引数tを変更。
//　　（５）実引数(StringBufferクラスの文字列変数)sbにabcを代入。
//　　（６）メソッドm2の呼び出し。
//　　（７）仮引数tbを変更。
//
////////////////////////////////////////////////////////////////////////////////

class C {
  void m1(String t) {
    System.out.println("メソッド開始直後：t = " + t);
    t = "( " + t + " )"; //（４）
    System.out.println("メソッド終了直前：t = " + t);
  }
  void m2(StringBuffer tb) {
    System.out.println("メソッド開始直後：tb = " + tb);
    tb.reverse(); //（７） 
    System.out.println("メソッド終了直前：tb = " + tb);
  }
}

class j232b {
  public static void main(String args[]) {

    C obj = new C(); //（１）

    String s = new String("abc"); //（２）

    System.out.println("値渡し実行前：s = " + s);
    obj.m1(s); //（３）
    System.out.println("値渡し実行後：s = " + s);
    System.out.println();

    StringBuffer sb = new StringBuffer("abc"); //（５）

    System.out.println("参照渡し実行前：sb = " + sb);
    obj.m2(sb); //（６）
    System.out.println("参照渡し実行後：sb = " + sb);
  }
}
/*
実行結果
% javac j232b.java
% java j232b
値渡し実行前：s = abc
メソッド開始直後：t = abc
メソッド終了直前：t = ( abc )
値渡し実行後：s = abc

参照渡し実行前：sb = abc
メソッド開始直後：tb = abc
メソッド終了直前：tb = cba
参照渡し実行後：sb = cba
</pre>
*/
