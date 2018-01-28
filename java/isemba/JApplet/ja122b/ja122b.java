////////////////////////////////////////////////////////////////////////////////
// << ja122b.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（ボタン、配置、イベント処理）
//
//　　「赤」ボタンをクリックすると、アプレットの背景色が赤になる。
//　　「緑」ボタンをクリックすると、アプレットの背景色が緑になる。
//
//  ●イベント処理
//
//    ユーザがボタンをクリックすると、イベントという情報としてまとめられる。
//　　このイベントは、イベントリスナに渡され処理される。
//　　このような処理形式をイベント処理という。
//
//　　・イベントの発生源となるコンポーネントをイベントソースという。
//　　・イベントリスナは、リスナーインターフェースを実装しているクラスで、
//　　　受理したイベントを処理するメソッドが記述される。
//　　・イベント処理に関連するクラスは、java.awtパッケージやjava.awt.event
//　　　パッケージに存在する。
//
//　●イベント処理の仕組み
//
//　　(1)イベントソースからイベントが発生する。
//　　   イベントには、その種類ごとに対応するクラス(ボタン操作から発生する
//       イベントにはActionEventクラスがある)が定義されており、イベントが
//       発生すると、そのオブジェクトが作られる。
//　　(2)イベントのオブジェクトは、イベントリスナのオブジェクトに送られ
//       処理される。
//       あらかじめ、イベントリスナのオブジェクトをイベントソースのオブジェクト
//       に登録しておく必要がある。
//
//　　・イベントリスナは、イベントに対応するリスナーインターフェースを実装する
//　　　ことが要求される。例えば、ボタンのイベントActionEventを処理する
//　　　イベントリスナは、ActionListenerというインターフェース中のメソッド
//　　　(actionPerformed)に処理手順を記述することになる
//
//　●イベント処理プログラムの書き方
//
//　　次の２点を記述することが必要。
//　（手順１）リスナーインターフェースを実装するリスナクラスを定義する。
//　（手順２）イベントソースのオブジェクトに、イベントリスナのオブジェクトを
//　　　　　　登録する
//　
//　　　　　　イベントソースのオブジェクト.addEventListener(イベントリスナの
//　　　　　　　　　　　　　　　　　　　　　　　　　　　　　オブジェクト)
//
//　○アプレットでボタンの場合
//
//    import java.awt.*; // イベント処理関連クラスをインポート。
//    import java.awt.event.*; // イベント処理関連クラスをインポート。
//    import javax.swing.*;
//
//    public class クラス名 extends JApplet implements ActionListener {
//      ・・・                         // アプレット自身がイベントリスナになる。
//      public void init() {
//        b = new Button("ボタン");
//        イベントソースのオブジェクト(b)に、イベントリスナのオブジェクト
//　　　　(actionPerformedメソッドを実装するオブジェクト、この場合、
//　　　　アプレット自身になるので、this)を登録する。
//        b.addActionListener(this); 
//      }
//      public void actionPerformed(ActionEvent e) (
//        イベント処理を書く。
//      }
//      ・・・
//    }
//
//　●ActionListenerインターフェース
//　　java.awt.event.ActionListener
//
//　●ActionListenerインターフェースのメソッド
//    void actionPerformed(ActionEvent e)
//      機能：イベントが発生したとき呼び出される。
//      　　　ActionEventオブジェクトeには、イベント発生時の状況が記録されている。
//
//　●ActionEventクラス
//　　java.awt.event.ActionEvent
//
//　●javax.swing.AbstractButtonクラスから継承したメソッド
//    public void addActionListener(ActionListener al)
//      機能：ボタンにActionListener alを追加する。 
//
//　●java.util.EventObjectクラスから継承したメソッド
//　　public Object getSource()
//　　　機能：イベントが最初に発生したオブジェクトを返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ja122b extends JApplet implements ActionListener {

  JButton b1,b2; // コンストラクタとメソッド(actionPerformed)で使われるため、
                 // インスタンス変数にする。
  Container c;   // b1,b2と同様。

  public void init() {
    // アプレットからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをFlowLayoutに設定。
    c.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // ボタン生成。
    b1 = new JButton("赤");
    b2 = new JButton("緑");

    // ボタンをコンテンツペイン内に追加。
    c.add(b1);
    c.add(b2);

    // イベントリスナの登録。
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // ActionListenerインターフェースのメソッド。
  public void actionPerformed(ActionEvent e) {
    // ボタンがクリックされたとき、実行される。
    if( e.getSource() == b1 ) { c.setBackground(Color.red); }
    if( e.getSource() == b2 ) { c.setBackground(Color.green); }
  }
}
/**
<applet code="ja122b.class" width="300" height="200">
</applet>
**/
