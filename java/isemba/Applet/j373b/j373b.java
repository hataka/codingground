// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373b.java 
 * created : Time-stamp: <09/07/01(��) 09:46:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373b.java >>
//
//  �`�����������i�U�j�F�f�t�h���i�i�t���[���A����{�^���A�C�x���g�����j
//
//�@�@�u�t���[���v�Ƃ����^�C�g�����̃E�B���h�E��\������B
//�@�@����{�^�����@�\������ɂ́AWindowListener�C���^�[�t�F�[�X��
//�@�@windowClosing���\�b�h����������K�v������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F Window�N���X
//�@�@�C�x���g�N���X�F WindowEvent�N���X
//�@�@�C�x���g���X�i�F WindowListener�C���^�[�t�F�[�X
//                     windowClosing���\�b�h     
//
//�@��WindowListener�C���^�[�t�F�[�X�̃��\�b�h
//    WindowListener�C���^�[�t�F�[�X�ɂ́A7�̃��\�b�h������B
//
//�@�@(1)windowActivated    �E�B���h�E���A�N�e�B�u�E�B���h�E�ɐݒ肳�ꂽ�Ƃ��A
//�@�@�@�@�@�@�@�@�@�@�@�@  �Ăяo�����B
//    (2)windowClosed       �E�B���h�E������ꂽ�Ƃ��A�Ăяo�����B
//    (3)windowClosing      ����{�^�����N���b�N�����Ƃ��A�Ăяo�����B
//�@�@(4)windowDeactivated  �E�B���h�E���A�N�e�B�u�E�B���h�E�łȂ��Ȃ����Ƃ��A
//�@�@�@�@�@�@�@�@�@�@�@  �@�Ăяo�����B
//    (5)windowIconified    �ŏ����{�^�����N���b�N���āA�ʏ�̏�Ԃ���
//                          �ŏ��̏�ԂɕύX���ꂽ�Ƃ��Ăяo�����B
//    (6)windowDeiconified  �ŏ����{�^�����N���b�N���āA�ŏ��̏�Ԃ���
//�@�@�@�@�@�@�@�@�@�@�@�@�@�ʏ�̏�ԂɕύX���ꂽ�Ƃ��Ăяo�����B
//�@�@(7)windowOpened       �E�B���h�E�����߂ĉ���ԂɂȂ����Ƃ��Ăяo�����B
//
//�@��java.awt.Window�N���X�̃��\�b�h
//�@�@public void dispose()
//�@�@�@�@�\�F���̃E�B���h�E�̃��\�[�X���j������A�����̏���郁������
//�@�@�@�@�@�@OS�ɕԂ����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;

public class j373b extends Applet implements WindowListener {

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

    // �C�x���g���X�i�̓o�^�B
    f.addWindowListener(this);

  }

  // WindowListener�C���^�[�t�F�[�X���`����B
  // windowClosing���\�b�h���`����B
  public void windowClosing(WindowEvent we) {
    f.dispose();
    System.exit(0); // �v���O�������I�������郁�\�b�h�B
  }
  // ���̃��\�b�h���ׂĂ��󃁃\�b�h�Ƃ��Ē�`����K�v������B
  public void windowActivated(WindowEvent e) { }
  public void windowClosed(WindowEvent e) { }
  public void windowDeactivated(WindowEvent e) { }
  public void windowIconified(WindowEvent e) { }
  public void windowDeiconified(WindowEvent e) { }
  public void windowOpened(WindowEvent e) { }

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
<applet code="j373b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j373b.class" width="300" height="100">
</applet>
<br><br>

<img src="j373b.jpg" width=300 height=200>
<br><br>

����{�^�����N���b�N����ƃt���[���͔�\���ɂȂ�

</body>
</html>
*/
