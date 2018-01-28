//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 16:09:13 hata>
/*================================================================
 * プログラム名: ja137b.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137b.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（確認ダイアログ、イベント処理）
//
//　　確認ダイアログを示す。
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
//　　public static void showConfirmDialog(Component parentComponent,
//                                         Object message,
//                                         String title,
//                                         int messageType)
//                                         throws HeadlessException
//　　　機能：確認メッセージダイアログを表示する。 
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

public class ja137b extends JApplet implements ActionListener {

  Container c;
  JButton b1,b2,b3,b4;

  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(4,1));

    // ボタンb1,b2,b3,b4,b5の作成。
    b1 = new JButton("OK・ダイアログ");
    b2 = new JButton("OK CANCEL・ダイアログ");        
    b3 = new JButton("YES NO・ダイアログ");        
    b4 = new JButton("YES NO CANCEL・ダイアログ");        

    // ボタンb1,b2,b3,b4をコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
 
 	resize(800,600);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    int rst = 0;
    if( e.getSource() == b1 ) {
      String title = "confirm dialog";
      String msg = "OK ダイアログです";
      int type = JOptionPane.DEFAULT_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }
    if( e.getSource() == b2 ) {
      String title = "confirm dialog";
      String msg = "OK CANCEL ダイアログです";
      int type = JOptionPane.OK_CANCEL_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }
    if( e.getSource() == b3 ) {
      String title = "confirm dialog";
      String msg = "YES NO ダイアログです";
      int type = JOptionPane.YES_NO_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }
    if( e.getSource() == b4 ) {
      String title = "confirm dialog";
      String msg = "YES NO CANCEL ダイアログです";
      int type = JOptionPane.YES_NO_CANCEL_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }

    if( rst == JOptionPane.YES_OPTION ) {
      String title = "message dialog";
      String msg = "YES を受理しました";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( rst == JOptionPane.NO_OPTION ) {
      String title = "message dialog";
      String msg = "NO を受理しました";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( rst == JOptionPane.CANCEL_OPTION ) {
      String title = "message dialog";
      String msg = "CANCEL を受理しました";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
  }
}
