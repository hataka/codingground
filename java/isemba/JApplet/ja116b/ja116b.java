// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: ja116b.java 
 * created : Time-stamp: <09/07/05(��) 16:22:42 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/ja116b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja116b.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�iGridBagLayout�j
//
//�@�@�Q�̃{�^����z�u����B�����̃{�^���́A�w�肳�ꂽ�ʒu�֌W��ۑ����Ȃ���
//�@�@�\�������B
//
//�@��GridBagConstraints�N���X�̕ϐ�
//    double weightx   �E�B���h�E�̑傫�����傫���Ȃ����Ƃ��A�]���̐����̈悪
//�@�@�@�@�@�@�@�@�@�@ ���i�ɐݒ肳�ꂽweightx�̊����ɂ���ĕ��z�����B
//�@�@�@�@�@�@�@�@�@�@ 0�ɐݒ肷��Ə����T�C�Y�ɌŒ肳���B
//    double weighty   �E�B���h�E�̑傫�����傫���Ȃ����Ƃ��A�]���̐����̈悪
//�@�@�@�@�@�@�@�@�@�@ ���i�ɐݒ肳�ꂽweighty�̊����ɂ���ĕ��z�����B
//�@�@�@�@�@�@�@�@�@�@ 0�ɐݒ肷��Ə����T�C�Y�ɌŒ肳���B
//�@�@int fill         ���i�̕\���̈悪���i�̃T�C�Y���傫���Ȃ����Ƃ��A
//�@�@�@�@�@�@�@�@�@�@ �ǂ̂悤�ɂ��邩�w�肷��B
//                     GridBagConstraints.BOTH        ���i�𐅕��E�����̗�����
//                                                    ��t�Ɋg������B
//                     GridBagConstraints.HORIZONTAL  ���i�𐅕�������t��
//                                                    �g������B
//                     GridBagConstraints.VERTICAL    ���i�𐂒�������t��
//                                                    �g������B
//                     GridBagConstraints.NONE        �Ȃɂ����Ȃ��B
//�@
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja116b extends JApplet {

  public void init() {
    // �A�v���b�g�̃R���e���c�y�C�����擾�B
    Container c = getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridBagLayout�ɐݒ�B
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    c.setLayout(gb);

    // �{�^���̍쐬�B
    JButton b1 = new JButton("�{�^���P");
    JButton b2 = new JButton("�{�^���Q");

    // �{�^���P��(0,0)����(1,1)�ɔz�u����B
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // �{�^���Q��(1,1)����(2,2)�ɔz�u����B
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gb.setConstraints(b2,gbc);
    c.add(b2);
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
<applet code="ja116b.class" width="200" height="80">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="ja116b.class" width="200" height="80">
</applet>
<br><br>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="ja116b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="ja116b.class" width="300" height="160">
</applet>

</body>
</html>
*/
