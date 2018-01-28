// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j355.java 
 * created : Time-stamp: <09/07/01(��) 07:28:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j355.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j355.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i������̈ړ��j
//
//�@�@��ʏ�𕶎��񂪈ړ�����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j355 extends Applet implements Runnable {

  Thread th;
  String s = "<==="; // �ړ����镶����B
  Dimension d;
  int x=0,y=0; // ������̈ʒu���W�B

  // �����ݒ菈���B
  public void init() { 
    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);
    // �A�v���b�g�̃T�C�Y���擾�B
    d = this.getSize();
    x = d.width;
    y = d.height/2;
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

  // �X���b�h�̖{�́B
  public void run() {
    while( true ) {
      try {
        repaint(); // �ĕ`��B
        x = x - 5;
        if( x < 0 ) { x = d.width; }
        Thread.sleep(200); // 200�~���b�ԃX���[�v����B
      } catch ( InterruptedException e ) { }
    }
  }

  // ������̕\���B
  public void paint(Graphics g) {
    g.setColor(Color.cyan);
    g.setFont(new Font("Serif",Font.BOLD,48));
    g.drawString(s,x,y);
  }

}
/*
</pre>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j355.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j355.class" width="300" height="100">
</applet>

</body>
</html>
*/
