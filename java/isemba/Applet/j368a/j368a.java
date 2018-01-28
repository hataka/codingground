// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j368a.java 
 * created : Time-stamp: <09/07/01(��) 08:41:04 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j368a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j368a.java >>
//
//  �`�����������i�U�j�F���i�i�e�L�X�g�G���A�A�z�u�j
//
//�@�@�Q�̃e�L�X�g�G���A�����B
//�@�@�e�L�X�g�G���A���ł͕ҏW���ł���B
//
//�@�@�e�L�X�g�G���A�ɕ\��������Ȃ��e�L�X�g�����͂����Ǝ����I�ɃX�N���[���o�[
//�@�@�������B�e�L�X�g�G���A�ɂ��ׂẴe�L�X�g���\���ł���悤�ɂȂ�ƃX�N���[
//�@�@���o�[�͏�����B
//�@�@���̕��i�i�{�^���Ȃǁj�Ƒg�ݍ��킹�Ďg���B
//
//  ��java.awt.TextArea�N���X
//    ���[�U����̓��́i������j�p�̗��i�����s������j�ŁA�ҏW����Ƃ��ATextArea
//�@�@�N���X���g���B
//    �����X�N���[���o�[�A�����X�N���[���o�[��ݒ�ł���B
//
//  ��TextArea�N���X�̃R���X�g���N�^
//    TextArea(int r, int c)                       
//      �@�\�Fr�s�Ac��̃e�L�X�g�G���A���쐬����B
//    TextArea(String s, int r, int c)                       
//      �@�\�F������s��\������r�sc��̃e�L�X�g�G���A���쐬����B
//    TextArea(String s, int r, int c, int scr)                       
//      �@�\�F������s��\������r�sc��̃e�L�X�g�G���A���쐬����B
//            static int SCROLLBARS_BOTH  �����E�����X�N���[���o�[��ݒ�
//            static int SCROLLBARS_HORIZONTAL_ONLY  �����X�N���[���o�[��ݒ�
//            static int SCROLLBARS_VERTICAL_ONLY  �����X�N���[���o�[��ݒ�
//            static int SCROLLBARS_NONE  �X�N���[���o�[��ݒ肵�Ȃ�
//
//  �@�ETextArea�N���X�̃N���X�K�w
//�@�@�@java.lang.Object --> java.awt.Component --> java.awt.TextComponent -->
//    �@java.awt.TextArea
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j368a extends Applet {

  TextArea ta1,ta2; 

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �e�L�X�g�G���A�̍쐬�B
    ta1 = new TextArea("����ɂ���",3,30,TextArea.SCROLLBARS_BOTH);
    ta2 = new TextArea(3,30);

    // �e�L�X�g�G���A���A�v���b�g���ɒǉ��B
    this.add(ta1);
    this.add(ta2);

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
<applet code="j368a.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j368a.class" width="300" height="200">
</applet>

</body>
</html>
*/
