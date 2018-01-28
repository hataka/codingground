/*
<!--====================================================================-->
<!-- << g111c.htm >>                                                    -->
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
// << g111c.java >>
//
//  ＧＵＩ（１）：フレームウィンドウ（生成、表示、非表示）
//
//　　フレームと呼ばれるウィンドウ(タイトルなし)を表示する。
//
////////////////////////////////////////////////////////////////////////////////
*/
import java.awt.*; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class f111c {

  // コンストラクタ。
  f111c() {
    //Frame f = new Frame();
	// フレームの作成。
	final Frame f = new Frame("フレーム");
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			f.dispose();//System.exit(0);
		}
	});    // フレームの作成。

    // フレームの大きさを設定。
    f.setSize(300,200);
    /* */
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int left = (d.width - f.getWidth()) / 2;
    int top = (d.height - f.getHeight()) / 2;
    f.setLocation(left, top);
    /* */

    // フレームの表示。
    f.setVisible(true);
  }
}

class g111c {

  public static void main(String[] args) {
    f111c f = new f111c();
  }
  
}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% javac g111c.java
% java g111c
</pre>

<img src="g111c.jpg" width=300 height=200>

</body>
</html>
*/
