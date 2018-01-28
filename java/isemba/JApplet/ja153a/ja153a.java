//  -*- mode: java -*-  Time-stamp: <08/07/21(月) 07:39:21 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja153a.java
 * 作成日: Time-stamp: <08/07/21(月) 07:38:30 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja153a.java >>
//
//  ＪＡｐｐｌｅｔ（３）：マウス操作（イベント処理）
//
//　●操作
//　　マウスボタンを押してドラッグすると、"mouseDragged"と表示する。
//　　マウスボタンを押さずにマウスを移動すると、"mouseMoved"と表示する。
//
//　●イベント処理
//　　イベントソース：マウス操作
//　　イベント　　　：MouseEventクラス
//　　イベントリスナ：MouseMotionListenerインターフェース
//　　　　　　　　　　mouseDragged, mouseMovedメソッド
//
//　●リスナーインターフェース(MouseMotionListener)
//    ２個のメソッドすべてを定義する必要がある。
//
//　　　mouseDragged ：マウスボタンを押してドラッグすると呼び出される。
//　　　mouseMoved   ：ボタンを押さずにマウスを移動すると呼び出される。
//
////////////////////////////////////////////////////////////////////////////////
===================================================================================
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
// <applet codebase = "./" code="ja153a.class" width=640 height=480></applet>

import java.awt.*; 
import java.awt.event.*;     
import javax.swing.*; 

public class ja153a extends JApplet implements MouseMotionListener {

  JLabel lab;

  // initメソッドの定義。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout());

    // ラベルの作成。
    lab = new JLabel("マウスを操作してください");
    // ラベルをコンテンツペイン内に追加。
    c.add(lab);

    // イベントリスナの登録。
    this.addMouseMotionListener(this);
  }

  // mouseDraggedメソッドの定義。
  public void mouseDragged(MouseEvent e) {
    lab.setText("mouseDragged");
  }

  // mouseMovedメソッドの定義。  
  public void mouseMoved(MouseEvent e) {
    lab.setText("mouseMoved");
  }
}
