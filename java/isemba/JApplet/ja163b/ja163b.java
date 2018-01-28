//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja163b.java
 * 作成日: Time-stamp: <08/07/22(火) 13:51:04 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja163b.java >>
//
//  ＪＡｐｐｌｅｔ（４）：スレッド（ディジタル時計、内部クラス）
//  
//    １秒ごとに変わるディジタル時計を内部クラスを使って記述する。
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

public class ja163b extends JApplet {

  Thread th;
  JLabel lab;

  // initメソッド。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの作成。
    lab = new JLabel();
    // パネルをコンテンツペイン内に追加。
    c.add(lab, BorderLayout.CENTER);
  }

  // startメソッド。
  public void start() {
    th = new tokei();
    th.start();
  }

  // stopメソッド。
  public void stop() {
    th = null;
  }

  // １秒ごとに更新される時計（内部クラス）。
  class tokei extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab.setText(t.toString());
          Thread.sleep(1000); // 1000ミリ秒間スリープする。
        } catch ( InterruptedException e ) {
          System.out.println(e);
        }
      }
    }
  }
}
