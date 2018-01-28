//  -*- mode: java -*-  Time-stamp: <08/07/21(��) 07:39:21 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja155b.java
 * �쐬��: Time-stamp: <08/07/22(��) 13:11:16 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja155b.java >>
//
//  �i�`�����������i�R�j�F�L�[����i�C�x���g�����A�A�_�v�^�N���X�j
//
//�@������
//�@�@�����ꂽ�L�[�𕶎���Ƃ��ĕ\������B
//
//�@�����X�i�[�C���^�[�t�F�[�X�ƃA�_�v�^�N���X�̑Ή�
// �@�@  KeyListener          KeyAdapter
//
////////////////////////////////////////////////////////////////////////////////
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

public class ja155b extends JApplet {

  JLabel lab;
  Font f;
  String s;

  // init���\�b�h�̒�`�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(10,10));

    // �t�H���g�̍쐬�B
    f = new Font("Courier", Font.BOLD, 48);

    // ���x���̍쐬�B
    lab = new JLabel("�L�[�𑀍삵�Ă�������");
    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab,BorderLayout.CENTER);

    // �C�x���g���X�i�̓o�^�B
    EventListener el = new EventListener();
    this.addKeyListener(el);
  }

  // �A�_�v�^�N���X������N���X�Ƃ��Ē�`�B
  class EventListener extends KeyAdapter {
    // �c��̃��\�b�h(keyPressed,keyReleased)�̒�`���ȗ��ł���B  
    // keyTyped���\�b�h�̒�`�B
    public void keyTyped(KeyEvent e) {
      s = "" + e.getKeyChar();
      lab.setText(s);
      lab.setFont(f);
      lab.setForeground(Color.green);
    }
  }
}
