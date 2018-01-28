//  -*- mode: java -*-  Time-stamp: <08/07/21(��) 07:39:21 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja153a.java
 * �쐬��: Time-stamp: <08/07/21(��) 07:38:30 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja153a.java >>
//
//  �i�`�����������i�R�j�F�}�E�X����i�C�x���g�����j
//
//�@������
//�@�@�}�E�X�{�^���������ăh���b�O����ƁA"mouseDragged"�ƕ\������B
//�@�@�}�E�X�{�^�����������Ƀ}�E�X���ړ�����ƁA"mouseMoved"�ƕ\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X����
//�@�@�C�x���g�@�@�@�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseMotionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@mouseDragged, mouseMoved���\�b�h
//
//�@�����X�i�[�C���^�[�t�F�[�X(MouseMotionListener)
//    �Q�̃��\�b�h���ׂĂ��`����K�v������B
//
//�@�@�@mouseDragged �F�}�E�X�{�^���������ăh���b�O����ƌĂяo�����B
//�@�@�@mouseMoved   �F�{�^�����������Ƀ}�E�X���ړ�����ƌĂяo�����B
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
// <applet codebase = "./" code="ja153a.class" width=640 height=480></applet>

import java.awt.*; 
import java.awt.event.*;     
import javax.swing.*; 

public class ja153a extends JApplet implements MouseMotionListener {

  JLabel lab;

  // init���\�b�h�̒�`�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    c.setLayout(new FlowLayout());

    // ���x���̍쐬�B
    lab = new JLabel("�}�E�X�𑀍삵�Ă�������");
    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab);

    // �C�x���g���X�i�̓o�^�B
    this.addMouseMotionListener(this);
  }

  // mouseDragged���\�b�h�̒�`�B
  public void mouseDragged(MouseEvent e) {
    lab.setText("mouseDragged");
  }

  // mouseMoved���\�b�h�̒�`�B  
  public void mouseMoved(MouseEvent e) {
    lab.setText("mouseMoved");
  }
}
