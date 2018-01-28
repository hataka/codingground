////////////////////////////////////////////////////////////////////////////////
// << g141b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（メニューバー、メニュー、メニュー項目、イベント処理）
//
//　　サブメニューの赤を選択すると背景色が赤になる。
//　　サブメニューの黄を選択すると背景色が黄になる。
//　　サブメニューの青を選択すると背景色が青になる。
//
//  ●Menuクラスのメソッド
//    public void addSeparator()
//　　　機能：現在位置にセパレータを挿入する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 

class g141b implements ActionListener {

  Frame f;
  MenuItem mi1,mi2,mi3;

  // コンストラクタ。
  g141b() {
    // フレームの作成。
    f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // メニューバーmbの作成。
    MenuBar mb = new MenuBar();

    // メニューバーmbをフレーム内に追加。
    f.setMenuBar(mb);

    // メニューmの作成。
    Menu m = new Menu("メニュー");

    // メニューmをメニューバー内に追加。
    mb.add(m);

    // サブメニューm1の作成。
    Menu m1 = new Menu("サブメニュー１");

    // サブメニューm1をメニュー内に追加。
    m.add(m1);

    // セパレータをメニューmに追加。
    m.addSeparator(); 

    // サブメニューm2の作成。
    Menu m2 = new Menu("サブメニュー２");

    // サブメニューm2をメニュー内に追加。
    m.add(m2);

    // メニュー項目の作成。
    mi1 = new MenuItem("赤");
    mi2 = new MenuItem("黄");
    mi3 = new MenuItem("青");

    // メニュー項目をサブメニュー２内に追加。
    m2.add(mi1);
    m2.add(mi2);
    m2.add(mi3);
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
     	}
    });

    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.setSize(640,480);
    f.setLocationRelativeTo(null);

    // フレームを表示。
    f.setVisible(true);

    // イベントリスナの登録。
    mi1.addActionListener(this); 
    mi2.addActionListener(this); 
    mi3.addActionListener(this); 
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == mi1 ) { f.setBackground(Color.red); }
    if( e.getSource() == mi2 ) { f.setBackground(Color.yellow); }
    if( e.getSource() == mi3 ) { f.setBackground(Color.blue); }
  }

  public static void main(String[] args) {
    g141b g = new g141b();
  }

}
