// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373f.java 
 * created : Time-stamp: <09/07/01(��) 09:49:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373f.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373f.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A���p�j
//
//�@�@�A�v���b�g���́u�\���{�^���v�Ɓu��\���{�^���v���N���b�N���邱�Ƃ�
//�@�@�t���[���̕\���Ɣ�\����؂�ւ���B
//
//�@�@WindowAdapter�N���X�𓽖��N���X�Ƃ��Ďg���B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373f extends Applet implements ActionListener {

  Frame f;
  Button b1,b2;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �{�^���̍쐬�ƃA�v���b�g���֒ǉ��B
    b1 = new Button("�\��");
    b2 = new Button("��\��");
    this.add(b1);
    this.add(b2);

    // �t���[���̍쐬�B
    f = new Frame("�t���[��");
    f.setBackground(Color.green);

    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);

    // �t���[���̕\���B
    f.setVisible(false);

    // �C�x���g���X�i�̍쐬�Ɠo�^�B
    f.addWindowListener( new WindowAdapter() {
      // windowClosing���\�b�h���`����B
      public void windowClosing(WindowEvent e) {
        f.dispose();
        System.exit(0); // �v���O�������I�������郁�\�b�h�B
      }
    });

    // �C�x���g���X�i�[�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == b1 ) {
      f.setVisible(true);
    }
    if( ae.getSource() == b2 ) {
      f.setVisible(false);
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
<applet code="j373f.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j373f.class" width="300" height="100">
</applet>
<br><br>
�\���{�^�����N���b�N����ƕ\�������
<br><br>
<img src="j373f.jpg" width=300 height=200>
<br><br>
��\���{�^�����N���b�N����Ɣ�\���ɂȂ�
</body>
</html>
*/
