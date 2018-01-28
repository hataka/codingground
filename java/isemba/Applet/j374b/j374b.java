// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374b.java 
 * created : Time-stamp: <09/07/01(��) 10:05:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j374b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374b.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A���j���[�A�C�x���g�����j
//
//�@�@���j���[�̐Ԃ�I������Ɣw�i�F���ԂɂȂ�B
//�@�@���j���[�̉���I������Ɣw�i�F�����ɂȂ�B
//�@�@���j���[�̐�I������Ɣw�i�F���ɂȂ�B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F MenuItem�N���X
//�@�@�C�x���g�N���X�F ActionEvent�N���X
//�@�@�C�x���g���X�i�F ActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@ actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j374b extends Applet implements ActionListener {

  Frame f;
  MenuItem mi1,mi2,mi3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t���[���̍쐬�B
    f = new Frame();
    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);
    // �t���[���̕\���B
    f.setVisible(true);

    // ���j���[�o�[mb�̍쐬�ƃt���[�����ɒǉ��B
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // ���j���[m�̍쐬�ƃ��j���[�o�[���ɒǉ��B
    Menu m = new Menu("���j���[");
    mb.add(m);

    // ���j���[���ڂ̍쐬�ƃ��j���[���ɒǉ��B
    mi1 = new MenuItem("��");
    mi2 = new MenuItem("��");
    mi3 = new MenuItem("��");
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);

    // �C�x���g���X�i�̓o�^�B
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);

  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == mi1 ) { f.setBackground(Color.red); }
    if(e.getSource() == mi2 ) { f.setBackground(Color.yellow); }
    if(e.getSource() == mi3 ) { f.setBackground(Color.blue); }
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
<applet code="j374b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j374b.class" width="300" height="100">
</applet>
<br><br>

<img src="j374b.jpg" width=300 height=200>

</body>
</html>
*/
