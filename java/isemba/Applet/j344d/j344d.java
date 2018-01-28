// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j344d.java 
 * created : Time-stamp: <09/07/01(��) 06:42:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j344d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j344d.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�}�E�X����AMouseMotionAdapter�N���X�A�O���N���X�j
//
//�@������
//�@�@�}�E�X���h���b�O���ċȐ���`���B
//    �Erepaint���\�b�h����Ăяo�����update���\�b�h���I�[�o�[���C�h����B
//�@�@�@���Ȃ킿�A�ȑO�ɕ`�悵��������}�`���������Ȃ��悤�ɂ���B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F �}�E�X
//�@�@�C�x���g�N���X�F MouseEvent�N���X
//�@�@�C�x���g���X�i�F MouseMotionAdapter�N���X���g�������N���X
//
//  ��MouseMotionAdapter�N���X
//�@�@MouseMotionListener�C���^�[�t�F�[�X�ɑΉ�����A�_�v�^�N���X�B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;     

public class j344d extends Applet {

  int Px=0,Py=0; // �}�E�X�̒��O�̈ʒu�B
  int Cx,Cy;     // �}�E�X�̌��݂̈ʒu�B
 
  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �C�x���g���X�i�̍쐬�B
    EventListener344d el = new EventListener344d(this);

    // �C�x���g���X�i�̓o�^�B
    this.addMouseMotionListener(el);

  }

  public void update(Graphics g) {
    if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }
    g.drawLine(Px,Py,Cx,Cy); // �����̕`��B
    Px = Cx; Py = Cy; // ���O�̈ʒu���X�V�B
  }

}

class EventListener344d extends MouseMotionAdapter {

  j344d obj;

  EventListener344d(j344d obj) {
    this.obj = obj;
  }
 
  public void mouseDragged(MouseEvent e) {
    obj.Cx = e.getX(); // �N���b�N�����_��x���W���擾����B 
    obj.Cy = e.getY(); // �N���b�N�����_��y���W���擾����B 
    obj.repaint();
  }

  public void mouseMoved(MouseEvent e) { }

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
<applet code="j344d.class" width="300" height="200">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j344d.class" width="300" height="200">
</applet>

</body>
</html>
*/
