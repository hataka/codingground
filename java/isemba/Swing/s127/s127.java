////////////////////////////////////////////////////////////////////////////////
// << s127.java >>
//
//  Ｓｗｉｎｇ（２）：部品（テキストフィールド、イベント処理）
//
//　　テキストフィールドを使って、データを入力する。
//　　テキストフィールドを２つ作成する。
//　　前者は固定した幅、後者は入力された文字列に応じて幅を変更する。
//
//  ●javax.swing.JTextFieldクラス
//    入力(文字列)用の欄で、１行分の編集するとき、JTextFieldクラスを使う。
//
//  ●JTextFieldクラスのコンストラクタ
//    public JTextField(int c)                       
//      機能：c文字分の欄を作成する。
//    public JTextField(String s, int c)                       
//      機能：c文字分の欄を用意し、文字列sを表示する。
//
//  ●JTextComponentクラスのメソッド
//    public String getText()                       
//      機能：テキストコンポーネントの文字列を返す。
//    public void setText(String s)                       
//      機能：テキストコンポーネントに文字列sを設定する。
//
//  ●java.awt.Containerクラスから継承したメソッド
//    public void validate()                       
//      機能：コンテナに部品が追加されたとき、またはコンテナが格納している
//            部品が変更されたとき、再配置を行う。
//
//  ●Stringクラスのメソッド
//    public String trim()            
//      機能：元の文字列の前後から空白を取り除く。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s127 extends JFrame implements ActionListener {

  JTextField t1,t2; 
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s127(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));

    // テキストフィールドの作成。
    t1 = new JTextField("固定幅：Good Morning おはよう",20);
    t2 = new JTextField("可変幅：",20);

    // テキストフィールドをコンテンツペイン内に追加。
    c.add(t1); 
    c.add(t2);

    // イベントリスナの登録。
    t1.addActionListener(this);
    t2.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {

    if( e.getSource() == t1 ) { String s1 = t1.getText(); }
    if( e.getSource() == t2 ) {
      String s2 = t2.getText().trim(); 
      int len = s2.length();
      t2.setColumns(len+2); // 2文字余分に確保。
      c.validate();
    }
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//swingLib.setUIFont(new Font("ＭＳ ゴシック", Font.PLAIN, 24));
			swingLib.setUIFont(new Font("Meiryo UI", Font.PLAIN, 24));
		} catch (ClassNotFoundException | InstantiationException
      | IllegalAccessException | UnsupportedLookAndFeelException ex) {
       ex.printStackTrace();
    }
    // フレームの作成。
    s127 f = new s127("Ｓｗｉｎｇ（２）：部品（テキストフィールド、イベント処理）");

    // フレームの大きさを設定。
    f.setSize(800,600);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
    // フレームの表示。
    f.setVisible(true);
  }
}
