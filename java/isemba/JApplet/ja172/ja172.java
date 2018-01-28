//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja172.java
 * �쐬��: Time-stamp: <08/07/22(��) 18:11:30 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja172.java >>
//
//  �i�`�����������i�T�j�F�A�v���b�g�̃T�C�Y���擾
//  
//�@�@�A�v���b�g�̃T�C�Y���擾���T�C�Y�ɉ����ĕ������ω�������B
//
//  ��java.awt.Component�N���X����p���������\�b�h
//    public Dimension getSize()
//      �@�\�F�A�v���b�g�̃T�C�Y��Dimension�N���X�̃I�u�W�F�N�g�Ƃ��Ď擾�B
//�@�@�@�@�@�@Dimension�N���X�͕�(width)�ƍ���(height)�̂Q�̕ϐ�����Ȃ�B
//�@�@�@�@�@�@���ꂼ�ꐮ���̒l������
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
import javax.swing.*; 

public class ja172 extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̐����B
    JLabel lab = new JLabel();

    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab,BorderLayout.CENTER);

    // �A�v���b�g�̃T�C�Y���擾�B
    Dimension d = this.getSize();
    int size = d.width/10;
    String s = "�����F"+d.height+"�@���F"+d.width;
    lab.setText(s);
    Font f = new Font("Serif",Font.BOLD,size);
    lab.setFont(f);
  }
}
