// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j371b.java 
 * created : Time-stamp: <09/07/01(��) 09:43:35 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j371b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j371b.java >>
//
//  �`�����������i�U�j�F���i�i�X�N���[���o�[�A�z�u�A�C�x���g�����j
//
//    �X���C�_�[���}�E�X�Ńh���b�O���Đ��l��ω�������B
//�@�@���E�̕����{�^�����N���b�N����Ɛ��l��+1,-1�ω�����B
//    �o�[�̃X���C�_�[�ȊO���N���b�N����ƁA���l��+10,-10�ω�����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FScrollbar�N���X
//�@�@�C�x���g�N���X�FAdustmentEvent�N���X
//�@�@�C�x���g���X�i�FAdjustmentListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@adjustmentValueChanged���\�b�h
//
//  ��Scrollbar�N���X�̃��\�b�h
//    public int getValue()
//      �@�\�F�X�N���[���o�[�̌��ݒl��Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; 
  
public class j371b extends Applet implements AdjustmentListener {

  Scrollbar sbh,sbv;
  Label lab;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    this.setLayout(new BorderLayout(10,10));

    // �X�N���[���o�[�̍쐬�B
    sbh = new Scrollbar(Scrollbar.HORIZONTAL,150,10,0,310);
    sbv = new Scrollbar(Scrollbar.VERTICAL,50,10,0,110);

    // �X�N���[���o�[���A�v���b�g���ɒǉ��B
    this.add(sbh,BorderLayout.NORTH);
    this.add(sbv,BorderLayout.EAST);

    // ���x���̍쐬�B
    lab = new Label("              ");

    // ���x�����A�v���b�g���ɒǉ��B
    this.add(lab);

    // �C�x���g���X�i�̓o�^�B
    sbh.addAdjustmentListener(this);
    sbv.addAdjustmentListener(this);

  }

  // �X�N���[���o�[���瑗���Ă����C�x���g���������郁�\�b�h�B
  public void adjustmentValueChanged(AdjustmentEvent ae) {
    if( ae.getSource() == sbh ) {
      int h = sbh.getValue();
      lab.setText("�����o�[�̒l�Fh = " + h);
    }
    if( ae.getSource() == sbv ) {
      int v = sbv.getValue();
      lab.setText("�����o�[�̒l�Fv = " + v);
    }
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
<applet code="j371b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j371b.class" width="300" height="160">
</applet>

</body>
</html>
*/
