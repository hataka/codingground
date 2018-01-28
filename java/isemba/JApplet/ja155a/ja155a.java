//  -*- mode: java -*-  Time-stamp: <08/07/21(��) 07:39:21 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja155a.java
 * �쐬��: Time-stamp: <08/07/22(��) 12:56:35 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja155a.java >>
//
//  �i�`�����������i�R�j�F�L�[����(�C�x���g����)
//
//�@������
//�@�@�����ꂽ�L�[�𕶎���Ƃ��ĕ\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�L�[����
//�@�@�C�x���g�@�@�@�FKeyEvent�N���X
//�@�@�C�x���g���X�i�FKeyListener�C���^�[�t�F�[�X
//                    keyTyped, keyPressed, keyReleased
//
//�@��KeyListener�C���^�[�t�F�[�X�̃��\�b�h
//    public void keyPressed(KeyEvent e)
//�@�@�@�@�\�F�L�[�������ꂽ�Ƃ��̏����B
//    public void keyReleased(KeyEvent e)
//�@�@�@�@�\�F�L�[�������ꂽ�Ƃ��̏����B
//    public void keyTyped(KeyEvent e)
//�@�@�@�@�\�F�L�[�����͂��ꂽ�Ƃ��̏����B
//
//  ��KeyEvent�N���X�̃��\�b�h
//�@�@public char getKeyChar()
//      �@�\�F���͂��ꂽ�������擾����B
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

public class ja155a extends JApplet implements KeyListener {

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
    this.addKeyListener(this);
  }

  // keyTyped���\�b�h�̒�`�B
  public void keyTyped(KeyEvent e) {
    s = "" + e.getKeyChar();
    lab.setText(s);
    lab.setFont(f);
    lab.setForeground(Color.green);
  }

  // �c��̃��\�b�h����`����K�v������B
  public void keyPressed(KeyEvent e) { }
  public void keyReleased(KeyEvent e) { }
}
