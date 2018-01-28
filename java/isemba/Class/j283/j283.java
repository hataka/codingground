// -*- mode: java -*- Time-stamp: <2009-06-29 20:08:05 kahata>
/*====================================================================
 * name: j283.java 
 * created : Time-stamp: <09/06/29(月) 20:07:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j283.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j283.java >>
//
//  クラス（８）：パッケージ（サブパッケージの作成）
//
//　●パッケージと階層ディレクトリ
//    
//    　　package 名前１.名前２
//        class クラス名 { // 他のパッケージのクラスからアクセスされる場合
//　　　　　　　　　　　　 // public指定をする。
//          ・・・
//        }
//   
//      % javac -d . ソースファイル
//
//　　　カレントディレクトリの下に、名前１のディレクトリが作られ、その下に
//　　　名前２のディレクトリが作られる。その下にクラスファイル(クラス名.class)
//　　　が保存される。
//      カレントディレクトリの下にソースファイル(クラス名.java)があるとする。
//
//　　　カレントディレクトリ ----- クラス名.java
//                             |
//　                           --- 名前１--- 名前２ --- クラス名.class
//
////////////////////////////////////////////////////////////////////////////////
