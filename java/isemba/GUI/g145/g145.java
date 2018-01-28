////////////////////////////////////////////////////////////////////////////////
// << g145.java >>
//
//  ＧＵＩ（３）：ＧＵＩ部品（ファイルダイアログ）
//
//　　フレーム内の「ファイルダイアログ表示」ボタンをクリックすると、
//　　ファイルダイアログが表示される。
//　　ファイルダイアログ内のファイルを選択し、「開く」ボタンをクリックすると、
//　　選択されたファイル名がフレーム内のラベルに表示される。
//
//　●FileDialogクラス
//　　ディレクトリ内のファイル一覧を表示したり、ファイルを選択するのに、
//　　FileDialogクラスを使う。
//
//　●FileDialogクラスのコンストラクタ
//    FileDialog(Frame f)
//      機能：ファイルダイアログを作成する。
//    FileDialog(Frame f, String s)
//      機能：タイトルs付きのファイルダイアログを作成する。
//
//　●FileDialogクラスのメソッド
//    String getFile()
//      機能：ファイルダイアログ内で選択されたファイル名を取得する。
//    String getDirectory()
//      機能：ファイルダイアログ内で選択されたディレクトリ名を取得する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g145 implements ActionListener {

  Button b;
  Label lab;
  FileDialog fd;

  // コンストラクタ。
  g145() { 
    // フレームの作成。
    Frame f = new Frame();
    // レイアウトマネージャをFlowLayoutに設定。
    f.setLayout(new FlowLayout(FlowLayout.CENTER,40,40));

    // ボタンの作成。
    b = new Button("ファイルダイアログ表示");
    // ボタンをフレーム内に追加。
    f.add(b);

    // ラベルの作成。
    lab = new Label("ここにダイアログからの入力が表示される");
    // ラベルをフレーム内に追加。
    f.add(lab);

    // フレームの大きさを設定。
    //f.setSize(400,200);
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent we){
            System.exit(0);
     	}
    });
    // フレームの大きさを設定。
    f.setSize(640,480);
    f.setLocationRelativeTo(null);
// フレームを表示。
    f.setVisible(true);

    // イベントリスナの登録。
    b.addActionListener(this);
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) { System.exit(0); }}
    );

  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // ボタンがクリックされたときの処理（ファイルダイアログの表示）。
    if( e.getSource() == b ) {
      fd = new FileDialog(new Frame(),"ファイルダイアログ"); 
      // フレームを可視状態にする。
      fd.setVisible(true);
      // ファイルダイアログで選択した、ディレクトリとファイルを
      // 呼び出し側ウィンドウのラベルに設定。
      lab.setText(fd.getDirectory()+fd.getFile());
    }
  }

  public static void main(String[] args) {
    g145 g = new g145();
  }

}
