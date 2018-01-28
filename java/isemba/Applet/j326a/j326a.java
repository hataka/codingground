// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j326a.java 
 * created : Time-stamp: <09/06/30(��) 17:41:09 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j326a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j326a.java >>
//
//  �A�v���b�g�i�Q�j�F���C�A�E�g�}�l�[�W���[�iGridBagLayout�A���p�j
//
//�@�@�T�̃{�^����z�u����B
//
//�@�@�����̃{�^���́A�w�肳�ꂽ�ʒu�֌W��ۑ����Ȃ���\�������B
//
//         �|�|�|�|�|�|�|�|�|�|
//         �b    �b�@�@�A�@�@�b
//         �| �@ �|�|�|�|�|�|�|
//         �b    �b �D �b�@�@�b
//         �|�|�|�|�|�|�| �B �|
//         �b    �C�@�@�b�@�@�b
//         �|�|�|�|�|�|�|�|�|�|
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j326a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F�����F�ɐݒ�B
    this.setBackground(Color.yellow);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����GridBagLayout�ɐݒ�B
    GridBagLayout gb = new GridBagLayout();
    this.setLayout(gb);

    // GridBagConstraints�I�u�W�F�N�g�̍쐬�B
    GridBagConstraints gbc = new GridBagConstraints();

    // ���x���̍쐬�B
    Label lab1 = new Label("���x���P");
    lab1.setBackground(Color.green); // ���x���P�̔w�i�F��΂ɐݒ�B
    Label lab2 = new Label("���x���Q");
    lab2.setBackground(Color.red); // ���x���Q�̔w�i�F��Ԃɐݒ�B
    Label lab3 = new Label("���x���R");
    lab3.setBackground(Color.cyan); // ���x���R�̔w�i�F�𐅐F�ɐݒ�B
    Label lab4 = new Label("���x���S");
    lab4.setBackground(Color.lightGray); // ���x���S�̔w�i�F���D�F�ɐݒ�B
    Label lab5 = new Label("���x���T");
    lab5.setBackground(Color.pink); // ���x���T�̔w�i�F�𓍐F�ɐݒ�B

    // ���x���P��(0,0)����(1,2)�ɔz�u����B
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 2;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ���x���Q��(1,0)����(3,1)�ɔz�u����B
    gbc.gridx = 1; gbc.gridy = 0;
    gbc.gridwidth = 2; gbc.gridheight = 1;
    gb.setConstraints(lab2,gbc);
    this.add(lab2);

    // ���x���R��(2,1)����(3,3)�ɔz�u����B
    gbc.gridx = 2; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 2;
    gb.setConstraints(lab3,gbc);
    this.add(lab3);

    // ���x���S(0,2)����(2,3)�ɔz�u����B
    gbc.gridx = 0; gbc.gridy = 2;
    gbc.gridwidth = 2; gbc.gridheight = 1;
    gb.setConstraints(lab4,gbc);
    this.add(lab4);

    // ���x���T��(1,1)����(2,2)�ɔz�u����B
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gb.setConstraints(lab5,gbc);
    this.add(lab5);

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
<applet code="j326a.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j326a.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j326a.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j326a.class" width="300" height="200">
</applet>

</body>
</html>
*/
