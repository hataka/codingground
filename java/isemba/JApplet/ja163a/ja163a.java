//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja163a.java
 * �쐬��: Time-stamp: <08/07/22(��) 13:36:46 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja163a.java >>
//
//  �i�`�����������i�S�j�F�X���b�h�i�f�B�W�^�����v�j
//  
//    �f�B�W�^�����v���P�b���Ƃɕς���B
//
//�@��Date�N���X
//�@�@���t�Ǝ��Ԃ�\���N���X�B
//�@�@java.util.Date
//
//�@��Date�N���X�̃R���X�g���N�^
//    public Date()
//      �@�\�F���݂̓������擾����B
//
//�@��Date�N���X�̃��\�b�h
//�@  public String toString()
//      �@�\�FDate �I�u�W�F�N�g���A�j�� �� �� �� �� �b �N �̌`���� String ��
//            �ϊ�����B
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
import java.util.Date;

public class ja163a extends JApplet implements Runnable {

  Container c;
  Thread th;
  JLabel lab;

  // init���\�b�h�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̍쐬�B
    lab = new JLabel();
    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(lab, BorderLayout.CENTER);
  }

  // start���\�b�h�B
  public void start() {
    th = new Thread(this);
    th.start();
  }

  // stop���\�b�h�B
  public void stop() {
    th = null;
  }

  // run���\�b�h�B
  public void run() {
    while( true ) {
      try {
        Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
        Date t = new Date();
        lab.setText(t.toString());
      } catch ( InterruptedException e ) {
        System.out.println(e);
      }
    }
  }
}
