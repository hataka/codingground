// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j363a.java 
 * created : Time-stamp: <09/07/01(��) 08:26:07 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j363a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j363a.java >>
//
//  �`�����������i�U�j�F���i�i�`���C�X�A�z�u�j
//
//�@�@�u�ԁv�A�u�v�A�u���v�̍��ڂ����`���C�X��\������B
//
//�@��java.awt.Choice�N���X
//�@�@�����̍��ڂ���ЂƂI�ԂƂ��AChoice�N���X���g���B
//
//  ��Choice�N���X�̃��\�b�h
//    public void add(String s)                       
//      �@�\�F������s�����ڂɉ�����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j363a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // �`���C�X�̍쐬�B
    Choice cb = new Choice();

    // ���ڂ�ǉ��B
    cb.add("��");
    cb.add("��");
    cb.add("��");

    // �`���C�X���A�v���b�g���ɒǉ��B
    this.add(cb);

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
<applet code="j363a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j363a.class" width="300" height="100">
</applet>

</body>
</html>
*/
