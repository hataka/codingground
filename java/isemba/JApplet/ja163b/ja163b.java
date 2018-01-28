//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja163b.java
 * �쐬��: Time-stamp: <08/07/22(��) 13:51:04 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja163b.java >>
//
//  �i�`�����������i�S�j�F�X���b�h�i�f�B�W�^�����v�A�����N���X�j
//  
//    �P�b���Ƃɕς��f�B�W�^�����v������N���X���g���ċL�q����B
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

public class ja163b extends JApplet {

  Thread th;
  JLabel lab;

  // init���\�b�h�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̍쐬�B
    lab = new JLabel();
    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(lab, BorderLayout.CENTER);
  }

  // start���\�b�h�B
  public void start() {
    th = new tokei();
    th.start();
  }

  // stop���\�b�h�B
  public void stop() {
    th = null;
  }

  // �P�b���ƂɍX�V����鎞�v�i�����N���X�j�B
  class tokei extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab.setText(t.toString());
          Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
        } catch ( InterruptedException e ) {
          System.out.println(e);
        }
      }
    }
  }
}
