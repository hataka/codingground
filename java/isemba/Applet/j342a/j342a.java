// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342a.java 
 * created : Time-stamp: <09/06/30(��) 20:41:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342a.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�{�^������j
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
//  ��java.awt.event.ActionEvent�N���X
//    �@java.lang.Object --> java.util.EventObject --> java.awt.AWTEvent 
//    �@--> java.awt.event.ActionEvent
//
//  ��java.awt.Button�N���X
//    �@java.lang.Object --> java.awt.Component --> java.awt.Button
//
//  ��Button�N���X�̃R���X�g���N�^
//    public Button(String s) throws HeadlessException
//      �@�\�F������s�����{�^�����쐬����B
//
//�@��Container�N���X�̃��\�b�h
//    public Component add(Component c)  
//      �@�\�F���ic(�{�^����e�L�X�g�t�B�[���h�Ȃ�)���R���e�i(���i��ێ�����)
//�@�@�@�@�@�@���ɒǉ�����B
//�@�@�@�@�@�@Container�N���X�̓R���|�[�l���g��ێ��ł���B�A�v���b�g�́A
//�@�@�@�@�@�@Container�N���X����h�����Ă���R���|�[�l���g��ێ��ł���B
//
//�@��java.util.EventObject�N���X�̃��\�b�h
//�@�@public Object getSource()
//�@�@�@�@�\�F�C�x���g�����������I�u�W�F�N�g���擾����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342a extends Applet implements ActionListener {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Button b1,b2; 

  public void init() {

    // �{�^���̍쐬�B
    b1 = new Button("��");
    b2 = new Button("��");

    // �{�^�����A�v���b�g�ɒǉ��B
    this.add(b1);
    this.add(b2);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {

    // �{�^�����N���b�N���ꂽ�Ƃ��A���s�����B
    if( e.getSource() == b1 ) { this.setBackground(Color.red); } 
    if( e.getSource() == b2 ) { this.setBackground(Color.green); } 

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
<applet code="j342a.class" width="640" height="480">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j342a.class" width="640" height="480">
</applet>

</body>
</html>
*/
