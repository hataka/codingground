// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j351.java 
 * created : Time-stamp: <09/07/01(��) 07:14:12 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j351.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j351.java >>
//
//  �A�v���b�g�i�T�j�F�X���b�h�i�T���j
//  
//�@���X���b�h
//
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
//   �@ �X���b�h�I�u�W�F�N�g�̍쐬��Thread�R���X�g���N�^�ōs���A���s�J�n��
//    �@Thread�N���X��start���\�b�h�Ăяo���B��������ƁArun���\�b�h�ɋL�q���ꂽ
//    �@�������Ɨ������X���b�h�Ƃ��Ď��s�����B�X���b�h�̒�~�́Astop���\�b�h��
//�@�@�@�Ăяo���čs���B
//
//�@��Runnable�C���^�[�t�F�[�X
//
//�@�@���̃C���^�[�t�F�[�X�́AThread�N���X�ŕK�v��run���\�b�h���`���Ă���B
//�@�@���̃C���^�[�t�F�[�X�����������N���X�̓X���b�h�������Ƃ��ł���B
//
//  ���N���X���X���b�h�Ƃ��Ď��s���邽�߂̏����� 
//
//      public class �N���X�� extends Applet implements Runnable {       
//        Thread th;                                                     
//        // �X���b�h�̊J�n�B                                            
//        public void start() {                                          
//          th = new Thread(this); // Thread�I�u�W�F�N�g�̍쐬�B       
//                                 // this�̓A�v���b�g���g���w���B       
//                                 // ����ɂ��A�v���b�g���X���b�h     
//                                 // �Ƃ��Ĉ�����B                   
//          th.start(); // �X���b�h�̎��s�J�n�B                          
//        }                                                              
//        // �X���b�h�̏����B                                              
//        public void run() {                                            
//          �����̖{��                                                   
//        }                                                              
//        // �X���b�h�̒�~�B                                            
//        public void stop() {                                           
//          th = null; // THread�I�u�W�F�N�g�̏����B�X���b�h�̒�~�B   
//        }                                                              
//      }                                                                
//
////////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
