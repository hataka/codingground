// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j352a.java 
 * created : Time-stamp: <09/07/01(��) 07:15:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j352a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j352a.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�f�B�W�^�����v�j
//  
//    �f�B�W�^�����v���P�b���Ƃɕς���B
//
//�@��java.util.Date�N���X
//�@�@���t�Ǝ��Ԃ�\���N���X�B
//
//�@��Date�N���X�̃R���X�g���N�^
//    public Date()
//      �@�\�F���݂̓������Ԃ����B
//
//�@��Date�N���X�̃��\�b�h
//�@�@public String toString()
//�@�@�@�@�\�F������ɕϊ�����B
//�@�@
//�@��Thread�N���X�̃��\�b�h
//�@�@public void start()
//      �@�\�F�X���b�h�̎��s�J�n�B
//�@�@public static void sleep(long t) throws InterruptedException
//      �@�\�Ft�~���b�Ԓ�~�B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class j352a extends Applet implements Runnable {

  Thread th;

  // �����ݒ菈���B
  public void init() {
    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);
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
        repaint();//  �ĕ`��B
        Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
      } catch ( InterruptedException e ) { }
    }
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
<applet code="j352a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font>
<br> 

<applet code="j352a.class" width="300" height="100">
</applet>

</body>
</html>
*/
