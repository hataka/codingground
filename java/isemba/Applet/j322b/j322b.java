// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j322b.java 
 * created : Time-stamp: <09/06/30(火) 08:48:11 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j322b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j322b.java >>
//
//　アプレット（２）：レイアウトマネージャー(FlowLayout）
//
//　　アプレットのデフォルト・レイアウトマネージャは、FlowLayoutマネージャである。
//
//　●java.awt.FlowLayoutクラス
//    部品(ボタンやテキストフィールドなど)を左から右へ行ごとに配置する。
//    並べられなくなれば、つぎの行に配置する。各部品の間隔は均等。
//
//　○FlowLayoutクラスのコンストラクタ   
//    public FlowLayout()
//　　　機能：部品の配置を、左から右へ順に並べるよう指定する。
//　　　　　　水平間隔と垂直間隔は5、中央揃え。
//    public FlowLayout(int align, int h, int v)
//　　　機能：部品の配置を、左から右へ順に並べるよう指定する。各部品の間隔は均等。
//            位置alignの指定は次のようになる。
//　　　　　　　左寄せ  FlowLayout.LEFT
//　　　　　　　中央    FlowLayout.CENTER
//            　右寄せ  FlowLayout.RIGHT
//            hはコンポーネント間の水平間隔、vはコンポーネント間の垂直間隔。
//
//　●Buttonクラスのコンストラクタ
//　　public Button(String s)
//      機能：テキストsをもつボタンを作成する。
//
//　●Containerクラスのメソッド     
//    public Component add(Component comp)
//      機能：部品compをコンテナの最後に追加する。 
//    public void setLayout(LayoutManager lm)
//      機能：コンテナのレイアウトマネージャをlmに設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j322b extends Applet {

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // アプレットのレイアウトマネージャをFlowLayoutに設定。
    this.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));

    // ボタンの作成。
    Button b1 = new Button("ボタン１");
    Button b2 = new Button("ボタン２");
    Button b3 = new Button("ボタン３");
    Button b4 = new Button("ボタン４");
    Button b5 = new Button("ボタン５");

    // ボタンをアプレット内に追加。
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);

  }

}
/*
ＨＴＭＬファイル
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j322b.class" width="160" height="160">
</applet>
</body>
</html>


実行結果
<applet code="j322b.class" width="160" height="160">
</applet>

ＨＴＭＬファイル
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j322b.class" width="300" height="100">
</applet>
</body>
</html>

実行結果

<applet code="j322b.class" width="300" height="100">
</applet>
*/
