// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j373a.java 
 * created : Time-stamp: <09/07/01(��) 09:46:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j373a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j373a.java >>
//
//  �`�����������i�U�j�F���i�i�t���[���A�z�u�j
//
//�@�@�t���[���ƌĂ΂��E�B���h�E(�^�C�g���Ȃ�)��\������B
//
//�@�@�t���[���ɂ����āA�ő剻�{�^���A�ŏ����{�^���̓N���b�N���ċ@�\���邪�A
//�@�@����{�^���͋@�\���Ȃ��B
//
//�@��java.awt.Frame�N���X
//    Frame�N���X�ŁA�^�C�g���ƃ{�[�_�����g�b�v���x���E�B���h�E���쐬����B 
//    java.lang.Object --> java.awt.Conponent --> java.awt.Container -->
//    java.awt.Window --> java.awt.Frame
//
//�@��Frame�N���X�̃R���X�g���N�^
//�@�@public Frame() throws HeadlessException
//�@�@�@�@�\�FFrame�I�u�W�F�N�g���쐬����B
//�@�@�@�@�@�@������Ԃŉ��ł͂Ȃ��B
//�@�@�@�@�@�@Frame�̃^�C�g���͋�ł���B
//    public Frame(String s) throws HeadlessException
//�@�@�@�@�\�F�^�C�g��s�̂���Frame�I�u�W�F�N�g���쐬����B
//�@�@�@�@�@�@������Ԃŉ��ł͂Ȃ��B
//
//�@��java.awt.Component�N���X�̃��\�b�h
//    public void setSize(int w, int h)
//�@�@�@�@�\�F���i�̃T�C�Y��w����э���h�ɐݒ肷��B
//�@�@public void setVisible(boolean b)
//�@�@�@�@�\�Fb��true�̏ꍇ�A�\���Afalse�̏ꍇ�A��\���ɂ���B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j373a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �t���[���̍쐬�B
    Frame f = new Frame();

    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);

    // �t���[���̕\���B
    f.setVisible(true);

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
<applet code="j373a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j373a.class" width="300" height="100">
</applet>
<br><br>

<img src="j373a.jpg" width=300 height=200>

</body>
</html>
*/
