// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j375b.java 
 * created : Time-stamp: <09/07/01(��) 10:11:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j375b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j375b.java >>
//
//  �`�����������i�U�j�F���i�i�_�C�A���O�A�z�u�A�C�x���g�����j
//
//�@�@�_�C�A���O���쐬���\������B
//    ����{�^�����@�\�����邽�߁AWindowListener�C���^�[�t�F�[�X��
//�@�@windowClosing���\�b�h����������K�v������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F Window�N���X
//�@�@�C�x���g�N���X�F WindowEvent�N���X
//�@�@�C�x���g���X�i�F WindowAdapter�N���X���g�������N���X
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j375b extends Applet {

  Dialog d;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // ���[�h���X�_�C�A���O�̍쐬�B
    Frame f = new Frame();
    d = new Dialog(f,"���[�h���X�_�C�A���O",false);    

    // �_�C�A���O�̑傫����ݒ�B
    d.setSize(300,200);

    // �_�C�A���O�̕\���ʒu��ݒ�B
    d.setLocation(0,0);

    // ���[�h���X�_�C�A���O��\���B
    d.setVisible(true);

    // ����{�^���������ƃ_�C�A���O������B
    d.addWindowListener( new WindowAdapter() {
      // windowClosing���\�b�h���`����B
      public void windowClosing(WindowEvent e) {
        d.dispose();
        System.exit(0);
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
<applet code="j375b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j375b.class" width="300" height="100">
</applet>
<br><br>
����{�^�����N���b�N����Ɣ�\���ɂȂ�
<br><br>
<img src="j375b.jpg" width=300 height=200>

</body>
</html>
*/
