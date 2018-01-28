// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j361a.java 
 * created : Time-stamp: <09/07/01(��) 07:32:47 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j361a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j361a.java >>
//
//  �`�����������i�U�j�F���i�i���x���A�z�u�j
//
//�@�@�Z���������\������B
//
//�@��java.awt.Label�N���X
//�@�@�������C���[�W��\������Ƃ���Label�N���X���g���B
//
//�@��Label�N���X�̃R���X�g���N�^
//    public Label() throws HeadlessException
//    �@�@�\�F��̕������\������B��ŁA�����񂪐ݒ肳���ƁA
//�@�@�@�@�@�@���������͍������A���������ɒ������������B
//    public Label(String s) throws HeadlessException
//    �@�@�\�F������s��\������B
//            ���������͍������A���������ɒ������������B 
//    public Label(String s, int alignment) throws HeadlessException
//�@�@�@�@�\�F������s���A�z�ualignment�ŕ\������B
//�@�@�@�@�@�@�z�ualignment Label.LEFT�@  ������
//�@�@�@�@�@�@�@�@�@�@�@�@�@Label.RIGHT�@ �E����
//�@�@�@�@�@�@�@�@�@�@�@�@�@Label.CENTER  ��������
//
//�@��Label�N���X�̃��\�b�h
//    public void setText(String s)
//    �@�@�\�F�\�����镶����s��ݒ肷��B
//    public void setAlignment(int alignment)
//�@�@�@�@�\�F���x����z�ualignment�ɐݒ肷��B
//�@�@�@�@�@�@�l�́ALabel.LEFT�ALabel.RIGHT�ALabel.CENTER
// 
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j361a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    this.setLayout(new BorderLayout(10,10));

    // ���x���P�̍쐬�B
    Label lab1 = new Label();
    lab1.setText("���x���P");

    // ���x���Q�̍쐬�B
    Label lab2 = new Label("���x���Q",Label.CENTER);

    // ���x���R�̍쐬�B
    Label lab3 = new Label();
    lab3.setText("���x���R");
    lab3.setAlignment(Label.RIGHT);

    // ���x�����A�v���b�g�ɒǉ��B
    this.add(lab1,BorderLayout.NORTH);
    this.add(lab2,BorderLayout.CENTER);
    this.add(lab3,BorderLayout.SOUTH);

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
<applet code="j361a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j361a.class" width="300" height="100">
</applet>

</body>
</html>
*/
