//  -*- mode: java -*-  Time-stamp: <08/07/21(��) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja151a.java
 * �쐬��: Time-stamp: <08/07/21(��) 07:05:47 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja151a.java >>
//
//  �i�`�����������i�R�j�F�}�E�X����i�C�x���g�����j
//
//�@������
//�@�@�}�E�X�{�^���������ƁA"mousePressed"�ƕ\������B
//�@�@�}�E�X�{�^���𗣂��ƁA"mouseRelesedp"�ƕ\������B
//�@�@�}�E�X�{�^�����N���b�N����ƁA"mouseReleased"�ƕ\������B
//    �}�E�X�J�[�\�����E�B���h�E���ɓ���ƁA"mouseEntered"�ƕ\������B
//    �}�E�X�J�[�\�����E�B���h�E�O�ɏo��ƁA"mouseExited"�ƕ\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X����
//�@�@�C�x���g�@�@�@�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@mousePressed, mouseReleased, mouseClicked, mouseEntered,
//�@�@�@�@�@�@�@�@�@  mouseExited ���\�b�h
//
//  �����X�i�[�C���^�[�t�F�[�X�iMouseListener�j
//�@�@�}�E�X����Ɋւ��郊�X�i�[�C���^�[�t�F�[�X�B
//    �T�̃��\�b�h���ׂĂ��`����K�v������B
//
//   �@ mousePressed   : �}�E�X�{�^���������ƌĂяo�����B
//    �@mouseReleased  : �}�E�X�{�^���𗣂��ƌĂяo�����B
//    �@mouseCliced    : �}�E�X�{�^�����N���b�N����ƌĂяo�����B
//    �@mouseEntered   : �E�C���h�E���Ƀ}�E�X�J�[�\��������ƌĂяo�����B
//    �@mouseExited    : �E�C���h�E�O�Ƀ}�E�X�J�[�\�����o��ƌĂяo�����B
//
////////////////////////////////////////////////////////////////////////////////
===================================================================================
 * </pre>
 * @package    JApplet
 * @subpackage
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2008 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
 */
/*=================================================================================*/

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

/*
<applet code="ja151a.class" width="640" height="480">
</applet>
*/
public class ja151a extends JApplet implements MouseListener {

  JLabel lab;

  // init���\�b�h�̒�`�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̍쐬�B
    lab = new JLabel("�}�E�X�𑀍삵�Ă�������");
    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab,BorderLayout.CENTER);

    // �C�x���g���X�i�̓o�^�B
    this.addMouseListener(this);
  }

  // mousePressed���\�b�h�̒�`�B
  public void mousePressed(MouseEvent e) {
    lab.setText("mousePressed");
  }

  // mouseReleased���\�b�h�̒�`�B
  public void mouseReleased(MouseEvent e) {
    lab.setText("mouseReleased");
  }

  // mouseClicked���\�b�h�̒�`�B
  public void mouseClicked(MouseEvent e) { 
    lab.setText("mouseClicked");
  }

  // mouseEntered���\�b�h�̒�`�B
  public void mouseEntered(MouseEvent e) { 
    lab.setText("mouseEntered");
  }

  // mouseExited���\�b�h�̒�`�B
  public void mouseExited(MouseEvent e) { 
    lab.setText("mouseExited");
  }
}
