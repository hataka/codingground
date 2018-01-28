// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j353a.java 
 * created : Time-stamp: <09/07/01(��) 07:20:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j353a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j353a.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�Q�̃f�B�W�^�����v�A�����N���X�j
//  
//    �P�b���Ƃɕς��f�B�W�^�����v��10�b���ƕς��f�B�W�^�����v��
//�@�@�����ɓ������B
//
//  ��Graphics�N���X�̃��\�b�h
//�@�@void clearRect(int x, int y, int w, int h)
//      �@�\�F�����`��w�i�F�œh��Ԃ��B(x,y)�͍�����̍��W�Bw�͕��Ah�͍����B
//�@�@�@�@�@�@�����`�̍��W�@(x,y)------(x+w,y)
//                            |             |
//                          (x,y+h)--(x+w,y+h)
//
//�@�@�EdrawString("��",x,y)�̏ꍇ�A���̍�������(x,y)�ɑΉ�����B
//�@�@  ���������āAx=0,y=0�Ƃ���ƁA�����\������Ȃ��Ȃ�B
//      �����̍����������Ay�𑝉����Ă����K�v������B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class j353a extends Applet {

  Thread th1,th2;
  int x,y,x1,y1,x2,y2;

  // �����ݒ�B
  public void init() {
    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);
    x1 = 40; y1 = 30;
    x2 = 40; y2 = 60;
  }

  // �J�n�����B
  public void start() {
    th1 = new INj353a1();
    th2 = new INj353a2();
    th1.start();
    th2.start();
  }

  // ��~�����B
  public void stop() {
    th1 = null;
    th2 = null;
  }

  // �X���b�h�̖{�́B
  class INj353a1 extends Thread {
    public void run() {
      while( true ) {
        try {
          x = x1; y = y1;
          repaint(); // �ĕ`��B
          Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
        } catch ( InterruptedException e ) { }
      }
    }
  }

  class INj353a2 extends Thread {
    public void run() {
      while( true ) {
        try {
          x = x2; y = y2;
          repaint(); // �ĕ`��B
          Thread.sleep(10000); // 10000�~���b�ԃX���[�v����B
        } catch ( InterruptedException e ) { }
      }
    }
  }

  // �����̕\���B
  public void update(Graphics g) {
    Date t = new Date();
    g.clearRect(x,y-20,300-x,20);
    g.drawString(t.toString(),x,y);
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
<applet code="j353a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font>
<br> 

<applet code="j353a.class" width="300" height="100">
</applet>

</body>
</html>
*/
