////////////////////////////////////////////////////////////////////////////////
// << ja129c.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（パネル、文字の色）
//
//　　色の設定や表示には、Colorクラスを使う。
//
//　●Colorクラス
//　　色のデータや操作が定義されているクラス。
//
//　●Colorクラスのコンストラクタ
//    public Color(int r, int g, int b)
//      機能：色の生成。
//      r   ：赤の成分の強さ(0-255)
//      g   ：緑の成分の強さ(0-255)
//      b   ：青の成分の強さ(0-255)
//
//　　・Colorクラスに用意されている色
//　　　magenta：暗い桃色　　 　black：黒　　white：白     yellow：黄
//　　　darkGray：暗い灰色　　　gray：灰色   cyan：空色　  blue：青　
//　　　lightGray：明るい灰色 　red：赤　　  orange：橙　　green：緑　
//　　　pink：明るい桃色        
//
//　●Graphicsクラスのメソッド   
//    public abstract void setFont(Font font)
//  　  機能：以降に表示するグラフィックスのフォントをfontに設定。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja129c extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(0,0));

    // パネルの作成。
    ja129cp p = new ja129cp();
    p.setBackground(Color.lightGray);
 
    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);
  }

  // パネルの定義(内部クラス)。
  class ja129cp extends JPanel {
    public void paintComponent(Graphics g) {                       
      super.paintComponent(g);                                     
      g.setFont(new Font("Serif",Font.BOLD,48));         
      g.setColor(new Color(255,0,0)); // 色を赤に設定。  
      g.drawString("赤",50,50);                          
      g.setColor(Color.blue); // 色を青に設定。          
      g.drawString("青",50,100);                         
      g.setColor(Color.yellow); // 色を黄に設定。        
      g.drawString("黄",50,150);                         
    }                                                              
  }
}
/**
<applet code="ja129c.class" width="300" height="200">
</applet>
**/
