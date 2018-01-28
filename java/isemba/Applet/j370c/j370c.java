// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j370c.java 
 * created : Time-stamp: <09/07/01(��) 09:29:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j370c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j370c.java >>
//
//  �`�����������i�U�j�F���i�i�L�����o�X�A�z�u�A�C�x���g�����j
//
//    �L�����o�X�S�̂��A�v���b�g���ňړ�����B
//�@�@�}�E�X�ŃN���b�N�����ʒu�ɃL�����o�X���ړ�����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X
//�@�@�C�x���g�N���X�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseAdapter���g�������N���X
//
//�@��java.awt.Component�N���X�̃��\�b�h
//�@�@public Dimension getSize()
//�@�@�@�@�\�F���i�̃T�C�Y���ADimension�I�u�W�F�N�g�Ƃ��ĕԂ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

class Canvasj370c extends Canvas {

  public void paint(Graphics g) {
    Dimension d = this.getSize(); // �L�����o�X�̕��A�������擾�B
    g.drawRect(0,0,d.width,d.height); // �����`��`��B
    g.drawString("�L�����o�X",20,40);
  }

}
  
public class j370c extends Applet {

  Canvasj370c c;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�Ƀ��C�A�E�g�}�l�[�W����ݒ肵�Ȃ��B
    this.setLayout(null);

    // �L�����o�X�̍쐬�B
    c = new Canvasj370c();

    // �L�����o�X�̑傫����ݒ�B
    c.setSize(100,60);

    // �L�����o�X�̈ʒu�������ݒ�B
    c.setLocation(0,0);

    // �L�����o�X�̔w�i�F�����F�ɐݒ�B
    c.setBackground(Color.yellow);

    // �L�����o�X���A�v���b�g���ɒǉ��B
    this.add(c);

    // �C�x���g���X�i�̍쐬�B
    EventListener el = new EventListener();

    // �C�x���g���X�i�̓o�^�B
    this.addMouseListener(el);

  }

  // �C�x���g���X�i������N���X�Ƃ��Ē�`�B
  class EventListener extends MouseAdapter {
    public void mouseClicked(MouseEvent me) {
      int Mx = me.getX(); // �N���b�N�����_��x���W���擾����B 
      int My = me.getY(); // �N���b�N�����_��y���W���擾����B
      c.setLocation(Mx,My);
      c.repaint(); // �ĕ`��B
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
<applet code="j370c.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j370c.class" width="300" height="160">
</applet>

</body>
</html>
*/
