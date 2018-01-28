// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j369b.java 
 * created : Time-stamp: <09/07/01(��) 09:25:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j369b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j369b.java >>
//
//  �`�����������i�U�j�F���i�i�p�l���A�z�u�j
//
//�@�@�p�l�����쐬���\������B�p�l�����ɕ��i���i�[����B
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
//    Panel(LayoutManager lm)
//      �@�\�F�w��̃��C�A�E�g�}�l�[�W���[lm���g���ăp�l��
//�@�@�@�@�@�@�i���i�𓋍ڂ���R���e�i�j���쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j369b extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    this.setLayout(new BorderLayout());

    // �p�l��(p1)�̍쐬�B
    Panel p1 = new Panel();

    // �p�l��(p1)�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    p1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

    // �{�^���̍쐬�B
    Button b1 = new Button("�{�^���P");
    Button b2 = new Button("�{�^���Q");

    // �{�^�����p�l��(p1)���ɒǉ��B
    p1.add(b1); 
    p1.add(b2);

    // �p�l��(p2)�̍쐬�B
    // �p�l��(p2)�̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    Panel p2 = new Panel(new GridLayout());

    // �{�^���̍쐬�B
    Button b3 = new Button("�{�^���R");
    Button b4 = new Button("�{�^���S");

    // �{�^�����p�l��(p2)���ɒǉ��B
    p2.add(b3); 
    p2.add(b4);

    // �p�l��(p1,p2)���A�v���b�g���ɒǉ��B
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.SOUTH);

    // �{�^�����A�v���b�g���ɒǉ��B
    this.add(new Button("�����{�^��"),BorderLayout.CENTER);

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
<applet code="j369b.class" width="300" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j369b.class" width="300" height="200">
</applet>

</body>
</html>
*/
