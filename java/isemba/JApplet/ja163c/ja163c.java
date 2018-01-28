//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja163c.java
 * 作成日: Time-stamp: <08/07/22(火) 17:52:56 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja163c.java >>
//
//  ＪＡｐｐｌｅｔ（４）：スレッド（２個のディジタル時計、内部クラス）
//  
//    １秒ごとに変わるディジタル時計と10秒ごと変わるディジタル時計を
//　　同時に動かす。
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
import javax.swing.*;
import java.util.Date;

public class ja163c extends JApplet {

  Thread th1,th2;
  JLabel lab1,lab2;

  // initメソッド。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(2,1));

    // ラベルの作成。
    lab1 = new JLabel();
    lab2 = new JLabel();
    // パネルをコンテンツペイン内に追加。
    c.add(lab1);
    c.add(lab2);
  }

  // startメソッド。
  public void start() {
    th1 = new tokei1();
    th2 = new tokei2();
    th1.start();
    th2.start();
  }

  // stopメソッド。
  public void stop() {
    th1 = null;
    th2 = null;
  }

  // １秒ごとに更新される時計（内部クラス）。
  class tokei1 extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab1.setText(t.toString());
          Thread.sleep(1000); // 1000ミリ秒間スリープする。
        } catch ( InterruptedException e ) {
          System.out.println(e);
        }
      }
    }
  }
  class tokei2 extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab2.setText(t.toString());
          Thread.sleep(10000); // 10000ミリ秒間スリープする。
        } catch ( InterruptedException e ) {
          System.out.println(e);
        }
      }
    }
  }
}
