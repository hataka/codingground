// -*- mode: java -*- Time-stamp: <2009-06-20 23:05:29 kahata>
/*====================================================================
 * name: j317.java 
 * created : Time-stamp: <09/06/20(土) 15:52:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j317.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j317.java >>
//
//  アプレット（１）：グラフィックス（画像）
//
//　　ホームページ上から画像ファイルをダウンロードし表示する。
//  
//　●Appletクラスのメソッド
//    public URL getDocumentBase()
//      機能：HTMLファイル(アプレットが記述されている)が存在するURLを取得する。 
//　  Image getImage(URL url, String name)
//  　  機能：urlで指定された場所から画像データを取得する。
//　　　      url ：URL
//　　      　name：画像データのファイル名
//
//　●Graphicsクラスのメソッド
//　　public abstract boolean drawImage(Image img, int x, int y,
//                                      ImageObserver obs)
//   　 機能：指定されたImageオブジェクトimgの現在利用可能な部分を座標(x,y)に
//　　　　　　左上隅を合わせて描画する。
//            イメージが完全にロードされた場合true、そうでない場合falseを返す。
//　　      　img：Imageオブジェクト
//　　      　x  ：x座標
//      　　　y　：y座標
//　　      　obs：画像データの状態が通知されるオブジェクト
//                 アプレットがイメージオブザーバになっているのでthisとしておく。
//
//　　　・画像ファイルのダウンロードは、全部が転送された後、まとめて表示される
//　　　　のではなく、少しずつ転送され、転送分はすぐに表示されていく。
//　　　　このような場合、表示状況を管理する必要が出てくる。
//　　　　この役目をイメージオブザーバが行う。
//
//　　public abstract boolean drawImage(Image img, int x, int y, int w, int h,
//                                      ImageObserver observer)
//   　 機能：Imageオブジェクトimgを座標(x,y)に左上隅を合わせ、幅w, 高さhで描画。
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class j317 extends Applet {

  URL url;
  Image img;
//ImageIcon img;
  public void init() {

    // アプレットの背景色を灰色に設定。
    this.setBackground(Color.lightGray); 

    // DocumentBaseの取得。
    url = this.getDocumentBase();

    // 画像データを取得。
 //  ImageIcon img = new ImageIcon(getClass().getResource("/semba.gif"));
   img = getImage(url,"semba.gif");

  }

  public void paint(Graphics g) {

    // DocumentBaseの表示。
    g.drawString("DocumentBase: " + url,20,30);

    // 画像データを描画。
    g.drawImage((Image)img,20,50,this);
    g.drawImage((Image)img,200,50,90,90,this);
  }
}
/*
<!-- ＨＴＭＬファイル -->
<html>
<head>
  <title>アプレット</title>
</head>
<body bgcolor=white text=black>
<applet code="j317.class" width="500" height="200">
</applet>
</body>
</html>
*/
