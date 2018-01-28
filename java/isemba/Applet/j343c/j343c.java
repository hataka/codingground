// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j343c.java 
 * created : Time-stamp: <09/06/30(��) 20:55:05 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j343c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j343c.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�}�E�X����AMouseAdapter�N���X�A�����N���X�j
//
//�@������
//�@�@�}�E�X�{�^�����N���b�N����ƁA���̈ʒu��"Mouse Clicked"�ƈʒu���W��
//�@�@�\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F �}�E�X
//�@�@�C�x���g�N���X�F MouseEvent�N���X
//�@�@�C�x���g���X�i�F MouseAdapter�N���X���g�������N���X
//
//�@�������N���X
//    �����N���X�ɖ��O��t����͔̂ώG�ł���B�����ŁA���O��t�����ɓ����N���X��
//�@�@�g������@���l����ꂽ�B
//
//�@�@    new �e�N���X��(����) {
//          ����                
//        }                     
//
//�@�@�E�R���p�C�������ƁA�Q�̃N���X�t�@�C�����쐬�����B
//�@�@�@j343c.class, j343c$1.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class j343c extends Applet {

  String s = "";
  int Mx = 0, My = 0; // �}�E�X�̍ŏ��̈ʒu�B

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �C�x���g���X�i�𓽖��N���X�Ƃ��Ē�`�B
    MouseAdapter ma = new MouseAdapter() {
      // mouseClicked���\�b�h�̒�`�B
      public void mouseClicked(MouseEvent e) {
        Mx = e.getX(); // �N���b�N�����_��x���W���擾����B 
        My = e.getY(); // �N���b�N�����_��y���W���擾����B
        s = "Mouse Clicked"; 
        repaint(); // �ĕ`��B
      }
    };

    // �C�x���g���X�i�̓o�^�B
    this.addMouseListener(ma);

  }

  public void paint(Graphics g) {
    // �}�E�X�̃C�x���g����ƈʒu�̕\���B
    g.drawString(s,Mx,My);
    String pos = "(" + Mx + "," + My + ")";
    g.drawString(pos,Mx,My+12);
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
<applet code="j343c.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j343c.class" width="300" height="100">
</applet>

</body>
</html>
*/
