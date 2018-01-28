// -*- mode: java -*- Time-stamp: <2009-06-29 17:45:01 kahata>
/*====================================================================
 * name: j282c.java 
 * created : Time-stamp: <09/06/29(月) 17:44:31 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j282c.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j282c.java >>
//
//  クラス（８）：パッケージ（パッケージの作成）
//
//　　任意のディレクトリの下にパッケージを作成する方法を確認する。
//
//　●パッケージの作成
//
//　　予約語packageを使って、パッケージの宣言を行う。
//
//    　　package パッケージ名;
//        class クラス名 { // 他のパッケージのクラスからアクセスされる場合
//　　　　　　　　　　　　 // public指定をする。
//          ・・・
//        }
//
//　　・-dオプションを用いてディレクトリを指定しコンパイルする。
//
//      　% javac -d c:\tmp ソースファイル
//
//　　　ディレクトリ(c:\tmp)の下にパッケージ名のディレクトリが作られ、
//　　　その下に、クラスファイル(クラス名.class)が保存される。
//　　　ソースファイル(クラス名.java)は、カレントディレクトリにある。
//
//      　カレントディレクトリ ----- クラス名.java
//                              
//        c:\tmp ----- パッケージ名 --- クラス名.class
//
////////////////////////////////////////////////////////////////////////////////

package pack2; // パッケージ名（pack2）
public class j282c { // 外部からアクセスされるので、public指定をする。

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
% javac -d c:\tmp j282c.java
*/
