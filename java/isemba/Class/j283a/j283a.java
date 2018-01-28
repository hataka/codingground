// -*- mode: java -*- Time-stamp: <2009-06-29 20:10:38 kahata>
/*====================================================================
 * name: j283a.java 
 * created : Time-stamp: <09/06/29(月) 20:10:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j283a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j283a.java >>
//
//  クラス（８）：パッケージ（サブパッケージの作成）
//
//　　サブパッケージ作成法を確認する。
//
//　　（１）パッケージを指定。
//
////////////////////////////////////////////////////////////////////////////////

package pack1.pack2; //（１）

public class j283a { // 他のパッケージ中のクラスからアクセスされるので、
                     // public指定をする。

  int a = 111; // 指定のないフィールド変数。
  public int pa = 222; // public指定のフィールド変数。

  // 指定のないメソッド。
  String m() {
    return "指定のないメソッド(m)";
  }

  // public指定のあるメソッド。
  public String pm() {
    return "public指定のあるメソッド(pm)";
  }
}
/*
実行結果
% javac -d . j283a.java
*/
