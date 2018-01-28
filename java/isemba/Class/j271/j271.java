// -*- mode: java -*- Time-stamp: <2009-06-29 17:14:45 kahata>
/*====================================================================
 * name: j271.java 
 * created : Time-stamp: <09/06/29(月) 17:14:23 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j271.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j271.java >>
//
//  クラス（７）：内部クラス（概説）
//
//　●内部クラス
//
//    クラス内に関連するちょっとしたクラスを作成できる。この内部に含まれる
//　　クラスを内部クラスという。イベント処理で内部クラスはよく使われる。
//
//　●内部クラスの書き方
//
//　　    class クラス名 {                                     
//          内部クラス名 obji;           
//          void method() {           
//          　obji = new 内部クラス名();
//            ・・・                                           
//　　    　}                                                  
//　　    　class 内部クラス名 {                               
//            ・・・                                           
//          }                                                  
//        }                                                    
//
//  　・javacでコンパイルされると、２つのクラスファイルが作成される。
//  　　クラス名.classとクラス名$内部クラス名.claas
//
//　●内部クラスのスコープ
//
//　　内部クラスを含むクラスのメンバーに内部クラスからアクセスできる。
//
////////////////////////////////////////////////////////////////////////////////
