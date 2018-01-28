////////////////////////////////////////////////////////////////////////////////
// << s116a.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（GridBagLayout）
//
//　　GridBagLayoutマネージャーを使うと、異なる大きさの部品を縦横に柔軟に配置
//　　することができる。格子状に分割されたマス目に部品を配置する。ひとつの部品が
//　　複数のマス目からなる長方形の領域を占有してもよい。
//
//　　２個のボタンを配置する。
//　　実行すると、これらのボタンは、指定された位置関係を保存しながらウィンドウの
//　　中央に集まる。ウィンドウのサイズを変更しても、ボタンのサイズに変化はなく、
//　　指定された位置関係を保存しながら、ウィンドウの中央に集まる。
//　　デフォルトでは、部品は中央に集まるように表示される。
//
//　●GridBagLayoutクラス
//　　異なる大きさの部品を格子状に配置する。
//
//　●GridBagLayoutクラスのコンストラクタ
//　　GridLayout()
//　　　機能：グリッドバッグレイアウトマネージャーを生成する。
//
//　●GridBagConstraintsクラス
//　　部品の位置関係や形を指定する。
//
//　●GridBagConstraintsクラスのコンストラクタ
//　　GridBagConstraints()
//      機能：GridBagConstraintsオブジェクトを生成する。
//
//　●GridBagConstrintsクラスの変数
//    int gridx        部品の位置が左からgridx+1列目であることを指定する。
//　　　　　　　　　　 すなわち、gridx=0が１列目、gridx=1が２列目、・・・。
//                     GridBagConstraints.RELATIVEと指定すると、直前に配置された
//　　　　　　　　　　 部品の右に配置される。これは、ディフォルトである。
//    int gridy        部品の位置が上からgridy+1行目であることを指定する。
//　　　　　　　　　　 すなわち、gridy=0が１行目、gridy=1が２行目、・・・。
//                     GridBagConstraints.RELATIVEと指定すると、直前に配置された
//　　　　　　　　　　 部品の下に配置される。これは、ディフォルトである。
//    int gridwidth    部品が使う幅(列数)。ディフォルトは１。
//    int gridheight   部品が使う高さ(行数)。ディフォルトは１。
//
//  ●GridBagLayoutクラスのメソッド
//　　void setConstraints(Component c, GridBagConstraints gbc)
//      機能：部品cに条件gbcを設定する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

class s116a extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s116a(String s) {

    super(s);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをGridBagLayoutに設定。
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    c.setLayout(gb);

    // ボタンの作成。
    JButton b1 = new JButton("ボタン１");
    JButton b2 = new JButton("ボタン２");

    // ボタン１を(0,0)から(1,1)に配置する。
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // ボタン２を(1,1)から(2,2)に配置する。
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1;  gbc.gridheight = 1;
    gb.setConstraints(b2,gbc);
    c.add(b2);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレーム１の作成。
    s116a f1 = new s116a("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s116a f2 = new s116a("フレーム２");
    // フレームの大きさを設定。
    f2.setSize(360,240);
    // フレームの位置を設定。
    f2.setLocation(0,300);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // フレームの表示。
    f2.setVisible(true);
  }
}

/*
<font size=5 color=blue>実行結果</font><br>
<pre>
% javac s116a.java
% java s116a
</pre>

フレーム１<br>
<img src="s116aa.jpg" width=300 height=200><br><br>

フレーム２<br>
<img src="s116ab.jpg" width=360 height=240>

</body>
</html>
*/