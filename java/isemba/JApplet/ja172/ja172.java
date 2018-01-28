//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja172.java
 * 作成日: Time-stamp: <08/07/22(火) 18:11:30 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja172.java >>
//
//  ＪＡｐｐｌｅｔ（５）：アプレットのサイズを取得
//  
//　　アプレットのサイズを取得しサイズに応じて文字列を変化させる。
//
//  ●java.awt.Componentクラスから継承したメソッド
//    public Dimension getSize()
//      機能：アプレットのサイズをDimensionクラスのオブジェクトとして取得。
//　　　　　　Dimensionクラスは幅(width)と高さ(height)の２個の変数からなる。
//　　　　　　それぞれ整数の値をもつ
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

public class ja172 extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの生成。
    JLabel lab = new JLabel();

    // ラベルをコンテンツペイン内に追加。
    c.add(lab,BorderLayout.CENTER);

    // アプレットのサイズを取得。
    Dimension d = this.getSize();
    int size = d.width/10;
    String s = "高さ："+d.height+"　幅："+d.width;
    lab.setText(s);
    Font f = new Font("Serif",Font.BOLD,size);
    lab.setFont(f);
  }
}
