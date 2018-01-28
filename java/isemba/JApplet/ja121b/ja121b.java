//  -*- mode: java -*-  Time-stamp: <08/06/17(��) 19:49:30 hata>
/*================================================================
 * �v���O������: ja121b.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/17(��) 16:58:05 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja113.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja121b.java >>
//
//  �i�`�����������i�Q�j�F���i�i���x���j
//
//�@�@�Z���������\������B
//
//�@��JComponent�N���X�̃��\�b�h
//    public void setForeground(Color bg)
//      �@�\�F���i�̑O�i�Fbg��ݒ肷��B
//    public void setBackground(Color bg)
//      �@�\�F���i�̔w�i�Fbg��ݒ肷��B
//    public void setOpaque(boolean isOpaque)
//�@�@�@�@�\�Ftrue �̏ꍇ�A���i�͂��̋��E���̂��ׂẴs�N�Z�����y�C���g����B
//�@�@�@�@�@�@false �̏ꍇ�A���i�̓s�N�Z���̈ꕔ�܂��͑S�����y�C���g���Ȃ��̂ŁA
//�@�@�@�@�@�@���̉��̃s�N�Z���������ĕ\�������B 
//            �f�t�H���g�l�́Afalse�B
//
//�@��Color�N���X
//�@�@�F�̃f�[�^�⑀�삪��`����Ă���N���X�B
//    java.awt.Color
//
//�@�@�EColor�N���X�ɗp�ӂ���Ă���F
//�@�@�@magenta�F�Â����F�@�@ �@black�F���@�@white�F��     yellow�F��
//�@�@�@darkGray�F�Â��D�F�@�@�@gray�F�D�F   cyan�F��F�@  blue�F�@
//�@�@�@lightGray�F���邢�D�F �@red�F�ԁ@�@  orange�F��@�@green�F�΁@
//�@�@�@pink�F���邢���F        
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="ja121b.class" width="640" height="480">
</applet>
*/

public class ja121b extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(10,10));

    // ���x���P�̍쐬�B
    JLabel lab1 = new JLabel();
    lab1.setText("���x���P");
    lab1.setForeground(Color.black);
    lab1.setBackground(Color.yellow);
    lab1.setOpaque(true);

    // ���x���Q�̍쐬�B
    JLabel lab2 = new JLabel("���x���Q");
    lab2.setForeground(Color.red);
    lab2.setBackground(Color.pink);
    lab2.setOpaque(true);

    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab1,BorderLayout.NORTH);
    c.add(lab2,BorderLayout.CENTER);
  }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ja21b");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja121b();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
