// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j345d.java 
 * created : Time-stamp: <09/07/01(��) 06:58:53 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j345d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j345d.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�L�[����AKeyAdapter�N���X�A�O���N���X�j
//
//�@������
//�@�@�����ꂽ�L�[�𕶎���Ƃ��ĕ\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F �L�[����
//�@�@�C�x���g�N���X�F KeyEvent�N���X
//�@�@�C�x���g���X�i�F KeyAdapter�N���X���g�������N���X
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j345d extends Applet {

  Font f;
  String s = "";

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    f = new Font("Courier", Font.BOLD, 48);

    // �C�x���g���X�i�̍쐬�B
    EventListener345d el = new EventListener345d(this);

    // �C�x���g���X�i�̓o�^�B
    this.addKeyListener(el);

    // �A�v���b�g�Ƀt�H�[�J�X��^����B
    this.requestFocusInWindow();

  }

  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.setFont(f);
    g.drawString(s,50,50);
  }

}

class EventListener345d extends KeyAdapter {

  j345d obj;

  EventListener345d(j345d obj) { // �R���X�g���N�^�B
    this.obj = obj;
  }
 
  // keyTyped���\�b�h�̒�`�B
  public void keyTyped(KeyEvent e) {
    obj.s = obj.s + e.getKeyChar();
    obj.repaint(); // �ĕ`��B
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
<applet code="j345d.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j345d.class" width="300" height="100">
</applet>

</body>
</html>
*/
