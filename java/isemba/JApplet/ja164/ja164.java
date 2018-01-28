//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja164.java
 * �쐬��: Time-stamp: <08/07/22(��) 17:59:08 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
// << ja164.java >>
//
//  �i�`�����������i�S�j�F�X���b�h�i�f�B�W�^�����v�A�{�^������j
//
//�@������
//�@�@�@�J�n�Ə����ꂽ�{�^�����N���b�N����ƃf�B�W�^�����v�������A
//�@�@�@��~�Ə����ꂽ�{�^�����N���b�N����ƃf�B�W�^�����v����~����B
//
//�@���X���b�h�̒�~�B
//�@�@�X���b�h�̒�~�ɁAThread�N���X�̃��\�b�hstop()�́A���S�łȂ��̂Ŏg��Ȃ�
//�@�@�ق����悢�B����̕��@�������B
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
import java.util.Date;

public class ja164 extends JApplet implements ActionListener, Runnable {

  JButton b1,b2; 
  JLabel lab;
  Thread th;
  boolean running; // �X���b�h�����쒆��true�A��~����false�B

  // init���\�b�h�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // �{�^���̍쐬�B
    b1 = new JButton("�J�n");
    b2 = new JButton("��~");
    // �p�l���̍쐬
    JPanel p = new JPanel();
    // �{�^�����p�l�����ɒǉ��B
    p.add(b1);
    p.add(b2);
    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(p,BorderLayout.NORTH);

    // ���x���̍쐬�B
    lab = new JLabel();
    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab, BorderLayout.CENTER);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // start���\�b�h�B
  public void start() {
    th = new Thread(this);
    th.start();
    running = true;
  }

  // stop���\�b�h�B
  public void stop() {
    // �X���b�h�̒�~�B
    th = null;
  }

  // �P�b���ƂɍX�V����f�B�W�^�����v�B
  public void run() {
    while( running ) { // running��true�̊ԁA�J��Ԃ����s����A�O������false��
                       // �ݒ肳���ƃ��[�v��E�o����B
      try {
        Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
        Date t = new Date();
        lab.setText(t.toString());
      } catch ( InterruptedException e ) {
        System.out.println(e);
      }
    }
    th = null;
  }

  // ���X�i�C���^�[�t�F�[�X(ActionListener)�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    // �{�^�����N���b�N���ꂽ�Ƃ��A���s�����B
    if( e.getSource() == b1 ) {
      th = new Thread(this);
      th.start();
      running = true;
    } 
    if( e.getSource() == b2 ) {
      running = false;
    } 
  }
}
