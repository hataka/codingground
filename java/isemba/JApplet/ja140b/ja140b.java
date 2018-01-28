//  -*- mode: java -*-  Time-stamp: <08/07/16(水) 20:11:50 hata>
/*================================================================
 * プログラム名: ja140b.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja140b.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（プログレスバー、配置、イベント処理）
//
//　　タイマーと連動し、60秒の進捗状況を表示するプログレスバーを示す。
//
//　●イベント処理
//　　イベントソース：Timerクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//
//　●javax.swing.JComponentクラスから継承したメソッド
//    public void setBorder(Border border)
//      機能：部品に描画されるボーダborderを設定する。
//
//　●TitledBorderクラス
//　　タイトルを位置および位置揃えを指定して追加し、任意のボーダを実装するクラス。
//
//　●TitledBorderクラスのコンストラクタ
//    public TitledBorder(String s)
//      機能：タイトルを文字列sとするTitledBorderオブジェクトを作成する。 
//
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/*
<applet code="ja140b.class" width="800" height="600">
</applet>
*/

public class ja140b extends JApplet implements ActionListener {

  JProgressBar pb;
  int n = 0;
  Timer timer = new Timer(1000,this);

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();
    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // プログレスバーの作成。
    pb = new JProgressBar(0, 60);
    pb.setBorder(new TitledBorder("JProgressBar"));

    // プログレスバーをコンテンツペイン内に追加。
    c.add(pb);
  }

  public void start() { timer.start(); }

  // ActionListenerインターフェースのメソッド。            
  public void actionPerformed(ActionEvent e) {             
    if( n == 60 ) { 
      timer.stop(); 
    } else {
      n++;
      pb.setValue(n);
      pb.setStringPainted(true);
      pb.setString(n+"秒");
    }
  }
}
