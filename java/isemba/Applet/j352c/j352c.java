// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j352c.java 
 * created : Time-stamp: <09/07/01(��) 07:19:30 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j352c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j352c.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�f�B�W�^�����v�A�����N���X�j
//  
//    �f�B�W�^�����v���P�b���Ƃɕς���B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class j352c extends Applet {

  Thread th;

  // �����ݒ菈���B
  public void init() {
    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);
  }

  // �J�n�����B
  public void start() {
    // �X���b�h�̖{�́B                                              
    Thread th = new Thread() {                                       
      public void run() {                                            
        while( true ) {                                              
          try {                                                      
            repaint(); // �ĕ`��B
            Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B        
          } catch ( InterruptedException e ) { }                      
        }                                                            
      }                                                              
    };                                                               
    th.start(); // �X���b�h�̊J�n�B
  }

  // ��~�����B
  public void stop() {
    th = null;
  }

  // �����̕\���B
  public void paint(Graphics g) {
    Date t = new Date();
    g.drawString(t.toString(),40,50);
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
<applet code="j352c.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font>
<br> 

<applet code="j352c.class" width="300" height="100">
</applet>

</body>
</html>
*/
