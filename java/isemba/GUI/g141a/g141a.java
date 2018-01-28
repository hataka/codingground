////////////////////////////////////////////////////////////////////////////////
// << g141a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（メニューバー、メニュー、メニュー項目）
//
//　　メニューの中にメニュー(サブメニュー)を作成し表示する。
//
//  ●Menuクラスのメソッド
//    public void addSeparator()
//　　　機能：現在位置にセパレータを挿入する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class g141a {

  // コンストラクタ。
  g141a() {
    // フレームの作成。
    Frame f = new Frame("フレーム");
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
    MenuItem mi1 = new MenuItem("赤");
    MenuItem mi2 = new MenuItem("黄");
    MenuItem mi3 = new MenuItem("青");

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
    f.setSize(640,480);
    f.setLocationRelativeTo(null);
   // フレームを表示。
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g141a g = new g141a();
  }

}
