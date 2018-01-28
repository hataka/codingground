// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j365a.java 
 * created : Time-stamp: <09/07/01(��) 08:31:09 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j365a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j365a.java >>
//
//  �`�����������i�U�j�F���i�i���W�I�{�^���A�z�u�j
//
//�@�@�R�̍��ځi�ԁA�A���j�������W�I�{�^�����쐬�E�\������B
//�@�@�����̍��ڂ̒�����P�������I�������B
//    �`�F�b�N�{�b�N�X���O���[�v�ɂ��A�P�����I���ł��Ȃ��悤�ɂ������̂�
//�@�@���W�I�{�^���Ƃ����B
//
//�@��java.awt.Checkbox�N���X�Ajava.awt.CheckboxGroup�N���X
//    �����̍��ڂ̒��ł����P������on�ƂȂ�Ƃ��ACheckbox�N���X�A
//�@�@CheckboxGroup�N���X���g���B
//
//  ��CheckboxGroup�N���X�̃R���X�g���N�^
//    CheckboxGroup()                       
//      �@�\�F�`�F�b�N�{�b�N�X�̃O���[�v�𐶐��B
//
//  ��Checkbox�N���X�̃R���X�g���N�^
//    Checkbox(String s, boolean b, CheckboxGroup cg)     
//      �@�\�F�`�F�b�N�{�b�N�X�O���[�v���Ƀ`�F�b�N�{�b�N�X������Ԃ�
//            �ݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j365a extends Applet {

  Checkbox c1,c2,c3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    this.setLayout(new GridLayout(1,3,10,10));

    // �`�F�b�N�{�b�N�X�O���[�v�̍쐬�B
    CheckboxGroup cg = new CheckboxGroup();

    // ���W�I�{�^���̍쐬�B
    c1 = new Checkbox("��",true,cg);
    c2 = new Checkbox("��",false,cg);
    c3 = new Checkbox("��",false,cg);

    // ���W�I�{�^�����A�v���b�g���ɒǉ��B
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
<applet code="j365a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j365a.class" width="300" height="100">
</applet>

</body>
</html>
*/
