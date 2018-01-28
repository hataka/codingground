//  -*- mode: java -*-  Time-stamp: <08/07/21(��) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja151b.java
 * �쐬��: Time-stamp: <08/07/21(��) 07:10:52 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja151b.java >>
//
//  �i�`�����������i�R�j�F�}�E�X����i�C�x���g�����A�A�_�v�^�N���X�j
//
//�@������
//    �}�E�X�J�[�\�����E�B���h�E���ɓ���ƁA"mouseEntered"�ƕ\������B
//    �}�E�X�J�[�\�����E�B���h�E�O�ɏo��ƁA"mouseExited"�ƕ\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X����
//�@�@�C�x���g�@�@�@�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseAdapter�N���X
//�@�@�@�@�@�@�@�@�@�@mouseClicked���\�b�h
//
//�@���A�_�v�^�N���X
//�@�@�C�x���g���X�i�̓��X�i�[�C���^�[�t�F�[�X�̂��ׂẴ��\�b�h���`���Ȃ����
//�@�@�Ȃ�Ȃ��B����������邽�߃A�_�v�^�N���X�Ă΂��N���X����������Ă���B
//�@�@�K���ȃA�_�v�^�N���X���g���ƁA�K�v�ȃ��\�b�h�̂݃I�[�o�[���C�h���邾����
//�@�@�悢�B
//    �E�A�_�v�^�N���X�̓��X�i�[�C���^�[�t�F�[�X�̃��\�b�h����̃��\�b�h�Ƃ���
//�@�@�@��`���������ł���B
//  �@�E�R���p�C������ƂQ�̃N���X�t�@�C�������������B
//�@�@�@ja151b.class, ja151b$EventListener.class
//
//�@�����X�i�[�C���^�[�t�F�[�X�ƃA�_�v�^�N���X�̑Ή�
//     MouseListener        MouseAdapter
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

public class ja151b extends JApplet {

  JLabel lab;

  // init���\�b�h�̒�`�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x�������B
    lab = new JLabel("�}�E�X�𑀍삵�Ă�������");
    // �R���e���c�y�C���ɒǉ��B
    c.add(lab,BorderLayout.CENTER);

    // �C�x���g���X�i�̓o�^�B
    EventListener el = new EventListener();
    this.addMouseListener(el);
  }

  // �C�x���g���X�i���`(�����N���X)�B
  class EventListener extends MouseAdapter {
    // �c��̃��\�b�h(mousePressed,mouseReleased,mouseClicked)��
    // ��`���ȗ��ł���B  

    // mouseEntered���\�b�h�̒�`�B            
    public void mouseEntered(MouseEvent e) {   
      lab.setText("mouseEntered");             
    }                                          
                                               
    // mouseExited���\�b�h�̒�`�B             
    public void mouseExited(MouseEvent e) {    
      lab.setText("mouseExited");              
    }                                          
  }
}
