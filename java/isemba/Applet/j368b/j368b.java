// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j368b.java 
 * created : Time-stamp: <09/07/01(��) 09:23:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j368b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j368b.java >>
//
//  �`�����������i�U�j�F���i�i�e�L�X�g�G���A�A�z�u�A�C�x���g�����j
//
//�@�@�Q�̃e�L�X�g�G���A�Ɓu���ʁv�{�^���A�u�����v�{�^�������B
//�@�@�e�L�X�g�G���A���ŕҏW���ł���B
//�@�@���ʃ{�^�����N���b�N����ƁA���̃e�L�X�g�G���A�Ƀe�L�X�g�G���A��������
//�@�@���ʂ����B
//�@�@�폜�{�^�����N���b�N����ƁA���̃e�L�X�g�G���A�̕����񂪍폜�����B
//
//�@�@�e�L�X�g�G���A�ɕ\��������Ȃ��e�L�X�g�����͂����Ǝ����I�ɃX�N���[���o�[
//�@�@�������B�e�L�X�g�G���A�ɂ��ׂẴe�L�X�g���\���ł���悤�ɂȂ�ƃX�N���[
//�@�@���o�[�͏�����B
//�@�@���̕��i�i�{�^���Ȃǁj�Ƒg�ݍ��킹�Ďg���B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FTextArea�N���X
//�@�@�C�x���g�N���X�FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; 

public class j368b extends Applet implements ActionListener {

  TextArea ta1,ta2; 
  Button b1,b2;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �e�L�X�g�G���A�̍쐬�B
    ta1 = new TextArea("����ɂ���",3,30,TextArea.SCROLLBARS_BOTH);
    ta2 = new TextArea(3,30);

    // �e�L�X�g�G���A���A�v���b�g���ɒǉ��B
    this.add(ta1);
    this.add(ta2);

    // �{�^���̍쐬�B
    b1 = new Button("����");
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
    if( ae.getSource() == b1 ) {
      String s = ta1.getText();
      ta2.setText(s);
    }
    if( ae.getSource() == b2 ) {
      String s = " ";
      ta2.setText(s);
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
<applet code="j368b.class" width="300" height="240">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j368b.class" width="300" height="240">
</applet>

</body>
</html>
*/
