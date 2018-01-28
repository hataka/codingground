// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j366c.java 
 * created : Time-stamp: <09/07/01(��) 08:35:56 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j366c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j366c.java >>
//
//  �`�����������i�U�j�F���i�i���X�g�A�z�u�A�C�x���g�����j
//
//�@�@�����̍��ڂ��畡���̍��ڂ�I�����郊�X�g���쐬���\������B
//    ���X�g���畡�����ڂ�I�����A�I���{�^�����N���b�N����ƁA�I�����ꂽ���ڂ�
//�@�@���x���ɕ\�������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FButton�N���X
//�@�@�C�x���g�N���X�FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//  �@�@�@�@�@�@  �@�@actionPerformed���\�b�h
//
//  ��List�N���X�̃��\�b�h
//    public String a[] getSelectedItems()
//      �@�\�F���ݑI������Ă��鍀�ڂ�z��a�Ƃ��ĕԂ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*;

public class j366c extends Applet implements ActionListener {

  List list;
  Button b;
  Label lab;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ���X�g�̍쐬�B
    list = new List(3,true);      
    list.add("���ڂP"); 
    list.add("���ڂQ");
    list.add("���ڂS"); 
    list.add("���ڂR",2);
    list.add("���ڂT");

    // ���X�g���A�v���b�g���ɒǉ��B
    this.add(list);

    // �{�^���̍쐬
    b = new Button("�I��"); 

    // �{�^�����A�v���b�g���ɒǉ��B
    this.add(b);

    // �\���p���x���̍쐬�B
    lab = new Label("�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@");
    lab.setBackground(Color.yellow);
    // ���x�����A�v���b�g���ɒǉ��B
    this.add(lab);

    // �C�x���g���X�i��o�^�B
    b.addActionListener(this);

  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == b ) {
      String s[] = list.getSelectedItems();
      String t = "";
      for( int i=0; i<s.length; i++ ) {
        t = t + s[i];
      }
      lab.setText(t);
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
<applet code="j366c.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j366c.class" width="300" height="160">
</applet>

</body>
</html>
*/
