// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j326g.java 
 * created : Time-stamp: <09/06/30(��) 19:56:32 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j326g.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j326g.java >>
//
//  �A�v���b�g�i�Q�j�F���C�A�E�g�}�l�[�W���[�iGridBagLayout�A���p�j
//
//�@�@�S�̃��x�������}�̂悤�ɔz�u����B
//
//         �|�|�|�|�|�|�|�|�|�|�|
//         �b�@�@�@�@�b�@�@�@�@�b
//         �|�@�@�@�@�|�|�|�|�|�|
//         �b  �@�@  �b�@  �@�@�b
//         �|�@�@�@�@�|�|�|�|�|�|
//         �b    �@�@�b    �@�@�b
//         �|�|�|�|�|�|�|�|�|�|�|
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j326g extends Applet {

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
    lab1.setBackground(Color.green);
    Label lab2 = new Label("���x���Q");
    lab2.setBackground(Color.red);
    Label lab3 = new Label("���x���R");
    lab3.setBackground(Color.cyan);
    Label lab4 = new Label("���x���S");
    lab4.setBackground(Color.lightGray);

    // ���x���P�̔z�u�B
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 3;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(lab1,gbc);
    this.add(lab1);

    // ���x���Q�̔z�u�B
    gbc.gridx = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gb.setConstraints(lab2,gbc);
    this.add(lab2);

    // ���x���R�̔z�u�B
    gbc.gridy = GridBagConstraints.RELATIVE;
    gb.setConstraints(lab3,gbc);
    this.add(lab3);

    // ���x���S�̔z�u�B
    gb.setConstraints(lab4,gbc);
    this.add(lab4);

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
<applet code="j326g.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j326g.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j326g.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j326g.class" width="300" height="200">
</applet>

</body>
</html>
*/
