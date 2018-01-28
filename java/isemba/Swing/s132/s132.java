////////////////////////////////////////////////////////////////////////////////
// << s132.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（ポップアップメニュー、イベント処理）
//
//　　フレーム内で右ボタンをクリック(ポップアップトリガーという)したとき、
//　　その位置にポップアップメニューを表示する。
//
//　●javax.swing.JPopupMeuuクラス
//    ポップアップメニューを利用するとき、JPopupMenuクラスを使う。
//
//　●JPopupMenuのコンストラクタ
//　　public JPopupmenu(String s)
//      機能：タイトルsのポップアップメニューを生成する。
//
//　●JPopupMenuクラスのメソッド
//　　public void show(Component c, int x, int y)
//      機能：ポップアップメニューが表示される部品の位置(x,y)に
//　　　　　　ポップアップメニューを表示する。
//
//　●MouseEventクラスのメソッド
//　　public boolean isPopupTrigger()
//      機能：イベントがポップアップトリガーならtrue、他の場合false。
//
//　●ComponentEventクラスのメソッド        
//　　public Component getComponent()
//      機能：イベントソースとなるコンポーネントの参照を返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s132 extends JFrame implements ActionListener, MouseListener {

  JPopupMenu pm;
  JMenuItem mi1,mi2,mi3;
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s132(String t) {  

    super(t);

    // フレームのコンテンツペインを取得。
    c = this.getContentPane();

    // ポップアップメニューpmの作成。
    pm = new JPopupMenu();

    // メニュー項目mi1,mi2,mi3の作成。
    mi1 = new JMenuItem("赤"); 
    mi2 = new JMenuItem("黄"); 
    mi3 = new JMenuItem("青"); 
    // メニュー項目mi1,mi2,mi3をポップアップメニューpmに追加。
    pm.add(mi1);  
    pm.add(mi2);  
    pm.add(mi3);  

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
    this.addMouseListener(this);
  }

  //////////////////////////////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド(メニューのイベント処理) //
  //////////////////////////////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == mi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == mi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == mi3 ) { c.setBackground(Color.blue); }
  }

  ///////////////////////////////////////////////////////////////////
  // MouseListenerインターフェースのメソッド(マウスのイベント処理) //
  ///////////////////////////////////////////////////////////////////
  public void mouseReleased(MouseEvent e) {
    if(e.isPopupTrigger()) {
      pm.show(e.getComponent(), e.getX(), e.getY());
    } 
  }
  public void mousePressed(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e) { }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s132 f = new s132("ポップアップメニュー付きフレーム");

    // フレームの大きさを設定。
    //f.setSize(300,200);
    f.setSize(640,480);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
