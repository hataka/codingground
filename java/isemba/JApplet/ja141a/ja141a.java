// -*- mode: java -*- Time-stamp: <2009-06-19 20:13:13 kahata>
/*====================================================================
 * name: ja141a.java 
 * created : Time-stamp: <08/07/20(日) 11:12:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja141a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パスワードフィールド、配置）
//
//　　パスワードの入力欄をもつ部品を示す。
//
//　●JPasswordFieldクラス
//　  1行の編集可能なテキスト入力欄をもつ。ただし、入力した文字はそのまま
//　　表示されず、代わりに＊が表示される。
//
//　●JPasswordFieldクラスのコンストラクタ
//    public JPasswordField(int col)
//      機能：列数colで新規の空のJPasswordFieldを作成する。
//　　　　　　デフォルトの初期文字列はnullに設定される。
//    public JPasswordField(String s, int col)
//　　　機能：テキストsと列数colで、初期化されるJPasswordFieldを作成する。
//
////////////////////////////////////////////////////////////////////////////////
/*===================================================================================
 * </pre>
 * @package    JApplet
 * @subpackage
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2008 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
*=================================================================================*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/*
<applet code="ja141a.class" width="800" height="600">
</applet>
*/

public class ja141a extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // パスワードフィールドの作成。
    JPasswordField pf = new JPasswordField(20);
    pf.setBorder(new TitledBorder("JPasswordField"));

    // パスワードフィールドをコンテンツペイン内に追加。
    c.add(pf);
  }
}
