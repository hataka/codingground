// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: g101.java 
 * created : Time-stamp: <09/06/30(火) 09:17:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g101.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g101.java >>
//
//  ＧＵＩ（０）：概説
//
//　●ＧＵＩ(Graphical User Interface)
//
//    画面に表示されているボタンなどをクリックしてある処理を実行させたり、
//　　スロールバーを動かして表示を変更するなど、マウス操作などで処理を進める
//    方式をいう。ユーザにわかりやすい。
//    ユーザのマウス操作をきっかけとしてイベントを発生させ、イベントに対応する
//　　処理を行う。
//
//  ●主なＧＵＩ部品
//
//　　・ボタン（on/off選択）
//　　・チョイスボタン（複数の項目からひとつ選択）
//　　・チェックボックスボタン（複数の項目ごとにon/offを選択）
//    ・スクロールバー（連続的に変化させる）
//　　・テキストフィールド（文字列入力。１行分）
//　　・テキストエリア（文字列入力。複数行分）
//　　・リスト（複数項目から複数選択）
//　　
//　●ＡＷＴ(Abstract Window Toolkit)
//
//    GUI作成用のクラスが定義されているパッケージである。
//　　AWTのクラスは、コンポーネント（ボタン、チェックボックスなどの部品）と、
//　　それらをまとめるために存在するコンテナ（フレームやパネルやアプレット）に
//　　大きく分けられる。
//　　ボタンなどのコンポーネントを作成し、これらをフレームなどのコンテナに
//　　追加することでウインドウ画面を作成することになる。
//　　また、これらのコンポーネントを配置するために５種類のレイアウトマネージャが
//　　用意されている。
//　　レイアウトマネージャは、プラットフォームごとの違い（解像度やフォント）で
//　　表示が違わないようにコンポーネントの配置を支援する仕組みをいう。
//
////////////////////////////////////////////////////////////////////////////////
