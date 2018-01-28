/*
<!--====================================================================-->
<!-- << s137.htm >>                                                     -->
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
// << s137.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（タブペイン）
//
//　　タブペインを作成する。
//
//　●javax.swing.JTabbedPaneクラス
//　　タブペインを作るのに、JTabbedPaneクラスを使う。
//
//　●JTabbedPaneクラスのコンストラクタ
//    public JTabbedPane()
//    　機能：タブペインを作成する。
//
//　●JTabbedPaneクラスのメソッド
//    public void addTab(String s, Component c)
//    　機能：タブ名をsとするタブに部品cを追加する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

class s137 extends JPanel { //JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  //s137(String t) {  
  s137() {  
	super(new BorderLayout());
    //super(t);

    // フレームからコンテンツペインを取得。
    //Container c = this.getContentPane();

    // ラベルlab1,lab2,lab3の作成。
    JLabel lab1 = new JLabel("ラベル１");
    JLabel lab2 = new JLabel("ラベル２");
    JLabel lab3 = new JLabel("ラベル３");

    // タブペインtpの作成。
    JTabbedPane tp = new JTabbedPane();

    // タブペインtpにラベルlab1,lab2,lab3を追加。
    tp.addTab("タブ１",lab1);
    tp.addTab("タブ２",lab2);
    tp.addTab("タブ３",lab3);

    // タブペインtpをコンテンツペイン内に追加。
    add(tp,BorderLayout.CENTER);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {
    // フレームの作成。
    //s137 f = new s137("タブのフレーム");
    // フレームの大きさを設定。
    //f.setSize(300,200);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    //f.setVisible(true);
  
    //Create and set up the window.
    // http://terai.xrea.jp/Swing/CenterFrame.html
	JFrame frame = new JFrame("タブのフレーム");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(640,480);
    frame.setLocationRelativeTo(null);
    //以下は自前で位置を計算する場合
    //Rectangle screen = frame.getGraphicsConfiguration().getBounds();
    //frame.setLocation(screen.x + screen.width/2  - frame.getSize().width/2,
    //                    screen.y + screen.height/2 - frame.getSize().height/2);

    //Create and set up the content pane.
    frame.getContentPane().add(new s137());
    //JComponent newContentPane = new s137();//CheckBoxDemo();
    //newContentPane.setOpaque(true); //content panes must be opaque
    //frame.setContentPane(newContentPane);

    //Display the window.
    //frame.pack();
    frame.setVisible(true);
  
  }
}
/*
Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
int left = (d.width - this.getWidth()) / 2;
int top = (d.height - this.getHeight()) / 2;
this.setLocation(left, top);
*/

/*
</pre>

<font size=5 color=blue>実行結果</font>

<pre>
% javac s144.java
% java s144
</pre>

実行直後<br>
<img src="s137a.jpg" width=300 height=200><br><br>

「タブ２」選択後<br>
<img src="s137b.jpg" width=300 height=200><br><br>

「タブ３」選択後<br>
<img src="s137c.jpg" width=300 height=200>

</body>
</html>
*/
