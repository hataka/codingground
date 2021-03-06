////////////////////////////////////////////////////////////////////////////////
// << g142d.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ポップアップメニュー、イベント処理）
//
//　　フレーム内でクリックしたとき、その位置にポップアップメニューを表示する。
//
//　　匿名クラスは、名前を持たないクラスで、クラス内にクラスを定義できる。
//　　イベントソースが多くなり、イベントソースとイベントリスナの対応が
//　　見にくくなるとき、見通しをよくすることができる。
//
//　　コンパイルされると、クラスファイル(g142d.class,g142d$1.class)が作成される。
//    g142d$1.classが匿名クラスのクラスファイルである。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 

class g142d implements ActionListener {

  Frame f;
  PopupMenu pm;
  MenuItem mi1,mi2,mi3;

  // コンストラクタ。
  g142d() {
    // フレームの作成。
    f = new Frame("フレーム");
    // フレームにレイアウトマネージャ(FlowLayout)を設定。
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

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

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);

    // 匿名クラスを用いたイベントリスナの登録。
    f.addMouseListener( new MouseAdapter() {
      public void mouseClicked(MouseEvent me) {
        pm.show(f, me.getX(), me.getY()); 
      }
    });
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == mi1 ) { f.setBackground(Color.red); }
    if( ae.getSource() == mi2 ) { f.setBackground(Color.yellow); }
    if( ae.getSource() == mi3 ) { f.setBackground(Color.blue); }
  }

  public static void main(String[] args) {
    g142d g = new g142d();
  }

}
