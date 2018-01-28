// -*- mode: java -*-  Time-stamp: <2010-04-16 18:18:23 kahata>
/*================================================================
 * file: s115a.java
 * path; F:\java\isemba\Swing\s115a\s115a.java
 * url:  http://localhost/java/isemba/Swing/s115a/s115a.java
 * created: Time-stamp: <2010-04-16 18:18:23 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/SWING/s115a.htm
 * description: 
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << s115a.java >>
//
//  Ｓｗｉｎｇ（１）：レイアウトマネージャー（CardLayout、配置）
//
//　　コンテナ内に追加される部品は、カードとして扱われ、１度に１枚のカードのみが
//　　表示される
//　　カードは順番にめくったり、指定したカードを表示したりできる。
//
//　●CardLayoutクラスのコンストラクタ        
//　　public CardLayout(int h, int v)
//      機能：水平方向の間隔hおよび垂直方向の間隔vで、カードレイアウトを作成する。
//
//　●Containerクラスのメソッド
//  　public Component add(Component comp, String obj)
//      機能：部品compをこのコンテナに文字列objと関連づけて追加する。
//
//　●CardLayoutクラスのメソッド        
//    public void first(Container parent)
//　　　機能：コンテナparentの最初のカードに切り替える。
//    public void next(Container parent)
//　　　機能：コンテナparentの次のカードに切り替える。現在表示されているカードが
//　　　　　　最後のカードである場合、最初のカードに切り替える。
//    public void show(Container parent, String obj)
//　　　機能：文字列objと関連づけてこのレイアウトに追加された部品に切り替える。
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

class s115a extends JFrame {

  static Container c;
  static CardLayout cl;

  ////////////////////
  // コンストラクタ //
  ////////////////////
  s115a(String s) {

    super(s);

    // フレームからコンテンツペインを取得。
    c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをCardLayoutに設定。
    cl = new CardLayout(10,20);
    c.setLayout(cl);

    // ラベルの作成。
    JLabel lab1 = new JLabel("ラベル１");
    JLabel lab2 = new JLabel("ラベル２");
    JLabel lab3 = new JLabel("ラベル３");

    // ラベルに名前を付けてコンテンツペイン内に追加。   
    c.add(lab1,"FIRST");
    c.add(lab2,"SECOND");
    c.add(lab3,"THIRD");
  }

  //////////////////
  // mainメソッド //
  //////////////////
  public static void main(String[] args) {

    // フレーム１の作成。
    s115a f1 = new s115a("フレーム１");
    // フレームの大きさを設定。
    f1.setSize(300,200);
    // フレームの位置を設定。
    f1.setLocation(0,0);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // カードの指定。
    cl.show(c,"FIRST");
    // フレームの表示。
    f1.setVisible(true);

    // フレーム２の作成。
    s115a f2 = new s115a("フレーム２");
    // フレームの大きさを設定。
    f2.setSize(360,240);
    // フレームの位置を設定。
    f2.setLocation(0,300);
    // 「閉じる」ボタンがクリックされたとき、プログラムを終了する。
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // カードの指定。
    cl.show(c,"SECOND");
    // フレームの表示。
    f2.setVisible(true);
  }
}
