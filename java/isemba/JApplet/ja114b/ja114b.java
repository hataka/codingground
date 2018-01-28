////////////////////////////////////////////////////////////////////////////////
// << ja114b.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（BoxLayout）
//
//　　部品は左から右へ(または上から下へ)配置される。
//　　アプレットの大きさが変わっても配置は変わらない。
//
//　●BoxLayoutクラスのコンストラクタ
//    public BoxLayout(Container target, int axis)
//      機能：部品を方向axisに配置するレイアウトマネージャを作成する。
//            target： 設定するコンテナ。
//            BoxLayout.X_AXIS： 左から右へ。
//            BoxLayout.Y_AXIS： 上から下へ。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja114b extends JApplet {

  public void init() {
    // アプレットのコンテンツペインを取得。
    Container c = getContentPane();
    // コンテンツペインのレイアウトマネージャをBoxLayoutに設定。
    c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

    // ボタンとラベルの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");
    JLabel lab = new JLabel("ラベル");

    // ボタンとラベルをコンテンツペイン内に追加。
    c.add(b1);
    c.add(lab);
    c.add(b2);
  }
}
/**
<applet code="ja114b.class" width="640" height="480">
</applet>
*/
