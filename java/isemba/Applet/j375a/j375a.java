// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j375a.java 
 * created : Time-stamp: <09/07/01(��) 10:10:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j375a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j375a.java >>
//
//  �`�����������i�U�j�F���i�i�_�C�A���O�A�z�u�j
//
//�@�@���[�U����̓��͂��󂯕t���邽�߂̈ꎞ�I�ȃE�B���h�E���_�C�A���O�Ƃ����B
//�@�@�_�C�A���O���쐬���\������B
//
//�@�����[�_���_�C�A���O�ƃ��[�h���X�_�C�A���O
//�@�@�_�C�A���O�ɂ́A���[�_���_�C�A���O�ƃ��[�h���X�_�C�A���O������B
//    ���[�_���_�C�A���O�ł́A�_�C�A���O�ւ̓��͂���������܂ő���
//�@�@�A�v���P�[�V�����̓��͂�j�~����B
//�@�@���[�h���X�_�C�A���O�ł́A�_�C�A���O�ւ̓��͂ƓƗ��ɑ��̃A�v���P�[�V����
//�@�@�͎��s�����B
//
//�@��java.awt.Dialog�N���X�̃R���X�g���N�^
//    Dialog(Frame f, boolean b)
//      �@�\�F�_�C�A���O���쐬����B�ŏ��͕\������Ȃ��B
//�@�@�@�@�@�@f�͂��̃_�C�A���O���Ăяo�����t���[���B
//�@�@�@�@�@�@true�̓��[�_���w��Afalse�̓��[�h���X�w��B
//    Dialog(Frame f, String s, boolean b)
//      �@�\�F�^�C�g��s�t���̃_�C�A���O���쐬����B�ŏ��͕\������Ȃ��B
//�@�@�@�@�@�@f�͂��̃_�C�A���O���Ăяo�����t���[���B
//�@�@�@�@�@�@������s�̓^�C�g���B
//�@�@�@�@�@�@true�̓��[�_���w��Afalse�̓��[�h���X�w��B
//
//    �E�_�C�A���O���쐬����ɂ́A�쐬����_�C�A���O���Ăяo���t���[���܂���
//�@�@�@���̃_�C�A���O���K�v�ł���B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j375a extends Applet {

  Dialog d;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // ���[�h���X�_�C�A���O�̍쐬�B
    Frame f = new Frame();
    d = new Dialog(f,"���[�h���X�_�C�A���O",false);    

    // �_�C�A���O�̑傫����ݒ�B
    d.setSize(300,200);

    // �_�C�A���O�̕\���ʒu��ݒ�B
    d.setLocation(0,0);

    // ���[�h���X�_�C�A���O��\���B
    d.setVisible(true);

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
<applet code="j375a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j375a.class" width="300" height="100">
</applet>
<br><br>

<img src="j375a.jpg" width=300 height=200>

</body>
</html>
*/
