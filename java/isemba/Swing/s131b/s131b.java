/*
<!--====================================================================-->
<!-- << s131b.htm >>                                                    -->
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
////////////////////////////////////////////////////////////////////////////////
// << s131b.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（メニュー、イベント処理）
//
//　　メニュー項目の「赤」を選択すると、フレーム背景色が赤になる。
//　　メニュー項目の「緑」を選択すると、フレーム背景色が緑になる。
//
////////////////////////////////////////////////////////////////////////////////
*/
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import javafx.scene.text.Font;

class s131b extends JFrame implements ActionListener {

  JMenuBar mb;
  JMenu m;
  JMenuItem mi1,mi2;
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s131b(String t) {

    super(t);

    // フレームからコンテンツペインの取得。
    c = this.getContentPane();

    // メニューバーの作成。
    mb = new JMenuBar();
    // メニューバーmbをコンテンツペイン内に追加。
    this.setJMenuBar(mb);

    mb.setFont(new Font("sans-serif", Font.PLAIN, 24));
    // メニューの作成。
    m = new JMenu("背景の色");
    // メニューmをメニューバーmbに追加。
    mb.add(m);

    // メニュー項目の作成。
    mi1 = new JMenuItem("赤");
    mi2 = new JMenuItem("緑");
    // メニュー項目(mi1,mi2)をメニューmに追加。
    m.add(mi1);
    m.add(mi2);

    // イベントリスナの登録。
    mi1.addActionListener(this);
    mi2.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == mi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == mi2 ) { c.setBackground(Color.green); }
  }

  public static void centerScreen(Window frame) {
	  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	  int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	  int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	  frame.setLocation(x, y);
  }

  public static void createAndShowGUI() {
        //try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//UIManager.put("Button.font",new Font("MS Gothic", Font.PLAIN, 24)); //Buttonのフォント設定
			//UIManager.put("Label.font",new Font("ＭＳ ゴシック", Font.PLAIN, 24)); //Labelのフォント設定
			//UIManager.put("List.font",new Font("ＭＳ ゴシック", Font.PLAIN, 24)); //Listのフォント設定
			//UIManager.put("ComboBox.font",new Font("ＭＳ ゴシック", Font.PLAIN, 24)); //ComboBoxのフォント設定
			//UIManager.put("CheckBox.font",new Font("ＭＳ ゴシック", Font.PLAIN, 24)); //ComboBoxのフォント設定
			//UIManager.put("RadioButton.font",new Font("ＭＳ ゴシック", Font.PLAIN, 24)); //ComboBoxのフォント設定
			//UIManager.put("MenuItem.font",new Font("ＭＳ ゴシック", Font.PLAIN, 24)); //ComboBoxのフォント設定

	  //} catch {}//(ClassNotFoundException | InstantiationException
               //| IllegalAccessException | UnsupportedLookAndFeelException ex) {
            //ex.printStackTrace();
        //}
        //JFrame frame = new JFrame("@title@");
        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //frame.getContentPane().add(new MainPanel());
        //frame.pack();
        //frame.setLocationRelativeTo(null);
        //frame.setVisible(true);
    }


  /////////////////
  // mainメソッド//
  /////////////////
  public static void main(String[] args) {
	  //createAndShowGUI();
    // フレームの作成。
    s131b f = new s131b("メニュー付きフレーム");
    UIManager.put("Menu.font", new Font("ＭＳ ゴシック", Font.PLAIN, 24));
    // フレームの大きさを設定。

    //f.setSize(300,200);
    f.setSize(800,600);
    centerScreen(f);

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
% javac s131b.java
% java s131b
</pre>

実行直後<br>
<img src="s131ba.jpg" width=300 height=200><br><br>

「背景の色」のクリック後<br>
<img src="s131bb.jpg" width=300 height=200><br><br>

「緑」のクリック後<br>
<img src="s131bc.jpg" width=300 height=200>

</body>
</html>
*/
