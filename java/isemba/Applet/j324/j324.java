// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j324.java 
 * created : Time-stamp: <09/06/30(火) 08:53:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j324.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j324.java >>
//
//  アプレット（２）：レイアウトマネージャー（GridBagLayout）
//
//　　GridBagLayoutマネージャーを使うと、異なる大きさの部品を縦横に柔軟に配置
//　　することができる。
//　　領域を格子状のセルに分割し、セルに部品を配置していく。
//
//　●セルとアドレス
//
//　　領域を格子状のセルに分割しセルに割り当てられたアドレス
//　　（行と列で指定する）を指定して部品を配置する。ひとつの部品が
//　　複数のセルを占有してもよい。
//
//    ・領域を格子に分割する。マス目をセルと呼ぶ。
//    　　－－－－－－－－－－－－－
//        ｜　　｜　　｜　　｜　　｜　   斜線部がセル。
//        ｜　　｜　　｜　　｜　　｜　   
//    　　－－－－－－－－－－－－－
//        ｜　　｜　　｜　　｜　　｜　   
//        ｜　　｜　　｜　　｜　　｜　   
//    　　－－－－－－－－－－－－－
//        ｜　　｜　　｜　　｜　　｜　   
//        ｜　　｜　　｜　　｜　　｜　   
//    　　－－－－－－－－－－－－－
//        ｜　　｜　　｜　　｜　　｜　   
//        ｜　　｜　　｜　　｜　　｜　   
//    　　－－－－－－－－－－－－－
//
//　　・セルの左上隅にアドレスを設定する。
//      右方向（列）に0,1,2,..., 下方向（行）に0,1,2,..., とする。
//         0     1     2     3     4
//    　0 －－－－－－－－－－－－－
//        ｜　　｜　　｜　　｜　　｜　   
//        ｜　　｜　　｜　　｜　　｜　   
//    　1 －－－－－－－－－－－－－      斜線部のセルのアドレスは、(2,1)
//        ｜　　｜　　｜////｜　　｜　   
//        ｜　　｜　　｜////｜　　｜　   
//    　2 －－－－－－－－－－－－－
//        ｜　　｜　　｜　　｜　　｜　   
//        ｜　　｜　　｜　　｜　　｜　   
//    　3 －－－－－－－－－－－－－
//        ｜　　｜　　｜　　｜　　｜　   
//        ｜　　｜　　｜　　｜　　｜　   
//    　4 －－－－－－－－－－－－－
//
//　●基本的な書き方
//
//    import java.applet.Applet; 
//    import java.awt.*;
//
//    public class クラス名 extends Applet {
//
//      public void init() {
//
//　　  　// グリッドバッグレイアウトマネージャーの作成。
//        GridBagLayout gb = new GridBagLayout();
//
//        // アプレットのレイアウトマネージャをGridBagLayoutに設定。
//        this.setLayout(gb);
//
//　　    // 部品の位置関係や形を指定するGridBagConstraintsオブジェクトの作成。
//        GridBagConstraints gbc = new GridBagConstraints();
//     
//        // 部品の作成。
//        Button b = new Button("ボタン");
//
//        // GridBagConstrintsクラスの変数を使って、部品の位置や形等の条件を設定。
//        gbc.gridx = 0; gbc.gridy = 0;
//
//        // 部品と条件を関連づける。
//        gb.setConstraints(b,gbc);
//
//        // アプレットに部品を配置。
//        this.add(b);
//
//      }
//
//    }
//
//　●GridBagLayoutクラス
//　　異なる大きさの部品を格子状に配置する。
//
//　○GridBagLayoutクラスのコンストラクタ
//　　GridLayout()
//　　　機能：グリッドバッグレイアウトマネージャーを作成する。
//
//  ○GridBagLayoutクラスのメソッド
//　　void setConstraints(Component c, GridBagConstraints gbc)
//      機能：部品cに条件gbcを設定する。
//
//　●GridBagConstraintsクラス
//　　部品の位置関係や形を指定する。
//
//　○GridBagConstraintsクラスのコンストラクタ
//　　GridBagConstraints()
//      機能：GridBagConstraintsオブジェクトを作成する。
//
//　○GridBagConstrintsクラスの変数
//
//    public int gridx  デフォルトは、RELATIVE。
//　　　　　部品の位置が左からgridx+1列目であることを指定する。
//　　　　　すなわち、gridx=0が１列目、gridx=1が２列目、・・・。
//    　　　この部品が追加される直前にコンテナに追加された部品の
//　　　　　直後に配置するには、RELATIVEと指定する。 
//
//    public int gridy   デフォルトは、RELATIVE。
//　　　　　部品の位置が上からgridy+1行目であることを指定する。
//　　　　　すなわち、gridy=0が１行目、gridy=1が２行目、・・・。
//    　　　この部品が追加される直前にコンテナに追加された部品の
//　　　　　直下に配置するには、RELATIVEと指定する。 
//　　　　　　　　　　  
//    public int gridwidth   デフォルトは１。 
//　　　　　部品が使う幅(列数)。
//　　　　　部品の表示領域が gridxからその行の最後のセルまでであることを
//　　　　　指定するには、REMAINDERとする。
//　　　　　部品の表示領域が gridxからその行の最後の1つ手前のセルまでであることを
//    public int ipadx   デフォルトは0。
//          部品の最小幅に追加する領域の値を指定する。単位はピクセル。
// 
//    public int ipady   デフォルトは0。
//          部品の最小の高さに追加する領域の値を指定する。単位はピクセル。 
//
//　　　　　指定するには、RELATIVE とする 
//
//    public int gridheight   デフォルトは１。
//　　　　　部品が使う高さ(行数)。
//　　　　　部品の表示領域が gridyからその列の最後のセルまでであることを
//　　　　　指定するには、REMAINDERとする。
//　　　　　部品の表示領域が gridxからその列の最後の1つ手前のセルまでであることを
//　　　　　指定するには、RELATIVE とする 
//
//    public int ipadx   デフォルトは0。
//          部品の最小幅に追加する領域の値を指定する。単位はピクセル。
// 
//    public int ipady   デフォルトは0。
//          部品の最小の高さに追加する領域の値を指定する。単位はピクセル。 
//
////////////////////////////////////////////////////////////////////////////////
