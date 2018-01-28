// -*- mode: java -*-  Time-stamp: <2010-04-16 16:07:20 kahata>
/*================================================================
 * file: ja117.java
 * path; F:\java\isemba\JApplet\ja117\ja117.java
 * url:  http://localhost/java/isemba/JApplet/ja117/ja117.java
 * created: Time-stamp: <2010-04-16 16:07:20 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * link: 
 * description: 
 *
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja117.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（絶対位置指定）
//
//　　部品を任意の大きさで、任意の位置に配置する。
//　　レイアウトマネージャを使わないことを宣言する。
//
//　　　　setLayout(null)
//
//　●Componentクラスのメソッド
//　　void setBounds(int x, int y, int width, int height)
//　　　機能：部品を配置する。
//            x     ：ｘ座標。
//            y     ：ｙ座標。
//            width ：幅。
//            height：高さ。
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja117.class" width="300" height="200"></applet>

import java.awt.*;
import javax.swing.*; 

public class ja117 extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインにレイアウトマネージャの不使用設定。
    c.setLayout(null);

    // ボタンの作成と位置設定。
    JButton b1 = new JButton("ボタン１");
    b1.setBounds(20,40,100,20);
    JButton b2 = new JButton("ボタン２");
    b2.setBounds(160,40,100,40);
    JButton b3 = new JButton("ボタン３");
    b3.setBounds(60,100,160,60);

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
    c.add(b3);
  }
}
