// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j367a.java 
 * created : Time-stamp: <09/07/01(��) 08:37:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j367a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j367a.java >>
//
//  �`�����������i�U�j�F���i�i�e�L�X�g�t�B�[���h�A�z�u�j
//
//�@�@�e�L�X�g�t�B�[���h���g���ăf�[�^����͂ł���B
//�@�@�e�L�X�g�t�B�[���h���T�쐬����B
//
//  ��java.awt.TextField�N���X
//    ���[�U����̓���(������)�p�̗��ŁA�P�s���̕ҏW����Ƃ��ATextField�N���X
//�@�@���g���B
//
//  ��TextField�N���X�̃R���X�g���N�^
//    public TextField() throws HeadlessException                      
//      �@�\�F�e�L�X�g�t�B�[���h���쐬����B
//    public TextField(String s) throws HeadlessException                       
//      �@�\�F�e�L�X�g�t�B�[���h���쐬���A������s��\������B
//    public TextField(int n) throws HeadlessException                       
//      �@�\�Fn�������̃e�L�X�g�t�B�[���h���쐬����B
//    public TextField(String s, int c) throws HeadlessException                       
//      �@�\�Fc�������̃e�L�X�g�t�B�[���h���쐬���A������s��\������B
//
//  ��java.awt.TextComponent�N���X�̃��\�b�h
//    �e�L�X�g�̕ҏW���\�ɂ��邷�ׂĂ̕��i�̐e�N���X�B 
//
//  ��TextComponent�N���X�̃��\�b�h
//    public void setText(String s)                       
//      �@�\�F�e�L�X�g�R���|�[�l���g�ɕ�����s��ݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j367a extends Applet {

  TextField t1,t2,t3,t4,t5; 

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �e�L�X�g�t�B�[���h�̍쐬�B
    t1 = new TextField();
    t2 = new TextField("�e�L�X�g�Q");
    t3 = new TextField(20);
    t4 = new TextField("�e�L�X�g�S",20);
    t5 = new TextField();
    t5.setText("�e�L�X�g�T");

    // �e�L�X�g�t�B�[���h���A�v���b�g���ɒǉ��B
    this.add(t1); 
    this.add(t2);
    this.add(t3);
    this.add(t4);
    this.add(t5);

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
<applet code="j367a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j367a.class" width="300" height="160">
</applet>

</body>
</html>
*/
