//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 15:58:06 hata>
/*================================================================
 * プログラム名: ja136.java
  * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja136.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（タブペイン、配置）
//
//　　部品にタブを付ける。タブがクリックされると部品を表示する。
//
//　●JTabbedPaneクラス
//　　タブペインを作成するクラス。
//
//　●JTabbedPaneクラスのコンストラクタ
//    public JTabbedPane()
//    　機能：タブペインを生成する。
//
//　●JTabbedPaneクラスのメソッド
//    public void addTab(String s, Component c)
//    　機能：タブ名をsとする部品cを追加する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja136 extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // ラベルlab1,lab2,lab3の作成。
    JLabel lab1 = new JLabel("ラベル１");
    JLabel lab2 = new JLabel("ラベル２");
    JLabel lab3 = new JLabel("ラベル３");

    // タブペインtpの作成。
    JTabbedPane tp = new JTabbedPane();
    // タブペインtp内にラベルlab1を追加。
    tp.addTab("タブ１",lab1);

    // パネルpを作成。
    JPanel p = new JPanel();
    // ラベルlab2,lab3をパネルp内に追加。
    p.add(lab2);
    p.add(lab3);
    // タブペインtp内にパネルpを追加。
    tp.addTab("タブ２",p);

    // タブペインtpをコンテンツペイン内に追加。
    c.add(tp,BorderLayout.CENTER);
  }
}
