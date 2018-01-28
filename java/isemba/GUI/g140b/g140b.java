////////////////////////////////////////////////////////////////////////////////
// << g140b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（メニューバー、メニュー、メニュー項目、イベント処理）
//
//　　メニューの赤を選択すると背景色が赤になる。
//　　メニューの黄を選択すると背景色が黄になる。
//　　メニューの青を選択すると背景色が青になる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.UIManager;

class g140b implements ActionListener {

  Frame f;
  MenuItem mi1,mi2,mi3;

  // コンストラクタ。
  g140b() {
 
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception ex) { ex.printStackTrace();}
	  
	  // フレームの作成。
    f = new Frame("フレーム");
   	//f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
            //f.dispose();
    	}
    });

    // メニューバーmbの作成。
    MenuBar mb = new MenuBar();

    // メニューバーmbをフレーム内に追加。
    f.setMenuBar(mb);

    // メニューmの作成。
    Menu m = new Menu("メニュー");

    // メニューmをメニューバー内に追加。
    mb.add(m);

    // メニュー項目の作成。
    mi1 = new MenuItem("赤");
    mi2 = new MenuItem("黄");
    mi3 = new MenuItem("青");

    // メニュー項目をメニュー内に追加。
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);

    // フレームの大きさを設定。
    f.setSize(300,200);
    // フレームを表示。
    f.setLocationRelativeTo(null);
    f.setVisible(true);

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == mi1 ) { f.setBackground(Color.red); }
    if(e.getSource() == mi2 ) { f.setBackground(Color.yellow); }
    if(e.getSource() == mi3 ) { f.setBackground(Color.blue); }
  }

  public static void main(String[] args) {
    g140b g = new g140b();
  }

}
