//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 20:06:46 hata>
/*================================================================
 * プログラム名: ja140a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja140a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（プログレスバー、配置）
//
//　　進捗状況を表示するプログレスバーを示す。
//
//　●JProgressBarクラス
//
//　●JProgressBarクラスのコンストラクタ
//    public JProgressBar(int min, int max)
//　　　機能：水平方向の進捗バーを作成する。範囲を最小値minおよび最大値max
//　　　　　　とする。進捗バーの初期値は最小値に設定する。
//　　　　　　デフォルトでボーダはペイントされ、進捗文字列はペイントされない。
//    public JProgressBar(int orient, int min, int max)
//　　　機能：方向orientの進捗バーを作成する。範囲を最小値minおよび最大値max
//　　　　　　とする。進捗バーの初期値は最小値に設定する。
//　　　　　　デフォルトでボーダはペイントされ、進捗文字列はペイントされない。
//
//　●JProgressBarクラスのメソッド
//    public void setStringPainted(boolean b)
//　　　機能：進捗バーが進捗文字列を描画するかどうかを指定する。
//　　　　　　デフォルトでは false に設定され文字列はペイントされない。
//　　　　　　bをtrueにすると、進捗バーに文字列を描画するようになる。
//    public void setValue(int n)
//　　　機能：進捗バーの現在の値をnに設定する。
//    public void setString(String s)
//      機能：進捗文字列sの値を設定する。デフォルトは、nullに設定されている。
//
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

/*
<!-- to Run: %appletviewer ja140a.java -->
<applet code="ja140a.class" width="800" height="200">
</applet>
*/

public class ja140a extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(1,1));

    // プログレスバーの作成。
    JProgressBar pb = new JProgressBar(0, 100);
    int n=30;
    pb.setValue(n);
    pb.setStringPainted(true);
    pb.setString(n+"%");

    // プログレスバーをコンテンツペイン内に追加。
    c.add(pb);
  }
}
