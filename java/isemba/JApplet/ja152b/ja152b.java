//  -*- mode: java -*-  Time-stamp: <08/07/21(月) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja152b.java
 * 作成日: Time-stamp: <08/07/21(月) 07:21:30 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja152b.java >>
//
//  ＪＡｐｐｌｅｔ（３）：マウス操作（直線の描画、イベント処理、匿名クラス）
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
//　●匿名クラス
//　　匿名クラスは、オブジェクトを１回しか作成しないときに使われる。
//　　プログラムを簡潔に記述できる。
//
//　　    new 親クラス名(引数) {
//          処理                
//        }                     
//
//　　・コンパイルされると、２つのクラスファイルが作成される。
//　　　j152b.class, j152b$1.class, j152b$2.class
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

public class ja152b extends JApplet {

  int Px=0,Py=0; // 直前の位置。
  int Cx,Cy; // 現在の位置。
  JPanel p;

  // initメソッドの定義。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // パネルを定義(匿名クラス)。
    p = new JPanel() {                                               
      public void paintComponent(Graphics g) {                   
        super.paintComponent(g);                                 
        // 直線描画。                                            
        if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }         
        g.drawLine(Px,Py,Cx,Cy);                                 
        // 直前の位置を更新。                                    
        Px = Cx; Py = Cy;                                        
      }                                                  
    };                                                   
    // コンテンツペインに追加。
    c.add(p,BorderLayout.CENTER);   

    // イベントリスナを定義(匿名クラス)。                                    
    MouseAdapter ma = new MouseAdapter() {                                     
      // mouseClickedメソッドの定義。                                        
      public void mouseClicked(MouseEvent e) {                               
        Cx = e.getX(); // クリックした点のx座標を取得する。                  
        Cy = e.getY(); // クリックした点のy座標を取得する。                  
        p.repaint();                                                           
      }                                                                      
    };
    // イベントリスナの登録。
    this.addMouseListener(ma);    
  }
}
