// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j364a.java 
 * created : Time-stamp: <09/07/01(��) 08:28:42 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j364a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j364a.java >>
//
//  �`�����������i�U�j�F���i�i�`�F�b�N�{�b�N�X�A�z�u�j
//
//�@�@�R�̍��ځi�ԁA�A���j�����`�F�b�N�{�b�N�X���쐬�E�\������B
//�@�@�����̍��ڂ�I���ł���B
//
//  ��java.awt.Checkbox�N���X
//    �������ڂ̒����畡���̑I��������Ƃ��ACheckbox�N���X���g���B
//
//  ��Checkbox�N���X�̃R���X�g���N�^
//    Checkbox(String s)                       
//      �@�\�F������s�����ڂɉ�����B�`�F�b�N����Ă��Ȃ���Ԃɐݒ肳���B
//    Checkbox(String s, boolean b)                       
//      �@�\�F������s�����ڂɉ�����Bb��true�̂Ƃ��`�F�b�N����Ă����ԁA
//�@�@�@�@�@�@false�̂Ƃ��`�F�b�N����Ă��Ȃ���Ԃɐݒ肳���B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j364a extends Applet {

  Checkbox c1,c2,c3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    this.setLayout(new GridLayout(1,3,10,10));

    // �`�F�b�N�{�b�N�X�{�^���̍쐬�B
    c1 = new Checkbox("��");
    c2 = new Checkbox("��",true);
    c3 = new Checkbox("��",false);

    // �`�F�b�N�{�b�N�X�{�^�����A�v���b�g���ɒǉ��B
    this.add(c1);
    this.add(c2);
    this.add(c3);

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
<applet code="j364a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j364a.class" width="300" height="100">
</applet>

</body>
</html>
*/
