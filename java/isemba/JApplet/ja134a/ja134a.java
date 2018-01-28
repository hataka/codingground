//  -*- mode: java -*-  Time-stamp: <08/06/20(金) 18:16:59 hata>
/*================================================================
 * プログラム名: ja134a.java
 * 作成日: Time-stamp: Time-stamp: <08/06/19(木) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja133a.htm
 *  説明:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja134a.java >>
//
//  ＪＡｐｐｌｅｔ（２）：部品（テーブル、配置）
//
//　●テーブル作成手順
//　　（手順１）項目名を設定
//　　（手順２）項目を設定
//　　（手順３）テーブルの作成
//
//　●JTableクラス
//    テーブルを作成するクラス。
//
//　●JTableクラスのコンストラクタ
//　　public JTable(Object[][] obj, Object[] cname)
//　　　機能：項目名cnameをもち、セルのデータobjをもつテーブルを作成する。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
//import java.awt.event.*; 
import javax.swing.*;
//import javax.swing.table.*;

public class ja134a extends JApplet {

  public void init() {
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // 手順１：テーブルの項目名を設定する。
    String[] cname = {
      "項目名Ａ","項目名Ｂ","項目名Ｃ","項目名Ｄ"
    };

    // 手順２：テーブルの項目を設定する。
    Object[][] cell = {
      { "項目a1","項目b1","項目c1",new Integer(111) },
      { "項目a2","項目b2","項目c2",new Integer(222) },
      { "項目a3","項目b3","項目c3",new Integer(333) },
      { "項目a4","項目b4","項目c4",new Integer(444) },
      { "項目a5","項目b5","項目c5",new Integer(555) },
      { "項目a6","項目b6","項目c6",new Integer(666) },
      { "項目a7","項目b7","項目c7",new Integer(777) },
    };

    // 手順３：テーブルの作成。
    JTable table = new JTable(cell,cname);
    // スクロールバーを追加。
    // スクロールバーを追加しないと、項目が表示されない。
    JScrollPane sp = new JScrollPane(table);
    c.add(sp,BorderLayout.CENTER);
  }
}
