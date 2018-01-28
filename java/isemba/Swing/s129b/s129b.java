/*
<!--====================================================================-->
<!-- << s129b.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
*/
////////////////////////////////////////////////////////////////////////////////
// << s129b.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（パネル、イベント処理）
//  
//　　文字列を移動する。
//
//　●javax.swing.Timerクラス
//    1 つ以上のアクションイベントを、指定された遅延時間の経過後にトリガする。
//
//　●Timerクラスのコンストラクタ
//    public Timer(int d, ActionListener listener)
//      機能：時間d(ミリ秒単位)ごとに、リスナーへ通知するTimerを作成する。
//            listenerがnull以外の場合、タイマーのアクションリスナーとして
//            登録される。 
//
//　●Timerクラスのメソッド
//    public void start()
//      機能：Timerを起動し、リスナーへのアクションイベントの送信を開始する。 
//    public void stop()
//      機能：Timerを停止し、リスナーへのアクションイベントの送信を停止する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class s129b extends JFrame implements ActionListener {

  Timer timer;
  int x,y;
  static int w=300,h=200;
  Dimension d;
  String str="<<< フレーム >>>";
  Font ft;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s129b(String t) { 

    super(t);

    // フレームのディフォルトレイアウトマネージャはBorderLayout。
    Container c = this.getContentPane();

    // パネルの作成。
    s129bp p = new s129bp();
    p.setBackground(Color.yellow);
 
    // パネルをコンテンツペイン内に追加。
    c.add(p,BorderLayout.CENTER);

    // タイマーの作成。
    timer = new Timer(500, this);

    // 文字列表示位置の設定。
    x = w;
    y = h/2;

    // 文字のフォント、スタイル、大きさを設定。
    ft = new Font("Serif",Font.BOLD,30);

    // タイマーの起動。
    timer.start();
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    repaint();
  }

  //////////////////////////////
  // パネルの定義(内部クラス) //
  //////////////////////////////
  class s129bp extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);    
      x = x - 5;
      if( x < 0 ) { x = w; }
      g.setFont(ft);
      g.setColor(Color.black);
      g.drawString(str,x,y);
    }
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s129b f = new s129b("フレーム"); 

    // フレームの大きさを設定
    f.setSize(w,h);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac s129b.java
% java s129b
</pre>

<img src="s129b.jpg" width=300 height=200>

</body>
</html>
*/