// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j332.java 
 * created : Time-stamp: <09/06/30(��) 20:08:15 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j332.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j332.java >>
//
//  �A�v���b�g�i�R�j�F�A�v���b�g�̃T�C�Y���擾
//  
//�@�@�A�v���b�g�̃T�C�Y���擾���T�C�Y�ɉ����Đ}�`��ω�������B
//
//  ��Component�N���X�̃��\�b�h
//    public Dimension getSize()
//      �@�\�F���i(�A�v���b�g�����i)�̃T�C�Y��Dimension�N���X�̃I�u�W�F�N�g
//�@�@�@�@�@�@�Ƃ��Ď擾�B
//�@�@�@�@�@�@Dimension�N���X�͕�(width)�ƍ���(height)�̂Q�̕ϐ�����Ȃ�B
//�@�@�@�@�@�@���ꂼ�ꐮ���̒l�����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.Dimension; 

public class j332 extends Applet {

  public void init() {      

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

  }

  public void paint(Graphics g) {
    // �A�v���b�g�̃T�C�Y���擾�B
    Dimension d = this.getSize();
    int x = 0;
    int y = d.height/2;
    int size = d.width/10;
    Font f = new Font("Serif",Font.BOLD,size);
    g.setFont(f);
    g.drawString("�����F" + d.height + "�@���F" + d.width,x,y);
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
<applet code="j332.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j332.class" width="300" height="200">
</applet>
<br><br>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j332.class" width="200" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j332.class" width="200" height="100">
</applet>

</body>
</html>
*/
