//  -*- mode: java -*-  Time-stamp: <08/07/21(月) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja151b.java
 * 作成日: Time-stamp: <08/07/21(月) 07:10:52 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja151b.java >>
//
//  ＪＡｐｐｌｅｔ（３）：マウス操作（イベント処理、アダプタクラス）
//
//　●操作
//    マウスカーソルがウィンドウ内に入ると、"mouseEntered"と表示する。
//    マウスカーソルがウィンドウ外に出ると、"mouseExited"と表示する。
//
//　●イベント処理
//　　イベントソース：マウス操作
//　　イベント　　　：MouseEventクラス
//　　イベントリスナ：MouseAdapterクラス
//　　　　　　　　　　mouseClickedメソッド
//
//　●アダプタクラス
//　　イベントリスナはリスナーインターフェースのすべてのメソッドを定義しなければ
//　　ならない。これをさけるためアダプタクラス呼ばれるクラスが準備されている。
//　　適当なアダプタクラスを使うと、必要なメソッドのみオーバーライドするだけで
//　　よい。
//    ・アダプタクラスはリスナーインターフェースのメソッドを空のメソッドとして
//　　　定義しただけである。
//  　・コンパイルすると２つのクラスファイルが生成される。
//　　　ja151b.class, ja151b$EventListener.class
//
//　●リスナーインターフェースとアダプタクラスの対応
//     MouseListener        MouseAdapter
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

public class ja151b extends JApplet {

  JLabel lab;

  // initメソッドの定義。
  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベル生成。
    lab = new JLabel("マウスを操作してください");
    // コンテンツペインに追加。
    c.add(lab,BorderLayout.CENTER);

    // イベントリスナの登録。
    EventListener el = new EventListener();
    this.addMouseListener(el);
  }

  // イベントリスナを定義(内部クラス)。
  class EventListener extends MouseAdapter {
    // 残りのメソッド(mousePressed,mouseReleased,mouseClicked)の
    // 定義が省略できる。  

    // mouseEnteredメソッドの定義。            
    public void mouseEntered(MouseEvent e) {   
      lab.setText("mouseEntered");             
    }                                          
                                               
    // mouseExitedメソッドの定義。             
    public void mouseExited(MouseEvent e) {    
      lab.setText("mouseExited");              
    }                                          
  }
}
