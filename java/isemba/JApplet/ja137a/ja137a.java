//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 16:01:34 hata>
/*================================================================
 * プログラム名: ja137a.java
  * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（メッセージダイアログ、イベント処理）
//
//　　簡単なメッセージを表示するウィンドウをダイアログという。
//　　情報を提示したり、ユーザからの応答を受け付けたりする。
//
//　　ダイアログには、ユーザへのメッセージを伝えるダイアログ(メッセージ
//　　ダイアログ)と、yes/no/cancel 等の確認を求める確認ダイアログ(確認ダイアログ)
//　　がある。
//
//　　ダイアログは、ウィンドウ・タイトル、メッセージ、オプションボタンから
//　　構成される。
//　　
//　　すべてのダイアログはモーダルである。すなわち、ダイアログ上のボタンが
//　　クリックされるまで、他のウィンドウの操作は禁止される。
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
//　　public static void showMessageDialog(Component parentComponent,
//                                         Object message,
//                                         String title,
//                                         int messageType)
//                                         throws HeadlessException
//　　　機能：メッセージダイアログを表示する。 
//            parentComponent： ダイアログの親となるコンポーネント。
//            message        ： ダイアログに表示するメッセージ。
//            title          ： ダイアログのタイトル文字列
//            messageType    ： 表示されるメッセージの種類。
//                              ERROR_MESSAGE、INFORMATION_MESSAGE、
//                              WARNING_MESSAGE、QUESTION_MESSAGE、PLAIN_MESSAGE
//
////////////////////////////////////////////////////////////////////////////////
//<applet codebase = "./" code="ja137a.class" width=640 height=480></applet>

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ja137a extends JApplet implements ActionListener {

  Container c;
  JButton b1,b2,b3,b4,b5;

  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(5,1));

    // ボタンb1,b2,b3,b4,b5の作成。
    b1 = new JButton("エラーメッセージ・ダイアログ");
    b2 = new JButton("情報メッセージ・ダイアログ");        
    b3 = new JButton("警告メッセージ・ダイアログ");        
    b4 = new JButton("質問メッセージ・ダイアログ");        
    b5 = new JButton("通常メッセージ・ダイアログ");        

    // ボタンb1,b2,b3,b4,b5をコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);
    c.add(b5);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) {
      String title = "message dialog";
      String msg = "エラーメッセージ・ダイアログです";
      int type = JOptionPane.ERROR_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b2 ) {
      String title = "message dialog";
      String msg = "情報メッセージ・ダイアログです";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b3 ) {
      String title = "message dialog";
      String msg = "警告メッセージ・ダイアログです";
      int type = JOptionPane.WARNING_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b4 ) {
      String title = "message dialog";
      String msg = "質問メッセージ・ダイアログです";
      int type = JOptionPane.QUESTION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b5 ) {
      String title = "message dialog";
      String msg = "通常メッセージ・ダイアログです";
      int type = JOptionPane.PLAIN_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
  }
}
