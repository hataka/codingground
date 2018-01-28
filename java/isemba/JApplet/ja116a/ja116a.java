// -*- mode: java -*-  Time-stamp: <2010-04-16 13:16:51 kahata>
/*================================================================
 * file: ja116a.java
 * path; F:\java\isemba\JApplet\ja116a\ja116a.java
 * url:  http://localhost/java/isemba/JApplet/ja116a/ja116a.java
 * created: Time-stamp: <2010-04-16 13:16:51 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * link: 
 * description: 
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja116a.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�iGridBagLayout�j
//
//�@�@GridBagLayout�}�l�[�W���[���g���ƁA�قȂ�傫���̕��i���c���ɏ_��ɔz�u
//�@�@���邱�Ƃ��ł���B�i�q��ɕ������ꂽ�}�X�ڂɕ��i��z�u����B�ЂƂ̕��i��
//�@�@�����̃}�X�ڂ���Ȃ钷���`�̗̈���L���Ă��悢�B
//
//�@�@�Q�̃{�^����z�u����B
//�@�@���s����ƁA�����̃{�^���́A�w�肳�ꂽ�ʒu�֌W��ۑ����Ȃ���E�B���h�E��
//�@�@�����ɏW�܂�B�E�B���h�E�̃T�C�Y��ύX���Ă��A�{�^���̃T�C�Y�ɕω��͂Ȃ��A
//�@�@�w�肳�ꂽ�ʒu�֌W��ۑ����Ȃ���A�E�B���h�E�̒����ɏW�܂�B
//�@�@�f�t�H���g�ł́A���i�͒����ɏW�܂�悤�ɕ\�������B
//
//�@��GridBagLayout�N���X
//�@�@�قȂ�傫���̕��i���i�q��ɔz�u����B
//
//�@��GridBagLayout�N���X�̃R���X�g���N�^
//�@�@GridLayout()
//�@�@�@�@�\�F�O���b�h�o�b�O���C�A�E�g�}�l�[�W���[�𐶐�����B
//
//�@��GridBagConstraints�N���X
//�@�@���i�̈ʒu�֌W��`���w�肷��B
//
//�@��GridBagConstraints�N���X�̃R���X�g���N�^
//�@�@GridBagConstraints()
//      �@�\�FGridBagConstraints�I�u�W�F�N�g�𐶐�����B
//
//�@��GridBagConstrints�N���X�̕ϐ�
//    int gridx        ���i�̈ʒu��������gridx+1��ڂł��邱�Ƃ��w�肷��B
//�@�@�@�@�@�@�@�@�@�@ ���Ȃ킿�Agridx=0���P��ځAgridx=1���Q��ځA�E�E�E�B
//                     GridBagConstraints.RELATIVE�Ǝw�肷��ƁA���O�ɔz�u���ꂽ
//�@�@�@�@�@�@�@�@�@�@ ���i�̉E�ɔz�u�����B����́A�f�B�t�H���g�ł���B
//    int gridy        ���i�̈ʒu���ォ��gridy+1�s�ڂł��邱�Ƃ��w�肷��B
//�@�@�@�@�@�@�@�@�@�@ ���Ȃ킿�Agridy=0���P�s�ځAgridy=1���Q�s�ځA�E�E�E�B
//                     GridBagConstraints.RELATIVE�Ǝw�肷��ƁA���O�ɔz�u���ꂽ
//�@�@�@�@�@�@�@�@�@�@ ���i�̉��ɔz�u�����B����́A�f�B�t�H���g�ł���B
//    int gridwidth    ���i���g����(��)�B�f�B�t�H���g�͂P�B
//    int gridheight   ���i���g������(�s��)�B�f�B�t�H���g�͂P�B
//
//  ��GridBagLayout�N���X�̃��\�b�h
//�@�@void setConstraints(Component c, GridBagConstraints gbc)
//      �@�\�F���ic�ɏ���gbc��ݒ肷��B
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja116a.class" width="200" height="80"></applet>

import java.awt.*; 
import javax.swing.*;

public class ja116a extends JApplet {

  public void init() {
    // �A�v���b�g�̃R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����GridBagLayout�ɐݒ�B
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    c.setLayout(gb);

    // �{�^���̍쐬�B
    JButton b1 = new JButton("�{�^���P");
    JButton b2 = new JButton("�{�^���Q");

    // �{�^���P��(0,0)����(1,1)�ɔz�u����B
    gbc.gridx = 0; gbc.gridy = 0;
    gbc.gridwidth = 1; gbc.gridheight = 1;
    gb.setConstraints(b1,gbc);
    c.add(b1);

    // �{�^���Q��(1,1)����(2,2)�ɔz�u����B
    gbc.gridx = 1; gbc.gridy = 1;
    gbc.gridwidth = 1;  gbc.gridheight = 1;
    gb.setConstraints(b2,gbc);
    c.add(b2);
  }
}
