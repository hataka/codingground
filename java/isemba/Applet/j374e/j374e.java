// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j374e.java 
 * created : Time-stamp: <09/07/01(��) 10:09:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j374e.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j374e.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A�`�F�b�N�t�����j���[�A�z�u�j
//
//�@�@���j���[���Ƀ`�F�b�N�t�����j���[���ڂ��쐬����B
//    �`�F�b�N�t�����ڂ��N���b�N����ƁA�N���b�N���邽�тɃ`�F�b�N��������
//�@�@�������肷��B
//
//�@���t���[���A���j���[�o�[�A���j���[�A�`�F�b�N�t�����j���[���ڂ̊֌W
//
//       �t���[���́A���j���[�o�[���܂ށB
//       ���j���[�o�[�́A���j���[���܂ށB
//       ���j���[�́A�`�F�b�N�t�����j���[���ڂ��܂ށB
//
//  ��java.awt.CheckboxMenuItem�N���X
//�@�@���j���[���Ƀ`�F�b�N�t�����j���[���ڂ�ǉ�����̂ɁA���̃N���X���g���B
//
//  ��CheckboxMenuItem�N���X�̃R���X�g���N�^
//    public CheckboxMenuItem(String s) throws HeadlessException
//�@�@�@�@�\�F������s�̃`�F�b�N�{�b�N�X���j���[���ڂ��쐬����B
//�@�@�@�@�@�@���ڂ̏�����Ԃ́A�`�F�b�N�Ȃ��ɐݒ肳���B
//    public CheckboxMenuItem(String s, boolean b) throws HeadlessException
//�@�@�@�@�\�F������s�̃`�F�b�N�{�b�N�X���j���[���ڂ��쐬����B
//�@�@�@�@�@�@���ڂ̏�����Ԃ́Ab��true�Ń`�F�b�N����Afalse�Ń`�F�b�N�Ȃ���
//�@�@�@�@�@�@�ݒ肳���B
//
//  ��java.awt.MenuItem�N���X
//    public void setEnabled(boolean b)
//�@�@�@�@�\�Fb��true�Ń��j���[���ڂ��I���Afalse�őI��s�ɂ���B
//            �I��s�ɂȂ�ƁA���j���[���ڂ͒W�F�\���ɂȂ�B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j374e extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t���[���̍쐬�B
    Frame f = new Frame();
    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);
    // �t���[���̕\���B
    f.setVisible(true);

    // ���j���[�o�[mb�̍쐬�ƃt���[�����ɒǉ��B
    MenuBar mb = new MenuBar();
    f.setMenuBar(mb);

    // ���j���[m�̍쐬�ƃ��j���[�o�[���ɒǉ��B
    Menu m = new Menu("���j���[");
    mb.add(m);

    // ���j���[���ڂ̍쐬�ƃ��j���[���ɒǉ��B
    CheckboxMenuItem mi1 = new CheckboxMenuItem("��");
    CheckboxMenuItem mi2 = new CheckboxMenuItem("��");
    mi2.setEnabled(false);
    CheckboxMenuItem mi3 = new CheckboxMenuItem("��",true);
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
<applet code="j374e.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j374e.class" width="300" height="100">
</applet>
<br><br>

<img src="j374e.jpg" width=300 height=200>

</body>
</html>
*/
