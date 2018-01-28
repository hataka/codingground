////////////////////////////////////////////////////////////////////////////////
// << g147c.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（キャンバス）
//
//　　キャンバスを作成し表示する。
//    キャンバス内に文字列を描画する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class c147c extends Canvas {
  // paintメソッドをオーバーライド。
  public void paint(Graphics g) {
    g.drawString("こんにちは",20,40);
  }
}

class g147c {

  // コンストラクタ。
  g147c() {
    // フレームの作成。
    Frame f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // キャンバスの作成。
    c147c c = new c147c();

    // キャンバスの大きさを設定。
    c.setSize(100,100);

    // キャンバスの背景色を黄色に設定。
    c.setBackground(Color.yellow);

    // キャンバスをフレーム内に追加。
    f.add(c);

    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
     	}
    });
    // フレームの大きさを設定。
    f.setSize(640,480);
    f.setLocationRelativeTo(null);
    // フレームを表示。
    f.setVisible(true);

  }

  public static void main(String[] args) {
    g147c g = new g147c();
  }

}
