//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja161.java
 * �쐬��: Time-stamp: <08/07/22(��) 13:27:17 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja161.java >>
//
//  �i�`�����������i�S�j�F�X���b�h�i�T���j
//  
//�@���X���b�h
//�@�@�E�v���O�����̎��s�̗�����A�X���b�h�Ƃ����B�K�v�ɉ����ĐV�����X���b�h��
//�@�@�@�쐬���A�����̃X���b�h����s���Ď��s�ł���B
//�@�@�@���Ƃ��΁A�A�j���[�V������\�����Ȃ��特���Đ�������A��莞�Ԃ��Ƃ�
//�@�@�@�\����ω��������肷�邱�Ƃ��ł���B
//
//�@�@�E�A�v���b�g���ŃX���b�h�𗘗p����ɂ́ARunnable�C���^�[�t�F�[�X��
//�@�@�@ ��������BRunnable�C���^�[�t�F�[�X�Œ�`����Ă���run���\�b�h��
//�@�@�@�I�[�o�[���C�h���āA�X���b�h�����鏈�����L�q����B
//
//�@�@�E�X���b�h������Thread�N���X�̃I�u�W�F�N�g��ʂ��čs����B
//   �@ �X���b�h�I�u�W�F�N�g�̐����̓X���b�h�R���X�g���N�^�ōs���A���s�J�n��
//    �@Thread�N���X��start���\�b�h�Ăяo���B��������ƁArun���\�b�h�ɋL�q���ꂽ
//    �@�������Ɨ������X���b�h�Ƃ��Ď��s�����B
//
//�@��Runnable�C���^�[�t�F�[�X
//�@�@���̃C���^�[�t�F�[�X�́AThread�N���X�ŕK�v��run���\�b�h���`���Ă���B
//�@�@���̃C���^�[�t�F�[�X�����������N���X�̓X���b�h�������Ƃ��ł���B
//
//  ���N���X���X���b�h�Ƃ��Ď��s���邽�߂̏����� 
//    public class �N���X�� extends JApplet implements Runnable {
//      Thread th;
//      // �X���b�h�̊J�n�B
//      public void start() {
//        th = new Thread(this); // �X���b�h�I�u�W�F�N�g�̐����Bthis�̓A�v���b�g
//                               // ���g���w���B����ɂ��A�v���b�g���X���b�h
//                               // �Ƃ��Ĉ�����B           
//        th.start(); // �X���b�h�̎��s�J�n�B
//      }
//      // ���s���鏈���B
//      public void run() {
//        �����̖{��
//      }
//      // �X���b�h�̒�~�B
//      public void stop() {
//        th = null; // �X���b�h�I�u�W�F�N�g�̏����B�X���b�h�̒�~�B
//      }
//    }
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
