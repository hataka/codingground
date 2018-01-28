//  -*- mode: java -*-  Time-stamp: <08/07/21(月) 07:39:21 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja155a.java
 * 作成日: Time-stamp: <08/07/22(火) 12:56:35 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja155a.java >>
//
//  ＪＡｐｐｌｅｔ（３）：キー操作(イベント処理)
//
//　●操作
//　　押されたキーを文字列として表示する。
//
//　●イベント処理
//　　イベントソース：キー操作
//　　イベント　　　：KeyEventクラス
//　　イベントリスナ：KeyListenerインターフェース
//                    keyTyped, keyPressed, keyReleased
//
//　●KeyListenerインターフェースのメソッド
//    public void keyPressed(KeyEvent e)
//　　　機能：キーが押されたときの処理。
//    public void keyReleased(KeyEvent e)
//　　　機能：キーが離されたときの処理。
//    public void keyTyped(KeyEvent e)
//　　　機能：キーが入力されたときの処理。
//
//  ●KeyEventクラスのメソッド
//　　public char getKeyChar()
//      機能：入力された文字を取得する。
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

public class ja155a extends JApplet implements KeyListener {

  JLabel lab;
  Font f;
  String s;

  // initメソッドの定義。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // フォントの作成。
    f = new Font("Courier", Font.BOLD, 48);

    // ラベルの作成。
    lab = new JLabel("キーを操作してください");
    // ラベルをコンテンツペイン内に追加。
    c.add(lab,BorderLayout.CENTER);

    // イベントリスナの登録。
    this.addKeyListener(this);
  }

  // keyTypedメソッドの定義。
  public void keyTyped(KeyEvent e) {
    s = "" + e.getKeyChar();
    lab.setText(s);
    lab.setFont(f);
    lab.setForeground(Color.green);
  }

  // 残りのメソッドも定義する必要がある。
  public void keyPressed(KeyEvent e) { }
  public void keyReleased(KeyEvent e) { }
}
