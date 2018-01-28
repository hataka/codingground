// -*- mode: java -*- Time-stamp: <2009-06-19 21:32:40 kahata>
/*====================================================================
 * name: g147d.java 
 * created : Time-stamp: <09/06/19(金) 21:30:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g147d.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g147d.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（キャンバス、イベント処理）
//
//    フレーム内に赤丸ボタン、青丸ボタンを作成する。
//　　赤丸ボタンをクリックすると、赤丸がキャンバスに描画され、
//　　白丸ボタンをクリックすると、白丸がキャンバスに描画される。
//
//　●Graphicsクラスのメソッド
//    public abstract void fillOval(int x, int y, int w, int h)
//　　　機能：x,y,w,hで指定される矩形内に塗りつぶされた楕円が描画される。
//            x : 描画される楕円の左上隅の x 座標
//            y : 描画される楕円の左上隅の y 座標
//            w : 描画される楕円の幅
//            h : 描画される楕円の高さ
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g147d extends Canvas implements ActionListener {

  Button b1,b2;
  Color col = Color.white;

  // コンストラクタ。
  g147d() {
    // フレームの作成。
    Frame f = new Frame("フレーム");

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
            }
    });

    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ボタンの作成。
    b1 = new Button("赤丸");
    b2 = new Button("白丸");
    // ボタンをフレーム内に追加。
    f.add(b1);
    f.add(b2);

    // キャンバスの大きさを設定。
    this.setSize(100,100);
    // キャンバスの背景色を黄色に設定。
    this.setBackground(Color.yellow);
    // キャンバスをフレーム内に追加。
    f.add(this);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setVisible(true);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);

  } 

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // 赤丸ボタンがクリックされたとき。
    if( e.getSource() == b1 ) { col = Color.red; } 
    // 白丸ボタンがクリックされたとき。
    if( e.getSource() == b2 ) { col = Color.white; }
    this.repaint();
  }

  // paintメソッドをオーバーライド。
  public void paint(Graphics g) {
    g.setColor(col);
    g.fillOval(20,20,50,50);
  }

  public static void main(String[] args) {
    g147d g = new g147d();
  }
}
