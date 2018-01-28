// -*- mode: java -*- Time-stamp: <2009-06-22 18:20:15 kahata>
/*====================================================================
 * name: g117.java 
 * created : Time-stamp: Time-stamp: <09/06/21(日) 06:08:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GRAPHICS/g117.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << g117.java >>
//
//  グラフィックス（１）：画像
//  
//　　　外部にファイルとして存在する画像を取得して表示する。
//
//　　　画像の読込が開始されると、他の処理と並行して進められる。
//　　　その結果、画像の一部分が表示され、後からだんだんと残りが表示されることも
//　　　あり得る。
//
//  ●Imageクラス
//　　写真などの画像ファイルを扱うとき、Imageクラスを使う。
//
//　●Toolkitクラス
//    外部の画像ファイルを読み込むには、Toolkitオブジェクトを使う。
//　　Toolkitオブジェクトを取得するには、ToolkitクラスのgetDefaultToolkit
//　　メソッドを使う。
//
//　●Toolkitクラスのメソッド
//　　Toolkit getDefaultToolkit()
//      機能：デフォルトのツールキットオブジェクトを返す。
//　　Image getImage(String s)
//      機能：ファイルsから画像を取りだす。
//
//　●Graphicsクラスのメソッド
//　　boolean drawImage(Image img, int x, int y, ImageObserver observer)
//   　 機能：Imageオブジェクトimgを座標(x,y)に表示する。
//　　　　　　画像が完全に表示される前にtrueを呼び出し側に返す場合がある。
//　　　　　　observer：表示の状況を通知するオブジェクト(nullと指定してもよい)。
//　　boolean drawImage(Image img, int x, int y, int w, int h,
//                      ImageObserver observer)
//   　 機能：Imageオブジェクトimgを座標(x,y)に,幅w,高さhで表示する。
//　　　　　　画像が完全に表示される前にtrueを呼び出し側に返す場合がある。
//　　　　　　observer：表示の状況を通知するオブジェクト(nullと指定してもよい)。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

// パネルの定義。
class gp117 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  
    // 外部の画像ファイルを読み込むには、Toolkitオブジェクトを使う。
    // Toolkitオブジェクトを取得するには、ToolkitクラスのgetDefaultToolkit
    // メソッドを使う。
    Image img = Toolkit.getDefaultToolkit().getImage("semba.gif");
    g.drawImage(img,50,50,this);
    g.drawImage(img,200,50,90,90,this);
  }
}

// フレームの定義。
class gf117 extends JFrame{
  gf117(String t) { // コンストラクタ。
    super(t);
    // フレームからコンテントペインを取得。
    Container c = this.getContentPane();
    // パネルを生成し、フレームに追加。
    gp117 gp = new gp117();
    gp.setBackground(Color.lightGray);
    c.add(gp,BorderLayout.CENTER);
  }
}

class g117 {
  public static void main(String[] args) {
    // フレーム生成。
    gf117 gf = new gf117("フレーム"); 
    // フレームの大きさを設定
    gf.setSize(320,240);
		gf.setLocationRelativeTo(null);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレーム表示。
    gf.setVisible(true);
  }
}
