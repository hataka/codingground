// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j364b.java 
 * created : Time-stamp: <09/07/01(��) 08:29:57 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j364b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j364b.java >>
//
//  �`�����������i�U�j�F���i�i�`�F�b�N�{�b�N�X�A�z�u�A�C�x���g�����j
//
//�@�@�u�ԁv���ڂ��`�F�b�N����ƁA���x���̔w�i�F���ԂɂȂ�B
//�@�@�u���v���ڂ��`�F�b�N����ƁA���x���̔w�i�F�����ɂȂ�B
//�@�@�u�v���ڂ��`�F�b�N����ƁA���x���̔w�i�F���ɂȂ�B
//�@�@ �����̍��ڂ�I���ł���B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FCheckbox�N���X
//�@�@�C�x���g�N���X�FItemEvent�N���X
//�@�@�C�x���g���X�i�FItemListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@itemStateChanged���\�b�h
//
//  ��Checkbox�N���X�̃��\�b�h
//    public boolean getState()
//�@�@�@�@�\�F�`�F�b�N�{�b�N�X���A�`�F�b�N����Ă���ꍇtrue�A����Ă��Ȃ��ꍇ
//�@�@�@�@�@�@false��Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j364b extends Applet implements ItemListener {

  Checkbox c1,c2,c3;
  Label lab1,lab2,lab3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    this.setLayout(new GridLayout(2,3,10,10));

    // �`�F�b�N�{�b�N�X�{�^���̍쐬�B
    c1 = new Checkbox("��");
    c2 = new Checkbox("��",true);
    c3 = new Checkbox("��",false);

    // �`�F�b�N�{�b�N�X�{�^�����A�v���b�g���ɒǉ��B
    this.add(c1);
    this.add(c2);
    this.add(c3);

    // ���x���̍쐬�B
    lab1 = new Label("���x���P");
    lab2 = new Label("���x���Q");
    lab3 = new Label("���x���R");

    // ���x�����A�v���b�g���ɒǉ��B
    this.add(lab1);
    this.add(lab2);
    this.add(lab3);

    // �C�x���g���X�i�̓o�^�B
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);

  }

  // ItemListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void itemStateChanged(ItemEvent ie) {
    if( c1.getState() ) { 
      lab1.setBackground(Color.red); 
    } else {
      lab1.setBackground(Color.white);
    }
    if( c2.getState() ) { 
      lab2.setBackground(Color.blue); 
    } else {
      lab2.setBackground(Color.white);
    }
    if( c3.getState() ) { 
      lab3.setBackground(Color.yellow); 
    } else {
      lab3.setBackground(Color.white);
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
<applet code="j364b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j364b.class" width="300" height="100">
</applet>

</body>
</html>
*/
