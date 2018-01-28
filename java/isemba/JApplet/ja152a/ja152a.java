//  -*- mode: java -*-  Time-stamp: <08/07/21(月) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja152a.java
 * 作成日: Time-stamp: <08/07/21(月) 07:15:35 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja152a.java >>
//
//  ＪＡｐｐｌｅｔ（３）：マウス操作（直線の描画、イベント処理、内部クラス）
//
//　●操作
//    マウスをクリックすると、直前にクリックした位置と現在の位置を直線で結ぶ。
//    (直前に引かれた直線は消える。)
//
//　●イベント処理
//　　イベントソース：マウス操作
//　　イベント　　　：MouseEventクラス
//　　イベントリスナ：MouseAdapterクラス
//　　　　　　　　　  mouseClickedメソッド
//
//  ●javax.swing.JComponentクラスのメソッド
//　　public int getX()
//      機能：部品の現在のx座標を取得する。
//　　public int getY()
//      機能：部品の現在のy座標を取得する。
//
//　●java.awt.Componentクラスのメソッド
//    public void repaint()
//　　　機能：部品を再び描画する。 
//　　　　　　このメソッドは、paintComponentメソッドを呼び出す。
//　　　　　　オーバーライドされたpaintComponentメソッドにより描画される。
//　　　　　　したがって、前に描画されていた図形は消えることになる。
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

public class ja152a extends JApplet {

  int Px=0,Py=0; // 直前の位置。
  int Cx,Cy; // 現在の位置。

  // initメソッドの定義。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // パネルの作成。
    ja152ap p = new ja152ap();
    // コンテンツペインに追加。
    c.add(p,BorderLayout.CENTER);

    // イベントリスナの登録。
    EventListener el = new EventListener();
    this.addMouseListener(el);
  }

  // パネルを定義(内部クラス)。
  class ja152ap extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      // 直線描画。
      if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }
      g.drawLine(Px,Py,Cx,Cy);
      // 直前の位置を更新。
      Px = Cx; Py = Cy;
    }
  }      

  // イベントリスナを定義(内部クラス)。
  class EventListener extends MouseAdapter {
    // mouseClickedメソッドの定義。
    public void mouseClicked(MouseEvent e) {
      Cx = e.getX(); // クリックした点のx座標を取得する。 
      Cy = e.getY(); // クリックした点のy座標を取得する。 
      repaint();
    }
  }
}
