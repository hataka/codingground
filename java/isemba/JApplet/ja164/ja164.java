//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja164.java
 * 作成日: Time-stamp: <08/07/22(火) 17:59:08 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
// << ja164.java >>
//
//  ＪＡｐｐｌｅｔ（４）：スレッド（ディジタル時計、ボタン操作）
//
//　●操作
//　　　開始と書かれたボタンをクリックするとディジタル時計が動き、
//　　　停止と書かれたボタンをクリックするとディジタル時計が停止する。
//
//　●スレッドの停止。
//　　スレッドの停止に、Threadクラスのメソッドstop()は、安全でないので使わない
//　　ほうがよい。代わりの方法を示す。
//
////////////////////////////////////////////////////////////////////////////////
 * </pre>
 * @package    JApplet
 * @subpackage
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2008 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
 */
/*=================================================================================*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

public class ja164 extends JApplet implements ActionListener, Runnable {

  JButton b1,b2; 
  JLabel lab;
  Thread th;
  boolean running; // スレッドが動作中はtrue、停止中はfalse。

  // initメソッド。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ボタンの作成。
    b1 = new JButton("開始");
    b2 = new JButton("停止");
    // パネルの作成
    JPanel p = new JPanel();
    // ボタンをパネル内に追加。
    p.add(b1);
    p.add(b2);
    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.NORTH);

    // ラベルの作成。
    lab = new JLabel();
    // ラベルをコンテンツペイン内に追加。
    c.add(lab, BorderLayout.CENTER);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // startメソッド。
  public void start() {
    th = new Thread(this);
    th.start();
    running = true;
  }

  // stopメソッド。
  public void stop() {
    // スレッドの停止。
    th = null;
  }

  // １秒ごとに更新するディジタル時計。
  public void run() {
    while( running ) { // runningがtrueの間、繰り返し実行され、外部からfalseに
                       // 設定されるとループを脱出する。
      try {
        Thread.sleep(1000); // 1000ミリ秒間スリープする。
        Date t = new Date();
        lab.setText(t.toString());
      } catch ( InterruptedException e ) {
        System.out.println(e);
      }
    }
    th = null;
  }

  // リスナインターフェース(ActionListener)のメソッド。
  public void actionPerformed(ActionEvent e) {
    // ボタンがクリックされたとき、実行される。
    if( e.getSource() == b1 ) {
      th = new Thread(this);
      th.start();
      running = true;
    } 
    if( e.getSource() == b2 ) {
      running = false;
    } 
  }
}
