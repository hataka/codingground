// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373c.java 
 * created : Time-stamp: <09/07/01(��) 09:47:24 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373c.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A����{�^���A�C�x���g�����j
//
//�@�@�u�t���[���v�Ƃ����^�C�g�����̃E�B���h�E��\������B
//�@�@����{�^�����N���b�N����ƏI������B
//
//�@�@WindowAdapter�N���X������N���X�Ƃ��Ďg���B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F Window�N���X
//�@�@�C�x���g�N���X�F WindowEvent�N���X
//�@�@�C�x���g���X�i�F WindowAdapter�N���X���g������EventListener�N���X
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373c extends Applet {

  Frame f;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t���[���̍쐬�B
    f = new Frame("�t���[��");

    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);

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
<applet code="j373c.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j373c.class" width="300" height="100">
</applet>
<br><br>

<img src="j373c.jpg" width=300 height=200>
<br><br>

����{�^�����N���b�N����ƃt���[���͔�\���ɂȂ�

</body>
</html>
*/
