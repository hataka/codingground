// -*- mode: java -*- Time-stamp: <2009-06-22 18:20:15 kahata>
/*====================================================================
 * name: g118.java 
 * created : Time-stamp: Time-stamp: <09/06/21(日) 06:08:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g118.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  &lt;&lt; g118.java &gt;&gt;
//
//  グラフィックス（１）：画像
//  
//　　　外部にファイルとして存在する画像を取得して表示する。
//
//　　　画像の読込が開始され完了後、表示する。
//
//  ●MediaTrackクラス
//　　画像の読込が開始され完了後、表示するのに、MediaTrackクラスを使う。
//
//　●MediaTrackクラスのコンストラクタ
//　　MediaTrack(Component c)
//      機能：コンポーネントcにメディアトラックを作成する。
//
//　●MediaTrackクラスのメソッド
//　　void addImage(Image img, int k)
//      機能：メディアトラックオブジェクトに画像imgを追加し、識別のため番号kを
//　　　　　　つける。読込処理が開始される。
//　　　　　　異なる画像には異なる番号をつける必要がある。
//　　boolean waitForID(int k)
//      機能：番号kをもつ画像が完全に読み込まれるまで待つ。
//　　boolean waitForAll()
//      機能：登録されたすべての画像が完全に読み込まれるまで待つ。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp118 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  
    // 外部の画像ファイルを読み込むには、Toolkitオブジェクトを使う。
    // Toolkitオブジェクトを取得するには、ToolkitクラスのgetDefaultToolkit
    // メソッドを使う。
    MediaTracker mt = new MediaTracker(this);
    Image img = Toolkit.getDefaultToolkit().getImage("semba.gif");
    mt.addImage(img,0);
    try {
      mt.waitForID(0);
    } catch( InterruptedException e) { }
    g.drawImage(img,50,50,this);
    g.drawImage(img,50,100,150,60,this);
  }
}

// フレームの定義。
class gf118 extends JFrame{
  gf118(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp118 gp = new gp118();
    gp.setBackground(Color.lightGray);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g118 {
  public static void main(String[] args) {
    // フレーム生成。
    gf118 gf = new gf118("フレーム"); 
    // フレームの大きさを設定
    gf.setSize(1200,900);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
		gf.setLocationRelativeTo(null);
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
