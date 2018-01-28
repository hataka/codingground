//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja162.java
 * �쐬��: Time-stamp: <08/07/22(��) 13:32:07 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja162.java >>
//
//  �i�`�����������i�S�j�F�X���b�h�i�w�i�F�̐؊��j
//  
//    �A�v���b�g�̔w�i�F���P�b���ƂɐԁA�΂Ɛ؂芷����B
//
//�@��Thread�N���X�̃��\�b�h
//�@�@public void start()
//      �@�\�F�X���b�h�̎��s�J�n�B
//    public static void sleep(long m) throws InterruptedException
//      �@�\�Fm�~���b�Ԓ�~�B
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

public class ja162 extends JApplet implements Runnable {

  Container c;
  Thread th;

  // init���\�b�h�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
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
        c.setBackground(Color.red);
        Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
        c.setBackground(Color.green);
      } catch ( InterruptedException e ) {
        System.out.println(e);
      }
    }
  }
}
