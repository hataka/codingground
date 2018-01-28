//  -*- mode: java -*-  Time-stamp: <2009-06-16 20:49:36 kahata>
/*================================================================
 * name: j112b.java
 * created : Time-stamp: <09/06/16(��) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description:
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j344c.java >>
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
////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;     

public class j344c extends Applet {

  int Px=0,Py=0; // �}�E�X�̒��O�̈ʒu�B
  int Cx,Cy;     // �}�E�X�̌��݂̈ʒu�B
 
  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �C�x���g���X�i�̍쐬�B
    MouseMotionAdapter ma = new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Cx = e.getX(); // �N���b�N�����_��x���W���擾����B 
        Cy = e.getY(); // �N���b�N�����_��y���W���擾����B 
        repaint();
      }
      public void mouseMoved(MouseEvent e) { }
    };

    // �C�x���g���X�i�̓o�^�B
    this.addMouseMotionListener(ma);

  }

  public void update(Graphics g) {
    if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }
    g.drawLine(Px,Py,Cx,Cy); // �����̕`��B
    Px = Cx; Py = Cy; // ���O�̈ʒu���X�V�B
  }

}
/*
<!-- �g�s�l�k�t�@�C��-->
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j344c.class" width="300" height="200">
</applet>
</body>
</html>
</PRE><FONT color=blue size=5>���s����</FONT><BR><APPLET height=200 width=300 
code=j344c.class></APPLET> </BODY></HTML>
*/
