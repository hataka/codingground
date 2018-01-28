//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: ja171.java
 * 作成日: Time-stamp: <08/07/22(火) 18:03:29 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja171.java >>
//
//  ＪＡｐｐｌｅｔ（５）：HTML文書中のパラメータの取得
//  
//　HTML文書中、タグに記述したパラメータをアプレットに渡すことができる。
//
//  ●タグ
//    
//      ****は、パラメータ名
//      ####は、パラメータの値。数値または文字列。
//
//  ●java.applet.Appletクラスから継承したメソッド
//    public String getParameter(String name)
//      機能：HTML文書中に記述されるパラメータ名nameで指定されたパラメータの
//            値を取得し戻り値とする。値がないときはnullを戻す。
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

public class ja171 extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの生成。
    JLabel lab = new JLabel();

    // ラベルをコンテンツペイン内に追加。
    c.add(lab,BorderLayout.CENTER);

    // HTML文書からパラメータを取得。
    String s = this.getParameter("msg");
    if( s == null ) { 
      s = "メッセージがありません"; 
    }
    lab.setText(s);
  }
}
/**
<applet code="ja171.class" width="300" height="100">
<param name=msg value="HTML文書からのメッセージ">
</applet>
**/
