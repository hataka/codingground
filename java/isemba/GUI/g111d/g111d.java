/*
<!--====================================================================-->
<!-- << g111d.htm >>                                                    -->
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
// << g111d.java >>
//
//  ＧＵＩ（１）：フレームウィンドウ（生成、表示、非表示）
//
//　　フレームと呼ばれるウィンドウ(タイトルなし)を表示する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class f111d extends Frame {

  // コンストラクタ。
  f111d() {
    // フレームの作成。
    super();
	// ウインドウを閉じる
    addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			dispose();//System.exit(0);
		}
	}); 
    // フレームの大きさを設定。
    this.setSize(300,200);
    this.setLocationRelativeTo(null);
    // 中央配置
    //Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    //int left = (d.width - this.getWidth()) / 2;
    //int top = (d.height - this.getHeight()) / 2;
    //this.setLocation(left, top);

    // フレームの表示。
    this.setVisible(true);
  }
}

class g111d {

  public static void main(String[] args) {
    f111d f = new f111d();
  }
  
}
/*
</pre>

<font size=5 color=blue>実行結果</font><br><br>

<pre>
% java g111d.java
% java g111d
</pre>

<img src="g111d.jpg" width=300 height=200>

</body>
</html>
*/
