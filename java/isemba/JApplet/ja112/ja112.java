//  -*- mode: java -*-  Time-stamp: <08/06/17(��) 17:23:11 hata>
/*================================================================
 * �v���O������: ja112.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/17(��) 16:58:05 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja112.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja112.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[(FlowLayout�j
//
//�@�@���i�̔z�u���A������E�֕��ׂ�悤�w�肷��B
//    ���ׂ��Ȃ��Ȃ�΁A���̍s�ɔz�u����B�e���i�̊Ԋu�͋ϓ��B
//
//�@��FlowLayout�N���X
//    �R���|�[�l���g�i�{�^����e�L�X�g�t�B�[���h�Ȃǂ̕��i�j��������E��
//�@�@�s���Ƃɔz�u����B
//    java.awt.FlowLayout
//
//�@��FlowLayout�N���X�̃R���X�g���N�^   
//    public FlowLayout()
//�@�@�@�@�\�F���i�̔z�u���A������E�֏��ɕ��ׂ�悤�w�肷��B
//�@�@�@�@�@�@�����Ԋu�Ɛ����Ԋu��5�A���������B
//    public FlowLayout(int align, int h, int v)
//�@�@�@�@�\�F���i�̔z�u���A������E�֏��ɕ��ׂ�悤�w�肷��B�e���i�̊Ԋu�͋ϓ��B
//            �ʒualign�̎w��͎��̂悤�ɂȂ�B
//�@�@�@�@�@�@�@����  FlowLayout.LEFT
//�@�@�@�@�@�@�@����    FlowLayout.CENTER
//            �@�E��  FlowLayout.RIGHT
//            h�̓R���|�[�l���g�Ԃ̐����Ԋu�Av�̓R���|�[�l���g�Ԃ̐����Ԋu�B
//
//�@��JButton�N���X�̃R���X�g���N�^
//�@�@public JButton(String s)
//      �@�\�F�e�L�X�gs�����{�^���𐶐�����B
//
//�@��Container�N���X�̃��\�b�h     
//    public Component add(Component comp)
//      �@�\�F���icomp���R���e�i�̍Ō�ɒǉ�����B 
//    public void setLayout(LayoutManager lm)
//      �@�\�F�R���e�i�̃��C�A�E�g�}�l�[�W����lm�ɐݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

//<applet code="ja112.class" width="480" height="60"></applet>

public class ja112 extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLatout�ɐݒ�B
    c.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));

    // �{�^���̍쐬�B
    JButton b1 = new JButton("�{�^���P");
    JButton b2 = new JButton("�{�^���Q");
    JButton b3 = new JButton("�{�^���R");
    JButton b4 = new JButton("�{�^���S");
    JButton b5 = new JButton("�{�^���T");

    // �{�^�����R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);
    c.add(b5);
  }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ja112");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja112();
        applet.init();
        frame.add(applet);
        frame.setSize(400, 200);
        frame.setVisible(true);
        applet.start();
    }
}
