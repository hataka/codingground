// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342b.java 
 * created : Time-stamp: <09/06/30(��) 20:44:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342b.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�{�^������A�����N���X�j
//
//�@������
//�@�@�ԂƏ����ꂽ�{�^�����N���b�N����Ɣw�i�F���ԂɂȂ�B
//�@�@�΂Ə����ꂽ�{�^�����N���b�N����Ɣw�i�F���΂ɂȂ�B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F Button�N���X
//�@�@�C�x���g�N���X�F ActionEvent�N���X
//�@�@�C�x���g���X�i�F EventListener�N���X
//
//�@�������N���X
//�@�@�E�C�x���g���X�i������N���X�Ƃ��Ē�`����B
//�@�@�@�N���X�̒��ɃN���X���`�ł���i���Ȃ킿�A�N���X�����q�ɂł���j�B
//�@�@�E�����N���X�̃��\�b�h����O���̃N���X�̕ϐ��⃁�\�b�h�ɃA�N�Z�X�ł���B
//  �@�E�R���p�C������ƂQ�̃N���X�t�@�C�������������B
//�@�@�@j342b.class, j342b$EventListener.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342b extends Applet {

  Button b1,b2; 

  public void init() {

    // �{�^���̍쐬�B
    b1 = new Button("��");
    b2 = new Button("��");

    // �{�^�����A�v���b�g�ɒǉ��B
    this.add(b1);
    this.add(b2);

    // �C�x���g���X�i�̓o�^
    EventListener el = new EventListener();
    b1.addActionListener(el); 
    b2.addActionListener(el); 

  }

  // �C�x���g���X�i������N���X�Ƃ��Ē�`�B
  class EventListener implements ActionListener {

    // actionPerformed���\�b�h�̒�`�B
    public void actionPerformed(ActionEvent e) {
      // �{�^�����N���b�N���ꂽ�Ƃ��A���s�����B
      if( e.getSource() == b1 ) { setBackground(Color.red); } 
      if( e.getSource() == b2 ) { setBackground(Color.green); } 
    }

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
<applet code="j342b.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j342b.class" width="300" height="100">
</applet>

</body>
</html>
*/
