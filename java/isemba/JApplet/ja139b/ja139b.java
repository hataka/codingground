//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 18:30:53 hata>
/*================================================================
 * プログラム名: ja139a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja139b.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（スライダー、配置、イベント処理）
//
//　　スライダーで選択された値をラベルに表示する
//
//　●ChangeListenerインターフェース
//    ChangeEvent に待機するリスナーオブジェクトを定義する。 
//
//　●ChangeListenerインターフェースのメソッド
//    public void stateChanged(ChangeEvent e)
//      機能：リスナーの対象の状態が変更されたときに呼び出される。
//
//　●JSliderクラスのメソッド
//　　public boolean getValueIsAdjusting()
//　　　機能：スライダのノブがドラッグされている場合に true を返す。
//    public int getValue()
//　　　機能：スライダの値を返す。 

//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/*
<applet code="ja139b.class" width="640" height="100">
</applet>
*/

public class ja139b extends JApplet implements ChangeListener {

  JLabel lab;

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(2,1));

    // スライダーの作成。
    JSlider sd = new JSlider(0, 50, 10);
    sd.setMajorTickSpacing(10);
    sd.setMinorTickSpacing(2);
    sd.setPaintTicks(true);
    sd.setPaintLabels(true);
    // スライダーをコンテンツペイン内に追加。
    c.add(sd);

    // ラベルを作成。
    lab = new JLabel();
    // ラベルをコンテンツペイン内に追加。
    c.add(lab);

    // イベントリスナの登録。
    sd.addChangeListener(this);
  }

  // ChangeListenerインターフェースのメソッド。  
  public void stateChanged(ChangeEvent e) {                  
    JSlider sd = (JSlider)e.getSource();          
    // スライダーのノブをドラッグ中は、スキップ。
    if( !sd.getValueIsAdjusting() ) {               
      int v = (int)sd.getValue();                
      lab.setText("目盛りの値：" + v);                                
    }                                                  
  }                                                        
}
