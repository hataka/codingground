// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j371a.java 
 * created : Time-stamp: <09/07/01(��) 09:42:18 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j371a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j371a.java >>
//
//  �`�����������i�U�j�F���i�i�X�N���[���o�[�A�z�u�j
//
//    �X�N���[���o�[��\������B
//
//�@��java.awt.Scrollbar�N���X
//
//  ��Scrollbar�N���X�̃R���X�g���N�^
//    public Scrollbar(int d, int v, int w, int min, int max) throws HeadlessException
//�@�@�@�@�\�F�����A�����l�A���ʁA�ŏ��l�A�ő�l�����X�N���[���o�[���쐬����B 
//      �@�@�@�X���C�_�[���ړ����Đ��l��ω�������B
//�@�@�@�@�@�@d�͕����������B���������FScrollbar.HORIZONTAL�@���������FScrollbar.VERTICAL
//�@�@�@�@�@�@v�͏����l�Aw�̓X���C�_�[�̕��Amin�͍��[�i�܂��͏�[�j�̐��l�A
//�@�@�@�@�@�@max�͉E�[�i�܂��͉��[�j�̐��l�B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
  
public class j371a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    this.setLayout(new BorderLayout(10,10));

    // �X�N���[���o�[�̍쐬�B
    Scrollbar sbh = new Scrollbar(Scrollbar.HORIZONTAL,150,10,0,310);
    Scrollbar sbv = new Scrollbar(Scrollbar.VERTICAL,50,10,0,110);

    // �X�N���[���o�[���A�v���b�g���ɒǉ��B
    this.add(sbh,BorderLayout.NORTH);
    this.add(sbv,BorderLayout.EAST);

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
<applet code="j371a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j371a.class" width="300" height="160">
</applet>

</body>
</html>
*/
