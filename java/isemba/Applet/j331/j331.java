// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j331.java 
 * created : Time-stamp: <09/06/30(��) 20:05:23 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j331.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j331.java >>
//
//  �A�v���b�g�i�R�j�FHTML�������̃p�����[�^�̎擾
//  
//�@�@HTML�������A<param>�^�O�ɋL�q�����p�����[�^���A�v���b�g�ɓn�����Ƃ��ł���B
//
//  ��<param>�^�O
//    <param name=****  value=####>
//      ****�́A�p�����[�^��
//      ####�́A�p�����[�^�̒l�B���l�܂��͕�����B
//
//  ��Applet�N���X�̃��\�b�h
//    public String getParameter(String name)
//      �@�\�Fname�Ŏw�肳�ꂽ�p�����[�^�̒l���擾���߂�l�Ƃ���B
//�@�@�@�@�@�@�l���Ȃ��Ƃ���null��߂��B
//            name :HTML�������ɋL�q�����p�����[�^��
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 

public class j331 extends Applet {

  String s;

  public void init() {      

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    s = this.getParameter("msg");
    if( s == null ) { s = "���b�Z�[�W������܂���"; }

  }

  public void paint(Graphics g) {
    g.drawString(s,20,50);
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
<applet code="j331.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j331.class" width="300" height="100">
</applet>
<br><br>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j331.class" width="300" height="100">
<param name=msg value="HTML��������̃��b�Z�[�W�ł�">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j331.class" width="300" height="100">
  <param name=msg value="HTML��������̃��b�Z�[�W�ł�">
</applet>

</body>
</html>
*/
