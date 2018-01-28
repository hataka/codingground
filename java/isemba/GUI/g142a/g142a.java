////////////////////////////////////////////////////////////////////////////////
// << g142a.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ポップアップメニュー）
//
//　　ポップアップメニューを作成し表示する。
//
//　●PopupMeuuクラス
//    ポップアップメニューを利用するとき、PopupMenuクラスを使う。
//
//　●PopupMenuのコンストラクタ
//　　PopupMenu(String s)
//      機能：タイトルsのポップアップメニューを生成する。
//
//　●PopupMenuクラスのメソッド
//　　public void show(Component c, int x, int y)
//      機能：位置(x,y)にポップアップメニューを表示する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g142a {

  // コンストラクタ。
  g142a() {
    // フレームの作成。
    Frame f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
     	}
    });

    // ポップアップメニューの作成。
    PopupMenu pm = new PopupMenu();

    // ポップアップメニューをフレーム内に追加。
    f.add(pm); 

    // メニュー項目の作成。
    MenuItem mi1 = new MenuItem("赤"); 
    MenuItem mi2 = new MenuItem("黄"); 
    MenuItem mi3 = new MenuItem("青"); 

    // メニュー項目をポップアップメニューに追加。
    pm.add(mi1);  
    pm.add(mi2); 
    pm.add(mi3); 

    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.setSize(640,480);
    f.setLocationRelativeTo(null);
    // フレームを表示。
    f.setVisible(true);

    // ポップアップメニューの表示。
    pm.show(f,20,40);
  }

  public static void main(String[] args) {
    g142a g = new g142a();
  }

}
