////////////////////////////////////////////////////////////////////////////////
// << g142b.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ポップアップメニュー、イベント処理）
//
//　　フレーム内でクリックしたとき、その位置にポップアップメニューを表示する。
//
//　　MouseListenerインターフェースを実装するには、このインターフェースに
//　　定義されている５個のメソッドをすべて定義しなければならない。
//      public void mouseClicked(MouseEvent me) { }
//　　　　　マウスがクリックされると呼ばれる。
//      public void mousePressed(MouseEvent me) { }
//　　　　　マウスボタンが押されると呼ばれる。
//      public void mouseReleased(MouseEvent me) { }
//　　　　　マウスボタンが離されると呼ばれる。
//      public void mouseEntered(MouseEvent me) { }
//　　　　　部品内にマウスが入ったとき呼ばれる。
//      public void mouseExited(MouseEvent me) { }
//　　　　　部品からマウスが出たとき呼ばれる。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 

class g142b implements ActionListener, MouseListener {

  Frame f;
  PopupMenu pm;
  MenuItem mi1,mi2,mi3;

  // コンストラクタ。
  g142b() {
    // フレームの作成。
    f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
     	}
    });

    // ポップアップメニューの作成。
    pm = new PopupMenu();

    // ポップアップメニューをフレーム内に追加。
    f.add(pm); 

    // メニュー項目の作成。
    mi1 = new MenuItem("赤"); 
    mi2 = new MenuItem("黄"); 
    mi3 = new MenuItem("青"); 

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

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
    f.addMouseListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == mi1 ) { f.setBackground(Color.red); }
    if( ae.getSource() == mi2 ) { f.setBackground(Color.yellow); }
    if( ae.getSource() == mi3 ) { f.setBackground(Color.blue); }
  }

  // MouseListenerインターフェースのメソッド。
  public void mouseClicked(MouseEvent me) {
    pm.show(f, me.getX(), me.getY()); 
  }
  public void mousePressed(MouseEvent me) { }
  public void mouseReleased(MouseEvent me) { }
  public void mouseEntered(MouseEvent me) { }
  public void mouseExited(MouseEvent me) { }

  public static void main(String[] args) {
    g142b g = new g142b();
  }

}
