// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j370a.java 
 * created : Time-stamp: <09/07/01(��) 09:26:21 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j370a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j370a.java >>
//
//  �`�����������i�U�j�F���i�i�L�����o�X�A�z�u�j
//
//�@�@�L�����o�X���쐬���\������B
//    �L�����o�X��Canvas�N���X���p�����Ē�`����B
//
//�@��java.awt.Canvas�N���X
//    ��`�̕`��̈��񋟂���B
//�@�@�ECanvas�N���X�̃N���X�K�w
//�@�@�@java.lang.Object --> java.awt.Component --> java.awt.Canvas
//
//�@��Canvas�N���X�̃��\�b�h
//    public void paint(Graphics g)
//      �@�\�F�L�����o�X�ɕ`�悷��B
//
//�@��java.awt.Component�N���X�̃��\�b�h
//�@�@public void setSize(int width, int height)
//�@�@�@�@�\�F�T�C�Y���A��width�A����height �ɐݒ肷��B
//�@�@public void setLocation(int x, int y)
//�@�@�@�@�\�F���i�̍�����́A(x,y)�Ɏw�肷��B�P�ʂ̓s�N�Z���B 
// 
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

class Canvasj370a extends Canvas {

  // �L�����o�X�ւ̕`��B
  public void paint(Graphics g) {
    g.drawString("�L�����o�X",20,40);
 }

}
  
public class j370a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�Ƀ��C�A�E�g�}�l�[�W��(FlowLayout)��ݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �L�����o�X�̍쐬�B
    Canvasj370a c = new Canvasj370a();

    // �L�����o�X�̑傫����ݒ�B
    c.setSize(100,80);

    // �L�����o�X�̈ʒu��ݒ�B
    c.setLocation(10,10);

    // �L�����o�X�̔w�i�F�����F�ɐݒ�B
    c.setBackground(Color.yellow);

    // �L�����o�X���A�v���b�g���ɒǉ��B
    this.add(c);

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
<applet code="j370a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j370a.class" width="300" height="160">
</applet>

</body>
</html>
*/
