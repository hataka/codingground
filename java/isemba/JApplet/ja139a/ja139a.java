//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 16:31:25 hata>
/*================================================================
 * プログラム名: ja139a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja139a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（スライダー、配置）
//
//　　スライダーは、メモリ表示された区間内でノブをスライドすることにより
//　　目盛りの値を選択できる部品である。
//　　スライダは、大目盛りと、その間の小目盛りの両方を表示できる。
//
//　●JSliderクラス
//　　スライダーを扱うクラス。
//
//　●JSliderクラスのコンストラクタ
//    public JSlider(int min, int max, int value)
//　　　機能：最小値min、最大値max、および初期値valueを指定して、水平スライダを
//　　　　　　作成する。
//    public JSlider(int orientation, int min, int max, int value)
//　　　機能：方向orientation、最小値min、最大値max、および初期値valueを指定して、
//            スライダを作成する。 
//　　　　　　方向：VERTICAL、HORIZONTAL
//
//　●JSliderクラスのメソッド
//    public void setMajorTickSpacing(int n)
//　　　機能：大目盛りの間隔nを設定する。
//　　　　　　範囲が 0 ～ 50 のスライダで、大目盛りの間隔が10の場合、
//　　　　　　0,10,20,30,40,50に大目盛りが付けられる。 
//    public void setMinorTickSpacing(int n)
//      機能：小目盛りの間隔nを設定する。
//　　　　　　範囲が 0 ～ 50 のスライダで、小目盛りの間隔が2の場合は、
//　　　　　　0,2,4,...,48,50に小目盛りが付けられる
//    public void setPaintTicks(boolean b)
//      機能：目盛りがスライダでペイントされるかどうかを指定する。
//            trueの場合、目盛りが表示され、falseの場合、目盛りが表示されない。
//    public void setPaintLabels(boolean b)
//      機能：ラベルがスライダでペイントされるかどうかを指定する。 
//            trueの場合、目盛りの値が表示され、falseの場合、目盛りの値が
//　　　　　　表示されない。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

/*
<applet code="ja139a.class" width="320" height="240">
</applet>
*/

public class ja139a extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをGridLayoutに設定。
    c.setLayout(new GridLayout(1,1));

    // スライダーの作成。
    JSlider sd = new JSlider(0, 50, 10);
    sd.setMajorTickSpacing(10);
    sd.setMinorTickSpacing(2);
    sd.setPaintTicks(true);
    sd.setPaintLabels(true);

    // スライダーをコンテンツペイン内に追加。
    c.add(sd);
  }
}
