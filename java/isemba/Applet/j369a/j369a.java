// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j369a.java 
 * created : Time-stamp: <09/07/01(��) 09:24:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j369a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j369a.java >>
//
//  �`�����������i�U�j�F���i�i�p�l���A�z�u�j
//
//�@�@�p�l�����쐬���\������B
//
//  ��java.awt.Panel�N���X
//    ���i���O���[�v�������āA�e�O���[�v���ƂɈقȂ郌�C�A�E�g�}�l�[�W���[��
//�@�@�w�肷��Ƃ��ȂǂɁAPanel�N���X���g���B
//    �f�t�H���g�̃��C�A�E�g�}�l�[�W���́AFlowLayout�ł���B 
//
//  ��Panel�N���X�̃R���X�g���N�^�@
//    Panel()
//      �@�\�F�f�t�H���g�̃��C�A�E�g�}�l�[�W���[���g���ăp�l��
//�@�@�@�@�@�@�i���i�𓋍ڂ���R���e�i�j���쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j369a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    this.setLayout(new BorderLayout(10,10));

    // �p�l��(p1)�̍쐬�B
    Panel p1 = new Panel();
    p1.setBackground(Color.red);

    // �p�l��(p2)�̍쐬�B
    Panel p2 = new Panel();
    p2.setBackground(Color.green);

    // �p�l��(p3)�̍쐬�B
    Panel p3 = new Panel();
    p3.setBackground(Color.yellow);

    // �p�l��(p1,p2,p3)���A�v���b�g���ɒǉ��B
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.SOUTH);
    this.add(p3,BorderLayout.CENTER);

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
<applet code="j369a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j369a.class" width="300" height="100">
</applet>

</body>
</html>
*/
