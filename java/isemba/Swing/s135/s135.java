////////////////////////////////////////////////////////////////////////////////
// << s135.java >>
//
//  Ｓｗｉｎｇ（３）：フレーム（テーブル）
//
//　●テーブル作成手順
//　　（手順１）項目名を設定
//　　（手順２）データを設定
//　　（手順３）テーブルの作成
//
//　●javax.swing.JTableクラス
//    テーブルを作成するクラス。
//
//　●JTableクラスのコンストラクタ
//　　public JTable(Object[][] obj, Object[] cname)
//　　　機能：項目名cname、セルのデータobjをもつテーブルを作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.table.*;

class s135 extends JFrame {

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s135(String t) { 

    super(t);

    // フレームからコンテンツペインを取得。
    Container c = this.getContentPane();

    // (手順１)テーブルの項目名を設定する。
    String[] cname = {
      "項目Ａ","項目Ｂ","項目Ｃ","項目Ｄ"
    };

    // (手順２)テーブルのデータを設定する。
    Object[][] cell = {
      { "データa1","データb1","データc1",new Integer(111) },
      { "データa2","データb2","データc2",new Integer(222) },
      { "データa3","データb3","データc3",new Integer(333) },
      { "データa4","データb4","データc4",new Integer(444) },
      { "データa5","データb5","データc5",new Integer(555) },
      { "データa6","データb6","データc6",new Integer(666) },
      { "データa7","データb7","データc7",new Integer(777) },
    };

    // (手順３)テーブルの作成。
    JTable table = new JTable(cell,cname);

    // スクロールバーを追加。
    // スクロールバーを追加しないと、項目が表示されない。
    JScrollPane sp = new JScrollPane(table);
    c.add(sp,BorderLayout.CENTER);
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレームの作成。
    s135 f = new s135("テーブルのフレーム");

    // フレームの大きさを設定。
    f.setSize(640,480);

    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // フレームの表示。
    f.setVisible(true);
  }
}
