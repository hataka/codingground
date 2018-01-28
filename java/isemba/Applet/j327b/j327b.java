// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j327b.java 
 * created : Time-stamp: <09/06/30(��) 20:00:57 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j327b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j327b.java >>
//
//�@�A�v���b�g�i�Q�j�F���C�A�E�g�}�l�[�W���[�iBorderLayout�j
//
//�@�@BorderLayout���g���ƁA���i�𓌐���k�E�����̈ʒu�ɔz�u�ł���B
//
//�@�@�@�@North�i�E�C���h�E�̏㕔���Ӗ�����j
//�@�@�@�@South�i�E�C���h�E�̉������Ӗ�����j
//�@�@�@�@West�i�E�C���h�E�̍������Ӗ�����j
//�@�@�@�@East�i�E�C���h�E�̉E�����Ӗ�����j
//�@�@�@�@Center�i�E�C���h�E�̒��������Ӗ�����j
//
//�@�@�A�v���b�g�̑傫���ɉ����āA�A�v���b�g�Ɋi�[���ꂽ���i�̑傫�����ς��B
//
//
//�@��BorderLayout�N���X
//    java.awt.BorderLayout
//
//�@��BorderLayout�N���X�̃R���X�g���N�^
//�@�@public BorderLayout()
//�@�@�@�@�\�F���i�ԂɊԊu��݂����A��A���A���A�E�A�����ɔz�u����B
//�@�@public BorderLayout(int h, int v)
//�@�@�@�@�\�F���i���A��A���A���A�E�A�����ɔz�u����B
//�@�@�@�@�@�@�e���i�̊Ԋu�͋ϓ��B
//�@�@�@�@�@�@���i���͍ő�T�܂ŁB
//            h�͕��i�Ԃ̐����Ԋu�Av�͕��i�Ԃ̐����Ԋu�B
//
//�@��Container�N���X
//    java.awt.Container
//
//�@��Container�N���X�̃��\�b�h      
//    public Component add(Component comp, int index)
//      �@�\�F���icomp�����̃R���e�i�̎w�肳�ꂽ�ʒu�ɒǉ�����B
//            �ʒu NORTH,SOUTH,WEST,EAST,CENTER
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j327b extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    this.setLayout(new BorderLayout(10,10));

    // �{�^���̍쐬�B
    Button b1 = new Button("�{�^���P");
    Button b2 = new Button("�{�^���Q");
    Button b3 = new Button("�{�^���R");
    Button b4 = new Button("�{�^���S");
    Button b5 = new Button("�{�^���T");

    // ���i���A�v���b�g���ɒǉ��B
    this.add(b1,BorderLayout.NORTH);  // ��ɔz�u�B
    this.add(b2,BorderLayout.SOUTH);  // ���ɔz�u�B
    this.add(b3,BorderLayout.WEST);   // ���ɔz�u�B
    this.add(b4,BorderLayout.EAST);   // �E�ɔz�u�B
    this.add(b5,BorderLayout.CENTER); // �����ɔz�u�B

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
<applet code="j327b.class" width="200" height="200">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j327b.class" width="200" height="200">
</applet>
<br><br>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j327b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j327b.class" width="300" height="100">
</applet>

</body>
</html>
*/
