// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342d.java 
 * created : Time-stamp: <09/06/30(��) 20:48:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342d.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�{�^������A�O���N���X�j
//
//�@������
//�@�@�ԂƏ����ꂽ�{�^�����N���b�N����Ɣw�i�F���ԂɂȂ�B
//�@�@�΂Ə����ꂽ�{�^�����N���b�N����Ɣw�i�F���΂ɂȂ�B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F Button�N���X
//�@�@�C�x���g�N���X�F ActionEvent�N���X
//�@�@�C�x���g���X�i�F ActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@ actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342d extends Applet {

  Button b1,b2; 

  public void init() {

    // �{�^���̍쐬�B
    b1 = new Button("��");
    b2 = new Button("��");

    // �{�^�����A�v���b�g�ɒǉ��B
    this.add(b1);
    this.add(b2);

    // �C�x���g���X�i�̓o�^�B
    EventListener342d el = new EventListener342d(this);
    b1.addActionListener(el);
    b2.addActionListener(el);

  }

}

class EventListener342d implements ActionListener {

  j342d obj;

  public EventListener342d(j342d obj) { // �R���X�g���N�^�B*/
    this.obj = obj;
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    // �{�^�����N���b�N���ꂽ�Ƃ��A���s�����B
    if( e.getSource() == obj.b1 ) { obj.setBackground(Color.red); } 
    if( e.getSource() == obj.b2 ) { obj.setBackground(Color.green); } 

  }

}
/*
</pre>

<pre>
<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j342d.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j342d.class" width="300" height="100">
</applet>

</body>
</html>
*/
