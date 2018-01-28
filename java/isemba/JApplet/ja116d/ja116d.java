// -*- mode: java -*-  Time-stamp: <2010-04-16 16:04:43 kahata>
/*================================================================
 * file: ja116d.java
 * path; F:\java\isemba\JApplet\ja116d\ja116d.java
 * url:  http://localhost/java/isemba/JApplet/ja116d/ja116d.java
 * created: Time-stamp: <2010-04-16 16:04:43 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * link: 
 * description: 
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja116d.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（GridBagLayout）
//
//    見栄えを少しよくするために、部品の回りや内部に余白を付ける。
//
//　●Insetsクラス
//　　部品の周りに余白を作るには、Insetsクラスを使う。
//
//　●Insetsクラスのコンストラクタ
//　　public Insets(int top, int left, int bottom, int right)
//      機能：部品の外側の余白を作る。
//            デフォルトは、0,0,0,0。
//
//  ●GridBagLayoutクラスの変数
//　　Insets insets
//      機能：部品の外側の余白を指定する。
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja116d.class" width="200" height="80"></applet>

import java.awt.*; 
import javax.swing.*;

public class ja116d extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    c.setLayout(gb);

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");

    // ボタン１を(0,0)から(1,1)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(10,10,10,10);
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // ボタン２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(10,10,10,10);
    gb.setConstraints(b2,gbc);
    c.add(b2);
  }
}
