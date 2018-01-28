// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j370b.java 
 * created : Time-stamp: <09/07/01(��) 09:28:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j370b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j370b.java >>
//
//  �`�����������i�U�j�F���i�i�L�����o�X�A�z�u�A�C�x���g�����j
//
//    �A�v���b�g���ɐԊۃ{�^���A���ۃ{�^�����쐬����B
//�@�@�Ԋۃ{�^�����N���b�N����ƁA�Ԋۂ��L�����o�X�ɕ`�悳��A
//�@�@���ۃ{�^�����N���b�N����ƁA���ۂ��L�����o�X�ɕ`�悳���B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FButton�N���X
//�@�@�C�x���g�N���X�FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//�@��Graphics�N���X�̃��\�b�h
//    public abstract void fillOval(int x, int y, int w, int h)
//�@�@�@�@�\�Fx,y,w,h�Ŏw�肳����`���ɓh��Ԃ��ꂽ�ȉ~���`�悳���B
//            x : �`�悳���ȉ~�̍������ x ���W
//            y : �`�悳���ȉ~�̍������ y ���W
//            w : �`�悳���ȉ~�̕�
//            h : �`�悳���ȉ~�̍���
// 
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

class Canvasj370b extends Canvas {

  Color col;
  public void paint(Graphics g) {
    g.setColor(col);
    g.fillOval(20,20,50,50);
 }

}
  
public class j370b extends Applet implements ActionListener {

  Canvasj370b c;
  Button b1,b2;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �L�����o�X�̍쐬�B
    c = new Canvasj370b();

    // �L�����o�X�̑傫����ݒ�B
    c.setSize(100,80);

    // �L�����o�X�̈ʒu��ݒ�B
    c.setLocation(10,10);

    // �L�����o�X�̔w�i�F�����F�ɐݒ�B
    c.setBackground(Color.yellow);

    // �L�����o�X���A�v���b�g���ɒǉ��B
    this.add(c);

    // �{�^���̍쐬�B
    b1 = new Button("�Ԋ�");
    b2 = new Button("����");

    // �{�^�����A�v���b�g���ɒǉ��B
    this.add(b1);
    this.add(b2);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent ae) {
    // �Ԋۃ{�^�����N���b�N���ꂽ�Ƃ��B
    if( ae.getSource() == b1 ) { c.col = Color.red; } 
    // ���ۃ{�^�����N���b�N���ꂽ�Ƃ��B
    if( ae.getSource() == b2 ) { c.col = Color.white; }
    c.repaint(); // �ĕ`��B
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
<applet code="j370b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j370b.class" width="300" height="160">
</applet>

</body>
</html>
*/
