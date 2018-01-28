// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j201.java 
 * created : Time-stamp: <09/06/20(土) 05:28:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j201.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j201.java >>
//
//  クラス（０）：クラスの定義
//
//  ●Javaプログラム
//
//　　・Javaでは、クラスを定義することによってプログラムを作成する。
//　　　クラスという仕組みを使うと、プログラムを効率よく作成することができる。
//　　・クラスは、フィールドとメソッドの集まりである。
//　　　フィールドとメソッドはクラスのメンバと呼ばれる。
//　　・フィールドは変数で表される。
//　　・メソッドは、ひとまとまりの処理を記述したものである。
//　　・フィールドとメソッドを記述し、クラスを定義することは、Javaに新しい型を
//　　　導入したと考えることができる。
//
//  ●クラスの定義
//
//　　　　class クラス名 {
//    　　　フィールドの定義
//　　　　　メソッドの定義
//  　　　}
//
//　　・予約語classを使い、クラス宣言の始まりを示す。
//
//　●フィールドの定義
//
//　　　　型　変数名
//
//　●メソッドの定義
//
//　　　　メソッドの型　メソッド名（引数） {
//　　　　　メソッドの記述
//　　　　}
//
//　　・メソッドが返す戻り値の型をメソッドの型として記述する。
//      戻り値がないとき、void型にする。
//    ・引数は、型と名前の組を必要なだけ書く。
//　　・予約語returnを使って、戻り値を指定しメソッドの実行を終了する。
//
//　●クラスの定義例
//
//      class C { // クラス名(C）
//        int s; // フィールドを変数(s)で定義。
//    
//        void sets() { // メソッド(sets)の定義。
//          s = 0; // メソッド内ではクラスで定義した変数(s)を使用できる。 
//        }
//        void add(int a) // メソッド(add)の定義。
//          s = s + a;    // 変数sに変数aを加え、結果を変数sに保存する。
//                        // 変数aはクラスCの外部から与えられる。
//        }
//        int gets() { // メソッド(gets)の定義。
//          return s; // 変数sの値を戻す。
//        }
//      }
//
////////////////////////////////////////////////////////////////////////////////
