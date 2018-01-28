// -*- mode: java -*-  Time-stamp: <2010-04-16 16:04:43 kahata>
/*================================================================
 * file: ja116d.java
 * path; F:\java\isemba\JApplet\ja116d\ja116d.java
 * url:  http://localhost/java/isemba/JApplet/ja116d/ja116d.java
 * created: Time-stamp: <2010-04-16 16:04:43 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * link: 
 * description: 
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja116d.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�iGridBagLayout�j
//
//    ���h���������悭���邽�߂ɁA���i�̉�������ɗ]����t����B
//
//�@��Insets�N���X
//�@�@���i�̎���ɗ]�������ɂ́AInsets�N���X���g���B
//
//�@��Insets�N���X�̃R���X�g���N�^
//�@�@public Insets(int top, int left, int bottom, int right)
//      �@�\�F���i�̊O���̗]�������B
//            �f�t�H���g�́A0,0,0,0�B
//
//  ��GridBagLayout�N���X�̕ϐ�
//�@�@Insets insets
//      �@�\�F���i�̊O���̗]�����w�肷��B
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja116d.class" width="200" height="80"></applet>

import java.awt.*; 
import javax.swing.*;

public class ja116d extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
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
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(10,10,10,10);
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // �{�^���Q��(1,1)����(2,2)�ɔz�u����B
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gbc.weightx = 1.0; gbc.weighty = 1.0;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(10,10,10,10);
    gb.setConstraints(b2,gbc);
    c.add(b2);
  }
}
