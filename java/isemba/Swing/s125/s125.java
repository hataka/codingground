////////////////////////////////////////////////////////////////////////////////
// << s125.java >>
//
//  Ｓｗｉｎｇ（２）：部品（ラジオボタン、イベント処理）
//
//　　「赤」項目をチェックすると、ラベルに赤という文字のみが表示される。
//　　「青」項目をチェックすると、ラベルに青という文字のみが表示される。
//　　「黄」項目をチェックすると、ラベルに黄という文字のみが表示される。
//　    複数の項目の中から１つだけが選択される。
//
//　●javax.swing.JRadioButtonクラス、javax.swing.ButtonGroupクラス
//    複数の項目の中でいつも１つだけがonとなるとき、JRadioButtonクラス、
//　　ButtonGroupクラスを使う。
//    ・ButtonGroupクラスは、JRadioButtonの動作を制御する。すなわち、いつも
//　　　１つがtrueとなる。表示したときにまとめるにはパネルを使って、パネルに
//　　　追加する必要がある。
//
//  ●ButtonGroupクラスのコンストラクタ
//    public ButtonGroup()                       
//      機能：ボタングループを作成。
//
//  ●JRadioButtonクラスのコンストラクタ
//    public JRadioButton(String s, boolean b)     
//      機能：文字列sのラジオボタンを作り、状態をbに設定する。
//            bがtrueの場合はボタンが初期状態で選択され、そうでない場合は
//            選択されない。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager;

class s125 extends JFrame implements ActionListener {

  ButtonGroup bg;
  JRadioButton r1,r2,r3; 
  JLabel lab;
  Container c;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s125(String s) { 

    super(s);

    // フレームからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout(10,10));

    // パネルの作成。
    JPanel p = new JPanel();

    // パネルのレイアウトマネージャをFlowLayoutに設定。
    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    p.setBackground(Color.white);

    // ラベルの作成。
    lab = new JLabel("ここに表示される");

    // パネルとラベルをコンテンツペイン内に追加。
    c.add("North",p);
    c.add("Center",lab);

    // ラジオボタンの作成。
    r1 = new JRadioButton("赤",true);
    r2 = new JRadioButton("青",false);
    r3 = new JRadioButton("黄",false);

    // ボタングループの作成。
    bg = new ButtonGroup();

   // ラジオボタンをボタングループ内に追加。
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);
    p.add(r1);
    p.add(r2);
    p.add(r3);

    // イベントリスナの登録。
    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListenerインターフェースのメソッド //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {

    String s = "";
    if( e.getSource() == r1 ) { s = s + "赤"; }
    if( e.getSource() == r2 ) { s = s + "青"; }
    if( e.getSource() == r3 ) { s = s + "黄"; }
    lab.setText(s);
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
    s125 f = new s125("フレーム");
    // フレームの大きさを設定。
    f.setSize(1200,900);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
    // フレームの表示。
    f.setVisible(true);
  }
}
