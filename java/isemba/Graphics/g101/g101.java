// -*- mode: java -*- Time-stamp: <2009-06-30 07:09:50 kahata>
/*====================================================================
 * name: g101.java 
 * created : Time-stamp: <09/06/30(火) 07:09:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g101.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g101.java >>
//
//  グラフィックス（０）：概要
//
//　　　フレームはコンテナとして設計されているため、通常、文字や図形の描画は、
//　　　パネルというコンポーネントに行う。パネルはフレームに追加される。
//　　　パネルは、コンテナであり、文字や図形を描画できるコンポーネントである。
//
//　●文字や画像の描画法
//　　文字や画像を描画する場合、JPanelクラスの子クラス内に、paintComponent
//　　メソッドをオーバーライドする。paintComponentメッソドは、フレームを書き直す
//　　ときに自動的に呼び出されるメソッドなので、プログラム中から呼び出してはなら
//　　ない。
//
//        class クラス名 extends JPanel {
//          public void paintComponent(Graphics g) {
//　　　　　　// 描画処理を書く。
//          }
//        }
//
//  ●JPanelクラス
//    パネルの生成に、JPanelクラスを使う。
//    デフォルトレイアウトマネージャーはFlowLayoutである。
//
//　●JComponentクラスのメソッド
//　　void paintComponent(Graphics g)
//    　機能：このメソッドをオーバーライドする。
//            描画処理を書く。
//
////////////////////////////////////////////////////////////////////////////////
