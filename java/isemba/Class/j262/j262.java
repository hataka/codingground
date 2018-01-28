// -*- mode: java -*- Time-stamp: <2009-06-29 17:05:35 kahata>
/*====================================================================
 * name: j262.java 
 * created : Time-stamp: <09/06/29(月) 17:05:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j262.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j262.java >>
//
//  クラス（６）：例外（自メソッド外で例外を処理する場合）
//
//　　例外の処理は、例外が送出されたメソッド内で行う方法と、他のメソッドで行う
//　　方法がある。ここでは、後者を示す。
//
//　●例外処理プログラム
//
//    メソッドの定義に予約語throwsを使って、例外のクラスを指定する。
//　　メソッド内で例外が発生すると、自メソッド外に指定した例外クラスの
//　　オブジェクトが送られる。
// 
//      class クラス名 {
//    　　static void m() throws ArithmeticException {
//          ［例外が発生する可能性のある処理］
//        }
//        public static void main(String args[]) {
//          try {
//            m();
//          } catch ( ArithmeticException e ) {
//            ・・・
//          }
//        }
//      } 
//
////////////////////////////////////////////////////////////////////////////////
