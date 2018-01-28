//  -*- mode: java -*-  Time-stamp: <08/07/21(月) 07:39:21 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja155b.java
 * 作成日: Time-stamp: <08/07/22(火) 13:11:16 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja155b.java >>
//
//  ＪＡｐｐｌｅｔ（３）：キー操作（イベント処理、アダプタクラス）
//
//　●操作
//　　押されたキーを文字列として表示する。
//
//　●リスナーインターフェースとアダプタクラスの対応
// 　　  KeyListener          KeyAdapter
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

public class ja155b extends JApplet {

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
    EventListener el = new EventListener();
    this.addKeyListener(el);
  }

  // アダプタクラスを内部クラスとして定義。
  class EventListener extends KeyAdapter {
    // 残りのメソッド(keyPressed,keyReleased)の定義が省略できる。  
    // keyTypedメソッドの定義。
    public void keyTyped(KeyEvent e) {
      s = "" + e.getKeyChar();
      lab.setText(s);
      lab.setFont(f);
      lab.setForeground(Color.green);
    }
  }
}
