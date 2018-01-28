////////////////////////////////////////////////////////////////////////////////
// << s131c.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（メニューの階層構造、表示と非表示）
//
//  　メニューがメニューを含むことができる。すなわち、メニューの階層化が可能。
//
//  ●JMenuクラスのメソッド
//    public void addSeparator()
//　　　機能：メニューの最後にセパレータを挿入する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s131c extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s131c(String t) {  

    super(t);

    // メニューバーmbの作成。
    JMenuBar mb = new JMenuBar(); 
    // メニューバーmbをフレームウィンドウ内に追加。
    this.setJMenuBar(mb); 

    // メニューmの作成。
    JMenu m = new JMenu("メニュー"); 
    // メニューmをメニューバーmbに追加。
    mb.add(m); 

    // メニューm0,m1の作成。
    JMenu m0 = new JMenu("項目なし"); 
    JMenu m1 = new JMenu("項目あり"); 
    // メニューm0をメニューmに追加。
    m.add(m0); 
    // セパレータをメニューmに追加。
    m.addSeparator(); 
    // メニューm1をメニューmに追加。
    m.add(m1); 

    // メニュー項目mi1,mi2,mi3の作成。
    JMenuItem mi1 = new JMenuItem("赤"); 
    JMenuItem mi2 = new JMenuItem("黄"); 
    JMenuItem mi3 = new JMenuItem("青"); 
    // メニュー項目mi1,mi2,mi3をメニューm1に追加。
    m1.add(mi1);  
    m1.add(mi2); 
    m1.add(mi3); 
  }
   
  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s131c f = new s131c("メニュー付きフレーム");

    // フレームウィンドウの大きさを設定。
    //f.setSize(300,200);
    f.setSize(800,600);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
