// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j362b.java 
 * created : Time-stamp: <09/07/01(��) 08:24:26 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j362b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j362b.java >>
//
//  �`�����������i�U�j�F���i�i�{�^���A�z�u�A�C�x���g�����j
//
//�@�@�u�ԁv�{�^�����N���b�N����ƁA�A�v���b�g�̔w�i�F���ԂɂȂ�B
//�@�@�u�΁v�{�^�����N���b�N����ƁA�A�v���b�g�̔w�i�F���΂ɂȂ�B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FButton�N���X
//�@�@�C�x���g�N���X�FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j362b extends Applet implements ActionListener {

  Button b1,b2; // init���\�b�h��actionPerformed���\�b�h�Ŏg���邽�߁A
                // �C���X�^���X�ϐ��ɂ���B

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // �{�^���̍쐬�B
    b1 = new Button("��");
    b2 = new Button("��");

    // �{�^�����A�v���b�g���ɒǉ��B
    this.add(b1);
    this.add(b2);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    // �{�^�����N���b�N���ꂽ�Ƃ��A���s�����B
    if( e.getSource() == b1 ) { this.setBackground(Color.red); }
    if( e.getSource() == b2 ) { this.setBackground(Color.green); }
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
<applet code="j362b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j362b.class" width="300" height="100">
</applet>

</body>
</html>
*/
