// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j328a.java 
 * created : Time-stamp: <09/06/30(��) 20:02:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j328a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j328a.java >>
//
//�@�@�A�v���b�g�i�Q�j�F���C�A�E�g�}�l�[�W���[�i��Έʒu�w��j
//
//�@�@���i��C�ӂ̑傫���ŁA�C�ӂ̈ʒu�ɔz�u����B
//�@�@���C�A�E�g�}�l�[�W�����g��Ȃ����Ƃ�錾����B
//
//�@�@�@�@setLayout(null)
//
//�@��Component�N���X�̃��\�b�h
//�@�@void setBounds(int x, int y, int width, int height)
//�@�@�@�@�\�F���i��z�u����B
//            x     �F�����W�B
//            y     �F�����W�B
//            width �F���B
//            height�F�����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*;

public class j328a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�Ƀ��C�A�E�g�}�l�[�W���̕s�g�p�ݒ�B
    this.setLayout(null);

    // ���x���̍쐬�B
    Label lab1 = new Label("���x���P");
    lab1.setBackground(Color.green);
    Label lab2 = new Label("���x���Q");
    lab2.setBackground(Color.red);
    Label lab3 = new Label("���x���R");
    lab3.setBackground(Color.cyan);

    // ���x���P�̔z�u�B
    lab1.setBounds(20,40,100,20);
    this.add(lab1);

    // ���x���Q�̔z�u�B
    lab2.setBounds(160,40,100,40);
    this.add(lab2);

    // ���x���R�̔z�u�B
    lab3.setBounds(60,100,160,60);
    this.add(lab3);

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
<applet code="j328a.class" width="160" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j328a.class" width="160" height="160">
</applet>
<br><br>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j328a.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j328a.class" width="300" height="200">
</applet>

</body>
</html>
*/
