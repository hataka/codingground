// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j366b.java 
 * created : Time-stamp: <09/07/01(��) 08:35:06 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j366b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j366b.java >>
//
//  �`�����������i�U�j�F���i�i���X�g�A�z�u�A�C�x���g�����j
//
//�@�@�����̍��ڂ��畡���̍��ڂ�I�����郊�X�g���쐬���\������B
//    ���X�g���̑I�����ꂽ���ڂ����x���ɕ\������B
//�@�@���ڂ��I������Ă��Ȃ��ꍇ�╡���̍��ڂ��I������Ă���ꍇ�Anull��Ԃ��B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FList�N���X
//�@�@�C�x���g�N���X�FItemEvent�N���X
//�@�@�C�x���g���X�i�FItemListener�C���^�[�t�F�[�X
//                    itemStateChanged���\�b�h
//
//  ��List�N���X�̃��\�b�h
//    public String getSelectedItem()
//      �@�\�F���ݑI������Ă��鍀�ڂ�Ԃ��B
//            ���ڂ��I������Ă��Ȃ��ꍇ�╡���̍��ڂ��I������Ă���ꍇ�Anull��Ԃ��B
//    public int getSelectedIndex()
//      �@�\�F���ݑI������Ă��鍀�ڂ̃C���f�b�N�X��Ԃ��B
//            ���ڂ��I������Ă��Ȃ��ꍇ�╡���̍��ڂ��I������Ă���ꍇ�A-1��Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*;

public class j366b extends Applet implements ItemListener {

  List list;
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

    // �\���p���x���̍쐬�B
    lab = new Label("�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@");
    lab.setBackground(Color.yellow);
    // ���x�����A�v���b�g���ɒǉ��B
    this.add(lab);

    // �C�x���g���X�i��o�^�B
    list.addItemListener(this);

  }

  // ItemListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void itemStateChanged(ItemEvent e) {
    if( e.getSource() == list ) {
      String s = list.getSelectedItem();
      int i = list.getSelectedIndex();
      lab.setText("�I�����ꂽ���ځF" + s + " �C���f�b�N�X�F" + i);
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
<applet code="j366b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j366b.class" width="300" height="160">
</applet>

</body>
</html>
*/
