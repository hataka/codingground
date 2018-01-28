//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 16:22:22 hata>
/*================================================================
 * プログラム名: ja137c.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137c.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（入力ダイアログ、イベント処理）
//
//　　入力ダイアログを示す。
//
//　●イベント処理
//　　イベントソース：JButtonクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●JOptionPaneクラス
//　　ダイアログを扱うクラス。
//
//　●JOptionPaneクラスのメソッド
//　　public static String showInputDialog(Component parentComponent,
//                                         Object message,
//                                         String title,
//                                         int messageType)
//                                         throws HeadlessException
//　　　機能：入力ダイアログを表示する。 
//            parentComponent： ダイアログの親となるコンポーネント。
//            message        ： ダイアログに表示するメッセージ。
//            title          ： ダイアログのタイトル文字列
//            messageType    ： 表示されるメッセージの種類。
//                              ERROR_MESSAGE、INFORMATION_MESSAGE、
//                              WARNING_MESSAGE、QUESTION_MESSAGE、PLAIN_MESSAGE
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="ja137c.class" width="640" height="480">
</applet>
*/

public class ja137c extends JApplet implements ActionListener {

  Container c;
  JButton b;
  JLabel lab;

  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(2,1));

    // ボタンbの作成。
    b = new JButton("入力ダイアログ");
    // ボタンbをコンテンツペイン内に追加。
    c.add(b);

    // ラベルlabの作成。
    lab = new JLabel("入力データ");
    // ラベルlabをコンテンツペイン内に追加。
    c.add(lab);

    // イベントリスナの登録。
    b.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    String rst = "";
    if( e.getSource() == b ) {
      String title = "input dialog";
      String msg = "入力ダイアログです。入力してください";
      int type = JOptionPane.QUESTION_MESSAGE;
      rst = JOptionPane.showInputDialog(c,msg,title,type);
      lab.setText(rst);
    }
  }
}
