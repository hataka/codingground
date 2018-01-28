// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373e.java 
 * created : Time-stamp: <09/07/01(��) 09:48:37 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373e.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373e.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A���p�j
//
//�@�@�t���[���ƌĂ΂��E�B���h�E(�^�C�g���F�u�t���[���v)��\������B
//�@�@����{�^�����N���b�N����ƏI������B
//    �t���[�����ɕ��i�i���x���j��ǉ�����B
//    �t���[���̃f�t�H���g���C�A�E�g�}�l�[�W���|�́ABorderLayout�ł���B
//
//�@�@WindowAdapter�N���X������N���X�Ƃ��Ďg���B
//
//�@��java.awt.Component�N���X�̃��\�b�h
//    public void setLocation(int x, int y)
//�@�@�@�@�\�F���i�̍�������e���i��x���W�Ay���W�Ɉʒu����悤�ɐݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373e extends Applet {

  Frame f;
  Label lab1,lab2,lab3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t���[���̍쐬�B
    f = new Frame("�t���[��");

    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);

    // ���x���̍쐬�B
    lab1 = new Label("���x���P"); lab1.setBackground(Color.red);
    lab2 = new Label("���x���Q"); lab2.setBackground(Color.green);
    lab3 = new Label("���x���R"); lab3.setBackground(Color.yellow);

    // ���x�����t���[�����ɒǉ��B
    f.add(lab1,BorderLayout.NORTH);
    f.add(lab2,BorderLayout.WEST);
    f.add(lab3,BorderLayout.EAST);

    // �t���[���̕\���ʒu��ݒ�B
    f.setLocation(300,300);

    // �t���[���̕\���B
    f.setVisible(true);

    // �C�x���g���X�i�[�̍쐬�B
    EventListener el = new EventListener();

    // �C�x���g���X�i�̓o�^�B
    f.addWindowListener(el);

  }

  // windowClosing���\�b�h���`����B
  class EventListener extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
      f.dispose();
      System.exit(0); // �v���O�������I�������郁�\�b�h�B
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
<applet code="j373e.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j373e.class" width="300" height="100">
</applet>
<br><br>

<img src="j373e.jpg" width=300 height=200>
<br><br>

</body>
</html>
*/
