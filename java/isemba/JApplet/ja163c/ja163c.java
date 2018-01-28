//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja163c.java
 * �쐬��: Time-stamp: <08/07/22(��) 17:52:56 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja163c.java >>
//
//  �i�`�����������i�S�j�F�X���b�h�i�Q�̃f�B�W�^�����v�A�����N���X�j
//  
//    �P�b���Ƃɕς��f�B�W�^�����v��10�b���ƕς��f�B�W�^�����v��
//�@�@�����ɓ������B
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

public class ja163c extends JApplet {

  Thread th1,th2;
  JLabel lab1,lab2;

  // init���\�b�h�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(2,1));

    // ���x���̍쐬�B
    lab1 = new JLabel();
    lab2 = new JLabel();
    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(lab1);
    c.add(lab2);
  }

  // start���\�b�h�B
  public void start() {
    th1 = new tokei1();
    th2 = new tokei2();
    th1.start();
    th2.start();
  }

  // stop���\�b�h�B
  public void stop() {
    th1 = null;
    th2 = null;
  }

  // �P�b���ƂɍX�V����鎞�v�i�����N���X�j�B
  class tokei1 extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab1.setText(t.toString());
          Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
        } catch ( InterruptedException e ) {
          System.out.println(e);
        }
      }
    }
  }
  class tokei2 extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab2.setText(t.toString());
          Thread.sleep(10000); // 10000�~���b�ԃX���[�v����B
        } catch ( InterruptedException e ) {
          System.out.println(e);
        }
      }
    }
  }
}
