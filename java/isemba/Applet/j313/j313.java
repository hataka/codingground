// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j313.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j313.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j313.java >>
//
//  アプレット（１）：グラフィックス（フォント）
//  
//　●Graphicsクラスのメソッド
// 　 public abstract void setFont(Font font)
//  　  機能：以降に表示する文字をfontに設定。
//　　　font：設定するフォント。Fontオブジェクトで指定。
//
//　●Fontクラス
//　  Fontクラスは、テキストを目に見える形に描画するために使用されるフォントを表す。
//
//　○Fontクラスのコンストラクタ
//    public Font(String name, int style, int size)
//      機能：Fontオブジェクトを作成するコンストラクタ
//　　　      name ：フォント名(Serif,SansSerif,Monospced,Dialog,DialogInput)
//　　　      style：スタイル(PLAIN, BOLD, ITALICなど)
//　　　      size ：大きさ(ピクセル値)
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.Graphics; 
import java.awt.Font; 
import java.awt.Color; 

public class j313 extends Applet {

  Font f1,f2,f3,f4,f5;

  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray);

    // フォント定義。
    f1 = new Font("Serif",Font.PLAIN,24);
    f2 = new Font("SansSerif",Font.PLAIN,24);
    f3 = new Font("Monospaced",Font.PLAIN,24);
    f4 = new Font("Dialog",Font.PLAIN,24);
    f5 = new Font("DialogInput",Font.PLAIN,24);

  }

  public void paint(Graphics g) {

    // フォント：Serif
    g.setFont(f1); 
    g.drawString("Serif",50,30);

    // フォント：SansSerif
    g.setFont(f2); 
    g.drawString("SansSerif",50,60);

    // フォント：Monospaced
    g.setFont(f3); 
    g.drawString("Monospaced",50,90);

    // フォント：Dialog
    g.setFont(f4); 
    g.drawString("Dialog",50,120);

    // フォント：DialogInput
    g.setFont(f5); 
    g.drawString("DialogInput",50,150);
  }
}
/*
<!-- ＨＴＭＬファイル -->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j313.class" width="640" height="480">
</applet>
</body>
</html>
*/
