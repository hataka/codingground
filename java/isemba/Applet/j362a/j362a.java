// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j362a.java 
 * created : Time-stamp: <09/07/01(��) 08:22:48 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j362a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j362a.java >>
//
//�@�`�����������i�U�j�F���i�i�{�^���A�z�u�j
//
//�@�@�u�ԁv�{�^���Ɓu�΁v�{�^�������C�A�E�g�}�l�[�W��(FlowLayout)��
//�@�@�g���Ĕz�u����B
//
//�@��java.awt.Button�N���X
//�@�@on/off�̑I���̂Ƃ���Button�N���X���g���B
//
//  ��Button�N���X�̃R���X�g���N�^
//    public Button(String s)      
//      �@�\�F������s��\������{�^���𐶐�����B
//�@�@
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;

public class j362a extends Applet {

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // �{�^���̍쐬�B
    Button b1 = new Button("��");
    Button b2 = new Button("��");

    // �{�^�����A�v���b�g���ɒǉ��B
    this.add(b1);
    this.add(b2);

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
<applet code="j362a.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j362a.class" width="300" height="100">
</applet>

</body>
</html>
*/
