// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j356a.java 
 * created : Time-stamp: <09/07/01(��) 07:29:18 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j356a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j356a.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�ω����钼���j
//  
//    ������ω�������B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j356a extends Applet implements Runnable {

  Dimension d;
  int x0,y0,x1,y1; // �����̗��[�̓_(x0,y0),(x1,y1)�B 
  int dx0,dx1,dy0,dy1; // x,y�̑����B
  Thread th;

  // �����ݒ菈���B
  public void init() {   
    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);
    d = this.getSize();
    x0 = 0; y0 = 0; // �_�O�̍��W(x0,y0)�B
    x1 = 0; y1 = 0; // �_�P�̍��W(x1,y1)�B
    dx0 = 2; dy0 = 3; // �_�O�̑����B
    dx1 = 4; dy1 = 5; // �_�P�̑����B
  }

  // �J�n�����B
  public void start() {
    th = new Thread(this);
    th.start();
  }

  // ��~�����B
  public void stop() {
    th = null;
  }

  public void run() {
    while( true ) {
      try {
        repaint(); // �ĕ`��B
        Thread.sleep(100);
      } catch( Exception e) { }
      if( (x0 < 0)||(x0 > d.width) ) { dx0 = -dx0; }
      if( (y0 < 0)||(y0 > d.height) ) { dy0 = -dy0; }
      if( (x1 < 0)||(x1 > d.width) ) { dx1 = -dx1; }
      if( (y1 < 0)||(y1 > d.height) ) { dy1 = -dy1; }
    }
  }

  public void paint(Graphics g) {
    g.setColor(Color.red);
    x0 = x0 + dx0; y0 = y0 + dy0;
    x1 = x1 + dx1; y1 = y1 + dy1;
    g.drawLine(x0,y0,x1,y1);
  }
}
/*
</pre>

<pre>
<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j356a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font>
<br> 

<applet code="j356a.class" width="300" height="160">
</applet>

</body>
</html>
*/
