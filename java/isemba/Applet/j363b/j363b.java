// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j363b.java 
 * created : Time-stamp: <09/07/01(��) 08:27:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j363b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j363b.java >>
//
//  �`�����������i�U�j�F���i�i�`���C�X�A�C�x���g�����j
//
//�@�@�`���C�X���쐬�E�\�����A�I���������ځi�ԁA�A���j�ŃA�v���b�g�̔w�i�F��
//�@�@�ύX����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FChoice�N���X
//�@�@�C�x���g�N���X�FItemEvent�N���X
//�@�@�C�x���g���X�i�FItemListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@itemStateChanged���\�b�h
//
//  ��Choice�N���X�̃��\�b�h
//    public void add(String s)                       
//      �@�\�F������s�����ڂɉ�����B
//    public String getSelectedItem()
//      �@�\�F�I�����ꂽ���ڂ𕶎���ŕԂ��B
//    public int getSelectedIndex()
//      �@�\�F�I�����ꂽ���ڂ̈ʒu��Ԃ��B�擪�̈ʒu��0�B
//
//�@��ItemListener�C���^�[�t�F�[�X�̃��\�b�h
//    void itemStateChanged(ItemEvent e)
//      �@�\�F�C�x���g�����������Ƃ��Ăяo�����B
//      e   �F�C�x���g�������̏󋵂��L�^����Ă���B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*; 

public class j363b extends Applet implements ItemListener {

  Choice cb;

  public void init() {

   // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // �`���C�X�̍쐬�B
    cb = new Choice();

    // ���ڂ��`���C�X���ɒǉ��B
    cb.add("��");
    cb.add("��");
    cb.add("��");

    // �`���C�X���A�v���b�g���ɒǉ��B
    this.add(cb);

    // �C�x���g���X�i�̓o�^�B
    cb.addItemListener(this);

  }

  // ItemListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void itemStateChanged(ItemEvent ie) {
    // �`���C�X����C�x���g�����������ꍇ�A���s�����B   
    if( ie.getSource() == cb ) {
      String s = (String)cb.getSelectedItem();
      if( s.equals("��") ) { this.setBackground(Color.red); }
      if( s.equals("��") ) { this.setBackground(Color.blue); }
      if( s.equals("��") ) { this.setBackground(Color.yellow); }
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
<applet code="j363b.class" width="300" height="100">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j363b.class" width="300" height="100">
</applet>

</body>
</html>
*/
