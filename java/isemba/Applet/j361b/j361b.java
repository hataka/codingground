// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j361b.java 
 * created : Time-stamp: <09/07/01(��) 08:21:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j361b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j361b.java >>
//
//  �`�����������i�U�j�F���i�i���x���A�z�u�j
//
//�@�@�Z���������\������B
//
//�@��java.awt.Component�N���X�̃��\�b�h
//    public void setForeground(Color bg)
//      �@�\�F���i�̑O�i�Fbg��ݒ肷��B
//    public void setBackground(Color bg)
//      �@�\�F���i�̔w�i�Fbg��ݒ肷��B
//
//�@��java.awt.Color�N���X
//�@�@�F�̃f�[�^�⑀�삪��`����Ă���N���X�B
//
//�@�@�EColor�N���X�ɗp�ӂ���Ă���F
//�@�@�@magenta�F�Â����F�@�@ �@black�F���@�@white�F��     yellow�F��
//�@�@�@darkGray�F�Â��D�F�@�@�@gray�F�D�F   cyan�F��F�@  blue�F�@
//�@�@�@lightGray�F���邢�D�F �@red�F�ԁ@�@  orange�F��@�@green�F�΁@
//�@�@�@pink�F���邢���F        
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j361b extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    this.setLayout(new BorderLayout(10,10));

    // ���x���P�̍쐬�B
    Label lab1 = new Label();
    lab1.setText("���x���P");
    lab1.setForeground(Color.black);
    lab1.setBackground(Color.yellow);

    // ���x���Q�̍쐬�B
    Label lab2 = new Label("���x���Q");
    lab2.setForeground(Color.red);
    lab2.setBackground(Color.green);

    // ���x���R�̍쐬�B
    Label lab3 = new Label();
    lab3.setText("���x���R");
    lab3.setForeground(Color.blue);
    lab3.setBackground(Color.magenta);

    // ���x�����A�v���b�g���ɒǉ��B
    this.add(lab1,BorderLayout.WEST);
    this.add(lab2,BorderLayout.CENTER);
    this.add(lab3,BorderLayout.EAST);

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
<applet code="j361b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j361b.class" width="300" height="100">
</applet>

</body>
</html>
*/
