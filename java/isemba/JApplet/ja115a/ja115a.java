// -*- mode: java -*-  Time-stamp: <2010-04-16 13:14:24 kahata>
/*================================================================
 * file: ja115a.java
 * path; F:\java\isemba\JApplet\ja115a\ja115a.java
 * url:  http://localhost/java/isemba/JApplet/ja115a/ja115a.java
 * created: Time-stamp: <2010-04-16 13:14:24 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: 
 *
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja115a.java >>
//
//  ＪＡｐｐｌｅｔ（１）：レイアウトマネージャー（CardLayout、配置）
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
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja115a.class" width="300" height="200"></applet>
import java.awt.*; 
import javax.swing.*;

public class ja115a extends JApplet {

  Container c;
  CardLayout cl;

  public void init() {
    // アプレットのコンテンツペインを取得。
    c = this.getContentPane();
    // CardLayoutオブジェクトの作成。
    cl = new CardLayout(10,20); 
    // コンテンツペインのレイアウトマネージャをCardLayoutに設定。
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

  public void start() {
    cl.show(c,"SECOND");
  }
}
