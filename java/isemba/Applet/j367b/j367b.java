// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j367b.java 
 * created : Time-stamp: <09/07/01(��) 09:21:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j367b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j367b.java >>
//
//  �`�����������i�U�j�F���i�i�e�L�X�g�t�B�[���h�A�z�u�A�C�x���g�����j
//
//�@�@�e�L�X�g�t�B�[���h���g���ăf�[�^����͂��A���^�[���L�[�Ń��x���ɕ\������
//    �P�Ԗڂ̃e�L�X�g�t�B�[���h���͌Œ�A�Q�Ԗڂ̃e�L�X�g�t�B�[���h�͉ρB
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FTextField�N���X
//�@�@�C�x���g�N���X�FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//  ��TextComponent�N���X�̃��\�b�h
//    public String getText()                       
//      �@�\�F�e�L�X�g�R���|�[�l���g�̕�������擾����B
//    public void setColumns(int n)
//�@�@�@�@�\�F�e�L�X�g�t�B�[���h���n�ɐݒ肷��B
//
//  ��java.awt.Container�N���X����p���������\�b�h
//    public void validate()                       
//      �@�\�F�R���e�i���i�[���Ă��镔�i���ǉ��܂��͕ύX���ꂽ�Ƃ��A�Ĕz�u���s���B
//
//  ��String�N���X�̃��\�b�h
//    String trim()            
//      �@�\�F���̕�����̑O�ォ��󔒂���菜���B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 
import java.awt.event.*; 

public class j367b extends Applet implements ActionListener {

  TextField t1,t2; 
  Label lab;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �e�L�X�g�t�B�[���h�̍쐬�B
    t1 = new TextField(20);
    t2 = new TextField();

    // �e�L�X�g�t�B�[���h���A�v���b�g���ɒǉ��B
    this.add(t1); 
    this.add(t2); 

    // ���x���̍쐬�B
    lab = new Label("�����ɕ\������");
    lab.setBackground(Color.yellow);

    // ���x�����A�v���b�g���ɒǉ��B
    this.add(lab); 

    // �C�x���g���X�i�̓o�^�B
    t1.addActionListener(this);
    t2.addActionListener(this);

  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == t1 ) { 
      String s = t1.getText(); lab.setText(s); 
    }
    if( ae.getSource() == t2 ) {
      String s2 = t2.getText().trim(); 
      int len = s2.length();
      t2.setColumns(len+2); // 2�����]���Ɋm�ہB
      lab.setText(s2);
      this.validate();
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
<applet code="j367b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j367b.class" width="300" height="160">
</applet>

</body>
</html>
*/
