//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja162.java
 * 作成日: Time-stamp: <08/07/22(火) 13:32:07 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja162.java >>
//
//  ＪＡｐｐｌｅｔ（４）：スレッド（背景色の切換）
//  
//    アプレットの背景色を１秒ごとに赤、緑と切り換える。
//
//　●Threadクラスのメソッド
//　　public void start()
//      機能：スレッドの実行開始。
//    public static void sleep(long m) throws InterruptedException
//      機能：mミリ秒間停止。
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

public class ja162 extends JApplet implements Runnable {

  Container c;
  Thread th;

  // initメソッド。
  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
  }

  // startメソッド。
  public void start() {
    th = new Thread(this);
    th.start();
  }

  // stopメソッド。
  public void stop() {
    th = null;
  }

  // runメソッド。
  public void run() {
    while( true ) {
      try {
        Thread.sleep(1000); // 1000ミリ秒間スリープする。
        c.setBackground(Color.red);
        Thread.sleep(1000); // 1000ミリ秒間スリープする。
        c.setBackground(Color.green);
      } catch ( InterruptedException e ) {
        System.out.println(e);
      }
    }
  }
}
