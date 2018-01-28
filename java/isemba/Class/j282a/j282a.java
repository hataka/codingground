// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j282a.java 
 * created : Time-stamp: <09/06/29(月) 17:30:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j282a.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j282a.java >>
//
//  クラス（８）：パッケージ（パッケージの作成）
//
//　　パッケージ作成法を確認する。
//　　　
//　　（１）パッケージ指定を含むソースファイルを作成。
//　　（２）コンパイルを実行。
//
//          % javac -d . クラス名.java
//　
//          カレントディレクトリ ------- クラス名.java
//                                   |
//                                   --- pack1 --- クラス名.class
//                                        
////////////////////////////////////////////////////////////////////////////////

package pack1; // パッケージ名（pack1）

public class j282a { // 外部からアクセスされるので、public指定をする。

  int a = 111; // 指定のないフィールド変数。
  public int pa = 222; // public指定のあるフィールド変数。

  String m() { // 指定のないメソッド。
    return "指定のないメソッド(m)";
  }

  public String pm() { // public指定のあるメソッド。
    return "public指定のあるメソッド(pm)";
  }
}
/*
実行結果
% javac -d . j282a.java
*/
