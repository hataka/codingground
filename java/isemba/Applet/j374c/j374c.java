// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374c.java 
 * created : Time-stamp: <09/07/01(��) 10:06:47 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j374c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374c.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A�T�u���j���[�A�z�u�j
//
//�@�@���j���[�̒��Ƀ��j���[(�T�u���j���[)���쐬���\������B
//
//  ��Menu�N���X�̃��\�b�h
//    public void addSeparator()
//�@�@�@�@�\�F���݈ʒu�ɃZ�p���[�^��}������B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j374c extends Applet {

  Frame f;
  MenuItem mi1,mi2,mi3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t���[���̍쐬�B
    f = new Frame();
    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);
    // �t���[���̕\���B
    f.setVisible(true);

    // ���j���[�o�[mb�̍쐬�ƃt���[�����ɒǉ��B
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // ���j���[m�̍쐬�ƃ��j���[�o�[mb���ɒǉ��B
    Menu m = new Menu("���j���[");
    mb.add(m);

    // �T�u���j���[m1�̍쐬�ƃ��j���[m���ɒǉ��B
    Menu m1 = new Menu("�T�u���j���[�P");
    m.add(m1);

    // �Z�p���[�^�����j���[m�ɒǉ��B
    m.addSeparator(); 

    // �T�u���j���[m2�̍쐬�ƃ��j���[m���ɒǉ��B
    Menu m2 = new Menu("�T�u���j���[�Q");
    m.add(m2);

    // ���j���[���ڂ̍쐬�ƃ��j���[m2���ɒǉ��B
    mi1 = new MenuItem("��");
    mi2 = new MenuItem("��");
    mi3 = new MenuItem("��");
    m2.add(mi1);
    m2.add(mi2);
    m2.add(mi3);

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
<applet code="j374c.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j374c.class" width="300" height="100">
</applet>
<br><br>

<img src="j374c.jpg" width=300 height=200>

</body>
</html>
*/
