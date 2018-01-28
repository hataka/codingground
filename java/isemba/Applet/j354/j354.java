// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j354.java 
 * created : Time-stamp: <09/07/01(��) 07:27:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j354.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j354.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�{�^������A�f�B�W�^�����v�A�C�x���g�����j
//
//�@������
//�@�@�@�J�n�Ə����ꂽ�{�^�����N���b�N����ƃf�B�W�^�����v�������A
//�@�@�@��~�Ə����ꂽ�{�^�����N���b�N����ƃf�B�W�^�����v����~����B
//
//�@���X���b�h�̒�~�B
//�@�@�X���b�h�̒�~�ɁAThread�N���X�̃��\�b�hstop()�́A���S�łȂ��̂Ŏg��Ȃ�
//�@�@�ق����悢�B����̕��@�������B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class j354 extends Applet implements ActionListener,Runnable {

  Button b1,b2; 
  Thread th;
  boolean running; // �X���b�h�����쒆��true�A��~����false�B

  // �����ݒ菈���B
  public void init() {
   // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
   this.setBackground(Color.lightGray);
   // �{�^���̍쐬�B
    b1 = new Button("�J�n");
    b2 = new Button("��~");
    // �{�^�����A�v���b�g�ɒǉ��B
    this.add(b1);
    this.add(b2);
    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // �J�n�����B
  public void start() {
    // �X���b�h�̍쐬�ƊJ�n�B
    th = new Thread(this);
    th.start();
    running = true;
  }

  // ��~�����B
  public void stop() {
    th = null;
  }

  // �X���b�h�̖{�́B
  public void run() {
    while( running ) { // running��true�̊ԁA�J��Ԃ����s����A�O������false��
                       // �ݒ肳���ƃ��[�v��E�o����B
      try {
        repaint(); // �ĕ`��B
        Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
      } catch ( InterruptedException e ) { }
    }
    th = null;
  }

  // �����̕\���B
  public void paint(Graphics g) {
    Date t = new Date();
    g.drawString(t.toString(),40,70);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) {
      th = new Thread(this);
      th.start();
      running = true;
    } 
    if( e.getSource() == b2 ) {
      running = false;
    } 
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
<applet code="j354.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j354.class" width="300" height="100">
</applet>

</body>
</html>
*/
