//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 18:16:59 hata>
/*================================================================
 * プログラム名: ja135b.java
  * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja135b.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（スプリットペイン、配置）
//
//　　表示領域全体を上下に２分割する。
//
//　●JSplitPaneクラス
//　　画面を分割するのに、JSplitPaneクラスを使う。
//
//　●JSplitPaneクラスのコンストラクタ      
//    public JSplitPane(int d)
//      機能：方向dに分割し新しいJSplitPaneを作成する。 
//    　　　  　JSplitPane.HORIZONTAL_SPLIT  水平方向（左右）に分割。
//    　　　  　JSplitPane.VERTICAL_SPLIT    垂直方向（上下）に分割。
//
//　●JSplitPaneクラスのメソッド    
//    public void setLeftComponent(Component comp)
//      機能：部品compを左部(上部)に設定する。 
//    public void setRightComponent(Component comp)
//      機能：部品compを右部(下部)に設定する。 
//    void setContinuousLayout(boolean b)
//    　機能：trueの場合、連続更新機能を有効にする。
//　　　　　　連続更新機能が有効になると、分割線の移動に応じて分割領域が
//　　　　　　更新され再描画される。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja135b extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャーをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ３個のボタンを作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JButton b3 = new JButton("ボタン３");

    // 上下に分割。
    JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    // 連続更新機能を設定。
    sp.setContinuousLayout(true);
    // 上部にボタンb1を割り当てる。
    sp.setLeftComponent(b1);
    // 下部にボタンb2,b3を割り当てる。
    JPanel p = new JPanel();
    p.add(b2);
    p.add(b3);
    sp.setRightComponent(p);
    
    // スプリットペインをコンテンツペイン内に追加。
    c.add(sp,BorderLayout.CENTER);
  }
}
