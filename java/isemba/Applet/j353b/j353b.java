// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j353b.java 
 * created : Time-stamp: <09/07/01(��) 07:22:06 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j353b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j353b.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�Q�̃f�B�W�^�����v�AJAR�t�@�C���j
//  
//�@�@j353a.java�Ɠ��������B
//
//�@��JAR�t�@�C��
//�@�@�����̃t�@�C�������k���āA�ЂƂ̃t�@�C���ɂ������̂�JAR�t�@�C���Ƃ����B
//�@�@�A�v���b�g�̎��s�ɕK�v�ȃt�@�C����JAR�t�@�C���ɂ��Ă����A�Aapplet�^�O��
//�@�@archive�w�������ƁAWeb�T�[�o����̃_�E�����[�h���P��ōς݁A������
//�@�@�悭�Ȃ�B
//
//�@���菇
//�@�@�菇(1) % javac j353b.java
//            3�̃t�@�C�� j353b.class, j353b$INj353b1.class, 
//            j353b$INj353b2.class �������B
//  �@�菇(2) % jar cf j353b.jar j353b.class j353b$INj353b1.class 
//                               j353b$INj353b2.class
//            JAR�t�@�C��(j353b.jar)�����B
//    �菇(3) HTML�t�@�C������archive�p�����[�^���w�肷��B
//            <applet code="j353b.class"
//                    archive="j353b.jar" width="300" height="100">
//            </applet>
//               
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class j353b extends Applet {

  Thread th1,th2;
  int x,y,x1,y1,x2,y2;

  // �����ݒ菈���B
  public void init() {
    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);
    x1 = 40; y1 = 30;
    x2 = 40; y2 = 60;
  }

  // �J�n�����B
  public void start() {
    th1 = new INj353b1();
    th2 = new INj353b2();
    th1.start();
    th2.start();
  }

  // ��~�����B
  public void stop() {
    th1 = null;
    th2 = null;
  }

  // �X���b�h�̖{�́B
  class INj353b1 extends Thread {
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

  class INj353b2 extends Thread {
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
<applet code="j353b.class" archive="j353b.jar" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font>
<br> 

<applet code="j353b.class" archive="j353b.jar" width="300" height="100">
</applet>

</body>
</html>
*/
