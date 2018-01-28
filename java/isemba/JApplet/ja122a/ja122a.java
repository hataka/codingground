////////////////////////////////////////////////////////////////////////////////
// << ja122a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ボタン、配置）
//
//　　「赤」ボタンと「緑」ボタンをレイアウトマネージャ(FlowLayout)を
//　　使って配置する。
//
//　●JButtonクラス
//　　on/offの選択のときにJButtonクラスを使う。
//
//  ●JButtonクラスのコンストラクタ
//    public JButton(String s)      
//      機能：文字列sを表示するボタンを生成する。
//　　
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

public class ja122a extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // ボタンの作成。
    JButton b1 = new JButton("赤");
    JButton b2 = new JButton("緑");

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
  }
}
/**
<applet code="ja122a.class" width="300" height="200">
</applet>
**/
