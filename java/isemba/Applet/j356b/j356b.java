// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j356b.java 
 * created : Time-stamp: <09/07/01(��) 07:30:39 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j356b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j356b.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�ω����钼���A�_�u���o�b�t�@�����O�j
//  
//    j356a.java�ł͂�������C�ɂȂ�B��������y�������@�Ƃ��āA
//�@�@�_�u���o�b�t�@�����O������B
//    ������̌����́A��ʂ��X�V����Ƃ��ɌĂяo�����update���\�b�h��
//�@�@�`���ʂ���x�N���A����paint���\�b�h���Ăяo�����Ƃɂ���B
//�@�@�N���A���Ă���ĕ`�悷��܂łɎ��Ԃ�������̂ł���B
//�@�@�����ŁA�N���A���邱�Ƃ���߁A����ɕʂ̉�ʂ�p�ӂ������ɕ`�悵�Ă����A
//�@�@��ʂɃR�s�[���邱�Ƃł�������y������B
//
//�@�@�菇�P�FImage�N���X�̃I�u�W�F�N�gimg���쐬����B
//            getGraphics���\�b�h��img��`��ł���悤�ɐݒ肷��B
//�@�@�@�@�@�@( gimg = img.getGraphics() )
//�@�@�菇�Q�F�̈�S�̂�w�i�F�œh��Ԃ��B
//�@�@�@�@�@�@update���\�b�h���ŁAgimg�ɕ`�悷��B
//�@�@�@�@�@�@drawImage���\�b�h��gimg����ʂɃR�s�[����B
//            ( g.drawImage(img,0,0,this) )
//
//  ��Component�N���X�̃��\�b�h
//�@�@Image createImage(int width, int height)
//      �@�\�F��width�A����height��Image�I�u�W�F�N�g���擾����B
//
//  ��Image�N���X�̃��\�b�h
//�@�@Graphics getGraphics()
//      �@�\�FGraphics�I�u�W�F�N�g���擾����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.*;
import java.awt.*;

public class j356b extends Applet implements Runnable {

  Dimension d;
  int x0,y0,x1,y1; // �����̗��[�̓_(x0,y0),(x1,y1)�B 
  int dx0,dx1,dy0,dy1; // x,y�̑����B
  Thread th;
  Image img;     // <-- �ǉ��B
  Graphics gimg; // <-- �ǉ��B

  // �����ݒ菈���B
  public void init() {
   // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
   this.setBackground(Color.lightGray);
    d = this.getSize();
    img = createImage(d.width,d.height); // <-- �ǉ��B
    gimg = img.getGraphics();            // <-- �ǉ��B
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
        repaint();// �ĕ`��B
        Thread.sleep(100);
      } catch( Exception e) { }
      if( (x0 < 0)||(x0 > d.width) ) { dx0 = -dx0; }
      if( (y0 < 0)||(y0 > d.height) ) { dy0 = -dy0; }
      if( (x1 < 0)||(x1 > d.width) ) { dx1 = -dx1; }
      if( (y1 < 0)||(y1 > d.height) ) { dy1 = -dy1; }
    }
  }

  public void update(Graphics g) {
    gimg.setColor(Color.lightGray);      // <-- �ǉ��B
    gimg.fillRect(0,0,d.width,d.height); // <-- �ǉ��B
    gimg.setColor(Color.red);            // <-- �ύX�B
    x0 = x0 + dx0; y0 = y0 + dy0;
    x1 = x1 + dx1; y1 = y1 + dy1;
    gimg.drawLine(x0,y0,x1,y1); // <-- �ύX�B
    g.drawImage(img,0,0,this);  // <-- �ǉ��B
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
<applet code="j356b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font>
<br> 

<applet code="j356b.class" width="300" height="160">
</applet>

</body>
</html>
*/
