// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j343a.java 
 * created : Time-stamp: <09/06/30(��) 20:49:54 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j343a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j343a.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�}�E�X����AMouseListener�C���^�[�t�F�[�X�j
//
//�@������
//�@�@�}�E�X�{�^���������ƁA���̈ʒu��"Mouse Down"�ƕ\������B
//�@�@�}�E�X�{�^���𗣂��ƁA���̈ʒu��"Mouse Up"�ƕ\������B
//�@�@�}�E�X�{�^�����N���b�N����ƁA���̈ʒu��"Mouse Clicked"�ƕ\������B
//    �}�E�X�J�[�\�����E�B���h�E���ɓ���ƁA�w�i�F���ԂɂȂ�B
//    �}�E�X�J�[�\�����E�B���h�E�O�ɏo��ƁA�w�i�F���΂ɂȂ�B
//
//  ��MouseListener�C���^�[�t�F�[�X
//�@�@�}�E�X����Ɋւ���C���^�[�t�F�[�X�B
//    �T�̃��\�b�h���ׂĂ��`����K�v������B
//
//   �@ mousePressed   : �}�E�X�{�^���������ƌĂяo�����B
//    �@mouseReleased  : �}�E�X�{�^���𗣂��ƌĂяo�����B
//    �@mouseCliced    : �}�E�X�{�^�����N���b�N����ƌĂяo�����B
//    �@mouseEntered   : �E�C���h�E���Ƀ}�E�X�J�[�\��������ƌĂяo�����B
//    �@mouseExited    : �E�C���h�E�O�Ƀ}�E�X�J�[�\�����o��ƌĂяo�����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F �}�E�X
//�@�@�C�x���g�N���X�F MouseEvent�N���X
//�@�@�C�x���g���X�i�F MouseListener�C���^�[�t�F�[�X
//                  �@ mousePressed,mouseReleased,mouseCliced,mouseEntered,
//                     mouseExited���\�b�h
//
//�@��Component�N���X�̃��\�b�h
//�@�@public int getX()
//      �@�\�F�R���|�[�l���g�̌��݂�x���W��Ԃ��B
//�@�@public int getY()
//      �@�\�F�R���|�[�l���g�̌��݂�y���W��Ԃ��B
//�@�@public viod repaint()
//      �@�\�Fupdate���\�b�h���Ăяo���B
//�@�@�@�@�@�@update���\�b�h�����s�����ƁA�`��̈悪�w�i�F�œh��Ԃ���A
//�@�@�@�@�@�@���̌�Apaint���\�b�h���Ăяo����A�`�悳���B���������āA
//�@�@�@�@�@�@�O�ɕ`�悳��Ă����}�`�͏����邱�ƂɂȂ�B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j343a extends Applet implements MouseListener {

  String s = "";
  int Mx = 0,My = 0; // �}�E�X�̍ŏ��̈ʒu�B

  public void init() {
    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);
    // �C�x���g���X�i�̓o�^�B
    this.addMouseListener(this);
  }

  public void paint(Graphics g) {
    // �}�E�X�̃C�x���g����ƈʒu�̕\���B
    g.drawString(s,Mx,My);
    String pos = "(" + Mx + "," + My + ")";
    g.drawString(pos,Mx,My+12);
  }

  // MouseListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void mousePressed(MouseEvent e) {
    Mx = e.getX(); // MouseEvent�I�u�W�F�N�g����}�E�X�̌��݈ʒu(x���W)���擾����B
    My = e.getY(); // MouseEvent�I�u�W�F�N�g����}�E�X�̌��݈ʒu(y���W)���擾����B
    s = "Mouse Down"; // ������\���B
    repaint(); // �ĕ`��B
  }

  public void mouseReleased(MouseEvent e) {
    Mx = e.getX(); My = e.getY(); 
    s = "Mouse Up";
    repaint(); // �ĕ`��B
  }

  public void mouseClicked(MouseEvent e) { 
    Mx = e.getX(); My = e.getY(); 
    s = "Mouse Clicked";
    repaint(); // �ĕ`��B
  }

  public void mouseEntered(MouseEvent e) { 
    this.setBackground(Color.red);
  }

  public void mouseExited(MouseEvent e) { 
    this.setBackground(Color.green);
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
<applet code="j343a.class" width="640" height="480">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<!-- applet code="j343a.class" width="640" height="480" -->
<!--/applet -->

</body>
</html>
*/
