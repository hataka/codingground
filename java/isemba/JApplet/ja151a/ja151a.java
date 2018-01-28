//  -*- mode: java -*-  Time-stamp: <08/07/21(月) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja151a.java
 * 作成日: Time-stamp: <08/07/21(月) 07:05:47 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja151a.java >>
//
//  ＪＡｐｐｌｅｔ（３）：マウス操作（イベント処理）
//
//　●操作
//　　マウスボタンを押すと、"mousePressed"と表示する。
//　　マウスボタンを離すと、"mouseRelesedp"と表示する。
//　　マウスボタンをクリックすると、"mouseReleased"と表示する。
//    マウスカーソルがウィンドウ内に入ると、"mouseEntered"と表示する。
//    マウスカーソルがウィンドウ外に出ると、"mouseExited"と表示する。
//
//　●イベント処理
//　　イベントソース：マウス操作
//　　イベント　　　：MouseEventクラス
//　　イベントリスナ：MouseListenerインターフェース
//　　　　　　　　　　mousePressed, mouseReleased, mouseClicked, mouseEntered,
//　　　　　　　　　  mouseExited メソッド
//
//  ●リスナーインターフェース（MouseListener）
//　　マウス操作に関するリスナーインターフェース。
//    ５個のメソッドすべてを定義する必要がある。
//
//   　 mousePressed   : マウスボタンを押すと呼び出される。
//    　mouseReleased  : マウスボタンを離すと呼び出される。
//    　mouseCliced    : マウスボタンをクリックすると呼び出される。
//    　mouseEntered   : ウインドウ内にマウスカーソルが入ると呼び出される。
//    　mouseExited    : ウインドウ外にマウスカーソルが出ると呼び出される。
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

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

/*
<applet code="ja151a.class" width="640" height="480">
</applet>
*/
public class ja151a extends JApplet implements MouseListener {

  JLabel lab;

  // initメソッドの定義。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの作成。
    lab = new JLabel("マウスを操作してください");
    // ラベルをコンテンツペイン内に追加。
    c.add(lab,BorderLayout.CENTER);

    // イベントリスナの登録。
    this.addMouseListener(this);
  }

  // mousePressedメソッドの定義。
  public void mousePressed(MouseEvent e) {
    lab.setText("mousePressed");
  }

  // mouseReleasedメソッドの定義。
  public void mouseReleased(MouseEvent e) {
    lab.setText("mouseReleased");
  }

  // mouseClickedメソッドの定義。
  public void mouseClicked(MouseEvent e) { 
    lab.setText("mouseClicked");
  }

  // mouseEnteredメソッドの定義。
  public void mouseEntered(MouseEvent e) { 
    lab.setText("mouseEntered");
  }

  // mouseExitedメソッドの定義。
  public void mouseExited(MouseEvent e) { 
    lab.setText("mouseExited");
  }
}
