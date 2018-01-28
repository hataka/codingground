// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j344b.java 
 * created : Time-stamp: <09/06/30(��) 07:24:28 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j344b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j344b.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�}�E�X����AMouseMotionAdapter�N���X�A�����N���X�j
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

public class j344b extends Applet {

  int Px=0,Py=0; // �}�E�X�̒��O�̈ʒu�B
  int Cx,Cy;     // �}�E�X�̌��݂̈ʒu�B
 
  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �C�x���g���X�i�̍쐬�B
    EventListener el = new EventListener();

    // �C�x���g���X�i�̓o�^�B
    this.addMouseMotionListener(el);

  }

  public void update(Graphics g) {
    if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }
    g.drawLine(Px,Py,Cx,Cy); // �����̕`��B
    Px = Cx; Py = Cy; // ���O�̈ʒu���X�V�B
  }

  class EventListener extends MouseMotionAdapter {

    public void mouseDragged(MouseEvent e) {
      Cx = e.getX(); // �N���b�N�����_��x���W���擾����B 
      Cy = e.getY(); // �N���b�N�����_��y���W���擾����B 
      repaint();
    }

    public void mouseMoved(MouseEvent e) { }

  }

}
/*
�g�s�l�k�t�@�C��
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j344b.class" width="300" height="200">
</applet>
</body>
</html>
*/
