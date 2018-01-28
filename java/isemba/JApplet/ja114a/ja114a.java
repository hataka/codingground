// 
/*================================================================
 * �v���O������: ja114a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja114a.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja114a.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�iBoxLayout�j
//
//�@�@���i�͍�����E��(�܂��͏ォ�牺��)�z�u�����B
//�@�@�A�v���b�g�̑傫�����ς���Ă��z�u�͕ς��Ȃ��B
//
//�@��BoxLayout�N���X�̃R���X�g���N�^
//    public BoxLayout(Container target, int axis)
//      �@�\�F���i�����axis�ɔz�u���郌�C�A�E�g�}�l�[�W�����쐬����B
//            BoxLayout.X_AXIS�F ������E�ցB
//            BoxLayout.Y_AXIS�F �ォ�牺�ցB
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

//<applet code="ja114a.class" width="640" height="480"></applet>

public class ja114a extends JApplet {

   /**
	  * 
	  */
	private static final long serialVersionUID = 1L;
	private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja114a() {
        this(true);
    }

    public ja114a(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // �A�v���b�g�̃R���e���c�y�C�����擾�B
    Container c = getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BoxLayout�ɐݒ�B
    c.setLayout(new BoxLayout(c,BoxLayout.X_AXIS));

    // �{�^���̍쐬�B
    JButton b1 = new JButton("�{�^���P");
    JButton b2 = new JButton("�{�^���Q");
    JButton b3 = new JButton("�{�^���R");

    // �{�^�����R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(b2);
    c.add(b3);

        //Add Components to a JPanel, using the default FlowLayout. 
        JPanel pane = new JPanel();
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.setBackground(new Color(255,255,204));
        pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

        setContentPane(pane);


  }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ja114a");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
        });

        JApplet applet = new ja114a(false);
        applet.init();
        frame.add(applet);
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
//        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
