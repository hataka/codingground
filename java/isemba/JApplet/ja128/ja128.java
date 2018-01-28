//  -*- mode: java -*-  Time-stamp: <08/06/19(木) 20:03:06 hata>
/*================================================================
 * プログラム名: ja128.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja128.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja128.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（テキストエリア、配置、イベント処理）
//
//　　２つのテキストエリアと「複写」ボタン、「消去」ボタンを作る。
//　　テキストエリア内で編集ができる。
//　　最初のテキストエリアにはスクロールバーを付ける。スクロールバーを付けるには、
//　　テキストエリアをスクロールペインに入れる必要がある。
//　　テキストエリアに表示しきれないテキストが入力されると自動的にスクロールバー
//　　が現れる。テキストエリアにすべてのテキストが表示できるようになるとスクロー
//　　ルバーは消える。
//
//　●イベント処理
//　　イベントソース：JTextAreaクラス
//　　イベント      ：ActionEventクラス
//　　イベントリスナ：ActionListenerインターフェース
//　　　　　　　　　　actionPerformedメソッド
//    テキストエリアでリターンキーを押してもイベントは発生しない。
//    他の部品と組み合わせて利用する。
//
//  ●JTextAreaクラス
//    ユーザからの入力(文字列)用の欄(複数行分ある)で、編集するとき、JTextArea
//　　クラスを使う。
//
//  ●JTextAreaクラスのコンストラクタ
//    public JTextArea(int r, int c)                       
//      機能：r行、c列のテキストエリアを作成する。
//    public JTextArea(String s, int r, int c)                       
//      機能：文字列sを表示するr行c列のテキストエリアを作成する。
//
//  ●JTextAreaクラスのメソッド
//    public void append(String s)                       
//      機能：文字列sを既存テキストの末尾に追加する。
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja128.class" width="300" height="200"></applet>
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.URL;

public class ja128 extends JApplet implements ActionListener {

	Container c;
	JPanel pane;
	JTextArea t1, t2;
	JButton b1, b2;

	private boolean inAnApplet = true;

	// Hack to avoid ugly message about system event access check.
	public ja128() {
		this(true);
	}

	public ja128(boolean inAnApplet) {
		this.inAnApplet = inAnApplet;
		if (inAnApplet) {
			getRootPane().putClientProperty("defeatSystemEventQueueCheck",
					Boolean.TRUE);
		}
	}

	public void init() {
		// アプレットからコンテンツペインを取得。
		c = this.getContentPane();
		pane = new JPanel();

		// コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		// テキストエリアの作成。
		t1 = new JTextArea("こんにちは\n茨城大学\n工学部\n情報工学科", 3, 20);
		JScrollPane sp = new JScrollPane(t1);
		t2 = new JTextArea(3, 20);

		// ボタンの作成。
		b1 = new JButton("複写");
		b2 = new JButton("消去");

		// スクロールペイン、ボタン、テキストエリアをコンテンツペイン内に追加。
		c.add(sp);
		c.add(b1);
		c.add(b2);
		c.add(t2);

		// イベントリスナの登録。
		b1.addActionListener(this);
		b2.addActionListener(this);

		// Add Components to a JPanel, using the default FlowLayout.
		pane.add(sp);
		pane.add(b1);
		pane.add(b2);
		pane.add(t2);
		pane.setBackground(new Color(255, 255, 204));
		pane
				.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 2,
						Color.black));
		setContentPane(pane);
	}

	// ActionListenerインターフェースのメソッド。
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String s = t1.getText();
			t2.setText(s);
		}
		if (e.getSource() == b2) {
			String s = " ";
			t2.setText(s);
		}
	}

	/* One day, JApplet will make this method obsolete. */
	protected URL getURL(String filename) {
		URL codeBase = getCodeBase();
		URL url = null;
		try {
			url = new URL(codeBase, filename);
		} catch (java.net.MalformedURLException e) {
			System.out.println("Couldn't create image: badly specified URL");
			return null;
		}
		return url;
	}

	protected URL getURL(URL codeBase, String filename) {
		URL url = null;
		try {
			url = new URL(codeBase, filename);
		} catch (java.net.MalformedURLException e) {
			System.out.println("Couldn't create image: badly specified URL");
			return null;
		}
		return url;
	}

	public static void main(String[] args) {
		Frame frame = new Frame("Application: ja128");

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		ja128 applet = new ja128(false);
		applet.init();
		frame.add(applet, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
