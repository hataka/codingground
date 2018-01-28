// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j345a.java 
 * created : Time-stamp: <09/07/01(��) 06:44:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j345a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j345a.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�L�[����AKeyListener�C���^�[�t�F�[�X�j
//
//�@������
//�@�@�����ꂽ�L�[�𕶎���Ƃ��ĕ\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F �L�[����
//�@�@�C�x���g�N���X�F KeyEvent�N���X
//�@�@�C�x���g���X�i�F KeyListener�C���^�[�t�F�[�X
//                  �@ keyPressed,keyReleased,keyTyped���\�b�h
//
//�@��KeyListener�C���^�[�t�F�[�X�̃��\�b�h
//    public void keyPressed(KeyEvent e)
//�@�@�@�@�\�F�L�[�������ꂽ�Ƃ��̏����B
//    public void keyReleased(KeyEvent e)
//�@�@�@�@�\�F�L�[�������ꂽ�Ƃ��̏����B
//    public void keyTyped(KeyEvent e)
//�@�@�@�@�\�F�L�[�����͂��ꂽ�Ƃ��̏����B
//
//  ��KeyEvent�N���X�̃��\�b�h
//�@�@public char getKeyChar()
//      �@�\�F���͂��ꂽ�������擾����B
//
//  ��Component�N���X�̃��\�b�h
//�@�@public boolean requestFocusInWindow()
//      �@�\�F�t�H�[�J�X��v������B
//�@
//�@�E�L�[���͂�L���ɂ���ɂ́A�A�v���b�g������\�ɂȂ��Ă���K�v������B
//�@�@���i�i�A�v���b�g�j�𑀍�\�ɂ��邱�Ƃ��A�u�t�H�[�J�X��^����v�Ƃ����B
//�@�@�܂��A����\�ɂȂ��Ă��镔�i�̂��Ƃ��u�t�H�[�J�X�������Ă���v�Ƃ����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j345a extends Applet implements KeyListener {

  Font f;
  String s = "";

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t�H���g�̐ݒ�B
    f = new Font("Courier", Font.BOLD, 48);

    // �C�x���g���X�i�̓o�^�B 
    this.addKeyListener(this);
    this.requestFocusInWindow(); // �A�v���b�g���L�[���͂��󗝂���ɂ�
                                 // �t�H�[�J�X�������Ă��Ȃ���΂Ȃ�Ȃ��B
  }

  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.setFont(f);
    g.drawString(s,50,50);
  }

  // KeyListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void keyTyped(KeyEvent e) {
    s = s + e.getKeyChar();
    repaint(); // �ĕ`��B
  }

  // �c��̃��\�b�h����`����K�v������B
  public void keyPressed(KeyEvent e) { }
  public void keyReleased(KeyEvent e) { }

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
<applet code="j345a.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j345a.class" width="300" height="100">
</applet>

</body>
</html>
*/
