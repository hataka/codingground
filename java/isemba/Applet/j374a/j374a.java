// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374a.java 
 * created : Time-stamp: <09/06/30(��) 10:49:23 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j374a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374a.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A���j���[�A�z�u�j
//
//�@�@�t���[�����Ƀ��j���[���쐬���\������B
//
//�@���t���[���A���j���[�o�[�A���j���[�A���j���[���ڂ̊֌W
//
//       �t���[���́A���j���[�o�[���܂ށB
//       ���j���[�o�[�́A���j���[���܂ށB
//       ���j���[�́A���j���[���ڂ��܂ށB
//
//  ��Frame�N���X�̃��\�b�h
//    public void setMenuBar(MenuBar mb)
//�@�@�@�@�\�F���j���[�o�[mb���t���[�����ɐݒ肷��B
//
//  ��MenuBar�N���X�AMenu�N���X�AMenuItem�N���X
//�@�@�t���[�����Ƀ��j���[�o�[��ǉ�����̂ɁAMenuBar�N���X���g���B
//�@�@���j���[�o�[���Ƀ��j���[��ǉ�����̂ɁAMenu�N���X���g���B
//�@�@���j���[���Ƀ��j���[���ڂ�ǉ�����̂ɁAMenuItem�N���X���g���B
//
//  ��MenuBar�N���X�̃R���X�g���N�^
//    MenuBar()
//�@�@�@�@�\�F���j���[�o�[���쐬����B
//
//  ��MenuBar�N���X�̃��\�b�h
//�@�@public Menu add(Menu m)
//      �@�\�F���j���[�o�[�Ƀ��j���[m��ǉ��B
//
//  ��Menu�N���X�̃R���X�g���N�^
//�@�@Menu(String s)
//      �@�\�F���j���[s���쐬����B
//
//  ��Menu�N���X�̃��\�b�h
//�@�@public MenuItem add(MenuItem m)
//      �@�\�F���j���[����m�����j���[�ɒǉ��B
//�@�@public void add(String s)
//      �@�\�F������s�����j���[�ɒǉ��B
//
//  ��MenuItem�N���X�̃R���X�g���N�^
//�@�@MenuItem(String s)
//      �@�\�F���j���[����s���쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j374a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t���[���̍쐬�B
    Frame f = new Frame("�t���[��");
    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);
    // �t���[���̕\���B
    f.setVisible(true);

    // ���j���[�o�[mb�̍쐬�ƃt���[�����ɒǉ��B
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // ���j���[m�̍쐬�ƃ��j���[�o�[���ɒǉ��B�B
    Menu m = new Menu("���j���[");
    mb.add(m);

    // ���j���[���ڂ̍쐬�ƃ��j���[���ɒǉ��B
    MenuItem mi1 = new MenuItem("��");
    MenuItem mi2 = new MenuItem("��");
    MenuItem mi3 = new MenuItem("��");
    m.add(mi1);
    m.add(mi2);
    m.add(mi3);

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
<applet code="j374a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j374a.class" width="300" height="100">
</applet>
<br><br>

<img src="j374a.jpg" width=300 height=200>

</body>
</html>
*/
