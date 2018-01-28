//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 19:53:17 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: j511b.java
 * �쐬��: Time-stamp: <08/07/22(��) 20:32:04 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << j511b.java >>
//
//  �X���b�h�i�P�j�F�X���b�h�̍쐬�iRunnable�C���^�[�t�F�[�X������������@�j
//  
//�@�@Runnable�C���^�[�t�F�[�X������������@���m�F����B
//
//�@�@�i�P�j�X���b�h(Thread1)�̒�`�B
//�@�@�i�Q�j�X���b�h�̍쐬�B
//�@�@�i�R�j�X���b�h�̎��s�B
//�@�@�i�S�jmain���\�b�h�̎��s�B

//�@��Thread�N���X�̃R���X�g���N�^
//    public Thread(Runnable obj)
//    �@�@�\�FRunnable�I�u�W�F�N�gobj���g����Thread�I�u�W�F�N�g���쐬����B
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

//�i�P�j
class Thread1 implements Runnable { 
  public void run() { // �����̖{�́B
    for( int i=1; i<=5; i++ ) { 
      System.out.println("thread (" + i + ")");
    }
  }
}

class j511b {
  public static void main(String args[]) {

    Thread1 r1 = new Thread1();
    Thread th1 = new Thread(r1); //�i�Q�j

    th1.start(); //�i�R�j

    for( int i=1; i<=5; i++ ) { 
      System.out.println("main method (" + i + ")"); //�i�S�j
    }
  }
}
