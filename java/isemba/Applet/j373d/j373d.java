// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373d.java 
 * created : Time-stamp: <09/07/01(��) 09:48:01 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373d.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A����{�^���A�C�x���g�����j
//
//�@�@�u�t���[���v�Ƃ����^�C�g�����̃E�B���h�E��\������B
//�@�@����{�^�����N���b�N����ƏI������B
//
//�@�@�����N���X���g���B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F Window�N���X
//�@�@�C�x���g�N���X�F WindowEvent�N���X
//�@�@�C�x���g���X�i�F WindowAdapter�N���X���g�������N���X
//�@�@
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373d extends Applet {

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

    // �C�x���g���X�i�̍쐬�Ɠo�^�B
    f.addWindowListener( new WindowAdapter() {
      // windowClosing���\�b�h���`����B
      public void windowClosing(WindowEvent e) {
        f.dispose();
        System.exit(0); // �v���O�������I�������郁�\�b�h�B
      }
    });

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
<applet code="j373d.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j373d.class" width="300" height="100">
</applet>
<br><br>

<img src="j373d.jpg" width=300 height=200>
<br><br>

����{�^�����N���b�N����ƃt���[���͔�\���ɂȂ�

</body>
</html>
*/
