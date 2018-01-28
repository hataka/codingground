//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 16:31:25 hata>
/*================================================================
 * プログラム名: ja137d.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137d.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（色選択ダイアログ、イベント処理）
//
//　　色選択ダイアログを示す。
//
//　●イベント処理
//　　イベントソース：JButtonクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●JColorChooserクラス
//　　ダイアログを扱うクラス。
//
//　●JColorChooserクラスのメソッド
//    public static Color showDialog(Component component,
//                                   String title,
//                                   Color initialColor)
//                                   throws HeadlessException
//      機能：色選択ダイアログを表示する。
//　　　　　　OKボタンが押されると、選択された色を返す。
//　　　　　　Cancelボタンが押されると、null を返す。 
//            component   ： ダイアログの親となるコンポーネント。
//            title       ： ダイアログのタイトル文字列。
//            initialColor： 初期色のセット。 
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="ja137d.class" width="300" height="200">
</applet>
*/

public class ja137d extends JApplet implements ActionListener {

  Container c;
  JButton b;
  JLabel lab;
  Color color;
  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(2,1));

    // ボタンbの作成。
    b = new JButton("色選択ダイアログ");
    // ボタンbをコンテンツペイン内に追加。
    c.add(b);

    // ラベルlabの作成。
    lab = new JLabel("選択色");
    Font f = new Font("Serif",Font.BOLD,40);
    lab.setFont(f);
    // ラベルlabをコンテンツペイン内に追加。
    c.add(lab);

    // イベントリスナの登録。
    b.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    String rst = "";
    if( e.getSource() == b ) {
      String title = "color choose dialog";
      Color col = new Color(0,0,0);
      color = JColorChooser.showDialog(c,title,col);
      lab.setForeground(color);
    }
  }
}
