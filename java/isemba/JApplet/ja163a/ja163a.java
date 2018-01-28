//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja163a.java
 * 作成日: Time-stamp: <08/07/22(火) 13:36:46 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja163a.java >>
//
//  ＪＡｐｐｌｅｔ（４）：スレッド（ディジタル時計）
//  
//    ディジタル時計を１秒ごとに変える。
//
//　●Dateクラス
//　　日付と時間を表すクラス。
//　　java.util.Date
//
//　●Dateクラスのコンストラクタ
//    public Date()
//      機能：現在の日時を取得する。
//
//　●Dateクラスのメソッド
//　  public String toString()
//      機能：Date オブジェクトを、曜日 月 日 時 分 秒 年 の形式の String に
//            変換する。
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

public class ja163a extends JApplet implements Runnable {

  Container c;
  Thread th;
  JLabel lab;

  // initメソッド。
  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの作成。
    lab = new JLabel();
    // パネルをコンテンツペイン内に追加。
    c.add(lab, BorderLayout.CENTER);
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
        Date t = new Date();
        lab.setText(t.toString());
      } catch ( InterruptedException e ) {
        System.out.println(e);
      }
    }
  }
}
