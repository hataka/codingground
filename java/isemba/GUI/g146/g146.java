////////////////////////////////////////////////////////////////////////////////
// << g146.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（スクロールバー）
//
//    数値を連続的に変化させる。
//    スライダーをマウスでドラッグして数値を変化させる。
//　　左右の方向ボタンをクリックすると数値が+1,-1変化する。
//    バーのスライダー以外をクリックすると、数値が+10,-10変化する。
//
//  ●Scrollbarクラスのコンストラクタ
//    Scrollbar(方向,初期値,スライダーサイズ,最小値,最大値)
//      機能：スライダーを移動して数値を変化させる。
//      方向：Scrollbar.HORIZONTAL  横方向                       
//            Scrollbar.VERTICAL    縦方向
//      初期値：最初の数値
//　　　スライダーサイズ：スライダーの幅の数値
//      最小値：左端（または上端）の数値。
//      最大値：右端（または下端）の数値（スライダーを右端に移動したときの数値に
//              スライダーのサイズを加えたものとする）
//
//  ●Scrollbarクラスのメソッド
//    int getValue()
//      機能：スクロールバーの現在値を返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 

class g146 implements AdjustmentListener {

  Frame f;
  Scrollbar sbh,sbv;
  Label lab;

  // コンストラクタ。
  g146() {
    // フレームの作成。
    f = new Frame();
    // フレームにレイアウトマネージャ(BorderLayout)を設定。
    f.setLayout(new BorderLayout(10,10));

    // スクロールバーの作成。
    sbh = new Scrollbar(Scrollbar.HORIZONTAL,150,10,0,310);
    sbv = new Scrollbar(Scrollbar.VERTICAL,50,10,0,110);

    // スクロールバーをフレーム内に追加。
    f.add(sbh,"North");
    f.add(sbv,"East");

    // ラベルの作成。
    lab = new Label("              ");
    // ラベルをフレーム内に追加。
    f.add(lab);

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
    sbh.addAdjustmentListener(this);
    sbv.addAdjustmentListener(this);
  }

  // スクロールバーから送られてきたイベントを処理するメソッド。
  public void adjustmentValueChanged(AdjustmentEvent e) {
    if( e.getSource() == sbh ) {
      int h = sbh.getValue();
      lab.setText("バーの値：h=" + h);
    }
    if( e.getSource() == sbv ) {
      int v = sbv.getValue();
      lab.setText("バーの値：v=" + v);
    }
  }

  public static void main(String[] args) {
    g146 g = new g146();
  }

}
