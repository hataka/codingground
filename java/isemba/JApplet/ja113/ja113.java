//  -*- mode: java -*-  Time-stamp: <08/06/17(��) 18:50:33 hata>
/*================================================================
 * �v���O������: ja113.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/17(��) 16:58:05 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja113.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja113.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�iGridLayout�j
//
//�@�@�@���i���i�q��ɔz�u����B
//�@�@�@�R���e�i�̃T�C�Y���ς��ƁA���i�̑傫�����ς�邪�A�ǂ̕��i������
//�@�@�@�傫���ɂȂ�B
//
//�@��GridLayout�N���X
//�@�@java.awt.GridLayout
//
//�@��GridLayout�N���X�̃R���X�g���N�^
//�@�@public GridLayout(int r, int c, int h, int v)
//�@�@�@�@�\�F���i���A�i�q��ɔz�u����B
//            r�F�s�̐��B
//            c�F��̐��B
//            h�F���i�Ԃ̐����Ԋu�i�P�ʂ̓s�N�Z���j�B
//            v�F���i�Ԃ̐����Ԋu�i�P�ʂ̓s�N�Z���j�B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

//<applet code="ja113.class" width="640" height="480"></applet>

public class ja113 extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(2,3,10,10));

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
        JFrame frame = new JFrame("ja113");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja113();
        applet.init();
        frame.add(applet);
        frame.setSize(400, 200);
        frame.setVisible(true);
        applet.start();
    }
}
